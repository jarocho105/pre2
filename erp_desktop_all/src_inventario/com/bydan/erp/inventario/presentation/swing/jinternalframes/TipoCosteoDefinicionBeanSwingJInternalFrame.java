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

import com.bydan.erp.inventario.util.TipoCosteoDefinicionConstantesFunciones;
import com.bydan.erp.inventario.util.TipoCosteoDefinicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoCosteoDefinicionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoCosteoDefinicionBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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




@SuppressWarnings("unused")
public class TipoCosteoDefinicionBeanSwingJInternalFrame extends TipoCosteoDefinicionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCosteoDefinicionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCosteoDefinicion> tipocosteodefinicionValidator = new ClassValidator<TipoCosteoDefinicion>(TipoCosteoDefinicion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCosteoDefinicion tipocosteodefinicion;	
	public TipoCosteoDefinicion tipocosteodefinicionAux;
	public TipoCosteoDefinicion tipocosteodefinicionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCosteoDefinicion tipocosteodefinicionTotales;
	public Long idTipoCosteoDefinicionActual;
	public Long iIdNuevoTipoCosteoDefinicion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDefinicion=false;

	public Boolean getIsTienePermisosDefinicion() {
		return isTienePermisosDefinicion;
	}

	public void setIsTienePermisosDefinicion(Boolean isTienePermisosDefinicion) {
		this.isTienePermisosDefinicion= isTienePermisosDefinicion;
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
	
	public Boolean isPermisoTodoTipoCosteoDefinicion;
	public Boolean isPermisoNuevoTipoCosteoDefinicion;
	public Boolean isPermisoActualizarTipoCosteoDefinicion;
	public Boolean isPermisoActualizarOriginalTipoCosteoDefinicion;
	public Boolean isPermisoEliminarTipoCosteoDefinicion;
	public Boolean isPermisoGuardarCambiosTipoCosteoDefinicion;
	public Boolean isPermisoConsultaTipoCosteoDefinicion;
	public Boolean isPermisoBusquedaTipoCosteoDefinicion;
	public Boolean isPermisoReporteTipoCosteoDefinicion;
	public Boolean isPermisoPaginacionMedioTipoCosteoDefinicion;
	public Boolean isPermisoPaginacionAltoTipoCosteoDefinicion;
	public Boolean isPermisoPaginacionTodoTipoCosteoDefinicion;
	public Boolean isPermisoCopiarTipoCosteoDefinicion;
	public Boolean isPermisoVerFormTipoCosteoDefinicion;
	public Boolean isPermisoDuplicarTipoCosteoDefinicion;
	public Boolean isPermisoOrdenTipoCosteoDefinicion;
	
	
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
	
	public TipoCosteoDefinicionParameterReturnGeneral tipocosteodefinicionReturnGeneral;
	public TipoCosteoDefinicionParameterReturnGeneral tipocosteodefinicionParameterGeneral;
	
	

	public DefinicionLogic definicionLogic=null;

	public DefinicionLogic getDefinicionLogic() {
		return definicionLogic;
	}

	public void setDefinicionLogic(DefinicionLogic definicionLogic) {
		this.definicionLogic = definicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCosteoDefinicion=false;
	public Boolean esParaAccionDesdeFormularioTipoCosteoDefinicion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCosteoDefinicionLogic tipocosteodefinicionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCosteoDefinicion tipocosteodefinicionBean;
	public TipoCosteoDefinicionConstantesFunciones tipocosteodefinicionConstantesFunciones;
	//public TipoCosteoDefinicionParameterReturnGeneral tipocosteodefinicionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCosteoDefinicion> tipocosteodefinicions;	
	//public List<TipoCosteoDefinicion> tipocosteodefinicionsEliminados;
	//public List<TipoCosteoDefinicion> tipocosteodefinicionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCosteoDefinicion=true;
	public Boolean isVisibilidadCeldaCopiarTipoCosteoDefinicion=true;
	public Boolean isVisibilidadCeldaVerFormTipoCosteoDefinicion=true;
	public Boolean isVisibilidadCeldaOrdenTipoCosteoDefinicion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
	public Boolean isVisibilidadCeldaModificarTipoCosteoDefinicion=false;
	public Boolean isVisibilidadCeldaActualizarTipoCosteoDefinicion=false;
	public Boolean isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
	public Boolean isVisibilidadCeldaCancelarTipoCosteoDefinicion=false;
	public Boolean isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;	
	
	
	
	public Long getiIdNuevoTipoCosteoDefinicion() {
		return this.iIdNuevoTipoCosteoDefinicion;
	}

	public void setiIdNuevoTipoCosteoDefinicion(Long iIdNuevoTipoCosteoDefinicion) {
		this.iIdNuevoTipoCosteoDefinicion = iIdNuevoTipoCosteoDefinicion;
	}
	
	public Long getidTipoCosteoDefinicionActual() {
		return this.idTipoCosteoDefinicionActual;
	}

	public void setidTipoCosteoDefinicionActual(Long idTipoCosteoDefinicionActual) {
		this.idTipoCosteoDefinicionActual = idTipoCosteoDefinicionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCosteoDefinicion gettipocosteodefinicion() {
		return this.tipocosteodefinicion;
	}

	public void settipocosteodefinicion(TipoCosteoDefinicion tipocosteodefinicion) {
		this.tipocosteodefinicion = tipocosteodefinicion;
	}
	
	public TipoCosteoDefinicion gettipocosteodefinicionAux() {
		return this.tipocosteodefinicionAux;
	}

	public void settipocosteodefinicionAux(TipoCosteoDefinicion tipocosteodefinicionAux) {
		this.tipocosteodefinicionAux = tipocosteodefinicionAux;
	}				
	
	public TipoCosteoDefinicion gettipocosteodefinicionAnterior() {
		return this.tipocosteodefinicionAnterior;
	}

	public void settipocosteodefinicionAnterior(TipoCosteoDefinicion tipocosteodefinicionAnterior) {
		this.tipocosteodefinicionAnterior = tipocosteodefinicionAnterior;
	}	
	
	public TipoCosteoDefinicion gettipocosteodefinicionTotales() {
		return this.tipocosteodefinicionTotales;
	}

	public void settipocosteodefinicionTotales(TipoCosteoDefinicion tipocosteodefinicionTotales) {
		this.tipocosteodefinicionTotales = tipocosteodefinicionTotales;
	}	
	
	public TipoCosteoDefinicion gettipocosteodefinicionBean() {
		return this.tipocosteodefinicionBean;
	}

	public void settipocosteodefinicionBean(TipoCosteoDefinicion tipocosteodefinicionBean) {
		this.tipocosteodefinicionBean = tipocosteodefinicionBean;
	}	
	
	public TipoCosteoDefinicionParameterReturnGeneral gettipocosteodefinicionReturnGeneral() {
		return this.tipocosteodefinicionReturnGeneral;
	}

	public void settipocosteodefinicionReturnGeneral(TipoCosteoDefinicionParameterReturnGeneral tipocosteodefinicionReturnGeneral) {
		this.tipocosteodefinicionReturnGeneral = tipocosteodefinicionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCosteoDefinicionLogic getTipoCosteoDefinicionLogic()	{		
		return tipocosteodefinicionLogic;
	}

	public void setTipoCosteoDefinicionLogic(TipoCosteoDefinicionLogic tipocosteodefinicionLogic) {
		this.tipocosteodefinicionLogic = tipocosteodefinicionLogic;
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
	
	public Boolean getIsEsNuevoTipoCosteoDefinicion() {
		return isEsNuevoTipoCosteoDefinicion;
	}

	public void setIsEsNuevoTipoCosteoDefinicion(Boolean isEsNuevoTipoCosteoDefinicion) {
		this.isEsNuevoTipoCosteoDefinicion = isEsNuevoTipoCosteoDefinicion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCosteoDefinicion() {
		return esParaAccionDesdeFormularioTipoCosteoDefinicion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCosteoDefinicion(Boolean esParaAccionDesdeFormularioTipoCosteoDefinicion) {
		this.esParaAccionDesdeFormularioTipoCosteoDefinicion = esParaAccionDesdeFormularioTipoCosteoDefinicion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCosteoDefinicion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCosteoDefinicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoCosteoDefinicion(this.tipocosteodefinicionLogic.getTipoCosteoDefinicions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCosteoDefinicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoCosteoDefinicion(this.tipocosteodefinicions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocosteodefinicionLogic.setTipoCosteoDefinicions(this.tipocosteodefinicions);
			tipocosteodefinicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCosteoDefinicionParameterReturnGeneral getTipoCosteoDefinicionParameterGeneral() {
		return this.tipocosteodefinicionParameterGeneral;
	}
	
	public void setTipoCosteoDefinicionParameterGeneral(TipoCosteoDefinicionParameterReturnGeneral tipocosteodefinicionParameterGeneral) {
		this.tipocosteodefinicionParameterGeneral = tipocosteodefinicionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCosteoDefinicion() {
		return isPermisoTodoTipoCosteoDefinicion;
	}

	public void setIsPermisoTodoTipoCosteoDefinicion(Boolean isPermisoTodoTipoCosteoDefinicion) {
		this.isPermisoTodoTipoCosteoDefinicion = isPermisoTodoTipoCosteoDefinicion;
	}

	public Boolean getIsPermisoNuevoTipoCosteoDefinicion() {
		return isPermisoNuevoTipoCosteoDefinicion;
	}

	public void setIsPermisoNuevoTipoCosteoDefinicion(Boolean isPermisoNuevoTipoCosteoDefinicion) {
		this.isPermisoNuevoTipoCosteoDefinicion = isPermisoNuevoTipoCosteoDefinicion;
	}

	public Boolean getIsPermisoActualizarTipoCosteoDefinicion() {
		return isPermisoActualizarTipoCosteoDefinicion;
	}

	public void setIsPermisoActualizarTipoCosteoDefinicion(Boolean isPermisoActualizarTipoCosteoDefinicion) {
		this.isPermisoActualizarTipoCosteoDefinicion = isPermisoActualizarTipoCosteoDefinicion;
	}

	public Boolean getIsPermisoEliminarTipoCosteoDefinicion() {
		return isPermisoEliminarTipoCosteoDefinicion;
	}

	public void setIsPermisoEliminarTipoCosteoDefinicion(Boolean isPermisoEliminarTipoCosteoDefinicion) {
		this.isPermisoEliminarTipoCosteoDefinicion = isPermisoEliminarTipoCosteoDefinicion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCosteoDefinicion() {
		return isPermisoGuardarCambiosTipoCosteoDefinicion;
	}

	public void setIsPermisoGuardarCambiosTipoCosteoDefinicion(Boolean isPermisoGuardarCambiosTipoCosteoDefinicion) {
		this.isPermisoGuardarCambiosTipoCosteoDefinicion = isPermisoGuardarCambiosTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoConsultaTipoCosteoDefinicion() {
		return isPermisoConsultaTipoCosteoDefinicion;
	}

	public void setIsPermisoConsultaTipoCosteoDefinicion(Boolean isPermisoConsultaTipoCosteoDefinicion) {
		this.isPermisoConsultaTipoCosteoDefinicion = isPermisoConsultaTipoCosteoDefinicion;
	}

	public Boolean getIsPermisoBusquedaTipoCosteoDefinicion() {
		return isPermisoBusquedaTipoCosteoDefinicion;
	}

	public void setIsPermisoBusquedaTipoCosteoDefinicion(Boolean isPermisoBusquedaTipoCosteoDefinicion) {
		this.isPermisoBusquedaTipoCosteoDefinicion = isPermisoBusquedaTipoCosteoDefinicion;
	}

	public Boolean getIsPermisoReporteTipoCosteoDefinicion() {
		return isPermisoReporteTipoCosteoDefinicion;
	}

	public void setIsPermisoReporteTipoCosteoDefinicion(Boolean isPermisoReporteTipoCosteoDefinicion) {
		this.isPermisoReporteTipoCosteoDefinicion = isPermisoReporteTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCosteoDefinicion() {
		return isPermisoPaginacionMedioTipoCosteoDefinicion;
	}

	public void setIsPermisoPaginacionMedioTipoCosteoDefinicion(Boolean isPermisoPaginacionMedioTipoCosteoDefinicion) {
		this.isPermisoPaginacionMedioTipoCosteoDefinicion = isPermisoPaginacionMedioTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCosteoDefinicion() {
		return isPermisoPaginacionTodoTipoCosteoDefinicion;
	}

	public void setIsPermisoPaginacionTodoTipoCosteoDefinicion(Boolean isPermisoPaginacionTodoTipoCosteoDefinicion) {
		this.isPermisoPaginacionTodoTipoCosteoDefinicion = isPermisoPaginacionTodoTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCosteoDefinicion() {
		return isPermisoPaginacionAltoTipoCosteoDefinicion;
	}

	public void setIsPermisoPaginacionAltoTipoCosteoDefinicion(Boolean isPermisoPaginacionAltoTipoCosteoDefinicion) {
		this.isPermisoPaginacionAltoTipoCosteoDefinicion = isPermisoPaginacionAltoTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoCopiarTipoCosteoDefinicion() {
		return isPermisoCopiarTipoCosteoDefinicion;
	}

	public void setIsPermisoCopiarTipoCosteoDefinicion(Boolean isPermisoCopiarTipoCosteoDefinicion) {
		this.isPermisoCopiarTipoCosteoDefinicion = isPermisoCopiarTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoVerFormTipoCosteoDefinicion() {
		return isPermisoVerFormTipoCosteoDefinicion;
	}

	public void setIsPermisoVerFormTipoCosteoDefinicion(Boolean isPermisoVerFormTipoCosteoDefinicion) {
		this.isPermisoVerFormTipoCosteoDefinicion = isPermisoVerFormTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoDuplicarTipoCosteoDefinicion() {
		return isPermisoDuplicarTipoCosteoDefinicion;
	}

	public void setIsPermisoDuplicarTipoCosteoDefinicion(Boolean isPermisoDuplicarTipoCosteoDefinicion) {
		this.isPermisoDuplicarTipoCosteoDefinicion = isPermisoDuplicarTipoCosteoDefinicion;
	}
	
	public Boolean getIsPermisoOrdenTipoCosteoDefinicion() {
		return isPermisoOrdenTipoCosteoDefinicion;
	}

	public void setIsPermisoOrdenTipoCosteoDefinicion(Boolean isPermisoOrdenTipoCosteoDefinicion) {
		this.isPermisoOrdenTipoCosteoDefinicion = isPermisoOrdenTipoCosteoDefinicion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCosteoDefinicion() {
		return isVisibilidadCeldaNuevoTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaNuevoTipoCosteoDefinicion(Boolean isVisibilidadCeldaNuevoTipoCosteoDefinicion) {
		this.isVisibilidadCeldaNuevoTipoCosteoDefinicion = isVisibilidadCeldaNuevoTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCosteoDefinicion() {
		return isVisibilidadCeldaDuplicarTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCosteoDefinicion(Boolean isVisibilidadCeldaDuplicarTipoCosteoDefinicion) {
		this.isVisibilidadCeldaDuplicarTipoCosteoDefinicion = isVisibilidadCeldaDuplicarTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCosteoDefinicion() {
		return isVisibilidadCeldaCopiarTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaCopiarTipoCosteoDefinicion(Boolean isVisibilidadCeldaCopiarTipoCosteoDefinicion) {
		this.isVisibilidadCeldaCopiarTipoCosteoDefinicion = isVisibilidadCeldaCopiarTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCosteoDefinicion() {
		return isVisibilidadCeldaVerFormTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaVerFormTipoCosteoDefinicion(Boolean isVisibilidadCeldaVerFormTipoCosteoDefinicion) {
		this.isVisibilidadCeldaVerFormTipoCosteoDefinicion = isVisibilidadCeldaVerFormTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCosteoDefinicion() {
		return isVisibilidadCeldaOrdenTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaOrdenTipoCosteoDefinicion(Boolean isVisibilidadCeldaOrdenTipoCosteoDefinicion) {
		this.isVisibilidadCeldaOrdenTipoCosteoDefinicion = isVisibilidadCeldaOrdenTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion() {
		return isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion(Boolean isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion = isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCosteoDefinicion() {
		return isVisibilidadCeldaModificarTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaModificarTipoCosteoDefinicion(Boolean isVisibilidadCeldaModificarTipoCosteoDefinicion) {
		this.isVisibilidadCeldaModificarTipoCosteoDefinicion = isVisibilidadCeldaModificarTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCosteoDefinicion() {
		return isVisibilidadCeldaActualizarTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaActualizarTipoCosteoDefinicion(Boolean isVisibilidadCeldaActualizarTipoCosteoDefinicion) {
		this.isVisibilidadCeldaActualizarTipoCosteoDefinicion = isVisibilidadCeldaActualizarTipoCosteoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCosteoDefinicion() {
		return isVisibilidadCeldaEliminarTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaEliminarTipoCosteoDefinicion(Boolean isVisibilidadCeldaEliminarTipoCosteoDefinicion) {
		this.isVisibilidadCeldaEliminarTipoCosteoDefinicion = isVisibilidadCeldaEliminarTipoCosteoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCosteoDefinicion() {
		return isVisibilidadCeldaCancelarTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaCancelarTipoCosteoDefinicion(Boolean isVisibilidadCeldaCancelarTipoCosteoDefinicion) {
		this.isVisibilidadCeldaCancelarTipoCosteoDefinicion = isVisibilidadCeldaCancelarTipoCosteoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCosteoDefinicion() {
		return isVisibilidadCeldaGuardarTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaGuardarTipoCosteoDefinicion(Boolean isVisibilidadCeldaGuardarTipoCosteoDefinicion) {
		this.isVisibilidadCeldaGuardarTipoCosteoDefinicion = isVisibilidadCeldaGuardarTipoCosteoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion() {
		return isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion(Boolean isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion) {
		this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion = isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion;
	}
		
	public TipoCosteoDefinicionSessionBean gettipocosteodefinicionSessionBean() {
		return this.tipocosteodefinicionSessionBean;
	}
	
	public void settipocosteodefinicionSessionBean(TipoCosteoDefinicionSessionBean tipocosteodefinicionSessionBean) {
		this.tipocosteodefinicionSessionBean=tipocosteodefinicionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCosteoDefinicion tipocosteodefinicion,TipoCosteoDefinicion tipocosteodefinicionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCosteoDefinicion(tipocosteodefinicion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocosteodefinicionAux.setId(tipocosteodefinicion.getId());
		tipocosteodefinicionAux.setVersionRow(tipocosteodefinicion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCosteoDefinicion();
		
			int intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocosteodefinicionValidator.getInvalidValues(this.tipocosteodefinicion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocosteodefinicionLogic.setDatosCliente(datosCliente);
			tipocosteodefinicionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocosteodefinicionAux=new  TipoCosteoDefinicion();
				
				tipocosteodefinicionAux.setIsNew(true);
				tipocosteodefinicionAux.setIsChanged(true);
				
				tipocosteodefinicionAux.setTipoCosteoDefinicionOriginal(this.tipocosteodefinicion);
				
				tipocosteodefinicionAux.setId(this.tipocosteodefinicion.getId());	
				tipocosteodefinicionAux.setVersionRow(this.tipocosteodefinicion.getVersionRow());	
				tipocosteodefinicionAux.setcodigo(this.tipocosteodefinicion.getcodigo());	
				tipocosteodefinicionAux.setnombre(this.tipocosteodefinicion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocosteodefinicionAux,tipocosteodefinicionLogic.getTipoCosteoDefinicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteodefinicionAux,tipocosteodefinicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteodefinicionLogic.saveTipoCosteoDefinicions();//WithConnection
						//tipocosteodefinicionLogic.getSetVersionRowTipoCosteoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocosteodefinicion,tipocosteodefinicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocosteodefinicionAux=new  TipoCosteoDefinicion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado() && this.tipocosteodefinicion.getId()>=0)) {
						
					tipocosteodefinicionAux.setIsNew(false);
				}
				
				tipocosteodefinicionAux.setIsDeleted(false);
			
				tipocosteodefinicionAux.setId(this.tipocosteodefinicion.getId());	
				tipocosteodefinicionAux.setVersionRow(this.tipocosteodefinicion.getVersionRow());	
				tipocosteodefinicionAux.setcodigo(this.tipocosteodefinicion.getcodigo());	
				tipocosteodefinicionAux.setnombre(this.tipocosteodefinicion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocosteodefinicionAux,tipocosteodefinicionLogic.getTipoCosteoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteodefinicionAux,tipocosteodefinicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteodefinicionLogic.saveTipoCosteoDefinicions();//WithConnection
						//tipocosteodefinicionLogic.getSetVersionRowTipoCosteoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocosteodefinicion,tipocosteodefinicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocosteodefinicionAux=new  TipoCosteoDefinicion();
				
				tipocosteodefinicionAux.setIsNew(false);
				tipocosteodefinicionAux.setIsChanged(false);
				
				tipocosteodefinicionAux.setIsDeleted(true);
				
				tipocosteodefinicionAux.setId(this.tipocosteodefinicion.getId());	
				tipocosteodefinicionAux.setVersionRow(this.tipocosteodefinicion.getVersionRow());	
				tipocosteodefinicionAux.setcodigo(this.tipocosteodefinicion.getcodigo());	
				tipocosteodefinicionAux.setnombre(this.tipocosteodefinicion.getnombre());	
				
				if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocosteodefinicionAux.getId()>=0) {	
						this.tipocosteodefinicionsEliminados.add(tipocosteodefinicionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocosteodefinicionAux,tipocosteodefinicionLogic.getTipoCosteoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteodefinicionAux,tipocosteodefinicions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteodefinicionLogic.saveTipoCosteoDefinicions();//WithConnection
						//tipocosteodefinicionLogic.getSetVersionRowTipoCosteoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocosteodefinicionAux.setDefinicions(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocosteodefinicionAux,tipocosteodefinicionLogic.getTipoCosteoDefinicions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocosteodefinicionAux,tipocosteodefinicions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().addAll(this.tipocosteodefinicionsEliminados);
					
					tipocosteodefinicionLogic.saveTipoCosteoDefinicions();//WithConnection
					//tipocosteodefinicionLogic.getSetVersionRowTipoCosteoDefinicions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocosteodefinicionsEliminados= new ArrayList<TipoCosteoDefinicion>();		
			}
			
			if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Costeo Definicion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocosteodefinicion=tipocosteodefinicionAux;
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
      		//this.finishProcessTipoCosteoDefinicion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCosteoDefinicion tipocosteodefinicionLocal) throws Exception {
		
		if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocosteodefinicionLocal.setDefinicions(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
			
			} else {
			
				tipocosteodefinicionLocal.setDefinicions(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCosteoDefinicion tipocosteodefinicionLocal) throws Exception {	
		if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCosteoDefinicionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocosteodefinicionValidator.getInvalidValues(this.tipocosteodefinicion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCosteoDefinicion tipocosteodefinicion,List<TipoCosteoDefinicion> tipocosteodefinicions) throws Exception {
		try	{		
			TipoCosteoDefinicionConstantesFunciones.actualizarLista(tipocosteodefinicion,tipocosteodefinicions,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCosteoDefinicion tipocosteodefinicion,List<TipoCosteoDefinicion> tipocosteodefinicions) throws Exception {
		try	{			
			TipoCosteoDefinicionConstantesFunciones.actualizarSelectedLista(tipocosteodefinicion,tipocosteodefinicions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCosteoDefinicion> tipocosteodefinicionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocosteodefinicionsLocal=this.tipocosteodefinicionLogic.getTipoCosteoDefinicions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocosteodefinicionsLocal=this.tipocosteodefinicions;
			}
			//ARCHITECTURE
		
			for(TipoCosteoDefinicion tipocosteodefinicionLocal:tipocosteodefinicionsLocal) {
				if(this.permiteMantenimiento(tipocosteodefinicionLocal) && tipocosteodefinicionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCosteoDefinicionConstantesFunciones.getTipoCosteoDefinicionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCosteoDefinicionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteoDefinicion.jLabelcodigoTipoCosteoDefinicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCosteoDefinicionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteoDefinicion.jLabelnombreTipoCosteoDefinicion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCosteoDefinicion.jLabelcodigoTipoCosteoDefinicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCosteoDefinicion.jLabelnombreTipoCosteoDefinicion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Definicion")) {
			if(this.tipocosteodefinicion==null) {
				this.tipocosteodefinicion= new TipoCosteoDefinicion();
			}

			if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCosteoDefinicion
				this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);

				this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.getdefinicion().setTipoCosteoDefinicion(this.tipocosteodefinicion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCosteoDefinicion--;	
		
		
		this.tipocosteodefinicionAux=new TipoCosteoDefinicion();
		
		this.tipocosteodefinicionAux.setId(this.iIdNuevoTipoCosteoDefinicion);
		this.tipocosteodefinicionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().add(this.tipocosteodefinicionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocosteodefinicions.add(this.tipocosteodefinicionAux);
		}
		//ARCHITECTURE
		
		this.tipocosteodefinicion=this.tipocosteodefinicionAux;
		
		if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCosteoDefinicion(this.tipocosteodefinicion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteoDefinicion(this.tipocosteodefinicion);
		}
				
		//this.setDefaultControlesTipoCosteoDefinicion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCosteoDefinicion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCosteoDefinicion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosteoDefinicion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicionBean,this.tipocosteodefinicion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
			classes=TipoCosteoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoCosteoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocosteodefinicionReturnGeneral=tipocosteodefinicionLogic.procesarEventosTipoCosteoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosteodefinicionLogic.getTipoCosteoDefinicions(),this.tipocosteodefinicion,this.tipocosteodefinicionParameterGeneral,this.isEsNuevoTipoCosteoDefinicion,classes);//this.tipocosteodefinicionLogic.getTipoCosteoDefinicion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral,this.tipocosteodefinicionBean,false);
		
		if(this.tipocosteodefinicionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion());
		}
		
		if(this.tipocosteodefinicionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion(),classes);//this.tipocosteodefinicionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCosteoDefinicion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCosteoDefinicion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCosteoDefinicion(false);
						
			if(tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosteoDefinicion();
			}
			
			this.actualizarVisualTableDatosTipoCosteoDefinicion();
			
			this.jTableDatosTipoCosteoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCosteoDefinicion(), this.getIndiceNuevoTipoCosteoDefinicion());
			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
						
			this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCosteoDefinicion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.setEnabled(isHabilitar && this.tipocosteodefinicionConstantesFunciones.activarcodigoTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.setEnabled(isHabilitar && this.tipocosteodefinicionConstantesFunciones.activarnombreTipoCosteoDefinicion);	
		
	};
	
	public void setDefaultControlesTipoCosteoDefinicion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCosteoDefinicion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocosteodefinicionSessionBean.setConGuardarRelaciones(true);			
			this.tipocosteodefinicionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocosteodefinicionSessionBean.setConGuardarRelaciones(false);			
			this.tipocosteodefinicionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCosteoDefinicion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
				if(tipocosteodefinicionAux.getId().equals(this.iIdNuevoTipoCosteoDefinicion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicions) {
				if(tipocosteodefinicionAux.getId().equals(this.iIdNuevoTipoCosteoDefinicion)) {
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
	
	public int getIndiceActualTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
				if(tipocosteodefinicionAux.getId().equals(tipocosteodefinicion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicions) {
				if(tipocosteodefinicionAux.getId().equals(tipocosteodefinicion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
				if(tipocosteodefinicionAux.getTipoCosteoDefinicionOriginal().getId().equals(tipocosteodefinicionOriginal.getId())) {
					existe=true;
					tipocosteodefinicionOriginal.setId(tipocosteodefinicionAux.getId());
					tipocosteodefinicionOriginal.setVersionRow(tipocosteodefinicionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicions) {
				if(tipocosteodefinicionAux.getTipoCosteoDefinicionOriginal().getId().equals(tipocosteodefinicionOriginal.getId())) {
					existe=true;
					tipocosteodefinicionOriginal.setId(tipocosteodefinicionAux.getId());
					tipocosteodefinicionOriginal.setVersionRow(tipocosteodefinicionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCosteoDefinicion(Boolean esParaCancelar) throws Exception {
		tipocosteodefinicionsAux=new ArrayList<TipoCosteoDefinicion>();
		tipocosteodefinicionAux=new TipoCosteoDefinicion();
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
					if(tipocosteodefinicionAux.getId()<0) {
						tipocosteodefinicionsAux.add(tipocosteodefinicionAux);
					}		
				}
				this.iIdNuevoTipoCosteoDefinicion=0L;
				this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().removeAll(tipocosteodefinicionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicions) {
					if(tipocosteodefinicionAux.getId()<0) {
						tipocosteodefinicionsAux.add(tipocosteodefinicionAux);
					}		
				}
				this.iIdNuevoTipoCosteoDefinicion=0L;
				this.tipocosteodefinicions.removeAll(tipocosteodefinicionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCosteoDefinicion 
					&& this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().size()>0
					) {
					tipocosteodefinicionAux=this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().get(this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().size() - 1);
				
					if(tipocosteodefinicionAux.getId()<0) {
						this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().remove(tipocosteodefinicionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCosteoDefinicion && this.tipocosteodefinicions.size()>0) {
					tipocosteodefinicionAux=this.tipocosteodefinicions.get(this.tipocosteodefinicions.size() - 1);
				
					if(tipocosteodefinicionAux.getId()<0) {
						this.tipocosteodefinicions.remove(tipocosteodefinicionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCosteoDefinicion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocosteodefinicion.getId()<0) {
				this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().remove(this.tipocosteodefinicion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocosteodefinicion.getId()<0) {
				this.tipocosteodefinicions.remove(this.tipocosteodefinicion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCosteoDefinicion(List<TipoCosteoDefinicion> tipocosteodefinicionsAux) throws Exception {
		TipoCosteoDefinicionConstantesFunciones.setEstadosInicialesTipoCosteoDefinicion(tipocosteodefinicionsAux);
	}
	
	public void setEstadosInicialesTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicionAux) throws Exception {
		TipoCosteoDefinicionConstantesFunciones.setEstadosInicialesTipoCosteoDefinicion(tipocosteodefinicionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCosteoDefinicionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCosteoDefinicionActual()) {
				if(!this.isEsNuevoTipoCosteoDefinicion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCosteoDefinicion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCosteoDefinicionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Costeo Definicion ?", "MANTENIMIENTO DE Tipo Costeo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCosteoDefinicion tipocosteodefinicion) throws Exception {
		TipoCosteoDefinicionConstantesFunciones.seleccionarAsignar(this.tipocosteodefinicion,tipocosteodefinicion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCosteoDefinicion=this.isPermisoActualizarOriginalTipoCosteoDefinicion;
			
			
			this.seleccionarAsignar(tipocosteodefinicion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCosteoDefinicionConstantesFunciones.quitarEspaciosTipoCosteoDefinicion(this.tipocosteodefinicion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocosteodefinicionSessionBean.setsFuncionBusquedaRapida(this.tipocosteodefinicionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCosteoDefinicion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCosteoDefinicion(esParaCancelar);				
				this.cancelarNuevoTipoCosteoDefinicion(esParaCancelar);								
			}
			
			this.tipocosteodefinicion=new TipoCosteoDefinicion();
			
			this.inicializarTipoCosteoDefinicion();
			
			this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCosteoDefinicion() throws Exception {
		try {
			TipoCosteoDefinicionConstantesFunciones.inicializarTipoCosteoDefinicion(this.tipocosteodefinicion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCosteoDefinicions(String sAccionBusqueda,List<TipoCosteoDefinicion> tipocosteodefinicionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCosteoDefinicion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCosteoDefinicionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCosteoDefinicionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCosteoDefinicion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Costeo Definiciones");		
		parameters.put("busquedapor", TipoCosteoDefinicionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Definicion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCosteoDefinicionLogic tipocosteodefinicionLogicAuxiliar=new TipoCosteoDefinicionLogic();
					tipocosteodefinicionLogicAuxiliar.setDatosCliente(tipocosteodefinicionLogic.getDatosCliente());				
					tipocosteodefinicionLogicAuxiliar.setTipoCosteoDefinicions(tipocosteodefinicionsParaReportes);
					
					tipocosteodefinicionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCosteoDefinicionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocosteodefinicionsParaReportes=tipocosteodefinicionLogicAuxiliar.getTipoCosteoDefinicions();
					
					//tipocosteodefinicionLogic.getNewConnexionToDeep();
					
					//for (TipoCosteoDefinicion tipocosteodefinicion:tipocosteodefinicionsParaReportes) {
					//	tipocosteodefinicionLogic.deepLoad(tipocosteodefinicion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocosteodefinicionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocosteodefinicionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDefinicion = AuxiliarReportes.class.getResourceAsStream("DefinicionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_definicion", reportFileDefinicion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCosteoDefinicion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCosteoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCosteoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCosteoDefinicion=new JRBeanArrayDataSource(TipoCosteoDefinicionJInternalFrame.TraerTipoCosteoDefinicionBeans(tipocosteodefinicionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCosteoDefinicion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCosteoDefinicionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCosteoDefinicionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCosteoDefinicionBean.TraerTipoCosteoDefinicionBeans(tipocosteodefinicionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCosteoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocosteodefinicionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCosteoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocosteodefinicionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicionActionPerformed(null);
					//this.generarExcelReporteTipoCosteoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocosteodefinicionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCosteoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocosteodefinicionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCosteoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocosteodefinicionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCosteoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocosteodefinicionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCosteoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosteoDefinicion> tipocosteodefinicionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteodefinicion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCosteoDefinicions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCosteoDefinicion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCosteoDefinicion tipocosteodefinicion : tipocosteodefinicionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCosteoDefinicionConstantesFunciones.generarExcelReporteDataTipoCosteoDefinicion("NORMAL",row,workbook,tipocosteodefinicion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCosteoDefinicion(String sTipo,Row row,Workbook workbook) {
		
		TipoCosteoDefinicionConstantesFunciones.generarExcelReporteHeaderTipoCosteoDefinicion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCosteoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosteoDefinicion> tipocosteodefinicionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteodefinicion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCosteoDefinicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCosteoDefinicion tipocosteodefinicion : tipocosteodefinicionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.getTipoCosteoDefinicionDescripcion(tipocosteodefinicion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocosteodefinicion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocosteodefinicion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCosteoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCosteoDefinicion> tipocosteodefinicionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCosteoDefinicion> tipocosteodefinicionsRespaldo=null;
		
		classes=TipoCosteoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoCosteoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocosteodefinicionLogic.setDatosCliente(this.datosCliente);
		this.tipocosteodefinicionLogic.setDatosDeep(this.datosDeep);
		this.tipocosteodefinicionLogic.setIsConDeep(true);
		
		tipocosteodefinicionsRespaldo=this.tipocosteodefinicionLogic.getTipoCosteoDefinicions();
		
		this.tipocosteodefinicionLogic.setTipoCosteoDefinicions(tipocosteodefinicionsParaReportes);	
		this.tipocosteodefinicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocosteodefinicionsParaReportes=this.tipocosteodefinicionLogic.getTipoCosteoDefinicions();
		this.tipocosteodefinicionLogic.setTipoCosteoDefinicions(tipocosteodefinicionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteodefinicion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCosteoDefinicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCosteoDefinicion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCosteoDefinicion tipocosteodefinicion : tipocosteodefinicionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCosteoDefinicion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCosteoDefinicionConstantesFunciones.generarExcelReporteDataTipoCosteoDefinicion("NORMAL",row,workbook,tipocosteodefinicion,cellStyleDataAux);
		
			
			


				//Definicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DefinicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocosteodefinicion.getDefinicions()!=null && tipocosteodefinicion.getDefinicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DefinicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DefinicionConstantesFunciones.generarExcelReporteHeaderDefinicion("RELACIONADO",row,workbook);
				}

				if(tipocosteodefinicion.getDefinicions()!=null) {
					i2=0;
					for(Definicion definicion : tipocosteodefinicion.getDefinicions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DefinicionConstantesFunciones.generarExcelReporteDataDefinicion("RELACIONADO",row,workbook,definicion,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.getTipoCosteoDefinicionDescripcion(tipocosteodefinicion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCosteoDefinicion() throws Exception {		
		this.startProcessTipoCosteoDefinicion(true);
	}
	
	public void startProcessTipoCosteoDefinicion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCosteoDefinicion, this.jScrollPanelDatosTipoCosteoDefinicion,this.jPanelPaginacionTipoCosteoDefinicion, this.jScrollPanelDatosEdicionTipoCosteoDefinicion, this.jPanelAccionesTipoCosteoDefinicion,this.jPanelAccionesFormularioTipoCosteoDefinicion,this.jmenuBarTipoCosteoDefinicion,this.jmenuBarDetalleTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,this.jTtoolBarDetalleTipoCosteoDefinicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCosteoDefinicion=null; 
		
		final JPanel jPanelParametrosReportesTipoCosteoDefinicion=this.jPanelParametrosReportesTipoCosteoDefinicion;
		//final JScrollPane jScrollPanelDatosTipoCosteoDefinicion=this.jScrollPanelDatosTipoCosteoDefinicion;
		final JTable jTableDatosTipoCosteoDefinicion=this.jTableDatosTipoCosteoDefinicion;		
		final JPanel jPanelPaginacionTipoCosteoDefinicion=this.jPanelPaginacionTipoCosteoDefinicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoCosteoDefinicion=this.jScrollPanelDatosEdicionTipoCosteoDefinicion;
		final JPanel jPanelAccionesTipoCosteoDefinicion=this.jPanelAccionesTipoCosteoDefinicion;
		
		JPanel jPanelCamposAuxiliarTipoCosteoDefinicion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCosteoDefinicion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			jPanelCamposAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jPanelCamposTipoCosteoDefinicion;
			jPanelAccionesFormularioAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jPanelAccionesFormularioTipoCosteoDefinicion;
		}
		
		final JPanel jPanelCamposTipoCosteoDefinicion=jPanelCamposAuxiliarTipoCosteoDefinicion;
		final JPanel jPanelAccionesFormularioTipoCosteoDefinicion=jPanelAccionesFormularioAuxiliarTipoCosteoDefinicion;
		
		
		final JMenuBar jmenuBarTipoCosteoDefinicion=this.jmenuBarTipoCosteoDefinicion;
		final JToolBar jTtoolBarTipoCosteoDefinicion=this.jTtoolBarTipoCosteoDefinicion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCosteoDefinicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCosteoDefinicion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			jmenuBarDetalleAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jmenuBarDetalleTipoCosteoDefinicion;
			jTtoolBarDetalleAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTtoolBarDetalleTipoCosteoDefinicion;
		}
		
		final JMenuBar jmenuBarDetalleTipoCosteoDefinicion=jmenuBarDetalleAuxiliarTipoCosteoDefinicion;
		final JToolBar jTtoolBarDetalleTipoCosteoDefinicion=jTtoolBarDetalleAuxiliarTipoCosteoDefinicion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCosteoDefinicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCosteoDefinicion;
			processRunnable.jTableDatos=jTableDatosTipoCosteoDefinicion;
			processRunnable.jPanelCampos=jPanelCamposTipoCosteoDefinicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCosteoDefinicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCosteoDefinicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCosteoDefinicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCosteoDefinicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCosteoDefinicion;
			processRunnable.jTtoolBar=jTtoolBarTipoCosteoDefinicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCosteoDefinicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCosteoDefinicion ,jPanelParametrosReportesTipoCosteoDefinicion,jTableDatosTipoCosteoDefinicion, /*jScrollPanelDatosTipoCosteoDefinicion,*/jPanelCamposTipoCosteoDefinicion,jPanelPaginacionTipoCosteoDefinicion, /*jScrollPanelDatosEdicionTipoCosteoDefinicion,*/ jPanelAccionesTipoCosteoDefinicion,jPanelAccionesFormularioTipoCosteoDefinicion,jmenuBarTipoCosteoDefinicion,jmenuBarDetalleTipoCosteoDefinicion,jTtoolBarTipoCosteoDefinicion,jTtoolBarDetalleTipoCosteoDefinicion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCosteoDefinicion, jScrollPanelDatosTipoCosteoDefinicion,jPanelPaginacionTipoCosteoDefinicion, jScrollPanelDatosEdicionTipoCosteoDefinicion, jPanelAccionesTipoCosteoDefinicion,jPanelAccionesFormularioTipoCosteoDefinicion,jmenuBarTipoCosteoDefinicion,jmenuBarDetalleTipoCosteoDefinicion,jTtoolBarTipoCosteoDefinicion,jTtoolBarDetalleTipoCosteoDefinicion);
						
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
	
	public void finishProcessTipoCosteoDefinicion() {// throws Exception 
		this.finishProcessTipoCosteoDefinicion(true);
	}
	
	public void finishProcessTipoCosteoDefinicion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCosteoDefinicion, this.jScrollPanelDatosTipoCosteoDefinicion,this.jPanelPaginacionTipoCosteoDefinicion, this.jScrollPanelDatosEdicionTipoCosteoDefinicion, this.jPanelAccionesTipoCosteoDefinicion,this.jPanelAccionesFormularioTipoCosteoDefinicion,this.jmenuBarTipoCosteoDefinicion,this.jmenuBarDetalleTipoCosteoDefinicion,this.jTtoolBarTipoCosteoDefinicion,this.jTtoolBarDetalleTipoCosteoDefinicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCosteoDefinicion=null; 
		
		final JPanel jPanelParametrosReportesTipoCosteoDefinicion=this.jPanelParametrosReportesTipoCosteoDefinicion;
		//final JScrollPane jScrollPanelDatosTipoCosteoDefinicion=this.jScrollPanelDatosTipoCosteoDefinicion;
		final JTable jTableDatosTipoCosteoDefinicion=this.jTableDatosTipoCosteoDefinicion;		
		final JPanel jPanelPaginacionTipoCosteoDefinicion=this.jPanelPaginacionTipoCosteoDefinicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoCosteoDefinicion=this.jScrollPanelDatosEdicionTipoCosteoDefinicion;
		final JPanel jPanelAccionesTipoCosteoDefinicion=this.jPanelAccionesTipoCosteoDefinicion;
		
		JPanel jPanelCamposAuxiliarTipoCosteoDefinicion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCosteoDefinicion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			jPanelCamposAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jPanelCamposTipoCosteoDefinicion;
			jPanelAccionesFormularioAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jPanelAccionesFormularioTipoCosteoDefinicion;
		}
		
		final JPanel jPanelCamposTipoCosteoDefinicion=jPanelCamposAuxiliarTipoCosteoDefinicion;
		final JPanel jPanelAccionesFormularioTipoCosteoDefinicion=jPanelAccionesFormularioAuxiliarTipoCosteoDefinicion;
		
		
		final JMenuBar jmenuBarTipoCosteoDefinicion=this.jmenuBarTipoCosteoDefinicion;		
		final JToolBar jTtoolBarTipoCosteoDefinicion=this.jTtoolBarTipoCosteoDefinicion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCosteoDefinicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCosteoDefinicion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			jmenuBarDetalleAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jmenuBarDetalleTipoCosteoDefinicion;
			jTtoolBarDetalleAuxiliarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTtoolBarDetalleTipoCosteoDefinicion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCosteoDefinicion=jmenuBarDetalleAuxiliarTipoCosteoDefinicion;
		final JToolBar jTtoolBarDetalleTipoCosteoDefinicion=jTtoolBarDetalleAuxiliarTipoCosteoDefinicion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCosteoDefinicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCosteoDefinicion;
			processRunnable.jTableDatos=jTableDatosTipoCosteoDefinicion;
			processRunnable.jPanelCampos=jPanelCamposTipoCosteoDefinicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCosteoDefinicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCosteoDefinicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCosteoDefinicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCosteoDefinicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCosteoDefinicion;
			processRunnable.jTtoolBar=jTtoolBarTipoCosteoDefinicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCosteoDefinicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCosteoDefinicion ,jPanelParametrosReportesTipoCosteoDefinicion, jTableDatosTipoCosteoDefinicion,/*jScrollPanelDatosTipoCosteoDefinicion,*/jPanelCamposTipoCosteoDefinicion,jPanelPaginacionTipoCosteoDefinicion, /*jScrollPanelDatosEdicionTipoCosteoDefinicion,*/ jPanelAccionesTipoCosteoDefinicion,jPanelAccionesFormularioTipoCosteoDefinicion,jmenuBarTipoCosteoDefinicion,jmenuBarDetalleTipoCosteoDefinicion,jTtoolBarTipoCosteoDefinicion,jTtoolBarDetalleTipoCosteoDefinicion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCosteoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCosteoDefinicion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCosteoDefinicion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCosteoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCosteoDefinicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCosteoDefinicion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCosteoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCosteoDefinicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCosteoDefinicion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocosteodefinicionConstantesFunciones.getsFinalQueryTipoCosteoDefinicion();
		String  finalQueryPaginacionTodos=this.tipocosteodefinicionConstantesFunciones.getsFinalQueryTipoCosteoDefinicion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCosteoDefinicionConstantesFunciones.getArrayColumnasGlobalesNoTipoCosteoDefinicion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCosteoDefinicionConstantesFunciones.getArrayColumnasGlobalesTipoCosteoDefinicion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCosteoDefinicionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocosteodefinicionsEliminados= new ArrayList<TipoCosteoDefinicion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCosteoDefinicion();
		
				///*TipoCosteoDefinicionSessionBean*/this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
			
			if(this.tipocosteodefinicionSessionBean==null) {
				this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
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
					this.iNumeroPaginacion=TipoCosteoDefinicionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCosteoDefinicionConstantesFunciones.getClassesForeignKeysOfTipoCosteoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocosteodefinicion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocosteodefinicionsAux= new ArrayList<TipoCosteoDefinicion>();
			
				
			tipocosteodefinicionLogic.setDatosCliente(this.datosCliente);
			tipocosteodefinicionLogic.setDatosDeep(this.datosDeep);
			tipocosteodefinicionLogic.setIsConDeep(true);
			
			
			tipocosteodefinicionLogic.getTipoCosteoDefinicionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocosteodefinicionLogic.getTodosTipoCosteoDefinicions(finalQueryGlobal,pagination);
					
					//tipocosteodefinicionLogic.getTodosTipoCosteoDefinicionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocosteodefinicionLogic.getTipoCosteoDefinicions()==null|| tipocosteodefinicionLogic.getTipoCosteoDefinicions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocosteodefinicionsAux= new ArrayList<TipoCosteoDefinicion>();
							tipocosteodefinicionsAux.addAll(tipocosteodefinicionLogic.getTipoCosteoDefinicions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteodefinicionsAux= new ArrayList<TipoCosteoDefinicion>();
							tipocosteodefinicionsAux.addAll(tipocosteodefinicions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocosteodefinicionLogic.getTodosTipoCosteoDefinicions(finalQueryGlobal+"",this.pagination);												
							
							//tipocosteodefinicionLogic.getTodosTipoCosteoDefinicionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionLogic.getTipoCosteoDefinicions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocosteodefinicionLogic.setTipoCosteoDefinicions(new ArrayList<TipoCosteoDefinicion>());					
							tipocosteodefinicionLogic.getTipoCosteoDefinicions().addAll(tipocosteodefinicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteodefinicions=new ArrayList<TipoCosteoDefinicion>();
							tipocosteodefinicions.addAll(tipocosteodefinicionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCosteoDefinicion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCosteoDefinicion=this.idActual;
				
				} else if(this.idTipoCosteoDefinicionActual!=null && this.idTipoCosteoDefinicionActual!=0L) {
					idTipoCosteoDefinicion=idTipoCosteoDefinicionActual;
				}
				
					
				this.sDetalleReporte=TipoCosteoDefinicionConstantesFunciones.getDetalleIndicePorId(idTipoCosteoDefinicion);
				
				this.tipocosteodefinicions=new ArrayList<TipoCosteoDefinicion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocosteodefinicionLogic.getEntity(idTipoCosteoDefinicion);
					
					//tipocosteodefinicionLogic.getEntityWithConnection(idTipoCosteoDefinicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocosteodefinicionLogic.setTipoCosteoDefinicions(new ArrayList<TipoCosteoDefinicion>());
					tipocosteodefinicionLogic.getTipoCosteoDefinicions().add(tipocosteodefinicionLogic.getTipoCosteoDefinicion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocosteodefinicions=new ArrayList<TipoCosteoDefinicion>();
					this.tipocosteodefinicions.add(tipocosteodefinicion);
				}
				
				if(tipocosteodefinicionLogic.getTipoCosteoDefinicion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCosteoDefinicion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCosteoDefinicion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocosteodefinicionLogic.getTipoCosteoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocosteodefinicions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocosteodefinicionLogic.getTipoCosteoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocosteodefinicions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCosteoDefinicion tipocosteodefinicion) {
		Boolean permite=true;
		
		if(this.tipocosteodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCosteoDefinicionConstantesFunciones.getOrderByListaTipoCosteoDefinicion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCosteoDefinicionConstantesFunciones.getOrderByListaTipoCosteoDefinicion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteoDefinicion tipocosteodefinicion:tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
				if(tipocosteodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteodefinicionTotales=tipocosteodefinicion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteoDefinicion tipocosteodefinicion:this.tipocosteodefinicions) {
				if(tipocosteodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteodefinicionTotales=tipocosteodefinicion;
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
			this.tipocosteodefinicionAux=new TipoCosteoDefinicion();
			this.tipocosteodefinicionAux.setsType(Constantes2.S_TOTALES);
			this.tipocosteodefinicionAux.setIsNew(false);
			this.tipocosteodefinicionAux.setIsChanged(false);
			this.tipocosteodefinicionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCosteoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCosteoDefinicion(this.tipocosteodefinicionLogic.getTipoCosteoDefinicions(),this.tipocosteodefinicionAux);
				
				this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().add(this.tipocosteodefinicionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCosteoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCosteoDefinicion(this.tipocosteodefinicions,this.tipocosteodefinicionAux);
				
				this.tipocosteodefinicions.add(this.tipocosteodefinicionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocosteodefinicionTotales=new TipoCosteoDefinicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().remove(tipocosteodefinicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocosteodefinicions.remove(tipocosteodefinicionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocosteodefinicionTotales=new TipoCosteoDefinicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCosteoDefinicion tipocosteodefinicion:tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
				if(tipocosteodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteodefinicionTotales=tipocosteodefinicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCosteoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCosteoDefinicion(this.tipocosteodefinicionLogic.getTipoCosteoDefinicions(),tipocosteodefinicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCosteoDefinicion tipocosteodefinicion:this.tipocosteodefinicions) {
				if(tipocosteodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocosteodefinicionTotales=tipocosteodefinicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCosteoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCosteoDefinicion(this.tipocosteodefinicions,tipocosteodefinicionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCosteoDefinicion() {
		this.isPermisoTodoTipoCosteoDefinicion=false;
		this.isPermisoNuevoTipoCosteoDefinicion=false;
		this.isPermisoActualizarTipoCosteoDefinicion=false;
		this.isPermisoActualizarOriginalTipoCosteoDefinicion=false;
		this.isPermisoEliminarTipoCosteoDefinicion=false;
		this.isPermisoGuardarCambiosTipoCosteoDefinicion=false;
		this.isPermisoConsultaTipoCosteoDefinicion=false;
		this.isPermisoBusquedaTipoCosteoDefinicion=false;
		this.isPermisoReporteTipoCosteoDefinicion=false;		
		this.isPermisoOrdenTipoCosteoDefinicion=false;		
		this.isPermisoPaginacionMedioTipoCosteoDefinicion=false;		
		this.isPermisoPaginacionAltoTipoCosteoDefinicion=false;
		this.isPermisoPaginacionTodoTipoCosteoDefinicion=false;
		this.isPermisoCopiarTipoCosteoDefinicion=false;		
		this.isPermisoVerFormTipoCosteoDefinicion=false;		
		this.isPermisoDuplicarTipoCosteoDefinicion=false;		
		this.isPermisoOrdenTipoCosteoDefinicion=false;		
	}
	
	public void setPermisosUsuarioTipoCosteoDefinicion(Boolean isPermiso) {
		this.isPermisoTodoTipoCosteoDefinicion=isPermiso;
		this.isPermisoNuevoTipoCosteoDefinicion=isPermiso;
		this.isPermisoActualizarTipoCosteoDefinicion=isPermiso;
		this.isPermisoActualizarOriginalTipoCosteoDefinicion=isPermiso;
		this.isPermisoEliminarTipoCosteoDefinicion=isPermiso;
		this.isPermisoGuardarCambiosTipoCosteoDefinicion=isPermiso;
		this.isPermisoConsultaTipoCosteoDefinicion=isPermiso;
		this.isPermisoBusquedaTipoCosteoDefinicion=isPermiso;
		this.isPermisoReporteTipoCosteoDefinicion=isPermiso;
		this.isPermisoOrdenTipoCosteoDefinicion=isPermiso;		
		this.isPermisoPaginacionMedioTipoCosteoDefinicion=isPermiso;		
		this.isPermisoPaginacionAltoTipoCosteoDefinicion=isPermiso;		
		this.isPermisoPaginacionTodoTipoCosteoDefinicion=isPermiso;		
		this.isPermisoCopiarTipoCosteoDefinicion=isPermiso;		
		this.isPermisoVerFormTipoCosteoDefinicion=isPermiso;		
		this.isPermisoDuplicarTipoCosteoDefinicion=isPermiso;
		this.isPermisoOrdenTipoCosteoDefinicion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCosteoDefinicion(Boolean isPermiso) {
		//this.isPermisoTodoTipoCosteoDefinicion=isPermiso;
		this.isPermisoNuevoTipoCosteoDefinicion=isPermiso;
		this.isPermisoActualizarTipoCosteoDefinicion=isPermiso;
		this.isPermisoActualizarOriginalTipoCosteoDefinicion=isPermiso;
		this.isPermisoEliminarTipoCosteoDefinicion=isPermiso;
		this.isPermisoGuardarCambiosTipoCosteoDefinicion=isPermiso;
		//this.isPermisoConsultaTipoCosteoDefinicion=isPermiso;
		//this.isPermisoBusquedaTipoCosteoDefinicion=isPermiso;
		//this.isPermisoReporteTipoCosteoDefinicion=isPermiso;
		//this.isPermisoOrdenTipoCosteoDefinicion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCosteoDefinicion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCosteoDefinicion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCosteoDefinicion=isPermiso;		
		//this.isPermisoCopiarTipoCosteoDefinicion=isPermiso;		
		//this.isPermisoDuplicarTipoCosteoDefinicion=isPermiso;
		//this.isPermisoOrdenTipoCosteoDefinicion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCosteoDefinicionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCosteoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDefinicion=false;
		this.isTienePermisosDefinicion=this.verificarGetPermisosUsuarioOpcionTipoCosteoDefinicionClaseRelacionada(this.opcionsRelacionadas,DefinicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCosteoDefinicion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCosteoDefinicionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDefinicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCosteoDefinicionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCosteoDefinicionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCosteoDefinicionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDefinicion && this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null && this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.remove(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCosteoDefinicion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCosteoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCosteoDefinicionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCosteoDefinicion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCosteoDefinicion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCosteoDefinicion=this.isPermisoActualizarTipoCosteoDefinicion;
			this.isPermisoEliminarTipoCosteoDefinicion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCosteoDefinicion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCosteoDefinicion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCosteoDefinicion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCosteoDefinicion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCosteoDefinicion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCosteoDefinicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCosteoDefinicion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCosteoDefinicion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCosteoDefinicion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCosteoDefinicion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCosteoDefinicion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCosteoDefinicion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCosteoDefinicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCosteoDefinicion.setToolTipText(this.jTableDatosTipoCosteoDefinicion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCosteoDefinicion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCosteoDefinicion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCosteoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCosteoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCosteoDefinicion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDefinicion && this.tipocosteodefinicionConstantesFunciones.mostrarDefinicionTipoCosteoDefinicion && !TipoCosteoDefinicionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Definicion");
			reporte.setsDescripcion("Definicion");
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
	
		
	public void inicializarCombosForeignKeyTipoCosteoDefinicionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCosteoDefinicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCosteoDefinicionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCosteoDefinicionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCosteoDefinicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCosteoDefinicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCosteoDefinicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCosteoDefinicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCosteoDefinicion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosteoDefinicion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCosteoDefinicion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCosteoDefinicion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCosteoDefinicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCosteoDefinicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCosteoDefinicion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCosteoDefinicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCosteoDefinicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCosteoDefinicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCosteoDefinicionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCosteoDefinicionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCosteoDefinicionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean(); 
		this.tipocosteodefinicionConstantesFunciones=new TipoCosteoDefinicionConstantesFunciones(); 
		this.tipocosteodefinicionBean=new TipoCosteoDefinicion();//(this.tipocosteodefinicionConstantesFunciones); 		
		this.tipocosteodefinicionReturnGeneral=new TipoCosteoDefinicionParameterReturnGeneral(); 
		
		this.tipocosteodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocosteodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCosteoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCosteoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCosteoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCosteoDefinicion(true);
			
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
			
			this.tipocosteodefinicionConstantesFunciones=new TipoCosteoDefinicionConstantesFunciones(); 
			this.tipocosteodefinicionBean=new TipoCosteoDefinicion();//this.tipocosteodefinicionConstantesFunciones); 			
			this.tipocosteodefinicionReturnGeneral=new TipoCosteoDefinicionParameterReturnGeneral(); 
		
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costeo Definicion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocosteodefinicion=new TipoCosteoDefinicion();
			this.tipocosteodefinicions = new ArrayList<TipoCosteoDefinicion>();
			this.tipocosteodefinicionsAux = new ArrayList<TipoCosteoDefinicion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic=new TipoCosteoDefinicionLogic();
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocosteodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocosteodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCosteoDefinicion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCosteoDefinicion);	
					}
					
					if(this.jInternalFrameImportacionTipoCosteoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCosteoDefinicion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCosteoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCosteoDefinicion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCosteoDefinicion);
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.setVisible(false);
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion);
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCosteoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCosteoDefinicion);
					this.jInternalFrameImportacionTipoCosteoDefinicion.setVisible(false);
					this.jInternalFrameImportacionTipoCosteoDefinicion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCosteoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCosteoDefinicion);
					this.jInternalFrameOrderByTipoCosteoDefinicion.setVisible(false);
					this.jInternalFrameOrderByTipoCosteoDefinicion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCosteoDefinicionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCosteoDefinicionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocosteodefinicionReturnGeneral=new TipoCosteoDefinicionParameterReturnGeneral();
			
			this.tipocosteodefinicionParameterGeneral=new TipoCosteoDefinicionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocosteodefinicionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCosteoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCosteoDefinicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado(),this.tipocosteodefinicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCosteoDefinicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado(),this.tipocosteodefinicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaDuplicarTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaCopiarTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaVerFormTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaOrdenTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCosteoDefinicion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCosteoDefinicion(false);
			
			this.setPermisosUsuarioTipoCosteoDefinicion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado() && this.tipocosteodefinicionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCosteoDefinicionClasesRelacionadas();
			}
			
			if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCosteoDefinicionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCosteoDefinicion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCosteoDefinicion();
			}
			
			if(!this.isPermisoBusquedaTipoCosteoDefinicion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCosteoDefinicion,this.isPermisoPaginacionMedioTipoCosteoDefinicion,this.isPermisoPaginacionTodoTipoCosteoDefinicion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCosteoDefinicionConstantesFunciones.getTiposSeleccionarTipoCosteoDefinicion());
				
				this.tiposColumnasSelect=TipoCosteoDefinicionConstantesFunciones.getTiposSeleccionarTipoCosteoDefinicion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCosteoDefinicion();				
				//this.tiposRelacionesSelect=TipoCosteoDefinicionConstantesFunciones.getTiposRelacionesTipoCosteoDefinicion(true);
				
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
			//if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCosteoDefinicion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCosteoDefinicion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCosteoDefinicion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteoDefinicion() ;
			
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
			
			
			this.definicionLogic=new DefinicionLogic(); 
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
				tipocosteodefinicionImplementable= (TipoCosteoDefinicionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCosteoDefinicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocosteodefinicionImplementableHome= (TipoCosteoDefinicionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCosteoDefinicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocosteodefinicions= new ArrayList<TipoCosteoDefinicion>();
			this.tipocosteodefinicionsEliminados= new ArrayList<TipoCosteoDefinicion>();
						
			this.isEsNuevoTipoCosteoDefinicion=false;
			this.esParaAccionDesdeFormularioTipoCosteoDefinicion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCosteoDefinicion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCosteoDefinicion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCosteoDefinicionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCosteoDefinicion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCosteoDefinicion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCosteoDefinicion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCosteoDefinicion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCosteoDefinicion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCosteoDefinicion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCosteoDefinicion")) {
				iIndex=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();	
				
				

				if(sTitle.equals("Definiciones")) {
					if(!DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCosteoDefinicion();

						this.cargarParteTabPanelRelacionadaDefinicion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCosteoDefinicion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDefinicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.cargarSessionConBeanSwingJInternalFrameDefinicion(false,true,iIndex);
		this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDefinicion();

		//this.jTabbedPaneRelacionesTipoCosteoDefinicion.updateUI();
		//this.jTabbedPaneRelacionesTipoCosteoDefinicion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCosteoDefinicion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Definicion")) {
				int row=this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
				jButtonDefinicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Definicion")) {

					if(this.isTienePermisosDefinicion && this.tipocosteodefinicionConstantesFunciones.mostrarDefinicionTipoCosteoDefinicion && !TipoCosteoDefinicionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Definiciones"+"("+DefinicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Definiciones");

						if(tipocosteodefinicionConstantesFunciones.resaltarDefinicionTipoCosteoDefinicion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocosteodefinicionConstantesFunciones.resaltarDefinicionTipoCosteoDefinicion);
						}

						jmenuItem.setEnabled(this.tipocosteodefinicionConstantesFunciones.activarDefinicionTipoCosteoDefinicion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Definicion"));

						

						this.jInternalFrameDetalleFormTipoCosteoDefinicion.jmenuDetalleTipoCosteoDefinicion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCosteoDefinicion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCosteoDefinicion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCosteoDefinicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCosteoDefinicionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCosteoDefinicion();
		
		this.cargarCombosFrameForeignKeyTipoCosteoDefinicion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCosteoDefinicion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCosteoDefinicion();
		}
	}
	
	
	
	public void jButtonNuevoTipoCosteoDefinicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
			
			if(jTableDatosTipoCosteoDefinicion.getRowCount()>=1) {
				jTableDatosTipoCosteoDefinicion.removeRowSelectionInterval(0, jTableDatosTipoCosteoDefinicion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCosteoDefinicion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCosteoDefinicion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCosteoDefinicion(true);			
			//this.tipocosteodefinicion=new TipoCosteoDefinicion();
			//this.tipocosteodefinicion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion() ;
			
			if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosteoDefinicion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocosteodefinicion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);				
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
			if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCosteoDefinicion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCosteoDefinicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCosteoDefinicion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCosteoDefinicion.getSelectedRows().length;			
			}
			
			tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCosteoDefinicion--;			
				//TipoCosteoDefinicion tipocosteodefinicionAux= new TipoCosteoDefinicion();			
				//tipocosteodefinicionAux.setId(this.iIdNuevoTipoCosteoDefinicion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCosteoDefinicion tipocosteodefinicionOrigen=new TipoCosteoDefinicion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCosteoDefinicion tipocosteodefinicionOrigen : tipocosteodefinicionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocosteodefinicionOrigen =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocosteodefinicionOrigen =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCosteoDefinicion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocosteodefinicion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCosteoDefinicion(tipocosteodefinicionOrigen,this.tipocosteodefinicion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().add(this.tipocosteodefinicionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocosteodefinicions.add(this.tipocosteodefinicionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
				
				this.jTableDatosTipoCosteoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCosteoDefinicion(), this.getIndiceNuevoTipoCosteoDefinicion());
				
				int iLastRow =  this.jTableDatosTipoCosteoDefinicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCosteoDefinicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCosteoDefinicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();									
		
			TipoCosteoDefinicion tipocosteodefinicionOrigen=new TipoCosteoDefinicion();
			TipoCosteoDefinicion tipocosteodefinicionDestino=new TipoCosteoDefinicion();
				
			tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCosteoDefinicion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocosteodefinicionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCosteoDefinicion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteodefinicionOrigen =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocosteodefinicionOrigen =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocosteodefinicionDestino =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocosteodefinicionDestino =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocosteodefinicionOrigen =tipocosteodefinicionsSeleccionados.get(0);
				tipocosteodefinicionDestino =tipocosteodefinicionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCosteoDefinicion(tipocosteodefinicionOrigen,tipocosteodefinicionDestino,true,false);
				
				tipocosteodefinicionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocosteodefinicionDestino,tipocosteodefinicionLogic.getTipoCosteoDefinicions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocosteodefinicionDestino,tipocosteodefinicions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
				
				//this.jTableDatosTipoCosteoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCosteoDefinicion(), this.getIndiceNuevoTipoCosteoDefinicion());
				
				int iLastRow =  this.jTableDatosTipoCosteoDefinicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCosteoDefinicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCosteoDefinicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCosteoDefinicion.isVisible();
			
			
			this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(!isVisible);
			this.jPanelPaginacionTipoCosteoDefinicion.setVisible(!isVisible);
			this.jPanelAccionesTipoCosteoDefinicion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCosteoDefinicion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCosteoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCosteoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCosteoDefinicion();
			
			this.abrirFrameOrderByTipoCosteoDefinicion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCosteoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCosteoDefinicion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCosteoDefinicion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCosteoDefinicion.setSize(this.jInternalFrameDetalleFormTipoCosteoDefinicion.iWidthFormulario,this.jInternalFrameDetalleFormTipoCosteoDefinicion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCosteoDefinicion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCosteoDefinicion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCosteoDefinicion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCosteoDefinicion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jContentPaneDetalleTipoCosteoDefinicion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jContentPaneDetalleTipoCosteoDefinicion.getWidth(),TipoCosteoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jContentPaneDetalleTipoCosteoDefinicion.getWidth(),TipoCosteoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jContentPaneDetalleTipoCosteoDefinicion.getWidth(),TipoCosteoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDefinicion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCosteoDefinicion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCosteoDefinicion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCosteoDefinicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCosteoDefinicion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCosteoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteoDefinicion,false,this);
				} else {
					this.jInternalFrameOrderByTipoCosteoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCosteoDefinicion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCosteoDefinicion);
				this.jInternalFrameOrderByTipoCosteoDefinicion.setVisible(false);
				this.jInternalFrameOrderByTipoCosteoDefinicion.setSelected(false);
				
				this.jInternalFrameOrderByTipoCosteoDefinicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCosteoDefinicion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCosteoDefinicion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCosteoDefinicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCosteoDefinicion==null) {
				
				this.jInternalFrameImportacionTipoCosteoDefinicion=new ImportacionJInternalFrame(TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCosteoDefinicion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCosteoDefinicion);
				this.jInternalFrameImportacionTipoCosteoDefinicion.setVisible(false);
				this.jInternalFrameImportacionTipoCosteoDefinicion.setSelected(false);


				this.jInternalFrameImportacionTipoCosteoDefinicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCosteoDefinicion"));
				this.jInternalFrameImportacionTipoCosteoDefinicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCosteoDefinicion"));
				this.jInternalFrameImportacionTipoCosteoDefinicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCosteoDefinicion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCosteoDefinicion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion==null) {
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion=new ReporteDinamicoJInternalFrame(TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCosteoDefinicion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion);
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosteoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosteoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosteoDefinicion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosteoDefinicion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDefinicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jContentPaneDetalleTipoCosteoDefinicion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCosteoDefinicion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCosteoDefinicion);
			
	       	this.jInternalFrameDetalleFormTipoCosteoDefinicion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCosteoDefinicion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCosteoDefinicion.dispose();
			//this.jInternalFrameDetalleFormTipoCosteoDefinicion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCosteoDefinicion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCosteoDefinicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCosteoDefinicion.setVisible(true);
	        this.jInternalFrameImportacionTipoCosteoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCosteoDefinicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCosteoDefinicion.setVisible(true);
	        this.jInternalFrameOrderByTipoCosteoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCosteoDefinicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCosteoDefinicion.setVisible(false);
	        this.jInternalFrameOrderByTipoCosteoDefinicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCosteoDefinicion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCosteoDefinicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCosteoDefinicion.setVisible(false);
	        this.jInternalFrameImportacionTipoCosteoDefinicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCosteoDefinicion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCosteoDefinicion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCosteoDefinicion(true);
			//this.isEsNuevoTipoCosteoDefinicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(false) ;
			
			if(tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosteoDefinicion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCosteoDefinicionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCosteoDefinicion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCosteoDefinicion(true);
			//this.isEsNuevoTipoCosteoDefinicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocosteodefinicion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(false) ;
			
			if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCosteoDefinicion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCosteoDefinicion(false);
			
			//if(!this.isEsNuevoTipoCosteoDefinicion) {								
				int intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
				
			}
			
			if(this.permiteMantenimiento(this.tipocosteodefinicion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCosteoDefinicion=true;
					this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
					this.isEsNuevoTipoCosteoDefinicion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCosteoDefinicion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCosteoDefinicion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(false);
				
				this.habilitarDeshabilitarControlesTipoCosteoDefinicion(false);
			
												
				
				if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCosteoDefinicion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,tipocosteodefinicionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCosteoDefinicion(this.tipocosteodefinicion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCosteoDefinicion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocosteodefinicionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocosteodefinicion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				this.tipocosteodefinicion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				this.tipocosteodefinicion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocosteodefinicion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCosteoDefinicionModel) this.jTableDatosTipoCosteoDefinicion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCosteoDefinicion=true;
				this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
				this.isEsNuevoTipoCosteoDefinicion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(false);
				
				this.habilitarDeshabilitarControlesTipoCosteoDefinicion(false);
				
				
				
				if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCosteoDefinicion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCosteoDefinicion.getRowCount()>=1) {
				jTableDatosTipoCosteoDefinicion.removeRowSelectionInterval(0, jTableDatosTipoCosteoDefinicion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCosteoDefinicion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(false) ;
			
			this.isEsNuevoTipoCosteoDefinicion=false;
			
			if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCosteoDefinicion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCosteoDefinicion(false);
				
				//SI ES MANUAL
				if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCosteoDefinicion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCosteoDefinicion--;			
			//TipoCosteoDefinicion tipocosteodefinicionAux= new TipoCosteoDefinicion();			
			//tipocosteodefinicionAux.setId(this.iIdNuevoTipoCosteoDefinicion);
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCosteoDefinicion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
			
			this.tipocosteodefinicion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().add(this.tipocosteodefinicionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocosteodefinicions.add(this.tipocosteodefinicionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
			
			this.jTableDatosTipoCosteoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCosteoDefinicion(), this.getIndiceNuevoTipoCosteoDefinicion());
			
			int iLastRow =  this.jTableDatosTipoCosteoDefinicion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCosteoDefinicion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCosteoDefinicion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCosteoDefinicion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosteoDefinicion();
			}
			
			//this.abrirFrameTreeTipoCosteoDefinicion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Costeo DefinicionES ?", "MANTENIMIENTO DE Tipo Costeo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCosteoDefinicion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCosteoDefinicion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocosteodefinicionReturnGeneral=tipocosteodefinicionLogic.procesarImportacionTipoCosteoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocosteodefinicionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCosteoDefinicionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCosteoDefinicion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCosteoDefinicion.setFileImportacion(this.jInternalFrameImportacionTipoCosteoDefinicion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCosteoDefinicion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCosteoDefinicion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCosteoDefinicion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCosteoDefinicion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		

		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCosteoDefinicionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCosteoDefinicionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteodefinicion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCosteoDefinicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCosteoDefinicion tipocosteodefinicion:tipocosteodefinicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocosteodefinicion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCosteoDefinicion tipocosteodefinicion:tipocosteodefinicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocosteodefinicion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCosteoDefinicion(row);				
			//	iRow++;
			//}				
			
			//for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCosteoDefinicion(tipocosteodefinicionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCosteoDefinicion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCosteoDefinicion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCosteoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCosteoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCosteoDefinicion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCosteoDefinicion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCosteoDefinicion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCosteoDefinicion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCosteoDefinicion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCosteoDefinicion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCosteoDefinicion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCosteoDefinicion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCosteoDefinicion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCosteoDefinicion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCosteoDefinicion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCosteoDefinicion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCosteoDefinicion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCosteoDefinicion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteoDefinicion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCosteoDefinicion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCosteoDefinicion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCosteoDefinicion();
		
		this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCosteoDefinicion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteoDefinicion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosteoDefinicion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosteoDefinicion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCosteoDefinicion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCosteoDefinicion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jCheckBoxPostAccionNuevoTipoCosteoDefinicion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCosteoDefinicion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCosteoDefinicion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.jCheckBoxPostAccionNuevoTipoCosteoDefinicion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.jCheckBoxPostAccionSinCerrarTipoCosteoDefinicion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.jCheckBoxPostAccionSinMensajeTipoCosteoDefinicion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCosteoDefinicion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCosteoDefinicion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCosteoDefinicion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCosteoDefinicion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCosteoDefinicion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCosteoDefinicion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCosteoDefinicion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCosteoDefinicion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCosteoDefinicion() throws Exception {
		try	{
			if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCosteoDefinicion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCosteoDefinicion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCosteoDefinicion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCosteoDefinicion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCosteoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCosteoDefinicion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCosteoDefinicion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCosteoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCosteoDefinicion.addItem(reporte);
			}
			
			
			if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCosteoDefinicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCosteoDefinicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCosteoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCosteoDefinicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCosteoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCosteoDefinicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosteoDefinicion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCosteoDefinicion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCosteoDefinicion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCosteoDefinicion(Boolean esInicializar) throws Exception {				
		if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCosteoDefinicion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCosteoDefinicion() throws Exception {
		this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCosteoDefinicion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCosteoDefinicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCosteoDefinicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCosteoDefinicionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoDefinicionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCosteoDefinicionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCosteoDefinicionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCosteoDefinicion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocosteodefinicionLogic.getTipoCosteoDefinicions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocosteodefinicions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCosteoDefinicion.setModel(new TipoCosteoDefinicionModel(this.tipocosteodefinicionLogic.getTipoCosteoDefinicions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCosteoDefinicion.setModel(new TipoCosteoDefinicionModel(this.tipocosteodefinicions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCosteoDefinicion!=null && this.jInternalFrameOrderByTipoCosteoDefinicion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCosteoDefinicion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoDefinicion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCosteoDefinicionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO,tipocosteodefinicionConstantesFunciones.resaltarSeleccionarTipoCosteoDefinicion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCosteoDefinicionConstantesFunciones.SCLASSWEBTITULO,tipocosteodefinicionConstantesFunciones.resaltarSeleccionarTipoCosteoDefinicion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoDefinicion,TipoCosteoDefinicionConstantesFunciones.LABEL_ID));

		if(this.tipocosteodefinicionConstantesFunciones.mostraridTipoCosteoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCosteoDefinicionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocosteodefinicionConstantesFunciones.resaltaridTipoCosteoDefinicion,this.tipocosteodefinicionConstantesFunciones.activaridTipoCosteoDefinicion,this,true,"idTipoCosteoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocosteodefinicionConstantesFunciones.resaltaridTipoCosteoDefinicion,this.tipocosteodefinicionConstantesFunciones.activaridTipoCosteoDefinicion,this,true,"idTipoCosteoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoDefinicion,TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO));

		if(this.tipocosteodefinicionConstantesFunciones.mostrarcodigoTipoCosteoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocosteodefinicionConstantesFunciones.resaltarcodigoTipoCosteoDefinicion,this.tipocosteodefinicionConstantesFunciones.activarcodigoTipoCosteoDefinicion,this,true,"codigoTipoCosteoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocosteodefinicionConstantesFunciones.resaltarcodigoTipoCosteoDefinicion,this.tipocosteodefinicionConstantesFunciones.activarcodigoTipoCosteoDefinicion,this,true,"codigoTipoCosteoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCosteoDefinicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoDefinicion,TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocosteodefinicionConstantesFunciones.mostrarnombreTipoCosteoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocosteodefinicionConstantesFunciones.resaltarnombreTipoCosteoDefinicion,this.tipocosteodefinicionConstantesFunciones.activarnombreTipoCosteoDefinicion,this,true,"nombreTipoCosteoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocosteodefinicionConstantesFunciones.resaltarnombreTipoCosteoDefinicion,this.tipocosteodefinicionConstantesFunciones.activarnombreTipoCosteoDefinicion,this,true,"nombreTipoCosteoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCosteoDefinicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDefinicion && this.tipocosteodefinicionConstantesFunciones.mostrarDefinicionTipoCosteoDefinicion && !TipoCosteoDefinicionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Definiciones");
				tableColumn.setHeaderValue("Definiciones");
				tableColumn.setCellRenderer(new DefinicionTableCell(tipocosteodefinicionConstantesFunciones.resaltarDefinicionTipoCosteoDefinicion,this,this.tipocosteodefinicionConstantesFunciones.activarDefinicionTipoCosteoDefinicion));
				tableColumn.setCellEditor(new DefinicionTableCell(tipocosteodefinicionConstantesFunciones.resaltarDefinicionTipoCosteoDefinicion,this,this.tipocosteodefinicionConstantesFunciones.activarDefinicionTipoCosteoDefinicion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCosteoDefinicion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCosteoDefinicion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCosteoDefinicion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCosteoDefinicion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCosteoDefinicion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCosteoDefinicion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCosteoDefinicion.moveColumn(this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCosteoDefinicion.moveColumn(this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCosteoDefinicion.moveColumn(this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCosteoDefinicion.moveColumn(this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCosteoDefinicion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCosteoDefinicion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCosteoDefinicion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCosteoDefinicion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCosteoDefinicion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCosteoDefinicion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocosteodefinicionLogic.getTipoCosteoDefinicions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocosteodefinicions.size()-1;
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
		//this.jTableDatosTipoCosteoDefinicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCosteoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCosteoDefinicion();
			
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
				
				//this.isEsNuevoTipoCosteoDefinicion=false;
					
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
				if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCosteoDefinicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCosteoDefinicion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocosteodefinicion.getsType().equals("DUPLICADO")
				   || this.tipocosteodefinicion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCosteoDefinicion=true;
				
				} else {
					this.isEsNuevoTipoCosteoDefinicion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocosteodefinicion.getId()>=0 && !this.tipocosteodefinicion.getIsNew()) {						
						this.isEsNuevoTipoCosteoDefinicion=false;
						
					} else {
						this.isEsNuevoTipoCosteoDefinicion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCosteoDefinicion(esRelaciones);						
				
				this.seleccionarTipoCosteoDefinicion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocosteodefinicion.getId()<0) {
					this.isEsNuevoTipoCosteoDefinicion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCosteoDefinicion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCosteoDefinicion(evt,rowIndex);
				}	
				
				if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCosteoDefinicion: " + this.dDif); 
					}
				}								
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCosteoDefinicion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocosteodefinicion)) {
					if(this.tipocosteodefinicion.getId()>0) {
						this.tipocosteodefinicion.setIsDeleted(true);
						
						this.tipocosteodefinicionsEliminados.add(this.tipocosteodefinicion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().remove(this.tipocosteodefinicion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocosteodefinicions.remove(this.tipocosteodefinicion);				
					}
					
					
					((TipoCosteoDefinicionModel) this.jTableDatosTipoCosteoDefinicion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCosteoDefinicion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCosteoDefinicion) {
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCosteoDefinicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCosteoDefinicion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCosteoDefinicion(this.tipocosteodefinicion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCosteoDefinicion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCosteoDefinicion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCosteoDefinicion(tipocosteodefinicion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCosteoDefinicion(tipocosteodefinicion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCosteoDefinicion(tipocosteodefinicion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteoDefinicion(tipocosteodefinicion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.setText(tipocosteodefinicion.getId().toString());
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.setText(tipocosteodefinicion.getcodigo());
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.setText(tipocosteodefinicion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCosteoDefinicion tipocosteodefinicionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocosteodefinicionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCosteoDefinicion tipocosteodefinicionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocosteodefinicionLocal=this.tipocosteodefinicion;
			} else {
				tipocosteodefinicionLocal=this.tipocosteodefinicionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocosteodefinicionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCosteoDefinicion(tipocosteodefinicionLocal,true);
					
					if(tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocosteodefinicionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocosteodefinicionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(tipocosteodefinicion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(tipocosteodefinicion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(tipocosteodefinicion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.getText()==null || this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.getText()=="" || this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.setText("0");
			}

			if(conColumnasBase) {tipocosteodefinicion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCosteoDefinicionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteoDefinicion.jLabelIdTipoCosteoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocosteodefinicion.setcodigo(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteoDefinicion.jLabelcodigoTipoCosteoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocosteodefinicion.setnombre(this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCosteoDefinicion.jLabelnombreTipoCosteoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicionBean,TipoCosteoDefinicion tipocosteodefinicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicionOrigen,TipoCosteoDefinicion tipocosteodefinicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocosteodefinicionOrigen.getId()!=null && !tipocosteodefinicionOrigen.getId().equals(0L))) {tipocosteodefinicion.setId(tipocosteodefinicionOrigen.getId());}}
			if(conDefault || (!conDefault && tipocosteodefinicionOrigen.getcodigo()!=null && !tipocosteodefinicionOrigen.getcodigo().equals(""))) {tipocosteodefinicion.setcodigo(tipocosteodefinicionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocosteodefinicionOrigen.getnombre()!=null && !tipocosteodefinicionOrigen.getnombre().equals(""))) {tipocosteodefinicion.setnombre(tipocosteodefinicionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.setText(tipocosteodefinicion.getId().toString());
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.setText(tipocosteodefinicion.getcodigo());
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.setText(tipocosteodefinicion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCosteoDefinicion(TipoCosteoDefinicionBean tipocosteodefinicionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.setText(tipocosteodefinicionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.setText(tipocosteodefinicionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.setText(tipocosteodefinicionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCosteoDefinicion(TipoCosteoDefinicionParameterReturnGeneral tipocosteodefinicionReturnGeneral,TipoCosteoDefinicionBean tipocosteodefinicionBean,Boolean conDefault) throws Exception { 
		try {
			TipoCosteoDefinicion tipocosteodefinicionLocal=new TipoCosteoDefinicion();
			
			tipocosteodefinicionLocal=tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocosteodefinicionLocal.getId()!=null && !tipocosteodefinicionLocal.getId().equals(0L))) {tipocosteodefinicionBean.setId(tipocosteodefinicionLocal.getId());}}
			if(conDefault || (!conDefault && tipocosteodefinicionLocal.getcodigo()!=null && !tipocosteodefinicionLocal.getcodigo().equals(""))) {tipocosteodefinicionBean.setcodigo(tipocosteodefinicionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocosteodefinicionLocal.getnombre()!=null && !tipocosteodefinicionLocal.getnombre().equals(""))) {tipocosteodefinicionBean.setnombre(tipocosteodefinicionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCosteoDefinicionGenerico(Long idTipoCosteoDefinicionSeleccionado,JComboBox jComboBoxTipoCosteoDefinicion,List<TipoCosteoDefinicion> tipocosteodefinicionsLocal)throws Exception {
		try {
			TipoCosteoDefinicion  tipocosteodefinicionTemp=null;

			for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionsLocal) {
				if(tipocosteodefinicionAux.getId()!=null && tipocosteodefinicionAux.getId().equals(idTipoCosteoDefinicionSeleccionado)) {
					tipocosteodefinicionTemp=tipocosteodefinicionAux;
					break;
				}
			}

			jComboBoxTipoCosteoDefinicion.setSelectedItem(tipocosteodefinicionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCosteoDefinicionGenerico(JComboBox jComboBoxTipoCosteoDefinicion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCosteoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCosteoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCosteoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCosteoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCosteoDefinicion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCosteoDefinicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCosteoDefinicion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCosteoDefinicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCosteoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCosteoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Definicion")) {
			jButtonDefinicionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocosteodefinicion=(TipoCosteoDefinicion) tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocosteodefinicion =(TipoCosteoDefinicion) tipocosteodefinicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCosteoDefinicion tipocosteodefinicionRow=new TipoCosteoDefinicion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocosteodefinicionRow=(TipoCosteoDefinicion) tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocosteodefinicionRow=(TipoCosteoDefinicion) tipocosteodefinicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDefinicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCosteoDefinicion tipocosteodefinicion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteodefinicion = (TipoCosteoDefinicion)this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocosteodefinicion = (TipoCosteoDefinicion)this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocosteodefinicion!=null) {
						this.tipocosteodefinicion = tipocosteodefinicion;
					} else {
						this.tipocosteodefinicion = new TipoCosteoDefinicion();
					}
				}

				if(this.isTienePermisosDefinicion && this.permiteMantenimiento(this.tipocosteodefinicion)) {
					DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFramePopup;
					} else {
						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame;
					}

					List<TipoCosteoDefinicion> tipocosteodefinicions=new ArrayList<TipoCosteoDefinicion>();
					tipocosteodefinicions.add(this.tipocosteodefinicion);
					if(!esRelacionado) {
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setConGuardarRelaciones(false);
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.cargarDefinicionBeanSwingJInternalFrame(tipocosteodefinicions,this.tipocosteodefinicion,definicionBeanSwingJInternalFrame,/*conInicializar,*/definicionBeanSwingJInternalFrame.definicionSessionBean.getConGuardarRelaciones(),definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado());
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");

						definicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DefinicionConstantesFunciones.ITAMANIOFILATABLA + (DefinicionConstantesFunciones.ITAMANIOFILATABLA/2));

						definicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCosteoDefinicion=(TitledBorder)this.jScrollPanelDatosTipoCosteoDefinicion.getBorder();
						TitledBorder titledBorderDefinicion=(TitledBorder)definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getBorder();

						titledBorderDefinicion.setTitle(titledBorderTipoCosteoDefinicion.getTitle() + " -> Definicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,definicionBeanSwingJInternalFrame);
						}

						definicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(definicionBeanSwingJInternalFrame);

						definicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Definicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion));			
			this.jButtonDuplicarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoCosteoDefinicion && this.isPermisoDuplicarTipoCosteoDefinicion));			
			this.jButtonCopiarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoCosteoDefinicion && this.isPermisoCopiarTipoCosteoDefinicion));
			this.jButtonVerFormTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoCosteoDefinicion && this.isPermisoVerFormTipoCosteoDefinicion));
			
			this.jButtonAbrirOrderByTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCosteoDefinicion && this.isPermisoOrdenTipoCosteoDefinicion));			
			
			this.jButtonNuevoRelacionesTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion));			
			this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoCosteoDefinicion && this.isPermisoActualizarTipoCosteoDefinicion));	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoCosteoDefinicion && this.isPermisoActualizarTipoCosteoDefinicion));	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoCosteoDefinicion && this.isPermisoEliminarTipoCosteoDefinicion));
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarTipoCosteoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCosteoDefinicion);							
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion));						
			this.jButtonDuplicarToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoCosteoDefinicion && this.isPermisoDuplicarTipoCosteoDefinicion));						
			this.jButtonCopiarToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoCosteoDefinicion && this.isPermisoCopiarTipoCosteoDefinicion));			
			this.jButtonVerFormToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoCosteoDefinicion && this.isPermisoVerFormTipoCosteoDefinicion));			
			this.jButtonAbrirOrderByToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCosteoDefinicion && this.isPermisoOrdenTipoCosteoDefinicion));
			this.jButtonNuevoRelacionesToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));			
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoCosteoDefinicion && this.isPermisoActualizarTipoCosteoDefinicion));	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoCosteoDefinicion  && this.isPermisoActualizarTipoCosteoDefinicion));	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoCosteoDefinicion && this.isPermisoEliminarTipoCosteoDefinicion));
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarToolBarTipoCosteoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCosteoDefinicion);				
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion));			
			this.jMenuItemDuplicarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoCosteoDefinicion && this.isPermisoDuplicarTipoCosteoDefinicion));			
			this.jMenuItemCopiarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoCosteoDefinicion && this.isPermisoCopiarTipoCosteoDefinicion));			
			this.jMenuItemVerFormTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoCosteoDefinicion && this.isPermisoVerFormTipoCosteoDefinicion));			
			this.jMenuItemAbrirOrderByTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCosteoDefinicion && this.isPermisoOrdenTipoCosteoDefinicion));			
			//this.jMenuItemMostrarOcultarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCosteoDefinicion && this.isPermisoOrdenTipoCosteoDefinicion));
			this.jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCosteoDefinicion && this.isPermisoOrdenTipoCosteoDefinicion));			
			//this.jMenuItemDetalleMostrarOcultarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCosteoDefinicion && this.isPermisoOrdenTipoCosteoDefinicion));			
			this.jMenuItemNuevoRelacionesTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion));			
			this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCosteoDefinicion && this.isPermisoNuevoTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));									
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemModificarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoCosteoDefinicion && this.isPermisoActualizarTipoCosteoDefinicion));	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemActualizarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoCosteoDefinicion && this.isPermisoActualizarTipoCosteoDefinicion));	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemEliminarTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoCosteoDefinicion && this.isPermisoEliminarTipoCosteoDefinicion));
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemCancelarTipoCosteoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCosteoDefinicion);				
			}
			
			this.jMenuItemGuardarCambiosTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));						
			this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=this.jButtonNuevoTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCosteoDefinicion=this.jButtonDuplicarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaCopiarTipoCosteoDefinicion=this.jButtonCopiarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaVerFormTipoCosteoDefinicion=this.jButtonVerFormTipoCosteoDefinicion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCosteoDefinicion=this.jButtonAbrirOrderByTipoCosteoDefinicion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=this.jButtonNuevoRelacionesTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=this.jButtonModificarTipoCosteoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=this.jButtonNuevoToolBarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=this.jButtonNuevoRelacionesToolBarTipoCosteoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarToolBarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarToolBarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarToolBarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarToolBarTipoCosteoDefinicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=this.jButtonGuardarCambiosToolBarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=this.jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=this.jMenuItemNuevoTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=this.jMenuItemNuevoRelacionesTipoCosteoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemModificarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemActualizarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemEliminarTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemCancelarTipoCosteoDefinicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=this.jMenuItemGuardarCambiosTipoCosteoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCosteoDefinicion(Boolean esInicializar) {
		if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCosteoDefinicion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCosteoDefinicion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCosteoDefinicion() {
		this.jButtonNuevoTipoCosteoDefinicion.setVisible(this.isPermisoNuevoTipoCosteoDefinicion);			
		this.jButtonDuplicarTipoCosteoDefinicion.setVisible(this.isPermisoDuplicarTipoCosteoDefinicion);			
		this.jButtonCopiarTipoCosteoDefinicion.setVisible(this.isPermisoCopiarTipoCosteoDefinicion);			
		this.jButtonVerFormTipoCosteoDefinicion.setVisible(this.isPermisoVerFormTipoCosteoDefinicion);			
		
		this.jButtonAbrirOrderByTipoCosteoDefinicion.setVisible(this.isPermisoOrdenTipoCosteoDefinicion);					
		
		this.jButtonNuevoRelacionesTipoCosteoDefinicion.setVisible(this.isPermisoNuevoTipoCosteoDefinicion);			
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarTipoCosteoDefinicion.setVisible(this.isPermisoActualizarTipoCosteoDefinicion);	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarTipoCosteoDefinicion.setVisible(this.isPermisoActualizarTipoCosteoDefinicion);	
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarTipoCosteoDefinicion.setVisible(this.isPermisoEliminarTipoCosteoDefinicion);
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarTipoCosteoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCosteoDefinicion);						
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.setVisible(this.isPermisoGuardarCambiosTipoCosteoDefinicion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.setVisible(this.isPermisoActualizarTipoCosteoDefinicion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCosteoDefinicion() {
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarTipoCosteoDefinicion.setVisible(this.isPermisoActualizarTipoCosteoDefinicion);	
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarTipoCosteoDefinicion.setVisible(this.isPermisoActualizarTipoCosteoDefinicion);	
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarTipoCosteoDefinicion.setVisible(this.isPermisoEliminarTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarTipoCosteoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCosteoDefinicion);							
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCosteoDefinicion && this.isPermisoGuardarCambiosTipoCosteoDefinicion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCosteoDefinicion() {
		if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCosteoDefinicion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCosteoDefinicion() {
	}
	
	public void jTableDatosTipoCosteoDefinicionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCosteoDefinicion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCosteoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.gettipocosteodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosteodefinicion==null) {
						this.tipocosteodefinicion = new TipoCosteoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
				}

				if(this.tipocosteodefinicion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocosteodefinicion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosteoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCosteoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.gettipocosteodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosteodefinicion==null) {
						this.tipocosteodefinicion = new TipoCosteoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
				}

				if(this.tipocosteodefinicion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocosteodefinicion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosteoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCosteoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.gettipocosteodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocosteodefinicion==null) {
						this.tipocosteodefinicion = new TipoCosteoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);
				}

				if(this.tipocosteodefinicion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocosteodefinicion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCosteoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCosteoDefinicion() {
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.dispose();
			this.jInternalFrameDetalleFormTipoCosteoDefinicion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
			this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.dispose();
			this.jInternalFrameReporteDinamicoTipoCosteoDefinicion=null;
		}
		
		if(this.jInternalFrameImportacionTipoCosteoDefinicion!=null) {
			this.jInternalFrameImportacionTipoCosteoDefinicion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCosteoDefinicion.dispose();
			this.jInternalFrameImportacionTipoCosteoDefinicion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCosteoDefinicion();
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCosteoDefinicion")) {
				jButtonDuplicarTipoCosteoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCosteoDefinicion")) {
				jButtonCopiarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCosteoDefinicion")) {
				jButtonVerFormTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCosteoDefinicion")) {
				jButtonDuplicarTipoCosteoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCosteoDefinicion")) {
				jButtonDuplicarTipoCosteoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCosteoDefinicion")) {
				jButtonModificarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCosteoDefinicion")) {
				jButtonModificarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCosteoDefinicion")) {
				jButtonModificarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCosteoDefinicion")) {
				jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCosteoDefinicion")) {
				jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCosteoDefinicion")) {
				jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCosteoDefinicion")) {
				jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCosteoDefinicion")) {
				jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCosteoDefinicion")) {
				jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCosteoDefinicion")) {
				jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCosteoDefinicion")) {
				jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCosteoDefinicion")) {
				jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCosteoDefinicion")) {
				jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCosteoDefinicion")) {
				jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCosteoDefinicion")) {
				jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCosteoDefinicion")) {
				jButtonMostrarOcultarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCosteoDefinicion")) {
				jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCosteoDefinicion")) {
				jButtonCopiarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCosteoDefinicion")) {
				jButtonVerFormTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCosteoDefinicion")) {
				jButtonCopiarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCosteoDefinicion")) {
				jButtonVerFormTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCosteoDefinicion")) {
				jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCosteoDefinicion")) {
				jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCosteoDefinicion")) {
				jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCosteoDefinicion")) {
				jButtonAnterioresTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCosteoDefinicion")) {
				jButtonAnterioresTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCosteoDefinicion")) {
				jButtonAnterioresTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCosteoDefinicion")) {
				jButtonSiguientesTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCosteoDefinicion")) {
				jButtonSiguientesTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCosteoDefinicion")) {
				jButtonSiguientesTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCosteoDefinicion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCosteoDefinicion")) {
				jButtonAbrirOrderByTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCosteoDefinicion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCosteoDefinicion")) {
				jButtonMostrarOcultarTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCosteoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCosteoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCosteoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCosteoDefinicion")) {
				jButtonCerrarReporteDinamicoTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCosteoDefinicion")) {
				jButtonGenerarReporteDinamicoTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCosteoDefinicion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCosteoDefinicion")) {
				jButtonCerrarImportacionTipoCosteoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCosteoDefinicion")) {
				
				jButtonGenerarImportacionTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCosteoDefinicion")) {
				
				jButtonAbrirImportacionTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCosteoDefinicion")) {
				jComboBoxTiposAccionesTipoCosteoDefinicionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCosteoDefinicion")) {
				jComboBoxTiposRelacionesTipoCosteoDefinicionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCosteoDefinicion")) {
				jComboBoxTiposAccionesTipoCosteoDefinicionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCosteoDefinicion")) {
				
				jComboBoxTiposSeleccionarTipoCosteoDefinicionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCosteoDefinicion")) {
				jTextFieldValorCampoGeneralTipoCosteoDefinicionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCosteoDefinicion")) {
				jButtonAbrirOrderByTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCosteoDefinicion")) {
				jButtonAbrirOrderByTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCosteoDefinicion")) {
				jButtonCerrarOrderByTipoCosteoDefinicionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCosteoDefinicionBusqueda")) {
				this.jButtonidTipoCosteoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCosteoDefinicionBusqueda")) {
				this.jButtoncodigoTipoCosteoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCosteoDefinicionBusqueda")) {
				this.jButtonnombreTipoCosteoDefinicionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCosteoDefinicion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCosteoDefinicion tipocosteodefinicionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocosteodefinicionLocal=this.tipocosteodefinicion;
			} else {
				tipocosteodefinicionLocal=this.tipocosteodefinicionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
							
				
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
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
			
			


			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoDefinicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
								
						
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
								
				
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
							
				
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
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
			
			


			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
								
				
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoDefinicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCosteoDefinicion")) {
					jCheckBoxSeleccionarTodosTipoCosteoDefinicionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCosteoDefinicion")) {
					jCheckBoxSeleccionadosTipoCosteoDefinicionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCosteoDefinicion")) {
					
				}
				
				


				
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
												
				
				


				
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoDefinicionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
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
			
			


			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocosteodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocosteodefinicion);
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
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
				
				


				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCosteoDefinicion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCosteoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCosteoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocosteodefinicionAnterior =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCosteoDefinicion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCosteoDefinicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCosteoDefinicion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocosteodefinicion =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocosteodefinicion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCosteoDefinicion")) {
				
				}
				
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCosteoDefinicion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCosteoDefinicion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCosteoDefinicion")) {
			
			}
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCosteoDefinicion();
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCosteoDefinicion")) {
				jButtonDuplicarTipoCosteoDefinicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCosteoDefinicion")) {
				jButtonCopiarTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCosteoDefinicion")) {
				jButtonVerFormTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCosteoDefinicion")) {
				jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCosteoDefinicion")) {
				jButtonModificarTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCosteoDefinicion")) {
				jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCosteoDefinicion")) {
				jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCosteoDefinicion")) {
				jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCosteoDefinicion")) {
				jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCosteoDefinicion")) {
				jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCosteoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCosteoDefinicion")) {
				jButtonAbrirOrderByTipoCosteoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCosteoDefinicion")) {
				jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCosteoDefinicion")) {
				jButtonAnterioresTipoCosteoDefinicionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCosteoDefinicion")) {
				jButtonSiguientesTipoCosteoDefinicionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCosteoDefinicionBusqueda")) {
				this.jButtonidTipoCosteoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCosteoDefinicionBusqueda")) {
				this.jButtoncodigoTipoCosteoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCosteoDefinicionBusqueda")) {
				this.jButtonnombreTipoCosteoDefinicionBusquedaActionPerformed(evt);
			}
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCosteoDefinicion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCosteoDefinicion")) {
				closingInternalFrameTipoCosteoDefinicion();
				
			} else if(sTipo.equals("jButtonCancelarTipoCosteoDefinicion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCosteoDefinicion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCosteoDefinicionBeanSwingJInternalFrame jInternalFrameParent=(TipoCosteoDefinicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCosteoDefinicion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCosteoDefinicionActionPerformed(null);
			}
			
			TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocosteodefinicion,new Object(),this.tipocosteodefinicionParameterGeneral,this.tipocosteodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCosteoDefinicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCosteoDefinicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCosteoDefinicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocosteodefinicion)) {
			if(!esControlTabla) {
				if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);			
				}
				
				if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocosteodefinicionReturnGeneral=tipocosteodefinicionLogic.procesarEventosTipoCosteoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteodefinicionLogic.getTipoCosteoDefinicions(),this.tipocosteodefinicion,this.tipocosteodefinicionParameterGeneral,this.isEsNuevoTipoCosteoDefinicion,classes);//this.tipocosteodefinicionLogic.getTipoCosteoDefinicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral,this.tipocosteodefinicionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCosteoDefinicion(classes,this.tipocosteodefinicionReturnGeneral,this.tipocosteodefinicionBean,false);
					}
						
					if(this.tipocosteodefinicionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion());	
					}
						
					if(this.tipocosteodefinicionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion(),classes);//this.tipocosteodefinicionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCosteoDefinicion(this.tipocosteodefinicion,classes);//this.tipocosteodefinicionBean);									
				}
			
				if(TipoCosteoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCosteoDefinicion(this.tipocosteodefinicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCosteoDefinicion(this.tipocosteodefinicion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocosteodefinicionAnterior!=null) {
						this.tipocosteodefinicion=this.tipocosteodefinicionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocosteodefinicionReturnGeneral=tipocosteodefinicionLogic.procesarEventosTipoCosteoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteodefinicionLogic.getTipoCosteoDefinicions(),this.tipocosteodefinicion,this.tipocosteodefinicionParameterGeneral,this.isEsNuevoTipoCosteoDefinicion,classes);//this.tipocosteodefinicionLogic.getTipoCosteoDefinicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocosteodefinicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion(),tipocosteodefinicionLogic.getTipoCosteoDefinicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion(),this.tipocosteodefinicions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCosteoDefinicion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCosteoDefinicion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCosteoDefinicion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCosteoDefinicion() throws Exception {
		
		TipoCosteoDefinicionModel tipocosteodefinicionModel=(TipoCosteoDefinicionModel)this.jTableDatosTipoCosteoDefinicion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocosteodefinicionModel.tipocosteodefinicions=this.tipocosteodefinicionLogic.getTipoCosteoDefinicions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocosteodefinicionModel.tipocosteodefinicions=this.tipocosteodefinicions;
		}
		
		
		((TipoCosteoDefinicionModel) this.jTableDatosTipoCosteoDefinicion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCosteoDefinicion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocosteodefinicionAnterior(),this.tipocosteodefinicionLogic.getTipoCosteoDefinicions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocosteodefinicionAnterior(),this.tipocosteodefinicions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCosteoDefinicion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipocosteodefinicion.getDefinicions());
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
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
										
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteodefinicion,new Object(),generalEntityParameterGeneral,this.tipocosteodefinicionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCosteoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoCosteoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCosteoDefinicionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCosteoDefinicion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCosteoDefinicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCosteoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocosteodefinicion,new Object(),generalEntityParameterGeneral,this.tipocosteodefinicionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCosteoDefinicion(TipoCosteoDefinicionBean tipocosteodefinicionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipocosteodefinicion.getDefinicions());
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCosteoDefinicion(ArrayList<Classe> classes,TipoCosteoDefinicionReturnGeneral tipocosteodefinicionReturnGeneral,TipoCosteoDefinicionBean tipocosteodefinicionBean,Boolean conDefault) throws Exception {
		
			this.tipocosteodefinicionBean.setDefinicions(tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion().getDefinicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					tipocosteodefinicion.setDefinicions(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocosteodefinicion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion = new TipoCosteoDefinicionDetalleFormJInternalFrame(jDesktopPane,this.tipocosteodefinicionSessionBean.getConGuardarRelaciones(),this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.setVisible(false);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.tipocosteodefinicionLogic=this.tipocosteodefinicionLogic;
		
		this.cargarCombosFrameForeignKeyTipoCosteoDefinicion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCosteoDefinicion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCosteoDefinicion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCosteoDefinicion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCosteoDefinicion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCosteoDefinicion"));
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarTipoCosteoDefinicion"));

		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarToolBarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCosteoDefinicion"));
					
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemModificarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCosteoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoCosteoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarToolBarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCosteoDefinicion"));
						
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemActualizarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCosteoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarTipoCosteoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCosteoDefinicion"));
								
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemEliminarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCosteoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarTipoCosteoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCosteoDefinicion"));
					
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemCancelarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCosteoDefinicion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemDetalleCerrarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCosteoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosteoDefinicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosteoDefinicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCosteoDefinicion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonidTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCosteoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtoncodigoTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCosteoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonnombreTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCosteoDefinicionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCosteoDefinicion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCosteoDefinicion"));
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCosteoDefinicion"));
		}
		
		this.jTableDatosTipoCosteoDefinicion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCosteoDefinicion"));
		
		this.jTableDatosTipoCosteoDefinicion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCosteoDefinicion"));
		
		this.jButtonNuevoTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoTipoCosteoDefinicion"));
		
		this.jButtonDuplicarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"DuplicarTipoCosteoDefinicion"));
		
		this.jButtonCopiarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"CopiarTipoCosteoDefinicion"));
		
		this.jButtonVerFormTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"VerFormTipoCosteoDefinicion"));
		
		
		this.jButtonNuevoToolBarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCosteoDefinicion"));
			
		this.jButtonDuplicarToolBarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCosteoDefinicion"));
			
		this.jMenuItemNuevoTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCosteoDefinicion"));
			
		this.jMenuItemDuplicarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCosteoDefinicion"));		
		
		
		this.jButtonNuevoRelacionesTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCosteoDefinicion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCosteoDefinicion"));
			
		this.jMenuItemNuevoRelacionesTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCosteoDefinicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarTipoCosteoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonModificarToolBarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCosteoDefinicion"));
			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemModificarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCosteoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoCosteoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonActualizarToolBarTipoCosteoDefinicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCosteoDefinicion"));
				
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemActualizarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCosteoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarTipoCosteoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonEliminarToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCosteoDefinicion"));
						
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemEliminarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCosteoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarTipoCosteoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonCancelarToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCosteoDefinicion"));
			
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemCancelarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCosteoDefinicion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCosteoDefinicion"));		
		
		
		this.jButtonCerrarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarTipoCosteoDefinicion"));
		
		
		this.jButtonCerrarToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCosteoDefinicion"));
			
		this.jMenuItemCerrarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCosteoDefinicion"));
			
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jMenuItemDetalleCerrarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCosteoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCosteoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCosteoDefinicion"));
		}
		
		this.jButtonCopiarToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCosteoDefinicion"));
			
		this.jButtonVerFormToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCosteoDefinicion"));
		
		this.jMenuItemGuardarCambiosTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCosteoDefinicion"));
			
		this.jMenuItemCopiarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCosteoDefinicion"));		
		
		this.jMenuItemVerFormTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCosteoDefinicion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCosteoDefinicion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCosteoDefinicion"));
			
		this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCosteoDefinicion"));		
		
		
		
		this.jButtonRecargarInformacionTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCosteoDefinicion"));
					
		this.jButtonRecargarInformacionToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCosteoDefinicion"));
		
		this.jMenuItemRecargarInformacionTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCosteoDefinicion"));		
		
		
		
		this.jButtonAnterioresTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"AnterioresTipoCosteoDefinicion"));
		
		
		this.jButtonAnterioresToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCosteoDefinicion"));
		
		this.jMenuItemAnterioresTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCosteoDefinicion"));		
		
		
		this.jButtonSiguientesTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"SiguientesTipoCosteoDefinicion"));
		
		
		this.jButtonSiguientesToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCosteoDefinicion"));
			
		this.jMenuItemSiguientesTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCosteoDefinicion"));
			
		this.jMenuItemAbrirOrderByTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCosteoDefinicion"));
			
		this.jMenuItemMostrarOcultarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCosteoDefinicion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCosteoDefinicion"));
			
		this.jMenuItemDetalleMostarOcultarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCosteoDefinicion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCosteoDefinicion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCosteoDefinicion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCosteoDefinicion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCosteoDefinicion"));

		this.jCheckBoxSeleccionadosTipoCosteoDefinicion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCosteoDefinicion"));
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCosteoDefinicion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCosteoDefinicion"));
			
		this.jComboBoxTiposAccionesTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCosteoDefinicion"));
					
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCosteoDefinicion"));
			
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCosteoDefinicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonidTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCosteoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtoncodigoTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCosteoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonnombreTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCosteoDefinicionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCosteoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosteoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosteoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCosteoDefinicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosteoDefinicion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCosteoDefinicion"));				
			//this.jButtonGenerarReporteDinamicoTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCosteoDefinicion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCosteoDefinicion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCosteoDefinicion!=null) {
				this.jInternalFrameImportacionTipoCosteoDefinicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCosteoDefinicion"));
				this.jInternalFrameImportacionTipoCosteoDefinicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCosteoDefinicion"));
				this.jInternalFrameImportacionTipoCosteoDefinicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCosteoDefinicion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCosteoDefinicion"));
			
			this.jButtonAbrirOrderByToolBarTipoCosteoDefinicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCosteoDefinicion"));			
			
			if(this.jInternalFrameOrderByTipoCosteoDefinicion!=null) {
				this.jInternalFrameOrderByTipoCosteoDefinicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCosteoDefinicion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTabbedPaneRelacionesTipoCosteoDefinicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCosteoDefinicion"));
		
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
            		closingInternalFrameTipoCosteoDefinicion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCosteoDefinicion = (JInternalFrameBase)event.getSource();
	            	
	            TipoCosteoDefinicionBeanSwingJInternalFrame jInternalFrameParent=(TipoCosteoDefinicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCosteoDefinicion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCosteoDefinicionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCosteoDefinicion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCosteoDefinicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCosteoDefinicion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCosteoDefinicion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCosteoDefinicion";
		inputMap = this.jButtonNuevoTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCosteoDefinicion";
		inputMap = this.jButtonNuevoRelacionesTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCosteoDefinicionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCosteoDefinicion";
		inputMap = this.jButtonModificarTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCosteoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCosteoDefinicion";
		inputMap = this.jButtonActualizarTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCosteoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCosteoDefinicion";
		inputMap = this.jButtonEliminarTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCosteoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCosteoDefinicion";
		inputMap = this.jButtonCancelarTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCosteoDefinicion";
		inputMap = this.jButtonCerrarTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCosteoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCosteoDefinicion";
		inputMap = this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonGuardarCambiosTipoCosteoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCosteoDefinicion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCosteoDefinicionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCosteoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCosteoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCosteoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCosteoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCosteoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonidTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCosteoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtoncodigoTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCosteoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jButtonnombreTipoCosteoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCosteoDefinicionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCosteoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCosteoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCosteoDefinicionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCosteoDefinicion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCosteoDefinicion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
					tipocosteodefinicionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicions) {
					tipocosteodefinicionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCosteoDefinicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCosteoDefinicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
						tipocosteodefinicionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicions) {
						tipocosteodefinicionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCosteoDefinicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCosteoDefinicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoDefinicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCosteoDefinicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCosteoDefinicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCosteoDefinicion.getSelectedRows();
			
			TipoCosteoDefinicion tipocosteodefinicionLocal=new TipoCosteoDefinicion();
			
			//this.seleccionarTodosTipoCosteoDefinicion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocosteodefinicionLocal =(TipoCosteoDefinicion) this.tipocosteodefinicionLogic.getTipoCosteoDefinicions().toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocosteodefinicionLocal =(TipoCosteoDefinicion) this.tipocosteodefinicions.toArray()[this.jTableDatosTipoCosteoDefinicion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocosteodefinicionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
						tipocosteodefinicionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicions) {
						tipocosteodefinicionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCosteoDefinicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCosteoDefinicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCosteoDefinicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCosteoDefinicionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCosteoDefinicionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCosteoDefinicionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCosteoDefinicion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCosteoDefinicion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
				
						if(sTipoSeleccionar.equals(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocosteodefinicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocosteodefinicionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicions) {
					
						if(sTipoSeleccionar.equals(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocosteodefinicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocosteodefinicionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCosteoDefinicionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCosteoDefinicion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCosteoDefinicion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCosteoDefinicion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCosteoDefinicion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCosteoDefinicion(conSplash);
				
					this.generarReporteTipoCosteoDefinicionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCosteoDefinicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCosteoDefinicionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCosteoDefinicionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCosteoDefinicion();
				
				this.exportarTipoCosteoDefinicionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCosteoDefinicions();
				//this.importarTipoCosteoDefinicions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCosteoDefinicion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCosteoDefinicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Costeo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCosteoDefinicion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCosteoDefinicion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCosteoDefinicion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCosteoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCosteoDefinicion.jComboBoxTiposAccionesFormularioTipoCosteoDefinicion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCosteoDefinicion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCosteoDefinicion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCosteoDefinicionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCosteoDefinicion();
			
			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
			TipoCosteoDefinicion tipocosteodefinicion=new TipoCosteoDefinicion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCosteoDefinicion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCosteoDefinicion.getSelectedItem();
			
			
			
			
			tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocosteodefinicionsSeleccionados.size()==1) {
				for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionsSeleccionados) {
					tipocosteodefinicion=tipocosteodefinicionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Definicion")) {
					jButtonDefinicionActionPerformed(null,rowIndex,true,false,tipocosteodefinicion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCosteoDefinicion();
			
      		//this.finishProcessTipoCosteoDefinicion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCosteoDefinicionReturnGeneral() throws Exception {
		if(this.tipocosteodefinicionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocosteodefinicionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocosteodefinicionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocosteodefinicionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocosteodefinicionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocosteodefinicionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCosteoDefinicion(false);
		}
		
		if(this.tipocosteodefinicionReturnGeneral.getConRetornoLista() || this.tipocosteodefinicionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocosteodefinicionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocosteodefinicionLogic.setTipoCosteoDefinicions(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocosteodefinicionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocosteodefinicionLogic.setTipoCosteoDefinicion(this.tipocosteodefinicionReturnGeneral.getTipoCosteoDefinicion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCosteoDefinicion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCosteoDefinicion() throws Exception {
		
		
	}
	
	public ArrayList<TipoCosteoDefinicion> getTipoCosteoDefinicionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCosteoDefinicion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionLogic.getTipoCosteoDefinicions()) {
					if(tipocosteodefinicionAux.getIsSelected()) {
						tipocosteodefinicionsSeleccionados.add(tipocosteodefinicionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCosteoDefinicion tipocosteodefinicionAux:this.tipocosteodefinicions) {
					if(tipocosteodefinicionAux.getIsSelected()) {
						tipocosteodefinicionsSeleccionados.add(tipocosteodefinicionAux);				
					}
				}
			}
			
			if(tipocosteodefinicionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocosteodefinicionsSeleccionados.addAll(this.tipocosteodefinicionLogic.getTipoCosteoDefinicions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocosteodefinicionsSeleccionados.addAll(this.tipocosteodefinicions);				
					}
				}
			}
		} else {
			tipocosteodefinicionsSeleccionados.add(this.tipocosteodefinicion);
		}
		
		return tipocosteodefinicionsSeleccionados;
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
	
	public void generarReporteTipoCosteoDefinicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCosteoDefinicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCosteoDefinicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCosteoDefinicionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCosteoDefinicionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCosteoDefinicionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Costeo Definicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCosteoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCosteoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCosteoDefinicionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCosteoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCosteoDefinicion();
		
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCosteoDefinicion();
		
		
		//this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionsSeleccionados ,tipocosteodefinicionImplementable,tipocosteodefinicionImplementableHome);
	}
	
	public void mostrarImportacionTipoCosteoDefinicions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCosteoDefinicion();
		
		this.abrirFrameImportacionTipoCosteoDefinicion();		
		
			
		//this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionsSeleccionados ,tipocosteodefinicionImplementable,tipocosteodefinicionImplementableHome);
	}
	
	public void importarTipoCosteoDefinicions() throws Exception {		
	
	}
	
	public void exportarTipoCosteoDefinicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCosteoDefinicionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCosteoDefinicionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCosteoDefinicionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Costeo Definicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCosteoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteodefinicion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCosteoDefinicion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCosteoDefinicion(tipocosteodefinicionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocosteodefinicionAux.setsDetalleGeneralEntityReporte(tipocosteodefinicionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCosteoDefinicion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCosteoDefinicionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCosteoDefinicionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocosteodefinicion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosteodefinicion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosteodefinicion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocosteodefinicion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCosteoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteodefinicion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCosteoDefinicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCosteoDefinicion(row);				
				iRow++;
			}				
			
			for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCosteoDefinicion(tipocosteodefinicionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCosteoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();		
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocosteodefinicion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocosteodefinicions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocosteodefinicion");
			//elementRoot.appendChild(element);
		
			for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionsSeleccionados) {
				element = document.createElement("tipocosteodefinicion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCosteoDefinicion(tipocosteodefinicionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costeo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCosteoDefinicion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosteodefinicion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosteodefinicion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocosteodefinicion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCosteoDefinicion(TipoCosteoDefinicion tipocosteodefinicion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCosteoDefinicionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocosteodefinicion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCosteoDefinicionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocosteodefinicion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCosteoDefinicionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocosteodefinicion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCosteoDefinicionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocosteodefinicion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCosteoDefinicionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados=new ArrayList<TipoCosteoDefinicion>();
		
		tipocosteodefinicionsSeleccionados=this.getTipoCosteoDefinicionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCosteoDefinicion(tipocosteodefinicionsSeleccionados);
		
		this.generarReporteTipoCosteoDefinicions("Todos",tipocosteodefinicionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCosteoDefinicion(ArrayList<TipoCosteoDefinicion> tipocosteodefinicionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCosteoDefinicion tipocosteodefinicionAux:tipocosteodefinicionsSeleccionados) {
				tipocosteodefinicionAux.setsDetalleGeneralEntityReporte(tipocosteodefinicionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCosteoDefinicionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocosteodefinicionAux.setsDescripcionGeneralEntityReporte1(tipocosteodefinicionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCosteoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocosteodefinicionAux.setsDescripcionGeneralEntityReporte1(tipocosteodefinicionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCosteoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCosteoDefinicion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCosteoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCosteoDefinicion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCosteoDefinicionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=true;
		} else {
			this.actualizarEstadoPanelsTipoCosteoDefinicion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCosteoDefinicion=false;
			//this.isVisibilidadCeldaVerFormTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaDuplicarTipoCosteoDefinicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
			if(!tipocosteodefinicionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;												
			}
			
			this.jButtonCerrarTipoCosteoDefinicion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCosteoDefinicion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocosteodefinicion)) {
			this.isVisibilidadCeldaActualizarTipoCosteoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCosteoDefinicion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCosteoDefinicion() {
		this.isVisibilidadCeldaNuevoTipoCosteoDefinicion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCosteoDefinicion=false;
	}
	
	public void actualizarEstadoPanelsTipoCosteoDefinicion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteoDefinicion!=null) {
				this.jPanelPaginacionTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosTipoCosteoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosteoDefinicion!=null) {
				this.jPanelPaginacionTipoCosteoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosteoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosTipoCosteoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosteoDefinicion!=null) {
				this.jPanelPaginacionTipoCosteoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosteoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosTipoCosteoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCosteoDefinicion!=null) {
				this.jPanelPaginacionTipoCosteoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCosteoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteoDefinicion!=null) {
				this.jPanelPaginacionTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteoDefinicion!=null) {
				this.jPanelPaginacionTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCosteoDefinicion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCosteoDefinicion!=null) {
				this.jScrollPanelDatosTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCosteoDefinicion!=null) {
				this.jPanelPaginacionTipoCosteoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCosteoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCosteoDefinicion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocosteodefinicionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoCosteoDefinicionParaDefiniciones() throws Exception {
		Boolean isPaginaPopupDefinicion=false;

		try {

			if(this.tipocosteodefinicionSessionBean==null) {
				this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean=new DefinicionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean.setsPathNavegacionActual(tipocosteodefinicionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDefinicion=this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(true);
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(TipoCosteoDefinicionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoCosteoDefinicion(true);
			this.jInternalFrameDetalleFormTipoCosteoDefinicion.definicionSessionBean.setlidTipoCosteoDefinicionActual(this.idTipoCosteoDefinicionActual);

			tipocosteodefinicionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCosteoDefinicion(true);
			tipocosteodefinicionSessionBean.setlIdTipoCosteoDefinicionActualForeignKey(this.idTipoCosteoDefinicionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCosteoDefinicionSessionBean tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
		
		if(this.tipocosteodefinicionSessionBean==null) {
			this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
		}
		
		this.tipocosteodefinicionSessionBean.setsUltimaBusquedaTipoCosteoDefinicion(this.getsAccionBusqueda());
		this.tipocosteodefinicionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocosteodefinicionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCosteoDefinicionSessionBean tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
		
		if(this.tipocosteodefinicionSessionBean==null) {
			this.tipocosteodefinicionSessionBean=new TipoCosteoDefinicionSessionBean();
		}
		
		if(this.tipocosteodefinicionSessionBean.getsUltimaBusquedaTipoCosteoDefinicion()!=null&&!this.tipocosteodefinicionSessionBean.getsUltimaBusquedaTipoCosteoDefinicion().equals("")) {
			this.setsAccionBusqueda(tipocosteodefinicionSessionBean.getsUltimaBusquedaTipoCosteoDefinicion());
			this.setiNumeroPaginacion(tipocosteodefinicionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocosteodefinicionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocosteodefinicionSessionBean.setsUltimaBusquedaTipoCosteoDefinicion("");
		this.tipocosteodefinicionSessionBean.setiNumeroPaginacion(TipoCosteoDefinicionConstantesFunciones.INUMEROPAGINACION);
		this.tipocosteodefinicionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCosteoDefinicion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCosteoDefinicion() {
		this.updateBorderResaltarBusquedasFormularioTipoCosteoDefinicion();
		this.updateVisibilidadBusquedasFormularioTipoCosteoDefinicion();
		this.updateHabilitarBusquedasFormularioTipoCosteoDefinicion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCosteoDefinicion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCosteoDefinicion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCosteoDefinicion() {
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
	
	public void updateControlesFormularioTipoCosteoDefinicion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCosteoDefinicion();
		this.updateVisibilidadResaltarControlesFormularioTipoCosteoDefinicion();
		this.updateHabilitarResaltarControlesFormularioTipoCosteoDefinicion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCosteoDefinicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocosteodefinicionConstantesFunciones.resaltaridTipoCosteoDefinicion!=null && this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.setBorder(this.tipocosteodefinicionConstantesFunciones.resaltaridTipoCosteoDefinicion);}
		if(this.tipocosteodefinicionConstantesFunciones.resaltarcodigoTipoCosteoDefinicion!=null && this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.setBorder(this.tipocosteodefinicionConstantesFunciones.resaltarcodigoTipoCosteoDefinicion);}
		if(this.tipocosteodefinicionConstantesFunciones.resaltarnombreTipoCosteoDefinicion!=null && this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.setBorder(this.tipocosteodefinicionConstantesFunciones.resaltarnombreTipoCosteoDefinicion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCosteoDefinicion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
	
		//this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.setVisible(this.tipocosteodefinicionConstantesFunciones.mostraridTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jPanelidTipoCosteoDefinicion.setVisible(this.tipocosteodefinicionConstantesFunciones.mostraridTipoCosteoDefinicion);
		//this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.setVisible(this.tipocosteodefinicionConstantesFunciones.mostrarcodigoTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jPanelcodigoTipoCosteoDefinicion.setVisible(this.tipocosteodefinicionConstantesFunciones.mostrarcodigoTipoCosteoDefinicion);
		//this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.setVisible(this.tipocosteodefinicionConstantesFunciones.mostrarnombreTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jPanelnombreTipoCosteoDefinicion.setVisible(this.tipocosteodefinicionConstantesFunciones.mostrarnombreTipoCosteoDefinicion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCosteoDefinicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCosteoDefinicion!=null) {
	
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldidTipoCosteoDefinicion.setEnabled(this.tipocosteodefinicionConstantesFunciones.activaridTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldcodigoTipoCosteoDefinicion.setEnabled(this.tipocosteodefinicionConstantesFunciones.activarcodigoTipoCosteoDefinicion);
		this.jInternalFrameDetalleFormTipoCosteoDefinicion.jTextFieldnombreTipoCosteoDefinicion.setEnabled(this.tipocosteodefinicionConstantesFunciones.activarnombreTipoCosteoDefinicion);
		}
	}
	
		
}