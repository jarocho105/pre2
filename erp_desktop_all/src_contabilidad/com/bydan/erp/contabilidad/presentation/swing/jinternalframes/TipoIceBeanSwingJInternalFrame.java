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

import com.bydan.erp.contabilidad.util.TipoIceConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoIceParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoIceParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoIceBean;
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
public class TipoIceBeanSwingJInternalFrame extends TipoIceJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoIceBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoIce> tipoiceValidator = new ClassValidator<TipoIce>(TipoIce.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoIce tipoice;	
	public TipoIce tipoiceAux;
	public TipoIce tipoiceAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoIce tipoiceTotales;
	public Long idTipoIceActual;
	public Long iIdNuevoTipoIce=0L;
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
	
	public Boolean isPermisoTodoTipoIce;
	public Boolean isPermisoNuevoTipoIce;
	public Boolean isPermisoActualizarTipoIce;
	public Boolean isPermisoActualizarOriginalTipoIce;
	public Boolean isPermisoEliminarTipoIce;
	public Boolean isPermisoGuardarCambiosTipoIce;
	public Boolean isPermisoConsultaTipoIce;
	public Boolean isPermisoBusquedaTipoIce;
	public Boolean isPermisoReporteTipoIce;
	public Boolean isPermisoPaginacionMedioTipoIce;
	public Boolean isPermisoPaginacionAltoTipoIce;
	public Boolean isPermisoPaginacionTodoTipoIce;
	public Boolean isPermisoCopiarTipoIce;
	public Boolean isPermisoVerFormTipoIce;
	public Boolean isPermisoDuplicarTipoIce;
	public Boolean isPermisoOrdenTipoIce;
	
	
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
	
	public TipoIceParameterReturnGeneral tipoiceReturnGeneral;
	public TipoIceParameterReturnGeneral tipoiceParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoIce=false;
	public Boolean esParaAccionDesdeFormularioTipoIce=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoIceLogic tipoiceLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoIce tipoiceBean;
	public TipoIceConstantesFunciones tipoiceConstantesFunciones;
	//public TipoIceParameterReturnGeneral tipoiceReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoIce> tipoices;	
	//public List<TipoIce> tipoicesEliminados;
	//public List<TipoIce> tipoicesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoIce=false;
	public Boolean isVisibilidadCeldaDuplicarTipoIce=true;
	public Boolean isVisibilidadCeldaCopiarTipoIce=true;
	public Boolean isVisibilidadCeldaVerFormTipoIce=true;
	public Boolean isVisibilidadCeldaOrdenTipoIce=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoIce=false;
	public Boolean isVisibilidadCeldaModificarTipoIce=false;
	public Boolean isVisibilidadCeldaActualizarTipoIce=false;
	public Boolean isVisibilidadCeldaEliminarTipoIce=false;
	public Boolean isVisibilidadCeldaCancelarTipoIce=false;
	public Boolean isVisibilidadCeldaGuardarTipoIce=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoIce=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoIce() {
		return this.iIdNuevoTipoIce;
	}

	public void setiIdNuevoTipoIce(Long iIdNuevoTipoIce) {
		this.iIdNuevoTipoIce = iIdNuevoTipoIce;
	}
	
	public Long getidTipoIceActual() {
		return this.idTipoIceActual;
	}

	public void setidTipoIceActual(Long idTipoIceActual) {
		this.idTipoIceActual = idTipoIceActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoIce gettipoice() {
		return this.tipoice;
	}

	public void settipoice(TipoIce tipoice) {
		this.tipoice = tipoice;
	}
	
	public TipoIce gettipoiceAux() {
		return this.tipoiceAux;
	}

	public void settipoiceAux(TipoIce tipoiceAux) {
		this.tipoiceAux = tipoiceAux;
	}				
	
	public TipoIce gettipoiceAnterior() {
		return this.tipoiceAnterior;
	}

	public void settipoiceAnterior(TipoIce tipoiceAnterior) {
		this.tipoiceAnterior = tipoiceAnterior;
	}	
	
	public TipoIce gettipoiceTotales() {
		return this.tipoiceTotales;
	}

	public void settipoiceTotales(TipoIce tipoiceTotales) {
		this.tipoiceTotales = tipoiceTotales;
	}	
	
	public TipoIce gettipoiceBean() {
		return this.tipoiceBean;
	}

	public void settipoiceBean(TipoIce tipoiceBean) {
		this.tipoiceBean = tipoiceBean;
	}	
	
	public TipoIceParameterReturnGeneral gettipoiceReturnGeneral() {
		return this.tipoiceReturnGeneral;
	}

	public void settipoiceReturnGeneral(TipoIceParameterReturnGeneral tipoiceReturnGeneral) {
		this.tipoiceReturnGeneral = tipoiceReturnGeneral;
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
	
	
	public TipoIceLogic getTipoIceLogic()	{		
		return tipoiceLogic;
	}

	public void setTipoIceLogic(TipoIceLogic tipoiceLogic) {
		this.tipoiceLogic = tipoiceLogic;
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
	
	public Boolean getIsEsNuevoTipoIce() {
		return isEsNuevoTipoIce;
	}

	public void setIsEsNuevoTipoIce(Boolean isEsNuevoTipoIce) {
		this.isEsNuevoTipoIce = isEsNuevoTipoIce;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoIce() {
		return esParaAccionDesdeFormularioTipoIce;
	}
	
	public void setEsParaAccionDesdeFormularioTipoIce(Boolean esParaAccionDesdeFormularioTipoIce) {
		this.esParaAccionDesdeFormularioTipoIce = esParaAccionDesdeFormularioTipoIce;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoIce() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoIceConstantesFunciones.refrescarForeignKeysDescripcionesTipoIce(this.tipoiceLogic.getTipoIces());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoIceConstantesFunciones.refrescarForeignKeysDescripcionesTipoIce(this.tipoices);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoiceLogic.setTipoIces(this.tipoices);
			tipoiceLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoIceParameterReturnGeneral getTipoIceParameterGeneral() {
		return this.tipoiceParameterGeneral;
	}
	
	public void setTipoIceParameterGeneral(TipoIceParameterReturnGeneral tipoiceParameterGeneral) {
		this.tipoiceParameterGeneral = tipoiceParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoIce() {
		return isPermisoTodoTipoIce;
	}

	public void setIsPermisoTodoTipoIce(Boolean isPermisoTodoTipoIce) {
		this.isPermisoTodoTipoIce = isPermisoTodoTipoIce;
	}

	public Boolean getIsPermisoNuevoTipoIce() {
		return isPermisoNuevoTipoIce;
	}

	public void setIsPermisoNuevoTipoIce(Boolean isPermisoNuevoTipoIce) {
		this.isPermisoNuevoTipoIce = isPermisoNuevoTipoIce;
	}

	public Boolean getIsPermisoActualizarTipoIce() {
		return isPermisoActualizarTipoIce;
	}

	public void setIsPermisoActualizarTipoIce(Boolean isPermisoActualizarTipoIce) {
		this.isPermisoActualizarTipoIce = isPermisoActualizarTipoIce;
	}

	public Boolean getIsPermisoEliminarTipoIce() {
		return isPermisoEliminarTipoIce;
	}

	public void setIsPermisoEliminarTipoIce(Boolean isPermisoEliminarTipoIce) {
		this.isPermisoEliminarTipoIce = isPermisoEliminarTipoIce;
	}

	public Boolean getIsPermisoGuardarCambiosTipoIce() {
		return isPermisoGuardarCambiosTipoIce;
	}

	public void setIsPermisoGuardarCambiosTipoIce(Boolean isPermisoGuardarCambiosTipoIce) {
		this.isPermisoGuardarCambiosTipoIce = isPermisoGuardarCambiosTipoIce;
	}
	
	public Boolean getIsPermisoConsultaTipoIce() {
		return isPermisoConsultaTipoIce;
	}

	public void setIsPermisoConsultaTipoIce(Boolean isPermisoConsultaTipoIce) {
		this.isPermisoConsultaTipoIce = isPermisoConsultaTipoIce;
	}

	public Boolean getIsPermisoBusquedaTipoIce() {
		return isPermisoBusquedaTipoIce;
	}

	public void setIsPermisoBusquedaTipoIce(Boolean isPermisoBusquedaTipoIce) {
		this.isPermisoBusquedaTipoIce = isPermisoBusquedaTipoIce;
	}

	public Boolean getIsPermisoReporteTipoIce() {
		return isPermisoReporteTipoIce;
	}

	public void setIsPermisoReporteTipoIce(Boolean isPermisoReporteTipoIce) {
		this.isPermisoReporteTipoIce = isPermisoReporteTipoIce;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoIce() {
		return isPermisoPaginacionMedioTipoIce;
	}

	public void setIsPermisoPaginacionMedioTipoIce(Boolean isPermisoPaginacionMedioTipoIce) {
		this.isPermisoPaginacionMedioTipoIce = isPermisoPaginacionMedioTipoIce;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoIce() {
		return isPermisoPaginacionTodoTipoIce;
	}

	public void setIsPermisoPaginacionTodoTipoIce(Boolean isPermisoPaginacionTodoTipoIce) {
		this.isPermisoPaginacionTodoTipoIce = isPermisoPaginacionTodoTipoIce;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoIce() {
		return isPermisoPaginacionAltoTipoIce;
	}

	public void setIsPermisoPaginacionAltoTipoIce(Boolean isPermisoPaginacionAltoTipoIce) {
		this.isPermisoPaginacionAltoTipoIce = isPermisoPaginacionAltoTipoIce;
	}
	
	public Boolean getIsPermisoCopiarTipoIce() {
		return isPermisoCopiarTipoIce;
	}

	public void setIsPermisoCopiarTipoIce(Boolean isPermisoCopiarTipoIce) {
		this.isPermisoCopiarTipoIce = isPermisoCopiarTipoIce;
	}
	
	public Boolean getIsPermisoVerFormTipoIce() {
		return isPermisoVerFormTipoIce;
	}

	public void setIsPermisoVerFormTipoIce(Boolean isPermisoVerFormTipoIce) {
		this.isPermisoVerFormTipoIce = isPermisoVerFormTipoIce;
	}
	
	public Boolean getIsPermisoDuplicarTipoIce() {
		return isPermisoDuplicarTipoIce;
	}

	public void setIsPermisoDuplicarTipoIce(Boolean isPermisoDuplicarTipoIce) {
		this.isPermisoDuplicarTipoIce = isPermisoDuplicarTipoIce;
	}
	
	public Boolean getIsPermisoOrdenTipoIce() {
		return isPermisoOrdenTipoIce;
	}

	public void setIsPermisoOrdenTipoIce(Boolean isPermisoOrdenTipoIce) {
		this.isPermisoOrdenTipoIce = isPermisoOrdenTipoIce;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoIce() {
		return isVisibilidadCeldaNuevoTipoIce;
	}

	public void setIsVisibilidadCeldaNuevoTipoIce(Boolean isVisibilidadCeldaNuevoTipoIce) {
		this.isVisibilidadCeldaNuevoTipoIce = isVisibilidadCeldaNuevoTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoIce() {
		return isVisibilidadCeldaDuplicarTipoIce;
	}

	public void setIsVisibilidadCeldaDuplicarTipoIce(Boolean isVisibilidadCeldaDuplicarTipoIce) {
		this.isVisibilidadCeldaDuplicarTipoIce = isVisibilidadCeldaDuplicarTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoIce() {
		return isVisibilidadCeldaCopiarTipoIce;
	}

	public void setIsVisibilidadCeldaCopiarTipoIce(Boolean isVisibilidadCeldaCopiarTipoIce) {
		this.isVisibilidadCeldaCopiarTipoIce = isVisibilidadCeldaCopiarTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoIce() {
		return isVisibilidadCeldaVerFormTipoIce;
	}

	public void setIsVisibilidadCeldaVerFormTipoIce(Boolean isVisibilidadCeldaVerFormTipoIce) {
		this.isVisibilidadCeldaVerFormTipoIce = isVisibilidadCeldaVerFormTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoIce() {
		return isVisibilidadCeldaOrdenTipoIce;
	}

	public void setIsVisibilidadCeldaOrdenTipoIce(Boolean isVisibilidadCeldaOrdenTipoIce) {
		this.isVisibilidadCeldaOrdenTipoIce = isVisibilidadCeldaOrdenTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoIce() {
		return isVisibilidadCeldaNuevoRelacionesTipoIce;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoIce(Boolean isVisibilidadCeldaNuevoRelacionesTipoIce) {
		this.isVisibilidadCeldaNuevoRelacionesTipoIce = isVisibilidadCeldaNuevoRelacionesTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoIce() {
		return isVisibilidadCeldaModificarTipoIce;
	}

	public void setIsVisibilidadCeldaModificarTipoIce(Boolean isVisibilidadCeldaModificarTipoIce) {
		this.isVisibilidadCeldaModificarTipoIce = isVisibilidadCeldaModificarTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoIce() {
		return isVisibilidadCeldaActualizarTipoIce;
	}

	public void setIsVisibilidadCeldaActualizarTipoIce(Boolean isVisibilidadCeldaActualizarTipoIce) {
		this.isVisibilidadCeldaActualizarTipoIce = isVisibilidadCeldaActualizarTipoIce;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoIce() {
		return isVisibilidadCeldaEliminarTipoIce;
	}

	public void setIsVisibilidadCeldaEliminarTipoIce(Boolean isVisibilidadCeldaEliminarTipoIce) {
		this.isVisibilidadCeldaEliminarTipoIce = isVisibilidadCeldaEliminarTipoIce;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoIce() {
		return isVisibilidadCeldaCancelarTipoIce;
	}

	public void setIsVisibilidadCeldaCancelarTipoIce(Boolean isVisibilidadCeldaCancelarTipoIce) {
		this.isVisibilidadCeldaCancelarTipoIce = isVisibilidadCeldaCancelarTipoIce;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoIce() {
		return isVisibilidadCeldaGuardarTipoIce;
	}

	public void setIsVisibilidadCeldaGuardarTipoIce(Boolean isVisibilidadCeldaGuardarTipoIce) {
		this.isVisibilidadCeldaGuardarTipoIce = isVisibilidadCeldaGuardarTipoIce;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoIce() {
		return isVisibilidadCeldaGuardarCambiosTipoIce;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoIce(Boolean isVisibilidadCeldaGuardarCambiosTipoIce) {
		this.isVisibilidadCeldaGuardarCambiosTipoIce = isVisibilidadCeldaGuardarCambiosTipoIce;
	}
		
	public TipoIceSessionBean gettipoiceSessionBean() {
		return this.tipoiceSessionBean;
	}
	
	public void settipoiceSessionBean(TipoIceSessionBean tipoiceSessionBean) {
		this.tipoiceSessionBean=tipoiceSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoIce(TipoIce tipoice)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoIce tipoice,TipoIce tipoiceAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoIce(tipoice);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoiceAux.setId(tipoice.getId());
		tipoiceAux.setVersionRow(tipoice.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoIce();
		
			int intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoiceValidator.getInvalidValues(this.tipoice);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoiceLogic.setDatosCliente(datosCliente);
			tipoiceLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoiceAux=new  TipoIce();
				
				tipoiceAux.setIsNew(true);
				tipoiceAux.setIsChanged(true);
				
				tipoiceAux.setTipoIceOriginal(this.tipoice);
				
				tipoiceAux.setId(this.tipoice.getId());	
				tipoiceAux.setVersionRow(this.tipoice.getVersionRow());	
				tipoiceAux.setnombre(this.tipoice.getnombre());	
				tipoiceAux.setporcentaje(this.tipoice.getporcentaje());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoiceSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoiceAux,tipoiceLogic.getTipoIces());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoiceAux,tipoices);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoiceSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoiceSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoiceLogic.saveTipoIces();//WithConnection
						//tipoiceLogic.getSetVersionRowTipoIces();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoice,tipoiceAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoiceAux=new  TipoIce();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoiceSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoiceSessionBean.getEsGuardarRelacionado() && this.tipoice.getId()>=0)) {
						
					tipoiceAux.setIsNew(false);
				}
				
				tipoiceAux.setIsDeleted(false);
			
				tipoiceAux.setId(this.tipoice.getId());	
				tipoiceAux.setVersionRow(this.tipoice.getVersionRow());	
				tipoiceAux.setnombre(this.tipoice.getnombre());	
				tipoiceAux.setporcentaje(this.tipoice.getporcentaje());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoiceAux,tipoiceLogic.getTipoIces());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoiceAux,tipoices);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoiceSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoiceSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoiceLogic.saveTipoIces();//WithConnection
						//tipoiceLogic.getSetVersionRowTipoIces();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoice,tipoiceAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoiceAux=new  TipoIce();
				
				tipoiceAux.setIsNew(false);
				tipoiceAux.setIsChanged(false);
				
				tipoiceAux.setIsDeleted(true);
				
				tipoiceAux.setId(this.tipoice.getId());	
				tipoiceAux.setVersionRow(this.tipoice.getVersionRow());	
				tipoiceAux.setnombre(this.tipoice.getnombre());	
				tipoiceAux.setporcentaje(this.tipoice.getporcentaje());	
				
				if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoiceAux.getId()>=0) {	
						this.tipoicesEliminados.add(tipoiceAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoiceAux,tipoiceLogic.getTipoIces());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoiceAux,tipoices);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoiceSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoiceSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoiceLogic.saveTipoIces();//WithConnection
						//tipoiceLogic.getSetVersionRowTipoIces();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoiceSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoiceAux,tipoiceLogic.getTipoIces());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoiceAux,tipoices);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.getTipoIces().addAll(this.tipoicesEliminados);
					
					tipoiceLogic.saveTipoIces();//WithConnection
					//tipoiceLogic.getSetVersionRowTipoIces();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoicesEliminados= new ArrayList<TipoIce>();		
			}
			
			if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Ice GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoice=tipoiceAux;
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
      		//this.finishProcessTipoIce();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoIce tipoiceLocal) throws Exception {
		
		if(this.tipoiceSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoIce tipoiceLocal) throws Exception {	
		if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoIceActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoiceValidator.getInvalidValues(this.tipoice);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoIce tipoice,List<TipoIce> tipoices) throws Exception {
		try	{		
			TipoIceConstantesFunciones.actualizarLista(tipoice,tipoices,this.tipoiceSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoIce tipoice,List<TipoIce> tipoices) throws Exception {
		try	{			
			TipoIceConstantesFunciones.actualizarSelectedLista(tipoice,tipoices);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoIce> tipoicesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoicesLocal=this.tipoiceLogic.getTipoIces();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoicesLocal=this.tipoices;
			}
			//ARCHITECTURE
		
			for(TipoIce tipoiceLocal:tipoicesLocal) {
				if(this.permiteMantenimiento(tipoiceLocal) && tipoiceLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoIceConstantesFunciones.getTipoIceLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoIceConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIce.jLabelnombreTipoIce,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoIceConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIce.jLabelporcentajeTipoIce,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIce.jLabelnombreTipoIce,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIce.jLabelporcentajeTipoIce,"");
		
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
		this.iIdNuevoTipoIce--;	
		
		
		this.tipoiceAux=new TipoIce();
		
		this.tipoiceAux.setId(this.iIdNuevoTipoIce);
		this.tipoiceAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoiceLogic.getTipoIces().add(this.tipoiceAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoices.add(this.tipoiceAux);
		}
		//ARCHITECTURE
		
		this.tipoice=this.tipoiceAux;
		
		if(TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoIce(this.tipoice);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIce(this.tipoice);
		}
				
		//this.setDefaultControlesTipoIce();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoIce();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoIce();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIce();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIce(this.tipoiceBean,this.tipoice,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoIceConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
			classes=TipoIceConstantesFunciones.getClassesRelationshipsOfTipoIce(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoiceReturnGeneral=tipoiceLogic.procesarEventosTipoIcesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoiceLogic.getTipoIces(),this.tipoice,this.tipoiceParameterGeneral,this.isEsNuevoTipoIce,classes);//this.tipoiceLogic.getTipoIce()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoIce(this.tipoiceReturnGeneral,this.tipoiceBean,false);
		
		if(this.tipoiceReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIce(this.tipoiceReturnGeneral.getTipoIce());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoIce(this.tipoiceReturnGeneral.getTipoIce());
		}
		
		if(this.tipoiceReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoIce(this.tipoiceReturnGeneral.getTipoIce(),classes);//this.tipoiceBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoIce();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoIce();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoIce(false);
						
			if(tipoiceSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIce();
			}
			
			this.actualizarVisualTableDatosTipoIce();
			
			this.jTableDatosTipoIce.setRowSelectionInterval(this.getIndiceNuevoTipoIce(), this.getIndiceNuevoTipoIce());
			
			this.seleccionarFilaTablaTipoIceActual();
						
			this.actualizarEstadoCeldasBotonesTipoIce("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoIce(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.setEnabled(isHabilitar && this.tipoiceConstantesFunciones.activarnombreTipoIce);
		this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.setEnabled(isHabilitar && this.tipoiceConstantesFunciones.activarporcentajeTipoIce);	
		
	};
	
	public void setDefaultControlesTipoIce() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoIce(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoiceSessionBean.setConGuardarRelaciones(true);			
			this.tipoiceSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.setVisible(true);
			
					
		} else {
			//this.tipoiceSessionBean.setConGuardarRelaciones(false);			
			this.tipoiceSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoIce() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
				if(tipoiceAux.getId().equals(this.iIdNuevoTipoIce)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIce tipoiceAux:this.tipoices) {
				if(tipoiceAux.getId().equals(this.iIdNuevoTipoIce)) {
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
	
	public int getIndiceActualTipoIce(TipoIce tipoice,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
				if(tipoiceAux.getId().equals(tipoice.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIce tipoiceAux:this.tipoices) {
				if(tipoiceAux.getId().equals(tipoice.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoIce(TipoIce tipoiceOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
				if(tipoiceAux.getTipoIceOriginal().getId().equals(tipoiceOriginal.getId())) {
					existe=true;
					tipoiceOriginal.setId(tipoiceAux.getId());
					tipoiceOriginal.setVersionRow(tipoiceAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIce tipoiceAux:this.tipoices) {
				if(tipoiceAux.getTipoIceOriginal().getId().equals(tipoiceOriginal.getId())) {
					existe=true;
					tipoiceOriginal.setId(tipoiceAux.getId());
					tipoiceOriginal.setVersionRow(tipoiceAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoIce(Boolean esParaCancelar) throws Exception {
		tipoicesAux=new ArrayList<TipoIce>();
		tipoiceAux=new TipoIce();
		
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
					if(tipoiceAux.getId()<0) {
						tipoicesAux.add(tipoiceAux);
					}		
				}
				this.iIdNuevoTipoIce=0L;
				this.tipoiceLogic.getTipoIces().removeAll(tipoicesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIce tipoiceAux:this.tipoices) {
					if(tipoiceAux.getId()<0) {
						tipoicesAux.add(tipoiceAux);
					}		
				}
				this.iIdNuevoTipoIce=0L;
				this.tipoices.removeAll(tipoicesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoIce 
					&& this.tipoiceLogic.getTipoIces().size()>0
					) {
					tipoiceAux=this.tipoiceLogic.getTipoIces().get(this.tipoiceLogic.getTipoIces().size() - 1);
				
					if(tipoiceAux.getId()<0) {
						this.tipoiceLogic.getTipoIces().remove(tipoiceAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoIce && this.tipoices.size()>0) {
					tipoiceAux=this.tipoices.get(this.tipoices.size() - 1);
				
					if(tipoiceAux.getId()<0) {
						this.tipoices.remove(tipoiceAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoIce(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoice.getId()<0) {
				this.tipoiceLogic.getTipoIces().remove(this.tipoice);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoice.getId()<0) {
				this.tipoices.remove(this.tipoice);
			}
		}			
	}
	
	public void setEstadosInicialesTipoIce(List<TipoIce> tipoicesAux) throws Exception {
		TipoIceConstantesFunciones.setEstadosInicialesTipoIce(tipoicesAux);
	}
	
	public void setEstadosInicialesTipoIce(TipoIce tipoiceAux) throws Exception {
		TipoIceConstantesFunciones.setEstadosInicialesTipoIce(tipoiceAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoIceActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoIce("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoIceActual()) {
				if(!this.isEsNuevoTipoIce) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoIce("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoIce=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoIceActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Ice ?", "MANTENIMIENTO DE Tipo Ice", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoIce("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoIce tipoice) throws Exception {
		TipoIceConstantesFunciones.seleccionarAsignar(this.tipoice,tipoice);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoIce=this.isPermisoActualizarOriginalTipoIce;
			
			
			this.seleccionarAsignar(tipoice);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoIceConstantesFunciones.quitarEspaciosTipoIce(this.tipoice,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoIce("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoiceSessionBean.setsFuncionBusquedaRapida(this.tipoiceSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoIce) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoIce(esParaCancelar);				
				this.cancelarNuevoTipoIce(esParaCancelar);								
			}
			
			this.tipoice=new TipoIce();
			
			this.inicializarTipoIce();
			
			this.actualizarEstadoCeldasBotonesTipoIce("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoIce() throws Exception {
		try {
			TipoIceConstantesFunciones.inicializarTipoIce(this.tipoice);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoiceLogic.getTipoIces().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoIces(String sAccionBusqueda,List<TipoIce> tipoicesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoIce"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoIceMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoIceMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoIce"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Ices");		
		parameters.put("busquedapor", TipoIceConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoIce=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoIceConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoIceConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoIce=new JRBeanArrayDataSource(TipoIceJInternalFrame.TraerTipoIceBeans(tipoicesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoIce);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoIceConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoIceConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoIceBean.TraerTipoIceBeans(tipoicesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoIces(sAccionBusqueda,sTipoArchivoReporte,tipoicesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoIces(sAccionBusqueda,sTipoArchivoReporte,tipoicesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoIceActionPerformed(null);
					//this.generarExcelReporteTipoIces(sAccionBusqueda,sTipoArchivoReporte,tipoicesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoIces(sAccionBusqueda,sTipoArchivoReporte,tipoicesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoIces(sAccionBusqueda,sTipoArchivoReporte,tipoicesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoIces(sAccionBusqueda,sTipoArchivoReporte,tipoicesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoIces(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIce> tipoicesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoice";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIces");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIce("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoIce tipoice : tipoicesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoIceConstantesFunciones.generarExcelReporteDataTipoIce("NORMAL",row,workbook,tipoice,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoIce(String sTipo,Row row,Workbook workbook) {
		
		TipoIceConstantesFunciones.generarExcelReporteHeaderTipoIce(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoIces(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIce> tipoicesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoice_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIces");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoIce tipoice : tipoicesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoIceConstantesFunciones.getTipoIceDescripcion(tipoice));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIceConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIceConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoice.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIceConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIceConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoice.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoIces(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIce> tipoicesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoIce> tipoicesRespaldo=null;
		
		classes=TipoIceConstantesFunciones.getClassesRelationshipsOfTipoIce(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoiceLogic.setDatosCliente(this.datosCliente);
		this.tipoiceLogic.setDatosDeep(this.datosDeep);
		this.tipoiceLogic.setIsConDeep(true);
		
		tipoicesRespaldo=this.tipoiceLogic.getTipoIces();
		
		this.tipoiceLogic.setTipoIces(tipoicesParaReportes);	
		this.tipoiceLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoicesParaReportes=this.tipoiceLogic.getTipoIces();
		this.tipoiceLogic.setTipoIces(tipoicesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoice_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIces");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIce("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoIce tipoice : tipoicesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoIce("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoIceConstantesFunciones.generarExcelReporteDataTipoIce("NORMAL",row,workbook,tipoice,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoIceConstantesFunciones.getTipoIceDescripcion(tipoice));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIce.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoIce() throws Exception {		
		this.startProcessTipoIce(true);
	}
	
	public void startProcessTipoIce(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoIce ,this.jPanelParametrosReportesTipoIce, this.jScrollPanelDatosTipoIce,this.jPanelPaginacionTipoIce, this.jScrollPanelDatosEdicionTipoIce, this.jPanelAccionesTipoIce,this.jPanelAccionesFormularioTipoIce,this.jmenuBarTipoIce,this.jmenuBarDetalleTipoIce,this.jTtoolBarTipoIce,this.jTtoolBarDetalleTipoIce);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIce=this.jTabbedPaneBusquedasTipoIce; 
		
		final JPanel jPanelParametrosReportesTipoIce=this.jPanelParametrosReportesTipoIce;
		//final JScrollPane jScrollPanelDatosTipoIce=this.jScrollPanelDatosTipoIce;
		final JTable jTableDatosTipoIce=this.jTableDatosTipoIce;		
		final JPanel jPanelPaginacionTipoIce=this.jPanelPaginacionTipoIce;
		//final JScrollPane jScrollPanelDatosEdicionTipoIce=this.jScrollPanelDatosEdicionTipoIce;
		final JPanel jPanelAccionesTipoIce=this.jPanelAccionesTipoIce;
		
		JPanel jPanelCamposAuxiliarTipoIce=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoIce=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
			jPanelCamposAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jPanelCamposTipoIce;
			jPanelAccionesFormularioAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jPanelAccionesFormularioTipoIce;
		}
		
		final JPanel jPanelCamposTipoIce=jPanelCamposAuxiliarTipoIce;
		final JPanel jPanelAccionesFormularioTipoIce=jPanelAccionesFormularioAuxiliarTipoIce;
		
		
		final JMenuBar jmenuBarTipoIce=this.jmenuBarTipoIce;
		final JToolBar jTtoolBarTipoIce=this.jTtoolBarTipoIce;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoIce=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIce=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
			jmenuBarDetalleAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jmenuBarDetalleTipoIce;
			jTtoolBarDetalleAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jTtoolBarDetalleTipoIce;
		}
		
		final JMenuBar jmenuBarDetalleTipoIce=jmenuBarDetalleAuxiliarTipoIce;
		final JToolBar jTtoolBarDetalleTipoIce=jTtoolBarDetalleAuxiliarTipoIce;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIce;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIce;
			processRunnable.jTableDatos=jTableDatosTipoIce;
			processRunnable.jPanelCampos=jPanelCamposTipoIce;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIce;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIce;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIce;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIce;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIce;
			processRunnable.jTtoolBar=jTtoolBarTipoIce;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIce;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoIce ,jPanelParametrosReportesTipoIce,jTableDatosTipoIce, /*jScrollPanelDatosTipoIce,*/jPanelCamposTipoIce,jPanelPaginacionTipoIce, /*jScrollPanelDatosEdicionTipoIce,*/ jPanelAccionesTipoIce,jPanelAccionesFormularioTipoIce,jmenuBarTipoIce,jmenuBarDetalleTipoIce,jTtoolBarTipoIce,jTtoolBarDetalleTipoIce);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoIce ,jPanelParametrosReportesTipoIce, jScrollPanelDatosTipoIce,jPanelPaginacionTipoIce, jScrollPanelDatosEdicionTipoIce, jPanelAccionesTipoIce,jPanelAccionesFormularioTipoIce,jmenuBarTipoIce,jmenuBarDetalleTipoIce,jTtoolBarTipoIce,jTtoolBarDetalleTipoIce);
						
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
	
	public void finishProcessTipoIce() {// throws Exception 
		this.finishProcessTipoIce(true);
	}
	
	public void finishProcessTipoIce(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoIce ,this.jPanelParametrosReportesTipoIce, this.jScrollPanelDatosTipoIce,this.jPanelPaginacionTipoIce, this.jScrollPanelDatosEdicionTipoIce, this.jPanelAccionesTipoIce,this.jPanelAccionesFormularioTipoIce,this.jmenuBarTipoIce,this.jmenuBarDetalleTipoIce,this.jTtoolBarTipoIce,this.jTtoolBarDetalleTipoIce);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIce=this.jTabbedPaneBusquedasTipoIce; 
		
		final JPanel jPanelParametrosReportesTipoIce=this.jPanelParametrosReportesTipoIce;
		//final JScrollPane jScrollPanelDatosTipoIce=this.jScrollPanelDatosTipoIce;
		final JTable jTableDatosTipoIce=this.jTableDatosTipoIce;		
		final JPanel jPanelPaginacionTipoIce=this.jPanelPaginacionTipoIce;
		//final JScrollPane jScrollPanelDatosEdicionTipoIce=this.jScrollPanelDatosEdicionTipoIce;
		final JPanel jPanelAccionesTipoIce=this.jPanelAccionesTipoIce;
		
		JPanel jPanelCamposAuxiliarTipoIce=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoIce=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
			jPanelCamposAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jPanelCamposTipoIce;
			jPanelAccionesFormularioAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jPanelAccionesFormularioTipoIce;
		}
		
		final JPanel jPanelCamposTipoIce=jPanelCamposAuxiliarTipoIce;
		final JPanel jPanelAccionesFormularioTipoIce=jPanelAccionesFormularioAuxiliarTipoIce;
		
		
		final JMenuBar jmenuBarTipoIce=this.jmenuBarTipoIce;		
		final JToolBar jTtoolBarTipoIce=this.jTtoolBarTipoIce;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoIce=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIce=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
			jmenuBarDetalleAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jmenuBarDetalleTipoIce;
			jTtoolBarDetalleAuxiliarTipoIce=this.jInternalFrameDetalleFormTipoIce.jTtoolBarDetalleTipoIce;		
		}
		
		final JMenuBar jmenuBarDetalleTipoIce=jmenuBarDetalleAuxiliarTipoIce;
		final JToolBar jTtoolBarDetalleTipoIce=jTtoolBarDetalleAuxiliarTipoIce;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIce;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIce;
			processRunnable.jTableDatos=jTableDatosTipoIce;
			processRunnable.jPanelCampos=jPanelCamposTipoIce;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIce;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIce;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIce;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIce;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIce;
			processRunnable.jTtoolBar=jTtoolBarTipoIce;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIce;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoIce ,jPanelParametrosReportesTipoIce, jTableDatosTipoIce,/*jScrollPanelDatosTipoIce,*/jPanelCamposTipoIce,jPanelPaginacionTipoIce, /*jScrollPanelDatosEdicionTipoIce,*/ jPanelAccionesTipoIce,jPanelAccionesFormularioTipoIce,jmenuBarTipoIce,jmenuBarDetalleTipoIce,jTtoolBarTipoIce,jTtoolBarDetalleTipoIce));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoIce(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoIce(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoIce(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoIce(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoIce,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoIce,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoIce(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoIce,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoIce,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoiceConstantesFunciones.getsFinalQueryTipoIce();
		String  finalQueryPaginacionTodos=this.tipoiceConstantesFunciones.getsFinalQueryTipoIce();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoIceConstantesFunciones.getArrayColumnasGlobalesNoTipoIce(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoIceConstantesFunciones.getArrayColumnasGlobalesTipoIce(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoIceConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoicesEliminados= new ArrayList<TipoIce>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoIce();
		
				///*TipoIceSessionBean*/this.tipoiceSessionBean=new TipoIceSessionBean();
			
			if(this.tipoiceSessionBean==null) {
				this.tipoiceSessionBean=new TipoIceSessionBean();
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
					this.iNumeroPaginacion=TipoIceConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoIceConstantesFunciones.getClassesForeignKeysOfTipoIce(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoice."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoicesAux= new ArrayList<TipoIce>();
			
				
			tipoiceLogic.setDatosCliente(this.datosCliente);
			tipoiceLogic.setDatosDeep(this.datosDeep);
			tipoiceLogic.setIsConDeep(true);
			
			
			tipoiceLogic.getTipoIceDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoiceLogic.getTodosTipoIces(finalQueryGlobal,pagination);
					
					//tipoiceLogic.getTodosTipoIcesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoiceLogic.getTipoIces()==null|| tipoiceLogic.getTipoIces().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoicesAux= new ArrayList<TipoIce>();
							tipoicesAux.addAll(tipoiceLogic.getTipoIces());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoicesAux= new ArrayList<TipoIce>();
							tipoicesAux.addAll(tipoices);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoiceLogic.getTodosTipoIces(finalQueryGlobal+"",this.pagination);												
							
							//tipoiceLogic.getTodosTipoIcesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoIces("Todos",tipoiceLogic.getTipoIces() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoiceLogic.setTipoIces(new ArrayList<TipoIce>());					
							tipoiceLogic.getTipoIces().addAll(tipoicesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoices=new ArrayList<TipoIce>();
							tipoices.addAll(tipoicesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoIce=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoIce=this.idActual;
				
				} else if(this.idTipoIceActual!=null && this.idTipoIceActual!=0L) {
					idTipoIce=idTipoIceActual;
				}
				
					
				this.sDetalleReporte=TipoIceConstantesFunciones.getDetalleIndicePorId(idTipoIce);
				
				this.tipoices=new ArrayList<TipoIce>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoiceLogic.getEntity(idTipoIce);
					
					//tipoiceLogic.getEntityWithConnection(idTipoIce);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoiceLogic.setTipoIces(new ArrayList<TipoIce>());
					tipoiceLogic.getTipoIces().add(tipoiceLogic.getTipoIce());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoices=new ArrayList<TipoIce>();
					this.tipoices.add(tipoice);
				}
				
				if(tipoiceLogic.getTipoIce()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoIceConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoiceLogic.getTipoIcesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoIceConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoIceConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoiceLogic.getTipoIces()==null||tipoiceLogic.getTipoIces().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoices==null|| tipoices.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoicesAux=new ArrayList<TipoIce>();
						tipoicesAux.addAll(tipoiceLogic.getTipoIces());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoicesAux=new ArrayList<TipoIce>();
							tipoicesAux.addAll(tipoices);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoiceLogic.getTipoIcesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoIceConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoIceConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoIces("BusquedaPorNombre",tipoiceLogic.getTipoIces());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoIces("BusquedaPorNombre",tipoices);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoiceLogic.setTipoIces(new ArrayList<TipoIce>());
						tipoiceLogic.getTipoIces().addAll(tipoicesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoices=new ArrayList<TipoIce>();
							tipoices.addAll(tipoicesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoIce();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoIce();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoiceLogic.getTipoIces().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoices.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoiceLogic.getTipoIces().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoices.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoIce tipoice) {
		Boolean permite=true;
		
		if(this.tipoice.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoIceConstantesFunciones.getOrderByListaTipoIce();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoIceConstantesFunciones.getOrderByListaTipoIce();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIce tipoice:tipoiceLogic.getTipoIces()) {
				if(tipoice.getsType().equals(Constantes2.S_TOTALES)) {
					tipoiceTotales=tipoice;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIce tipoice:this.tipoices) {
				if(tipoice.getsType().equals(Constantes2.S_TOTALES)) {
					tipoiceTotales=tipoice;
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
			this.tipoiceAux=new TipoIce();
			this.tipoiceAux.setsType(Constantes2.S_TOTALES);
			this.tipoiceAux.setIsNew(false);
			this.tipoiceAux.setIsChanged(false);
			this.tipoiceAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoIceConstantesFunciones.TotalizarValoresFilaTipoIce(this.tipoiceLogic.getTipoIces(),this.tipoiceAux);
				
				this.tipoiceLogic.getTipoIces().add(this.tipoiceAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoIceConstantesFunciones.TotalizarValoresFilaTipoIce(this.tipoices,this.tipoiceAux);
				
				this.tipoices.add(this.tipoiceAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoiceTotales=new TipoIce();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoiceLogic.getTipoIces().remove(tipoiceTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoices.remove(tipoiceTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoiceTotales=new TipoIce();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIce tipoice:tipoiceLogic.getTipoIces()) {
				if(tipoice.getsType().equals(Constantes2.S_TOTALES)) {
					tipoiceTotales=tipoice;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIceConstantesFunciones.TotalizarValoresFilaTipoIce(this.tipoiceLogic.getTipoIces(),tipoiceTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIce tipoice:this.tipoices) {
				if(tipoice.getsType().equals(Constantes2.S_TOTALES)) {
					tipoiceTotales=tipoice;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIceConstantesFunciones.TotalizarValoresFilaTipoIce(this.tipoices,tipoiceTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoIcesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoIcePorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoIcesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoiceLogic.getTipoIcesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoIcePorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoiceLogic.getTipoIcePorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoIce() {
		this.isPermisoTodoTipoIce=false;
		this.isPermisoNuevoTipoIce=false;
		this.isPermisoActualizarTipoIce=false;
		this.isPermisoActualizarOriginalTipoIce=false;
		this.isPermisoEliminarTipoIce=false;
		this.isPermisoGuardarCambiosTipoIce=false;
		this.isPermisoConsultaTipoIce=false;
		this.isPermisoBusquedaTipoIce=false;
		this.isPermisoReporteTipoIce=false;		
		this.isPermisoOrdenTipoIce=false;		
		this.isPermisoPaginacionMedioTipoIce=false;		
		this.isPermisoPaginacionAltoTipoIce=false;
		this.isPermisoPaginacionTodoTipoIce=false;
		this.isPermisoCopiarTipoIce=false;		
		this.isPermisoVerFormTipoIce=false;		
		this.isPermisoDuplicarTipoIce=false;		
		this.isPermisoOrdenTipoIce=false;		
	}
	
	public void setPermisosUsuarioTipoIce(Boolean isPermiso) {
		this.isPermisoTodoTipoIce=isPermiso;
		this.isPermisoNuevoTipoIce=isPermiso;
		this.isPermisoActualizarTipoIce=isPermiso;
		this.isPermisoActualizarOriginalTipoIce=isPermiso;
		this.isPermisoEliminarTipoIce=isPermiso;
		this.isPermisoGuardarCambiosTipoIce=isPermiso;
		this.isPermisoConsultaTipoIce=isPermiso;
		this.isPermisoBusquedaTipoIce=isPermiso;
		this.isPermisoReporteTipoIce=isPermiso;
		this.isPermisoOrdenTipoIce=isPermiso;		
		this.isPermisoPaginacionMedioTipoIce=isPermiso;		
		this.isPermisoPaginacionAltoTipoIce=isPermiso;		
		this.isPermisoPaginacionTodoTipoIce=isPermiso;		
		this.isPermisoCopiarTipoIce=isPermiso;		
		this.isPermisoVerFormTipoIce=isPermiso;		
		this.isPermisoDuplicarTipoIce=isPermiso;
		this.isPermisoOrdenTipoIce=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoIce(Boolean isPermiso) {
		//this.isPermisoTodoTipoIce=isPermiso;
		this.isPermisoNuevoTipoIce=isPermiso;
		this.isPermisoActualizarTipoIce=isPermiso;
		this.isPermisoActualizarOriginalTipoIce=isPermiso;
		this.isPermisoEliminarTipoIce=isPermiso;
		this.isPermisoGuardarCambiosTipoIce=isPermiso;
		//this.isPermisoConsultaTipoIce=isPermiso;
		//this.isPermisoBusquedaTipoIce=isPermiso;
		//this.isPermisoReporteTipoIce=isPermiso;
		//this.isPermisoOrdenTipoIce=isPermiso;		
		//this.isPermisoPaginacionMedioTipoIce=isPermiso;		
		//this.isPermisoPaginacionAltoTipoIce=isPermiso;		
		//this.isPermisoPaginacionTodoTipoIce=isPermiso;		
		//this.isPermisoCopiarTipoIce=isPermiso;		
		//this.isPermisoDuplicarTipoIce=isPermiso;
		//this.isPermisoOrdenTipoIce=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoIceClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoIceJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoIce(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoIceClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoIceClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoIceClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoIceClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoIce() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoIceJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoIceConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoIce=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoIce=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoIce=this.isPermisoActualizarTipoIce;
			this.isPermisoEliminarTipoIce=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoIce=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoIce=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoIce=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoIce=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoIce=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIce=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoIce=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoIce=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoIce=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoIce=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoIce=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoIce=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIce=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoIce.setToolTipText(this.jTableDatosTipoIce.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoIce(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoIce(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoIceJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoIceJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoIce() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoIceListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoIceListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoIceJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoIceListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoIceListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoIce()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoIce()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoIce(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoIce()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIce();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoIce(TipoIce tipoice)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoIce(TipoIce tipoice,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoIce()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIce()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoIce()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoIce()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoIce()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoIce()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoIce(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoIce()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoIceBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoIceBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoIceBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoiceSessionBean=new TipoIceSessionBean(); 
		this.tipoiceConstantesFunciones=new TipoIceConstantesFunciones(); 
		this.tipoiceBean=new TipoIce();//(this.tipoiceConstantesFunciones); 		
		this.tipoiceReturnGeneral=new TipoIceParameterReturnGeneral(); 
		
		this.tipoiceSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoiceSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoIceBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoIceBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoIceBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoIce(true);
			
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
			
			this.tipoiceConstantesFunciones=new TipoIceConstantesFunciones(); 
			this.tipoiceBean=new TipoIce();//this.tipoiceConstantesFunciones); 			
			this.tipoiceReturnGeneral=new TipoIceParameterReturnGeneral(); 
		
			TipoIceBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Ice Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tipoice=new TipoIce();
			this.tipoices = new ArrayList<TipoIce>();
			this.tipoicesAux = new ArrayList<TipoIce>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic=new TipoIceLogic();
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoiceSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoiceSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoIce);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIce);	
					}
					
					if(this.jInternalFrameImportacionTipoIce!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIce);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoIce!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoIce);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoIce!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIce);
				this.jInternalFrameDetalleFormTipoIce.setVisible(false);
				this.jInternalFrameDetalleFormTipoIce.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIce);
					this.jInternalFrameReporteDinamicoTipoIce.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoIce.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoIce!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoIce);
					this.jInternalFrameImportacionTipoIce.setVisible(false);
					this.jInternalFrameImportacionTipoIce.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoIce!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoIce);
					this.jInternalFrameOrderByTipoIce.setVisible(false);
					this.jInternalFrameOrderByTipoIce.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoIceActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoIceConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoiceReturnGeneral=new TipoIceParameterReturnGeneral();
			
			this.tipoiceParameterGeneral=new TipoIceParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoiceLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoIceJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIceConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoiceSessionBean.getEsGuardarRelacionado(),this.tipoiceSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIceConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoiceSessionBean.getEsGuardarRelacionado(),this.tipoiceSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoIce=false;
			this.isVisibilidadCeldaDuplicarTipoIce=true;
			this.isVisibilidadCeldaCopiarTipoIce=true;
			this.isVisibilidadCeldaVerFormTipoIce=true;
			this.isVisibilidadCeldaOrdenTipoIce=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
			this.isVisibilidadCeldaModificarTipoIce=false;
			this.isVisibilidadCeldaActualizarTipoIce=false;
			this.isVisibilidadCeldaEliminarTipoIce=false;
			this.isVisibilidadCeldaCancelarTipoIce=false;
			this.isVisibilidadCeldaGuardarTipoIce=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoIce("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoIce();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoIce(false);
			
			this.setPermisosUsuarioTipoIce();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoiceSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoiceSessionBean.getEsGuardarRelacionado() && this.tipoiceSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoIceClasesRelacionadas();
			}
			
			if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoIceClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoIceJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoIce();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoIce();
			}
			
			if(!this.isPermisoBusquedaTipoIce) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoIce.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoIce,this.isPermisoPaginacionMedioTipoIce,this.isPermisoPaginacionTodoTipoIce);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoIceConstantesFunciones.getTiposSeleccionarTipoIce());
				
				this.tiposColumnasSelect=TipoIceConstantesFunciones.getTiposSeleccionarTipoIce(true);
				
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
			//if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoIce();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,true,false);
				this.setAccionesUsuarioTipoIce(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,true,false);							
				this.setAccionesUsuarioTipoIce(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIce() ;
			
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
				tipoiceImplementable= (TipoIceImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIceConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoiceImplementableHome= (TipoIceImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIceConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoices= new ArrayList<TipoIce>();
			this.tipoicesEliminados= new ArrayList<TipoIce>();
						
			this.isEsNuevoTipoIce=false;
			this.esParaAccionDesdeFormularioTipoIce=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoIce(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoIce();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoIceConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoIce("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoIce(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoIce!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoIce();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoIce();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoIce.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoIce.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoIce.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoIce(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoIce: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoIce() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoIce")) {
				iIndex=this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoIce();	
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
	
	public void cargarCombosForeignKeyTipoIce(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoIce(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoIce(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoIceListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoIce();
		
		this.cargarCombosFrameForeignKeyTipoIce();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoIce();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoIce();
		}
	}
	
	
	
	public void jButtonNuevoTipoIceActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
			
			if(jTableDatosTipoIce.getRowCount()>=1) {
				jTableDatosTipoIce.removeRowSelectionInterval(0, jTableDatosTipoIce.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoIce=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoIce(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoIce(true);			
			//this.tipoice=new TipoIce();
			//this.tipoice.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIce(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIce() ;
			
			if(TipoIceJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIce(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoice);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoice);				
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
			if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoIce: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoIceActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoIce.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoIce.getSelectedRows().length;			
			}
			
			tipoicesSeleccionados=this.getTipoIcesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoIce--;			
				//TipoIce tipoiceAux= new TipoIce();			
				//tipoiceAux.setId(this.iIdNuevoTipoIce);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoIce tipoiceOrigen=new TipoIce();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoIce tipoiceOrigen : tipoicesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoiceOrigen =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoiceOrigen =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoIce();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoice.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoIce(tipoiceOrigen,this.tipoice,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoiceLogic.getTipoIces().add(this.tipoiceAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoices.add(this.tipoiceAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoIce(false);
				
				this.jTableDatosTipoIce.setRowSelectionInterval(this.getIndiceNuevoTipoIce(), this.getIndiceNuevoTipoIce());
				
				int iLastRow =  this.jTableDatosTipoIce.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIce.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIce.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIce(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();									
		
			TipoIce tipoiceOrigen=new TipoIce();
			TipoIce tipoiceDestino=new TipoIce();
				
			tipoicesSeleccionados=this.getTipoIcesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoIce.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoicesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoIce.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoiceOrigen =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoiceOrigen =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoiceDestino =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoiceDestino =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoiceOrigen =tipoicesSeleccionados.get(0);
				tipoiceDestino =tipoicesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoIce(tipoiceOrigen,tipoiceDestino,true,false);
				
				tipoiceDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoiceDestino,tipoiceLogic.getTipoIces());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoiceDestino,tipoices);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoIce(false);
				
				//this.jTableDatosTipoIce.setRowSelectionInterval(this.getIndiceNuevoTipoIce(), this.getIndiceNuevoTipoIce());
				
				int iLastRow =  this.jTableDatosTipoIce.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIce.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIce.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIce(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoIce.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoIce.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoIce.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoIce.setVisible(!isVisible);
			this.jPanelPaginacionTipoIce.setVisible(!isVisible);
			this.jPanelAccionesTipoIce.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoIce();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoIce();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoIce();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoIce();
			
			this.abrirFrameOrderByTipoIce();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoIce();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoIce(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIce);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoIce.isMaximum()) {
					this.jInternalFrameDetalleFormTipoIce.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoIce.setSize(this.jInternalFrameDetalleFormTipoIce.iWidthFormulario,this.jInternalFrameDetalleFormTipoIce.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoIce.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoIce.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoIce.isMaximum()) {
						this.jInternalFrameDetalleFormTipoIce.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoIce.jContentPaneDetalleTipoIce.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoIce.jContentPaneDetalleTipoIce.getWidth(),TipoIceConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoIce.jContentPaneDetalleTipoIce.getWidth(),TipoIceConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoIce.jContentPaneDetalleTipoIce.getWidth(),TipoIceConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoIce.setVisible(true);
	        this.jInternalFrameDetalleFormTipoIce.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoIce() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoIce==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoIce=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIce,false,this);
				} else {
					this.jInternalFrameOrderByTipoIce=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIce,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoIce);
				this.jInternalFrameOrderByTipoIce.setVisible(false);
				this.jInternalFrameOrderByTipoIce.setSelected(false);
				
				this.jInternalFrameOrderByTipoIce.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIce"));
				
				this.inicializarActualizarBindingTablaOrderByTipoIce();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoIce() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoIce==null) {
				
				this.jInternalFrameImportacionTipoIce=new ImportacionJInternalFrame(TipoIceConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIce);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoIce);
				this.jInternalFrameImportacionTipoIce.setVisible(false);
				this.jInternalFrameImportacionTipoIce.setSelected(false);


				this.jInternalFrameImportacionTipoIce.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIce"));
				this.jInternalFrameImportacionTipoIce.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIce"));
				this.jInternalFrameImportacionTipoIce.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIce"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoIce() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoIce==null) {
				this.jInternalFrameReporteDinamicoTipoIce=new ReporteDinamicoJInternalFrame(TipoIceConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIce);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIce);
				this.jInternalFrameReporteDinamicoTipoIce.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoIce.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoIce.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIce"));
				this.jInternalFrameReporteDinamicoTipoIce.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIce"));
				this.jInternalFrameReporteDinamicoTipoIce.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIce"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIce();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoIce() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIce);
			
	       	this.jInternalFrameDetalleFormTipoIce.setVisible(false);
	        this.jInternalFrameDetalleFormTipoIce.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoIce.dispose();
			//this.jInternalFrameDetalleFormTipoIce=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoIce() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoIce.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoIce.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoIce() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoIce.setVisible(true);
	        this.jInternalFrameImportacionTipoIce.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoIce() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoIce.setVisible(true);
	        this.jInternalFrameOrderByTipoIce.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoIce() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoIce.setVisible(false);
	        this.jInternalFrameOrderByTipoIce.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoIce() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoIce.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoIce.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoIce() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoIce.setVisible(false);
	        this.jInternalFrameImportacionTipoIce.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoIce(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoIce(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoIce(true);
			//this.isEsNuevoTipoIce=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoIce("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIce(false) ;
			
			if(tipoiceSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoIceJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIce(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIce(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoIceActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoIce(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoIce(true);
			//this.isEsNuevoTipoIce=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoice.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoIce("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoIce(false) ;
			
			if(TipoIceJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIce(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIce(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoIce(false);
			
			//if(!this.isEsNuevoTipoIce) {								
				int intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
				
			}
			
			if(this.permiteMantenimiento(this.tipoice)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoIce=true;
					this.inicializarActualizarBindingTablaTipoIce(false);
					this.isEsNuevoTipoIce=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoIce=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoIce=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIce(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIce(false);
				
				this.habilitarDeshabilitarControlesTipoIce(false);
			
												
				
				if(TipoIceJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoIce();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoIceActionPerformed(evt,tipoiceSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoIce(this.tipoice,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoIce.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoiceSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoice.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoIceActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				this.tipoice.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				this.tipoice.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoice)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoIceModel) this.jTableDatosTipoIce.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoIce=true;
				this.inicializarActualizarBindingTablaTipoIce(false);
				this.isEsNuevoTipoIce=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIce(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIce(false);
				
				this.habilitarDeshabilitarControlesTipoIce(false);
				
				
				
				if(TipoIceJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoIce();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoIceActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoIce.getRowCount()>=1) {
				jTableDatosTipoIce.removeRowSelectionInterval(0, jTableDatosTipoIce.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoIce(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoIce(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIce(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIce(false) ;
			
			this.isEsNuevoTipoIce=false;
			
			if(TipoIceJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoIce();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoIceActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoIce(false);
				
				//SI ES MANUAL
				if(TipoIceJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoIce();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoIceActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoIce--;			
			//TipoIce tipoiceAux= new TipoIce();			
			//tipoiceAux.setId(this.iIdNuevoTipoIce);
			
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoIce();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
			
			this.tipoice.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoiceLogic.getTipoIces().add(this.tipoiceAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoices.add(this.tipoiceAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoIce(false);
			
			this.jTableDatosTipoIce.setRowSelectionInterval(this.getIndiceNuevoTipoIce(), this.getIndiceNuevoTipoIce());
			
			int iLastRow =  this.jTableDatosTipoIce.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoIce.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoIce.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoIce(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoIceActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoIce(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIce(false);
			
			//SI ES MANUAL
			if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIce();
			}
			
			//this.abrirFrameTreeTipoIce();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoIceActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo IceS ?", "MANTENIMIENTO DE Tipo Ice", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoIce.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoIce();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoiceReturnGeneral=tipoiceLogic.procesarImportacionTipoIcesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoiceParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoIceReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoIceActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoIce.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoIce.setFileImportacion(this.jInternalFrameImportacionTipoIce.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoIce.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoIce.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoIce.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoIce.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoIceActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		

		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoIceBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoIceBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoIces("Todos",tipoicesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIceConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoIceConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoIce.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoIceConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoIceConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoIceConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoIceConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIceConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoIceConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoIceActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoice";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoIces");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoIceConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIceConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoIce tipoice:tipoicesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoice.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoIceConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIceConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(TipoIce tipoice:tipoicesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoice.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelTipoIce(row);				
			//	iRow++;
			//}				
			
			//for(TipoIce tipoiceAux:tipoicesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoIce(tipoiceAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIce(false);
			
			//SI ES MANUAL
			if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIce();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoIceActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIce(false);
			
			//SI ES MANUAL
			if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIce();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoIceActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIce(false);
			
			//SI ES MANUAL
			if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIce();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoIce() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoIce.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoIce.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoIce.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoIce.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoIce.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoIce.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoIce.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoIce(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoIce(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoIce(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoIce(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoIce(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoIce(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIce(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoIce(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoIceJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoIce() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoIce();
		
		this.inicializarActualizarBindingBotonesManualTipoIce(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIce();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIce() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIce(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIce(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoIce.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoIce.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoIce.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoIce!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoIce.jCheckBoxPostAccionNuevoTipoIce.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoIce.jCheckBoxPostAccionSinCerrarTipoIce.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoIce.jCheckBoxPostAccionSinMensajeTipoIce.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoIce.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoIce.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoIce.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoIce!=null) {
				this.jInternalFrameDetalleFormTipoIce.jCheckBoxPostAccionNuevoTipoIce.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoIce.jCheckBoxPostAccionSinCerrarTipoIce.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoIce.jCheckBoxPostAccionSinMensajeTipoIce.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoIce.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoIce.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoIce.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoIce.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoIce.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoIce.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoIce.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoIce.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoIce.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoIce(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIce(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoIce() throws Exception {
		try	{
			if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIce();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIce() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIce() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoIce.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoIce.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoIce.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoIce.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoIce.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoIce.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoIce.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoIce.addItem(reporte);
			}
			
			
			if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoIce.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoIce.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoIce.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoIce.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoIce.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoIce.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoIce.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoIce.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoIce.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIce();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIce() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
				this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
				this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoIce.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIce.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIce.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TipoIceConstantesFunciones.getTiposSeleccionarTipoIce(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TipoIceConstantesFunciones.getTiposSeleccionarTipoIce(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TipoIceConstantesFunciones.getTiposSeleccionarTipoIce(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIce.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTipoIce.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoIce()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoIce.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoIce(Boolean esInicializar) throws Exception {				
		if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIce();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoIce() throws Exception {
		this.inicializarActualizarBindingTablaTipoIce(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoIce() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoIcePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoIcePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoIceOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIceOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoIcePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoIcePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoIce(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoiceLogic.getTipoIces().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoices.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoIce.setModel(new TipoIceModel(this.tipoiceLogic.getTipoIces(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoIce.setModel(new TipoIceModel(this.tipoices,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoIce!=null && this.jInternalFrameOrderByTipoIce.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoIce();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoIce.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIce,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoIcePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoIceConstantesFunciones.SCLASSWEBTITULO,tipoiceConstantesFunciones.resaltarSeleccionarTipoIce,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoIceConstantesFunciones.SCLASSWEBTITULO,tipoiceConstantesFunciones.resaltarSeleccionarTipoIce,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoIce.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIce,TipoIceConstantesFunciones.LABEL_ID));

		if(this.tipoiceConstantesFunciones.mostraridTipoIce && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIceConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoiceConstantesFunciones.resaltaridTipoIce,this.tipoiceConstantesFunciones.activaridTipoIce,iSizeTabla,this,true,"idTipoIce","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoiceConstantesFunciones.resaltaridTipoIce,this.tipoiceConstantesFunciones.activaridTipoIce,this,true,"idTipoIce","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIce.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIce,TipoIceConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoiceConstantesFunciones.mostrarnombreTipoIce && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIceConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoiceConstantesFunciones.resaltarnombreTipoIce,this.tipoiceConstantesFunciones.activarnombreTipoIce,iSizeTabla,this,true,"nombreTipoIce","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoiceConstantesFunciones.resaltarnombreTipoIce,this.tipoiceConstantesFunciones.activarnombreTipoIce,this,true,"nombreTipoIce","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoIcePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIce.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIce,TipoIceConstantesFunciones.LABEL_PORCENTAJE));

		if(this.tipoiceConstantesFunciones.mostrarporcentajeTipoIce && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIceConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoiceConstantesFunciones.resaltarporcentajeTipoIce,this.tipoiceConstantesFunciones.activarporcentajeTipoIce,iSizeTabla,this,true,"porcentajeTipoIce","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoiceConstantesFunciones.resaltarporcentajeTipoIce,this.tipoiceConstantesFunciones.activarporcentajeTipoIce,this,true,"porcentajeTipoIce","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoIcePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoiceSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoiceSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoiceSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIce.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoiceSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoiceSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIce.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoIce && this.isPermisoGuardarCambiosTipoIce) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoiceSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoiceSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoIce.addColumn(tableColumn);
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
			
			this.jTableDatosTipoIce.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIce && this.isPermisoGuardarCambiosTipoIce) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIce && this.isPermisoGuardarCambiosTipoIce) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoIce.moveColumn(this.jTableDatosTipoIce.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoIce.moveColumn(this.jTableDatosTipoIce.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoIce.moveColumn(this.jTableDatosTipoIce.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoIce.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoIce.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoIce,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoIce.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoIce.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoIce.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoIce.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoIce.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoiceLogic.getTipoIces().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoices.size()-1;
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
		//this.jTableDatosTipoIce.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoIce.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoIce();
			
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
				
				//this.isEsNuevoTipoIce=false;
					
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
				if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoIce==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIce.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIce.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoice.getsType().equals("DUPLICADO")
				   || this.tipoice.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoIce=true;
				
				} else {
					this.isEsNuevoTipoIce=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoiceSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoice.getId()>=0 && !this.tipoice.getIsNew()) {						
						this.isEsNuevoTipoIce=false;
						
					} else {
						this.isEsNuevoTipoIce=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoIce(esRelaciones);						
				
				this.seleccionarTipoIce(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoice.getId()<0) {
					this.isEsNuevoTipoIce=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoIce(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoIce(evt,rowIndex);
				}	
				
				if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoIce: " + this.dDif); 
					}
				}								
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoIce(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoice)) {
					if(this.tipoice.getId()>0) {
						this.tipoice.setIsDeleted(true);
						
						this.tipoicesEliminados.add(this.tipoice);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoiceLogic.getTipoIces().remove(this.tipoice);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoices.remove(this.tipoice);				
					}
					
					
					((TipoIceModel) this.jTableDatosTipoIce.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIce(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoIce(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoIce) {
			
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIce.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIce.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoIce(this.tipoice);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoIce("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoIce(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIce() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIce(TipoIce tipoice) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoIce(tipoice,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIce(TipoIce tipoice,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoIce(tipoice);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoIce(tipoice,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoIce(tipoice);
	}
	
	public void setVariablesObjetoActualToFormularioTipoIce(TipoIce tipoice) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.setText(tipoice.getId().toString());
			this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.setText(tipoice.getnombre());
			this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.setText(tipoice.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoIce tipoiceLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoiceLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoIce tipoiceLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoiceLocal=this.tipoice;
			} else {
				tipoiceLocal=this.tipoiceAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoiceLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoIce(tipoiceLocal,true);
					
					if(tipoiceSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoiceLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoiceLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoIce(TipoIce tipoice,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIce(tipoice,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(tipoice);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIce(TipoIce tipoice,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIce(tipoice,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIce(TipoIce tipoice,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.getText()==null || this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.getText()=="" || this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.setText("0");
			}

			if(conColumnasBase) {tipoice.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIceConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIce.jLabelIdTipoIce,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoice.setnombre(this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIceConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIce.jLabelnombreTipoIce,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoice.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIceConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIce.jLabelporcentajeTipoIce,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIce(TipoIce tipoiceBean,TipoIce tipoice,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoIce(TipoIce tipoiceOrigen,TipoIce tipoice,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoiceOrigen.getId()!=null && !tipoiceOrigen.getId().equals(0L))) {tipoice.setId(tipoiceOrigen.getId());}}
			if(conDefault || (!conDefault && tipoiceOrigen.getnombre()!=null && !tipoiceOrigen.getnombre().equals(""))) {tipoice.setnombre(tipoiceOrigen.getnombre());}
			if(conDefault || (!conDefault && tipoiceOrigen.getporcentaje()!=null && !tipoiceOrigen.getporcentaje().equals(0.0))) {tipoice.setporcentaje(tipoiceOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIce(TipoIce tipoice) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.setText(tipoice.getId().toString());
			this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.setText(tipoice.getnombre());
			this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.setText(tipoice.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIce(TipoIceBean tipoiceBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.setText(tipoiceBean.getId().toString());
			this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.setText(tipoiceBean.getnombre());
			this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.setText(tipoiceBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoIce(TipoIceParameterReturnGeneral tipoiceReturnGeneral,TipoIceBean tipoiceBean,Boolean conDefault) throws Exception { 
		try {
			TipoIce tipoiceLocal=new TipoIce();
			
			tipoiceLocal=tipoiceReturnGeneral.getTipoIce();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoiceLocal.getId()!=null && !tipoiceLocal.getId().equals(0L))) {tipoiceBean.setId(tipoiceLocal.getId());}}
			if(conDefault || (!conDefault && tipoiceLocal.getnombre()!=null && !tipoiceLocal.getnombre().equals(""))) {tipoiceBean.setnombre(tipoiceLocal.getnombre());}
			if(conDefault || (!conDefault && tipoiceLocal.getporcentaje()!=null && !tipoiceLocal.getporcentaje().equals(0.0))) {tipoiceBean.setporcentaje(tipoiceLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoIceGenerico(Long idTipoIceSeleccionado,JComboBox jComboBoxTipoIce,List<TipoIce> tipoicesLocal)throws Exception {
		try {
			TipoIce  tipoiceTemp=null;

			for(TipoIce tipoiceAux:tipoicesLocal) {
				if(tipoiceAux.getId()!=null && tipoiceAux.getId().equals(idTipoIceSeleccionado)) {
					tipoiceTemp=tipoiceAux;
					break;
				}
			}

			jComboBoxTipoIce.setSelectedItem(tipoiceTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoIceGenerico(JComboBox jComboBoxTipoIce,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoIce.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIce.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoIce.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIce.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIce.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoIce.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIce.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoIce.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoIce.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoIce.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoice=(TipoIce) tipoiceLogic.getTipoIces().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoice =(TipoIce) tipoices.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoIce tipoiceRow=new TipoIce();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoiceRow=(TipoIce) tipoiceLogic.getTipoIces().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoiceRow=(TipoIce) tipoices.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoIce(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoIce.setVisible((this.isVisibilidadCeldaNuevoTipoIce && this.isPermisoNuevoTipoIce));			
			this.jButtonDuplicarTipoIce.setVisible((this.isVisibilidadCeldaDuplicarTipoIce && this.isPermisoDuplicarTipoIce));			
			this.jButtonCopiarTipoIce.setVisible((this.isVisibilidadCeldaCopiarTipoIce && this.isPermisoCopiarTipoIce));
			this.jButtonVerFormTipoIce.setVisible((this.isVisibilidadCeldaVerFormTipoIce && this.isPermisoVerFormTipoIce));
			
			this.jButtonAbrirOrderByTipoIce.setVisible((this.isVisibilidadCeldaOrdenTipoIce && this.isPermisoOrdenTipoIce));			
			
			this.jButtonNuevoRelacionesTipoIce.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIce && this.isPermisoNuevoTipoIce));			
			this.jButtonNuevoGuardarCambiosTipoIce.setVisible((this.isVisibilidadCeldaNuevoTipoIce && this.isPermisoNuevoTipoIce && this.isPermisoGuardarCambiosTipoIce));
			
			if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.jInternalFrameDetalleFormTipoIce.jButtonModificarTipoIce.setVisible((this.isVisibilidadCeldaModificarTipoIce && this.isPermisoActualizarTipoIce));	
			this.jInternalFrameDetalleFormTipoIce.jButtonActualizarTipoIce.setVisible((this.isVisibilidadCeldaActualizarTipoIce && this.isPermisoActualizarTipoIce));	
			this.jInternalFrameDetalleFormTipoIce.jButtonEliminarTipoIce.setVisible((this.isVisibilidadCeldaEliminarTipoIce && this.isPermisoEliminarTipoIce));
			this.jInternalFrameDetalleFormTipoIce.jButtonCancelarTipoIce.setVisible(this.isVisibilidadCeldaCancelarTipoIce);							
			this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.setVisible((this.isVisibilidadCeldaGuardarTipoIce && this.isPermisoGuardarCambiosTipoIce));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoIce.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIce && this.isPermisoGuardarCambiosTipoIce));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoIce.setVisible((this.isVisibilidadCeldaNuevoTipoIce && this.isPermisoNuevoTipoIce));						
			this.jButtonDuplicarToolBarTipoIce.setVisible((this.isVisibilidadCeldaDuplicarTipoIce && this.isPermisoDuplicarTipoIce));						
			this.jButtonCopiarToolBarTipoIce.setVisible((this.isVisibilidadCeldaCopiarTipoIce && this.isPermisoCopiarTipoIce));			
			this.jButtonVerFormToolBarTipoIce.setVisible((this.isVisibilidadCeldaVerFormTipoIce && this.isPermisoVerFormTipoIce));			
			this.jButtonAbrirOrderByToolBarTipoIce.setVisible((this.isVisibilidadCeldaOrdenTipoIce && this.isPermisoOrdenTipoIce));
			this.jButtonNuevoRelacionesToolBarTipoIce.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIce && this.isPermisoNuevoTipoIce));			
			this.jButtonNuevoGuardarCambiosToolBarTipoIce.setVisible((this.isVisibilidadCeldaNuevoTipoIce && this.isPermisoNuevoTipoIce && this.isPermisoGuardarCambiosTipoIce));			
			
			if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.jInternalFrameDetalleFormTipoIce.jButtonModificarToolBarTipoIce.setVisible((this.isVisibilidadCeldaModificarTipoIce && this.isPermisoActualizarTipoIce));	
			this.jInternalFrameDetalleFormTipoIce.jButtonActualizarToolBarTipoIce.setVisible((this.isVisibilidadCeldaActualizarTipoIce  && this.isPermisoActualizarTipoIce));	
			this.jInternalFrameDetalleFormTipoIce.jButtonEliminarToolBarTipoIce.setVisible((this.isVisibilidadCeldaEliminarTipoIce && this.isPermisoEliminarTipoIce));
			this.jInternalFrameDetalleFormTipoIce.jButtonCancelarToolBarTipoIce.setVisible(this.isVisibilidadCeldaCancelarTipoIce);				
			this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosToolBarTipoIce.setVisible((this.isVisibilidadCeldaGuardarTipoIce && this.isPermisoGuardarCambiosTipoIce));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoIce.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIce && this.isPermisoGuardarCambiosTipoIce));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoIce.setVisible((this.isVisibilidadCeldaNuevoTipoIce && this.isPermisoNuevoTipoIce));			
			this.jMenuItemDuplicarTipoIce.setVisible((this.isVisibilidadCeldaDuplicarTipoIce && this.isPermisoDuplicarTipoIce));			
			this.jMenuItemCopiarTipoIce.setVisible((this.isVisibilidadCeldaCopiarTipoIce && this.isPermisoCopiarTipoIce));			
			this.jMenuItemVerFormTipoIce.setVisible((this.isVisibilidadCeldaVerFormTipoIce && this.isPermisoVerFormTipoIce));			
			this.jMenuItemAbrirOrderByTipoIce.setVisible((this.isVisibilidadCeldaOrdenTipoIce && this.isPermisoOrdenTipoIce));			
			//this.jMenuItemMostrarOcultarTipoIce.setVisible((this.isVisibilidadCeldaOrdenTipoIce && this.isPermisoOrdenTipoIce));
			this.jMenuItemDetalleAbrirOrderByTipoIce.setVisible((this.isVisibilidadCeldaOrdenTipoIce && this.isPermisoOrdenTipoIce));			
			//this.jMenuItemDetalleMostrarOcultarTipoIce.setVisible((this.isVisibilidadCeldaOrdenTipoIce && this.isPermisoOrdenTipoIce));			
			this.jMenuItemNuevoRelacionesTipoIce.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIce && this.isPermisoNuevoTipoIce));			
			this.jMenuItemNuevoGuardarCambiosTipoIce.setVisible((this.isVisibilidadCeldaNuevoTipoIce && this.isPermisoNuevoTipoIce && this.isPermisoGuardarCambiosTipoIce));									
			
			if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.jInternalFrameDetalleFormTipoIce.jMenuItemModificarTipoIce.setVisible((this.isVisibilidadCeldaModificarTipoIce && this.isPermisoActualizarTipoIce));	
			this.jInternalFrameDetalleFormTipoIce.jMenuItemActualizarTipoIce.setVisible((this.isVisibilidadCeldaActualizarTipoIce && this.isPermisoActualizarTipoIce));	
			this.jInternalFrameDetalleFormTipoIce.jMenuItemEliminarTipoIce.setVisible((this.isVisibilidadCeldaEliminarTipoIce && this.isPermisoEliminarTipoIce));
			this.jInternalFrameDetalleFormTipoIce.jMenuItemCancelarTipoIce.setVisible(this.isVisibilidadCeldaCancelarTipoIce);				
			}
			
			this.jMenuItemGuardarCambiosTipoIce.setVisible((this.isVisibilidadCeldaGuardarTipoIce && this.isPermisoGuardarCambiosTipoIce));						
			this.jMenuItemGuardarCambiosTablaTipoIce.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIce && this.isPermisoGuardarCambiosTipoIce));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoIce=this.jButtonNuevoTipoIce.isVisible();
			this.isVisibilidadCeldaDuplicarTipoIce=this.jButtonDuplicarTipoIce.isVisible();
			this.isVisibilidadCeldaCopiarTipoIce=this.jButtonCopiarTipoIce.isVisible();
			this.isVisibilidadCeldaVerFormTipoIce=this.jButtonVerFormTipoIce.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoIce=this.jButtonAbrirOrderByTipoIce.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=this.jButtonNuevoRelacionesTipoIce.isVisible();
			this.isVisibilidadCeldaModificarTipoIce=this.jButtonModificarTipoIce.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.isVisibilidadCeldaActualizarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonActualizarTipoIce.isVisible();
			this.isVisibilidadCeldaEliminarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonEliminarTipoIce.isVisible();
			this.isVisibilidadCeldaCancelarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonCancelarTipoIce.isVisible();
			this.isVisibilidadCeldaGuardarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoIce=this.jButtonGuardarCambiosTablaTipoIce.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoIce=this.jButtonNuevoToolBarTipoIce.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=this.jButtonNuevoRelacionesToolBarTipoIce.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.isVisibilidadCeldaModificarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonModificarToolBarTipoIce.isVisible();
			this.isVisibilidadCeldaActualizarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonActualizarToolBarTipoIce.isVisible();
			this.isVisibilidadCeldaEliminarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonEliminarToolBarTipoIce.isVisible();
			this.isVisibilidadCeldaCancelarTipoIce=this.jInternalFrameDetalleFormTipoIce.jButtonCancelarToolBarTipoIce.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIce=this.jButtonGuardarCambiosToolBarTipoIce.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIce=this.jButtonGuardarCambiosTablaToolBarTipoIce.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoIce=this.jMenuItemNuevoTipoIce.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=this.jMenuItemNuevoRelacionesTipoIce.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.isVisibilidadCeldaModificarTipoIce=this.jInternalFrameDetalleFormTipoIce.jMenuItemModificarTipoIce.isVisible();
			this.isVisibilidadCeldaActualizarTipoIce=this.jInternalFrameDetalleFormTipoIce.jMenuItemActualizarTipoIce.isVisible();
			this.isVisibilidadCeldaEliminarTipoIce=this.jInternalFrameDetalleFormTipoIce.jMenuItemEliminarTipoIce.isVisible();
			this.isVisibilidadCeldaCancelarTipoIce=this.jInternalFrameDetalleFormTipoIce.jMenuItemCancelarTipoIce.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIce=this.jMenuItemGuardarCambiosTipoIce.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIce=this.jMenuItemGuardarCambiosTablaTipoIce.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoIce(Boolean esInicializar) {
		if(TipoIceJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoiceSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIce();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoIce(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoIce() {
		this.jButtonNuevoTipoIce.setVisible(this.isPermisoNuevoTipoIce);			
		this.jButtonDuplicarTipoIce.setVisible(this.isPermisoDuplicarTipoIce);			
		this.jButtonCopiarTipoIce.setVisible(this.isPermisoCopiarTipoIce);			
		this.jButtonVerFormTipoIce.setVisible(this.isPermisoVerFormTipoIce);			
		
		this.jButtonAbrirOrderByTipoIce.setVisible(this.isPermisoOrdenTipoIce);					
		
		this.jButtonNuevoRelacionesTipoIce.setVisible(this.isPermisoNuevoTipoIce);			
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonModificarTipoIce.setVisible(this.isPermisoActualizarTipoIce);	
			this.jInternalFrameDetalleFormTipoIce.jButtonActualizarTipoIce.setVisible(this.isPermisoActualizarTipoIce);	
			this.jInternalFrameDetalleFormTipoIce.jButtonEliminarTipoIce.setVisible(this.isPermisoEliminarTipoIce);
			this.jInternalFrameDetalleFormTipoIce.jButtonCancelarTipoIce.setVisible(this.isVisibilidadCeldaCancelarTipoIce);						
			this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.setVisible(this.isPermisoGuardarCambiosTipoIce);							
		}
		
		this.jButtonGuardarCambiosTablaTipoIce.setVisible(this.isPermisoActualizarTipoIce);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIce() {
		this.jInternalFrameDetalleFormTipoIce.jButtonModificarTipoIce.setVisible(this.isPermisoActualizarTipoIce);	
		this.jInternalFrameDetalleFormTipoIce.jButtonActualizarTipoIce.setVisible(this.isPermisoActualizarTipoIce);	
		this.jInternalFrameDetalleFormTipoIce.jButtonEliminarTipoIce.setVisible(this.isPermisoEliminarTipoIce);
		this.jInternalFrameDetalleFormTipoIce.jButtonCancelarTipoIce.setVisible(this.isVisibilidadCeldaCancelarTipoIce);							
		this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.setVisible((this.isVisibilidadCeldaGuardarTipoIce && this.isPermisoGuardarCambiosTipoIce));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoIce() {
		if(TipoIceJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoIce();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoIce() {
	}
	
	public void jTableDatosTipoIceListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoIce(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoIceBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIce(this.gettipoice(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoice==null) {
						this.tipoice = new TipoIce();
					}

					this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
				}

				if(this.tipoice.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoice.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIce(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoIceBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIce(this.gettipoice(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoice==null) {
						this.tipoice = new TipoIce();
					}

					this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
				}

				if(this.tipoice.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoice.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIce(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeTipoIceBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIce(this.gettipoice(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoice==null) {
						this.tipoice = new TipoIce();
					}

					this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);
				}

				if(this.tipoice.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.tipoice.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIce(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoIceActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoIce(false,false);

			this.getTipoIcesBusquedaPorNombre();

			this.inicializarActualizarBindingTipoIce(false);

			//if(TipoIceBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoIce(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoiceLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoIce() {
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
			this.jInternalFrameDetalleFormTipoIce.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoIce.dispose();
			this.jInternalFrameDetalleFormTipoIce=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
			this.jInternalFrameReporteDinamicoTipoIce.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoIce.dispose();
			this.jInternalFrameReporteDinamicoTipoIce=null;
		}
		
		if(this.jInternalFrameImportacionTipoIce!=null) {
			this.jInternalFrameImportacionTipoIce.setVisible(false);	    			
			this.jInternalFrameImportacionTipoIce.dispose();
			this.jInternalFrameImportacionTipoIce=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoIce();
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoIce")) {
				jButtonDuplicarTipoIceActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoIce")) {
				jButtonCopiarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoIce")) {
				jButtonVerFormTipoIceActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoIce")) {
				jButtonDuplicarTipoIceActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoIce")) {
				jButtonDuplicarTipoIceActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoIce")) {
				jButtonModificarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoIce")) {
				jButtonModificarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoIce")) {
				jButtonModificarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoIce")) {
				jButtonActualizarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoIce")) {
				jButtonActualizarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoIce")) {
				jButtonActualizarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoIce")) {
				jButtonEliminarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoIce")) {
				jButtonEliminarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoIce")) {
				jButtonEliminarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoIce")) {
				jButtonCancelarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoIce")) {
				jButtonCancelarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoIce")) {
				jButtonCancelarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoIce")) {
				jButtonCerrarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoIce")) {
				jButtonCerrarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoIce")) {
				jButtonCerrarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoIce")) {
				jButtonMostrarOcultarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoIce")) {
				jButtonCancelarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoIce")) {
				jButtonCopiarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoIce")) {
				jButtonVerFormTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoIce")) {
				jButtonCopiarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoIce")) {
				jButtonVerFormTipoIceActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoIce")) {
				jButtonRecargarInformacionTipoIceActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoIce")) {
				jButtonRecargarInformacionTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoIce")) {
				jButtonRecargarInformacionTipoIceActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoIce")) {
				jButtonAnterioresTipoIceActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoIce")) {
				jButtonAnterioresTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoIce")) {
				jButtonAnterioresTipoIceActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoIce")) {
				jButtonSiguientesTipoIceActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoIce")) {
				jButtonSiguientesTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoIce")) {
				jButtonSiguientesTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoIce") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoIce")) {
				jButtonAbrirOrderByTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoIce") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoIce")) {
				jButtonMostrarOcultarTipoIceActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIce")) {
				jButtonNuevoGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoIce")) {
				jButtonNuevoGuardarCambiosTipoIceActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoIce")) {
				jButtonNuevoGuardarCambiosTipoIceActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoIce")) {
				jButtonCerrarReporteDinamicoTipoIceActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoIce")) {
				jButtonGenerarReporteDinamicoTipoIceActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoIce")) {
				
				jButtonGenerarExcelReporteDinamicoTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoIce")) {
				jButtonCerrarImportacionTipoIceActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoIce")) {
				
				jButtonGenerarImportacionTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoIce")) {
				
				jButtonAbrirImportacionTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoIce")) {
				jComboBoxTiposAccionesTipoIceActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoIce")) {
				jComboBoxTiposRelacionesTipoIceActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoIce")) {
				jComboBoxTiposAccionesTipoIceActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoIce")) {
				
				jComboBoxTiposSeleccionarTipoIceActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoIce")) {
				jTextFieldValorCampoGeneralTipoIceActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoIce")) {
				jButtonAbrirOrderByTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoIce")) {
				jButtonAbrirOrderByTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoIce")) {
				jButtonCerrarOrderByTipoIceActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIceBusqueda")) {
				this.jButtonidTipoIceBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIceBusqueda")) {
				this.jButtonnombreTipoIceBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTipoIceBusqueda")) {
				this.jButtonporcentajeTipoIceBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoIce")) {
				this.jButtonBusquedaPorNombreTipoIceActionPerformed(evt);
			}
			
			;
			
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoIce();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIceActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoIce tipoiceLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoiceLocal=this.tipoice;
			} else {
				tipoiceLocal=this.tipoiceAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
							
				
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceAnterior =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiceAnterior =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
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
			
			


			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIceActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
								
						
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
								
				
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceAnterior =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiceAnterior =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceAnterior =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiceAnterior =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
							
				
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIceActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoiceAnterior =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoiceAnterior =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
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
			
			


			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
								
				
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceAnterior =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiceAnterior =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIceActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoIce")) {
					jCheckBoxSeleccionarTodosTipoIceItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoIce")) {
					jCheckBoxSeleccionadosTipoIceItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoIce")) {
					
				}
				
				


				
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
												
				
				


				
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIceActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoiceAnterior =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoiceAnterior =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIceActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
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
			
			


			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIceActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoice);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoice);
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
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
				
				


				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIce.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIce.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIceActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoiceAnterior =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoiceAnterior =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoIce")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoIceListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoIce.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoice =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoice =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoice);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoIce")) {
				
				}
				
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoIce")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoIce.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoIce")) {
			
			}
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoIce();
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
			if(sTipo.equals("NuevoTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoIce")) {
				jButtonDuplicarTipoIceActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoIce")) {
				jButtonCopiarTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoIce")) {
				jButtonVerFormTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoIce")) {
				jButtonNuevoTipoIceActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoIce")) {
				jButtonModificarTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoIce")) {
				jButtonActualizarTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoIce")) {
				jButtonEliminarTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoIce")) {
				jButtonCancelarTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoIce")) {
				jButtonCerrarTipoIceActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoIce")) {
				jButtonGuardarCambiosTipoIceActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIce")) {
				jButtonNuevoGuardarCambiosTipoIceActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoIce")) {
				jButtonAbrirOrderByTipoIceActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoIce")) {
				jButtonRecargarInformacionTipoIceActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoIce")) {
				jButtonAnterioresTipoIceActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoIce")) {
				jButtonSiguientesTipoIceActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIceBusqueda")) {
				this.jButtonidTipoIceBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIceBusqueda")) {
				this.jButtonnombreTipoIceBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTipoIceBusqueda")) {
				this.jButtonporcentajeTipoIceBusquedaActionPerformed(evt);
			}
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoIce();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoIce")) {
				closingInternalFrameTipoIce();
				
			} else if(sTipo.equals("jButtonCancelarTipoIce")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoIce = (JInternalFrameBase)evt.getSource();
	            	
	            TipoIceBeanSwingJInternalFrame jInternalFrameParent=(TipoIceBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIce.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoIceActionPerformed(null);
			}
			
			TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoice,new Object(),this.tipoiceParameterGeneral,this.tipoiceReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoIce(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoIce(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoIce(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoice)) {
			if(!esControlTabla) {
				if(TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);			
				}
				
				if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoIce(this.tipoice,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoiceReturnGeneral=tipoiceLogic.procesarEventosTipoIcesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoiceLogic.getTipoIces(),this.tipoice,this.tipoiceParameterGeneral,this.isEsNuevoTipoIce,classes);//this.tipoiceLogic.getTipoIce()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoIce(this.tipoiceReturnGeneral,this.tipoiceBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoIce(classes,this.tipoiceReturnGeneral,this.tipoiceBean,false);
					}
						
					if(this.tipoiceReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoIce(this.tipoiceReturnGeneral.getTipoIce());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoIce(this.tipoiceReturnGeneral.getTipoIce());	
					}
						
					if(this.tipoiceReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoIce(this.tipoiceReturnGeneral.getTipoIce(),classes);//this.tipoiceBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoIce(this.tipoice,classes);//this.tipoiceBean);									
				}
			
				if(TipoIceJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoIce(this.tipoice,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIce(this.tipoice);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoiceAnterior!=null) {
						this.tipoice=this.tipoiceAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoiceReturnGeneral=tipoiceLogic.procesarEventosTipoIcesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoiceLogic.getTipoIces(),this.tipoice,this.tipoiceParameterGeneral,this.isEsNuevoTipoIce,classes);//this.tipoiceLogic.getTipoIce()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoiceSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoiceSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoiceReturnGeneral.getTipoIce(),tipoiceLogic.getTipoIces());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoiceReturnGeneral.getTipoIce(),this.tipoices);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoIce.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoIce.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoIce();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoIce() throws Exception {
		
		TipoIceModel tipoiceModel=(TipoIceModel)this.jTableDatosTipoIce.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoiceModel.tipoices=this.tipoiceLogic.getTipoIces();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoiceModel.tipoices=this.tipoices;
		}
		
		
		((TipoIceModel) this.jTableDatosTipoIce.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoIce() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoiceAnterior(),this.tipoiceLogic.getTipoIces());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoiceAnterior(),this.tipoices);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoIce();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoIce(TipoIce tipoice,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
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
										
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoice,new Object(),generalEntityParameterGeneral,this.tipoiceReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoiceSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoIceConstantesFunciones.getClassesRelationshipsOfTipoIce(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoIceConstantesFunciones.getClassesRelationshipsFromStringsOfTipoIce(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoIce(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoIceBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoice,new Object(),generalEntityParameterGeneral,this.tipoiceReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoIce(TipoIceBean tipoiceBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoIce(ArrayList<Classe> classes,TipoIceReturnGeneral tipoiceReturnGeneral,TipoIceBean tipoiceBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoIce(TipoIce tipoice,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoice)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoIce = new TipoIceDetalleFormJInternalFrame(jDesktopPane,this.tipoiceSessionBean.getConGuardarRelaciones(),this.tipoiceSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIce);
		this.jInternalFrameDetalleFormTipoIce.setVisible(false);
		this.jInternalFrameDetalleFormTipoIce.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoIce.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoIce.tipoiceLogic=this.tipoiceLogic;
		
		this.cargarCombosFrameForeignKeyTipoIce("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIce();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIce();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoIce("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoIce();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoIce.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIce"));
		
		this.jInternalFrameDetalleFormTipoIce.jButtonModificarTipoIce.addActionListener(new ButtonActionListener(this,"ModificarTipoIce"));

		
		this.jInternalFrameDetalleFormTipoIce.jButtonModificarToolBarTipoIce.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIce"));
					
		this.jInternalFrameDetalleFormTipoIce.jMenuItemModificarTipoIce.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIce"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonActualizarTipoIce.addActionListener (new ButtonActionListener(this,"ActualizarTipoIce"));
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonActualizarToolBarTipoIce.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIce"));
						
		this.jInternalFrameDetalleFormTipoIce.jMenuItemActualizarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIce"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonEliminarTipoIce.addActionListener (new ButtonActionListener(this,"EliminarTipoIce"));
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonEliminarToolBarTipoIce.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIce"));
								
		this.jInternalFrameDetalleFormTipoIce.jMenuItemEliminarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIce"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonCancelarTipoIce.addActionListener (new ButtonActionListener(this,"CancelarTipoIce"));
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonCancelarToolBarTipoIce.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIce"));
					
		this.jInternalFrameDetalleFormTipoIce.jMenuItemCancelarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIce"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoIce.jMenuItemDetalleCerrarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIce"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosToolBarTipoIce.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIce"));
		
		
		
		this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosToolBarTipoIce.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIce"));
		
		
		
		this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIce"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonidTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIceBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonnombreTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIceBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonporcentajeTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoIceBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIce"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoIce"));
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIce"));
		}
		
		this.jTableDatosTipoIce.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoIce"));
		
		this.jTableDatosTipoIce.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoIce"));
		
		this.jButtonNuevoTipoIce.addActionListener(new ButtonActionListener(this,"NuevoTipoIce"));
		
		this.jButtonDuplicarTipoIce.addActionListener(new ButtonActionListener(this,"DuplicarTipoIce"));
		
		this.jButtonCopiarTipoIce.addActionListener(new ButtonActionListener(this,"CopiarTipoIce"));
		
		this.jButtonVerFormTipoIce.addActionListener(new ButtonActionListener(this,"VerFormTipoIce"));
		
		
		this.jButtonNuevoToolBarTipoIce.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoIce"));
			
		this.jButtonDuplicarToolBarTipoIce.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoIce"));
			
		this.jMenuItemNuevoTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoIce"));
			
		this.jMenuItemDuplicarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoIce"));		
		
		
		this.jButtonNuevoRelacionesTipoIce.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoIce"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoIce.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoIce"));
			
		this.jMenuItemNuevoRelacionesTipoIce.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoIce"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonModificarTipoIce.addActionListener(new ButtonActionListener(this,"ModificarTipoIce"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonModificarToolBarTipoIce.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIce"));
			
			this.jInternalFrameDetalleFormTipoIce.jMenuItemModificarTipoIce.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIce"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoIce.jButtonActualizarTipoIce.addActionListener (new ButtonActionListener(this,"ActualizarTipoIce"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonActualizarToolBarTipoIce.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIce"));
				
			this.jInternalFrameDetalleFormTipoIce.jMenuItemActualizarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIce"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonEliminarTipoIce.addActionListener (new ButtonActionListener(this,"EliminarTipoIce"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonEliminarToolBarTipoIce.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIce"));
						
			this.jInternalFrameDetalleFormTipoIce.jMenuItemEliminarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIce"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonCancelarTipoIce.addActionListener (new ButtonActionListener(this,"CancelarTipoIce"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonCancelarToolBarTipoIce.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIce"));
			
			this.jInternalFrameDetalleFormTipoIce.jMenuItemCancelarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIce"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoIce.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoIce"));		
		
		
		this.jButtonCerrarTipoIce.addActionListener (new ButtonActionListener(this,"CerrarTipoIce"));
		
		
		this.jButtonCerrarToolBarTipoIce.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoIce"));
			
		this.jMenuItemCerrarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoIce"));
			
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jMenuItemDetalleCerrarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIce"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoIce"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosToolBarTipoIce.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIce"));
		}
		
		this.jButtonCopiarToolBarTipoIce.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoIce"));
			
		this.jButtonVerFormToolBarTipoIce.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoIce"));
		
		this.jMenuItemGuardarCambiosTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoIce"));
			
		this.jMenuItemCopiarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoIce"));		
		
		this.jMenuItemVerFormTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoIce"));		
		
		
		this.jButtonGuardarCambiosTablaTipoIce.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIce"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIce.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoIce"));
			
		this.jMenuItemGuardarCambiosTablaTipoIce.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIce"));		
		
		
		
		this.jButtonRecargarInformacionTipoIce.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoIce"));
					
		this.jButtonRecargarInformacionToolBarTipoIce.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoIce"));
		
		this.jMenuItemRecargarInformacionTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoIce"));		
		
		
		
		this.jButtonAnterioresTipoIce.addActionListener (new ButtonActionListener(this,"AnterioresTipoIce"));
		
		
		this.jButtonAnterioresToolBarTipoIce.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoIce"));
		
		this.jMenuItemAnterioresTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoIce"));		
		
		
		this.jButtonSiguientesTipoIce.addActionListener (new ButtonActionListener(this,"SiguientesTipoIce"));
		
		
		this.jButtonSiguientesToolBarTipoIce.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoIce"));
			
		this.jMenuItemSiguientesTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoIce"));
			
		this.jMenuItemAbrirOrderByTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoIce"));
			
		this.jMenuItemMostrarOcultarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoIce"));
			
		this.jMenuItemDetalleAbrirOrderByTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoIce"));
			
		this.jMenuItemDetalleMostarOcultarTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoIce"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoIce.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoIce"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIce.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoIce"));
			
		this.jMenuItemNuevoGuardarCambiosTipoIce.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoIce"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoIce.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoIce"));

		this.jCheckBoxSeleccionadosTipoIce.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoIce"));
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIce"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoIce.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoIce"));
			
		this.jComboBoxTiposAccionesTipoIce.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoIce"));
					
		this.jComboBoxTiposSeleccionarTipoIce.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoIce"));
			
		this.jTextFieldValorCampoGeneralTipoIce.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoIce"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonidTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIceBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonnombreTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIceBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonporcentajeTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoIceBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoIce.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoIce"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoIce!=null) {
				this.jInternalFrameReporteDinamicoTipoIce.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIce"));
				this.jInternalFrameReporteDinamicoTipoIce.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIce"));
				this.jInternalFrameReporteDinamicoTipoIce.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIce"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoIce.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIce"));				
			//this.jButtonGenerarReporteDinamicoTipoIce.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIce"));
			//this.jButtonGenerarExcelReporteDinamicoTipoIce.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIce"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoIce!=null) {
				this.jInternalFrameImportacionTipoIce.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIce"));
				this.jInternalFrameImportacionTipoIce.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIce"));
				this.jInternalFrameImportacionTipoIce.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIce"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoIce.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoIce"));
			
			this.jButtonAbrirOrderByToolBarTipoIce.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoIce"));			
			
			if(this.jInternalFrameOrderByTipoIce!=null) {
				this.jInternalFrameOrderByTipoIce.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIce"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoIce!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIce.jTabbedPaneRelacionesTipoIce.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIce"));
		
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
            		closingInternalFrameTipoIce();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoIce.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoIce = (JInternalFrameBase)event.getSource();
	            	
	            TipoIceBeanSwingJInternalFrame jInternalFrameParent=(TipoIceBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIce.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoIceActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoIce.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoIceListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoIce.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoIce.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIceActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIceActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIceActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoIce";
		inputMap = this.jButtonNuevoTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIceActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIceActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIceActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIceActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoIce";
		inputMap = this.jButtonNuevoRelacionesTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIceActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoIce";
		inputMap = this.jButtonModificarTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoIceActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoIce";
		inputMap = this.jButtonActualizarTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoIceActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoIce";
		inputMap = this.jButtonEliminarTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoIceActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoIce";
		inputMap = this.jButtonCancelarTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoIceActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoIce";
		inputMap = this.jButtonCerrarTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoIceActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoIce";
		inputMap = this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoIce.jButtonGuardarCambiosTipoIce.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoIceActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoIce.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoIceItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoIce.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoIceActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoIce.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoIceActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoIce.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoIceActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonidTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIceBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonnombreTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIceBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIce.jButtonporcentajeTipoIceBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTipoIceBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoIce.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoIce"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoIce.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoIceActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoIceActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoIce.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoIce(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
					tipoiceAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIce tipoiceAux:tipoices) {
					tipoiceAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoIceItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIce(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
						tipoiceAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIce tipoiceAux:tipoices) {
						tipoiceAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIce tipoiceAux:tipoices) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIce(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIce.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIce.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIce,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoIceItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIce(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoIce.getSelectedRows();
			
			TipoIce tipoiceLocal=new TipoIce();
			
			//this.seleccionarTodosTipoIce(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoiceLocal =(TipoIce) this.tipoiceLogic.getTipoIces().toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoiceLocal =(TipoIce) this.tipoices.toArray()[this.jTableDatosTipoIce.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoiceLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
						tipoiceAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIce tipoiceAux:tipoices) {
						tipoiceAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoIce(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIce.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIce.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIce,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoIceItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoIceParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoIceActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoIce(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoIce.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIce tipoiceAux:this.tipoiceLogic.getTipoIces()) {
				
						if(sTipoSeleccionar.equals(TipoIceConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoiceAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIceConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tipoiceAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIce tipoiceAux:tipoices) {
					
						if(sTipoSeleccionar.equals(TipoIceConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoiceAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIceConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tipoiceAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIce(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoIceActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoIce(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoIce=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoIce.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoIce) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoIce(conSplash);
				
					this.generarReporteTipoIcesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoIcesSeleccionados();
				//this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIcesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIcesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIce();
				
				this.exportarTipoIcesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoIces();
				//this.importarTipoIces();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIce();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoIcesSeleccionados();
				//this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Ice", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoIce();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoIce)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoIce(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIce.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIce.jComboBoxTiposAccionesFormularioTipoIce.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoIce();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoIce(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoIceActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoIce();
			
			if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
			TipoIce tipoice=new TipoIce();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoIce(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoIce.getSelectedItem();
			
			
			
			
			tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoicesSeleccionados.size()==1) {
				for(TipoIce tipoiceAux:tipoicesSeleccionados) {
					tipoice=tipoiceAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoIce();
			
      		//this.finishProcessTipoIce(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoIceReturnGeneral() throws Exception {
		if(this.tipoiceReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoiceReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoiceReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoiceReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoiceReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoiceReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoIce(false);
		}
		
		if(this.tipoiceReturnGeneral.getConRetornoLista() || this.tipoiceReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoiceReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoiceLogic.setTipoIces(this.tipoiceReturnGeneral.getTipoIces());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoiceReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoiceLogic.setTipoIce(this.tipoiceReturnGeneral.getTipoIce());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoIce(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoIce() throws Exception {
		
		
	}
	
	public ArrayList<TipoIce> getTipoIcesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoIce) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoIce tipoiceAux:tipoiceLogic.getTipoIces()) {
					if(tipoiceAux.getIsSelected()) {
						tipoicesSeleccionados.add(tipoiceAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIce tipoiceAux:this.tipoices) {
					if(tipoiceAux.getIsSelected()) {
						tipoicesSeleccionados.add(tipoiceAux);				
					}
				}
			}
			
			if(tipoicesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoicesSeleccionados.addAll(this.tipoiceLogic.getTipoIces());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoicesSeleccionados.addAll(this.tipoices);				
					}
				}
			}
		} else {
			tipoicesSeleccionados.add(this.tipoice);
		}
		
		return tipoicesSeleccionados;
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
	
	public void generarReporteTipoIcesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoIcesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoIcesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIcesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIcesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Ice",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoIcesSeleccionados() throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoIces("Todos",tipoicesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoIcesSeleccionados() throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoIces("Todos",tipoicesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoIcesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoIces("Todos",tipoicesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoIcesSeleccionados() throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoIce();
		
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoIce();
		
		
		//this.generarReporteTipoIces("Todos",tipoicesSeleccionados ,tipoiceImplementable,tipoiceImplementableHome);
	}
	
	public void mostrarImportacionTipoIces() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoIce();
		
		this.abrirFrameImportacionTipoIce();		
		
			
		//this.generarReporteTipoIces("Todos",tipoicesSeleccionados ,tipoiceImplementable,tipoiceImplementableHome);
	}
	
	public void importarTipoIces() throws Exception {		
	
	}
	
	public void exportarTipoIcesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoIcesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoIcesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoIcesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Ice",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoIcesSeleccionados() throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoice."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoIce(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoIce tipoiceAux:tipoicesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoIce(tipoiceAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoiceAux.setsDetalleGeneralEntityReporte(tipoiceAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoIce(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoIceConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIceConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIceConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIceConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoIce(TipoIce tipoice,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoice.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoice.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoice.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoice.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoIcesSeleccionados() throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoice.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoIces");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoIce(row);				
				iRow++;
			}				
			
			for(TipoIce tipoiceAux:tipoicesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoIce(tipoiceAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoIcesSeleccionados() throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();		
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoice.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoices");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoice");
			//elementRoot.appendChild(element);
		
			for(TipoIce tipoiceAux:tipoicesSeleccionados) {
				element = document.createElement("tipoice");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoIce(tipoiceAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Ice",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoIce(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIceConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIceConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoIceConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIceConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoIce(TipoIce tipoice,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoice.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoice.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoice.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlTipoIce(TipoIce tipoice,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoIceConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoice.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoIceConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoice.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoIceConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoice.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementporcentaje = document.createElement(TipoIceConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(tipoice.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoTipoIcesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoIce> tipoicesSeleccionados=new ArrayList<TipoIce>();
		
		tipoicesSeleccionados=this.getTipoIcesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoIce(tipoicesSeleccionados);
		
		this.generarReporteTipoIces("Todos",tipoicesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoIce(ArrayList<TipoIce> tipoicesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoIce tipoiceAux:tipoicesSeleccionados) {
				tipoiceAux.setsDetalleGeneralEntityReporte(tipoiceAux.toString());
			
				if(sTipoSeleccionar.equals(TipoIceConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoiceAux.setsDescripcionGeneralEntityReporte1(tipoiceAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIceConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoIce(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoIce=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoIce=true;
				this.isVisibilidadCeldaGuardarCambiosTipoIce=true;
			}
			
			this.isVisibilidadCeldaModificarTipoIce=false;
			this.isVisibilidadCeldaActualizarTipoIce=false;
			this.isVisibilidadCeldaEliminarTipoIce=false;
			this.isVisibilidadCeldaCancelarTipoIce=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIce=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoIce=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=false;
			this.isVisibilidadCeldaModificarTipoIce=false;
			this.isVisibilidadCeldaActualizarTipoIce=true;
			this.isVisibilidadCeldaEliminarTipoIce=false;
			this.isVisibilidadCeldaCancelarTipoIce=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIce=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoIce=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=false;
			this.isVisibilidadCeldaModificarTipoIce=false;
			this.isVisibilidadCeldaActualizarTipoIce=true;
			this.isVisibilidadCeldaEliminarTipoIce=true;
			this.isVisibilidadCeldaCancelarTipoIce=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIce=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoIce=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=false;
			this.isVisibilidadCeldaModificarTipoIce=false;
			this.isVisibilidadCeldaActualizarTipoIce=true;
			this.isVisibilidadCeldaEliminarTipoIce=false;
			this.isVisibilidadCeldaCancelarTipoIce=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoIce=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=true;
			this.isVisibilidadCeldaModificarTipoIce=false;
			this.isVisibilidadCeldaActualizarTipoIce=false;
			this.isVisibilidadCeldaEliminarTipoIce=false;
			this.isVisibilidadCeldaCancelarTipoIce=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIce=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoIce=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=false;
			this.isVisibilidadCeldaActualizarTipoIce=false;
			this.isVisibilidadCeldaEliminarTipoIce=false;
			this.isVisibilidadCeldaCancelarTipoIce=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoIce=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=false;
			this.isVisibilidadCeldaModificarTipoIce=true;
			this.isVisibilidadCeldaActualizarTipoIce=false;
			this.isVisibilidadCeldaEliminarTipoIce=false;
			this.isVisibilidadCeldaCancelarTipoIce=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIce=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoIceJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoIce=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=true;
		} else {
			this.actualizarEstadoPanelsTipoIce(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoIce=false;
			//this.isVisibilidadCeldaVerFormTipoIce=false;
			this.isVisibilidadCeldaDuplicarTipoIce=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoiceSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoIce=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIce=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoiceSessionBean.getEsGuardarRelacionado()) {
			if(!tipoiceSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;												
			}
			
			this.jButtonCerrarTipoIce.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIce=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoice)) {
			this.isVisibilidadCeldaActualizarTipoIce=false;
			this.isVisibilidadCeldaEliminarTipoIce=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIce() {
	}
	
	public void actualizarEstadoPanelsTipoIce(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoIce!=null) {
				this.jScrollPanelDatosEdicionTipoIce.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIce!=null) {
				this.jScrollPanelDatosTipoIce.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIce!=null) {
				this.jPanelPaginacionTipoIce.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoIce!=null) {
				this.jScrollPanelDatosEdicionTipoIce.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoIce!=null) {
				this.jScrollPanelDatosTipoIce.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIce!=null) {
				this.jPanelPaginacionTipoIce.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoIce!=null) {
				this.jScrollPanelDatosEdicionTipoIce.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIce!=null) {
				this.jScrollPanelDatosTipoIce.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIce!=null) {
				this.jPanelPaginacionTipoIce.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoIce!=null) {
				this.jScrollPanelDatosEdicionTipoIce.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIce!=null) {
				this.jScrollPanelDatosTipoIce.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIce!=null) {
				this.jPanelPaginacionTipoIce.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoIce!=null) {
				this.jScrollPanelDatosEdicionTipoIce.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIce!=null) {
				this.jScrollPanelDatosTipoIce.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIce!=null) {
				this.jPanelPaginacionTipoIce.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoIce!=null) {
				this.jScrollPanelDatosEdicionTipoIce.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIce!=null) {
				this.jScrollPanelDatosTipoIce.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIce!=null) {
				this.jPanelPaginacionTipoIce.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoIce!=null) {
				this.jScrollPanelDatosEdicionTipoIce.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIce!=null) {
				this.jScrollPanelDatosTipoIce.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIce!=null) {
				this.jPanelPaginacionTipoIce.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoIce!=null) {
					this.jTabbedPaneBusquedasTipoIce.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoiceSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoIce!=null) {
				this.jTabbedPaneBusquedasTipoIce.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoIce!=null) {
				this.jPanelParametrosReportesTipoIce.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoIceSessionBean tipoiceSessionBean=new TipoIceSessionBean();
		
		if(this.tipoiceSessionBean==null) {
			this.tipoiceSessionBean=new TipoIceSessionBean();
		}
		
		this.tipoiceSessionBean.setsUltimaBusquedaTipoIce(this.getsAccionBusqueda());
		this.tipoiceSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoiceSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoiceSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoIceSessionBean tipoiceSessionBean=new TipoIceSessionBean();
		
		if(this.tipoiceSessionBean==null) {
			this.tipoiceSessionBean=new TipoIceSessionBean();
		}
		
		if(this.tipoiceSessionBean.getsUltimaBusquedaTipoIce()!=null&&!this.tipoiceSessionBean.getsUltimaBusquedaTipoIce().equals("")) {
			this.setsAccionBusqueda(tipoiceSessionBean.getsUltimaBusquedaTipoIce());
			this.setiNumeroPaginacion(tipoiceSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoiceSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoiceSessionBean.getnombre());
				tipoiceSessionBean.setnombre("");
			}
		}
		
		this.tipoiceSessionBean.setsUltimaBusquedaTipoIce("");
		this.tipoiceSessionBean.setiNumeroPaginacion(TipoIceConstantesFunciones.INUMEROPAGINACION);
		this.tipoiceSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoIce(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoIce() {
		this.updateBorderResaltarBusquedasFormularioTipoIce();
		this.updateVisibilidadBusquedasFormularioTipoIce();
		this.updateHabilitarBusquedasFormularioTipoIce();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoIce() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoIce.getComponents().length>0) {
	

		if(this.tipoiceConstantesFunciones.resaltarBusquedaPorNombreTipoIce!=null) {
			index= this.jTabbedPaneBusquedasTipoIce.indexOfComponent(this.jPanelBusquedaPorNombreTipoIce);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoIce.getComponent(index);
				jPanel.setBorder(this.tipoiceConstantesFunciones.resaltarBusquedaPorNombreTipoIce);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoIce() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoIce.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoIce.indexOfComponent(this.jPanelBusquedaPorNombreTipoIce);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoIce.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoiceConstantesFunciones.mostrarBusquedaPorNombreTipoIce);
			if(!this.tipoiceConstantesFunciones.mostrarBusquedaPorNombreTipoIce && index>-1) {
				this.jTabbedPaneBusquedasTipoIce.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoIce() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoIce.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoIce.indexOfComponent(this.jPanelBusquedaPorNombreTipoIce);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoIce.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoiceConstantesFunciones.activarBusquedaPorNombreTipoIce);
				this.jTabbedPaneBusquedasTipoIce.setEnabledAt(index,this.tipoiceConstantesFunciones.activarBusquedaPorNombreTipoIce);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoIce(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoIce.indexOfComponent(this.jPanelBusquedaPorNombreTipoIce);

			this.jTabbedPaneBusquedasTipoIce.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoIce.getComponent(index);

			this.tipoiceConstantesFunciones.setResaltarBusquedaPorNombreTipoIce(resaltar);

			jPanel.setBorder(this.tipoiceConstantesFunciones.resaltarBusquedaPorNombreTipoIce);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoIce.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoIce() throws Exception {

		if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoIce();
		this.updateVisibilidadResaltarControlesFormularioTipoIce();
		this.updateHabilitarResaltarControlesFormularioTipoIce();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoIce() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoiceConstantesFunciones.resaltaridTipoIce!=null && this.jInternalFrameDetalleFormTipoIce!=null) {this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.setBorder(this.tipoiceConstantesFunciones.resaltaridTipoIce);}
		if(this.tipoiceConstantesFunciones.resaltarnombreTipoIce!=null && this.jInternalFrameDetalleFormTipoIce!=null) {this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.setBorder(this.tipoiceConstantesFunciones.resaltarnombreTipoIce);}
		if(this.tipoiceConstantesFunciones.resaltarporcentajeTipoIce!=null && this.jInternalFrameDetalleFormTipoIce!=null) {this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.setBorder(this.tipoiceConstantesFunciones.resaltarporcentajeTipoIce);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoIce() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
	
		//this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.setVisible(this.tipoiceConstantesFunciones.mostraridTipoIce);
		this.jInternalFrameDetalleFormTipoIce.jPanelidTipoIce.setVisible(this.tipoiceConstantesFunciones.mostraridTipoIce);
		//this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.setVisible(this.tipoiceConstantesFunciones.mostrarnombreTipoIce);
		this.jInternalFrameDetalleFormTipoIce.jPanelnombreTipoIce.setVisible(this.tipoiceConstantesFunciones.mostrarnombreTipoIce);
		//this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.setVisible(this.tipoiceConstantesFunciones.mostrarporcentajeTipoIce);
		this.jInternalFrameDetalleFormTipoIce.jPanelporcentajeTipoIce.setVisible(this.tipoiceConstantesFunciones.mostrarporcentajeTipoIce);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoIce() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIce==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIce!=null) {
	
		this.jInternalFrameDetalleFormTipoIce.jTextFieldidTipoIce.setEnabled(this.tipoiceConstantesFunciones.activaridTipoIce);
		this.jInternalFrameDetalleFormTipoIce.jTextAreanombreTipoIce.setEnabled(this.tipoiceConstantesFunciones.activarnombreTipoIce);
		this.jInternalFrameDetalleFormTipoIce.jTextFieldporcentajeTipoIce.setEnabled(this.tipoiceConstantesFunciones.activarporcentajeTipoIce);
		}
	}
	
		
}