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

import com.bydan.erp.seguridad.util.TipoFuenteConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoFuenteParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoFuenteParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoFuenteBean;
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
public class TipoFuenteBeanSwingJInternalFrame extends TipoFuenteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFuenteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFuente> tipofuenteValidator = new ClassValidator<TipoFuente>(TipoFuente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFuente tipofuente;	
	public TipoFuente tipofuenteAux;
	public TipoFuente tipofuenteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFuente tipofuenteTotales;
	public Long idTipoFuenteActual;
	public Long iIdNuevoTipoFuente=0L;
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
	
	public Boolean isPermisoTodoTipoFuente;
	public Boolean isPermisoNuevoTipoFuente;
	public Boolean isPermisoActualizarTipoFuente;
	public Boolean isPermisoActualizarOriginalTipoFuente;
	public Boolean isPermisoEliminarTipoFuente;
	public Boolean isPermisoGuardarCambiosTipoFuente;
	public Boolean isPermisoConsultaTipoFuente;
	public Boolean isPermisoBusquedaTipoFuente;
	public Boolean isPermisoReporteTipoFuente;
	public Boolean isPermisoPaginacionMedioTipoFuente;
	public Boolean isPermisoPaginacionAltoTipoFuente;
	public Boolean isPermisoPaginacionTodoTipoFuente;
	public Boolean isPermisoCopiarTipoFuente;
	public Boolean isPermisoVerFormTipoFuente;
	public Boolean isPermisoDuplicarTipoFuente;
	public Boolean isPermisoOrdenTipoFuente;
	
	
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
	
	public TipoFuenteParameterReturnGeneral tipofuenteReturnGeneral;
	public TipoFuenteParameterReturnGeneral tipofuenteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFuente=false;
	public Boolean esParaAccionDesdeFormularioTipoFuente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFuenteLogic tipofuenteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFuente tipofuenteBean;
	public TipoFuenteConstantesFunciones tipofuenteConstantesFunciones;
	//public TipoFuenteParameterReturnGeneral tipofuenteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoFuente> tipofuentes;	
	//public List<TipoFuente> tipofuentesEliminados;
	//public List<TipoFuente> tipofuentesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFuente=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFuente=true;
	public Boolean isVisibilidadCeldaCopiarTipoFuente=true;
	public Boolean isVisibilidadCeldaVerFormTipoFuente=true;
	public Boolean isVisibilidadCeldaOrdenTipoFuente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
	public Boolean isVisibilidadCeldaModificarTipoFuente=false;
	public Boolean isVisibilidadCeldaActualizarTipoFuente=false;
	public Boolean isVisibilidadCeldaEliminarTipoFuente=false;
	public Boolean isVisibilidadCeldaCancelarTipoFuente=false;
	public Boolean isVisibilidadCeldaGuardarTipoFuente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFuente=false;	
	
	
	
	public Long getiIdNuevoTipoFuente() {
		return this.iIdNuevoTipoFuente;
	}

	public void setiIdNuevoTipoFuente(Long iIdNuevoTipoFuente) {
		this.iIdNuevoTipoFuente = iIdNuevoTipoFuente;
	}
	
	public Long getidTipoFuenteActual() {
		return this.idTipoFuenteActual;
	}

	public void setidTipoFuenteActual(Long idTipoFuenteActual) {
		this.idTipoFuenteActual = idTipoFuenteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFuente gettipofuente() {
		return this.tipofuente;
	}

	public void settipofuente(TipoFuente tipofuente) {
		this.tipofuente = tipofuente;
	}
	
	public TipoFuente gettipofuenteAux() {
		return this.tipofuenteAux;
	}

	public void settipofuenteAux(TipoFuente tipofuenteAux) {
		this.tipofuenteAux = tipofuenteAux;
	}				
	
	public TipoFuente gettipofuenteAnterior() {
		return this.tipofuenteAnterior;
	}

	public void settipofuenteAnterior(TipoFuente tipofuenteAnterior) {
		this.tipofuenteAnterior = tipofuenteAnterior;
	}	
	
	public TipoFuente gettipofuenteTotales() {
		return this.tipofuenteTotales;
	}

	public void settipofuenteTotales(TipoFuente tipofuenteTotales) {
		this.tipofuenteTotales = tipofuenteTotales;
	}	
	
	public TipoFuente gettipofuenteBean() {
		return this.tipofuenteBean;
	}

	public void settipofuenteBean(TipoFuente tipofuenteBean) {
		this.tipofuenteBean = tipofuenteBean;
	}	
	
	public TipoFuenteParameterReturnGeneral gettipofuenteReturnGeneral() {
		return this.tipofuenteReturnGeneral;
	}

	public void settipofuenteReturnGeneral(TipoFuenteParameterReturnGeneral tipofuenteReturnGeneral) {
		this.tipofuenteReturnGeneral = tipofuenteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoFuenteLogic getTipoFuenteLogic()	{		
		return tipofuenteLogic;
	}

	public void setTipoFuenteLogic(TipoFuenteLogic tipofuenteLogic) {
		this.tipofuenteLogic = tipofuenteLogic;
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
	
	public Boolean getIsEsNuevoTipoFuente() {
		return isEsNuevoTipoFuente;
	}

	public void setIsEsNuevoTipoFuente(Boolean isEsNuevoTipoFuente) {
		this.isEsNuevoTipoFuente = isEsNuevoTipoFuente;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFuente() {
		return esParaAccionDesdeFormularioTipoFuente;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFuente(Boolean esParaAccionDesdeFormularioTipoFuente) {
		this.esParaAccionDesdeFormularioTipoFuente = esParaAccionDesdeFormularioTipoFuente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoFuente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFuenteConstantesFunciones.refrescarForeignKeysDescripcionesTipoFuente(this.tipofuenteLogic.getTipoFuentes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFuenteConstantesFunciones.refrescarForeignKeysDescripcionesTipoFuente(this.tipofuentes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipofuenteLogic.setTipoFuentes(this.tipofuentes);
			tipofuenteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFuenteParameterReturnGeneral getTipoFuenteParameterGeneral() {
		return this.tipofuenteParameterGeneral;
	}
	
	public void setTipoFuenteParameterGeneral(TipoFuenteParameterReturnGeneral tipofuenteParameterGeneral) {
		this.tipofuenteParameterGeneral = tipofuenteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFuente() {
		return isPermisoTodoTipoFuente;
	}

	public void setIsPermisoTodoTipoFuente(Boolean isPermisoTodoTipoFuente) {
		this.isPermisoTodoTipoFuente = isPermisoTodoTipoFuente;
	}

	public Boolean getIsPermisoNuevoTipoFuente() {
		return isPermisoNuevoTipoFuente;
	}

	public void setIsPermisoNuevoTipoFuente(Boolean isPermisoNuevoTipoFuente) {
		this.isPermisoNuevoTipoFuente = isPermisoNuevoTipoFuente;
	}

	public Boolean getIsPermisoActualizarTipoFuente() {
		return isPermisoActualizarTipoFuente;
	}

	public void setIsPermisoActualizarTipoFuente(Boolean isPermisoActualizarTipoFuente) {
		this.isPermisoActualizarTipoFuente = isPermisoActualizarTipoFuente;
	}

	public Boolean getIsPermisoEliminarTipoFuente() {
		return isPermisoEliminarTipoFuente;
	}

	public void setIsPermisoEliminarTipoFuente(Boolean isPermisoEliminarTipoFuente) {
		this.isPermisoEliminarTipoFuente = isPermisoEliminarTipoFuente;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFuente() {
		return isPermisoGuardarCambiosTipoFuente;
	}

	public void setIsPermisoGuardarCambiosTipoFuente(Boolean isPermisoGuardarCambiosTipoFuente) {
		this.isPermisoGuardarCambiosTipoFuente = isPermisoGuardarCambiosTipoFuente;
	}
	
	public Boolean getIsPermisoConsultaTipoFuente() {
		return isPermisoConsultaTipoFuente;
	}

	public void setIsPermisoConsultaTipoFuente(Boolean isPermisoConsultaTipoFuente) {
		this.isPermisoConsultaTipoFuente = isPermisoConsultaTipoFuente;
	}

	public Boolean getIsPermisoBusquedaTipoFuente() {
		return isPermisoBusquedaTipoFuente;
	}

	public void setIsPermisoBusquedaTipoFuente(Boolean isPermisoBusquedaTipoFuente) {
		this.isPermisoBusquedaTipoFuente = isPermisoBusquedaTipoFuente;
	}

	public Boolean getIsPermisoReporteTipoFuente() {
		return isPermisoReporteTipoFuente;
	}

	public void setIsPermisoReporteTipoFuente(Boolean isPermisoReporteTipoFuente) {
		this.isPermisoReporteTipoFuente = isPermisoReporteTipoFuente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFuente() {
		return isPermisoPaginacionMedioTipoFuente;
	}

	public void setIsPermisoPaginacionMedioTipoFuente(Boolean isPermisoPaginacionMedioTipoFuente) {
		this.isPermisoPaginacionMedioTipoFuente = isPermisoPaginacionMedioTipoFuente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFuente() {
		return isPermisoPaginacionTodoTipoFuente;
	}

	public void setIsPermisoPaginacionTodoTipoFuente(Boolean isPermisoPaginacionTodoTipoFuente) {
		this.isPermisoPaginacionTodoTipoFuente = isPermisoPaginacionTodoTipoFuente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFuente() {
		return isPermisoPaginacionAltoTipoFuente;
	}

	public void setIsPermisoPaginacionAltoTipoFuente(Boolean isPermisoPaginacionAltoTipoFuente) {
		this.isPermisoPaginacionAltoTipoFuente = isPermisoPaginacionAltoTipoFuente;
	}
	
	public Boolean getIsPermisoCopiarTipoFuente() {
		return isPermisoCopiarTipoFuente;
	}

	public void setIsPermisoCopiarTipoFuente(Boolean isPermisoCopiarTipoFuente) {
		this.isPermisoCopiarTipoFuente = isPermisoCopiarTipoFuente;
	}
	
	public Boolean getIsPermisoVerFormTipoFuente() {
		return isPermisoVerFormTipoFuente;
	}

	public void setIsPermisoVerFormTipoFuente(Boolean isPermisoVerFormTipoFuente) {
		this.isPermisoVerFormTipoFuente = isPermisoVerFormTipoFuente;
	}
	
	public Boolean getIsPermisoDuplicarTipoFuente() {
		return isPermisoDuplicarTipoFuente;
	}

	public void setIsPermisoDuplicarTipoFuente(Boolean isPermisoDuplicarTipoFuente) {
		this.isPermisoDuplicarTipoFuente = isPermisoDuplicarTipoFuente;
	}
	
	public Boolean getIsPermisoOrdenTipoFuente() {
		return isPermisoOrdenTipoFuente;
	}

	public void setIsPermisoOrdenTipoFuente(Boolean isPermisoOrdenTipoFuente) {
		this.isPermisoOrdenTipoFuente = isPermisoOrdenTipoFuente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFuente() {
		return isVisibilidadCeldaNuevoTipoFuente;
	}

	public void setIsVisibilidadCeldaNuevoTipoFuente(Boolean isVisibilidadCeldaNuevoTipoFuente) {
		this.isVisibilidadCeldaNuevoTipoFuente = isVisibilidadCeldaNuevoTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFuente() {
		return isVisibilidadCeldaDuplicarTipoFuente;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFuente(Boolean isVisibilidadCeldaDuplicarTipoFuente) {
		this.isVisibilidadCeldaDuplicarTipoFuente = isVisibilidadCeldaDuplicarTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFuente() {
		return isVisibilidadCeldaCopiarTipoFuente;
	}

	public void setIsVisibilidadCeldaCopiarTipoFuente(Boolean isVisibilidadCeldaCopiarTipoFuente) {
		this.isVisibilidadCeldaCopiarTipoFuente = isVisibilidadCeldaCopiarTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFuente() {
		return isVisibilidadCeldaVerFormTipoFuente;
	}

	public void setIsVisibilidadCeldaVerFormTipoFuente(Boolean isVisibilidadCeldaVerFormTipoFuente) {
		this.isVisibilidadCeldaVerFormTipoFuente = isVisibilidadCeldaVerFormTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFuente() {
		return isVisibilidadCeldaOrdenTipoFuente;
	}

	public void setIsVisibilidadCeldaOrdenTipoFuente(Boolean isVisibilidadCeldaOrdenTipoFuente) {
		this.isVisibilidadCeldaOrdenTipoFuente = isVisibilidadCeldaOrdenTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFuente() {
		return isVisibilidadCeldaNuevoRelacionesTipoFuente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFuente(Boolean isVisibilidadCeldaNuevoRelacionesTipoFuente) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFuente = isVisibilidadCeldaNuevoRelacionesTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFuente() {
		return isVisibilidadCeldaModificarTipoFuente;
	}

	public void setIsVisibilidadCeldaModificarTipoFuente(Boolean isVisibilidadCeldaModificarTipoFuente) {
		this.isVisibilidadCeldaModificarTipoFuente = isVisibilidadCeldaModificarTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFuente() {
		return isVisibilidadCeldaActualizarTipoFuente;
	}

	public void setIsVisibilidadCeldaActualizarTipoFuente(Boolean isVisibilidadCeldaActualizarTipoFuente) {
		this.isVisibilidadCeldaActualizarTipoFuente = isVisibilidadCeldaActualizarTipoFuente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFuente() {
		return isVisibilidadCeldaEliminarTipoFuente;
	}

	public void setIsVisibilidadCeldaEliminarTipoFuente(Boolean isVisibilidadCeldaEliminarTipoFuente) {
		this.isVisibilidadCeldaEliminarTipoFuente = isVisibilidadCeldaEliminarTipoFuente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFuente() {
		return isVisibilidadCeldaCancelarTipoFuente;
	}

	public void setIsVisibilidadCeldaCancelarTipoFuente(Boolean isVisibilidadCeldaCancelarTipoFuente) {
		this.isVisibilidadCeldaCancelarTipoFuente = isVisibilidadCeldaCancelarTipoFuente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFuente() {
		return isVisibilidadCeldaGuardarTipoFuente;
	}

	public void setIsVisibilidadCeldaGuardarTipoFuente(Boolean isVisibilidadCeldaGuardarTipoFuente) {
		this.isVisibilidadCeldaGuardarTipoFuente = isVisibilidadCeldaGuardarTipoFuente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFuente() {
		return isVisibilidadCeldaGuardarCambiosTipoFuente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFuente(Boolean isVisibilidadCeldaGuardarCambiosTipoFuente) {
		this.isVisibilidadCeldaGuardarCambiosTipoFuente = isVisibilidadCeldaGuardarCambiosTipoFuente;
	}
		
	public TipoFuenteSessionBean gettipofuenteSessionBean() {
		return this.tipofuenteSessionBean;
	}
	
	public void settipofuenteSessionBean(TipoFuenteSessionBean tipofuenteSessionBean) {
		this.tipofuenteSessionBean=tipofuenteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFuente(TipoFuente tipofuente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoFuente tipofuente,TipoFuente tipofuenteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFuente(tipofuente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipofuenteAux.setId(tipofuente.getId());
		tipofuenteAux.setVersionRow(tipofuente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFuente();
		
			int intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipofuenteValidator.getInvalidValues(this.tipofuente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipofuenteLogic.setDatosCliente(datosCliente);
			tipofuenteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipofuenteAux=new  TipoFuente();
				
				tipofuenteAux.setIsNew(true);
				tipofuenteAux.setIsChanged(true);
				
				tipofuenteAux.setTipoFuenteOriginal(this.tipofuente);
				
				tipofuenteAux.setId(this.tipofuente.getId());	
				tipofuenteAux.setVersionRow(this.tipofuente.getVersionRow());	
				tipofuenteAux.setcodigo(this.tipofuente.getcodigo());	
				tipofuenteAux.setnombre(this.tipofuente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofuenteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofuenteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipofuenteAux,tipofuenteLogic.getTipoFuentes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofuenteAux,tipofuentes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipofuenteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofuenteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofuenteLogic.saveTipoFuentes();//WithConnection
						//tipofuenteLogic.getSetVersionRowTipoFuentes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofuente,tipofuenteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipofuenteAux=new  TipoFuente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipofuenteSessionBean.getEsGuardarRelacionado() 
					|| (this.tipofuenteSessionBean.getEsGuardarRelacionado() && this.tipofuente.getId()>=0)) {
						
					tipofuenteAux.setIsNew(false);
				}
				
				tipofuenteAux.setIsDeleted(false);
			
				tipofuenteAux.setId(this.tipofuente.getId());	
				tipofuenteAux.setVersionRow(this.tipofuente.getVersionRow());	
				tipofuenteAux.setcodigo(this.tipofuente.getcodigo());	
				tipofuenteAux.setnombre(this.tipofuente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofuenteAux,tipofuenteLogic.getTipoFuentes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofuenteAux,tipofuentes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipofuenteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofuenteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofuenteLogic.saveTipoFuentes();//WithConnection
						//tipofuenteLogic.getSetVersionRowTipoFuentes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofuente,tipofuenteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipofuenteAux=new  TipoFuente();
				
				tipofuenteAux.setIsNew(false);
				tipofuenteAux.setIsChanged(false);
				
				tipofuenteAux.setIsDeleted(true);
				
				tipofuenteAux.setId(this.tipofuente.getId());	
				tipofuenteAux.setVersionRow(this.tipofuente.getVersionRow());	
				tipofuenteAux.setcodigo(this.tipofuente.getcodigo());	
				tipofuenteAux.setnombre(this.tipofuente.getnombre());	
				
				if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipofuenteAux.getId()>=0) {	
						this.tipofuentesEliminados.add(tipofuenteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipofuenteAux,tipofuenteLogic.getTipoFuentes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofuenteAux,tipofuentes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipofuenteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofuenteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofuenteLogic.saveTipoFuentes();//WithConnection
						//tipofuenteLogic.getSetVersionRowTipoFuentes();//WithConnection
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
					this.tipofuenteLogic.getTipoFuentes().addAll(this.tipofuentesEliminados);
					
					tipofuenteLogic.saveTipoFuentes();//WithConnection
					//tipofuenteLogic.getSetVersionRowTipoFuentes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipofuentesEliminados= new ArrayList<TipoFuente>();		
			}
			
			if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Fuente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipofuente=tipofuenteAux;
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
      		//this.finishProcessTipoFuente();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFuente tipofuenteLocal) throws Exception {
		
		if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFuente tipofuenteLocal) throws Exception {	
		if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoFuenteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipofuenteValidator.getInvalidValues(this.tipofuente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFuente tipofuente,List<TipoFuente> tipofuentes) throws Exception {
		try	{		
			TipoFuenteConstantesFunciones.actualizarLista(tipofuente,tipofuentes,this.tipofuenteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFuente tipofuente,List<TipoFuente> tipofuentes) throws Exception {
		try	{			
			TipoFuenteConstantesFunciones.actualizarSelectedLista(tipofuente,tipofuentes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFuente> tipofuentesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipofuentesLocal=this.tipofuenteLogic.getTipoFuentes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipofuentesLocal=this.tipofuentes;
			}
			//ARCHITECTURE
		
			for(TipoFuente tipofuenteLocal:tipofuentesLocal) {
				if(this.permiteMantenimiento(tipofuenteLocal) && tipofuenteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFuenteConstantesFunciones.getTipoFuenteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFuenteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFuente.jLabelcodigoTipoFuente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFuenteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFuente.jLabelnombreTipoFuente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFuente.jLabelcodigoTipoFuente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFuente.jLabelnombreTipoFuente,"");
		
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
		this.iIdNuevoTipoFuente--;	
		
		
		this.tipofuenteAux=new TipoFuente();
		
		this.tipofuenteAux.setId(this.iIdNuevoTipoFuente);
		this.tipofuenteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofuenteLogic.getTipoFuentes().add(this.tipofuenteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipofuentes.add(this.tipofuenteAux);
		}
		//ARCHITECTURE
		
		this.tipofuente=this.tipofuenteAux;
		
		if(TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFuente(this.tipofuente);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFuente(this.tipofuente);
		}
				
		//this.setDefaultControlesTipoFuente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFuente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFuente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFuente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFuente(this.tipofuenteBean,this.tipofuente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFuenteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
			classes=TipoFuenteConstantesFunciones.getClassesRelationshipsOfTipoFuente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipofuenteReturnGeneral=tipofuenteLogic.procesarEventosTipoFuentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofuenteLogic.getTipoFuentes(),this.tipofuente,this.tipofuenteParameterGeneral,this.isEsNuevoTipoFuente,classes);//this.tipofuenteLogic.getTipoFuente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFuente(this.tipofuenteReturnGeneral,this.tipofuenteBean,false);
		
		if(this.tipofuenteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFuente(this.tipofuenteReturnGeneral.getTipoFuente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFuente(this.tipofuenteReturnGeneral.getTipoFuente());
		}
		
		if(this.tipofuenteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFuente(this.tipofuenteReturnGeneral.getTipoFuente(),classes);//this.tipofuenteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFuente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFuente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFuente(false);
						
			if(tipofuenteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFuente();
			}
			
			this.actualizarVisualTableDatosTipoFuente();
			
			this.jTableDatosTipoFuente.setRowSelectionInterval(this.getIndiceNuevoTipoFuente(), this.getIndiceNuevoTipoFuente());
			
			this.seleccionarFilaTablaTipoFuenteActual();
						
			this.actualizarEstadoCeldasBotonesTipoFuente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFuente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.setEnabled(isHabilitar && this.tipofuenteConstantesFunciones.activarcodigoTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.setEnabled(isHabilitar && this.tipofuenteConstantesFunciones.activarnombreTipoFuente);	
		
	};
	
	public void setDefaultControlesTipoFuente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFuente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipofuenteSessionBean.setConGuardarRelaciones(true);			
			this.tipofuenteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.setVisible(true);
			
					
		} else {
			//this.tipofuenteSessionBean.setConGuardarRelaciones(false);			
			this.tipofuenteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoFuente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
				if(tipofuenteAux.getId().equals(this.iIdNuevoTipoFuente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFuente tipofuenteAux:this.tipofuentes) {
				if(tipofuenteAux.getId().equals(this.iIdNuevoTipoFuente)) {
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
	
	public int getIndiceActualTipoFuente(TipoFuente tipofuente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
				if(tipofuenteAux.getId().equals(tipofuente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFuente tipofuenteAux:this.tipofuentes) {
				if(tipofuenteAux.getId().equals(tipofuente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFuente(TipoFuente tipofuenteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
				if(tipofuenteAux.getTipoFuenteOriginal().getId().equals(tipofuenteOriginal.getId())) {
					existe=true;
					tipofuenteOriginal.setId(tipofuenteAux.getId());
					tipofuenteOriginal.setVersionRow(tipofuenteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFuente tipofuenteAux:this.tipofuentes) {
				if(tipofuenteAux.getTipoFuenteOriginal().getId().equals(tipofuenteOriginal.getId())) {
					existe=true;
					tipofuenteOriginal.setId(tipofuenteAux.getId());
					tipofuenteOriginal.setVersionRow(tipofuenteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFuente(Boolean esParaCancelar) throws Exception {
		tipofuentesAux=new ArrayList<TipoFuente>();
		tipofuenteAux=new TipoFuente();
		
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
					if(tipofuenteAux.getId()<0) {
						tipofuentesAux.add(tipofuenteAux);
					}		
				}
				this.iIdNuevoTipoFuente=0L;
				this.tipofuenteLogic.getTipoFuentes().removeAll(tipofuentesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFuente tipofuenteAux:this.tipofuentes) {
					if(tipofuenteAux.getId()<0) {
						tipofuentesAux.add(tipofuenteAux);
					}		
				}
				this.iIdNuevoTipoFuente=0L;
				this.tipofuentes.removeAll(tipofuentesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFuente 
					&& this.tipofuenteLogic.getTipoFuentes().size()>0
					) {
					tipofuenteAux=this.tipofuenteLogic.getTipoFuentes().get(this.tipofuenteLogic.getTipoFuentes().size() - 1);
				
					if(tipofuenteAux.getId()<0) {
						this.tipofuenteLogic.getTipoFuentes().remove(tipofuenteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFuente && this.tipofuentes.size()>0) {
					tipofuenteAux=this.tipofuentes.get(this.tipofuentes.size() - 1);
				
					if(tipofuenteAux.getId()<0) {
						this.tipofuentes.remove(tipofuenteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFuente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipofuente.getId()<0) {
				this.tipofuenteLogic.getTipoFuentes().remove(this.tipofuente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipofuente.getId()<0) {
				this.tipofuentes.remove(this.tipofuente);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFuente(List<TipoFuente> tipofuentesAux) throws Exception {
		TipoFuenteConstantesFunciones.setEstadosInicialesTipoFuente(tipofuentesAux);
	}
	
	public void setEstadosInicialesTipoFuente(TipoFuente tipofuenteAux) throws Exception {
		TipoFuenteConstantesFunciones.setEstadosInicialesTipoFuente(tipofuenteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFuenteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFuente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFuenteActual()) {
				if(!this.isEsNuevoTipoFuente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFuente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFuente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFuenteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Fuente ?", "MANTENIMIENTO DE Tipo Fuente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFuente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFuente tipofuente) throws Exception {
		TipoFuenteConstantesFunciones.seleccionarAsignar(this.tipofuente,tipofuente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFuente=this.isPermisoActualizarOriginalTipoFuente;
			
			
			this.seleccionarAsignar(tipofuente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFuenteConstantesFunciones.quitarEspaciosTipoFuente(this.tipofuente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFuente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipofuenteSessionBean.setsFuncionBusquedaRapida(this.tipofuenteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFuente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFuente(esParaCancelar);				
				this.cancelarNuevoTipoFuente(esParaCancelar);								
			}
			
			this.tipofuente=new TipoFuente();
			
			this.inicializarTipoFuente();
			
			this.actualizarEstadoCeldasBotonesTipoFuente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFuente() throws Exception {
		try {
			TipoFuenteConstantesFunciones.inicializarTipoFuente(this.tipofuente);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipofuenteLogic.getTipoFuentes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFuentes(String sAccionBusqueda,List<TipoFuente> tipofuentesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFuente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFuenteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFuenteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFuente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Fuentes");		
		parameters.put("busquedapor", TipoFuenteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFuente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFuenteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFuenteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFuente=new JRBeanArrayDataSource(TipoFuenteJInternalFrame.TraerTipoFuenteBeans(tipofuentesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFuente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFuenteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFuenteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFuenteBean.TraerTipoFuenteBeans(tipofuentesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFuentes(sAccionBusqueda,sTipoArchivoReporte,tipofuentesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFuentes(sAccionBusqueda,sTipoArchivoReporte,tipofuentesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFuenteActionPerformed(null);
					//this.generarExcelReporteTipoFuentes(sAccionBusqueda,sTipoArchivoReporte,tipofuentesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFuentes(sAccionBusqueda,sTipoArchivoReporte,tipofuentesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFuentes(sAccionBusqueda,sTipoArchivoReporte,tipofuentesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFuentes(sAccionBusqueda,sTipoArchivoReporte,tipofuentesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFuentes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFuente> tipofuentesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofuente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFuentes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFuente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFuente tipofuente : tipofuentesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFuenteConstantesFunciones.generarExcelReporteDataTipoFuente("NORMAL",row,workbook,tipofuente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFuente(String sTipo,Row row,Workbook workbook) {
		
		TipoFuenteConstantesFunciones.generarExcelReporteHeaderTipoFuente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFuentes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFuente> tipofuentesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofuente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFuentes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFuente tipofuente : tipofuentesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFuenteConstantesFunciones.getTipoFuenteDescripcion(tipofuente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFuenteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofuente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFuenteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofuente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFuentes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFuente> tipofuentesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFuente> tipofuentesRespaldo=null;
		
		classes=TipoFuenteConstantesFunciones.getClassesRelationshipsOfTipoFuente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipofuenteLogic.setDatosCliente(this.datosCliente);
		this.tipofuenteLogic.setDatosDeep(this.datosDeep);
		this.tipofuenteLogic.setIsConDeep(true);
		
		tipofuentesRespaldo=this.tipofuenteLogic.getTipoFuentes();
		
		this.tipofuenteLogic.setTipoFuentes(tipofuentesParaReportes);	
		this.tipofuenteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipofuentesParaReportes=this.tipofuenteLogic.getTipoFuentes();
		this.tipofuenteLogic.setTipoFuentes(tipofuentesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofuente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFuentes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFuente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFuente tipofuente : tipofuentesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFuente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFuenteConstantesFunciones.generarExcelReporteDataTipoFuente("NORMAL",row,workbook,tipofuente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoFuenteConstantesFunciones.getTipoFuenteDescripcion(tipofuente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFuente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFuente() throws Exception {		
		this.startProcessTipoFuente(true);
	}
	
	public void startProcessTipoFuente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoFuente, this.jScrollPanelDatosTipoFuente,this.jPanelPaginacionTipoFuente, this.jScrollPanelDatosEdicionTipoFuente, this.jPanelAccionesTipoFuente,this.jPanelAccionesFormularioTipoFuente,this.jmenuBarTipoFuente,this.jmenuBarDetalleTipoFuente,this.jTtoolBarTipoFuente,this.jTtoolBarDetalleTipoFuente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFuente=null; 
		
		final JPanel jPanelParametrosReportesTipoFuente=this.jPanelParametrosReportesTipoFuente;
		//final JScrollPane jScrollPanelDatosTipoFuente=this.jScrollPanelDatosTipoFuente;
		final JTable jTableDatosTipoFuente=this.jTableDatosTipoFuente;		
		final JPanel jPanelPaginacionTipoFuente=this.jPanelPaginacionTipoFuente;
		//final JScrollPane jScrollPanelDatosEdicionTipoFuente=this.jScrollPanelDatosEdicionTipoFuente;
		final JPanel jPanelAccionesTipoFuente=this.jPanelAccionesTipoFuente;
		
		JPanel jPanelCamposAuxiliarTipoFuente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFuente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			jPanelCamposAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jPanelCamposTipoFuente;
			jPanelAccionesFormularioAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jPanelAccionesFormularioTipoFuente;
		}
		
		final JPanel jPanelCamposTipoFuente=jPanelCamposAuxiliarTipoFuente;
		final JPanel jPanelAccionesFormularioTipoFuente=jPanelAccionesFormularioAuxiliarTipoFuente;
		
		
		final JMenuBar jmenuBarTipoFuente=this.jmenuBarTipoFuente;
		final JToolBar jTtoolBarTipoFuente=this.jTtoolBarTipoFuente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFuente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFuente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			jmenuBarDetalleAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jmenuBarDetalleTipoFuente;
			jTtoolBarDetalleAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jTtoolBarDetalleTipoFuente;
		}
		
		final JMenuBar jmenuBarDetalleTipoFuente=jmenuBarDetalleAuxiliarTipoFuente;
		final JToolBar jTtoolBarDetalleTipoFuente=jTtoolBarDetalleAuxiliarTipoFuente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFuente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFuente;
			processRunnable.jTableDatos=jTableDatosTipoFuente;
			processRunnable.jPanelCampos=jPanelCamposTipoFuente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFuente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFuente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFuente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFuente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFuente;
			processRunnable.jTtoolBar=jTtoolBarTipoFuente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFuente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFuente ,jPanelParametrosReportesTipoFuente,jTableDatosTipoFuente, /*jScrollPanelDatosTipoFuente,*/jPanelCamposTipoFuente,jPanelPaginacionTipoFuente, /*jScrollPanelDatosEdicionTipoFuente,*/ jPanelAccionesTipoFuente,jPanelAccionesFormularioTipoFuente,jmenuBarTipoFuente,jmenuBarDetalleTipoFuente,jTtoolBarTipoFuente,jTtoolBarDetalleTipoFuente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoFuente, jScrollPanelDatosTipoFuente,jPanelPaginacionTipoFuente, jScrollPanelDatosEdicionTipoFuente, jPanelAccionesTipoFuente,jPanelAccionesFormularioTipoFuente,jmenuBarTipoFuente,jmenuBarDetalleTipoFuente,jTtoolBarTipoFuente,jTtoolBarDetalleTipoFuente);
						
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
	
	public void finishProcessTipoFuente() {// throws Exception 
		this.finishProcessTipoFuente(true);
	}
	
	public void finishProcessTipoFuente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoFuente, this.jScrollPanelDatosTipoFuente,this.jPanelPaginacionTipoFuente, this.jScrollPanelDatosEdicionTipoFuente, this.jPanelAccionesTipoFuente,this.jPanelAccionesFormularioTipoFuente,this.jmenuBarTipoFuente,this.jmenuBarDetalleTipoFuente,this.jTtoolBarTipoFuente,this.jTtoolBarDetalleTipoFuente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFuente=null; 
		
		final JPanel jPanelParametrosReportesTipoFuente=this.jPanelParametrosReportesTipoFuente;
		//final JScrollPane jScrollPanelDatosTipoFuente=this.jScrollPanelDatosTipoFuente;
		final JTable jTableDatosTipoFuente=this.jTableDatosTipoFuente;		
		final JPanel jPanelPaginacionTipoFuente=this.jPanelPaginacionTipoFuente;
		//final JScrollPane jScrollPanelDatosEdicionTipoFuente=this.jScrollPanelDatosEdicionTipoFuente;
		final JPanel jPanelAccionesTipoFuente=this.jPanelAccionesTipoFuente;
		
		JPanel jPanelCamposAuxiliarTipoFuente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFuente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			jPanelCamposAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jPanelCamposTipoFuente;
			jPanelAccionesFormularioAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jPanelAccionesFormularioTipoFuente;
		}
		
		final JPanel jPanelCamposTipoFuente=jPanelCamposAuxiliarTipoFuente;
		final JPanel jPanelAccionesFormularioTipoFuente=jPanelAccionesFormularioAuxiliarTipoFuente;
		
		
		final JMenuBar jmenuBarTipoFuente=this.jmenuBarTipoFuente;		
		final JToolBar jTtoolBarTipoFuente=this.jTtoolBarTipoFuente;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFuente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFuente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			jmenuBarDetalleAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jmenuBarDetalleTipoFuente;
			jTtoolBarDetalleAuxiliarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jTtoolBarDetalleTipoFuente;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFuente=jmenuBarDetalleAuxiliarTipoFuente;
		final JToolBar jTtoolBarDetalleTipoFuente=jTtoolBarDetalleAuxiliarTipoFuente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFuente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFuente;
			processRunnable.jTableDatos=jTableDatosTipoFuente;
			processRunnable.jPanelCampos=jPanelCamposTipoFuente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFuente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFuente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFuente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFuente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFuente;
			processRunnable.jTtoolBar=jTtoolBarTipoFuente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFuente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFuente ,jPanelParametrosReportesTipoFuente, jTableDatosTipoFuente,/*jScrollPanelDatosTipoFuente,*/jPanelCamposTipoFuente,jPanelPaginacionTipoFuente, /*jScrollPanelDatosEdicionTipoFuente,*/ jPanelAccionesTipoFuente,jPanelAccionesFormularioTipoFuente,jmenuBarTipoFuente,jmenuBarDetalleTipoFuente,jTtoolBarTipoFuente,jTtoolBarDetalleTipoFuente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFuente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFuente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFuente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFuente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFuente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFuente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFuente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFuente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFuente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipofuenteConstantesFunciones.getsFinalQueryTipoFuente();
		String  finalQueryPaginacionTodos=this.tipofuenteConstantesFunciones.getsFinalQueryTipoFuente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFuenteConstantesFunciones.getArrayColumnasGlobalesNoTipoFuente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFuenteConstantesFunciones.getArrayColumnasGlobalesTipoFuente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFuenteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipofuentesEliminados= new ArrayList<TipoFuente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFuente();
		
				///*TipoFuenteSessionBean*/this.tipofuenteSessionBean=new TipoFuenteSessionBean();
			
			if(this.tipofuenteSessionBean==null) {
				this.tipofuenteSessionBean=new TipoFuenteSessionBean();
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
					this.iNumeroPaginacion=TipoFuenteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFuenteConstantesFunciones.getClassesForeignKeysOfTipoFuente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipofuente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipofuentesAux= new ArrayList<TipoFuente>();
			
				
			tipofuenteLogic.setDatosCliente(this.datosCliente);
			tipofuenteLogic.setDatosDeep(this.datosDeep);
			tipofuenteLogic.setIsConDeep(true);
			
			
			tipofuenteLogic.getTipoFuenteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipofuenteLogic.getTodosTipoFuentes(finalQueryGlobal,pagination);
					
					//tipofuenteLogic.getTodosTipoFuentesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipofuenteLogic.getTipoFuentes()==null|| tipofuenteLogic.getTipoFuentes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofuentesAux= new ArrayList<TipoFuente>();
							tipofuentesAux.addAll(tipofuenteLogic.getTipoFuentes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofuentesAux= new ArrayList<TipoFuente>();
							tipofuentesAux.addAll(tipofuentes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofuenteLogic.getTodosTipoFuentes(finalQueryGlobal+"",this.pagination);												
							
							//tipofuenteLogic.getTodosTipoFuentesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFuentes("Todos",tipofuenteLogic.getTipoFuentes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofuenteLogic.setTipoFuentes(new ArrayList<TipoFuente>());					
							tipofuenteLogic.getTipoFuentes().addAll(tipofuentesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofuentes=new ArrayList<TipoFuente>();
							tipofuentes.addAll(tipofuentesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFuente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFuente=this.idActual;
				
				} else if(this.idTipoFuenteActual!=null && this.idTipoFuenteActual!=0L) {
					idTipoFuente=idTipoFuenteActual;
				}
				
					
				this.sDetalleReporte=TipoFuenteConstantesFunciones.getDetalleIndicePorId(idTipoFuente);
				
				this.tipofuentes=new ArrayList<TipoFuente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipofuenteLogic.getEntity(idTipoFuente);
					
					//tipofuenteLogic.getEntityWithConnection(idTipoFuente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofuenteLogic.setTipoFuentes(new ArrayList<TipoFuente>());
					tipofuenteLogic.getTipoFuentes().add(tipofuenteLogic.getTipoFuente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofuentes=new ArrayList<TipoFuente>();
					this.tipofuentes.add(tipofuente);
				}
				
				if(tipofuenteLogic.getTipoFuente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFuente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFuente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofuenteLogic.getTipoFuentes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofuentes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofuenteLogic.getTipoFuentes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofuentes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFuente tipofuente) {
		Boolean permite=true;
		
		if(this.tipofuente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFuenteConstantesFunciones.getOrderByListaTipoFuente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFuenteConstantesFunciones.getOrderByListaTipoFuente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFuente tipofuente:tipofuenteLogic.getTipoFuentes()) {
				if(tipofuente.getsType().equals(Constantes2.S_TOTALES)) {
					tipofuenteTotales=tipofuente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFuente tipofuente:this.tipofuentes) {
				if(tipofuente.getsType().equals(Constantes2.S_TOTALES)) {
					tipofuenteTotales=tipofuente;
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
			this.tipofuenteAux=new TipoFuente();
			this.tipofuenteAux.setsType(Constantes2.S_TOTALES);
			this.tipofuenteAux.setIsNew(false);
			this.tipofuenteAux.setIsChanged(false);
			this.tipofuenteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFuenteConstantesFunciones.TotalizarValoresFilaTipoFuente(this.tipofuenteLogic.getTipoFuentes(),this.tipofuenteAux);
				
				this.tipofuenteLogic.getTipoFuentes().add(this.tipofuenteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFuenteConstantesFunciones.TotalizarValoresFilaTipoFuente(this.tipofuentes,this.tipofuenteAux);
				
				this.tipofuentes.add(this.tipofuenteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipofuenteTotales=new TipoFuente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofuenteLogic.getTipoFuentes().remove(tipofuenteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofuentes.remove(tipofuenteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipofuenteTotales=new TipoFuente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFuente tipofuente:tipofuenteLogic.getTipoFuentes()) {
				if(tipofuente.getsType().equals(Constantes2.S_TOTALES)) {
					tipofuenteTotales=tipofuente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFuenteConstantesFunciones.TotalizarValoresFilaTipoFuente(this.tipofuenteLogic.getTipoFuentes(),tipofuenteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFuente tipofuente:this.tipofuentes) {
				if(tipofuente.getsType().equals(Constantes2.S_TOTALES)) {
					tipofuenteTotales=tipofuente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFuenteConstantesFunciones.TotalizarValoresFilaTipoFuente(this.tipofuentes,tipofuenteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoFuente() {
		this.isPermisoTodoTipoFuente=false;
		this.isPermisoNuevoTipoFuente=false;
		this.isPermisoActualizarTipoFuente=false;
		this.isPermisoActualizarOriginalTipoFuente=false;
		this.isPermisoEliminarTipoFuente=false;
		this.isPermisoGuardarCambiosTipoFuente=false;
		this.isPermisoConsultaTipoFuente=false;
		this.isPermisoBusquedaTipoFuente=false;
		this.isPermisoReporteTipoFuente=false;		
		this.isPermisoOrdenTipoFuente=false;		
		this.isPermisoPaginacionMedioTipoFuente=false;		
		this.isPermisoPaginacionAltoTipoFuente=false;
		this.isPermisoPaginacionTodoTipoFuente=false;
		this.isPermisoCopiarTipoFuente=false;		
		this.isPermisoVerFormTipoFuente=false;		
		this.isPermisoDuplicarTipoFuente=false;		
		this.isPermisoOrdenTipoFuente=false;		
	}
	
	public void setPermisosUsuarioTipoFuente(Boolean isPermiso) {
		this.isPermisoTodoTipoFuente=isPermiso;
		this.isPermisoNuevoTipoFuente=isPermiso;
		this.isPermisoActualizarTipoFuente=isPermiso;
		this.isPermisoActualizarOriginalTipoFuente=isPermiso;
		this.isPermisoEliminarTipoFuente=isPermiso;
		this.isPermisoGuardarCambiosTipoFuente=isPermiso;
		this.isPermisoConsultaTipoFuente=isPermiso;
		this.isPermisoBusquedaTipoFuente=isPermiso;
		this.isPermisoReporteTipoFuente=isPermiso;
		this.isPermisoOrdenTipoFuente=isPermiso;		
		this.isPermisoPaginacionMedioTipoFuente=isPermiso;		
		this.isPermisoPaginacionAltoTipoFuente=isPermiso;		
		this.isPermisoPaginacionTodoTipoFuente=isPermiso;		
		this.isPermisoCopiarTipoFuente=isPermiso;		
		this.isPermisoVerFormTipoFuente=isPermiso;		
		this.isPermisoDuplicarTipoFuente=isPermiso;
		this.isPermisoOrdenTipoFuente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFuente(Boolean isPermiso) {
		//this.isPermisoTodoTipoFuente=isPermiso;
		this.isPermisoNuevoTipoFuente=isPermiso;
		this.isPermisoActualizarTipoFuente=isPermiso;
		this.isPermisoActualizarOriginalTipoFuente=isPermiso;
		this.isPermisoEliminarTipoFuente=isPermiso;
		this.isPermisoGuardarCambiosTipoFuente=isPermiso;
		//this.isPermisoConsultaTipoFuente=isPermiso;
		//this.isPermisoBusquedaTipoFuente=isPermiso;
		//this.isPermisoReporteTipoFuente=isPermiso;
		//this.isPermisoOrdenTipoFuente=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFuente=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFuente=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFuente=isPermiso;		
		//this.isPermisoCopiarTipoFuente=isPermiso;		
		//this.isPermisoDuplicarTipoFuente=isPermiso;
		//this.isPermisoOrdenTipoFuente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFuenteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoFuenteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFuente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFuenteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFuenteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFuenteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFuenteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoFuente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFuenteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFuenteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFuente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFuente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFuente=this.isPermisoActualizarTipoFuente;
			this.isPermisoEliminarTipoFuente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFuente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFuente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFuente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFuente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFuente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFuente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFuente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFuente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFuente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFuente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFuente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFuente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFuente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFuente.setToolTipText(this.jTableDatosTipoFuente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFuente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFuente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFuenteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFuenteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFuente() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoFuenteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFuenteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFuenteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFuenteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoFuenteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFuente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoFuente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFuente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFuente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFuente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFuente(TipoFuente tipofuente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFuente(TipoFuente tipofuente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFuente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFuente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFuente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFuente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFuente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFuente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFuente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFuente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoFuenteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFuenteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFuenteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipofuenteSessionBean=new TipoFuenteSessionBean(); 
		this.tipofuenteConstantesFunciones=new TipoFuenteConstantesFunciones(); 
		this.tipofuenteBean=new TipoFuente();//(this.tipofuenteConstantesFunciones); 		
		this.tipofuenteReturnGeneral=new TipoFuenteParameterReturnGeneral(); 
		
		this.tipofuenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofuenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFuenteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFuenteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFuenteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFuente(true);
			
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
			
			this.tipofuenteConstantesFunciones=new TipoFuenteConstantesFunciones(); 
			this.tipofuenteBean=new TipoFuente();//this.tipofuenteConstantesFunciones); 			
			this.tipofuenteReturnGeneral=new TipoFuenteParameterReturnGeneral(); 
		
			TipoFuenteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Fuente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipofuente=new TipoFuente();
			this.tipofuentes = new ArrayList<TipoFuente>();
			this.tipofuentesAux = new ArrayList<TipoFuente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic=new TipoFuenteLogic();
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			//this.tipofuenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipofuenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFuente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFuente);	
					}
					
					if(this.jInternalFrameImportacionTipoFuente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFuente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFuente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFuente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFuente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFuente);
				this.jInternalFrameDetalleFormTipoFuente.setVisible(false);
				this.jInternalFrameDetalleFormTipoFuente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFuente);
					this.jInternalFrameReporteDinamicoTipoFuente.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFuente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFuente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFuente);
					this.jInternalFrameImportacionTipoFuente.setVisible(false);
					this.jInternalFrameImportacionTipoFuente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFuente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFuente);
					this.jInternalFrameOrderByTipoFuente.setVisible(false);
					this.jInternalFrameOrderByTipoFuente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFuenteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFuenteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipofuenteReturnGeneral=new TipoFuenteParameterReturnGeneral();
			
			this.tipofuenteParameterGeneral=new TipoFuenteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipofuenteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFuenteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFuenteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofuenteSessionBean.getEsGuardarRelacionado(),this.tipofuenteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFuenteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofuenteSessionBean.getEsGuardarRelacionado(),this.tipofuenteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFuente=false;
			this.isVisibilidadCeldaDuplicarTipoFuente=true;
			this.isVisibilidadCeldaCopiarTipoFuente=true;
			this.isVisibilidadCeldaVerFormTipoFuente=true;
			this.isVisibilidadCeldaOrdenTipoFuente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
			this.isVisibilidadCeldaModificarTipoFuente=false;
			this.isVisibilidadCeldaActualizarTipoFuente=false;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
			this.isVisibilidadCeldaCancelarTipoFuente=false;
			this.isVisibilidadCeldaGuardarTipoFuente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFuente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFuente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFuente(false);
			
			this.setPermisosUsuarioTipoFuente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofuenteSessionBean.getEsGuardarRelacionado() 
				|| (this.tipofuenteSessionBean.getEsGuardarRelacionado() && this.tipofuenteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFuenteClasesRelacionadas();
			}
			
			if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFuenteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFuente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFuente();
			}
			
			if(!this.isPermisoBusquedaTipoFuente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFuente,this.isPermisoPaginacionMedioTipoFuente,this.isPermisoPaginacionTodoTipoFuente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFuenteConstantesFunciones.getTiposSeleccionarTipoFuente());
				
				this.tiposColumnasSelect=TipoFuenteConstantesFunciones.getTiposSeleccionarTipoFuente(true);
				
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
			//if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFuente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoFuente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoFuente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFuente() ;
			
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
				tipofuenteImplementable= (TipoFuenteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFuenteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipofuenteImplementableHome= (TipoFuenteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFuenteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipofuentes= new ArrayList<TipoFuente>();
			this.tipofuentesEliminados= new ArrayList<TipoFuente>();
						
			this.isEsNuevoTipoFuente=false;
			this.esParaAccionDesdeFormularioTipoFuente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFuente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFuente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFuenteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFuente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFuente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFuente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFuente();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFuente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFuente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFuente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFuente")) {
				iIndex=this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFuente();	
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
	
	public void cargarCombosForeignKeyTipoFuente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFuente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFuente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFuenteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFuente();
		
		this.cargarCombosFrameForeignKeyTipoFuente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFuente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFuente();
		}
	}
	
	
	
	public void jButtonNuevoTipoFuenteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
			
			if(jTableDatosTipoFuente.getRowCount()>=1) {
				jTableDatosTipoFuente.removeRowSelectionInterval(0, jTableDatosTipoFuente.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFuente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFuente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFuente(true);			
			//this.tipofuente=new TipoFuente();
			//this.tipofuente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFuente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFuente() ;
			
			if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFuente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipofuente);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);				
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
			if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFuente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFuenteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFuente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFuente.getSelectedRows().length;			
			}
			
			tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFuente--;			
				//TipoFuente tipofuenteAux= new TipoFuente();			
				//tipofuenteAux.setId(this.iIdNuevoTipoFuente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFuente tipofuenteOrigen=new TipoFuente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFuente tipofuenteOrigen : tipofuentesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipofuenteOrigen =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofuenteOrigen =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFuente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipofuente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFuente(tipofuenteOrigen,this.tipofuente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofuenteLogic.getTipoFuentes().add(this.tipofuenteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofuentes.add(this.tipofuenteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFuente(false);
				
				this.jTableDatosTipoFuente.setRowSelectionInterval(this.getIndiceNuevoTipoFuente(), this.getIndiceNuevoTipoFuente());
				
				int iLastRow =  this.jTableDatosTipoFuente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFuente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFuente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFuente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();									
		
			TipoFuente tipofuenteOrigen=new TipoFuente();
			TipoFuente tipofuenteDestino=new TipoFuente();
				
			tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFuente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipofuentesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFuente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofuenteOrigen =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofuenteOrigen =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofuenteDestino =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofuenteDestino =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipofuenteOrigen =tipofuentesSeleccionados.get(0);
				tipofuenteDestino =tipofuentesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFuente(tipofuenteOrigen,tipofuenteDestino,true,false);
				
				tipofuenteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofuenteDestino,tipofuenteLogic.getTipoFuentes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofuenteDestino,tipofuentes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFuente(false);
				
				//this.jTableDatosTipoFuente.setRowSelectionInterval(this.getIndiceNuevoTipoFuente(), this.getIndiceNuevoTipoFuente());
				
				int iLastRow =  this.jTableDatosTipoFuente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFuente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFuente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFuente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFuente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFuente.isVisible();
			
			
			this.jPanelParametrosReportesTipoFuente.setVisible(!isVisible);
			this.jPanelPaginacionTipoFuente.setVisible(!isVisible);
			this.jPanelAccionesTipoFuente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFuente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFuente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFuente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFuente();
			
			this.abrirFrameOrderByTipoFuente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFuente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFuente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFuente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFuente.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFuente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFuente.setSize(this.jInternalFrameDetalleFormTipoFuente.iWidthFormulario,this.jInternalFrameDetalleFormTipoFuente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFuente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFuente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFuente.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFuente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFuente.jContentPaneDetalleTipoFuente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFuente.jContentPaneDetalleTipoFuente.getWidth(),TipoFuenteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFuente.jContentPaneDetalleTipoFuente.getWidth(),TipoFuenteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFuente.jContentPaneDetalleTipoFuente.getWidth(),TipoFuenteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFuente.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFuente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFuente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFuente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFuente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFuente,false,this);
				} else {
					this.jInternalFrameOrderByTipoFuente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFuente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFuente);
				this.jInternalFrameOrderByTipoFuente.setVisible(false);
				this.jInternalFrameOrderByTipoFuente.setSelected(false);
				
				this.jInternalFrameOrderByTipoFuente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFuente"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFuente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFuente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFuente==null) {
				
				this.jInternalFrameImportacionTipoFuente=new ImportacionJInternalFrame(TipoFuenteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFuente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFuente);
				this.jInternalFrameImportacionTipoFuente.setVisible(false);
				this.jInternalFrameImportacionTipoFuente.setSelected(false);


				this.jInternalFrameImportacionTipoFuente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFuente"));
				this.jInternalFrameImportacionTipoFuente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFuente"));
				this.jInternalFrameImportacionTipoFuente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFuente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFuente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFuente==null) {
				this.jInternalFrameReporteDinamicoTipoFuente=new ReporteDinamicoJInternalFrame(TipoFuenteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFuente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFuente);
				this.jInternalFrameReporteDinamicoTipoFuente.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFuente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFuente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFuente"));
				this.jInternalFrameReporteDinamicoTipoFuente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFuente"));
				this.jInternalFrameReporteDinamicoTipoFuente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFuente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFuente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoFuente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFuente);
			
	       	this.jInternalFrameDetalleFormTipoFuente.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFuente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFuente.dispose();
			//this.jInternalFrameDetalleFormTipoFuente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFuente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFuente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFuente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFuente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFuente.setVisible(true);
	        this.jInternalFrameImportacionTipoFuente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFuente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFuente.setVisible(true);
	        this.jInternalFrameOrderByTipoFuente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFuente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFuente.setVisible(false);
	        this.jInternalFrameOrderByTipoFuente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFuente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFuente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFuente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFuente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFuente.setVisible(false);
	        this.jInternalFrameImportacionTipoFuente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFuente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFuente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFuente(true);
			//this.isEsNuevoTipoFuente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFuente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFuente(false) ;
			
			if(tipofuenteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFuente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFuente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFuenteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFuente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFuente(true);
			//this.isEsNuevoTipoFuente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipofuente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFuente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFuente(false) ;
			
			if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFuente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFuente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFuente(false);
			
			//if(!this.isEsNuevoTipoFuente) {								
				int intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
				
			}
			
			if(this.permiteMantenimiento(this.tipofuente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFuente=true;
					this.inicializarActualizarBindingTablaTipoFuente(false);
					this.isEsNuevoTipoFuente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFuente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFuente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFuente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFuente(false);
				
				this.habilitarDeshabilitarControlesTipoFuente(false);
			
												
				
				if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFuente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFuenteActionPerformed(evt,tipofuenteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFuente(this.tipofuente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFuente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipofuenteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipofuente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFuenteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				this.tipofuente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				this.tipofuente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipofuente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFuenteModel) this.jTableDatosTipoFuente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFuente=true;
				this.inicializarActualizarBindingTablaTipoFuente(false);
				this.isEsNuevoTipoFuente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFuente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFuente(false);
				
				this.habilitarDeshabilitarControlesTipoFuente(false);
				
				
				
				if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFuente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFuenteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFuente.getRowCount()>=1) {
				jTableDatosTipoFuente.removeRowSelectionInterval(0, jTableDatosTipoFuente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFuente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFuente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFuente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFuente(false) ;
			
			this.isEsNuevoTipoFuente=false;
			
			if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFuente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFuente(false);
				
				//SI ES MANUAL
				if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFuente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFuente--;			
			//TipoFuente tipofuenteAux= new TipoFuente();			
			//tipofuenteAux.setId(this.iIdNuevoTipoFuente);
			
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFuente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
			
			this.tipofuente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipofuenteLogic.getTipoFuentes().add(this.tipofuenteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipofuentes.add(this.tipofuenteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFuente(false);
			
			this.jTableDatosTipoFuente.setRowSelectionInterval(this.getIndiceNuevoTipoFuente(), this.getIndiceNuevoTipoFuente());
			
			int iLastRow =  this.jTableDatosTipoFuente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFuente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFuente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFuente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFuente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFuente(false);
			
			//SI ES MANUAL
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFuente();
			}
			
			//this.abrirFrameTreeTipoFuente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo FuenteS ?", "MANTENIMIENTO DE Tipo Fuente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFuente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFuente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipofuenteReturnGeneral=tipofuenteLogic.procesarImportacionTipoFuentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipofuenteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFuenteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFuente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFuente.setFileImportacion(this.jInternalFrameImportacionTipoFuente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFuente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFuente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFuente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFuente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		

		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFuenteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFuenteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFuentes("Todos",tipofuentesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFuenteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFuenteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFuente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFuenteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoFuenteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFuenteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoFuenteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFuenteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoFuenteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFuenteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofuente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFuentes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFuenteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoFuente tipofuente:tipofuentesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofuente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFuenteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFuente tipofuente:tipofuentesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofuente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoFuente(row);				
			//	iRow++;
			//}				
			
			//for(TipoFuente tipofuenteAux:tipofuentesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFuente(tipofuenteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFuente(false);
			
			//SI ES MANUAL
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFuente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFuente(false);
			
			//SI ES MANUAL
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFuente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFuenteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFuente(false);
			
			//SI ES MANUAL
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFuente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofuenteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFuente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFuente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFuente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFuente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFuente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFuente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFuente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFuente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFuente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFuente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFuente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFuente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFuente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFuente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFuente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFuente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFuente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFuente();
		
		this.inicializarActualizarBindingBotonesManualTipoFuente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFuente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFuente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFuente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFuente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFuente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFuente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFuente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFuente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFuente.jCheckBoxPostAccionNuevoTipoFuente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFuente.jCheckBoxPostAccionSinCerrarTipoFuente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFuente.jCheckBoxPostAccionSinMensajeTipoFuente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFuente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFuente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFuente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFuente!=null) {
				this.jInternalFrameDetalleFormTipoFuente.jCheckBoxPostAccionNuevoTipoFuente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFuente.jCheckBoxPostAccionSinCerrarTipoFuente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFuente.jCheckBoxPostAccionSinMensajeTipoFuente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFuente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFuente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFuente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFuente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFuente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFuente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFuente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFuente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFuente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFuente(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFuente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFuente() throws Exception {
		try	{
			if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFuente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFuente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFuente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFuente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFuente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFuente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFuente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFuente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFuente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFuente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFuente.addItem(reporte);
			}
			
			
			if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFuente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFuente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFuente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFuente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFuente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFuente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFuente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFuente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFuente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFuente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFuente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
				this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
				this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFuente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFuente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFuente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFuente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFuente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFuente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFuente(Boolean esInicializar) throws Exception {				
		if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFuente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFuente() throws Exception {
		this.inicializarActualizarBindingTablaTipoFuente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFuente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFuentePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFuentePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFuenteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFuenteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFuentePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFuentePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFuente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipofuenteLogic.getTipoFuentes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipofuentes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFuente.setModel(new TipoFuenteModel(this.tipofuenteLogic.getTipoFuentes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFuente.setModel(new TipoFuenteModel(this.tipofuentes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFuente!=null && this.jInternalFrameOrderByTipoFuente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFuente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFuente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFuente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFuentePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO,tipofuenteConstantesFunciones.resaltarSeleccionarTipoFuente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO,tipofuenteConstantesFunciones.resaltarSeleccionarTipoFuente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFuente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFuente,TipoFuenteConstantesFunciones.LABEL_ID));

		if(this.tipofuenteConstantesFunciones.mostraridTipoFuente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFuenteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipofuenteConstantesFunciones.resaltaridTipoFuente,this.tipofuenteConstantesFunciones.activaridTipoFuente,this,true,"idTipoFuente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofuenteConstantesFunciones.resaltaridTipoFuente,this.tipofuenteConstantesFunciones.activaridTipoFuente,this,true,"idTipoFuente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFuente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFuente,TipoFuenteConstantesFunciones.LABEL_CODIGO));

		if(this.tipofuenteConstantesFunciones.mostrarcodigoTipoFuente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFuenteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofuenteConstantesFunciones.resaltarcodigoTipoFuente,this.tipofuenteConstantesFunciones.activarcodigoTipoFuente,this,true,"codigoTipoFuente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofuenteConstantesFunciones.resaltarcodigoTipoFuente,this.tipofuenteConstantesFunciones.activarcodigoTipoFuente,this,true,"codigoTipoFuente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFuentePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFuente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFuente,TipoFuenteConstantesFunciones.LABEL_NOMBRE));

		if(this.tipofuenteConstantesFunciones.mostrarnombreTipoFuente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFuenteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofuenteConstantesFunciones.resaltarnombreTipoFuente,this.tipofuenteConstantesFunciones.activarnombreTipoFuente,this,true,"nombreTipoFuente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofuenteConstantesFunciones.resaltarnombreTipoFuente,this.tipofuenteConstantesFunciones.activarnombreTipoFuente,this,true,"nombreTipoFuente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFuentePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofuenteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofuenteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFuente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofuenteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofuenteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFuente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFuente && this.isPermisoGuardarCambiosTipoFuente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipofuenteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipofuenteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFuente.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFuente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFuente && this.isPermisoGuardarCambiosTipoFuente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFuente && this.isPermisoGuardarCambiosTipoFuente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFuente.moveColumn(this.jTableDatosTipoFuente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFuente.moveColumn(this.jTableDatosTipoFuente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFuente.moveColumn(this.jTableDatosTipoFuente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFuente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFuente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFuente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFuente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFuente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFuente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFuente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFuente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipofuenteLogic.getTipoFuentes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipofuentes.size()-1;
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
		//this.jTableDatosTipoFuente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFuente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFuente();
			
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
				
				//this.isEsNuevoTipoFuente=false;
					
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
				if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFuente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFuente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFuente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipofuente.getsType().equals("DUPLICADO")
				   || this.tipofuente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFuente=true;
				
				} else {
					this.isEsNuevoTipoFuente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
					if(this.tipofuente.getId()>=0 && !this.tipofuente.getIsNew()) {						
						this.isEsNuevoTipoFuente=false;
						
					} else {
						this.isEsNuevoTipoFuente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFuente(esRelaciones);						
				
				this.seleccionarTipoFuente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipofuente.getId()<0) {
					this.isEsNuevoTipoFuente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFuente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFuente(evt,rowIndex);
				}	
				
				if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFuente: " + this.dDif); 
					}
				}								
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFuente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipofuente)) {
					if(this.tipofuente.getId()>0) {
						this.tipofuente.setIsDeleted(true);
						
						this.tipofuentesEliminados.add(this.tipofuente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofuenteLogic.getTipoFuentes().remove(this.tipofuente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofuentes.remove(this.tipofuente);				
					}
					
					
					((TipoFuenteModel) this.jTableDatosTipoFuente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFuente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFuente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFuente) {
			
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFuente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFuente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFuente(this.tipofuente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFuente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFuente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFuente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFuente(TipoFuente tipofuente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFuente(tipofuente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFuente(TipoFuente tipofuente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFuente(tipofuente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFuente(tipofuente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFuente(tipofuente);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFuente(TipoFuente tipofuente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.setText(tipofuente.getId().toString());
			this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.setText(tipofuente.getcodigo());
			this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.setText(tipofuente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFuente tipofuenteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipofuenteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFuente tipofuenteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipofuenteLocal=this.tipofuente;
			} else {
				tipofuenteLocal=this.tipofuenteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipofuenteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFuente(tipofuenteLocal,true);
					
					if(tipofuenteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipofuenteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipofuenteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFuente(TipoFuente tipofuente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFuente(tipofuente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(tipofuente);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFuente(TipoFuente tipofuente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFuente(tipofuente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFuente(TipoFuente tipofuente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.getText()==null || this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.getText()=="" || this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.setText("0");
			}

			if(conColumnasBase) {tipofuente.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFuenteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFuente.jLabelIdTipoFuente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofuente.setcodigo(this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFuenteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFuente.jLabelcodigoTipoFuente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofuente.setnombre(this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFuenteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFuente.jLabelnombreTipoFuente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFuente(TipoFuente tipofuenteBean,TipoFuente tipofuente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFuente(TipoFuente tipofuenteOrigen,TipoFuente tipofuente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofuenteOrigen.getId()!=null && !tipofuenteOrigen.getId().equals(0L))) {tipofuente.setId(tipofuenteOrigen.getId());}}
			if(conDefault || (!conDefault && tipofuenteOrigen.getcodigo()!=null && !tipofuenteOrigen.getcodigo().equals(""))) {tipofuente.setcodigo(tipofuenteOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipofuenteOrigen.getnombre()!=null && !tipofuenteOrigen.getnombre().equals(""))) {tipofuente.setnombre(tipofuenteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFuente(TipoFuente tipofuente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.setText(tipofuente.getId().toString());
			this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.setText(tipofuente.getcodigo());
			this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.setText(tipofuente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFuente(TipoFuenteBean tipofuenteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.setText(tipofuenteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.setText(tipofuenteBean.getcodigo());
			this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.setText(tipofuenteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFuente(TipoFuenteParameterReturnGeneral tipofuenteReturnGeneral,TipoFuenteBean tipofuenteBean,Boolean conDefault) throws Exception { 
		try {
			TipoFuente tipofuenteLocal=new TipoFuente();
			
			tipofuenteLocal=tipofuenteReturnGeneral.getTipoFuente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofuenteLocal.getId()!=null && !tipofuenteLocal.getId().equals(0L))) {tipofuenteBean.setId(tipofuenteLocal.getId());}}
			if(conDefault || (!conDefault && tipofuenteLocal.getcodigo()!=null && !tipofuenteLocal.getcodigo().equals(""))) {tipofuenteBean.setcodigo(tipofuenteLocal.getcodigo());}
			if(conDefault || (!conDefault && tipofuenteLocal.getnombre()!=null && !tipofuenteLocal.getnombre().equals(""))) {tipofuenteBean.setnombre(tipofuenteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFuenteGenerico(Long idTipoFuenteSeleccionado,JComboBox jComboBoxTipoFuente,List<TipoFuente> tipofuentesLocal)throws Exception {
		try {
			TipoFuente  tipofuenteTemp=null;

			for(TipoFuente tipofuenteAux:tipofuentesLocal) {
				if(tipofuenteAux.getId()!=null && tipofuenteAux.getId().equals(idTipoFuenteSeleccionado)) {
					tipofuenteTemp=tipofuenteAux;
					break;
				}
			}

			jComboBoxTipoFuente.setSelectedItem(tipofuenteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFuenteGenerico(JComboBox jComboBoxTipoFuente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFuente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFuente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFuente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFuente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFuente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFuente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFuente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFuente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFuente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFuente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofuente=(TipoFuente) tipofuenteLogic.getTipoFuentes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofuente =(TipoFuente) tipofuentes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFuente tipofuenteRow=new TipoFuente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofuenteRow=(TipoFuente) tipofuenteLogic.getTipoFuentes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofuenteRow=(TipoFuente) tipofuentes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFuente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFuente.setVisible((this.isVisibilidadCeldaNuevoTipoFuente && this.isPermisoNuevoTipoFuente));			
			this.jButtonDuplicarTipoFuente.setVisible((this.isVisibilidadCeldaDuplicarTipoFuente && this.isPermisoDuplicarTipoFuente));			
			this.jButtonCopiarTipoFuente.setVisible((this.isVisibilidadCeldaCopiarTipoFuente && this.isPermisoCopiarTipoFuente));
			this.jButtonVerFormTipoFuente.setVisible((this.isVisibilidadCeldaVerFormTipoFuente && this.isPermisoVerFormTipoFuente));
			
			this.jButtonAbrirOrderByTipoFuente.setVisible((this.isVisibilidadCeldaOrdenTipoFuente && this.isPermisoOrdenTipoFuente));			
			
			this.jButtonNuevoRelacionesTipoFuente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFuente && this.isPermisoNuevoTipoFuente));			
			this.jButtonNuevoGuardarCambiosTipoFuente.setVisible((this.isVisibilidadCeldaNuevoTipoFuente && this.isPermisoNuevoTipoFuente && this.isPermisoGuardarCambiosTipoFuente));
			
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonModificarTipoFuente.setVisible((this.isVisibilidadCeldaModificarTipoFuente && this.isPermisoActualizarTipoFuente));	
			this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarTipoFuente.setVisible((this.isVisibilidadCeldaActualizarTipoFuente && this.isPermisoActualizarTipoFuente));	
			this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarTipoFuente.setVisible((this.isVisibilidadCeldaEliminarTipoFuente && this.isPermisoEliminarTipoFuente));
			this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarTipoFuente.setVisible(this.isVisibilidadCeldaCancelarTipoFuente);							
			this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.setVisible((this.isVisibilidadCeldaGuardarTipoFuente && this.isPermisoGuardarCambiosTipoFuente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFuente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFuente && this.isPermisoGuardarCambiosTipoFuente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFuente.setVisible((this.isVisibilidadCeldaNuevoTipoFuente && this.isPermisoNuevoTipoFuente));						
			this.jButtonDuplicarToolBarTipoFuente.setVisible((this.isVisibilidadCeldaDuplicarTipoFuente && this.isPermisoDuplicarTipoFuente));						
			this.jButtonCopiarToolBarTipoFuente.setVisible((this.isVisibilidadCeldaCopiarTipoFuente && this.isPermisoCopiarTipoFuente));			
			this.jButtonVerFormToolBarTipoFuente.setVisible((this.isVisibilidadCeldaVerFormTipoFuente && this.isPermisoVerFormTipoFuente));			
			this.jButtonAbrirOrderByToolBarTipoFuente.setVisible((this.isVisibilidadCeldaOrdenTipoFuente && this.isPermisoOrdenTipoFuente));
			this.jButtonNuevoRelacionesToolBarTipoFuente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFuente && this.isPermisoNuevoTipoFuente));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFuente.setVisible((this.isVisibilidadCeldaNuevoTipoFuente && this.isPermisoNuevoTipoFuente && this.isPermisoGuardarCambiosTipoFuente));			
			
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonModificarToolBarTipoFuente.setVisible((this.isVisibilidadCeldaModificarTipoFuente && this.isPermisoActualizarTipoFuente));	
			this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarToolBarTipoFuente.setVisible((this.isVisibilidadCeldaActualizarTipoFuente  && this.isPermisoActualizarTipoFuente));	
			this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarToolBarTipoFuente.setVisible((this.isVisibilidadCeldaEliminarTipoFuente && this.isPermisoEliminarTipoFuente));
			this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarToolBarTipoFuente.setVisible(this.isVisibilidadCeldaCancelarTipoFuente);				
			this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosToolBarTipoFuente.setVisible((this.isVisibilidadCeldaGuardarTipoFuente && this.isPermisoGuardarCambiosTipoFuente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFuente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFuente && this.isPermisoGuardarCambiosTipoFuente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFuente.setVisible((this.isVisibilidadCeldaNuevoTipoFuente && this.isPermisoNuevoTipoFuente));			
			this.jMenuItemDuplicarTipoFuente.setVisible((this.isVisibilidadCeldaDuplicarTipoFuente && this.isPermisoDuplicarTipoFuente));			
			this.jMenuItemCopiarTipoFuente.setVisible((this.isVisibilidadCeldaCopiarTipoFuente && this.isPermisoCopiarTipoFuente));			
			this.jMenuItemVerFormTipoFuente.setVisible((this.isVisibilidadCeldaVerFormTipoFuente && this.isPermisoVerFormTipoFuente));			
			this.jMenuItemAbrirOrderByTipoFuente.setVisible((this.isVisibilidadCeldaOrdenTipoFuente && this.isPermisoOrdenTipoFuente));			
			//this.jMenuItemMostrarOcultarTipoFuente.setVisible((this.isVisibilidadCeldaOrdenTipoFuente && this.isPermisoOrdenTipoFuente));
			this.jMenuItemDetalleAbrirOrderByTipoFuente.setVisible((this.isVisibilidadCeldaOrdenTipoFuente && this.isPermisoOrdenTipoFuente));			
			//this.jMenuItemDetalleMostrarOcultarTipoFuente.setVisible((this.isVisibilidadCeldaOrdenTipoFuente && this.isPermisoOrdenTipoFuente));			
			this.jMenuItemNuevoRelacionesTipoFuente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFuente && this.isPermisoNuevoTipoFuente));			
			this.jMenuItemNuevoGuardarCambiosTipoFuente.setVisible((this.isVisibilidadCeldaNuevoTipoFuente && this.isPermisoNuevoTipoFuente && this.isPermisoGuardarCambiosTipoFuente));									
			
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemModificarTipoFuente.setVisible((this.isVisibilidadCeldaModificarTipoFuente && this.isPermisoActualizarTipoFuente));	
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemActualizarTipoFuente.setVisible((this.isVisibilidadCeldaActualizarTipoFuente && this.isPermisoActualizarTipoFuente));	
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemEliminarTipoFuente.setVisible((this.isVisibilidadCeldaEliminarTipoFuente && this.isPermisoEliminarTipoFuente));
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemCancelarTipoFuente.setVisible(this.isVisibilidadCeldaCancelarTipoFuente);				
			}
			
			this.jMenuItemGuardarCambiosTipoFuente.setVisible((this.isVisibilidadCeldaGuardarTipoFuente && this.isPermisoGuardarCambiosTipoFuente));						
			this.jMenuItemGuardarCambiosTablaTipoFuente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFuente && this.isPermisoGuardarCambiosTipoFuente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFuente=this.jButtonNuevoTipoFuente.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFuente=this.jButtonDuplicarTipoFuente.isVisible();
			this.isVisibilidadCeldaCopiarTipoFuente=this.jButtonCopiarTipoFuente.isVisible();
			this.isVisibilidadCeldaVerFormTipoFuente=this.jButtonVerFormTipoFuente.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFuente=this.jButtonAbrirOrderByTipoFuente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=this.jButtonNuevoRelacionesTipoFuente.isVisible();
			this.isVisibilidadCeldaModificarTipoFuente=this.jButtonModificarTipoFuente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.isVisibilidadCeldaActualizarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarTipoFuente.isVisible();
			this.isVisibilidadCeldaEliminarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarTipoFuente.isVisible();
			this.isVisibilidadCeldaCancelarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarTipoFuente.isVisible();
			this.isVisibilidadCeldaGuardarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=this.jButtonGuardarCambiosTablaTipoFuente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFuente=this.jButtonNuevoToolBarTipoFuente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=this.jButtonNuevoRelacionesToolBarTipoFuente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.isVisibilidadCeldaModificarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonModificarToolBarTipoFuente.isVisible();
			this.isVisibilidadCeldaActualizarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarToolBarTipoFuente.isVisible();
			this.isVisibilidadCeldaEliminarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarToolBarTipoFuente.isVisible();
			this.isVisibilidadCeldaCancelarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarToolBarTipoFuente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFuente=this.jButtonGuardarCambiosToolBarTipoFuente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=this.jButtonGuardarCambiosTablaToolBarTipoFuente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFuente=this.jMenuItemNuevoTipoFuente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=this.jMenuItemNuevoRelacionesTipoFuente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.isVisibilidadCeldaModificarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jMenuItemModificarTipoFuente.isVisible();
			this.isVisibilidadCeldaActualizarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jMenuItemActualizarTipoFuente.isVisible();
			this.isVisibilidadCeldaEliminarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jMenuItemEliminarTipoFuente.isVisible();
			this.isVisibilidadCeldaCancelarTipoFuente=this.jInternalFrameDetalleFormTipoFuente.jMenuItemCancelarTipoFuente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFuente=this.jMenuItemGuardarCambiosTipoFuente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=this.jMenuItemGuardarCambiosTablaTipoFuente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFuente(Boolean esInicializar) {
		if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
				//if(this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFuente();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFuente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFuente() {
		this.jButtonNuevoTipoFuente.setVisible(this.isPermisoNuevoTipoFuente);			
		this.jButtonDuplicarTipoFuente.setVisible(this.isPermisoDuplicarTipoFuente);			
		this.jButtonCopiarTipoFuente.setVisible(this.isPermisoCopiarTipoFuente);			
		this.jButtonVerFormTipoFuente.setVisible(this.isPermisoVerFormTipoFuente);			
		
		this.jButtonAbrirOrderByTipoFuente.setVisible(this.isPermisoOrdenTipoFuente);					
		
		this.jButtonNuevoRelacionesTipoFuente.setVisible(this.isPermisoNuevoTipoFuente);			
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonModificarTipoFuente.setVisible(this.isPermisoActualizarTipoFuente);	
			this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarTipoFuente.setVisible(this.isPermisoActualizarTipoFuente);	
			this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarTipoFuente.setVisible(this.isPermisoEliminarTipoFuente);
			this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarTipoFuente.setVisible(this.isVisibilidadCeldaCancelarTipoFuente);						
			this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.setVisible(this.isPermisoGuardarCambiosTipoFuente);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFuente.setVisible(this.isPermisoActualizarTipoFuente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFuente() {
		this.jInternalFrameDetalleFormTipoFuente.jButtonModificarTipoFuente.setVisible(this.isPermisoActualizarTipoFuente);	
		this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarTipoFuente.setVisible(this.isPermisoActualizarTipoFuente);	
		this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarTipoFuente.setVisible(this.isPermisoEliminarTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarTipoFuente.setVisible(this.isVisibilidadCeldaCancelarTipoFuente);							
		this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.setVisible((this.isVisibilidadCeldaGuardarTipoFuente && this.isPermisoGuardarCambiosTipoFuente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFuente() {
		if(TipoFuenteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFuente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFuente() {
	}
	
	public void jTableDatosTipoFuenteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFuente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFuenteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFuente(this.gettipofuente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofuente==null) {
						this.tipofuente = new TipoFuente();
					}

					this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
				}

				if(this.tipofuente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipofuente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFuente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoFuenteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFuente(this.gettipofuente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofuente==null) {
						this.tipofuente = new TipoFuente();
					}

					this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
				}

				if(this.tipofuente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipofuente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFuente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFuenteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFuente(this.gettipofuente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofuente==null) {
						this.tipofuente = new TipoFuente();
					}

					this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);
				}

				if(this.tipofuente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipofuente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFuente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoFuente() {
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
			this.jInternalFrameDetalleFormTipoFuente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFuente.dispose();
			this.jInternalFrameDetalleFormTipoFuente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
			this.jInternalFrameReporteDinamicoTipoFuente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFuente.dispose();
			this.jInternalFrameReporteDinamicoTipoFuente=null;
		}
		
		if(this.jInternalFrameImportacionTipoFuente!=null) {
			this.jInternalFrameImportacionTipoFuente.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFuente.dispose();
			this.jInternalFrameImportacionTipoFuente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFuente();
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFuente")) {
				jButtonDuplicarTipoFuenteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFuente")) {
				jButtonCopiarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFuente")) {
				jButtonVerFormTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFuente")) {
				jButtonDuplicarTipoFuenteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFuente")) {
				jButtonDuplicarTipoFuenteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFuente")) {
				jButtonModificarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFuente")) {
				jButtonModificarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFuente")) {
				jButtonModificarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFuente")) {
				jButtonActualizarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFuente")) {
				jButtonActualizarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFuente")) {
				jButtonActualizarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFuente")) {
				jButtonEliminarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFuente")) {
				jButtonEliminarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFuente")) {
				jButtonEliminarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFuente")) {
				jButtonCancelarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFuente")) {
				jButtonCancelarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFuente")) {
				jButtonCancelarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFuente")) {
				jButtonCerrarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFuente")) {
				jButtonCerrarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFuente")) {
				jButtonCerrarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFuente")) {
				jButtonMostrarOcultarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFuente")) {
				jButtonCancelarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFuente")) {
				jButtonCopiarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFuente")) {
				jButtonVerFormTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFuente")) {
				jButtonCopiarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFuente")) {
				jButtonVerFormTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFuente")) {
				jButtonRecargarInformacionTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFuente")) {
				jButtonRecargarInformacionTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFuente")) {
				jButtonRecargarInformacionTipoFuenteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFuente")) {
				jButtonAnterioresTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFuente")) {
				jButtonAnterioresTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFuente")) {
				jButtonAnterioresTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFuente")) {
				jButtonSiguientesTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFuente")) {
				jButtonSiguientesTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFuente")) {
				jButtonSiguientesTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFuente") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFuente")) {
				jButtonAbrirOrderByTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFuente") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFuente")) {
				jButtonMostrarOcultarTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFuente")) {
				jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFuente")) {
				jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFuente")) {
				jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFuente")) {
				jButtonCerrarReporteDinamicoTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFuente")) {
				jButtonGenerarReporteDinamicoTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFuente")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFuente")) {
				jButtonCerrarImportacionTipoFuenteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFuente")) {
				
				jButtonGenerarImportacionTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFuente")) {
				
				jButtonAbrirImportacionTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFuente")) {
				jComboBoxTiposAccionesTipoFuenteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFuente")) {
				jComboBoxTiposRelacionesTipoFuenteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFuente")) {
				jComboBoxTiposAccionesTipoFuenteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFuente")) {
				
				jComboBoxTiposSeleccionarTipoFuenteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFuente")) {
				jTextFieldValorCampoGeneralTipoFuenteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFuente")) {
				jButtonAbrirOrderByTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFuente")) {
				jButtonAbrirOrderByTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFuente")) {
				jButtonCerrarOrderByTipoFuenteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFuenteBusqueda")) {
				this.jButtonidTipoFuenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFuenteBusqueda")) {
				this.jButtoncodigoTipoFuenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFuenteBusqueda")) {
				this.jButtonnombreTipoFuenteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFuente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFuenteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFuente tipofuenteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipofuenteLocal=this.tipofuente;
			} else {
				tipofuenteLocal=this.tipofuenteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
							
				
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
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
			
			


			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFuenteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
								
						
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
								
				
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
							
				
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFuenteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofuenteAnterior =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofuenteAnterior =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
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
			
			


			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
								
				
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFuenteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFuente")) {
					jCheckBoxSeleccionarTodosTipoFuenteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFuente")) {
					jCheckBoxSeleccionadosTipoFuenteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFuente")) {
					
				}
				
				


				
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
												
				
				


				
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFuenteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofuenteAnterior =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofuenteAnterior =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFuenteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
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
			
			


			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFuenteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofuente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofuente);
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
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
				
				


				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFuente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFuente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFuenteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofuenteAnterior =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFuente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFuenteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFuente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipofuente =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipofuente =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipofuente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFuente")) {
				
				}
				
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFuente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFuente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFuente")) {
			
			}
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFuente();
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFuente")) {
				jButtonDuplicarTipoFuenteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFuente")) {
				jButtonCopiarTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFuente")) {
				jButtonVerFormTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFuente")) {
				jButtonNuevoTipoFuenteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFuente")) {
				jButtonModificarTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFuente")) {
				jButtonActualizarTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFuente")) {
				jButtonEliminarTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFuente")) {
				jButtonCancelarTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFuente")) {
				jButtonCerrarTipoFuenteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFuente")) {
				jButtonGuardarCambiosTipoFuenteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFuente")) {
				jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFuente")) {
				jButtonAbrirOrderByTipoFuenteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFuente")) {
				jButtonRecargarInformacionTipoFuenteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFuente")) {
				jButtonAnterioresTipoFuenteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFuente")) {
				jButtonSiguientesTipoFuenteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFuenteBusqueda")) {
				this.jButtonidTipoFuenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFuenteBusqueda")) {
				this.jButtoncodigoTipoFuenteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFuenteBusqueda")) {
				this.jButtonnombreTipoFuenteBusquedaActionPerformed(evt);
			}
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFuente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFuente")) {
				closingInternalFrameTipoFuente();
				
			} else if(sTipo.equals("jButtonCancelarTipoFuente")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFuente = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFuenteBeanSwingJInternalFrame jInternalFrameParent=(TipoFuenteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFuente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFuenteActionPerformed(null);
			}
			
			TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofuente,new Object(),this.tipofuenteParameterGeneral,this.tipofuenteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFuente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFuente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFuente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipofuente)) {
			if(!esControlTabla) {
				if(TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);			
				}
				
				if(this.tipofuenteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFuente(this.tipofuente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofuenteReturnGeneral=tipofuenteLogic.procesarEventosTipoFuentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofuenteLogic.getTipoFuentes(),this.tipofuente,this.tipofuenteParameterGeneral,this.isEsNuevoTipoFuente,classes);//this.tipofuenteLogic.getTipoFuente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFuente(this.tipofuenteReturnGeneral,this.tipofuenteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipofuenteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFuente(classes,this.tipofuenteReturnGeneral,this.tipofuenteBean,false);
					}
						
					if(this.tipofuenteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFuente(this.tipofuenteReturnGeneral.getTipoFuente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFuente(this.tipofuenteReturnGeneral.getTipoFuente());	
					}
						
					if(this.tipofuenteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFuente(this.tipofuenteReturnGeneral.getTipoFuente(),classes);//this.tipofuenteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFuente(this.tipofuente,classes);//this.tipofuenteBean);									
				}
			
				if(TipoFuenteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFuente(this.tipofuente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFuente(this.tipofuente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipofuenteAnterior!=null) {
						this.tipofuente=this.tipofuenteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofuenteReturnGeneral=tipofuenteLogic.procesarEventosTipoFuentesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofuenteLogic.getTipoFuentes(),this.tipofuente,this.tipofuenteParameterGeneral,this.isEsNuevoTipoFuente,classes);//this.tipofuenteLogic.getTipoFuente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofuenteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofuenteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipofuenteReturnGeneral.getTipoFuente(),tipofuenteLogic.getTipoFuentes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipofuenteReturnGeneral.getTipoFuente(),this.tipofuentes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFuente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFuente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFuente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFuente() throws Exception {
		
		TipoFuenteModel tipofuenteModel=(TipoFuenteModel)this.jTableDatosTipoFuente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofuenteModel.tipofuentes=this.tipofuenteLogic.getTipoFuentes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipofuenteModel.tipofuentes=this.tipofuentes;
		}
		
		
		((TipoFuenteModel) this.jTableDatosTipoFuente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFuente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipofuenteAnterior(),this.tipofuenteLogic.getTipoFuentes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipofuenteAnterior(),this.tipofuentes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFuente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFuente(TipoFuente tipofuente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
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
										
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofuente,new Object(),generalEntityParameterGeneral,this.tipofuenteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFuenteConstantesFunciones.getClassesRelationshipsOfTipoFuente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFuenteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFuente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFuente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFuenteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofuente,new Object(),generalEntityParameterGeneral,this.tipofuenteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFuente(TipoFuenteBean tipofuenteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFuente(ArrayList<Classe> classes,TipoFuenteReturnGeneral tipofuenteReturnGeneral,TipoFuenteBean tipofuenteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFuente(TipoFuente tipofuente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipofuente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFuente = new TipoFuenteDetalleFormJInternalFrame(jDesktopPane,this.tipofuenteSessionBean.getConGuardarRelaciones(),this.tipofuenteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.setVisible(false);
		this.jInternalFrameDetalleFormTipoFuente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFuente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFuente.tipofuenteLogic=this.tipofuenteLogic;
		
		this.cargarCombosFrameForeignKeyTipoFuente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFuente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFuente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFuente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFuente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFuente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFuente"));
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonModificarTipoFuente.addActionListener(new ButtonActionListener(this,"ModificarTipoFuente"));

		
		this.jInternalFrameDetalleFormTipoFuente.jButtonModificarToolBarTipoFuente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFuente"));
					
		this.jInternalFrameDetalleFormTipoFuente.jMenuItemModificarTipoFuente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFuente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarTipoFuente.addActionListener (new ButtonActionListener(this,"ActualizarTipoFuente"));
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarToolBarTipoFuente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFuente"));
						
		this.jInternalFrameDetalleFormTipoFuente.jMenuItemActualizarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFuente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarTipoFuente.addActionListener (new ButtonActionListener(this,"EliminarTipoFuente"));
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFuente"));
								
		this.jInternalFrameDetalleFormTipoFuente.jMenuItemEliminarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFuente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarTipoFuente.addActionListener (new ButtonActionListener(this,"CancelarTipoFuente"));
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFuente"));
					
		this.jInternalFrameDetalleFormTipoFuente.jMenuItemCancelarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFuente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFuente.jMenuItemDetalleCerrarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFuente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFuente"));
		
		
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFuente"));
		
		
		
		this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFuente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtonidTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFuenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtoncodigoTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFuenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtonnombreTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFuenteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFuente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFuente"));
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFuente"));
		}
		
		this.jTableDatosTipoFuente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFuente"));
		
		this.jTableDatosTipoFuente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFuente"));
		
		this.jButtonNuevoTipoFuente.addActionListener(new ButtonActionListener(this,"NuevoTipoFuente"));
		
		this.jButtonDuplicarTipoFuente.addActionListener(new ButtonActionListener(this,"DuplicarTipoFuente"));
		
		this.jButtonCopiarTipoFuente.addActionListener(new ButtonActionListener(this,"CopiarTipoFuente"));
		
		this.jButtonVerFormTipoFuente.addActionListener(new ButtonActionListener(this,"VerFormTipoFuente"));
		
		
		this.jButtonNuevoToolBarTipoFuente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFuente"));
			
		this.jButtonDuplicarToolBarTipoFuente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFuente"));
			
		this.jMenuItemNuevoTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFuente"));
			
		this.jMenuItemDuplicarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFuente"));		
		
		
		this.jButtonNuevoRelacionesTipoFuente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFuente"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFuente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFuente"));
			
		this.jMenuItemNuevoRelacionesTipoFuente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFuente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonModificarTipoFuente.addActionListener(new ButtonActionListener(this,"ModificarTipoFuente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonModificarToolBarTipoFuente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFuente"));
			
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemModificarTipoFuente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFuente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarTipoFuente.addActionListener (new ButtonActionListener(this,"ActualizarTipoFuente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonActualizarToolBarTipoFuente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFuente"));
				
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemActualizarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFuente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarTipoFuente.addActionListener (new ButtonActionListener(this,"EliminarTipoFuente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonEliminarToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFuente"));
						
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemEliminarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFuente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarTipoFuente.addActionListener (new ButtonActionListener(this,"CancelarTipoFuente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonCancelarToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFuente"));
			
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemCancelarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFuente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFuente"));		
		
		
		this.jButtonCerrarTipoFuente.addActionListener (new ButtonActionListener(this,"CerrarTipoFuente"));
		
		
		this.jButtonCerrarToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFuente"));
			
		this.jMenuItemCerrarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFuente"));
			
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jMenuItemDetalleCerrarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFuente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFuente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFuente"));
		}
		
		this.jButtonCopiarToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFuente"));
			
		this.jButtonVerFormToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFuente"));
		
		this.jMenuItemGuardarCambiosTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFuente"));
			
		this.jMenuItemCopiarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFuente"));		
		
		this.jMenuItemVerFormTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFuente"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFuente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFuente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFuente"));
			
		this.jMenuItemGuardarCambiosTablaTipoFuente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFuente"));		
		
		
		
		this.jButtonRecargarInformacionTipoFuente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFuente"));
					
		this.jButtonRecargarInformacionToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFuente"));
		
		this.jMenuItemRecargarInformacionTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFuente"));		
		
		
		
		this.jButtonAnterioresTipoFuente.addActionListener (new ButtonActionListener(this,"AnterioresTipoFuente"));
		
		
		this.jButtonAnterioresToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFuente"));
		
		this.jMenuItemAnterioresTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFuente"));		
		
		
		this.jButtonSiguientesTipoFuente.addActionListener (new ButtonActionListener(this,"SiguientesTipoFuente"));
		
		
		this.jButtonSiguientesToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFuente"));
			
		this.jMenuItemSiguientesTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFuente"));
			
		this.jMenuItemAbrirOrderByTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFuente"));
			
		this.jMenuItemMostrarOcultarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFuente"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFuente"));
			
		this.jMenuItemDetalleMostarOcultarTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFuente"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFuente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFuente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFuente"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFuente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFuente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFuente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFuente"));

		this.jCheckBoxSeleccionadosTipoFuente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFuente"));
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFuente"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFuente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFuente"));
			
		this.jComboBoxTiposAccionesTipoFuente.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFuente"));
					
		this.jComboBoxTiposSeleccionarTipoFuente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFuente"));
			
		this.jTextFieldValorCampoGeneralTipoFuente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFuente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtonidTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFuenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtoncodigoTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFuenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtonnombreTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFuenteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFuente!=null) {
				this.jInternalFrameReporteDinamicoTipoFuente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFuente"));
				this.jInternalFrameReporteDinamicoTipoFuente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFuente"));
				this.jInternalFrameReporteDinamicoTipoFuente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFuente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFuente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFuente"));				
			//this.jButtonGenerarReporteDinamicoTipoFuente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFuente"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFuente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFuente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFuente!=null) {
				this.jInternalFrameImportacionTipoFuente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFuente"));
				this.jInternalFrameImportacionTipoFuente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFuente"));
				this.jInternalFrameImportacionTipoFuente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFuente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFuente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFuente"));
			
			this.jButtonAbrirOrderByToolBarTipoFuente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFuente"));			
			
			if(this.jInternalFrameOrderByTipoFuente!=null) {
				this.jInternalFrameOrderByTipoFuente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFuente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFuente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFuente.jTabbedPaneRelacionesTipoFuente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFuente"));
		
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
            		closingInternalFrameTipoFuente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFuente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFuente = (JInternalFrameBase)event.getSource();
	            	
	            TipoFuenteBeanSwingJInternalFrame jInternalFrameParent=(TipoFuenteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFuente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFuenteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFuente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFuenteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFuente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFuente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFuenteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFuenteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFuenteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFuente";
		inputMap = this.jButtonNuevoTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFuenteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFuenteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFuenteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFuenteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFuente";
		inputMap = this.jButtonNuevoRelacionesTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFuenteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFuente";
		inputMap = this.jButtonModificarTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFuenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFuente";
		inputMap = this.jButtonActualizarTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFuenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFuente";
		inputMap = this.jButtonEliminarTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFuenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFuente";
		inputMap = this.jButtonCancelarTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFuenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFuente";
		inputMap = this.jButtonCerrarTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFuenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFuente";
		inputMap = this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFuente.jButtonGuardarCambiosTipoFuente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFuenteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFuente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFuenteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFuente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFuenteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFuente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFuenteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFuente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFuenteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtonidTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFuenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtoncodigoTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFuenteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFuente.jButtonnombreTipoFuenteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFuenteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFuente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFuenteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFuenteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFuente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFuente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
					tipofuenteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFuente tipofuenteAux:tipofuentes) {
					tipofuenteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFuenteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFuente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
						tipofuenteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFuente tipofuenteAux:tipofuentes) {
						tipofuenteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFuente tipofuenteAux:tipofuentes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFuente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFuente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFuente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFuente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFuenteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFuente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFuente.getSelectedRows();
			
			TipoFuente tipofuenteLocal=new TipoFuente();
			
			//this.seleccionarTodosTipoFuente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofuenteLocal =(TipoFuente) this.tipofuenteLogic.getTipoFuentes().toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipofuenteLocal =(TipoFuente) this.tipofuentes.toArray()[this.jTableDatosTipoFuente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipofuenteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
						tipofuenteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFuente tipofuenteAux:tipofuentes) {
						tipofuenteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFuente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFuente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFuente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFuente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFuenteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFuenteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFuenteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFuente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFuente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFuente tipofuenteAux:this.tipofuenteLogic.getTipoFuentes()) {
				
						if(sTipoSeleccionar.equals(TipoFuenteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofuenteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFuenteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofuenteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFuente tipofuenteAux:tipofuentes) {
					
						if(sTipoSeleccionar.equals(TipoFuenteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofuenteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFuenteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofuenteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFuente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFuenteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFuente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFuente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFuente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFuente) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFuente(conSplash);
				
					this.generarReporteTipoFuentesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFuentesSeleccionados();
				//this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFuentesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFuentesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFuente();
				
				this.exportarTipoFuentesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFuentes();
				//this.importarTipoFuentes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFuente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFuentesSeleccionados();
				//this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Fuente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFuente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFuente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFuente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFuente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFuente.jComboBoxTiposAccionesFormularioTipoFuente.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFuente();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFuente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFuenteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFuente();
			
			if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
			TipoFuente tipofuente=new TipoFuente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFuente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFuente.getSelectedItem();
			
			
			
			
			tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipofuentesSeleccionados.size()==1) {
				for(TipoFuente tipofuenteAux:tipofuentesSeleccionados) {
					tipofuente=tipofuenteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFuente();
			
      		//this.finishProcessTipoFuente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFuenteReturnGeneral() throws Exception {
		if(this.tipofuenteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipofuenteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipofuenteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipofuenteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipofuenteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipofuenteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFuente(false);
		}
		
		if(this.tipofuenteReturnGeneral.getConRetornoLista() || this.tipofuenteReturnGeneral.getConRetornoObjeto()) {
			if(this.tipofuenteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofuenteLogic.setTipoFuentes(this.tipofuenteReturnGeneral.getTipoFuentes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipofuenteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofuenteLogic.setTipoFuente(this.tipofuenteReturnGeneral.getTipoFuente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFuente(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFuente() throws Exception {
		
		
	}
	
	public ArrayList<TipoFuente> getTipoFuentesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFuente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFuente tipofuenteAux:tipofuenteLogic.getTipoFuentes()) {
					if(tipofuenteAux.getIsSelected()) {
						tipofuentesSeleccionados.add(tipofuenteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFuente tipofuenteAux:this.tipofuentes) {
					if(tipofuenteAux.getIsSelected()) {
						tipofuentesSeleccionados.add(tipofuenteAux);				
					}
				}
			}
			
			if(tipofuentesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipofuentesSeleccionados.addAll(this.tipofuenteLogic.getTipoFuentes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipofuentesSeleccionados.addAll(this.tipofuentes);				
					}
				}
			}
		} else {
			tipofuentesSeleccionados.add(this.tipofuente);
		}
		
		return tipofuentesSeleccionados;
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
	
	public void generarReporteTipoFuentesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFuentesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFuentesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFuentesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFuentesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Fuente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFuentesSeleccionados() throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFuentes("Todos",tipofuentesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFuentesSeleccionados() throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFuentes("Todos",tipofuentesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFuentesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFuentes("Todos",tipofuentesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFuentesSeleccionados() throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFuente();
		
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFuente();
		
		
		//this.generarReporteTipoFuentes("Todos",tipofuentesSeleccionados ,tipofuenteImplementable,tipofuenteImplementableHome);
	}
	
	public void mostrarImportacionTipoFuentes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFuente();
		
		this.abrirFrameImportacionTipoFuente();		
		
			
		//this.generarReporteTipoFuentes("Todos",tipofuentesSeleccionados ,tipofuenteImplementable,tipofuenteImplementableHome);
	}
	
	public void importarTipoFuentes() throws Exception {		
	
	}
	
	public void exportarTipoFuentesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFuentesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFuentesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFuentesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Fuente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFuentesSeleccionados() throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofuente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFuente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFuente tipofuenteAux:tipofuentesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFuente(tipofuenteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipofuenteAux.setsDetalleGeneralEntityReporte(tipofuenteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFuente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFuenteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFuenteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFuenteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFuenteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFuente(TipoFuente tipofuente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipofuente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofuente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofuente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofuente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFuentesSeleccionados() throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofuente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFuentes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFuente(row);				
				iRow++;
			}				
			
			for(TipoFuente tipofuenteAux:tipofuentesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFuente(tipofuenteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFuentesSeleccionados() throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();		
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofuente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipofuentes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipofuente");
			//elementRoot.appendChild(element);
		
			for(TipoFuente tipofuenteAux:tipofuentesSeleccionados) {
				element = document.createElement("tipofuente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFuente(tipofuenteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fuente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFuente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFuenteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFuente(TipoFuente tipofuente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipofuente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofuente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofuente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoFuente(TipoFuente tipofuente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFuenteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipofuente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFuenteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipofuente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoFuenteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipofuente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoFuenteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipofuente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoFuentesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFuente> tipofuentesSeleccionados=new ArrayList<TipoFuente>();
		
		tipofuentesSeleccionados=this.getTipoFuentesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFuente(tipofuentesSeleccionados);
		
		this.generarReporteTipoFuentes("Todos",tipofuentesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFuente(ArrayList<TipoFuente> tipofuentesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFuente tipofuenteAux:tipofuentesSeleccionados) {
				tipofuenteAux.setsDetalleGeneralEntityReporte(tipofuenteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFuenteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipofuenteAux.setsDescripcionGeneralEntityReporte1(tipofuenteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoFuenteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipofuenteAux.setsDescripcionGeneralEntityReporte1(tipofuenteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFuenteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFuente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFuente=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFuente=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFuente=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFuente=false;
			this.isVisibilidadCeldaActualizarTipoFuente=false;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
			this.isVisibilidadCeldaCancelarTipoFuente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFuente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFuente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=false;
			this.isVisibilidadCeldaModificarTipoFuente=false;
			this.isVisibilidadCeldaActualizarTipoFuente=true;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
			this.isVisibilidadCeldaCancelarTipoFuente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFuente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFuente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=false;
			this.isVisibilidadCeldaModificarTipoFuente=false;
			this.isVisibilidadCeldaActualizarTipoFuente=true;
			this.isVisibilidadCeldaEliminarTipoFuente=true;
			this.isVisibilidadCeldaCancelarTipoFuente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFuente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFuente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=false;
			this.isVisibilidadCeldaModificarTipoFuente=false;
			this.isVisibilidadCeldaActualizarTipoFuente=true;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
			this.isVisibilidadCeldaCancelarTipoFuente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFuente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=true;
			this.isVisibilidadCeldaModificarTipoFuente=false;
			this.isVisibilidadCeldaActualizarTipoFuente=false;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
			this.isVisibilidadCeldaCancelarTipoFuente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFuente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFuente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=false;
			this.isVisibilidadCeldaActualizarTipoFuente=false;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
			this.isVisibilidadCeldaCancelarTipoFuente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFuente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=false;
			this.isVisibilidadCeldaModificarTipoFuente=true;
			this.isVisibilidadCeldaActualizarTipoFuente=false;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
			this.isVisibilidadCeldaCancelarTipoFuente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFuente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFuenteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFuente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=true;
		} else {
			this.actualizarEstadoPanelsTipoFuente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFuente=false;
			//this.isVisibilidadCeldaVerFormTipoFuente=false;
			this.isVisibilidadCeldaDuplicarTipoFuente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipofuenteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFuente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFuente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipofuenteSessionBean.getEsGuardarRelacionado()) {
			if(!tipofuenteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;												
			}
			
			this.jButtonCerrarTipoFuente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFuente=false;
		}
		
		if(!this.permiteMantenimiento(this.tipofuente)) {
			this.isVisibilidadCeldaActualizarTipoFuente=false;
			this.isVisibilidadCeldaEliminarTipoFuente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFuente() {
	}
	
	public void actualizarEstadoPanelsTipoFuente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFuente!=null) {
				this.jScrollPanelDatosEdicionTipoFuente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFuente!=null) {
				this.jScrollPanelDatosTipoFuente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFuente!=null) {
				this.jPanelPaginacionTipoFuente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFuente!=null) {
				this.jPanelParametrosReportesTipoFuente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFuente!=null) {
				this.jScrollPanelDatosEdicionTipoFuente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFuente!=null) {
				this.jScrollPanelDatosTipoFuente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFuente!=null) {
				this.jPanelPaginacionTipoFuente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFuente!=null) {
				this.jPanelParametrosReportesTipoFuente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFuente!=null) {
				this.jScrollPanelDatosEdicionTipoFuente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoFuente!=null) {
				this.jScrollPanelDatosTipoFuente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFuente!=null) {
				this.jPanelPaginacionTipoFuente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFuente!=null) {
				this.jPanelParametrosReportesTipoFuente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFuente!=null) {
				this.jScrollPanelDatosEdicionTipoFuente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFuente!=null) {
				this.jScrollPanelDatosTipoFuente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFuente!=null) {
				this.jPanelPaginacionTipoFuente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFuente!=null) {
				this.jPanelParametrosReportesTipoFuente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFuente!=null) {
				this.jScrollPanelDatosEdicionTipoFuente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFuente!=null) {
				this.jScrollPanelDatosTipoFuente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFuente!=null) {
				this.jPanelPaginacionTipoFuente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFuente!=null) {
				this.jPanelParametrosReportesTipoFuente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFuente!=null) {
				this.jScrollPanelDatosEdicionTipoFuente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFuente!=null) {
				this.jScrollPanelDatosTipoFuente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFuente!=null) {
				this.jPanelPaginacionTipoFuente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFuente!=null) {
				this.jPanelParametrosReportesTipoFuente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFuente!=null) {
				this.jScrollPanelDatosEdicionTipoFuente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFuente!=null) {
				this.jScrollPanelDatosTipoFuente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFuente!=null) {
				this.jPanelPaginacionTipoFuente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFuente!=null) {
				this.jPanelParametrosReportesTipoFuente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFuenteSessionBean tipofuenteSessionBean=new TipoFuenteSessionBean();
		
		if(this.tipofuenteSessionBean==null) {
			this.tipofuenteSessionBean=new TipoFuenteSessionBean();
		}
		
		this.tipofuenteSessionBean.setsUltimaBusquedaTipoFuente(this.getsAccionBusqueda());
		this.tipofuenteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipofuenteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFuenteSessionBean tipofuenteSessionBean=new TipoFuenteSessionBean();
		
		if(this.tipofuenteSessionBean==null) {
			this.tipofuenteSessionBean=new TipoFuenteSessionBean();
		}
		
		if(this.tipofuenteSessionBean.getsUltimaBusquedaTipoFuente()!=null&&!this.tipofuenteSessionBean.getsUltimaBusquedaTipoFuente().equals("")) {
			this.setsAccionBusqueda(tipofuenteSessionBean.getsUltimaBusquedaTipoFuente());
			this.setiNumeroPaginacion(tipofuenteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipofuenteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipofuenteSessionBean.setsUltimaBusquedaTipoFuente("");
		this.tipofuenteSessionBean.setiNumeroPaginacion(TipoFuenteConstantesFunciones.INUMEROPAGINACION);
		this.tipofuenteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFuente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFuente() {
		this.updateBorderResaltarBusquedasFormularioTipoFuente();
		this.updateVisibilidadBusquedasFormularioTipoFuente();
		this.updateHabilitarBusquedasFormularioTipoFuente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFuente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFuente() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoFuente() {
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
	
	public void updateControlesFormularioTipoFuente() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFuente();
		this.updateVisibilidadResaltarControlesFormularioTipoFuente();
		this.updateHabilitarResaltarControlesFormularioTipoFuente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFuente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipofuenteConstantesFunciones.resaltaridTipoFuente!=null && this.jInternalFrameDetalleFormTipoFuente!=null) {this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.setBorder(this.tipofuenteConstantesFunciones.resaltaridTipoFuente);}
		if(this.tipofuenteConstantesFunciones.resaltarcodigoTipoFuente!=null && this.jInternalFrameDetalleFormTipoFuente!=null) {this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.setBorder(this.tipofuenteConstantesFunciones.resaltarcodigoTipoFuente);}
		if(this.tipofuenteConstantesFunciones.resaltarnombreTipoFuente!=null && this.jInternalFrameDetalleFormTipoFuente!=null) {this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.setBorder(this.tipofuenteConstantesFunciones.resaltarnombreTipoFuente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFuente() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
	
		//this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.setVisible(this.tipofuenteConstantesFunciones.mostraridTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.jPanelidTipoFuente.setVisible(this.tipofuenteConstantesFunciones.mostraridTipoFuente);
		//this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.setVisible(this.tipofuenteConstantesFunciones.mostrarcodigoTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.jPanelcodigoTipoFuente.setVisible(this.tipofuenteConstantesFunciones.mostrarcodigoTipoFuente);
		//this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.setVisible(this.tipofuenteConstantesFunciones.mostrarnombreTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.jPanelnombreTipoFuente.setVisible(this.tipofuenteConstantesFunciones.mostrarnombreTipoFuente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFuente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFuente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFuente!=null) {
	
		this.jInternalFrameDetalleFormTipoFuente.jTextFieldidTipoFuente.setEnabled(this.tipofuenteConstantesFunciones.activaridTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.jTextFieldcodigoTipoFuente.setEnabled(this.tipofuenteConstantesFunciones.activarcodigoTipoFuente);
		this.jInternalFrameDetalleFormTipoFuente.jTextAreanombreTipoFuente.setEnabled(this.tipofuenteConstantesFunciones.activarnombreTipoFuente);
		}
	}
	
		
}