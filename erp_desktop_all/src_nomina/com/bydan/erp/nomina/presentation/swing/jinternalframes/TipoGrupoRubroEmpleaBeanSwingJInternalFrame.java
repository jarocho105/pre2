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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.TipoGrupoRubroEmpleaConstantesFunciones;
import com.bydan.erp.nomina.util.TipoGrupoRubroEmpleaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoGrupoRubroEmpleaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoGrupoRubroEmpleaBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoGrupoRubroEmpleaBeanSwingJInternalFrame extends TipoGrupoRubroEmpleaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGrupoRubroEmpleaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGrupoRubroEmplea> tipogruporubroempleaValidator = new ClassValidator<TipoGrupoRubroEmplea>(TipoGrupoRubroEmplea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGrupoRubroEmplea tipogruporubroemplea;	
	public TipoGrupoRubroEmplea tipogruporubroempleaAux;
	public TipoGrupoRubroEmplea tipogruporubroempleaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGrupoRubroEmplea tipogruporubroempleaTotales;
	public Long idTipoGrupoRubroEmpleaActual;
	public Long iIdNuevoTipoGrupoRubroEmplea=0L;
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
	
	public Boolean isPermisoTodoTipoGrupoRubroEmplea;
	public Boolean isPermisoNuevoTipoGrupoRubroEmplea;
	public Boolean isPermisoActualizarTipoGrupoRubroEmplea;
	public Boolean isPermisoActualizarOriginalTipoGrupoRubroEmplea;
	public Boolean isPermisoEliminarTipoGrupoRubroEmplea;
	public Boolean isPermisoGuardarCambiosTipoGrupoRubroEmplea;
	public Boolean isPermisoConsultaTipoGrupoRubroEmplea;
	public Boolean isPermisoBusquedaTipoGrupoRubroEmplea;
	public Boolean isPermisoReporteTipoGrupoRubroEmplea;
	public Boolean isPermisoPaginacionMedioTipoGrupoRubroEmplea;
	public Boolean isPermisoPaginacionAltoTipoGrupoRubroEmplea;
	public Boolean isPermisoPaginacionTodoTipoGrupoRubroEmplea;
	public Boolean isPermisoCopiarTipoGrupoRubroEmplea;
	public Boolean isPermisoVerFormTipoGrupoRubroEmplea;
	public Boolean isPermisoDuplicarTipoGrupoRubroEmplea;
	public Boolean isPermisoOrdenTipoGrupoRubroEmplea;
	
	
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
	
	public TipoGrupoRubroEmpleaParameterReturnGeneral tipogruporubroempleaReturnGeneral;
	public TipoGrupoRubroEmpleaParameterReturnGeneral tipogruporubroempleaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGrupoRubroEmplea=false;
	public Boolean esParaAccionDesdeFormularioTipoGrupoRubroEmplea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGrupoRubroEmpleaLogic tipogruporubroempleaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGrupoRubroEmplea tipogruporubroempleaBean;
	public TipoGrupoRubroEmpleaConstantesFunciones tipogruporubroempleaConstantesFunciones;
	//public TipoGrupoRubroEmpleaParameterReturnGeneral tipogruporubroempleaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoGrupoRubroEmplea> tipogruporubroempleas;	
	//public List<TipoGrupoRubroEmplea> tipogruporubroempleasEliminados;
	//public List<TipoGrupoRubroEmplea> tipogruporubroempleasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea=true;
	public Boolean isVisibilidadCeldaCopiarTipoGrupoRubroEmplea=true;
	public Boolean isVisibilidadCeldaVerFormTipoGrupoRubroEmplea=true;
	public Boolean isVisibilidadCeldaOrdenTipoGrupoRubroEmplea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
	public Boolean isVisibilidadCeldaModificarTipoGrupoRubroEmplea=false;
	public Boolean isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=false;
	public Boolean isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
	public Boolean isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=false;
	public Boolean isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;	
	
	
	
	public Long getiIdNuevoTipoGrupoRubroEmplea() {
		return this.iIdNuevoTipoGrupoRubroEmplea;
	}

	public void setiIdNuevoTipoGrupoRubroEmplea(Long iIdNuevoTipoGrupoRubroEmplea) {
		this.iIdNuevoTipoGrupoRubroEmplea = iIdNuevoTipoGrupoRubroEmplea;
	}
	
	public Long getidTipoGrupoRubroEmpleaActual() {
		return this.idTipoGrupoRubroEmpleaActual;
	}

	public void setidTipoGrupoRubroEmpleaActual(Long idTipoGrupoRubroEmpleaActual) {
		this.idTipoGrupoRubroEmpleaActual = idTipoGrupoRubroEmpleaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGrupoRubroEmplea gettipogruporubroemplea() {
		return this.tipogruporubroemplea;
	}

	public void settipogruporubroemplea(TipoGrupoRubroEmplea tipogruporubroemplea) {
		this.tipogruporubroemplea = tipogruporubroemplea;
	}
	
	public TipoGrupoRubroEmplea gettipogruporubroempleaAux() {
		return this.tipogruporubroempleaAux;
	}

	public void settipogruporubroempleaAux(TipoGrupoRubroEmplea tipogruporubroempleaAux) {
		this.tipogruporubroempleaAux = tipogruporubroempleaAux;
	}				
	
	public TipoGrupoRubroEmplea gettipogruporubroempleaAnterior() {
		return this.tipogruporubroempleaAnterior;
	}

	public void settipogruporubroempleaAnterior(TipoGrupoRubroEmplea tipogruporubroempleaAnterior) {
		this.tipogruporubroempleaAnterior = tipogruporubroempleaAnterior;
	}	
	
	public TipoGrupoRubroEmplea gettipogruporubroempleaTotales() {
		return this.tipogruporubroempleaTotales;
	}

	public void settipogruporubroempleaTotales(TipoGrupoRubroEmplea tipogruporubroempleaTotales) {
		this.tipogruporubroempleaTotales = tipogruporubroempleaTotales;
	}	
	
	public TipoGrupoRubroEmplea gettipogruporubroempleaBean() {
		return this.tipogruporubroempleaBean;
	}

	public void settipogruporubroempleaBean(TipoGrupoRubroEmplea tipogruporubroempleaBean) {
		this.tipogruporubroempleaBean = tipogruporubroempleaBean;
	}	
	
	public TipoGrupoRubroEmpleaParameterReturnGeneral gettipogruporubroempleaReturnGeneral() {
		return this.tipogruporubroempleaReturnGeneral;
	}

	public void settipogruporubroempleaReturnGeneral(TipoGrupoRubroEmpleaParameterReturnGeneral tipogruporubroempleaReturnGeneral) {
		this.tipogruporubroempleaReturnGeneral = tipogruporubroempleaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoGrupoRubroEmpleaLogic getTipoGrupoRubroEmpleaLogic()	{		
		return tipogruporubroempleaLogic;
	}

	public void setTipoGrupoRubroEmpleaLogic(TipoGrupoRubroEmpleaLogic tipogruporubroempleaLogic) {
		this.tipogruporubroempleaLogic = tipogruporubroempleaLogic;
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
	
	public Boolean getIsEsNuevoTipoGrupoRubroEmplea() {
		return isEsNuevoTipoGrupoRubroEmplea;
	}

	public void setIsEsNuevoTipoGrupoRubroEmplea(Boolean isEsNuevoTipoGrupoRubroEmplea) {
		this.isEsNuevoTipoGrupoRubroEmplea = isEsNuevoTipoGrupoRubroEmplea;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGrupoRubroEmplea() {
		return esParaAccionDesdeFormularioTipoGrupoRubroEmplea;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGrupoRubroEmplea(Boolean esParaAccionDesdeFormularioTipoGrupoRubroEmplea) {
		this.esParaAccionDesdeFormularioTipoGrupoRubroEmplea = esParaAccionDesdeFormularioTipoGrupoRubroEmplea;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoGrupoRubroEmplea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGrupoRubroEmpleaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoRubroEmplea(this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGrupoRubroEmpleaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoRubroEmplea(this.tipogruporubroempleas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogruporubroempleaLogic.setTipoGrupoRubroEmpleas(this.tipogruporubroempleas);
			tipogruporubroempleaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGrupoRubroEmpleaParameterReturnGeneral getTipoGrupoRubroEmpleaParameterGeneral() {
		return this.tipogruporubroempleaParameterGeneral;
	}
	
	public void setTipoGrupoRubroEmpleaParameterGeneral(TipoGrupoRubroEmpleaParameterReturnGeneral tipogruporubroempleaParameterGeneral) {
		this.tipogruporubroempleaParameterGeneral = tipogruporubroempleaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGrupoRubroEmplea() {
		return isPermisoTodoTipoGrupoRubroEmplea;
	}

	public void setIsPermisoTodoTipoGrupoRubroEmplea(Boolean isPermisoTodoTipoGrupoRubroEmplea) {
		this.isPermisoTodoTipoGrupoRubroEmplea = isPermisoTodoTipoGrupoRubroEmplea;
	}

	public Boolean getIsPermisoNuevoTipoGrupoRubroEmplea() {
		return isPermisoNuevoTipoGrupoRubroEmplea;
	}

	public void setIsPermisoNuevoTipoGrupoRubroEmplea(Boolean isPermisoNuevoTipoGrupoRubroEmplea) {
		this.isPermisoNuevoTipoGrupoRubroEmplea = isPermisoNuevoTipoGrupoRubroEmplea;
	}

	public Boolean getIsPermisoActualizarTipoGrupoRubroEmplea() {
		return isPermisoActualizarTipoGrupoRubroEmplea;
	}

	public void setIsPermisoActualizarTipoGrupoRubroEmplea(Boolean isPermisoActualizarTipoGrupoRubroEmplea) {
		this.isPermisoActualizarTipoGrupoRubroEmplea = isPermisoActualizarTipoGrupoRubroEmplea;
	}

	public Boolean getIsPermisoEliminarTipoGrupoRubroEmplea() {
		return isPermisoEliminarTipoGrupoRubroEmplea;
	}

	public void setIsPermisoEliminarTipoGrupoRubroEmplea(Boolean isPermisoEliminarTipoGrupoRubroEmplea) {
		this.isPermisoEliminarTipoGrupoRubroEmplea = isPermisoEliminarTipoGrupoRubroEmplea;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGrupoRubroEmplea() {
		return isPermisoGuardarCambiosTipoGrupoRubroEmplea;
	}

	public void setIsPermisoGuardarCambiosTipoGrupoRubroEmplea(Boolean isPermisoGuardarCambiosTipoGrupoRubroEmplea) {
		this.isPermisoGuardarCambiosTipoGrupoRubroEmplea = isPermisoGuardarCambiosTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoConsultaTipoGrupoRubroEmplea() {
		return isPermisoConsultaTipoGrupoRubroEmplea;
	}

	public void setIsPermisoConsultaTipoGrupoRubroEmplea(Boolean isPermisoConsultaTipoGrupoRubroEmplea) {
		this.isPermisoConsultaTipoGrupoRubroEmplea = isPermisoConsultaTipoGrupoRubroEmplea;
	}

	public Boolean getIsPermisoBusquedaTipoGrupoRubroEmplea() {
		return isPermisoBusquedaTipoGrupoRubroEmplea;
	}

	public void setIsPermisoBusquedaTipoGrupoRubroEmplea(Boolean isPermisoBusquedaTipoGrupoRubroEmplea) {
		this.isPermisoBusquedaTipoGrupoRubroEmplea = isPermisoBusquedaTipoGrupoRubroEmplea;
	}

	public Boolean getIsPermisoReporteTipoGrupoRubroEmplea() {
		return isPermisoReporteTipoGrupoRubroEmplea;
	}

	public void setIsPermisoReporteTipoGrupoRubroEmplea(Boolean isPermisoReporteTipoGrupoRubroEmplea) {
		this.isPermisoReporteTipoGrupoRubroEmplea = isPermisoReporteTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGrupoRubroEmplea() {
		return isPermisoPaginacionMedioTipoGrupoRubroEmplea;
	}

	public void setIsPermisoPaginacionMedioTipoGrupoRubroEmplea(Boolean isPermisoPaginacionMedioTipoGrupoRubroEmplea) {
		this.isPermisoPaginacionMedioTipoGrupoRubroEmplea = isPermisoPaginacionMedioTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGrupoRubroEmplea() {
		return isPermisoPaginacionTodoTipoGrupoRubroEmplea;
	}

	public void setIsPermisoPaginacionTodoTipoGrupoRubroEmplea(Boolean isPermisoPaginacionTodoTipoGrupoRubroEmplea) {
		this.isPermisoPaginacionTodoTipoGrupoRubroEmplea = isPermisoPaginacionTodoTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGrupoRubroEmplea() {
		return isPermisoPaginacionAltoTipoGrupoRubroEmplea;
	}

	public void setIsPermisoPaginacionAltoTipoGrupoRubroEmplea(Boolean isPermisoPaginacionAltoTipoGrupoRubroEmplea) {
		this.isPermisoPaginacionAltoTipoGrupoRubroEmplea = isPermisoPaginacionAltoTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoCopiarTipoGrupoRubroEmplea() {
		return isPermisoCopiarTipoGrupoRubroEmplea;
	}

	public void setIsPermisoCopiarTipoGrupoRubroEmplea(Boolean isPermisoCopiarTipoGrupoRubroEmplea) {
		this.isPermisoCopiarTipoGrupoRubroEmplea = isPermisoCopiarTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoVerFormTipoGrupoRubroEmplea() {
		return isPermisoVerFormTipoGrupoRubroEmplea;
	}

	public void setIsPermisoVerFormTipoGrupoRubroEmplea(Boolean isPermisoVerFormTipoGrupoRubroEmplea) {
		this.isPermisoVerFormTipoGrupoRubroEmplea = isPermisoVerFormTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoDuplicarTipoGrupoRubroEmplea() {
		return isPermisoDuplicarTipoGrupoRubroEmplea;
	}

	public void setIsPermisoDuplicarTipoGrupoRubroEmplea(Boolean isPermisoDuplicarTipoGrupoRubroEmplea) {
		this.isPermisoDuplicarTipoGrupoRubroEmplea = isPermisoDuplicarTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsPermisoOrdenTipoGrupoRubroEmplea() {
		return isPermisoOrdenTipoGrupoRubroEmplea;
	}

	public void setIsPermisoOrdenTipoGrupoRubroEmplea(Boolean isPermisoOrdenTipoGrupoRubroEmplea) {
		this.isPermisoOrdenTipoGrupoRubroEmplea = isPermisoOrdenTipoGrupoRubroEmplea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaNuevoTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaNuevoTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaNuevoTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea = isVisibilidadCeldaNuevoTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea = isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaCopiarTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaCopiarTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaCopiarTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaCopiarTipoGrupoRubroEmplea = isVisibilidadCeldaCopiarTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaVerFormTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaVerFormTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaVerFormTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaVerFormTipoGrupoRubroEmplea = isVisibilidadCeldaVerFormTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaOrdenTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaOrdenTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaOrdenTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea = isVisibilidadCeldaOrdenTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea = isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaModificarTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaModificarTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaModificarTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea = isVisibilidadCeldaModificarTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaActualizarTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaActualizarTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaActualizarTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea = isVisibilidadCeldaActualizarTipoGrupoRubroEmplea;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaEliminarTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaEliminarTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaEliminarTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea = isVisibilidadCeldaEliminarTipoGrupoRubroEmplea;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaCancelarTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaCancelarTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaCancelarTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea = isVisibilidadCeldaCancelarTipoGrupoRubroEmplea;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaGuardarTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaGuardarTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaGuardarTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea = isVisibilidadCeldaGuardarTipoGrupoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea() {
		return isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea(Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea) {
		this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea = isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea;
	}
		
	public TipoGrupoRubroEmpleaSessionBean gettipogruporubroempleaSessionBean() {
		return this.tipogruporubroempleaSessionBean;
	}
	
	public void settipogruporubroempleaSessionBean(TipoGrupoRubroEmpleaSessionBean tipogruporubroempleaSessionBean) {
		this.tipogruporubroempleaSessionBean=tipogruporubroempleaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoGrupoRubroEmplea tipogruporubroemplea,TipoGrupoRubroEmplea tipogruporubroempleaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGrupoRubroEmplea(tipogruporubroemplea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogruporubroempleaAux.setId(tipogruporubroemplea.getId());
		tipogruporubroempleaAux.setVersionRow(tipogruporubroemplea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGrupoRubroEmplea();
		
			int intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogruporubroempleaValidator.getInvalidValues(this.tipogruporubroemplea);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogruporubroempleaLogic.setDatosCliente(datosCliente);
			tipogruporubroempleaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogruporubroempleaAux=new  TipoGrupoRubroEmplea();
				
				tipogruporubroempleaAux.setIsNew(true);
				tipogruporubroempleaAux.setIsChanged(true);
				
				tipogruporubroempleaAux.setTipoGrupoRubroEmpleaOriginal(this.tipogruporubroemplea);
				
				tipogruporubroempleaAux.setId(this.tipogruporubroemplea.getId());	
				tipogruporubroempleaAux.setVersionRow(this.tipogruporubroemplea.getVersionRow());	
				tipogruporubroempleaAux.setcodigo(this.tipogruporubroemplea.getcodigo());	
				tipogruporubroempleaAux.setnombre(this.tipogruporubroemplea.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogruporubroempleaAux,tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogruporubroempleaAux,tipogruporubroempleas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogruporubroempleaLogic.saveTipoGrupoRubroEmpleas();//WithConnection
						//tipogruporubroempleaLogic.getSetVersionRowTipoGrupoRubroEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogruporubroemplea,tipogruporubroempleaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogruporubroempleaAux=new  TipoGrupoRubroEmplea();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado() && this.tipogruporubroemplea.getId()>=0)) {
						
					tipogruporubroempleaAux.setIsNew(false);
				}
				
				tipogruporubroempleaAux.setIsDeleted(false);
			
				tipogruporubroempleaAux.setId(this.tipogruporubroemplea.getId());	
				tipogruporubroempleaAux.setVersionRow(this.tipogruporubroemplea.getVersionRow());	
				tipogruporubroempleaAux.setcodigo(this.tipogruporubroemplea.getcodigo());	
				tipogruporubroempleaAux.setnombre(this.tipogruporubroemplea.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogruporubroempleaAux,tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogruporubroempleaAux,tipogruporubroempleas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogruporubroempleaLogic.saveTipoGrupoRubroEmpleas();//WithConnection
						//tipogruporubroempleaLogic.getSetVersionRowTipoGrupoRubroEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogruporubroemplea,tipogruporubroempleaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogruporubroempleaAux=new  TipoGrupoRubroEmplea();
				
				tipogruporubroempleaAux.setIsNew(false);
				tipogruporubroempleaAux.setIsChanged(false);
				
				tipogruporubroempleaAux.setIsDeleted(true);
				
				tipogruporubroempleaAux.setId(this.tipogruporubroemplea.getId());	
				tipogruporubroempleaAux.setVersionRow(this.tipogruporubroemplea.getVersionRow());	
				tipogruporubroempleaAux.setcodigo(this.tipogruporubroemplea.getcodigo());	
				tipogruporubroempleaAux.setnombre(this.tipogruporubroemplea.getnombre());	
				
				if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogruporubroempleaAux.getId()>=0) {	
						this.tipogruporubroempleasEliminados.add(tipogruporubroempleaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogruporubroempleaAux,tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogruporubroempleaAux,tipogruporubroempleas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogruporubroempleaLogic.saveTipoGrupoRubroEmpleas();//WithConnection
						//tipogruporubroempleaLogic.getSetVersionRowTipoGrupoRubroEmpleas();//WithConnection
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
					this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().addAll(this.tipogruporubroempleasEliminados);
					
					tipogruporubroempleaLogic.saveTipoGrupoRubroEmpleas();//WithConnection
					//tipogruporubroempleaLogic.getSetVersionRowTipoGrupoRubroEmpleas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipogruporubroempleasEliminados= new ArrayList<TipoGrupoRubroEmplea>();		
			}
			
			if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Grupo Rubro Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogruporubroemplea=tipogruporubroempleaAux;
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
      		//this.finishProcessTipoGrupoRubroEmplea();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGrupoRubroEmplea tipogruporubroempleaLocal) throws Exception {
		
		if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGrupoRubroEmplea tipogruporubroempleaLocal) throws Exception {	
		if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoGrupoRubroEmpleaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogruporubroempleaValidator.getInvalidValues(this.tipogruporubroemplea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGrupoRubroEmplea tipogruporubroemplea,List<TipoGrupoRubroEmplea> tipogruporubroempleas) throws Exception {
		try	{		
			TipoGrupoRubroEmpleaConstantesFunciones.actualizarLista(tipogruporubroemplea,tipogruporubroempleas,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGrupoRubroEmplea tipogruporubroemplea,List<TipoGrupoRubroEmplea> tipogruporubroempleas) throws Exception {
		try	{			
			TipoGrupoRubroEmpleaConstantesFunciones.actualizarSelectedLista(tipogruporubroemplea,tipogruporubroempleas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGrupoRubroEmplea> tipogruporubroempleasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogruporubroempleasLocal=this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogruporubroempleasLocal=this.tipogruporubroempleas;
			}
			//ARCHITECTURE
		
			for(TipoGrupoRubroEmplea tipogruporubroempleaLocal:tipogruporubroempleasLocal) {
				if(this.permiteMantenimiento(tipogruporubroempleaLocal) && tipogruporubroempleaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGrupoRubroEmpleaConstantesFunciones.getTipoGrupoRubroEmpleaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGrupoRubroEmpleaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jLabelcodigoTipoGrupoRubroEmplea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGrupoRubroEmpleaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jLabelnombreTipoGrupoRubroEmplea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jLabelcodigoTipoGrupoRubroEmplea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jLabelnombreTipoGrupoRubroEmplea,"");
		
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
		this.iIdNuevoTipoGrupoRubroEmplea--;	
		
		
		this.tipogruporubroempleaAux=new TipoGrupoRubroEmplea();
		
		this.tipogruporubroempleaAux.setId(this.iIdNuevoTipoGrupoRubroEmplea);
		this.tipogruporubroempleaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().add(this.tipogruporubroempleaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogruporubroempleas.add(this.tipogruporubroempleaAux);
		}
		//ARCHITECTURE
		
		this.tipogruporubroemplea=this.tipogruporubroempleaAux;
		
		if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGrupoRubroEmplea(this.tipogruporubroemplea);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoRubroEmplea(this.tipogruporubroemplea);
		}
				
		//this.setDefaultControlesTipoGrupoRubroEmplea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGrupoRubroEmplea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoRubroEmplea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoRubroEmplea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroempleaBean,this.tipogruporubroemplea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
			classes=TipoGrupoRubroEmpleaConstantesFunciones.getClassesRelationshipsOfTipoGrupoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogruporubroempleaReturnGeneral=tipogruporubroempleaLogic.procesarEventosTipoGrupoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas(),this.tipogruporubroemplea,this.tipogruporubroempleaParameterGeneral,this.isEsNuevoTipoGrupoRubroEmplea,classes);//this.tipogruporubroempleaLogic.getTipoGrupoRubroEmplea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral,this.tipogruporubroempleaBean,false);
		
		if(this.tipogruporubroempleaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea());
		}
		
		if(this.tipogruporubroempleaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea(),classes);//this.tipogruporubroempleaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGrupoRubroEmplea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGrupoRubroEmplea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
						
			if(tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoRubroEmplea();
			}
			
			this.actualizarVisualTableDatosTipoGrupoRubroEmplea();
			
			this.jTableDatosTipoGrupoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoRubroEmplea(), this.getIndiceNuevoTipoGrupoRubroEmplea());
			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
						
			this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGrupoRubroEmplea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.setEnabled(isHabilitar && this.tipogruporubroempleaConstantesFunciones.activarcodigoTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.setEnabled(isHabilitar && this.tipogruporubroempleaConstantesFunciones.activarnombreTipoGrupoRubroEmplea);	
		
	};
	
	public void setDefaultControlesTipoGrupoRubroEmplea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGrupoRubroEmplea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogruporubroempleaSessionBean.setConGuardarRelaciones(true);			
			this.tipogruporubroempleaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setVisible(true);
			
					
		} else {
			//this.tipogruporubroempleaSessionBean.setConGuardarRelaciones(false);			
			this.tipogruporubroempleaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoGrupoRubroEmplea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
				if(tipogruporubroempleaAux.getId().equals(this.iIdNuevoTipoGrupoRubroEmplea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleas) {
				if(tipogruporubroempleaAux.getId().equals(this.iIdNuevoTipoGrupoRubroEmplea)) {
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
	
	public int getIndiceActualTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
				if(tipogruporubroempleaAux.getId().equals(tipogruporubroemplea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleas) {
				if(tipogruporubroempleaAux.getId().equals(tipogruporubroemplea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroempleaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
				if(tipogruporubroempleaAux.getTipoGrupoRubroEmpleaOriginal().getId().equals(tipogruporubroempleaOriginal.getId())) {
					existe=true;
					tipogruporubroempleaOriginal.setId(tipogruporubroempleaAux.getId());
					tipogruporubroempleaOriginal.setVersionRow(tipogruporubroempleaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleas) {
				if(tipogruporubroempleaAux.getTipoGrupoRubroEmpleaOriginal().getId().equals(tipogruporubroempleaOriginal.getId())) {
					existe=true;
					tipogruporubroempleaOriginal.setId(tipogruporubroempleaAux.getId());
					tipogruporubroempleaOriginal.setVersionRow(tipogruporubroempleaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGrupoRubroEmplea(Boolean esParaCancelar) throws Exception {
		tipogruporubroempleasAux=new ArrayList<TipoGrupoRubroEmplea>();
		tipogruporubroempleaAux=new TipoGrupoRubroEmplea();
		
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
					if(tipogruporubroempleaAux.getId()<0) {
						tipogruporubroempleasAux.add(tipogruporubroempleaAux);
					}		
				}
				this.iIdNuevoTipoGrupoRubroEmplea=0L;
				this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().removeAll(tipogruporubroempleasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleas) {
					if(tipogruporubroempleaAux.getId()<0) {
						tipogruporubroempleasAux.add(tipogruporubroempleaAux);
					}		
				}
				this.iIdNuevoTipoGrupoRubroEmplea=0L;
				this.tipogruporubroempleas.removeAll(tipogruporubroempleasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoRubroEmplea 
					&& this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size()>0
					) {
					tipogruporubroempleaAux=this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().get(this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size() - 1);
				
					if(tipogruporubroempleaAux.getId()<0) {
						this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().remove(tipogruporubroempleaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoRubroEmplea && this.tipogruporubroempleas.size()>0) {
					tipogruporubroempleaAux=this.tipogruporubroempleas.get(this.tipogruporubroempleas.size() - 1);
				
					if(tipogruporubroempleaAux.getId()<0) {
						this.tipogruporubroempleas.remove(tipogruporubroempleaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGrupoRubroEmplea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogruporubroemplea.getId()<0) {
				this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().remove(this.tipogruporubroemplea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogruporubroemplea.getId()<0) {
				this.tipogruporubroempleas.remove(this.tipogruporubroemplea);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGrupoRubroEmplea(List<TipoGrupoRubroEmplea> tipogruporubroempleasAux) throws Exception {
		TipoGrupoRubroEmpleaConstantesFunciones.setEstadosInicialesTipoGrupoRubroEmplea(tipogruporubroempleasAux);
	}
	
	public void setEstadosInicialesTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroempleaAux) throws Exception {
		TipoGrupoRubroEmpleaConstantesFunciones.setEstadosInicialesTipoGrupoRubroEmplea(tipogruporubroempleaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGrupoRubroEmpleaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGrupoRubroEmpleaActual()) {
				if(!this.isEsNuevoTipoGrupoRubroEmplea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGrupoRubroEmplea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGrupoRubroEmpleaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Grupo Rubro Empleado ?", "MANTENIMIENTO DE Tipo Grupo Rubro Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGrupoRubroEmplea tipogruporubroemplea) throws Exception {
		TipoGrupoRubroEmpleaConstantesFunciones.seleccionarAsignar(this.tipogruporubroemplea,tipogruporubroemplea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGrupoRubroEmplea=this.isPermisoActualizarOriginalTipoGrupoRubroEmplea;
			
			
			this.seleccionarAsignar(tipogruporubroemplea);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGrupoRubroEmpleaConstantesFunciones.quitarEspaciosTipoGrupoRubroEmplea(this.tipogruporubroemplea,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogruporubroempleaSessionBean.setsFuncionBusquedaRapida(this.tipogruporubroempleaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGrupoRubroEmplea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGrupoRubroEmplea(esParaCancelar);				
				this.cancelarNuevoTipoGrupoRubroEmplea(esParaCancelar);								
			}
			
			this.tipogruporubroemplea=new TipoGrupoRubroEmplea();
			
			this.inicializarTipoGrupoRubroEmplea();
			
			this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGrupoRubroEmplea() throws Exception {
		try {
			TipoGrupoRubroEmpleaConstantesFunciones.inicializarTipoGrupoRubroEmplea(this.tipogruporubroemplea);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGrupoRubroEmpleas(String sAccionBusqueda,List<TipoGrupoRubroEmplea> tipogruporubroempleasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGrupoRubroEmplea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGrupoRubroEmpleaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGrupoRubroEmpleaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGrupoRubroEmplea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Grupo Rubro Empleados");		
		parameters.put("busquedapor", TipoGrupoRubroEmpleaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGrupoRubroEmplea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGrupoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGrupoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGrupoRubroEmplea=new JRBeanArrayDataSource(TipoGrupoRubroEmpleaJInternalFrame.TraerTipoGrupoRubroEmpleaBeans(tipogruporubroempleasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGrupoRubroEmplea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGrupoRubroEmpleaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGrupoRubroEmpleaBean.TraerTipoGrupoRubroEmpleaBeans(tipogruporubroempleasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGrupoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tipogruporubroempleasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGrupoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tipogruporubroempleasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(null);
					//this.generarExcelReporteTipoGrupoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tipogruporubroempleasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGrupoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tipogruporubroempleasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGrupoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tipogruporubroempleasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGrupoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tipogruporubroempleasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGrupoRubroEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoRubroEmplea> tipogruporubroempleasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogruporubroemplea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoRubroEmpleas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoRubroEmplea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGrupoRubroEmplea tipogruporubroemplea : tipogruporubroempleasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGrupoRubroEmpleaConstantesFunciones.generarExcelReporteDataTipoGrupoRubroEmplea("NORMAL",row,workbook,tipogruporubroemplea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGrupoRubroEmplea(String sTipo,Row row,Workbook workbook) {
		
		TipoGrupoRubroEmpleaConstantesFunciones.generarExcelReporteHeaderTipoGrupoRubroEmplea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGrupoRubroEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoRubroEmplea> tipogruporubroempleasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogruporubroemplea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoRubroEmpleas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGrupoRubroEmplea tipogruporubroemplea : tipogruporubroempleasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.getTipoGrupoRubroEmpleaDescripcion(tipogruporubroemplea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogruporubroemplea.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogruporubroemplea.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGrupoRubroEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoRubroEmplea> tipogruporubroempleasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGrupoRubroEmplea> tipogruporubroempleasRespaldo=null;
		
		classes=TipoGrupoRubroEmpleaConstantesFunciones.getClassesRelationshipsOfTipoGrupoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogruporubroempleaLogic.setDatosCliente(this.datosCliente);
		this.tipogruporubroempleaLogic.setDatosDeep(this.datosDeep);
		this.tipogruporubroempleaLogic.setIsConDeep(true);
		
		tipogruporubroempleasRespaldo=this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas();
		
		this.tipogruporubroempleaLogic.setTipoGrupoRubroEmpleas(tipogruporubroempleasParaReportes);	
		this.tipogruporubroempleaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogruporubroempleasParaReportes=this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas();
		this.tipogruporubroempleaLogic.setTipoGrupoRubroEmpleas(tipogruporubroempleasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogruporubroemplea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoRubroEmpleas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoRubroEmplea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGrupoRubroEmplea tipogruporubroemplea : tipogruporubroempleasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGrupoRubroEmplea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGrupoRubroEmpleaConstantesFunciones.generarExcelReporteDataTipoGrupoRubroEmplea("NORMAL",row,workbook,tipogruporubroemplea,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.getTipoGrupoRubroEmpleaDescripcion(tipogruporubroemplea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGrupoRubroEmplea() throws Exception {		
		this.startProcessTipoGrupoRubroEmplea(true);
	}
	
	public void startProcessTipoGrupoRubroEmplea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoGrupoRubroEmplea, this.jScrollPanelDatosTipoGrupoRubroEmplea,this.jPanelPaginacionTipoGrupoRubroEmplea, this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea, this.jPanelAccionesTipoGrupoRubroEmplea,this.jPanelAccionesFormularioTipoGrupoRubroEmplea,this.jmenuBarTipoGrupoRubroEmplea,this.jmenuBarDetalleTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,this.jTtoolBarDetalleTipoGrupoRubroEmplea);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoRubroEmplea=null; 
		
		final JPanel jPanelParametrosReportesTipoGrupoRubroEmplea=this.jPanelParametrosReportesTipoGrupoRubroEmplea;
		//final JScrollPane jScrollPanelDatosTipoGrupoRubroEmplea=this.jScrollPanelDatosTipoGrupoRubroEmplea;
		final JTable jTableDatosTipoGrupoRubroEmplea=this.jTableDatosTipoGrupoRubroEmplea;		
		final JPanel jPanelPaginacionTipoGrupoRubroEmplea=this.jPanelPaginacionTipoGrupoRubroEmplea;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoRubroEmplea=this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea;
		final JPanel jPanelAccionesTipoGrupoRubroEmplea=this.jPanelAccionesTipoGrupoRubroEmplea;
		
		JPanel jPanelCamposAuxiliarTipoGrupoRubroEmplea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoRubroEmplea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			jPanelCamposAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jPanelCamposTipoGrupoRubroEmplea;
			jPanelAccionesFormularioAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jPanelAccionesFormularioTipoGrupoRubroEmplea;
		}
		
		final JPanel jPanelCamposTipoGrupoRubroEmplea=jPanelCamposAuxiliarTipoGrupoRubroEmplea;
		final JPanel jPanelAccionesFormularioTipoGrupoRubroEmplea=jPanelAccionesFormularioAuxiliarTipoGrupoRubroEmplea;
		
		
		final JMenuBar jmenuBarTipoGrupoRubroEmplea=this.jmenuBarTipoGrupoRubroEmplea;
		final JToolBar jTtoolBarTipoGrupoRubroEmplea=this.jTtoolBarTipoGrupoRubroEmplea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoRubroEmplea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoRubroEmplea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jmenuBarDetalleTipoGrupoRubroEmplea;
			jTtoolBarDetalleAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTtoolBarDetalleTipoGrupoRubroEmplea;
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoRubroEmplea=jmenuBarDetalleAuxiliarTipoGrupoRubroEmplea;
		final JToolBar jTtoolBarDetalleTipoGrupoRubroEmplea=jTtoolBarDetalleAuxiliarTipoGrupoRubroEmplea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoRubroEmplea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoRubroEmplea;
			processRunnable.jTableDatos=jTableDatosTipoGrupoRubroEmplea;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoRubroEmplea;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoRubroEmplea;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoRubroEmplea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoRubroEmplea;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoRubroEmplea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoRubroEmplea;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoRubroEmplea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoRubroEmplea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGrupoRubroEmplea ,jPanelParametrosReportesTipoGrupoRubroEmplea,jTableDatosTipoGrupoRubroEmplea, /*jScrollPanelDatosTipoGrupoRubroEmplea,*/jPanelCamposTipoGrupoRubroEmplea,jPanelPaginacionTipoGrupoRubroEmplea, /*jScrollPanelDatosEdicionTipoGrupoRubroEmplea,*/ jPanelAccionesTipoGrupoRubroEmplea,jPanelAccionesFormularioTipoGrupoRubroEmplea,jmenuBarTipoGrupoRubroEmplea,jmenuBarDetalleTipoGrupoRubroEmplea,jTtoolBarTipoGrupoRubroEmplea,jTtoolBarDetalleTipoGrupoRubroEmplea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoGrupoRubroEmplea, jScrollPanelDatosTipoGrupoRubroEmplea,jPanelPaginacionTipoGrupoRubroEmplea, jScrollPanelDatosEdicionTipoGrupoRubroEmplea, jPanelAccionesTipoGrupoRubroEmplea,jPanelAccionesFormularioTipoGrupoRubroEmplea,jmenuBarTipoGrupoRubroEmplea,jmenuBarDetalleTipoGrupoRubroEmplea,jTtoolBarTipoGrupoRubroEmplea,jTtoolBarDetalleTipoGrupoRubroEmplea);
						
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
	
	public void finishProcessTipoGrupoRubroEmplea() {// throws Exception 
		this.finishProcessTipoGrupoRubroEmplea(true);
	}
	
	public void finishProcessTipoGrupoRubroEmplea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoGrupoRubroEmplea, this.jScrollPanelDatosTipoGrupoRubroEmplea,this.jPanelPaginacionTipoGrupoRubroEmplea, this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea, this.jPanelAccionesTipoGrupoRubroEmplea,this.jPanelAccionesFormularioTipoGrupoRubroEmplea,this.jmenuBarTipoGrupoRubroEmplea,this.jmenuBarDetalleTipoGrupoRubroEmplea,this.jTtoolBarTipoGrupoRubroEmplea,this.jTtoolBarDetalleTipoGrupoRubroEmplea);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoRubroEmplea=null; 
		
		final JPanel jPanelParametrosReportesTipoGrupoRubroEmplea=this.jPanelParametrosReportesTipoGrupoRubroEmplea;
		//final JScrollPane jScrollPanelDatosTipoGrupoRubroEmplea=this.jScrollPanelDatosTipoGrupoRubroEmplea;
		final JTable jTableDatosTipoGrupoRubroEmplea=this.jTableDatosTipoGrupoRubroEmplea;		
		final JPanel jPanelPaginacionTipoGrupoRubroEmplea=this.jPanelPaginacionTipoGrupoRubroEmplea;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoRubroEmplea=this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea;
		final JPanel jPanelAccionesTipoGrupoRubroEmplea=this.jPanelAccionesTipoGrupoRubroEmplea;
		
		JPanel jPanelCamposAuxiliarTipoGrupoRubroEmplea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoRubroEmplea=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			jPanelCamposAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jPanelCamposTipoGrupoRubroEmplea;
			jPanelAccionesFormularioAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jPanelAccionesFormularioTipoGrupoRubroEmplea;
		}
		
		final JPanel jPanelCamposTipoGrupoRubroEmplea=jPanelCamposAuxiliarTipoGrupoRubroEmplea;
		final JPanel jPanelAccionesFormularioTipoGrupoRubroEmplea=jPanelAccionesFormularioAuxiliarTipoGrupoRubroEmplea;
		
		
		final JMenuBar jmenuBarTipoGrupoRubroEmplea=this.jmenuBarTipoGrupoRubroEmplea;		
		final JToolBar jTtoolBarTipoGrupoRubroEmplea=this.jTtoolBarTipoGrupoRubroEmplea;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoRubroEmplea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoRubroEmplea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jmenuBarDetalleTipoGrupoRubroEmplea;
			jTtoolBarDetalleAuxiliarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTtoolBarDetalleTipoGrupoRubroEmplea;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoRubroEmplea=jmenuBarDetalleAuxiliarTipoGrupoRubroEmplea;
		final JToolBar jTtoolBarDetalleTipoGrupoRubroEmplea=jTtoolBarDetalleAuxiliarTipoGrupoRubroEmplea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoRubroEmplea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoRubroEmplea;
			processRunnable.jTableDatos=jTableDatosTipoGrupoRubroEmplea;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoRubroEmplea;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoRubroEmplea;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoRubroEmplea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoRubroEmplea;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoRubroEmplea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoRubroEmplea;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoRubroEmplea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoRubroEmplea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGrupoRubroEmplea ,jPanelParametrosReportesTipoGrupoRubroEmplea, jTableDatosTipoGrupoRubroEmplea,/*jScrollPanelDatosTipoGrupoRubroEmplea,*/jPanelCamposTipoGrupoRubroEmplea,jPanelPaginacionTipoGrupoRubroEmplea, /*jScrollPanelDatosEdicionTipoGrupoRubroEmplea,*/ jPanelAccionesTipoGrupoRubroEmplea,jPanelAccionesFormularioTipoGrupoRubroEmplea,jmenuBarTipoGrupoRubroEmplea,jmenuBarDetalleTipoGrupoRubroEmplea,jTtoolBarTipoGrupoRubroEmplea,jTtoolBarDetalleTipoGrupoRubroEmplea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGrupoRubroEmplea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGrupoRubroEmplea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGrupoRubroEmplea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGrupoRubroEmplea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGrupoRubroEmplea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGrupoRubroEmplea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGrupoRubroEmplea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGrupoRubroEmplea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGrupoRubroEmplea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogruporubroempleaConstantesFunciones.getsFinalQueryTipoGrupoRubroEmplea();
		String  finalQueryPaginacionTodos=this.tipogruporubroempleaConstantesFunciones.getsFinalQueryTipoGrupoRubroEmplea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGrupoRubroEmpleaConstantesFunciones.getArrayColumnasGlobalesNoTipoGrupoRubroEmplea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGrupoRubroEmpleaConstantesFunciones.getArrayColumnasGlobalesTipoGrupoRubroEmplea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGrupoRubroEmpleaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogruporubroempleasEliminados= new ArrayList<TipoGrupoRubroEmplea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGrupoRubroEmplea();
		
				///*TipoGrupoRubroEmpleaSessionBean*/this.tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
			
			if(this.tipogruporubroempleaSessionBean==null) {
				this.tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
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
					this.iNumeroPaginacion=TipoGrupoRubroEmpleaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGrupoRubroEmpleaConstantesFunciones.getClassesForeignKeysOfTipoGrupoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogruporubroemplea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogruporubroempleasAux= new ArrayList<TipoGrupoRubroEmplea>();
			
				
			tipogruporubroempleaLogic.setDatosCliente(this.datosCliente);
			tipogruporubroempleaLogic.setDatosDeep(this.datosDeep);
			tipogruporubroempleaLogic.setIsConDeep(true);
			
			
			tipogruporubroempleaLogic.getTipoGrupoRubroEmpleaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogruporubroempleaLogic.getTodosTipoGrupoRubroEmpleas(finalQueryGlobal,pagination);
					
					//tipogruporubroempleaLogic.getTodosTipoGrupoRubroEmpleasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()==null|| tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogruporubroempleasAux= new ArrayList<TipoGrupoRubroEmplea>();
							tipogruporubroempleasAux.addAll(tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogruporubroempleasAux= new ArrayList<TipoGrupoRubroEmplea>();
							tipogruporubroempleasAux.addAll(tipogruporubroempleas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogruporubroempleaLogic.getTodosTipoGrupoRubroEmpleas(finalQueryGlobal+"",this.pagination);												
							
							//tipogruporubroempleaLogic.getTodosTipoGrupoRubroEmpleasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogruporubroempleaLogic.setTipoGrupoRubroEmpleas(new ArrayList<TipoGrupoRubroEmplea>());					
							tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().addAll(tipogruporubroempleasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogruporubroempleas=new ArrayList<TipoGrupoRubroEmplea>();
							tipogruporubroempleas.addAll(tipogruporubroempleasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGrupoRubroEmplea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGrupoRubroEmplea=this.idActual;
				
				} else if(this.idTipoGrupoRubroEmpleaActual!=null && this.idTipoGrupoRubroEmpleaActual!=0L) {
					idTipoGrupoRubroEmplea=idTipoGrupoRubroEmpleaActual;
				}
				
					
				this.sDetalleReporte=TipoGrupoRubroEmpleaConstantesFunciones.getDetalleIndicePorId(idTipoGrupoRubroEmplea);
				
				this.tipogruporubroempleas=new ArrayList<TipoGrupoRubroEmplea>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogruporubroempleaLogic.getEntity(idTipoGrupoRubroEmplea);
					
					//tipogruporubroempleaLogic.getEntityWithConnection(idTipoGrupoRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogruporubroempleaLogic.setTipoGrupoRubroEmpleas(new ArrayList<TipoGrupoRubroEmplea>());
					tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().add(tipogruporubroempleaLogic.getTipoGrupoRubroEmplea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogruporubroempleas=new ArrayList<TipoGrupoRubroEmplea>();
					this.tipogruporubroempleas.add(tipogruporubroemplea);
				}
				
				if(tipogruporubroempleaLogic.getTipoGrupoRubroEmplea()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGrupoRubroEmplea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGrupoRubroEmplea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogruporubroempleas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogruporubroempleas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGrupoRubroEmplea tipogruporubroemplea) {
		Boolean permite=true;
		
		if(this.tipogruporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGrupoRubroEmpleaConstantesFunciones.getOrderByListaTipoGrupoRubroEmplea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGrupoRubroEmpleaConstantesFunciones.getOrderByListaTipoGrupoRubroEmplea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoRubroEmplea tipogruporubroemplea:tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
				if(tipogruporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tipogruporubroempleaTotales=tipogruporubroemplea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoRubroEmplea tipogruporubroemplea:this.tipogruporubroempleas) {
				if(tipogruporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tipogruporubroempleaTotales=tipogruporubroemplea;
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
			this.tipogruporubroempleaAux=new TipoGrupoRubroEmplea();
			this.tipogruporubroempleaAux.setsType(Constantes2.S_TOTALES);
			this.tipogruporubroempleaAux.setIsNew(false);
			this.tipogruporubroempleaAux.setIsChanged(false);
			this.tipogruporubroempleaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGrupoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoGrupoRubroEmplea(this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas(),this.tipogruporubroempleaAux);
				
				this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().add(this.tipogruporubroempleaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGrupoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoGrupoRubroEmplea(this.tipogruporubroempleas,this.tipogruporubroempleaAux);
				
				this.tipogruporubroempleas.add(this.tipogruporubroempleaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogruporubroempleaTotales=new TipoGrupoRubroEmplea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().remove(tipogruporubroempleaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogruporubroempleas.remove(tipogruporubroempleaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogruporubroempleaTotales=new TipoGrupoRubroEmplea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoRubroEmplea tipogruporubroemplea:tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
				if(tipogruporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tipogruporubroempleaTotales=tipogruporubroemplea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoGrupoRubroEmplea(this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas(),tipogruporubroempleaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoRubroEmplea tipogruporubroemplea:this.tipogruporubroempleas) {
				if(tipogruporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tipogruporubroempleaTotales=tipogruporubroemplea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoGrupoRubroEmplea(this.tipogruporubroempleas,tipogruporubroempleaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoGrupoRubroEmplea() {
		this.isPermisoTodoTipoGrupoRubroEmplea=false;
		this.isPermisoNuevoTipoGrupoRubroEmplea=false;
		this.isPermisoActualizarTipoGrupoRubroEmplea=false;
		this.isPermisoActualizarOriginalTipoGrupoRubroEmplea=false;
		this.isPermisoEliminarTipoGrupoRubroEmplea=false;
		this.isPermisoGuardarCambiosTipoGrupoRubroEmplea=false;
		this.isPermisoConsultaTipoGrupoRubroEmplea=false;
		this.isPermisoBusquedaTipoGrupoRubroEmplea=false;
		this.isPermisoReporteTipoGrupoRubroEmplea=false;		
		this.isPermisoOrdenTipoGrupoRubroEmplea=false;		
		this.isPermisoPaginacionMedioTipoGrupoRubroEmplea=false;		
		this.isPermisoPaginacionAltoTipoGrupoRubroEmplea=false;
		this.isPermisoPaginacionTodoTipoGrupoRubroEmplea=false;
		this.isPermisoCopiarTipoGrupoRubroEmplea=false;		
		this.isPermisoVerFormTipoGrupoRubroEmplea=false;		
		this.isPermisoDuplicarTipoGrupoRubroEmplea=false;		
		this.isPermisoOrdenTipoGrupoRubroEmplea=false;		
	}
	
	public void setPermisosUsuarioTipoGrupoRubroEmplea(Boolean isPermiso) {
		this.isPermisoTodoTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoNuevoTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoActualizarTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoEliminarTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoConsultaTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoBusquedaTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoReporteTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoOrdenTipoGrupoRubroEmplea=isPermiso;		
		this.isPermisoPaginacionMedioTipoGrupoRubroEmplea=isPermiso;		
		this.isPermisoPaginacionAltoTipoGrupoRubroEmplea=isPermiso;		
		this.isPermisoPaginacionTodoTipoGrupoRubroEmplea=isPermiso;		
		this.isPermisoCopiarTipoGrupoRubroEmplea=isPermiso;		
		this.isPermisoVerFormTipoGrupoRubroEmplea=isPermiso;		
		this.isPermisoDuplicarTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoOrdenTipoGrupoRubroEmplea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGrupoRubroEmplea(Boolean isPermiso) {
		//this.isPermisoTodoTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoNuevoTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoActualizarTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoEliminarTipoGrupoRubroEmplea=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoRubroEmplea=isPermiso;
		//this.isPermisoConsultaTipoGrupoRubroEmplea=isPermiso;
		//this.isPermisoBusquedaTipoGrupoRubroEmplea=isPermiso;
		//this.isPermisoReporteTipoGrupoRubroEmplea=isPermiso;
		//this.isPermisoOrdenTipoGrupoRubroEmplea=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGrupoRubroEmplea=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGrupoRubroEmplea=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGrupoRubroEmplea=isPermiso;		
		//this.isPermisoCopiarTipoGrupoRubroEmplea=isPermiso;		
		//this.isPermisoDuplicarTipoGrupoRubroEmplea=isPermiso;
		//this.isPermisoOrdenTipoGrupoRubroEmplea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoRubroEmpleaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoGrupoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGrupoRubroEmplea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoRubroEmpleaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGrupoRubroEmpleaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGrupoRubroEmpleaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGrupoRubroEmpleaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoGrupoRubroEmplea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGrupoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGrupoRubroEmpleaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGrupoRubroEmplea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGrupoRubroEmplea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGrupoRubroEmplea=this.isPermisoActualizarTipoGrupoRubroEmplea;
			this.isPermisoEliminarTipoGrupoRubroEmplea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGrupoRubroEmplea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGrupoRubroEmplea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGrupoRubroEmplea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGrupoRubroEmplea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGrupoRubroEmplea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoRubroEmplea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGrupoRubroEmplea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGrupoRubroEmplea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGrupoRubroEmplea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGrupoRubroEmplea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGrupoRubroEmplea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGrupoRubroEmplea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoRubroEmplea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGrupoRubroEmplea.setToolTipText(this.jTableDatosTipoGrupoRubroEmplea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGrupoRubroEmplea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGrupoRubroEmplea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGrupoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGrupoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGrupoRubroEmplea() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoGrupoRubroEmpleaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGrupoRubroEmpleaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGrupoRubroEmpleaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGrupoRubroEmpleaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoGrupoRubroEmpleaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGrupoRubroEmplea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoGrupoRubroEmplea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGrupoRubroEmplea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGrupoRubroEmplea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoRubroEmplea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGrupoRubroEmplea()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoRubroEmplea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGrupoRubroEmplea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGrupoRubroEmplea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGrupoRubroEmplea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGrupoRubroEmplea()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGrupoRubroEmplea(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGrupoRubroEmplea()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoGrupoRubroEmpleaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGrupoRubroEmpleaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGrupoRubroEmpleaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean(); 
		this.tipogruporubroempleaConstantesFunciones=new TipoGrupoRubroEmpleaConstantesFunciones(); 
		this.tipogruporubroempleaBean=new TipoGrupoRubroEmplea();//(this.tipogruporubroempleaConstantesFunciones); 		
		this.tipogruporubroempleaReturnGeneral=new TipoGrupoRubroEmpleaParameterReturnGeneral(); 
		
		this.tipogruporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogruporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGrupoRubroEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGrupoRubroEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGrupoRubroEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGrupoRubroEmplea(true);
			
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
			
			this.tipogruporubroempleaConstantesFunciones=new TipoGrupoRubroEmpleaConstantesFunciones(); 
			this.tipogruporubroempleaBean=new TipoGrupoRubroEmplea();//this.tipogruporubroempleaConstantesFunciones); 			
			this.tipogruporubroempleaReturnGeneral=new TipoGrupoRubroEmpleaParameterReturnGeneral(); 
		
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Rubro Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogruporubroemplea=new TipoGrupoRubroEmplea();
			this.tipogruporubroempleas = new ArrayList<TipoGrupoRubroEmplea>();
			this.tipogruporubroempleasAux = new ArrayList<TipoGrupoRubroEmplea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic=new TipoGrupoRubroEmpleaLogic();
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogruporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogruporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea);	
					}
					
					if(this.jInternalFrameImportacionTipoGrupoRubroEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoRubroEmplea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGrupoRubroEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGrupoRubroEmplea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea);
				this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setVisible(false);
				this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea);
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGrupoRubroEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoRubroEmplea);
					this.jInternalFrameImportacionTipoGrupoRubroEmplea.setVisible(false);
					this.jInternalFrameImportacionTipoGrupoRubroEmplea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGrupoRubroEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoRubroEmplea);
					this.jInternalFrameOrderByTipoGrupoRubroEmplea.setVisible(false);
					this.jInternalFrameOrderByTipoGrupoRubroEmplea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGrupoRubroEmpleaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGrupoRubroEmpleaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogruporubroempleaReturnGeneral=new TipoGrupoRubroEmpleaParameterReturnGeneral();
			
			this.tipogruporubroempleaParameterGeneral=new TipoGrupoRubroEmpleaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogruporubroempleaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGrupoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoRubroEmpleaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado(),this.tipogruporubroempleaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoRubroEmpleaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado(),this.tipogruporubroempleaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaCopiarTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaVerFormTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGrupoRubroEmplea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGrupoRubroEmplea(false);
			
			this.setPermisosUsuarioTipoGrupoRubroEmplea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado() && this.tipogruporubroempleaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGrupoRubroEmpleaClasesRelacionadas();
			}
			
			if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGrupoRubroEmpleaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGrupoRubroEmplea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoRubroEmplea();
			}
			
			if(!this.isPermisoBusquedaTipoGrupoRubroEmplea) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGrupoRubroEmplea,this.isPermisoPaginacionMedioTipoGrupoRubroEmplea,this.isPermisoPaginacionTodoTipoGrupoRubroEmplea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGrupoRubroEmpleaConstantesFunciones.getTiposSeleccionarTipoGrupoRubroEmplea());
				
				this.tiposColumnasSelect=TipoGrupoRubroEmpleaConstantesFunciones.getTiposSeleccionarTipoGrupoRubroEmplea(true);
				
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
			//if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGrupoRubroEmplea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoGrupoRubroEmplea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoGrupoRubroEmplea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoRubroEmplea() ;
			
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
				tipogruporubroempleaImplementable= (TipoGrupoRubroEmpleaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoRubroEmpleaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogruporubroempleaImplementableHome= (TipoGrupoRubroEmpleaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoRubroEmpleaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogruporubroempleas= new ArrayList<TipoGrupoRubroEmplea>();
			this.tipogruporubroempleasEliminados= new ArrayList<TipoGrupoRubroEmplea>();
						
			this.isEsNuevoTipoGrupoRubroEmplea=false;
			this.esParaAccionDesdeFormularioTipoGrupoRubroEmplea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGrupoRubroEmplea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGrupoRubroEmplea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGrupoRubroEmpleaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGrupoRubroEmplea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGrupoRubroEmplea();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGrupoRubroEmplea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGrupoRubroEmplea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGrupoRubroEmplea() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGrupoRubroEmplea")) {
				iIndex=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGrupoRubroEmplea();	
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
	
	public void cargarCombosForeignKeyTipoGrupoRubroEmplea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGrupoRubroEmplea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGrupoRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGrupoRubroEmpleaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGrupoRubroEmplea();
		
		this.cargarCombosFrameForeignKeyTipoGrupoRubroEmplea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGrupoRubroEmplea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGrupoRubroEmplea();
		}
	}
	
	
	
	public void jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
			
			if(jTableDatosTipoGrupoRubroEmplea.getRowCount()>=1) {
				jTableDatosTipoGrupoRubroEmplea.removeRowSelectionInterval(0, jTableDatosTipoGrupoRubroEmplea.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGrupoRubroEmplea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGrupoRubroEmplea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGrupoRubroEmplea(true);			
			//this.tipogruporubroemplea=new TipoGrupoRubroEmplea();
			//this.tipogruporubroemplea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea() ;
			
			if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoRubroEmplea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogruporubroemplea);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);				
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
			if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGrupoRubroEmplea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGrupoRubroEmplea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoRubroEmplea.getSelectedRows().length;			
			}
			
			tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGrupoRubroEmplea--;			
				//TipoGrupoRubroEmplea tipogruporubroempleaAux= new TipoGrupoRubroEmplea();			
				//tipogruporubroempleaAux.setId(this.iIdNuevoTipoGrupoRubroEmplea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGrupoRubroEmplea tipogruporubroempleaOrigen=new TipoGrupoRubroEmplea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGrupoRubroEmplea tipogruporubroempleaOrigen : tipogruporubroempleasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogruporubroempleaOrigen =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogruporubroempleaOrigen =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGrupoRubroEmplea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogruporubroemplea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGrupoRubroEmplea(tipogruporubroempleaOrigen,this.tipogruporubroemplea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().add(this.tipogruporubroempleaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogruporubroempleas.add(this.tipogruporubroempleaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
				
				this.jTableDatosTipoGrupoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoRubroEmplea(), this.getIndiceNuevoTipoGrupoRubroEmplea());
				
				int iLastRow =  this.jTableDatosTipoGrupoRubroEmplea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoRubroEmplea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoRubroEmplea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();									
		
			TipoGrupoRubroEmplea tipogruporubroempleaOrigen=new TipoGrupoRubroEmplea();
			TipoGrupoRubroEmplea tipogruporubroempleaDestino=new TipoGrupoRubroEmplea();
				
			tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoRubroEmplea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogruporubroempleasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGrupoRubroEmplea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogruporubroempleaOrigen =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogruporubroempleaOrigen =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogruporubroempleaDestino =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogruporubroempleaDestino =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogruporubroempleaOrigen =tipogruporubroempleasSeleccionados.get(0);
				tipogruporubroempleaDestino =tipogruporubroempleasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGrupoRubroEmplea(tipogruporubroempleaOrigen,tipogruporubroempleaDestino,true,false);
				
				tipogruporubroempleaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogruporubroempleaDestino,tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogruporubroempleaDestino,tipogruporubroempleas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
				
				//this.jTableDatosTipoGrupoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoRubroEmplea(), this.getIndiceNuevoTipoGrupoRubroEmplea());
				
				int iLastRow =  this.jTableDatosTipoGrupoRubroEmplea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoRubroEmplea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoRubroEmplea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGrupoRubroEmplea.isVisible();
			
			
			this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(!isVisible);
			this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(!isVisible);
			this.jPanelAccionesTipoGrupoRubroEmplea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGrupoRubroEmplea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGrupoRubroEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGrupoRubroEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGrupoRubroEmplea();
			
			this.abrirFrameOrderByTipoGrupoRubroEmplea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGrupoRubroEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGrupoRubroEmplea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoRubroEmplea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setSize(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.iWidthFormulario,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jContentPaneDetalleTipoGrupoRubroEmplea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jContentPaneDetalleTipoGrupoRubroEmplea.getWidth(),TipoGrupoRubroEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jContentPaneDetalleTipoGrupoRubroEmplea.getWidth(),TipoGrupoRubroEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jContentPaneDetalleTipoGrupoRubroEmplea.getWidth(),TipoGrupoRubroEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGrupoRubroEmplea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGrupoRubroEmplea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGrupoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoRubroEmplea,false,this);
				} else {
					this.jInternalFrameOrderByTipoGrupoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoRubroEmplea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoRubroEmplea);
				this.jInternalFrameOrderByTipoGrupoRubroEmplea.setVisible(false);
				this.jInternalFrameOrderByTipoGrupoRubroEmplea.setSelected(false);
				
				this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoRubroEmplea"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGrupoRubroEmplea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGrupoRubroEmplea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGrupoRubroEmplea==null) {
				
				this.jInternalFrameImportacionTipoGrupoRubroEmplea=new ImportacionJInternalFrame(TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoRubroEmplea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoRubroEmplea);
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.setVisible(false);
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.setSelected(false);


				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoRubroEmplea"));
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoRubroEmplea"));
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoRubroEmplea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGrupoRubroEmplea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea==null) {
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea=new ReporteDinamicoJInternalFrame(TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea);
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoRubroEmplea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoRubroEmplea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoGrupoRubroEmplea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoRubroEmplea);
			
	       	this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.dispose();
			//this.jInternalFrameDetalleFormTipoGrupoRubroEmplea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGrupoRubroEmplea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGrupoRubroEmplea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGrupoRubroEmplea.setVisible(true);
	        this.jInternalFrameImportacionTipoGrupoRubroEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGrupoRubroEmplea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setVisible(true);
	        this.jInternalFrameOrderByTipoGrupoRubroEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGrupoRubroEmplea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGrupoRubroEmplea.setVisible(false);
	        this.jInternalFrameOrderByTipoGrupoRubroEmplea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGrupoRubroEmplea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGrupoRubroEmplea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGrupoRubroEmplea.setVisible(false);
	        this.jInternalFrameImportacionTipoGrupoRubroEmplea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGrupoRubroEmplea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGrupoRubroEmplea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGrupoRubroEmplea(true);
			//this.isEsNuevoTipoGrupoRubroEmplea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(false) ;
			
			if(tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoRubroEmplea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGrupoRubroEmpleaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGrupoRubroEmplea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGrupoRubroEmplea(true);
			//this.isEsNuevoTipoGrupoRubroEmplea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogruporubroemplea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(false) ;
			
			if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoRubroEmplea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoRubroEmplea(false);
			
			//if(!this.isEsNuevoTipoGrupoRubroEmplea) {								
				int intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
				
			}
			
			if(this.permiteMantenimiento(this.tipogruporubroemplea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGrupoRubroEmplea=true;
					this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
					this.isEsNuevoTipoGrupoRubroEmplea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGrupoRubroEmplea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGrupoRubroEmplea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoRubroEmplea(false);
			
												
				
				if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGrupoRubroEmplea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,tipogruporubroempleaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGrupoRubroEmplea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogruporubroempleaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogruporubroemplea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				this.tipogruporubroemplea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				this.tipogruporubroemplea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogruporubroemplea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGrupoRubroEmpleaModel) this.jTableDatosTipoGrupoRubroEmplea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGrupoRubroEmplea=true;
				this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
				this.isEsNuevoTipoGrupoRubroEmplea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoRubroEmplea(false);
				
				
				
				if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGrupoRubroEmplea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGrupoRubroEmplea.getRowCount()>=1) {
				jTableDatosTipoGrupoRubroEmplea.removeRowSelectionInterval(0, jTableDatosTipoGrupoRubroEmplea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGrupoRubroEmplea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(false) ;
			
			this.isEsNuevoTipoGrupoRubroEmplea=false;
			
			if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGrupoRubroEmplea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
				
				//SI ES MANUAL
				if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGrupoRubroEmplea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGrupoRubroEmplea--;			
			//TipoGrupoRubroEmplea tipogruporubroempleaAux= new TipoGrupoRubroEmplea();			
			//tipogruporubroempleaAux.setId(this.iIdNuevoTipoGrupoRubroEmplea);
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGrupoRubroEmplea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
			
			this.tipogruporubroemplea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().add(this.tipogruporubroempleaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogruporubroempleas.add(this.tipogruporubroempleaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
			
			this.jTableDatosTipoGrupoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoRubroEmplea(), this.getIndiceNuevoTipoGrupoRubroEmplea());
			
			int iLastRow =  this.jTableDatosTipoGrupoRubroEmplea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGrupoRubroEmplea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGrupoRubroEmplea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoRubroEmplea();
			}
			
			//this.abrirFrameTreeTipoGrupoRubroEmplea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Grupo Rubro EmpleadoS ?", "MANTENIMIENTO DE Tipo Grupo Rubro Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGrupoRubroEmplea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGrupoRubroEmplea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogruporubroempleaReturnGeneral=tipogruporubroempleaLogic.procesarImportacionTipoGrupoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogruporubroempleaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGrupoRubroEmpleaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGrupoRubroEmplea.setFileImportacion(this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGrupoRubroEmplea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGrupoRubroEmplea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		

		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGrupoRubroEmpleaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGrupoRubroEmpleaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogruporubroemplea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGrupoRubroEmpleas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoGrupoRubroEmplea tipogruporubroemplea:tipogruporubroempleasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogruporubroemplea.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGrupoRubroEmplea tipogruporubroemplea:tipogruporubroempleasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogruporubroemplea.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoGrupoRubroEmplea(row);				
			//	iRow++;
			//}				
			
			//for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGrupoRubroEmplea(tipogruporubroempleaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoRubroEmplea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoRubroEmplea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoRubroEmplea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGrupoRubroEmplea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGrupoRubroEmplea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGrupoRubroEmplea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGrupoRubroEmplea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGrupoRubroEmplea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGrupoRubroEmplea.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGrupoRubroEmplea.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGrupoRubroEmplea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGrupoRubroEmplea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGrupoRubroEmplea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGrupoRubroEmplea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGrupoRubroEmplea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoRubroEmplea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoRubroEmplea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGrupoRubroEmplea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea();
		
		this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoRubroEmplea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoRubroEmplea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoRubroEmplea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoRubroEmplea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGrupoRubroEmplea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
				this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGrupoRubroEmplea(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoRubroEmplea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoRubroEmplea() throws Exception {
		try	{
			if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoRubroEmplea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoRubroEmplea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoRubroEmplea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGrupoRubroEmplea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGrupoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGrupoRubroEmplea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGrupoRubroEmplea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.addItem(reporte);
			}
			
			
			if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGrupoRubroEmplea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoRubroEmplea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoRubroEmplea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGrupoRubroEmplea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGrupoRubroEmplea(Boolean esInicializar) throws Exception {				
		if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoRubroEmplea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGrupoRubroEmplea() throws Exception {
		this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGrupoRubroEmplea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGrupoRubroEmpleaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGrupoRubroEmpleaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGrupoRubroEmpleaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoRubroEmpleaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGrupoRubroEmpleaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGrupoRubroEmpleaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGrupoRubroEmplea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogruporubroempleas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGrupoRubroEmplea.setModel(new TipoGrupoRubroEmpleaModel(this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGrupoRubroEmplea.setModel(new TipoGrupoRubroEmpleaModel(this.tipogruporubroempleas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGrupoRubroEmplea!=null && this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGrupoRubroEmplea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoRubroEmplea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGrupoRubroEmpleaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,tipogruporubroempleaConstantesFunciones.resaltarSeleccionarTipoGrupoRubroEmplea,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,tipogruporubroempleaConstantesFunciones.resaltarSeleccionarTipoGrupoRubroEmplea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoRubroEmplea,TipoGrupoRubroEmpleaConstantesFunciones.LABEL_ID));

		if(this.tipogruporubroempleaConstantesFunciones.mostraridTipoGrupoRubroEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoRubroEmpleaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogruporubroempleaConstantesFunciones.resaltaridTipoGrupoRubroEmplea,this.tipogruporubroempleaConstantesFunciones.activaridTipoGrupoRubroEmplea,this,true,"idTipoGrupoRubroEmplea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogruporubroempleaConstantesFunciones.resaltaridTipoGrupoRubroEmplea,this.tipogruporubroempleaConstantesFunciones.activaridTipoGrupoRubroEmplea,this,true,"idTipoGrupoRubroEmplea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoRubroEmplea,TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO));

		if(this.tipogruporubroempleaConstantesFunciones.mostrarcodigoTipoGrupoRubroEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogruporubroempleaConstantesFunciones.resaltarcodigoTipoGrupoRubroEmplea,this.tipogruporubroempleaConstantesFunciones.activarcodigoTipoGrupoRubroEmplea,this,true,"codigoTipoGrupoRubroEmplea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogruporubroempleaConstantesFunciones.resaltarcodigoTipoGrupoRubroEmplea,this.tipogruporubroempleaConstantesFunciones.activarcodigoTipoGrupoRubroEmplea,this,true,"codigoTipoGrupoRubroEmplea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGrupoRubroEmpleaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoRubroEmplea,TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogruporubroempleaConstantesFunciones.mostrarnombreTipoGrupoRubroEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogruporubroempleaConstantesFunciones.resaltarnombreTipoGrupoRubroEmplea,this.tipogruporubroempleaConstantesFunciones.activarnombreTipoGrupoRubroEmplea,this,true,"nombreTipoGrupoRubroEmplea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogruporubroempleaConstantesFunciones.resaltarnombreTipoGrupoRubroEmplea,this.tipogruporubroempleaConstantesFunciones.activarnombreTipoGrupoRubroEmplea,this,true,"nombreTipoGrupoRubroEmplea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGrupoRubroEmpleaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoRubroEmplea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoRubroEmplea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGrupoRubroEmplea.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGrupoRubroEmplea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGrupoRubroEmplea.moveColumn(this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGrupoRubroEmplea.moveColumn(this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGrupoRubroEmplea.moveColumn(this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGrupoRubroEmplea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGrupoRubroEmplea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGrupoRubroEmplea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGrupoRubroEmplea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGrupoRubroEmplea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGrupoRubroEmplea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogruporubroempleas.size()-1;
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
		//this.jTableDatosTipoGrupoRubroEmplea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGrupoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGrupoRubroEmplea();
			
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
				
				//this.isEsNuevoTipoGrupoRubroEmplea=false;
					
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
				if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoRubroEmplea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogruporubroemplea.getsType().equals("DUPLICADO")
				   || this.tipogruporubroemplea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGrupoRubroEmplea=true;
				
				} else {
					this.isEsNuevoTipoGrupoRubroEmplea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogruporubroemplea.getId()>=0 && !this.tipogruporubroemplea.getIsNew()) {						
						this.isEsNuevoTipoGrupoRubroEmplea=false;
						
					} else {
						this.isEsNuevoTipoGrupoRubroEmplea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGrupoRubroEmplea(esRelaciones);						
				
				this.seleccionarTipoGrupoRubroEmplea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogruporubroemplea.getId()<0) {
					this.isEsNuevoTipoGrupoRubroEmplea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGrupoRubroEmplea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGrupoRubroEmplea(evt,rowIndex);
				}	
				
				if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGrupoRubroEmplea: " + this.dDif); 
					}
				}								
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGrupoRubroEmplea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogruporubroemplea)) {
					if(this.tipogruporubroemplea.getId()>0) {
						this.tipogruporubroemplea.setIsDeleted(true);
						
						this.tipogruporubroempleasEliminados.add(this.tipogruporubroemplea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().remove(this.tipogruporubroemplea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogruporubroempleas.remove(this.tipogruporubroemplea);				
					}
					
					
					((TipoGrupoRubroEmpleaModel) this.jTableDatosTipoGrupoRubroEmplea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGrupoRubroEmplea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGrupoRubroEmplea) {
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoRubroEmplea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGrupoRubroEmplea(this.tipogruporubroemplea);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGrupoRubroEmplea(tipogruporubroemplea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGrupoRubroEmplea(tipogruporubroemplea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGrupoRubroEmplea(tipogruporubroemplea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoRubroEmplea(tipogruporubroemplea);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.setText(tipogruporubroemplea.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.setText(tipogruporubroemplea.getcodigo());
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.setText(tipogruporubroemplea.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGrupoRubroEmplea tipogruporubroempleaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogruporubroempleaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGrupoRubroEmplea tipogruporubroempleaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogruporubroempleaLocal=this.tipogruporubroemplea;
			} else {
				tipogruporubroempleaLocal=this.tipogruporubroempleaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogruporubroempleaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGrupoRubroEmplea(tipogruporubroempleaLocal,true);
					
					if(tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogruporubroempleaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogruporubroempleaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(tipogruporubroemplea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(tipogruporubroemplea);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(tipogruporubroemplea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.getText()==null || this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.getText()=="" || this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.setText("0");
			}

			if(conColumnasBase) {tipogruporubroemplea.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoRubroEmpleaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jLabelIdTipoGrupoRubroEmplea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogruporubroemplea.setcodigo(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jLabelcodigoTipoGrupoRubroEmplea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogruporubroemplea.setnombre(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jLabelnombreTipoGrupoRubroEmplea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroempleaBean,TipoGrupoRubroEmplea tipogruporubroemplea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroempleaOrigen,TipoGrupoRubroEmplea tipogruporubroemplea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogruporubroempleaOrigen.getId()!=null && !tipogruporubroempleaOrigen.getId().equals(0L))) {tipogruporubroemplea.setId(tipogruporubroempleaOrigen.getId());}}
			if(conDefault || (!conDefault && tipogruporubroempleaOrigen.getcodigo()!=null && !tipogruporubroempleaOrigen.getcodigo().equals(""))) {tipogruporubroemplea.setcodigo(tipogruporubroempleaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipogruporubroempleaOrigen.getnombre()!=null && !tipogruporubroempleaOrigen.getnombre().equals(""))) {tipogruporubroemplea.setnombre(tipogruporubroempleaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.setText(tipogruporubroemplea.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.setText(tipogruporubroemplea.getcodigo());
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.setText(tipogruporubroemplea.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoRubroEmplea(TipoGrupoRubroEmpleaBean tipogruporubroempleaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.setText(tipogruporubroempleaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.setText(tipogruporubroempleaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.setText(tipogruporubroempleaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGrupoRubroEmplea(TipoGrupoRubroEmpleaParameterReturnGeneral tipogruporubroempleaReturnGeneral,TipoGrupoRubroEmpleaBean tipogruporubroempleaBean,Boolean conDefault) throws Exception { 
		try {
			TipoGrupoRubroEmplea tipogruporubroempleaLocal=new TipoGrupoRubroEmplea();
			
			tipogruporubroempleaLocal=tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogruporubroempleaLocal.getId()!=null && !tipogruporubroempleaLocal.getId().equals(0L))) {tipogruporubroempleaBean.setId(tipogruporubroempleaLocal.getId());}}
			if(conDefault || (!conDefault && tipogruporubroempleaLocal.getcodigo()!=null && !tipogruporubroempleaLocal.getcodigo().equals(""))) {tipogruporubroempleaBean.setcodigo(tipogruporubroempleaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipogruporubroempleaLocal.getnombre()!=null && !tipogruporubroempleaLocal.getnombre().equals(""))) {tipogruporubroempleaBean.setnombre(tipogruporubroempleaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGrupoRubroEmpleaGenerico(Long idTipoGrupoRubroEmpleaSeleccionado,JComboBox jComboBoxTipoGrupoRubroEmplea,List<TipoGrupoRubroEmplea> tipogruporubroempleasLocal)throws Exception {
		try {
			TipoGrupoRubroEmplea  tipogruporubroempleaTemp=null;

			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleasLocal) {
				if(tipogruporubroempleaAux.getId()!=null && tipogruporubroempleaAux.getId().equals(idTipoGrupoRubroEmpleaSeleccionado)) {
					tipogruporubroempleaTemp=tipogruporubroempleaAux;
					break;
				}
			}

			jComboBoxTipoGrupoRubroEmplea.setSelectedItem(tipogruporubroempleaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGrupoRubroEmpleaGenerico(JComboBox jComboBoxTipoGrupoRubroEmplea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGrupoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGrupoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoRubroEmplea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGrupoRubroEmplea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoRubroEmplea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGrupoRubroEmplea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGrupoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGrupoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogruporubroemplea=(TipoGrupoRubroEmplea) tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogruporubroemplea =(TipoGrupoRubroEmplea) tipogruporubroempleas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGrupoRubroEmplea tipogruporubroempleaRow=new TipoGrupoRubroEmplea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogruporubroempleaRow=(TipoGrupoRubroEmplea) tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogruporubroempleaRow=(TipoGrupoRubroEmplea) tipogruporubroempleas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea));			
			this.jButtonDuplicarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea && this.isPermisoDuplicarTipoGrupoRubroEmplea));			
			this.jButtonCopiarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoRubroEmplea && this.isPermisoCopiarTipoGrupoRubroEmplea));
			this.jButtonVerFormTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoRubroEmplea && this.isPermisoVerFormTipoGrupoRubroEmplea));
			
			this.jButtonAbrirOrderByTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea && this.isPermisoOrdenTipoGrupoRubroEmplea));			
			
			this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea));			
			this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea && this.isPermisoActualizarTipoGrupoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea && this.isPermisoActualizarTipoGrupoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea && this.isPermisoEliminarTipoGrupoRubroEmplea));
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarTipoGrupoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea);							
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea));						
			this.jButtonDuplicarToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea && this.isPermisoDuplicarTipoGrupoRubroEmplea));						
			this.jButtonCopiarToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoRubroEmplea && this.isPermisoCopiarTipoGrupoRubroEmplea));			
			this.jButtonVerFormToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoRubroEmplea && this.isPermisoVerFormTipoGrupoRubroEmplea));			
			this.jButtonAbrirOrderByToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea && this.isPermisoOrdenTipoGrupoRubroEmplea));
			this.jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));			
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea && this.isPermisoActualizarTipoGrupoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea  && this.isPermisoActualizarTipoGrupoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea && this.isPermisoEliminarTipoGrupoRubroEmplea));
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarToolBarTipoGrupoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea);				
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea));			
			this.jMenuItemDuplicarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea && this.isPermisoDuplicarTipoGrupoRubroEmplea));			
			this.jMenuItemCopiarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoRubroEmplea && this.isPermisoCopiarTipoGrupoRubroEmplea));			
			this.jMenuItemVerFormTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoRubroEmplea && this.isPermisoVerFormTipoGrupoRubroEmplea));			
			this.jMenuItemAbrirOrderByTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea && this.isPermisoOrdenTipoGrupoRubroEmplea));			
			//this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea && this.isPermisoOrdenTipoGrupoRubroEmplea));
			this.jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea && this.isPermisoOrdenTipoGrupoRubroEmplea));			
			//this.jMenuItemDetalleMostrarOcultarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea && this.isPermisoOrdenTipoGrupoRubroEmplea));			
			this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea));			
			this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea && this.isPermisoNuevoTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));									
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemModificarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea && this.isPermisoActualizarTipoGrupoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemActualizarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea && this.isPermisoActualizarTipoGrupoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemEliminarTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea && this.isPermisoEliminarTipoGrupoRubroEmplea));
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemCancelarTipoGrupoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea);				
			}
			
			this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));						
			this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=this.jButtonNuevoTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea=this.jButtonDuplicarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCopiarTipoGrupoRubroEmplea=this.jButtonCopiarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaVerFormTipoGrupoRubroEmplea=this.jButtonVerFormTipoGrupoRubroEmplea.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGrupoRubroEmplea=this.jButtonAbrirOrderByTipoGrupoRubroEmplea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=this.jButtonModificarTipoGrupoRubroEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=this.jButtonNuevoToolBarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=this.jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarToolBarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarToolBarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarToolBarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarToolBarTipoGrupoRubroEmplea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=this.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=this.jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=this.jMenuItemNuevoTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemModificarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemActualizarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemEliminarTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemCancelarTipoGrupoRubroEmplea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGrupoRubroEmplea(Boolean esInicializar) {
		if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoRubroEmplea();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGrupoRubroEmplea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGrupoRubroEmplea() {
		this.jButtonNuevoTipoGrupoRubroEmplea.setVisible(this.isPermisoNuevoTipoGrupoRubroEmplea);			
		this.jButtonDuplicarTipoGrupoRubroEmplea.setVisible(this.isPermisoDuplicarTipoGrupoRubroEmplea);			
		this.jButtonCopiarTipoGrupoRubroEmplea.setVisible(this.isPermisoCopiarTipoGrupoRubroEmplea);			
		this.jButtonVerFormTipoGrupoRubroEmplea.setVisible(this.isPermisoVerFormTipoGrupoRubroEmplea);			
		
		this.jButtonAbrirOrderByTipoGrupoRubroEmplea.setVisible(this.isPermisoOrdenTipoGrupoRubroEmplea);					
		
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.setVisible(this.isPermisoNuevoTipoGrupoRubroEmplea);			
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarTipoGrupoRubroEmplea.setVisible(this.isPermisoActualizarTipoGrupoRubroEmplea);	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarTipoGrupoRubroEmplea.setVisible(this.isPermisoActualizarTipoGrupoRubroEmplea);	
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarTipoGrupoRubroEmplea.setVisible(this.isPermisoEliminarTipoGrupoRubroEmplea);
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarTipoGrupoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea);						
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.setVisible(this.isPermisoGuardarCambiosTipoGrupoRubroEmplea);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.setVisible(this.isPermisoActualizarTipoGrupoRubroEmplea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoRubroEmplea() {
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarTipoGrupoRubroEmplea.setVisible(this.isPermisoActualizarTipoGrupoRubroEmplea);	
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarTipoGrupoRubroEmplea.setVisible(this.isPermisoActualizarTipoGrupoRubroEmplea);	
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarTipoGrupoRubroEmplea.setVisible(this.isPermisoEliminarTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarTipoGrupoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea);							
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea && this.isPermisoGuardarCambiosTipoGrupoRubroEmplea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGrupoRubroEmplea() {
		if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoRubroEmplea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGrupoRubroEmplea() {
	}
	
	public void jTableDatosTipoGrupoRubroEmpleaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGrupoRubroEmplea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGrupoRubroEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.gettipogruporubroemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogruporubroemplea==null) {
						this.tipogruporubroemplea = new TipoGrupoRubroEmplea();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
				}

				if(this.tipogruporubroemplea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogruporubroemplea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoGrupoRubroEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.gettipogruporubroemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogruporubroemplea==null) {
						this.tipogruporubroemplea = new TipoGrupoRubroEmplea();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
				}

				if(this.tipogruporubroemplea.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipogruporubroemplea.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGrupoRubroEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.gettipogruporubroemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogruporubroemplea==null) {
						this.tipogruporubroemplea = new TipoGrupoRubroEmplea();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);
				}

				if(this.tipogruporubroemplea.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogruporubroemplea.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoGrupoRubroEmplea() {
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.dispose();
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
			this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.dispose();
			this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea=null;
		}
		
		if(this.jInternalFrameImportacionTipoGrupoRubroEmplea!=null) {
			this.jInternalFrameImportacionTipoGrupoRubroEmplea.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGrupoRubroEmplea.dispose();
			this.jInternalFrameImportacionTipoGrupoRubroEmplea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGrupoRubroEmplea();
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGrupoRubroEmplea")) {
				jButtonDuplicarTipoGrupoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGrupoRubroEmplea")) {
				jButtonCopiarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGrupoRubroEmplea")) {
				jButtonVerFormTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGrupoRubroEmplea")) {
				jButtonDuplicarTipoGrupoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGrupoRubroEmplea")) {
				jButtonDuplicarTipoGrupoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGrupoRubroEmplea")) {
				jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGrupoRubroEmplea")) {
				jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGrupoRubroEmplea")) {
				jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGrupoRubroEmplea")) {
				jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGrupoRubroEmplea")) {
				jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGrupoRubroEmplea")) {
				jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGrupoRubroEmplea")) {
				jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGrupoRubroEmplea")) {
				jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGrupoRubroEmplea")) {
				jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGrupoRubroEmplea")) {
				jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGrupoRubroEmplea")) {
				jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGrupoRubroEmplea")) {
				jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGrupoRubroEmplea")) {
				jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGrupoRubroEmplea")) {
				jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGrupoRubroEmplea")) {
				jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGrupoRubroEmplea")) {
				jButtonMostrarOcultarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGrupoRubroEmplea")) {
				jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGrupoRubroEmplea")) {
				jButtonCopiarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGrupoRubroEmplea")) {
				jButtonVerFormTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGrupoRubroEmplea")) {
				jButtonCopiarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGrupoRubroEmplea")) {
				jButtonVerFormTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGrupoRubroEmplea")) {
				jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGrupoRubroEmplea")) {
				jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGrupoRubroEmplea")) {
				jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGrupoRubroEmplea")) {
				jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGrupoRubroEmplea")) {
				jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGrupoRubroEmplea")) {
				jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGrupoRubroEmplea")) {
				jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGrupoRubroEmplea")) {
				jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGrupoRubroEmplea")) {
				jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGrupoRubroEmplea") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea")) {
				jButtonAbrirOrderByTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGrupoRubroEmplea") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGrupoRubroEmplea")) {
				jButtonMostrarOcultarTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGrupoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGrupoRubroEmplea")) {
				jButtonCerrarReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGrupoRubroEmplea")) {
				jButtonGenerarReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGrupoRubroEmplea")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGrupoRubroEmplea")) {
				jButtonCerrarImportacionTipoGrupoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGrupoRubroEmplea")) {
				
				jButtonGenerarImportacionTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGrupoRubroEmplea")) {
				
				jButtonAbrirImportacionTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGrupoRubroEmplea")) {
				jComboBoxTiposAccionesTipoGrupoRubroEmpleaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGrupoRubroEmplea")) {
				jComboBoxTiposRelacionesTipoGrupoRubroEmpleaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGrupoRubroEmplea")) {
				jComboBoxTiposAccionesTipoGrupoRubroEmpleaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGrupoRubroEmplea")) {
				
				jComboBoxTiposSeleccionarTipoGrupoRubroEmpleaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGrupoRubroEmplea")) {
				jTextFieldValorCampoGeneralTipoGrupoRubroEmpleaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGrupoRubroEmplea")) {
				jButtonAbrirOrderByTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGrupoRubroEmplea")) {
				jButtonAbrirOrderByTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGrupoRubroEmplea")) {
				jButtonCerrarOrderByTipoGrupoRubroEmpleaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoRubroEmpleaBusqueda")) {
				this.jButtonidTipoGrupoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGrupoRubroEmpleaBusqueda")) {
				this.jButtoncodigoTipoGrupoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoRubroEmpleaBusqueda")) {
				this.jButtonnombreTipoGrupoRubroEmpleaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGrupoRubroEmplea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGrupoRubroEmplea tipogruporubroempleaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogruporubroempleaLocal=this.tipogruporubroemplea;
			} else {
				tipogruporubroempleaLocal=this.tipogruporubroempleaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
							
				
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
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
			
			


			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
								
						
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
								
				
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
							
				
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
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
			
			


			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
								
				
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGrupoRubroEmplea")) {
					jCheckBoxSeleccionarTodosTipoGrupoRubroEmpleaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGrupoRubroEmplea")) {
					jCheckBoxSeleccionadosTipoGrupoRubroEmpleaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGrupoRubroEmplea")) {
					
				}
				
				


				
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
												
				
				


				
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
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
			
			


			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogruporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogruporubroemplea);
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
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
				
				


				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoRubroEmplea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogruporubroempleaAnterior =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGrupoRubroEmplea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGrupoRubroEmpleaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGrupoRubroEmplea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogruporubroemplea =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogruporubroemplea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGrupoRubroEmplea")) {
				
				}
				
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGrupoRubroEmplea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGrupoRubroEmplea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGrupoRubroEmplea")) {
			
			}
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGrupoRubroEmplea();
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGrupoRubroEmplea")) {
				jButtonDuplicarTipoGrupoRubroEmpleaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGrupoRubroEmplea")) {
				jButtonCopiarTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGrupoRubroEmplea")) {
				jButtonVerFormTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoRubroEmplea")) {
				jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGrupoRubroEmplea")) {
				jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGrupoRubroEmplea")) {
				jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGrupoRubroEmplea")) {
				jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGrupoRubroEmplea")) {
				jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGrupoRubroEmplea")) {
				jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGrupoRubroEmplea")) {
				jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGrupoRubroEmplea")) {
				jButtonAbrirOrderByTipoGrupoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGrupoRubroEmplea")) {
				jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGrupoRubroEmplea")) {
				jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGrupoRubroEmplea")) {
				jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoRubroEmpleaBusqueda")) {
				this.jButtonidTipoGrupoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGrupoRubroEmpleaBusqueda")) {
				this.jButtoncodigoTipoGrupoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoRubroEmpleaBusqueda")) {
				this.jButtonnombreTipoGrupoRubroEmpleaBusquedaActionPerformed(evt);
			}
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGrupoRubroEmplea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGrupoRubroEmplea")) {
				closingInternalFrameTipoGrupoRubroEmplea();
				
			} else if(sTipo.equals("jButtonCancelarTipoGrupoRubroEmplea")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGrupoRubroEmplea = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGrupoRubroEmpleaBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoRubroEmpleaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoRubroEmplea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(null);
			}
			
			TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogruporubroemplea,new Object(),this.tipogruporubroempleaParameterGeneral,this.tipogruporubroempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGrupoRubroEmplea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGrupoRubroEmplea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGrupoRubroEmplea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogruporubroemplea)) {
			if(!esControlTabla) {
				if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);			
				}
				
				if(this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogruporubroempleaReturnGeneral=tipogruporubroempleaLogic.procesarEventosTipoGrupoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas(),this.tipogruporubroemplea,this.tipogruporubroempleaParameterGeneral,this.isEsNuevoTipoGrupoRubroEmplea,classes);//this.tipogruporubroempleaLogic.getTipoGrupoRubroEmplea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral,this.tipogruporubroempleaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoRubroEmplea(classes,this.tipogruporubroempleaReturnGeneral,this.tipogruporubroempleaBean,false);
					}
						
					if(this.tipogruporubroempleaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea());	
					}
						
					if(this.tipogruporubroempleaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea(),classes);//this.tipogruporubroempleaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoRubroEmplea(this.tipogruporubroemplea,classes);//this.tipogruporubroempleaBean);									
				}
			
				if(TipoGrupoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGrupoRubroEmplea(this.tipogruporubroemplea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoRubroEmplea(this.tipogruporubroemplea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogruporubroempleaAnterior!=null) {
						this.tipogruporubroemplea=this.tipogruporubroempleaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogruporubroempleaReturnGeneral=tipogruporubroempleaLogic.procesarEventosTipoGrupoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas(),this.tipogruporubroemplea,this.tipogruporubroempleaParameterGeneral,this.isEsNuevoTipoGrupoRubroEmplea,classes);//this.tipogruporubroempleaLogic.getTipoGrupoRubroEmplea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea(),tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea(),this.tipogruporubroempleas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGrupoRubroEmplea.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGrupoRubroEmplea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGrupoRubroEmplea();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGrupoRubroEmplea() throws Exception {
		
		TipoGrupoRubroEmpleaModel tipogruporubroempleaModel=(TipoGrupoRubroEmpleaModel)this.jTableDatosTipoGrupoRubroEmplea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogruporubroempleaModel.tipogruporubroempleas=this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogruporubroempleaModel.tipogruporubroempleas=this.tipogruporubroempleas;
		}
		
		
		((TipoGrupoRubroEmpleaModel) this.jTableDatosTipoGrupoRubroEmplea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGrupoRubroEmplea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogruporubroempleaAnterior(),this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogruporubroempleaAnterior(),this.tipogruporubroempleas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGrupoRubroEmplea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
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
										
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogruporubroemplea,new Object(),generalEntityParameterGeneral,this.tipogruporubroempleaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGrupoRubroEmpleaConstantesFunciones.getClassesRelationshipsOfTipoGrupoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGrupoRubroEmpleaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGrupoRubroEmplea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGrupoRubroEmplea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogruporubroemplea,new Object(),generalEntityParameterGeneral,this.tipogruporubroempleaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGrupoRubroEmplea(TipoGrupoRubroEmpleaBean tipogruporubroempleaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoRubroEmplea(ArrayList<Classe> classes,TipoGrupoRubroEmpleaReturnGeneral tipogruporubroempleaReturnGeneral,TipoGrupoRubroEmpleaBean tipogruporubroempleaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipogruporubroemplea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea = new TipoGrupoRubroEmpleaDetalleFormJInternalFrame(jDesktopPane,this.tipogruporubroempleaSessionBean.getConGuardarRelaciones(),this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setVisible(false);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.tipogruporubroempleaLogic=this.tipogruporubroempleaLogic;
		
		this.cargarCombosFrameForeignKeyTipoGrupoRubroEmplea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoRubroEmplea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoRubroEmplea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGrupoRubroEmplea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoRubroEmplea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoRubroEmplea"));
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoRubroEmplea"));

		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarToolBarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoRubroEmplea"));
					
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemModificarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoRubroEmplea"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarToolBarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoRubroEmplea"));
						
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemActualizarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoRubroEmplea"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoRubroEmplea"));
								
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemEliminarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoRubroEmplea"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoRubroEmplea"));
					
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemCancelarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoRubroEmplea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemDetalleCerrarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoRubroEmplea"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoRubroEmplea"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoRubroEmplea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonidTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGrupoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonnombreTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoRubroEmpleaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoRubroEmplea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGrupoRubroEmplea"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoRubroEmplea"));
		}
		
		this.jTableDatosTipoGrupoRubroEmplea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGrupoRubroEmplea"));
		
		this.jTableDatosTipoGrupoRubroEmplea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGrupoRubroEmplea"));
		
		this.jButtonNuevoTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"NuevoTipoGrupoRubroEmplea"));
		
		this.jButtonDuplicarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"DuplicarTipoGrupoRubroEmplea"));
		
		this.jButtonCopiarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"CopiarTipoGrupoRubroEmplea"));
		
		this.jButtonVerFormTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"VerFormTipoGrupoRubroEmplea"));
		
		
		this.jButtonNuevoToolBarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGrupoRubroEmplea"));
			
		this.jButtonDuplicarToolBarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGrupoRubroEmplea"));
			
		this.jMenuItemNuevoTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGrupoRubroEmplea"));
			
		this.jMenuItemDuplicarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGrupoRubroEmplea"));		
		
		
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGrupoRubroEmplea"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGrupoRubroEmplea"));
			
		this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGrupoRubroEmplea"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonModificarToolBarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoRubroEmplea"));
			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemModificarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonActualizarToolBarTipoGrupoRubroEmplea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoRubroEmplea"));
				
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemActualizarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonEliminarToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoRubroEmplea"));
						
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemEliminarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonCancelarToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoRubroEmplea"));
			
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemCancelarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoRubroEmplea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGrupoRubroEmplea"));		
		
		
		this.jButtonCerrarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CerrarTipoGrupoRubroEmplea"));
		
		
		this.jButtonCerrarToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGrupoRubroEmplea"));
			
		this.jMenuItemCerrarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGrupoRubroEmplea"));
			
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jMenuItemDetalleCerrarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGrupoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoRubroEmplea"));
		}
		
		this.jButtonCopiarToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGrupoRubroEmplea"));
			
		this.jButtonVerFormToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGrupoRubroEmplea"));
		
		this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGrupoRubroEmplea"));
			
		this.jMenuItemCopiarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGrupoRubroEmplea"));		
		
		this.jMenuItemVerFormTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGrupoRubroEmplea"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoRubroEmplea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGrupoRubroEmplea"));
			
		this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoRubroEmplea"));		
		
		
		
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGrupoRubroEmplea"));
					
		this.jButtonRecargarInformacionToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGrupoRubroEmplea"));
		
		this.jMenuItemRecargarInformacionTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGrupoRubroEmplea"));		
		
		
		
		this.jButtonAnterioresTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"AnterioresTipoGrupoRubroEmplea"));
		
		
		this.jButtonAnterioresToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGrupoRubroEmplea"));
		
		this.jMenuItemAnterioresTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGrupoRubroEmplea"));		
		
		
		this.jButtonSiguientesTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"SiguientesTipoGrupoRubroEmplea"));
		
		
		this.jButtonSiguientesToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGrupoRubroEmplea"));
			
		this.jMenuItemSiguientesTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGrupoRubroEmplea"));
			
		this.jMenuItemAbrirOrderByTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGrupoRubroEmplea"));
			
		this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGrupoRubroEmplea"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea"));
			
		this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGrupoRubroEmplea"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGrupoRubroEmplea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGrupoRubroEmplea"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGrupoRubroEmplea"));

		this.jCheckBoxSeleccionadosTipoGrupoRubroEmplea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGrupoRubroEmplea"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoRubroEmplea"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGrupoRubroEmplea"));
			
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGrupoRubroEmplea"));
					
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGrupoRubroEmplea"));
			
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGrupoRubroEmplea"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonidTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGrupoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonnombreTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoRubroEmpleaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoGrupoRubroEmplea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoRubroEmplea"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoRubroEmplea"));				
			//this.jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoRubroEmplea"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoRubroEmplea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGrupoRubroEmplea!=null) {
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoRubroEmplea"));
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoRubroEmplea"));
				this.jInternalFrameImportacionTipoGrupoRubroEmplea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoRubroEmplea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGrupoRubroEmplea"));
			
			this.jButtonAbrirOrderByToolBarTipoGrupoRubroEmplea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGrupoRubroEmplea"));			
			
			if(this.jInternalFrameOrderByTipoGrupoRubroEmplea!=null) {
				this.jInternalFrameOrderByTipoGrupoRubroEmplea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoRubroEmplea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTabbedPaneRelacionesTipoGrupoRubroEmplea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoRubroEmplea"));
		
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
            		closingInternalFrameTipoGrupoRubroEmplea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGrupoRubroEmplea = (JInternalFrameBase)event.getSource();
	            	
	            TipoGrupoRubroEmpleaBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoRubroEmpleaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoRubroEmplea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGrupoRubroEmplea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGrupoRubroEmpleaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGrupoRubroEmplea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGrupoRubroEmplea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGrupoRubroEmplea";
		inputMap = this.jButtonNuevoTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGrupoRubroEmplea";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoRubroEmpleaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGrupoRubroEmplea";
		inputMap = this.jButtonModificarTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGrupoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGrupoRubroEmplea";
		inputMap = this.jButtonActualizarTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGrupoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGrupoRubroEmplea";
		inputMap = this.jButtonEliminarTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGrupoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGrupoRubroEmplea";
		inputMap = this.jButtonCancelarTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGrupoRubroEmplea";
		inputMap = this.jButtonCerrarTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGrupoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGrupoRubroEmplea";
		inputMap = this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonGuardarCambiosTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGrupoRubroEmplea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGrupoRubroEmpleaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGrupoRubroEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGrupoRubroEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGrupoRubroEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonidTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGrupoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jButtonnombreTipoGrupoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoRubroEmpleaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGrupoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGrupoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGrupoRubroEmpleaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGrupoRubroEmplea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGrupoRubroEmplea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
					tipogruporubroempleaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleas) {
					tipogruporubroempleaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGrupoRubroEmpleaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
						tipogruporubroempleaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleas) {
						tipogruporubroempleaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoRubroEmplea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoRubroEmplea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoRubroEmplea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGrupoRubroEmpleaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGrupoRubroEmplea.getSelectedRows();
			
			TipoGrupoRubroEmplea tipogruporubroempleaLocal=new TipoGrupoRubroEmplea();
			
			//this.seleccionarTodosTipoGrupoRubroEmplea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogruporubroempleaLocal =(TipoGrupoRubroEmplea) this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas().toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogruporubroempleaLocal =(TipoGrupoRubroEmplea) this.tipogruporubroempleas.toArray()[this.jTableDatosTipoGrupoRubroEmplea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogruporubroempleaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
						tipogruporubroempleaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleas) {
						tipogruporubroempleaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoRubroEmplea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoRubroEmplea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoRubroEmplea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGrupoRubroEmpleaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGrupoRubroEmpleaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGrupoRubroEmpleaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGrupoRubroEmplea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
				
						if(sTipoSeleccionar.equals(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogruporubroempleaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogruporubroempleaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleas) {
					
						if(sTipoSeleccionar.equals(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogruporubroempleaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogruporubroempleaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGrupoRubroEmpleaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGrupoRubroEmplea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGrupoRubroEmplea) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGrupoRubroEmplea(conSplash);
				
					this.generarReporteTipoGrupoRubroEmpleasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGrupoRubroEmpleasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoRubroEmpleasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoRubroEmpleasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoRubroEmplea();
				
				this.exportarTipoGrupoRubroEmpleasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGrupoRubroEmpleas();
				//this.importarTipoGrupoRubroEmpleas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoRubroEmplea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGrupoRubroEmpleasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Grupo Rubro Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGrupoRubroEmplea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGrupoRubroEmplea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGrupoRubroEmplea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGrupoRubroEmplea();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGrupoRubroEmplea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGrupoRubroEmpleaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGrupoRubroEmplea();
			
			if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
			TipoGrupoRubroEmplea tipogruporubroemplea=new TipoGrupoRubroEmplea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea.getSelectedItem();
			
			
			
			
			tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogruporubroempleasSeleccionados.size()==1) {
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleasSeleccionados) {
					tipogruporubroemplea=tipogruporubroempleaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGrupoRubroEmplea();
			
      		//this.finishProcessTipoGrupoRubroEmplea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGrupoRubroEmpleaReturnGeneral() throws Exception {
		if(this.tipogruporubroempleaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogruporubroempleaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogruporubroempleaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogruporubroempleaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogruporubroempleaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogruporubroempleaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
		}
		
		if(this.tipogruporubroempleaReturnGeneral.getConRetornoLista() || this.tipogruporubroempleaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogruporubroempleaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogruporubroempleaLogic.setTipoGrupoRubroEmpleas(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogruporubroempleaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogruporubroempleaLogic.setTipoGrupoRubroEmplea(this.tipogruporubroempleaReturnGeneral.getTipoGrupoRubroEmplea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGrupoRubroEmplea(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGrupoRubroEmplea() throws Exception {
		
		
	}
	
	public ArrayList<TipoGrupoRubroEmplea> getTipoGrupoRubroEmpleasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGrupoRubroEmplea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas()) {
					if(tipogruporubroempleaAux.getIsSelected()) {
						tipogruporubroempleasSeleccionados.add(tipogruporubroempleaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoRubroEmplea tipogruporubroempleaAux:this.tipogruporubroempleas) {
					if(tipogruporubroempleaAux.getIsSelected()) {
						tipogruporubroempleasSeleccionados.add(tipogruporubroempleaAux);				
					}
				}
			}
			
			if(tipogruporubroempleasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogruporubroempleasSeleccionados.addAll(this.tipogruporubroempleaLogic.getTipoGrupoRubroEmpleas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogruporubroempleasSeleccionados.addAll(this.tipogruporubroempleas);				
					}
				}
			}
		} else {
			tipogruporubroempleasSeleccionados.add(this.tipogruporubroemplea);
		}
		
		return tipogruporubroempleasSeleccionados;
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
	
	public void generarReporteTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGrupoRubroEmpleasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGrupoRubroEmpleasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoRubroEmpleasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoRubroEmpleasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Grupo Rubro Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGrupoRubroEmpleasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGrupoRubroEmplea();
		
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGrupoRubroEmplea();
		
		
		//this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleasSeleccionados ,tipogruporubroempleaImplementable,tipogruporubroempleaImplementableHome);
	}
	
	public void mostrarImportacionTipoGrupoRubroEmpleas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGrupoRubroEmplea();
		
		this.abrirFrameImportacionTipoGrupoRubroEmplea();		
		
			
		//this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleasSeleccionados ,tipogruporubroempleaImplementable,tipogruporubroempleaImplementableHome);
	}
	
	public void importarTipoGrupoRubroEmpleas() throws Exception {		
	
	}
	
	public void exportarTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGrupoRubroEmpleasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGrupoRubroEmpleasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGrupoRubroEmpleasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Grupo Rubro Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogruporubroemplea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGrupoRubroEmplea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGrupoRubroEmplea(tipogruporubroempleaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogruporubroempleaAux.setsDetalleGeneralEntityReporte(tipogruporubroempleaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGrupoRubroEmplea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGrupoRubroEmpleaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoRubroEmpleaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogruporubroemplea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogruporubroemplea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogruporubroemplea.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogruporubroemplea.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogruporubroemplea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGrupoRubroEmpleas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGrupoRubroEmplea(row);				
				iRow++;
			}				
			
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGrupoRubroEmplea(tipogruporubroempleaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGrupoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();		
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogruporubroemplea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogruporubroempleas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogruporubroemplea");
			//elementRoot.appendChild(element);
		
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleasSeleccionados) {
				element = document.createElement("tipogruporubroemplea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGrupoRubroEmplea(tipogruporubroempleaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Rubro Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGrupoRubroEmplea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogruporubroemplea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogruporubroemplea.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogruporubroemplea.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGrupoRubroEmplea(TipoGrupoRubroEmplea tipogruporubroemplea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGrupoRubroEmpleaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogruporubroemplea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGrupoRubroEmpleaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogruporubroemplea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoGrupoRubroEmpleaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipogruporubroemplea.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoGrupoRubroEmpleaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogruporubroemplea.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGrupoRubroEmpleasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados=new ArrayList<TipoGrupoRubroEmplea>();
		
		tipogruporubroempleasSeleccionados=this.getTipoGrupoRubroEmpleasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGrupoRubroEmplea(tipogruporubroempleasSeleccionados);
		
		this.generarReporteTipoGrupoRubroEmpleas("Todos",tipogruporubroempleasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGrupoRubroEmplea(ArrayList<TipoGrupoRubroEmplea> tipogruporubroempleasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGrupoRubroEmplea tipogruporubroempleaAux:tipogruporubroempleasSeleccionados) {
				tipogruporubroempleaAux.setsDetalleGeneralEntityReporte(tipogruporubroempleaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipogruporubroempleaAux.setsDescripcionGeneralEntityReporte1(tipogruporubroempleaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogruporubroempleaAux.setsDescripcionGeneralEntityReporte1(tipogruporubroempleaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGrupoRubroEmplea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoGrupoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoRubroEmplea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=true;
		} else {
			this.actualizarEstadoPanelsTipoGrupoRubroEmplea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGrupoRubroEmplea=false;
			//this.isVisibilidadCeldaVerFormTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoRubroEmplea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoRubroEmplea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			if(!tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;												
			}
			
			this.jButtonCerrarTipoGrupoRubroEmplea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoRubroEmplea=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogruporubroemplea)) {
			this.isVisibilidadCeldaActualizarTipoGrupoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoGrupoRubroEmplea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoRubroEmplea() {
	}
	
	public void actualizarEstadoPanelsTipoGrupoRubroEmplea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoRubroEmplea!=null) {
				this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoGrupoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoRubroEmplea!=null) {
				this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoGrupoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoRubroEmplea!=null) {
				this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoGrupoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoRubroEmplea!=null) {
				this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoRubroEmplea!=null) {
				this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoRubroEmplea!=null) {
				this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoRubroEmplea!=null) {
				this.jPanelPaginacionTipoGrupoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoGrupoRubroEmplea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGrupoRubroEmpleaSessionBean tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
		
		if(this.tipogruporubroempleaSessionBean==null) {
			this.tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
		}
		
		this.tipogruporubroempleaSessionBean.setsUltimaBusquedaTipoGrupoRubroEmplea(this.getsAccionBusqueda());
		this.tipogruporubroempleaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogruporubroempleaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGrupoRubroEmpleaSessionBean tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
		
		if(this.tipogruporubroempleaSessionBean==null) {
			this.tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
		}
		
		if(this.tipogruporubroempleaSessionBean.getsUltimaBusquedaTipoGrupoRubroEmplea()!=null&&!this.tipogruporubroempleaSessionBean.getsUltimaBusquedaTipoGrupoRubroEmplea().equals("")) {
			this.setsAccionBusqueda(tipogruporubroempleaSessionBean.getsUltimaBusquedaTipoGrupoRubroEmplea());
			this.setiNumeroPaginacion(tipogruporubroempleaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogruporubroempleaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipogruporubroempleaSessionBean.setsUltimaBusquedaTipoGrupoRubroEmplea("");
		this.tipogruporubroempleaSessionBean.setiNumeroPaginacion(TipoGrupoRubroEmpleaConstantesFunciones.INUMEROPAGINACION);
		this.tipogruporubroempleaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGrupoRubroEmplea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGrupoRubroEmplea() {
		this.updateBorderResaltarBusquedasFormularioTipoGrupoRubroEmplea();
		this.updateVisibilidadBusquedasFormularioTipoGrupoRubroEmplea();
		this.updateHabilitarBusquedasFormularioTipoGrupoRubroEmplea();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGrupoRubroEmplea() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGrupoRubroEmplea() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoGrupoRubroEmplea() {
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
	
	public void updateControlesFormularioTipoGrupoRubroEmplea() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGrupoRubroEmplea();
		this.updateVisibilidadResaltarControlesFormularioTipoGrupoRubroEmplea();
		this.updateHabilitarResaltarControlesFormularioTipoGrupoRubroEmplea();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGrupoRubroEmplea() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogruporubroempleaConstantesFunciones.resaltaridTipoGrupoRubroEmplea!=null && this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.setBorder(this.tipogruporubroempleaConstantesFunciones.resaltaridTipoGrupoRubroEmplea);}
		if(this.tipogruporubroempleaConstantesFunciones.resaltarcodigoTipoGrupoRubroEmplea!=null && this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.setBorder(this.tipogruporubroempleaConstantesFunciones.resaltarcodigoTipoGrupoRubroEmplea);}
		if(this.tipogruporubroempleaConstantesFunciones.resaltarnombreTipoGrupoRubroEmplea!=null && this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.setBorder(this.tipogruporubroempleaConstantesFunciones.resaltarnombreTipoGrupoRubroEmplea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGrupoRubroEmplea() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
	
		//this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.setVisible(this.tipogruporubroempleaConstantesFunciones.mostraridTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jPanelidTipoGrupoRubroEmplea.setVisible(this.tipogruporubroempleaConstantesFunciones.mostraridTipoGrupoRubroEmplea);
		//this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.setVisible(this.tipogruporubroempleaConstantesFunciones.mostrarcodigoTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jPanelcodigoTipoGrupoRubroEmplea.setVisible(this.tipogruporubroempleaConstantesFunciones.mostrarcodigoTipoGrupoRubroEmplea);
		//this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.setVisible(this.tipogruporubroempleaConstantesFunciones.mostrarnombreTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jPanelnombreTipoGrupoRubroEmplea.setVisible(this.tipogruporubroempleaConstantesFunciones.mostrarnombreTipoGrupoRubroEmplea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGrupoRubroEmplea() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoRubroEmplea!=null) {
	
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldidTipoGrupoRubroEmplea.setEnabled(this.tipogruporubroempleaConstantesFunciones.activaridTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextFieldcodigoTipoGrupoRubroEmplea.setEnabled(this.tipogruporubroempleaConstantesFunciones.activarcodigoTipoGrupoRubroEmplea);
		this.jInternalFrameDetalleFormTipoGrupoRubroEmplea.jTextAreanombreTipoGrupoRubroEmplea.setEnabled(this.tipogruporubroempleaConstantesFunciones.activarnombreTipoGrupoRubroEmplea);
		}
	}
	
		
}