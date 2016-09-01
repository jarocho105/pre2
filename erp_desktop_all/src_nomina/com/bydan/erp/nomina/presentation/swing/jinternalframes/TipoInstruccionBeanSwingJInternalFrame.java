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

import com.bydan.erp.nomina.util.TipoInstruccionConstantesFunciones;
import com.bydan.erp.nomina.util.TipoInstruccionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoInstruccionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoInstruccionBean;
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
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoInstruccionBeanSwingJInternalFrame extends TipoInstruccionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoInstruccionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoInstruccion> tipoinstruccionValidator = new ClassValidator<TipoInstruccion>(TipoInstruccion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoInstruccion tipoinstruccion;	
	public TipoInstruccion tipoinstruccionAux;
	public TipoInstruccion tipoinstruccionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoInstruccion tipoinstruccionTotales;
	public Long idTipoInstruccionActual;
	public Long iIdNuevoTipoInstruccion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
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
	
	public Boolean isPermisoTodoTipoInstruccion;
	public Boolean isPermisoNuevoTipoInstruccion;
	public Boolean isPermisoActualizarTipoInstruccion;
	public Boolean isPermisoActualizarOriginalTipoInstruccion;
	public Boolean isPermisoEliminarTipoInstruccion;
	public Boolean isPermisoGuardarCambiosTipoInstruccion;
	public Boolean isPermisoConsultaTipoInstruccion;
	public Boolean isPermisoBusquedaTipoInstruccion;
	public Boolean isPermisoReporteTipoInstruccion;
	public Boolean isPermisoPaginacionMedioTipoInstruccion;
	public Boolean isPermisoPaginacionAltoTipoInstruccion;
	public Boolean isPermisoPaginacionTodoTipoInstruccion;
	public Boolean isPermisoCopiarTipoInstruccion;
	public Boolean isPermisoVerFormTipoInstruccion;
	public Boolean isPermisoDuplicarTipoInstruccion;
	public Boolean isPermisoOrdenTipoInstruccion;
	
	
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
	
	public TipoInstruccionParameterReturnGeneral tipoinstruccionReturnGeneral;
	public TipoInstruccionParameterReturnGeneral tipoinstruccionParameterGeneral;
	
	

	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoInstruccion=false;
	public Boolean esParaAccionDesdeFormularioTipoInstruccion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoInstruccionLogic tipoinstruccionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoInstruccion tipoinstruccionBean;
	public TipoInstruccionConstantesFunciones tipoinstruccionConstantesFunciones;
	//public TipoInstruccionParameterReturnGeneral tipoinstruccionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoInstruccion> tipoinstruccions;	
	//public List<TipoInstruccion> tipoinstruccionsEliminados;
	//public List<TipoInstruccion> tipoinstruccionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoInstruccion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoInstruccion=true;
	public Boolean isVisibilidadCeldaCopiarTipoInstruccion=true;
	public Boolean isVisibilidadCeldaVerFormTipoInstruccion=true;
	public Boolean isVisibilidadCeldaOrdenTipoInstruccion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
	public Boolean isVisibilidadCeldaModificarTipoInstruccion=false;
	public Boolean isVisibilidadCeldaActualizarTipoInstruccion=false;
	public Boolean isVisibilidadCeldaEliminarTipoInstruccion=false;
	public Boolean isVisibilidadCeldaCancelarTipoInstruccion=false;
	public Boolean isVisibilidadCeldaGuardarTipoInstruccion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;	
	
	
	
	public Long getiIdNuevoTipoInstruccion() {
		return this.iIdNuevoTipoInstruccion;
	}

	public void setiIdNuevoTipoInstruccion(Long iIdNuevoTipoInstruccion) {
		this.iIdNuevoTipoInstruccion = iIdNuevoTipoInstruccion;
	}
	
	public Long getidTipoInstruccionActual() {
		return this.idTipoInstruccionActual;
	}

	public void setidTipoInstruccionActual(Long idTipoInstruccionActual) {
		this.idTipoInstruccionActual = idTipoInstruccionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoInstruccion gettipoinstruccion() {
		return this.tipoinstruccion;
	}

	public void settipoinstruccion(TipoInstruccion tipoinstruccion) {
		this.tipoinstruccion = tipoinstruccion;
	}
	
	public TipoInstruccion gettipoinstruccionAux() {
		return this.tipoinstruccionAux;
	}

	public void settipoinstruccionAux(TipoInstruccion tipoinstruccionAux) {
		this.tipoinstruccionAux = tipoinstruccionAux;
	}				
	
	public TipoInstruccion gettipoinstruccionAnterior() {
		return this.tipoinstruccionAnterior;
	}

	public void settipoinstruccionAnterior(TipoInstruccion tipoinstruccionAnterior) {
		this.tipoinstruccionAnterior = tipoinstruccionAnterior;
	}	
	
	public TipoInstruccion gettipoinstruccionTotales() {
		return this.tipoinstruccionTotales;
	}

	public void settipoinstruccionTotales(TipoInstruccion tipoinstruccionTotales) {
		this.tipoinstruccionTotales = tipoinstruccionTotales;
	}	
	
	public TipoInstruccion gettipoinstruccionBean() {
		return this.tipoinstruccionBean;
	}

	public void settipoinstruccionBean(TipoInstruccion tipoinstruccionBean) {
		this.tipoinstruccionBean = tipoinstruccionBean;
	}	
	
	public TipoInstruccionParameterReturnGeneral gettipoinstruccionReturnGeneral() {
		return this.tipoinstruccionReturnGeneral;
	}

	public void settipoinstruccionReturnGeneral(TipoInstruccionParameterReturnGeneral tipoinstruccionReturnGeneral) {
		this.tipoinstruccionReturnGeneral = tipoinstruccionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoInstruccionLogic getTipoInstruccionLogic()	{		
		return tipoinstruccionLogic;
	}

	public void setTipoInstruccionLogic(TipoInstruccionLogic tipoinstruccionLogic) {
		this.tipoinstruccionLogic = tipoinstruccionLogic;
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
	
	public Boolean getIsEsNuevoTipoInstruccion() {
		return isEsNuevoTipoInstruccion;
	}

	public void setIsEsNuevoTipoInstruccion(Boolean isEsNuevoTipoInstruccion) {
		this.isEsNuevoTipoInstruccion = isEsNuevoTipoInstruccion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoInstruccion() {
		return esParaAccionDesdeFormularioTipoInstruccion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoInstruccion(Boolean esParaAccionDesdeFormularioTipoInstruccion) {
		this.esParaAccionDesdeFormularioTipoInstruccion = esParaAccionDesdeFormularioTipoInstruccion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoInstruccion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoInstruccionConstantesFunciones.refrescarForeignKeysDescripcionesTipoInstruccion(this.tipoinstruccionLogic.getTipoInstruccions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoInstruccionConstantesFunciones.refrescarForeignKeysDescripcionesTipoInstruccion(this.tipoinstruccions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoinstruccionLogic.setTipoInstruccions(this.tipoinstruccions);
			tipoinstruccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoInstruccionParameterReturnGeneral getTipoInstruccionParameterGeneral() {
		return this.tipoinstruccionParameterGeneral;
	}
	
	public void setTipoInstruccionParameterGeneral(TipoInstruccionParameterReturnGeneral tipoinstruccionParameterGeneral) {
		this.tipoinstruccionParameterGeneral = tipoinstruccionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoInstruccion() {
		return isPermisoTodoTipoInstruccion;
	}

	public void setIsPermisoTodoTipoInstruccion(Boolean isPermisoTodoTipoInstruccion) {
		this.isPermisoTodoTipoInstruccion = isPermisoTodoTipoInstruccion;
	}

	public Boolean getIsPermisoNuevoTipoInstruccion() {
		return isPermisoNuevoTipoInstruccion;
	}

	public void setIsPermisoNuevoTipoInstruccion(Boolean isPermisoNuevoTipoInstruccion) {
		this.isPermisoNuevoTipoInstruccion = isPermisoNuevoTipoInstruccion;
	}

	public Boolean getIsPermisoActualizarTipoInstruccion() {
		return isPermisoActualizarTipoInstruccion;
	}

	public void setIsPermisoActualizarTipoInstruccion(Boolean isPermisoActualizarTipoInstruccion) {
		this.isPermisoActualizarTipoInstruccion = isPermisoActualizarTipoInstruccion;
	}

	public Boolean getIsPermisoEliminarTipoInstruccion() {
		return isPermisoEliminarTipoInstruccion;
	}

	public void setIsPermisoEliminarTipoInstruccion(Boolean isPermisoEliminarTipoInstruccion) {
		this.isPermisoEliminarTipoInstruccion = isPermisoEliminarTipoInstruccion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoInstruccion() {
		return isPermisoGuardarCambiosTipoInstruccion;
	}

	public void setIsPermisoGuardarCambiosTipoInstruccion(Boolean isPermisoGuardarCambiosTipoInstruccion) {
		this.isPermisoGuardarCambiosTipoInstruccion = isPermisoGuardarCambiosTipoInstruccion;
	}
	
	public Boolean getIsPermisoConsultaTipoInstruccion() {
		return isPermisoConsultaTipoInstruccion;
	}

	public void setIsPermisoConsultaTipoInstruccion(Boolean isPermisoConsultaTipoInstruccion) {
		this.isPermisoConsultaTipoInstruccion = isPermisoConsultaTipoInstruccion;
	}

	public Boolean getIsPermisoBusquedaTipoInstruccion() {
		return isPermisoBusquedaTipoInstruccion;
	}

	public void setIsPermisoBusquedaTipoInstruccion(Boolean isPermisoBusquedaTipoInstruccion) {
		this.isPermisoBusquedaTipoInstruccion = isPermisoBusquedaTipoInstruccion;
	}

	public Boolean getIsPermisoReporteTipoInstruccion() {
		return isPermisoReporteTipoInstruccion;
	}

	public void setIsPermisoReporteTipoInstruccion(Boolean isPermisoReporteTipoInstruccion) {
		this.isPermisoReporteTipoInstruccion = isPermisoReporteTipoInstruccion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoInstruccion() {
		return isPermisoPaginacionMedioTipoInstruccion;
	}

	public void setIsPermisoPaginacionMedioTipoInstruccion(Boolean isPermisoPaginacionMedioTipoInstruccion) {
		this.isPermisoPaginacionMedioTipoInstruccion = isPermisoPaginacionMedioTipoInstruccion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoInstruccion() {
		return isPermisoPaginacionTodoTipoInstruccion;
	}

	public void setIsPermisoPaginacionTodoTipoInstruccion(Boolean isPermisoPaginacionTodoTipoInstruccion) {
		this.isPermisoPaginacionTodoTipoInstruccion = isPermisoPaginacionTodoTipoInstruccion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoInstruccion() {
		return isPermisoPaginacionAltoTipoInstruccion;
	}

	public void setIsPermisoPaginacionAltoTipoInstruccion(Boolean isPermisoPaginacionAltoTipoInstruccion) {
		this.isPermisoPaginacionAltoTipoInstruccion = isPermisoPaginacionAltoTipoInstruccion;
	}
	
	public Boolean getIsPermisoCopiarTipoInstruccion() {
		return isPermisoCopiarTipoInstruccion;
	}

	public void setIsPermisoCopiarTipoInstruccion(Boolean isPermisoCopiarTipoInstruccion) {
		this.isPermisoCopiarTipoInstruccion = isPermisoCopiarTipoInstruccion;
	}
	
	public Boolean getIsPermisoVerFormTipoInstruccion() {
		return isPermisoVerFormTipoInstruccion;
	}

	public void setIsPermisoVerFormTipoInstruccion(Boolean isPermisoVerFormTipoInstruccion) {
		this.isPermisoVerFormTipoInstruccion = isPermisoVerFormTipoInstruccion;
	}
	
	public Boolean getIsPermisoDuplicarTipoInstruccion() {
		return isPermisoDuplicarTipoInstruccion;
	}

	public void setIsPermisoDuplicarTipoInstruccion(Boolean isPermisoDuplicarTipoInstruccion) {
		this.isPermisoDuplicarTipoInstruccion = isPermisoDuplicarTipoInstruccion;
	}
	
	public Boolean getIsPermisoOrdenTipoInstruccion() {
		return isPermisoOrdenTipoInstruccion;
	}

	public void setIsPermisoOrdenTipoInstruccion(Boolean isPermisoOrdenTipoInstruccion) {
		this.isPermisoOrdenTipoInstruccion = isPermisoOrdenTipoInstruccion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoInstruccion() {
		return isVisibilidadCeldaNuevoTipoInstruccion;
	}

	public void setIsVisibilidadCeldaNuevoTipoInstruccion(Boolean isVisibilidadCeldaNuevoTipoInstruccion) {
		this.isVisibilidadCeldaNuevoTipoInstruccion = isVisibilidadCeldaNuevoTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoInstruccion() {
		return isVisibilidadCeldaDuplicarTipoInstruccion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoInstruccion(Boolean isVisibilidadCeldaDuplicarTipoInstruccion) {
		this.isVisibilidadCeldaDuplicarTipoInstruccion = isVisibilidadCeldaDuplicarTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoInstruccion() {
		return isVisibilidadCeldaCopiarTipoInstruccion;
	}

	public void setIsVisibilidadCeldaCopiarTipoInstruccion(Boolean isVisibilidadCeldaCopiarTipoInstruccion) {
		this.isVisibilidadCeldaCopiarTipoInstruccion = isVisibilidadCeldaCopiarTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoInstruccion() {
		return isVisibilidadCeldaVerFormTipoInstruccion;
	}

	public void setIsVisibilidadCeldaVerFormTipoInstruccion(Boolean isVisibilidadCeldaVerFormTipoInstruccion) {
		this.isVisibilidadCeldaVerFormTipoInstruccion = isVisibilidadCeldaVerFormTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoInstruccion() {
		return isVisibilidadCeldaOrdenTipoInstruccion;
	}

	public void setIsVisibilidadCeldaOrdenTipoInstruccion(Boolean isVisibilidadCeldaOrdenTipoInstruccion) {
		this.isVisibilidadCeldaOrdenTipoInstruccion = isVisibilidadCeldaOrdenTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoInstruccion() {
		return isVisibilidadCeldaNuevoRelacionesTipoInstruccion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoInstruccion(Boolean isVisibilidadCeldaNuevoRelacionesTipoInstruccion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion = isVisibilidadCeldaNuevoRelacionesTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoInstruccion() {
		return isVisibilidadCeldaModificarTipoInstruccion;
	}

	public void setIsVisibilidadCeldaModificarTipoInstruccion(Boolean isVisibilidadCeldaModificarTipoInstruccion) {
		this.isVisibilidadCeldaModificarTipoInstruccion = isVisibilidadCeldaModificarTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoInstruccion() {
		return isVisibilidadCeldaActualizarTipoInstruccion;
	}

	public void setIsVisibilidadCeldaActualizarTipoInstruccion(Boolean isVisibilidadCeldaActualizarTipoInstruccion) {
		this.isVisibilidadCeldaActualizarTipoInstruccion = isVisibilidadCeldaActualizarTipoInstruccion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoInstruccion() {
		return isVisibilidadCeldaEliminarTipoInstruccion;
	}

	public void setIsVisibilidadCeldaEliminarTipoInstruccion(Boolean isVisibilidadCeldaEliminarTipoInstruccion) {
		this.isVisibilidadCeldaEliminarTipoInstruccion = isVisibilidadCeldaEliminarTipoInstruccion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoInstruccion() {
		return isVisibilidadCeldaCancelarTipoInstruccion;
	}

	public void setIsVisibilidadCeldaCancelarTipoInstruccion(Boolean isVisibilidadCeldaCancelarTipoInstruccion) {
		this.isVisibilidadCeldaCancelarTipoInstruccion = isVisibilidadCeldaCancelarTipoInstruccion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoInstruccion() {
		return isVisibilidadCeldaGuardarTipoInstruccion;
	}

	public void setIsVisibilidadCeldaGuardarTipoInstruccion(Boolean isVisibilidadCeldaGuardarTipoInstruccion) {
		this.isVisibilidadCeldaGuardarTipoInstruccion = isVisibilidadCeldaGuardarTipoInstruccion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoInstruccion() {
		return isVisibilidadCeldaGuardarCambiosTipoInstruccion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoInstruccion(Boolean isVisibilidadCeldaGuardarCambiosTipoInstruccion) {
		this.isVisibilidadCeldaGuardarCambiosTipoInstruccion = isVisibilidadCeldaGuardarCambiosTipoInstruccion;
	}
		
	public TipoInstruccionSessionBean gettipoinstruccionSessionBean() {
		return this.tipoinstruccionSessionBean;
	}
	
	public void settipoinstruccionSessionBean(TipoInstruccionSessionBean tipoinstruccionSessionBean) {
		this.tipoinstruccionSessionBean=tipoinstruccionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(TipoInstruccion tipoinstruccion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoInstruccion tipoinstruccion,TipoInstruccion tipoinstruccionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoInstruccion(tipoinstruccion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoinstruccionAux.setId(tipoinstruccion.getId());
		tipoinstruccionAux.setVersionRow(tipoinstruccion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoInstruccion();
		
			int intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoinstruccionValidator.getInvalidValues(this.tipoinstruccion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoinstruccionLogic.setDatosCliente(datosCliente);
			tipoinstruccionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoinstruccionAux=new  TipoInstruccion();
				
				tipoinstruccionAux.setIsNew(true);
				tipoinstruccionAux.setIsChanged(true);
				
				tipoinstruccionAux.setTipoInstruccionOriginal(this.tipoinstruccion);
				
				tipoinstruccionAux.setId(this.tipoinstruccion.getId());	
				tipoinstruccionAux.setVersionRow(this.tipoinstruccion.getVersionRow());	
				tipoinstruccionAux.setcodigo(this.tipoinstruccion.getcodigo());	
				tipoinstruccionAux.setnombre(this.tipoinstruccion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinstruccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoinstruccionAux,tipoinstruccionLogic.getTipoInstruccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstruccionAux,tipoinstruccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinstruccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstruccionLogic.saveTipoInstruccions();//WithConnection
						//tipoinstruccionLogic.getSetVersionRowTipoInstruccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinstruccion,tipoinstruccionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoinstruccionAux=new  TipoInstruccion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoinstruccionSessionBean.getEsGuardarRelacionado() && this.tipoinstruccion.getId()>=0)) {
						
					tipoinstruccionAux.setIsNew(false);
				}
				
				tipoinstruccionAux.setIsDeleted(false);
			
				tipoinstruccionAux.setId(this.tipoinstruccion.getId());	
				tipoinstruccionAux.setVersionRow(this.tipoinstruccion.getVersionRow());	
				tipoinstruccionAux.setcodigo(this.tipoinstruccion.getcodigo());	
				tipoinstruccionAux.setnombre(this.tipoinstruccion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinstruccionAux,tipoinstruccionLogic.getTipoInstruccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstruccionAux,tipoinstruccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinstruccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstruccionLogic.saveTipoInstruccions();//WithConnection
						//tipoinstruccionLogic.getSetVersionRowTipoInstruccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoinstruccion,tipoinstruccionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoinstruccionAux=new  TipoInstruccion();
				
				tipoinstruccionAux.setIsNew(false);
				tipoinstruccionAux.setIsChanged(false);
				
				tipoinstruccionAux.setIsDeleted(true);
				
				tipoinstruccionAux.setId(this.tipoinstruccion.getId());	
				tipoinstruccionAux.setVersionRow(this.tipoinstruccion.getVersionRow());	
				tipoinstruccionAux.setcodigo(this.tipoinstruccion.getcodigo());	
				tipoinstruccionAux.setnombre(this.tipoinstruccion.getnombre());	
				
				if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoinstruccionAux.getId()>=0) {	
						this.tipoinstruccionsEliminados.add(tipoinstruccionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoinstruccionAux,tipoinstruccionLogic.getTipoInstruccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstruccionAux,tipoinstruccions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoinstruccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstruccionLogic.saveTipoInstruccions();//WithConnection
						//tipoinstruccionLogic.getSetVersionRowTipoInstruccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoinstruccionAux.setEmpleados(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoinstruccionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoinstruccionAux,tipoinstruccionLogic.getTipoInstruccions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoinstruccionAux,tipoinstruccions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.getTipoInstruccions().addAll(this.tipoinstruccionsEliminados);
					
					tipoinstruccionLogic.saveTipoInstruccions();//WithConnection
					//tipoinstruccionLogic.getSetVersionRowTipoInstruccions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoinstruccionsEliminados= new ArrayList<TipoInstruccion>();		
			}
			
			if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Instruccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoinstruccion=tipoinstruccionAux;
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
      		//this.finishProcessTipoInstruccion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoInstruccion tipoinstruccionLocal) throws Exception {
		
		if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoinstruccionLocal.setEmpleados(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
			
			} else {
			
				tipoinstruccionLocal.setEmpleados(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoInstruccion tipoinstruccionLocal) throws Exception {	
		if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoInstruccionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoinstruccionValidator.getInvalidValues(this.tipoinstruccion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoInstruccion tipoinstruccion,List<TipoInstruccion> tipoinstruccions) throws Exception {
		try	{		
			TipoInstruccionConstantesFunciones.actualizarLista(tipoinstruccion,tipoinstruccions,this.tipoinstruccionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoInstruccion tipoinstruccion,List<TipoInstruccion> tipoinstruccions) throws Exception {
		try	{			
			TipoInstruccionConstantesFunciones.actualizarSelectedLista(tipoinstruccion,tipoinstruccions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoInstruccion> tipoinstruccionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoinstruccionsLocal=this.tipoinstruccionLogic.getTipoInstruccions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoinstruccionsLocal=this.tipoinstruccions;
			}
			//ARCHITECTURE
		
			for(TipoInstruccion tipoinstruccionLocal:tipoinstruccionsLocal) {
				if(this.permiteMantenimiento(tipoinstruccionLocal) && tipoinstruccionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoInstruccionConstantesFunciones.getTipoInstruccionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoInstruccionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstruccion.jLabelcodigoTipoInstruccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoInstruccionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstruccion.jLabelnombreTipoInstruccion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInstruccion.jLabelcodigoTipoInstruccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoInstruccion.jLabelnombreTipoInstruccion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Empleado")) {
			if(this.tipoinstruccion==null) {
				this.tipoinstruccion= new TipoInstruccion();
			}

			if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoInstruccion
				this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);

				this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.getempleado().setTipoInstruccion(this.tipoinstruccion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoInstruccion--;	
		
		
		this.tipoinstruccionAux=new TipoInstruccion();
		
		this.tipoinstruccionAux.setId(this.iIdNuevoTipoInstruccion);
		this.tipoinstruccionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoinstruccionLogic.getTipoInstruccions().add(this.tipoinstruccionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoinstruccions.add(this.tipoinstruccionAux);
		}
		//ARCHITECTURE
		
		this.tipoinstruccion=this.tipoinstruccionAux;
		
		if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoInstruccion(this.tipoinstruccion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInstruccion(this.tipoinstruccion);
		}
				
		//this.setDefaultControlesTipoInstruccion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoInstruccion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoInstruccion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInstruccion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInstruccion(this.tipoinstruccionBean,this.tipoinstruccion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoInstruccionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
			classes=TipoInstruccionConstantesFunciones.getClassesRelationshipsOfTipoInstruccion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoinstruccionReturnGeneral=tipoinstruccionLogic.procesarEventosTipoInstruccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinstruccionLogic.getTipoInstruccions(),this.tipoinstruccion,this.tipoinstruccionParameterGeneral,this.isEsNuevoTipoInstruccion,classes);//this.tipoinstruccionLogic.getTipoInstruccion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoInstruccion(this.tipoinstruccionReturnGeneral,this.tipoinstruccionBean,false);
		
		if(this.tipoinstruccionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoInstruccion(this.tipoinstruccionReturnGeneral.getTipoInstruccion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoInstruccion(this.tipoinstruccionReturnGeneral.getTipoInstruccion());
		}
		
		if(this.tipoinstruccionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoInstruccion(this.tipoinstruccionReturnGeneral.getTipoInstruccion(),classes);//this.tipoinstruccionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoInstruccion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoInstruccion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoInstruccion(false);
						
			if(tipoinstruccionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInstruccion();
			}
			
			this.actualizarVisualTableDatosTipoInstruccion();
			
			this.jTableDatosTipoInstruccion.setRowSelectionInterval(this.getIndiceNuevoTipoInstruccion(), this.getIndiceNuevoTipoInstruccion());
			
			this.seleccionarFilaTablaTipoInstruccionActual();
						
			this.actualizarEstadoCeldasBotonesTipoInstruccion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoInstruccion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.setEnabled(isHabilitar && this.tipoinstruccionConstantesFunciones.activarcodigoTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.setEnabled(isHabilitar && this.tipoinstruccionConstantesFunciones.activarnombreTipoInstruccion);	
		
	};
	
	public void setDefaultControlesTipoInstruccion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoInstruccion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoinstruccionSessionBean.setConGuardarRelaciones(true);			
			this.tipoinstruccionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoinstruccionSessionBean.setConGuardarRelaciones(false);			
			this.tipoinstruccionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoInstruccion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
				if(tipoinstruccionAux.getId().equals(this.iIdNuevoTipoInstruccion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccions) {
				if(tipoinstruccionAux.getId().equals(this.iIdNuevoTipoInstruccion)) {
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
	
	public int getIndiceActualTipoInstruccion(TipoInstruccion tipoinstruccion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
				if(tipoinstruccionAux.getId().equals(tipoinstruccion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccions) {
				if(tipoinstruccionAux.getId().equals(tipoinstruccion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoInstruccion(TipoInstruccion tipoinstruccionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
				if(tipoinstruccionAux.getTipoInstruccionOriginal().getId().equals(tipoinstruccionOriginal.getId())) {
					existe=true;
					tipoinstruccionOriginal.setId(tipoinstruccionAux.getId());
					tipoinstruccionOriginal.setVersionRow(tipoinstruccionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccions) {
				if(tipoinstruccionAux.getTipoInstruccionOriginal().getId().equals(tipoinstruccionOriginal.getId())) {
					existe=true;
					tipoinstruccionOriginal.setId(tipoinstruccionAux.getId());
					tipoinstruccionOriginal.setVersionRow(tipoinstruccionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoInstruccion(Boolean esParaCancelar) throws Exception {
		tipoinstruccionsAux=new ArrayList<TipoInstruccion>();
		tipoinstruccionAux=new TipoInstruccion();
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
					if(tipoinstruccionAux.getId()<0) {
						tipoinstruccionsAux.add(tipoinstruccionAux);
					}		
				}
				this.iIdNuevoTipoInstruccion=0L;
				this.tipoinstruccionLogic.getTipoInstruccions().removeAll(tipoinstruccionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccions) {
					if(tipoinstruccionAux.getId()<0) {
						tipoinstruccionsAux.add(tipoinstruccionAux);
					}		
				}
				this.iIdNuevoTipoInstruccion=0L;
				this.tipoinstruccions.removeAll(tipoinstruccionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoInstruccion 
					&& this.tipoinstruccionLogic.getTipoInstruccions().size()>0
					) {
					tipoinstruccionAux=this.tipoinstruccionLogic.getTipoInstruccions().get(this.tipoinstruccionLogic.getTipoInstruccions().size() - 1);
				
					if(tipoinstruccionAux.getId()<0) {
						this.tipoinstruccionLogic.getTipoInstruccions().remove(tipoinstruccionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoInstruccion && this.tipoinstruccions.size()>0) {
					tipoinstruccionAux=this.tipoinstruccions.get(this.tipoinstruccions.size() - 1);
				
					if(tipoinstruccionAux.getId()<0) {
						this.tipoinstruccions.remove(tipoinstruccionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoInstruccion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoinstruccion.getId()<0) {
				this.tipoinstruccionLogic.getTipoInstruccions().remove(this.tipoinstruccion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoinstruccion.getId()<0) {
				this.tipoinstruccions.remove(this.tipoinstruccion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoInstruccion(List<TipoInstruccion> tipoinstruccionsAux) throws Exception {
		TipoInstruccionConstantesFunciones.setEstadosInicialesTipoInstruccion(tipoinstruccionsAux);
	}
	
	public void setEstadosInicialesTipoInstruccion(TipoInstruccion tipoinstruccionAux) throws Exception {
		TipoInstruccionConstantesFunciones.setEstadosInicialesTipoInstruccion(tipoinstruccionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoInstruccionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoInstruccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoInstruccionActual()) {
				if(!this.isEsNuevoTipoInstruccion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoInstruccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoInstruccion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoInstruccionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Instruccion ?", "MANTENIMIENTO DE Tipo Instruccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoInstruccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoInstruccion tipoinstruccion) throws Exception {
		TipoInstruccionConstantesFunciones.seleccionarAsignar(this.tipoinstruccion,tipoinstruccion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoInstruccion=this.isPermisoActualizarOriginalTipoInstruccion;
			
			
			this.seleccionarAsignar(tipoinstruccion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoInstruccionConstantesFunciones.quitarEspaciosTipoInstruccion(this.tipoinstruccion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoInstruccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoinstruccionSessionBean.setsFuncionBusquedaRapida(this.tipoinstruccionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoInstruccion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoInstruccion(esParaCancelar);				
				this.cancelarNuevoTipoInstruccion(esParaCancelar);								
			}
			
			this.tipoinstruccion=new TipoInstruccion();
			
			this.inicializarTipoInstruccion();
			
			this.actualizarEstadoCeldasBotonesTipoInstruccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoInstruccion() throws Exception {
		try {
			TipoInstruccionConstantesFunciones.inicializarTipoInstruccion(this.tipoinstruccion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoinstruccionLogic.getTipoInstruccions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoInstruccions(String sAccionBusqueda,List<TipoInstruccion> tipoinstruccionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoInstruccion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoInstruccionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoInstruccionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoInstruccion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Instrucciones");		
		parameters.put("busquedapor", TipoInstruccionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Empleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoInstruccionLogic tipoinstruccionLogicAuxiliar=new TipoInstruccionLogic();
					tipoinstruccionLogicAuxiliar.setDatosCliente(tipoinstruccionLogic.getDatosCliente());				
					tipoinstruccionLogicAuxiliar.setTipoInstruccions(tipoinstruccionsParaReportes);
					
					tipoinstruccionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoInstruccionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoinstruccionsParaReportes=tipoinstruccionLogicAuxiliar.getTipoInstruccions();
					
					//tipoinstruccionLogic.getNewConnexionToDeep();
					
					//for (TipoInstruccion tipoinstruccion:tipoinstruccionsParaReportes) {
					//	tipoinstruccionLogic.deepLoad(tipoinstruccion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoinstruccionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoinstruccionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoInstruccion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoInstruccionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoInstruccionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoInstruccion=new JRBeanArrayDataSource(TipoInstruccionJInternalFrame.TraerTipoInstruccionBeans(tipoinstruccionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoInstruccion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoInstruccionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoInstruccionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoInstruccionBean.TraerTipoInstruccionBeans(tipoinstruccionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoInstruccions(sAccionBusqueda,sTipoArchivoReporte,tipoinstruccionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoInstruccions(sAccionBusqueda,sTipoArchivoReporte,tipoinstruccionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoInstruccionActionPerformed(null);
					//this.generarExcelReporteTipoInstruccions(sAccionBusqueda,sTipoArchivoReporte,tipoinstruccionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoInstruccions(sAccionBusqueda,sTipoArchivoReporte,tipoinstruccionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoInstruccions(sAccionBusqueda,sTipoArchivoReporte,tipoinstruccionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoInstruccions(sAccionBusqueda,sTipoArchivoReporte,tipoinstruccionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoInstruccions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInstruccion> tipoinstruccionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstruccion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInstruccions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInstruccion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoInstruccion tipoinstruccion : tipoinstruccionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoInstruccionConstantesFunciones.generarExcelReporteDataTipoInstruccion("NORMAL",row,workbook,tipoinstruccion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoInstruccion(String sTipo,Row row,Workbook workbook) {
		
		TipoInstruccionConstantesFunciones.generarExcelReporteHeaderTipoInstruccion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoInstruccions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInstruccion> tipoinstruccionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstruccion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInstruccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoInstruccion tipoinstruccion : tipoinstruccionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoInstruccionConstantesFunciones.getTipoInstruccionDescripcion(tipoinstruccion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInstruccionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinstruccion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoInstruccionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoinstruccion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoInstruccions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoInstruccion> tipoinstruccionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoInstruccion> tipoinstruccionsRespaldo=null;
		
		classes=TipoInstruccionConstantesFunciones.getClassesRelationshipsOfTipoInstruccion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoinstruccionLogic.setDatosCliente(this.datosCliente);
		this.tipoinstruccionLogic.setDatosDeep(this.datosDeep);
		this.tipoinstruccionLogic.setIsConDeep(true);
		
		tipoinstruccionsRespaldo=this.tipoinstruccionLogic.getTipoInstruccions();
		
		this.tipoinstruccionLogic.setTipoInstruccions(tipoinstruccionsParaReportes);	
		this.tipoinstruccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoinstruccionsParaReportes=this.tipoinstruccionLogic.getTipoInstruccions();
		this.tipoinstruccionLogic.setTipoInstruccions(tipoinstruccionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstruccion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoInstruccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoInstruccion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoInstruccion tipoinstruccion : tipoinstruccionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoInstruccion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoInstruccionConstantesFunciones.generarExcelReporteDataTipoInstruccion("NORMAL",row,workbook,tipoinstruccion,cellStyleDataAux);
		
			
			


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoinstruccion.getEmpleados()!=null && tipoinstruccion.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(tipoinstruccion.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : tipoinstruccion.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoInstruccionConstantesFunciones.getTipoInstruccionDescripcion(tipoinstruccion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInstruccion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoInstruccion() throws Exception {		
		this.startProcessTipoInstruccion(true);
	}
	
	public void startProcessTipoInstruccion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoInstruccion, this.jScrollPanelDatosTipoInstruccion,this.jPanelPaginacionTipoInstruccion, this.jScrollPanelDatosEdicionTipoInstruccion, this.jPanelAccionesTipoInstruccion,this.jPanelAccionesFormularioTipoInstruccion,this.jmenuBarTipoInstruccion,this.jmenuBarDetalleTipoInstruccion,this.jTtoolBarTipoInstruccion,this.jTtoolBarDetalleTipoInstruccion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInstruccion=null; 
		
		final JPanel jPanelParametrosReportesTipoInstruccion=this.jPanelParametrosReportesTipoInstruccion;
		//final JScrollPane jScrollPanelDatosTipoInstruccion=this.jScrollPanelDatosTipoInstruccion;
		final JTable jTableDatosTipoInstruccion=this.jTableDatosTipoInstruccion;		
		final JPanel jPanelPaginacionTipoInstruccion=this.jPanelPaginacionTipoInstruccion;
		//final JScrollPane jScrollPanelDatosEdicionTipoInstruccion=this.jScrollPanelDatosEdicionTipoInstruccion;
		final JPanel jPanelAccionesTipoInstruccion=this.jPanelAccionesTipoInstruccion;
		
		JPanel jPanelCamposAuxiliarTipoInstruccion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoInstruccion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			jPanelCamposAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jPanelCamposTipoInstruccion;
			jPanelAccionesFormularioAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jPanelAccionesFormularioTipoInstruccion;
		}
		
		final JPanel jPanelCamposTipoInstruccion=jPanelCamposAuxiliarTipoInstruccion;
		final JPanel jPanelAccionesFormularioTipoInstruccion=jPanelAccionesFormularioAuxiliarTipoInstruccion;
		
		
		final JMenuBar jmenuBarTipoInstruccion=this.jmenuBarTipoInstruccion;
		final JToolBar jTtoolBarTipoInstruccion=this.jTtoolBarTipoInstruccion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoInstruccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInstruccion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			jmenuBarDetalleAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jmenuBarDetalleTipoInstruccion;
			jTtoolBarDetalleAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jTtoolBarDetalleTipoInstruccion;
		}
		
		final JMenuBar jmenuBarDetalleTipoInstruccion=jmenuBarDetalleAuxiliarTipoInstruccion;
		final JToolBar jTtoolBarDetalleTipoInstruccion=jTtoolBarDetalleAuxiliarTipoInstruccion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInstruccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInstruccion;
			processRunnable.jTableDatos=jTableDatosTipoInstruccion;
			processRunnable.jPanelCampos=jPanelCamposTipoInstruccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInstruccion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInstruccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInstruccion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInstruccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInstruccion;
			processRunnable.jTtoolBar=jTtoolBarTipoInstruccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInstruccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoInstruccion ,jPanelParametrosReportesTipoInstruccion,jTableDatosTipoInstruccion, /*jScrollPanelDatosTipoInstruccion,*/jPanelCamposTipoInstruccion,jPanelPaginacionTipoInstruccion, /*jScrollPanelDatosEdicionTipoInstruccion,*/ jPanelAccionesTipoInstruccion,jPanelAccionesFormularioTipoInstruccion,jmenuBarTipoInstruccion,jmenuBarDetalleTipoInstruccion,jTtoolBarTipoInstruccion,jTtoolBarDetalleTipoInstruccion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoInstruccion, jScrollPanelDatosTipoInstruccion,jPanelPaginacionTipoInstruccion, jScrollPanelDatosEdicionTipoInstruccion, jPanelAccionesTipoInstruccion,jPanelAccionesFormularioTipoInstruccion,jmenuBarTipoInstruccion,jmenuBarDetalleTipoInstruccion,jTtoolBarTipoInstruccion,jTtoolBarDetalleTipoInstruccion);
						
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
	
	public void finishProcessTipoInstruccion() {// throws Exception 
		this.finishProcessTipoInstruccion(true);
	}
	
	public void finishProcessTipoInstruccion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoInstruccion, this.jScrollPanelDatosTipoInstruccion,this.jPanelPaginacionTipoInstruccion, this.jScrollPanelDatosEdicionTipoInstruccion, this.jPanelAccionesTipoInstruccion,this.jPanelAccionesFormularioTipoInstruccion,this.jmenuBarTipoInstruccion,this.jmenuBarDetalleTipoInstruccion,this.jTtoolBarTipoInstruccion,this.jTtoolBarDetalleTipoInstruccion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoInstruccion=null; 
		
		final JPanel jPanelParametrosReportesTipoInstruccion=this.jPanelParametrosReportesTipoInstruccion;
		//final JScrollPane jScrollPanelDatosTipoInstruccion=this.jScrollPanelDatosTipoInstruccion;
		final JTable jTableDatosTipoInstruccion=this.jTableDatosTipoInstruccion;		
		final JPanel jPanelPaginacionTipoInstruccion=this.jPanelPaginacionTipoInstruccion;
		//final JScrollPane jScrollPanelDatosEdicionTipoInstruccion=this.jScrollPanelDatosEdicionTipoInstruccion;
		final JPanel jPanelAccionesTipoInstruccion=this.jPanelAccionesTipoInstruccion;
		
		JPanel jPanelCamposAuxiliarTipoInstruccion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoInstruccion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			jPanelCamposAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jPanelCamposTipoInstruccion;
			jPanelAccionesFormularioAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jPanelAccionesFormularioTipoInstruccion;
		}
		
		final JPanel jPanelCamposTipoInstruccion=jPanelCamposAuxiliarTipoInstruccion;
		final JPanel jPanelAccionesFormularioTipoInstruccion=jPanelAccionesFormularioAuxiliarTipoInstruccion;
		
		
		final JMenuBar jmenuBarTipoInstruccion=this.jmenuBarTipoInstruccion;		
		final JToolBar jTtoolBarTipoInstruccion=this.jTtoolBarTipoInstruccion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoInstruccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoInstruccion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			jmenuBarDetalleAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jmenuBarDetalleTipoInstruccion;
			jTtoolBarDetalleAuxiliarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jTtoolBarDetalleTipoInstruccion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoInstruccion=jmenuBarDetalleAuxiliarTipoInstruccion;
		final JToolBar jTtoolBarDetalleTipoInstruccion=jTtoolBarDetalleAuxiliarTipoInstruccion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoInstruccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoInstruccion;
			processRunnable.jTableDatos=jTableDatosTipoInstruccion;
			processRunnable.jPanelCampos=jPanelCamposTipoInstruccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoInstruccion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoInstruccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoInstruccion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoInstruccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoInstruccion;
			processRunnable.jTtoolBar=jTtoolBarTipoInstruccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoInstruccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoInstruccion ,jPanelParametrosReportesTipoInstruccion, jTableDatosTipoInstruccion,/*jScrollPanelDatosTipoInstruccion,*/jPanelCamposTipoInstruccion,jPanelPaginacionTipoInstruccion, /*jScrollPanelDatosEdicionTipoInstruccion,*/ jPanelAccionesTipoInstruccion,jPanelAccionesFormularioTipoInstruccion,jmenuBarTipoInstruccion,jmenuBarDetalleTipoInstruccion,jTtoolBarTipoInstruccion,jTtoolBarDetalleTipoInstruccion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoInstruccion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoInstruccion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoInstruccion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoInstruccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoInstruccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoInstruccion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoInstruccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoInstruccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoInstruccion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoinstruccionConstantesFunciones.getsFinalQueryTipoInstruccion();
		String  finalQueryPaginacionTodos=this.tipoinstruccionConstantesFunciones.getsFinalQueryTipoInstruccion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoInstruccionConstantesFunciones.getArrayColumnasGlobalesNoTipoInstruccion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoInstruccionConstantesFunciones.getArrayColumnasGlobalesTipoInstruccion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoInstruccionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoinstruccionsEliminados= new ArrayList<TipoInstruccion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoInstruccion();
		
				///*TipoInstruccionSessionBean*/this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
			
			if(this.tipoinstruccionSessionBean==null) {
				this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
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
					this.iNumeroPaginacion=TipoInstruccionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoInstruccionConstantesFunciones.getClassesForeignKeysOfTipoInstruccion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoinstruccion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoinstruccionsAux= new ArrayList<TipoInstruccion>();
			
				
			tipoinstruccionLogic.setDatosCliente(this.datosCliente);
			tipoinstruccionLogic.setDatosDeep(this.datosDeep);
			tipoinstruccionLogic.setIsConDeep(true);
			
			
			tipoinstruccionLogic.getTipoInstruccionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoinstruccionLogic.getTodosTipoInstruccions(finalQueryGlobal,pagination);
					
					//tipoinstruccionLogic.getTodosTipoInstruccionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoinstruccionLogic.getTipoInstruccions()==null|| tipoinstruccionLogic.getTipoInstruccions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinstruccionsAux= new ArrayList<TipoInstruccion>();
							tipoinstruccionsAux.addAll(tipoinstruccionLogic.getTipoInstruccions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstruccionsAux= new ArrayList<TipoInstruccion>();
							tipoinstruccionsAux.addAll(tipoinstruccions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinstruccionLogic.getTodosTipoInstruccions(finalQueryGlobal+"",this.pagination);												
							
							//tipoinstruccionLogic.getTodosTipoInstruccionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoInstruccions("Todos",tipoinstruccionLogic.getTipoInstruccions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoinstruccionLogic.setTipoInstruccions(new ArrayList<TipoInstruccion>());					
							tipoinstruccionLogic.getTipoInstruccions().addAll(tipoinstruccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstruccions=new ArrayList<TipoInstruccion>();
							tipoinstruccions.addAll(tipoinstruccionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoInstruccion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoInstruccion=this.idActual;
				
				} else if(this.idTipoInstruccionActual!=null && this.idTipoInstruccionActual!=0L) {
					idTipoInstruccion=idTipoInstruccionActual;
				}
				
					
				this.sDetalleReporte=TipoInstruccionConstantesFunciones.getDetalleIndicePorId(idTipoInstruccion);
				
				this.tipoinstruccions=new ArrayList<TipoInstruccion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoinstruccionLogic.getEntity(idTipoInstruccion);
					
					//tipoinstruccionLogic.getEntityWithConnection(idTipoInstruccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinstruccionLogic.setTipoInstruccions(new ArrayList<TipoInstruccion>());
					tipoinstruccionLogic.getTipoInstruccions().add(tipoinstruccionLogic.getTipoInstruccion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinstruccions=new ArrayList<TipoInstruccion>();
					this.tipoinstruccions.add(tipoinstruccion);
				}
				
				if(tipoinstruccionLogic.getTipoInstruccion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoInstruccion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoInstruccion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinstruccionLogic.getTipoInstruccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinstruccions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoinstruccionLogic.getTipoInstruccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoinstruccions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoInstruccion tipoinstruccion) {
		Boolean permite=true;
		
		if(this.tipoinstruccion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoInstruccionConstantesFunciones.getOrderByListaTipoInstruccion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoInstruccionConstantesFunciones.getOrderByListaTipoInstruccion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstruccion tipoinstruccion:tipoinstruccionLogic.getTipoInstruccions()) {
				if(tipoinstruccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstruccionTotales=tipoinstruccion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstruccion tipoinstruccion:this.tipoinstruccions) {
				if(tipoinstruccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstruccionTotales=tipoinstruccion;
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
			this.tipoinstruccionAux=new TipoInstruccion();
			this.tipoinstruccionAux.setsType(Constantes2.S_TOTALES);
			this.tipoinstruccionAux.setIsNew(false);
			this.tipoinstruccionAux.setIsChanged(false);
			this.tipoinstruccionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoInstruccionConstantesFunciones.TotalizarValoresFilaTipoInstruccion(this.tipoinstruccionLogic.getTipoInstruccions(),this.tipoinstruccionAux);
				
				this.tipoinstruccionLogic.getTipoInstruccions().add(this.tipoinstruccionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoInstruccionConstantesFunciones.TotalizarValoresFilaTipoInstruccion(this.tipoinstruccions,this.tipoinstruccionAux);
				
				this.tipoinstruccions.add(this.tipoinstruccionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoinstruccionTotales=new TipoInstruccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinstruccionLogic.getTipoInstruccions().remove(tipoinstruccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoinstruccions.remove(tipoinstruccionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoinstruccionTotales=new TipoInstruccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoInstruccion tipoinstruccion:tipoinstruccionLogic.getTipoInstruccions()) {
				if(tipoinstruccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstruccionTotales=tipoinstruccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInstruccionConstantesFunciones.TotalizarValoresFilaTipoInstruccion(this.tipoinstruccionLogic.getTipoInstruccions(),tipoinstruccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoInstruccion tipoinstruccion:this.tipoinstruccions) {
				if(tipoinstruccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipoinstruccionTotales=tipoinstruccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoInstruccionConstantesFunciones.TotalizarValoresFilaTipoInstruccion(this.tipoinstruccions,tipoinstruccionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoInstruccion() {
		this.isPermisoTodoTipoInstruccion=false;
		this.isPermisoNuevoTipoInstruccion=false;
		this.isPermisoActualizarTipoInstruccion=false;
		this.isPermisoActualizarOriginalTipoInstruccion=false;
		this.isPermisoEliminarTipoInstruccion=false;
		this.isPermisoGuardarCambiosTipoInstruccion=false;
		this.isPermisoConsultaTipoInstruccion=false;
		this.isPermisoBusquedaTipoInstruccion=false;
		this.isPermisoReporteTipoInstruccion=false;		
		this.isPermisoOrdenTipoInstruccion=false;		
		this.isPermisoPaginacionMedioTipoInstruccion=false;		
		this.isPermisoPaginacionAltoTipoInstruccion=false;
		this.isPermisoPaginacionTodoTipoInstruccion=false;
		this.isPermisoCopiarTipoInstruccion=false;		
		this.isPermisoVerFormTipoInstruccion=false;		
		this.isPermisoDuplicarTipoInstruccion=false;		
		this.isPermisoOrdenTipoInstruccion=false;		
	}
	
	public void setPermisosUsuarioTipoInstruccion(Boolean isPermiso) {
		this.isPermisoTodoTipoInstruccion=isPermiso;
		this.isPermisoNuevoTipoInstruccion=isPermiso;
		this.isPermisoActualizarTipoInstruccion=isPermiso;
		this.isPermisoActualizarOriginalTipoInstruccion=isPermiso;
		this.isPermisoEliminarTipoInstruccion=isPermiso;
		this.isPermisoGuardarCambiosTipoInstruccion=isPermiso;
		this.isPermisoConsultaTipoInstruccion=isPermiso;
		this.isPermisoBusquedaTipoInstruccion=isPermiso;
		this.isPermisoReporteTipoInstruccion=isPermiso;
		this.isPermisoOrdenTipoInstruccion=isPermiso;		
		this.isPermisoPaginacionMedioTipoInstruccion=isPermiso;		
		this.isPermisoPaginacionAltoTipoInstruccion=isPermiso;		
		this.isPermisoPaginacionTodoTipoInstruccion=isPermiso;		
		this.isPermisoCopiarTipoInstruccion=isPermiso;		
		this.isPermisoVerFormTipoInstruccion=isPermiso;		
		this.isPermisoDuplicarTipoInstruccion=isPermiso;
		this.isPermisoOrdenTipoInstruccion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoInstruccion(Boolean isPermiso) {
		//this.isPermisoTodoTipoInstruccion=isPermiso;
		this.isPermisoNuevoTipoInstruccion=isPermiso;
		this.isPermisoActualizarTipoInstruccion=isPermiso;
		this.isPermisoActualizarOriginalTipoInstruccion=isPermiso;
		this.isPermisoEliminarTipoInstruccion=isPermiso;
		this.isPermisoGuardarCambiosTipoInstruccion=isPermiso;
		//this.isPermisoConsultaTipoInstruccion=isPermiso;
		//this.isPermisoBusquedaTipoInstruccion=isPermiso;
		//this.isPermisoReporteTipoInstruccion=isPermiso;
		//this.isPermisoOrdenTipoInstruccion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoInstruccion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoInstruccion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoInstruccion=isPermiso;		
		//this.isPermisoCopiarTipoInstruccion=isPermiso;		
		//this.isPermisoDuplicarTipoInstruccion=isPermiso;
		//this.isPermisoOrdenTipoInstruccion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoInstruccionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoInstruccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionTipoInstruccionClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoInstruccion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoInstruccionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoInstruccionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoInstruccionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoInstruccionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormTipoInstruccion!=null && this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.remove(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoInstruccion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoInstruccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoInstruccionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoInstruccion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoInstruccion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoInstruccion=this.isPermisoActualizarTipoInstruccion;
			this.isPermisoEliminarTipoInstruccion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoInstruccion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoInstruccion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoInstruccion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoInstruccion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoInstruccion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInstruccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoInstruccion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoInstruccion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoInstruccion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoInstruccion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoInstruccion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoInstruccion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoInstruccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoInstruccion.setToolTipText(this.jTableDatosTipoInstruccion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoInstruccion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoInstruccion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoInstruccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoInstruccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoInstruccion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleado && this.tipoinstruccionConstantesFunciones.mostrarEmpleadoTipoInstruccion && !TipoInstruccionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
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
	
		
	public void inicializarCombosForeignKeyTipoInstruccionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoInstruccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoInstruccionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoInstruccionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoInstruccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoInstruccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoInstruccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoInstruccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoInstruccion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInstruccion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoInstruccion(TipoInstruccion tipoinstruccion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoInstruccion(TipoInstruccion tipoinstruccion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoInstruccion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoInstruccion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoInstruccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoInstruccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoInstruccion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoInstruccion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoInstruccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoInstruccion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoInstruccionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoInstruccionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoInstruccionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean(); 
		this.tipoinstruccionConstantesFunciones=new TipoInstruccionConstantesFunciones(); 
		this.tipoinstruccionBean=new TipoInstruccion();//(this.tipoinstruccionConstantesFunciones); 		
		this.tipoinstruccionReturnGeneral=new TipoInstruccionParameterReturnGeneral(); 
		
		this.tipoinstruccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinstruccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoInstruccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoInstruccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoInstruccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoInstruccion(true);
			
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
			
			this.tipoinstruccionConstantesFunciones=new TipoInstruccionConstantesFunciones(); 
			this.tipoinstruccionBean=new TipoInstruccion();//this.tipoinstruccionConstantesFunciones); 			
			this.tipoinstruccionReturnGeneral=new TipoInstruccionParameterReturnGeneral(); 
		
			TipoInstruccionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Instruccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoinstruccion=new TipoInstruccion();
			this.tipoinstruccions = new ArrayList<TipoInstruccion>();
			this.tipoinstruccionsAux = new ArrayList<TipoInstruccion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic=new TipoInstruccionLogic();
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoinstruccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoinstruccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoInstruccion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInstruccion);	
					}
					
					if(this.jInternalFrameImportacionTipoInstruccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInstruccion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoInstruccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoInstruccion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInstruccion);
				this.jInternalFrameDetalleFormTipoInstruccion.setVisible(false);
				this.jInternalFrameDetalleFormTipoInstruccion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInstruccion);
					this.jInternalFrameReporteDinamicoTipoInstruccion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoInstruccion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoInstruccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoInstruccion);
					this.jInternalFrameImportacionTipoInstruccion.setVisible(false);
					this.jInternalFrameImportacionTipoInstruccion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoInstruccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoInstruccion);
					this.jInternalFrameOrderByTipoInstruccion.setVisible(false);
					this.jInternalFrameOrderByTipoInstruccion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoInstruccionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoInstruccionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoinstruccionReturnGeneral=new TipoInstruccionParameterReturnGeneral();
			
			this.tipoinstruccionParameterGeneral=new TipoInstruccionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoinstruccionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoInstruccionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInstruccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinstruccionSessionBean.getEsGuardarRelacionado(),this.tipoinstruccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoInstruccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoinstruccionSessionBean.getEsGuardarRelacionado(),this.tipoinstruccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoInstruccion=false;
			this.isVisibilidadCeldaDuplicarTipoInstruccion=true;
			this.isVisibilidadCeldaCopiarTipoInstruccion=true;
			this.isVisibilidadCeldaVerFormTipoInstruccion=true;
			this.isVisibilidadCeldaOrdenTipoInstruccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
			this.isVisibilidadCeldaModificarTipoInstruccion=false;
			this.isVisibilidadCeldaActualizarTipoInstruccion=false;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
			this.isVisibilidadCeldaCancelarTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoInstruccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoInstruccion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoInstruccion(false);
			
			this.setPermisosUsuarioTipoInstruccion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoinstruccionSessionBean.getEsGuardarRelacionado() && this.tipoinstruccionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoInstruccionClasesRelacionadas();
			}
			
			if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoInstruccionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoInstruccion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoInstruccion();
			}
			
			if(!this.isPermisoBusquedaTipoInstruccion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoInstruccion,this.isPermisoPaginacionMedioTipoInstruccion,this.isPermisoPaginacionTodoTipoInstruccion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoInstruccionConstantesFunciones.getTiposSeleccionarTipoInstruccion());
				
				this.tiposColumnasSelect=TipoInstruccionConstantesFunciones.getTiposSeleccionarTipoInstruccion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoInstruccion();				
				//this.tiposRelacionesSelect=TipoInstruccionConstantesFunciones.getTiposRelacionesTipoInstruccion(true);
				
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
			//if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoInstruccion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoInstruccion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoInstruccion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstruccion() ;
			
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
			
			
			this.empleadoLogic=new EmpleadoLogic(); 
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
				tipoinstruccionImplementable= (TipoInstruccionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInstruccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoinstruccionImplementableHome= (TipoInstruccionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoInstruccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoinstruccions= new ArrayList<TipoInstruccion>();
			this.tipoinstruccionsEliminados= new ArrayList<TipoInstruccion>();
						
			this.isEsNuevoTipoInstruccion=false;
			this.esParaAccionDesdeFormularioTipoInstruccion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoInstruccion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoInstruccion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoInstruccionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoInstruccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoInstruccion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoInstruccion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoInstruccion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoInstruccion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoInstruccion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoInstruccion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoInstruccion")) {
				iIndex=this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();	
				
				

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoInstruccion();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoInstruccion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoInstruccion.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesTipoInstruccion.updateUI();
		//this.jTabbedPaneRelacionesTipoInstruccion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoInstruccion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosTipoInstruccion.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.tipoinstruccionConstantesFunciones.mostrarEmpleadoTipoInstruccion && !TipoInstruccionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(tipoinstruccionConstantesFunciones.resaltarEmpleadoTipoInstruccion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoinstruccionConstantesFunciones.resaltarEmpleadoTipoInstruccion);
						}

						jmenuItem.setEnabled(this.tipoinstruccionConstantesFunciones.activarEmpleadoTipoInstruccion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormTipoInstruccion.jmenuDetalleTipoInstruccion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoInstruccion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoInstruccion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoInstruccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoInstruccionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoInstruccion();
		
		this.cargarCombosFrameForeignKeyTipoInstruccion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoInstruccion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoInstruccion();
		}
	}
	
	
	
	public void jButtonNuevoTipoInstruccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
			
			if(jTableDatosTipoInstruccion.getRowCount()>=1) {
				jTableDatosTipoInstruccion.removeRowSelectionInterval(0, jTableDatosTipoInstruccion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoInstruccion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoInstruccion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoInstruccion(true);			
			//this.tipoinstruccion=new TipoInstruccion();
			//this.tipoinstruccion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInstruccion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstruccion() ;
			
			if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInstruccion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoinstruccion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);				
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
			if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoInstruccion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoInstruccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoInstruccion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoInstruccion.getSelectedRows().length;			
			}
			
			tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoInstruccion--;			
				//TipoInstruccion tipoinstruccionAux= new TipoInstruccion();			
				//tipoinstruccionAux.setId(this.iIdNuevoTipoInstruccion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoInstruccion tipoinstruccionOrigen=new TipoInstruccion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoInstruccion tipoinstruccionOrigen : tipoinstruccionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoinstruccionOrigen =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoinstruccionOrigen =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoInstruccion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoinstruccion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoInstruccion(tipoinstruccionOrigen,this.tipoinstruccion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinstruccionLogic.getTipoInstruccions().add(this.tipoinstruccionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinstruccions.add(this.tipoinstruccionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoInstruccion(false);
				
				this.jTableDatosTipoInstruccion.setRowSelectionInterval(this.getIndiceNuevoTipoInstruccion(), this.getIndiceNuevoTipoInstruccion());
				
				int iLastRow =  this.jTableDatosTipoInstruccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInstruccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInstruccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInstruccion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();									
		
			TipoInstruccion tipoinstruccionOrigen=new TipoInstruccion();
			TipoInstruccion tipoinstruccionDestino=new TipoInstruccion();
				
			tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoInstruccion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoinstruccionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoInstruccion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstruccionOrigen =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinstruccionOrigen =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoinstruccionDestino =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoinstruccionDestino =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoinstruccionOrigen =tipoinstruccionsSeleccionados.get(0);
				tipoinstruccionDestino =tipoinstruccionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoInstruccion(tipoinstruccionOrigen,tipoinstruccionDestino,true,false);
				
				tipoinstruccionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoinstruccionDestino,tipoinstruccionLogic.getTipoInstruccions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoinstruccionDestino,tipoinstruccions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoInstruccion(false);
				
				//this.jTableDatosTipoInstruccion.setRowSelectionInterval(this.getIndiceNuevoTipoInstruccion(), this.getIndiceNuevoTipoInstruccion());
				
				int iLastRow =  this.jTableDatosTipoInstruccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoInstruccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoInstruccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInstruccion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoInstruccion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoInstruccion.isVisible();
			
			
			this.jPanelParametrosReportesTipoInstruccion.setVisible(!isVisible);
			this.jPanelPaginacionTipoInstruccion.setVisible(!isVisible);
			this.jPanelAccionesTipoInstruccion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoInstruccion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoInstruccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoInstruccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoInstruccion();
			
			this.abrirFrameOrderByTipoInstruccion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoInstruccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoInstruccion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInstruccion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoInstruccion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoInstruccion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoInstruccion.setSize(this.jInternalFrameDetalleFormTipoInstruccion.iWidthFormulario,this.jInternalFrameDetalleFormTipoInstruccion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoInstruccion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoInstruccion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoInstruccion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoInstruccion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoInstruccion.jContentPaneDetalleTipoInstruccion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoInstruccion.jContentPaneDetalleTipoInstruccion.getWidth(),TipoInstruccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoInstruccion.jContentPaneDetalleTipoInstruccion.getWidth(),TipoInstruccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoInstruccion.jContentPaneDetalleTipoInstruccion.getWidth(),TipoInstruccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoInstruccion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoInstruccion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoInstruccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoInstruccion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoInstruccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstruccion,false,this);
				} else {
					this.jInternalFrameOrderByTipoInstruccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoInstruccion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoInstruccion);
				this.jInternalFrameOrderByTipoInstruccion.setVisible(false);
				this.jInternalFrameOrderByTipoInstruccion.setSelected(false);
				
				this.jInternalFrameOrderByTipoInstruccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInstruccion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoInstruccion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoInstruccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoInstruccion==null) {
				
				this.jInternalFrameImportacionTipoInstruccion=new ImportacionJInternalFrame(TipoInstruccionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoInstruccion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoInstruccion);
				this.jInternalFrameImportacionTipoInstruccion.setVisible(false);
				this.jInternalFrameImportacionTipoInstruccion.setSelected(false);


				this.jInternalFrameImportacionTipoInstruccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInstruccion"));
				this.jInternalFrameImportacionTipoInstruccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInstruccion"));
				this.jInternalFrameImportacionTipoInstruccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInstruccion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoInstruccion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoInstruccion==null) {
				this.jInternalFrameReporteDinamicoTipoInstruccion=new ReporteDinamicoJInternalFrame(TipoInstruccionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoInstruccion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoInstruccion);
				this.jInternalFrameReporteDinamicoTipoInstruccion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoInstruccion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInstruccion"));
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInstruccion"));
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInstruccion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInstruccion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoInstruccion.jContentPaneDetalleTipoInstruccion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoInstruccion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoInstruccion);
			
	       	this.jInternalFrameDetalleFormTipoInstruccion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoInstruccion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoInstruccion.dispose();
			//this.jInternalFrameDetalleFormTipoInstruccion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoInstruccion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoInstruccion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoInstruccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoInstruccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoInstruccion.setVisible(true);
	        this.jInternalFrameImportacionTipoInstruccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoInstruccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoInstruccion.setVisible(true);
	        this.jInternalFrameOrderByTipoInstruccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoInstruccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoInstruccion.setVisible(false);
	        this.jInternalFrameOrderByTipoInstruccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoInstruccion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoInstruccion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoInstruccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoInstruccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoInstruccion.setVisible(false);
	        this.jInternalFrameImportacionTipoInstruccion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoInstruccion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoInstruccion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoInstruccion(true);
			//this.isEsNuevoTipoInstruccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoInstruccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInstruccion(false) ;
			
			if(tipoinstruccionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInstruccion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstruccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoInstruccionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoInstruccion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoInstruccion(true);
			//this.isEsNuevoTipoInstruccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoinstruccion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoInstruccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoInstruccion(false) ;
			
			if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoInstruccion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstruccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoInstruccion(false);
			
			//if(!this.isEsNuevoTipoInstruccion) {								
				int intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
				
			}
			
			if(this.permiteMantenimiento(this.tipoinstruccion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoInstruccion=true;
					this.inicializarActualizarBindingTablaTipoInstruccion(false);
					this.isEsNuevoTipoInstruccion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoInstruccion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoInstruccion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInstruccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInstruccion(false);
				
				this.habilitarDeshabilitarControlesTipoInstruccion(false);
			
												
				
				if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoInstruccion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoInstruccionActionPerformed(evt,tipoinstruccionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoInstruccion(this.tipoinstruccion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoInstruccion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoinstruccionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoinstruccion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				this.tipoinstruccion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				this.tipoinstruccion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoinstruccion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoInstruccionModel) this.jTableDatosTipoInstruccion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoInstruccion=true;
				this.inicializarActualizarBindingTablaTipoInstruccion(false);
				this.isEsNuevoTipoInstruccion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoInstruccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInstruccion(false);
				
				this.habilitarDeshabilitarControlesTipoInstruccion(false);
				
				
				
				if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoInstruccion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoInstruccion.getRowCount()>=1) {
				jTableDatosTipoInstruccion.removeRowSelectionInterval(0, jTableDatosTipoInstruccion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoInstruccion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoInstruccion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoInstruccion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoInstruccion(false) ;
			
			this.isEsNuevoTipoInstruccion=false;
			
			if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoInstruccion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoInstruccion(false);
				
				//SI ES MANUAL
				if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoInstruccion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoInstruccion--;			
			//TipoInstruccion tipoinstruccionAux= new TipoInstruccion();			
			//tipoinstruccionAux.setId(this.iIdNuevoTipoInstruccion);
			
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoInstruccion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
			
			this.tipoinstruccion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoinstruccionLogic.getTipoInstruccions().add(this.tipoinstruccionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoinstruccions.add(this.tipoinstruccionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoInstruccion(false);
			
			this.jTableDatosTipoInstruccion.setRowSelectionInterval(this.getIndiceNuevoTipoInstruccion(), this.getIndiceNuevoTipoInstruccion());
			
			int iLastRow =  this.jTableDatosTipoInstruccion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoInstruccion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoInstruccion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoInstruccion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoInstruccion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstruccion(false);
			
			//SI ES MANUAL
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInstruccion();
			}
			
			//this.abrirFrameTreeTipoInstruccion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo InstruccionES ?", "MANTENIMIENTO DE Tipo Instruccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoInstruccion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoInstruccion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoinstruccionReturnGeneral=tipoinstruccionLogic.procesarImportacionTipoInstruccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoinstruccionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoInstruccionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoInstruccion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoInstruccion.setFileImportacion(this.jInternalFrameImportacionTipoInstruccion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoInstruccion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoInstruccion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoInstruccion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoInstruccion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		

		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoInstruccionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoInstruccionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoInstruccions("Todos",tipoinstruccionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInstruccionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoInstruccionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoInstruccion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoInstruccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoInstruccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoInstruccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoInstruccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoInstruccionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoInstruccionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstruccion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoInstruccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoInstruccionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoInstruccion tipoinstruccion:tipoinstruccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinstruccion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoInstruccionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoInstruccion tipoinstruccion:tipoinstruccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoinstruccion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoInstruccion(row);				
			//	iRow++;
			//}				
			
			//for(TipoInstruccion tipoinstruccionAux:tipoinstruccionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoInstruccion(tipoinstruccionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstruccion(false);
			
			//SI ES MANUAL
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoInstruccion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstruccion(false);
			
			//SI ES MANUAL
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInstruccion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoInstruccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoInstruccion(false);
			
			//SI ES MANUAL
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoInstruccion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoinstruccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoInstruccion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoInstruccion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoInstruccion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoInstruccion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoInstruccion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoInstruccion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoInstruccion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoInstruccion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoInstruccion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoInstruccion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoInstruccion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoInstruccion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoInstruccion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoInstruccion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstruccion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoInstruccion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoInstruccion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoInstruccion();
		
		this.inicializarActualizarBindingBotonesManualTipoInstruccion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInstruccion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstruccion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInstruccion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInstruccion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoInstruccion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoInstruccion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoInstruccion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoInstruccion.jCheckBoxPostAccionNuevoTipoInstruccion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoInstruccion.jCheckBoxPostAccionSinCerrarTipoInstruccion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoInstruccion.jCheckBoxPostAccionSinMensajeTipoInstruccion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoInstruccion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoInstruccion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoInstruccion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
				this.jInternalFrameDetalleFormTipoInstruccion.jCheckBoxPostAccionNuevoTipoInstruccion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoInstruccion.jCheckBoxPostAccionSinCerrarTipoInstruccion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoInstruccion.jCheckBoxPostAccionSinMensajeTipoInstruccion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoInstruccion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoInstruccion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoInstruccion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoInstruccion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoInstruccion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoInstruccion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoInstruccion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoInstruccion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoInstruccion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoInstruccion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoInstruccion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoInstruccion() throws Exception {
		try	{
			if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInstruccion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInstruccion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoInstruccion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoInstruccion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoInstruccion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoInstruccion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoInstruccion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoInstruccion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoInstruccion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoInstruccion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoInstruccion.addItem(reporte);
			}
			
			
			if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoInstruccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoInstruccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoInstruccion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoInstruccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoInstruccion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoInstruccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoInstruccion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoInstruccion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoInstruccion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInstruccion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoInstruccion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoInstruccion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInstruccion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoInstruccion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoInstruccion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoInstruccion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoInstruccion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoInstruccion(Boolean esInicializar) throws Exception {				
		if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoInstruccion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoInstruccion() throws Exception {
		this.inicializarActualizarBindingTablaTipoInstruccion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoInstruccion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoInstruccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoInstruccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoInstruccionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstruccionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoInstruccionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoInstruccionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoInstruccion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoinstruccionLogic.getTipoInstruccions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoinstruccions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoInstruccion.setModel(new TipoInstruccionModel(this.tipoinstruccionLogic.getTipoInstruccions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoInstruccion.setModel(new TipoInstruccionModel(this.tipoinstruccions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoInstruccion!=null && this.jInternalFrameOrderByTipoInstruccion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoInstruccion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoInstruccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstruccion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoInstruccionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO,tipoinstruccionConstantesFunciones.resaltarSeleccionarTipoInstruccion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoInstruccionConstantesFunciones.SCLASSWEBTITULO,tipoinstruccionConstantesFunciones.resaltarSeleccionarTipoInstruccion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoInstruccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstruccion,TipoInstruccionConstantesFunciones.LABEL_ID));

		if(this.tipoinstruccionConstantesFunciones.mostraridTipoInstruccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInstruccionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoinstruccionConstantesFunciones.resaltaridTipoInstruccion,this.tipoinstruccionConstantesFunciones.activaridTipoInstruccion,this,true,"idTipoInstruccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinstruccionConstantesFunciones.resaltaridTipoInstruccion,this.tipoinstruccionConstantesFunciones.activaridTipoInstruccion,this,true,"idTipoInstruccion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInstruccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstruccion,TipoInstruccionConstantesFunciones.LABEL_CODIGO));

		if(this.tipoinstruccionConstantesFunciones.mostrarcodigoTipoInstruccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInstruccionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinstruccionConstantesFunciones.resaltarcodigoTipoInstruccion,this.tipoinstruccionConstantesFunciones.activarcodigoTipoInstruccion,this,true,"codigoTipoInstruccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinstruccionConstantesFunciones.resaltarcodigoTipoInstruccion,this.tipoinstruccionConstantesFunciones.activarcodigoTipoInstruccion,this,true,"codigoTipoInstruccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInstruccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoInstruccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoInstruccion,TipoInstruccionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoinstruccionConstantesFunciones.mostrarnombreTipoInstruccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoInstruccionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoinstruccionConstantesFunciones.resaltarnombreTipoInstruccion,this.tipoinstruccionConstantesFunciones.activarnombreTipoInstruccion,this,true,"nombreTipoInstruccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoinstruccionConstantesFunciones.resaltarnombreTipoInstruccion,this.tipoinstruccionConstantesFunciones.activarnombreTipoInstruccion,this,true,"nombreTipoInstruccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoInstruccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleado && this.tipoinstruccionConstantesFunciones.mostrarEmpleadoTipoInstruccion && !TipoInstruccionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(tipoinstruccionConstantesFunciones.resaltarEmpleadoTipoInstruccion,this,this.tipoinstruccionConstantesFunciones.activarEmpleadoTipoInstruccion));
				tableColumn.setCellEditor(new EmpleadoTableCell(tipoinstruccionConstantesFunciones.resaltarEmpleadoTipoInstruccion,this,this.tipoinstruccionConstantesFunciones.activarEmpleadoTipoInstruccion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoInstruccion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinstruccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinstruccionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInstruccion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoinstruccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoinstruccionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoInstruccion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoinstruccionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoinstruccionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoInstruccion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoInstruccion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoInstruccion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoInstruccion.moveColumn(this.jTableDatosTipoInstruccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoInstruccion.moveColumn(this.jTableDatosTipoInstruccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoInstruccion.moveColumn(this.jTableDatosTipoInstruccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoInstruccion.moveColumn(this.jTableDatosTipoInstruccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoInstruccion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoInstruccion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoInstruccion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoInstruccion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoInstruccion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoInstruccion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoInstruccion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoInstruccion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoinstruccionLogic.getTipoInstruccions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoinstruccions.size()-1;
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
		//this.jTableDatosTipoInstruccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoInstruccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoInstruccion();
			
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
				
				//this.isEsNuevoTipoInstruccion=false;
					
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
				if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoInstruccion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInstruccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInstruccion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoinstruccion.getsType().equals("DUPLICADO")
				   || this.tipoinstruccion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoInstruccion=true;
				
				} else {
					this.isEsNuevoTipoInstruccion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoinstruccion.getId()>=0 && !this.tipoinstruccion.getIsNew()) {						
						this.isEsNuevoTipoInstruccion=false;
						
					} else {
						this.isEsNuevoTipoInstruccion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoInstruccion(esRelaciones);						
				
				this.seleccionarTipoInstruccion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoinstruccion.getId()<0) {
					this.isEsNuevoTipoInstruccion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoInstruccion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoInstruccion(evt,rowIndex);
				}	
				
				if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoInstruccion: " + this.dDif); 
					}
				}								
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoInstruccion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoinstruccion)) {
					if(this.tipoinstruccion.getId()>0) {
						this.tipoinstruccion.setIsDeleted(true);
						
						this.tipoinstruccionsEliminados.add(this.tipoinstruccion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoinstruccionLogic.getTipoInstruccions().remove(this.tipoinstruccion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoinstruccions.remove(this.tipoinstruccion);				
					}
					
					
					((TipoInstruccionModel) this.jTableDatosTipoInstruccion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoInstruccion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoInstruccion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoInstruccion) {
			
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoInstruccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoInstruccion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoInstruccion(this.tipoinstruccion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoInstruccion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoInstruccion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoInstruccion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInstruccion(TipoInstruccion tipoinstruccion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoInstruccion(tipoinstruccion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoInstruccion(TipoInstruccion tipoinstruccion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoInstruccion(tipoinstruccion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoInstruccion(tipoinstruccion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoInstruccion(tipoinstruccion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoInstruccion(TipoInstruccion tipoinstruccion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.setText(tipoinstruccion.getId().toString());
			this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.setText(tipoinstruccion.getcodigo());
			this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.setText(tipoinstruccion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoInstruccion tipoinstruccionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoinstruccionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoInstruccion tipoinstruccionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoinstruccionLocal=this.tipoinstruccion;
			} else {
				tipoinstruccionLocal=this.tipoinstruccionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoinstruccionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoInstruccion(tipoinstruccionLocal,true);
					
					if(tipoinstruccionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoinstruccionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoinstruccionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoInstruccion(TipoInstruccion tipoinstruccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInstruccion(tipoinstruccion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(tipoinstruccion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInstruccion(TipoInstruccion tipoinstruccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoInstruccion(tipoinstruccion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoInstruccion(TipoInstruccion tipoinstruccion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.getText()==null || this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.getText()=="" || this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.setText("0");
			}

			if(conColumnasBase) {tipoinstruccion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInstruccionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstruccion.jLabelIdTipoInstruccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinstruccion.setcodigo(this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInstruccionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstruccion.jLabelcodigoTipoInstruccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoinstruccion.setnombre(this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoInstruccionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoInstruccion.jLabelnombreTipoInstruccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoInstruccion(TipoInstruccion tipoinstruccionBean,TipoInstruccion tipoinstruccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoInstruccion(TipoInstruccion tipoinstruccionOrigen,TipoInstruccion tipoinstruccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinstruccionOrigen.getId()!=null && !tipoinstruccionOrigen.getId().equals(0L))) {tipoinstruccion.setId(tipoinstruccionOrigen.getId());}}
			if(conDefault || (!conDefault && tipoinstruccionOrigen.getcodigo()!=null && !tipoinstruccionOrigen.getcodigo().equals(""))) {tipoinstruccion.setcodigo(tipoinstruccionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoinstruccionOrigen.getnombre()!=null && !tipoinstruccionOrigen.getnombre().equals(""))) {tipoinstruccion.setnombre(tipoinstruccionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInstruccion(TipoInstruccion tipoinstruccion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.setText(tipoinstruccion.getId().toString());
			this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.setText(tipoinstruccion.getcodigo());
			this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.setText(tipoinstruccion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoInstruccion(TipoInstruccionBean tipoinstruccionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.setText(tipoinstruccionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.setText(tipoinstruccionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.setText(tipoinstruccionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoInstruccion(TipoInstruccionParameterReturnGeneral tipoinstruccionReturnGeneral,TipoInstruccionBean tipoinstruccionBean,Boolean conDefault) throws Exception { 
		try {
			TipoInstruccion tipoinstruccionLocal=new TipoInstruccion();
			
			tipoinstruccionLocal=tipoinstruccionReturnGeneral.getTipoInstruccion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoinstruccionLocal.getId()!=null && !tipoinstruccionLocal.getId().equals(0L))) {tipoinstruccionBean.setId(tipoinstruccionLocal.getId());}}
			if(conDefault || (!conDefault && tipoinstruccionLocal.getcodigo()!=null && !tipoinstruccionLocal.getcodigo().equals(""))) {tipoinstruccionBean.setcodigo(tipoinstruccionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoinstruccionLocal.getnombre()!=null && !tipoinstruccionLocal.getnombre().equals(""))) {tipoinstruccionBean.setnombre(tipoinstruccionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoInstruccionGenerico(Long idTipoInstruccionSeleccionado,JComboBox jComboBoxTipoInstruccion,List<TipoInstruccion> tipoinstruccionsLocal)throws Exception {
		try {
			TipoInstruccion  tipoinstruccionTemp=null;

			for(TipoInstruccion tipoinstruccionAux:tipoinstruccionsLocal) {
				if(tipoinstruccionAux.getId()!=null && tipoinstruccionAux.getId().equals(idTipoInstruccionSeleccionado)) {
					tipoinstruccionTemp=tipoinstruccionAux;
					break;
				}
			}

			jComboBoxTipoInstruccion.setSelectedItem(tipoinstruccionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoInstruccionGenerico(JComboBox jComboBoxTipoInstruccion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoInstruccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInstruccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoInstruccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoInstruccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInstruccion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoInstruccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoInstruccion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoInstruccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoInstruccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoInstruccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinstruccion=(TipoInstruccion) tipoinstruccionLogic.getTipoInstruccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinstruccion =(TipoInstruccion) tipoinstruccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoInstruccion tipoinstruccionRow=new TipoInstruccion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinstruccionRow=(TipoInstruccion) tipoinstruccionLogic.getTipoInstruccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoinstruccionRow=(TipoInstruccion) tipoinstruccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoInstruccion tipoinstruccion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoInstruccion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstruccion = (TipoInstruccion)this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoinstruccion = (TipoInstruccion)this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoinstruccion!=null) {
						this.tipoinstruccion = tipoinstruccion;
					} else {
						this.tipoinstruccion = new TipoInstruccion();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.tipoinstruccion)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame;
					}

					List<TipoInstruccion> tipoinstruccions=new ArrayList<TipoInstruccion>();
					tipoinstruccions.add(this.tipoinstruccion);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoInstruccion.cargarEmpleadoBeanSwingJInternalFrame(tipoinstruccions,this.tipoinstruccion,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoInstruccion=(TitledBorder)this.jScrollPanelDatosTipoInstruccion.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderTipoInstruccion.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoInstruccion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoTipoInstruccion && this.isPermisoNuevoTipoInstruccion));			
			this.jButtonDuplicarTipoInstruccion.setVisible((this.isVisibilidadCeldaDuplicarTipoInstruccion && this.isPermisoDuplicarTipoInstruccion));			
			this.jButtonCopiarTipoInstruccion.setVisible((this.isVisibilidadCeldaCopiarTipoInstruccion && this.isPermisoCopiarTipoInstruccion));
			this.jButtonVerFormTipoInstruccion.setVisible((this.isVisibilidadCeldaVerFormTipoInstruccion && this.isPermisoVerFormTipoInstruccion));
			
			this.jButtonAbrirOrderByTipoInstruccion.setVisible((this.isVisibilidadCeldaOrdenTipoInstruccion && this.isPermisoOrdenTipoInstruccion));			
			
			this.jButtonNuevoRelacionesTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion && this.isPermisoNuevoTipoInstruccion));			
			this.jButtonNuevoGuardarCambiosTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoTipoInstruccion && this.isPermisoNuevoTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));
			
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarTipoInstruccion.setVisible((this.isVisibilidadCeldaModificarTipoInstruccion && this.isPermisoActualizarTipoInstruccion));	
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarTipoInstruccion.setVisible((this.isVisibilidadCeldaActualizarTipoInstruccion && this.isPermisoActualizarTipoInstruccion));	
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarTipoInstruccion.setVisible((this.isVisibilidadCeldaEliminarTipoInstruccion && this.isPermisoEliminarTipoInstruccion));
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarTipoInstruccion.setVisible(this.isVisibilidadCeldaCancelarTipoInstruccion);							
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.setVisible((this.isVisibilidadCeldaGuardarTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoInstruccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoTipoInstruccion && this.isPermisoNuevoTipoInstruccion));						
			this.jButtonDuplicarToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaDuplicarTipoInstruccion && this.isPermisoDuplicarTipoInstruccion));						
			this.jButtonCopiarToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaCopiarTipoInstruccion && this.isPermisoCopiarTipoInstruccion));			
			this.jButtonVerFormToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaVerFormTipoInstruccion && this.isPermisoVerFormTipoInstruccion));			
			this.jButtonAbrirOrderByToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaOrdenTipoInstruccion && this.isPermisoOrdenTipoInstruccion));
			this.jButtonNuevoRelacionesToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion && this.isPermisoNuevoTipoInstruccion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoTipoInstruccion && this.isPermisoNuevoTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));			
			
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaModificarTipoInstruccion && this.isPermisoActualizarTipoInstruccion));	
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaActualizarTipoInstruccion  && this.isPermisoActualizarTipoInstruccion));	
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaEliminarTipoInstruccion && this.isPermisoEliminarTipoInstruccion));
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarToolBarTipoInstruccion.setVisible(this.isVisibilidadCeldaCancelarTipoInstruccion);				
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaGuardarTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoInstruccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoTipoInstruccion && this.isPermisoNuevoTipoInstruccion));			
			this.jMenuItemDuplicarTipoInstruccion.setVisible((this.isVisibilidadCeldaDuplicarTipoInstruccion && this.isPermisoDuplicarTipoInstruccion));			
			this.jMenuItemCopiarTipoInstruccion.setVisible((this.isVisibilidadCeldaCopiarTipoInstruccion && this.isPermisoCopiarTipoInstruccion));			
			this.jMenuItemVerFormTipoInstruccion.setVisible((this.isVisibilidadCeldaVerFormTipoInstruccion && this.isPermisoVerFormTipoInstruccion));			
			this.jMenuItemAbrirOrderByTipoInstruccion.setVisible((this.isVisibilidadCeldaOrdenTipoInstruccion && this.isPermisoOrdenTipoInstruccion));			
			//this.jMenuItemMostrarOcultarTipoInstruccion.setVisible((this.isVisibilidadCeldaOrdenTipoInstruccion && this.isPermisoOrdenTipoInstruccion));
			this.jMenuItemDetalleAbrirOrderByTipoInstruccion.setVisible((this.isVisibilidadCeldaOrdenTipoInstruccion && this.isPermisoOrdenTipoInstruccion));			
			//this.jMenuItemDetalleMostrarOcultarTipoInstruccion.setVisible((this.isVisibilidadCeldaOrdenTipoInstruccion && this.isPermisoOrdenTipoInstruccion));			
			this.jMenuItemNuevoRelacionesTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion && this.isPermisoNuevoTipoInstruccion));			
			this.jMenuItemNuevoGuardarCambiosTipoInstruccion.setVisible((this.isVisibilidadCeldaNuevoTipoInstruccion && this.isPermisoNuevoTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));									
			
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemModificarTipoInstruccion.setVisible((this.isVisibilidadCeldaModificarTipoInstruccion && this.isPermisoActualizarTipoInstruccion));	
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemActualizarTipoInstruccion.setVisible((this.isVisibilidadCeldaActualizarTipoInstruccion && this.isPermisoActualizarTipoInstruccion));	
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemEliminarTipoInstruccion.setVisible((this.isVisibilidadCeldaEliminarTipoInstruccion && this.isPermisoEliminarTipoInstruccion));
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemCancelarTipoInstruccion.setVisible(this.isVisibilidadCeldaCancelarTipoInstruccion);				
			}
			
			this.jMenuItemGuardarCambiosTipoInstruccion.setVisible((this.isVisibilidadCeldaGuardarTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));						
			this.jMenuItemGuardarCambiosTablaTipoInstruccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoInstruccion=this.jButtonNuevoTipoInstruccion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoInstruccion=this.jButtonDuplicarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaCopiarTipoInstruccion=this.jButtonCopiarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaVerFormTipoInstruccion=this.jButtonVerFormTipoInstruccion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoInstruccion=this.jButtonAbrirOrderByTipoInstruccion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=this.jButtonNuevoRelacionesTipoInstruccion.isVisible();
			this.isVisibilidadCeldaModificarTipoInstruccion=this.jButtonModificarTipoInstruccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.isVisibilidadCeldaActualizarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaGuardarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=this.jButtonGuardarCambiosTablaTipoInstruccion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoInstruccion=this.jButtonNuevoToolBarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=this.jButtonNuevoRelacionesToolBarTipoInstruccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.isVisibilidadCeldaModificarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarToolBarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaActualizarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarToolBarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarToolBarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarToolBarTipoInstruccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInstruccion=this.jButtonGuardarCambiosToolBarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=this.jButtonGuardarCambiosTablaToolBarTipoInstruccion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoInstruccion=this.jMenuItemNuevoTipoInstruccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=this.jMenuItemNuevoRelacionesTipoInstruccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.isVisibilidadCeldaModificarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemModificarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaActualizarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemActualizarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaEliminarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemEliminarTipoInstruccion.isVisible();
			this.isVisibilidadCeldaCancelarTipoInstruccion=this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemCancelarTipoInstruccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoInstruccion=this.jMenuItemGuardarCambiosTipoInstruccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=this.jMenuItemGuardarCambiosTablaTipoInstruccion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoInstruccion(Boolean esInicializar) {
		if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInstruccion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoInstruccion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoInstruccion() {
		this.jButtonNuevoTipoInstruccion.setVisible(this.isPermisoNuevoTipoInstruccion);			
		this.jButtonDuplicarTipoInstruccion.setVisible(this.isPermisoDuplicarTipoInstruccion);			
		this.jButtonCopiarTipoInstruccion.setVisible(this.isPermisoCopiarTipoInstruccion);			
		this.jButtonVerFormTipoInstruccion.setVisible(this.isPermisoVerFormTipoInstruccion);			
		
		this.jButtonAbrirOrderByTipoInstruccion.setVisible(this.isPermisoOrdenTipoInstruccion);					
		
		this.jButtonNuevoRelacionesTipoInstruccion.setVisible(this.isPermisoNuevoTipoInstruccion);			
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarTipoInstruccion.setVisible(this.isPermisoActualizarTipoInstruccion);	
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarTipoInstruccion.setVisible(this.isPermisoActualizarTipoInstruccion);	
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarTipoInstruccion.setVisible(this.isPermisoEliminarTipoInstruccion);
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarTipoInstruccion.setVisible(this.isVisibilidadCeldaCancelarTipoInstruccion);						
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.setVisible(this.isPermisoGuardarCambiosTipoInstruccion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoInstruccion.setVisible(this.isPermisoActualizarTipoInstruccion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInstruccion() {
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarTipoInstruccion.setVisible(this.isPermisoActualizarTipoInstruccion);	
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarTipoInstruccion.setVisible(this.isPermisoActualizarTipoInstruccion);	
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarTipoInstruccion.setVisible(this.isPermisoEliminarTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarTipoInstruccion.setVisible(this.isVisibilidadCeldaCancelarTipoInstruccion);							
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.setVisible((this.isVisibilidadCeldaGuardarTipoInstruccion && this.isPermisoGuardarCambiosTipoInstruccion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoInstruccion() {
		if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoInstruccion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoInstruccion() {
	}
	
	public void jTableDatosTipoInstruccionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoInstruccion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoInstruccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.gettipoinstruccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinstruccion==null) {
						this.tipoinstruccion = new TipoInstruccion();
					}

					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
				}

				if(this.tipoinstruccion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoinstruccion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInstruccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoInstruccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.gettipoinstruccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinstruccion==null) {
						this.tipoinstruccion = new TipoInstruccion();
					}

					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
				}

				if(this.tipoinstruccion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoinstruccion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInstruccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoInstruccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.gettipoinstruccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoinstruccion==null) {
						this.tipoinstruccion = new TipoInstruccion();
					}

					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);
				}

				if(this.tipoinstruccion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoinstruccion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoInstruccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoInstruccion() {
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
			this.jInternalFrameDetalleFormTipoInstruccion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoInstruccion.dispose();
			this.jInternalFrameDetalleFormTipoInstruccion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
			this.jInternalFrameReporteDinamicoTipoInstruccion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoInstruccion.dispose();
			this.jInternalFrameReporteDinamicoTipoInstruccion=null;
		}
		
		if(this.jInternalFrameImportacionTipoInstruccion!=null) {
			this.jInternalFrameImportacionTipoInstruccion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoInstruccion.dispose();
			this.jInternalFrameImportacionTipoInstruccion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoInstruccion();
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoInstruccion")) {
				jButtonDuplicarTipoInstruccionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoInstruccion")) {
				jButtonCopiarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoInstruccion")) {
				jButtonVerFormTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoInstruccion")) {
				jButtonDuplicarTipoInstruccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoInstruccion")) {
				jButtonDuplicarTipoInstruccionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoInstruccion")) {
				jButtonModificarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoInstruccion")) {
				jButtonModificarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoInstruccion")) {
				jButtonModificarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoInstruccion")) {
				jButtonActualizarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoInstruccion")) {
				jButtonActualizarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoInstruccion")) {
				jButtonActualizarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoInstruccion")) {
				jButtonEliminarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoInstruccion")) {
				jButtonEliminarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoInstruccion")) {
				jButtonEliminarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoInstruccion")) {
				jButtonCancelarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoInstruccion")) {
				jButtonCancelarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoInstruccion")) {
				jButtonCancelarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoInstruccion")) {
				jButtonCerrarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoInstruccion")) {
				jButtonCerrarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoInstruccion")) {
				jButtonCerrarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoInstruccion")) {
				jButtonMostrarOcultarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoInstruccion")) {
				jButtonCancelarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoInstruccion")) {
				jButtonCopiarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoInstruccion")) {
				jButtonVerFormTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoInstruccion")) {
				jButtonCopiarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoInstruccion")) {
				jButtonVerFormTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoInstruccion")) {
				jButtonRecargarInformacionTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoInstruccion")) {
				jButtonRecargarInformacionTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoInstruccion")) {
				jButtonRecargarInformacionTipoInstruccionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoInstruccion")) {
				jButtonAnterioresTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoInstruccion")) {
				jButtonAnterioresTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoInstruccion")) {
				jButtonAnterioresTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoInstruccion")) {
				jButtonSiguientesTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoInstruccion")) {
				jButtonSiguientesTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoInstruccion")) {
				jButtonSiguientesTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoInstruccion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoInstruccion")) {
				jButtonAbrirOrderByTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoInstruccion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoInstruccion")) {
				jButtonMostrarOcultarTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInstruccion")) {
				jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoInstruccion")) {
				jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoInstruccion")) {
				jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoInstruccion")) {
				jButtonCerrarReporteDinamicoTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoInstruccion")) {
				jButtonGenerarReporteDinamicoTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoInstruccion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoInstruccion")) {
				jButtonCerrarImportacionTipoInstruccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoInstruccion")) {
				
				jButtonGenerarImportacionTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoInstruccion")) {
				
				jButtonAbrirImportacionTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoInstruccion")) {
				jComboBoxTiposAccionesTipoInstruccionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoInstruccion")) {
				jComboBoxTiposRelacionesTipoInstruccionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoInstruccion")) {
				jComboBoxTiposAccionesTipoInstruccionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoInstruccion")) {
				
				jComboBoxTiposSeleccionarTipoInstruccionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoInstruccion")) {
				jTextFieldValorCampoGeneralTipoInstruccionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoInstruccion")) {
				jButtonAbrirOrderByTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoInstruccion")) {
				jButtonAbrirOrderByTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoInstruccion")) {
				jButtonCerrarOrderByTipoInstruccionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInstruccionBusqueda")) {
				this.jButtonidTipoInstruccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInstruccionBusqueda")) {
				this.jButtoncodigoTipoInstruccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInstruccionBusqueda")) {
				this.jButtonnombreTipoInstruccionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoInstruccion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstruccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoInstruccion tipoinstruccionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoinstruccionLocal=this.tipoinstruccion;
			} else {
				tipoinstruccionLocal=this.tipoinstruccionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
							
				
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
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
			
			


			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstruccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
								
						
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
								
				
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
							
				
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstruccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
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
			
			


			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
								
				
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstruccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoInstruccion")) {
					jCheckBoxSeleccionarTodosTipoInstruccionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoInstruccion")) {
					jCheckBoxSeleccionadosTipoInstruccionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoInstruccion")) {
					
				}
				
				


				
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
												
				
				


				
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstruccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstruccionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
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
			
			


			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoInstruccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoinstruccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoinstruccion);
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
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
				
				


				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoInstruccion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoInstruccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoInstruccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoinstruccionAnterior =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoInstruccion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoInstruccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoInstruccion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoinstruccion =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoinstruccion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoInstruccion")) {
				
				}
				
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoInstruccion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoInstruccion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoInstruccion")) {
			
			}
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoInstruccion();
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoInstruccion")) {
				jButtonDuplicarTipoInstruccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoInstruccion")) {
				jButtonCopiarTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoInstruccion")) {
				jButtonVerFormTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoInstruccion")) {
				jButtonNuevoTipoInstruccionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoInstruccion")) {
				jButtonModificarTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoInstruccion")) {
				jButtonActualizarTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoInstruccion")) {
				jButtonEliminarTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoInstruccion")) {
				jButtonCancelarTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoInstruccion")) {
				jButtonCerrarTipoInstruccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoInstruccion")) {
				jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoInstruccion")) {
				jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoInstruccion")) {
				jButtonAbrirOrderByTipoInstruccionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoInstruccion")) {
				jButtonRecargarInformacionTipoInstruccionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoInstruccion")) {
				jButtonAnterioresTipoInstruccionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoInstruccion")) {
				jButtonSiguientesTipoInstruccionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoInstruccionBusqueda")) {
				this.jButtonidTipoInstruccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoInstruccionBusqueda")) {
				this.jButtoncodigoTipoInstruccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoInstruccionBusqueda")) {
				this.jButtonnombreTipoInstruccionBusquedaActionPerformed(evt);
			}
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoInstruccion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoInstruccion")) {
				closingInternalFrameTipoInstruccion();
				
			} else if(sTipo.equals("jButtonCancelarTipoInstruccion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoInstruccion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoInstruccionBeanSwingJInternalFrame jInternalFrameParent=(TipoInstruccionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInstruccion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoInstruccionActionPerformed(null);
			}
			
			TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoinstruccion,new Object(),this.tipoinstruccionParameterGeneral,this.tipoinstruccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoInstruccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoInstruccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoInstruccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoinstruccion)) {
			if(!esControlTabla) {
				if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);			
				}
				
				if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoInstruccion(this.tipoinstruccion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinstruccionReturnGeneral=tipoinstruccionLogic.procesarEventosTipoInstruccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstruccionLogic.getTipoInstruccions(),this.tipoinstruccion,this.tipoinstruccionParameterGeneral,this.isEsNuevoTipoInstruccion,classes);//this.tipoinstruccionLogic.getTipoInstruccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoInstruccion(this.tipoinstruccionReturnGeneral,this.tipoinstruccionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoInstruccion(classes,this.tipoinstruccionReturnGeneral,this.tipoinstruccionBean,false);
					}
						
					if(this.tipoinstruccionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoInstruccion(this.tipoinstruccionReturnGeneral.getTipoInstruccion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoInstruccion(this.tipoinstruccionReturnGeneral.getTipoInstruccion());	
					}
						
					if(this.tipoinstruccionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoInstruccion(this.tipoinstruccionReturnGeneral.getTipoInstruccion(),classes);//this.tipoinstruccionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoInstruccion(this.tipoinstruccion,classes);//this.tipoinstruccionBean);									
				}
			
				if(TipoInstruccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoInstruccion(this.tipoinstruccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoInstruccion(this.tipoinstruccion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoinstruccionAnterior!=null) {
						this.tipoinstruccion=this.tipoinstruccionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoinstruccionReturnGeneral=tipoinstruccionLogic.procesarEventosTipoInstruccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstruccionLogic.getTipoInstruccions(),this.tipoinstruccion,this.tipoinstruccionParameterGeneral,this.isEsNuevoTipoInstruccion,classes);//this.tipoinstruccionLogic.getTipoInstruccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoinstruccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoinstruccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoinstruccionReturnGeneral.getTipoInstruccion(),tipoinstruccionLogic.getTipoInstruccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoinstruccionReturnGeneral.getTipoInstruccion(),this.tipoinstruccions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoInstruccion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoInstruccion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoInstruccion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoInstruccion() throws Exception {
		
		TipoInstruccionModel tipoinstruccionModel=(TipoInstruccionModel)this.jTableDatosTipoInstruccion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoinstruccionModel.tipoinstruccions=this.tipoinstruccionLogic.getTipoInstruccions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoinstruccionModel.tipoinstruccions=this.tipoinstruccions;
		}
		
		
		((TipoInstruccionModel) this.jTableDatosTipoInstruccion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoInstruccion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoinstruccionAnterior(),this.tipoinstruccionLogic.getTipoInstruccions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoinstruccionAnterior(),this.tipoinstruccions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoInstruccion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoInstruccion(TipoInstruccion tipoinstruccion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipoinstruccion.getEmpleados());
					this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
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
										
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstruccion,new Object(),generalEntityParameterGeneral,this.tipoinstruccionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoinstruccionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoInstruccionConstantesFunciones.getClassesRelationshipsOfTipoInstruccion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoInstruccionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoInstruccion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoInstruccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoInstruccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoinstruccion,new Object(),generalEntityParameterGeneral,this.tipoinstruccionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoInstruccion(TipoInstruccionBean tipoinstruccionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipoinstruccion.getEmpleados());
					this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoInstruccion(ArrayList<Classe> classes,TipoInstruccionReturnGeneral tipoinstruccionReturnGeneral,TipoInstruccionBean tipoinstruccionBean,Boolean conDefault) throws Exception {
		
			this.tipoinstruccionBean.setEmpleados(tipoinstruccionReturnGeneral.getTipoInstruccion().getEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoInstruccion(TipoInstruccion tipoinstruccion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					tipoinstruccion.setEmpleados(this.jInternalFrameDetalleFormTipoInstruccion.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoinstruccion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoInstruccion = new TipoInstruccionDetalleFormJInternalFrame(jDesktopPane,this.tipoinstruccionSessionBean.getConGuardarRelaciones(),this.tipoinstruccionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.setVisible(false);
		this.jInternalFrameDetalleFormTipoInstruccion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoInstruccion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoInstruccion.tipoinstruccionLogic=this.tipoinstruccionLogic;
		
		this.cargarCombosFrameForeignKeyTipoInstruccion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoInstruccion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoInstruccion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoInstruccion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoInstruccion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoInstruccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInstruccion"));
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarTipoInstruccion.addActionListener(new ButtonActionListener(this,"ModificarTipoInstruccion"));

		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarToolBarTipoInstruccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInstruccion"));
					
		this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemModificarTipoInstruccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInstruccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarTipoInstruccion.addActionListener (new ButtonActionListener(this,"ActualizarTipoInstruccion"));
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarToolBarTipoInstruccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInstruccion"));
						
		this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemActualizarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInstruccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarTipoInstruccion.addActionListener (new ButtonActionListener(this,"EliminarTipoInstruccion"));
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInstruccion"));
								
		this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemEliminarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInstruccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarTipoInstruccion.addActionListener (new ButtonActionListener(this,"CancelarTipoInstruccion"));
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInstruccion"));
					
		this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemCancelarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInstruccion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemDetalleCerrarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInstruccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInstruccion"));
		
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInstruccion"));
		
		
		
		this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInstruccion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonidTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInstruccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtoncodigoTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInstruccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonnombreTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInstruccionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInstruccion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoInstruccion"));
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoInstruccion"));
		}
		
		this.jTableDatosTipoInstruccion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoInstruccion"));
		
		this.jTableDatosTipoInstruccion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoInstruccion"));
		
		this.jButtonNuevoTipoInstruccion.addActionListener(new ButtonActionListener(this,"NuevoTipoInstruccion"));
		
		this.jButtonDuplicarTipoInstruccion.addActionListener(new ButtonActionListener(this,"DuplicarTipoInstruccion"));
		
		this.jButtonCopiarTipoInstruccion.addActionListener(new ButtonActionListener(this,"CopiarTipoInstruccion"));
		
		this.jButtonVerFormTipoInstruccion.addActionListener(new ButtonActionListener(this,"VerFormTipoInstruccion"));
		
		
		this.jButtonNuevoToolBarTipoInstruccion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoInstruccion"));
			
		this.jButtonDuplicarToolBarTipoInstruccion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoInstruccion"));
			
		this.jMenuItemNuevoTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoInstruccion"));
			
		this.jMenuItemDuplicarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoInstruccion"));		
		
		
		this.jButtonNuevoRelacionesTipoInstruccion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoInstruccion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoInstruccion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoInstruccion"));
			
		this.jMenuItemNuevoRelacionesTipoInstruccion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoInstruccion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarTipoInstruccion.addActionListener(new ButtonActionListener(this,"ModificarTipoInstruccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonModificarToolBarTipoInstruccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoInstruccion"));
			
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemModificarTipoInstruccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoInstruccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarTipoInstruccion.addActionListener (new ButtonActionListener(this,"ActualizarTipoInstruccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonActualizarToolBarTipoInstruccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoInstruccion"));
				
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemActualizarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoInstruccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarTipoInstruccion.addActionListener (new ButtonActionListener(this,"EliminarTipoInstruccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonEliminarToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoInstruccion"));
						
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemEliminarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoInstruccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarTipoInstruccion.addActionListener (new ButtonActionListener(this,"CancelarTipoInstruccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonCancelarToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoInstruccion"));
			
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemCancelarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoInstruccion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoInstruccion"));		
		
		
		this.jButtonCerrarTipoInstruccion.addActionListener (new ButtonActionListener(this,"CerrarTipoInstruccion"));
		
		
		this.jButtonCerrarToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoInstruccion"));
			
		this.jMenuItemCerrarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoInstruccion"));
			
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jMenuItemDetalleCerrarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoInstruccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoInstruccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoInstruccion"));
		}
		
		this.jButtonCopiarToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoInstruccion"));
			
		this.jButtonVerFormToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoInstruccion"));
		
		this.jMenuItemGuardarCambiosTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoInstruccion"));
			
		this.jMenuItemCopiarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoInstruccion"));		
		
		this.jMenuItemVerFormTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoInstruccion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoInstruccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInstruccion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoInstruccion"));
			
		this.jMenuItemGuardarCambiosTablaTipoInstruccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoInstruccion"));		
		
		
		
		this.jButtonRecargarInformacionTipoInstruccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoInstruccion"));
					
		this.jButtonRecargarInformacionToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoInstruccion"));
		
		this.jMenuItemRecargarInformacionTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoInstruccion"));		
		
		
		
		this.jButtonAnterioresTipoInstruccion.addActionListener (new ButtonActionListener(this,"AnterioresTipoInstruccion"));
		
		
		this.jButtonAnterioresToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoInstruccion"));
		
		this.jMenuItemAnterioresTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoInstruccion"));		
		
		
		this.jButtonSiguientesTipoInstruccion.addActionListener (new ButtonActionListener(this,"SiguientesTipoInstruccion"));
		
		
		this.jButtonSiguientesToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoInstruccion"));
			
		this.jMenuItemSiguientesTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoInstruccion"));
			
		this.jMenuItemAbrirOrderByTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoInstruccion"));
			
		this.jMenuItemMostrarOcultarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoInstruccion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoInstruccion"));
			
		this.jMenuItemDetalleMostarOcultarTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoInstruccion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoInstruccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoInstruccion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoInstruccion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoInstruccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoInstruccion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoInstruccion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoInstruccion"));

		this.jCheckBoxSeleccionadosTipoInstruccion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoInstruccion"));
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoInstruccion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoInstruccion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoInstruccion"));
			
		this.jComboBoxTiposAccionesTipoInstruccion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoInstruccion"));
					
		this.jComboBoxTiposSeleccionarTipoInstruccion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoInstruccion"));
			
		this.jTextFieldValorCampoGeneralTipoInstruccion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoInstruccion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonidTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInstruccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtoncodigoTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInstruccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonnombreTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInstruccionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoInstruccion!=null) {
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInstruccion"));
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInstruccion"));
				this.jInternalFrameReporteDinamicoTipoInstruccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInstruccion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoInstruccion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoInstruccion"));				
			//this.jButtonGenerarReporteDinamicoTipoInstruccion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoInstruccion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoInstruccion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoInstruccion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoInstruccion!=null) {
				this.jInternalFrameImportacionTipoInstruccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoInstruccion"));
				this.jInternalFrameImportacionTipoInstruccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoInstruccion"));
				this.jInternalFrameImportacionTipoInstruccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoInstruccion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoInstruccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoInstruccion"));
			
			this.jButtonAbrirOrderByToolBarTipoInstruccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoInstruccion"));			
			
			if(this.jInternalFrameOrderByTipoInstruccion!=null) {
				this.jInternalFrameOrderByTipoInstruccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoInstruccion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoInstruccion.jTabbedPaneRelacionesTipoInstruccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoInstruccion"));
		
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
            		closingInternalFrameTipoInstruccion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoInstruccion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoInstruccion = (JInternalFrameBase)event.getSource();
	            	
	            TipoInstruccionBeanSwingJInternalFrame jInternalFrameParent=(TipoInstruccionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoInstruccion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoInstruccionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoInstruccion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoInstruccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoInstruccion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoInstruccion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstruccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstruccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstruccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoInstruccion";
		inputMap = this.jButtonNuevoTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInstruccionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstruccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstruccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoInstruccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoInstruccion";
		inputMap = this.jButtonNuevoRelacionesTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoInstruccionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoInstruccion";
		inputMap = this.jButtonModificarTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoInstruccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoInstruccion";
		inputMap = this.jButtonActualizarTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoInstruccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoInstruccion";
		inputMap = this.jButtonEliminarTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoInstruccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoInstruccion";
		inputMap = this.jButtonCancelarTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoInstruccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoInstruccion";
		inputMap = this.jButtonCerrarTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoInstruccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoInstruccion";
		inputMap = this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonGuardarCambiosTipoInstruccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoInstruccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoInstruccion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoInstruccionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoInstruccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoInstruccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoInstruccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoInstruccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoInstruccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoInstruccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonidTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoInstruccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtoncodigoTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoInstruccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoInstruccion.jButtonnombreTipoInstruccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoInstruccionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoInstruccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoInstruccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoInstruccionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoInstruccion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoInstruccion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
					tipoinstruccionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstruccion tipoinstruccionAux:tipoinstruccions) {
					tipoinstruccionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoInstruccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInstruccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
						tipoinstruccionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInstruccion tipoinstruccionAux:tipoinstruccions) {
						tipoinstruccionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInstruccion tipoinstruccionAux:tipoinstruccions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInstruccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInstruccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInstruccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInstruccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoInstruccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoInstruccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoInstruccion.getSelectedRows();
			
			TipoInstruccion tipoinstruccionLocal=new TipoInstruccion();
			
			//this.seleccionarTodosTipoInstruccion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoinstruccionLocal =(TipoInstruccion) this.tipoinstruccionLogic.getTipoInstruccions().toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoinstruccionLocal =(TipoInstruccion) this.tipoinstruccions.toArray()[this.jTableDatosTipoInstruccion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoinstruccionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
						tipoinstruccionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoInstruccion tipoinstruccionAux:tipoinstruccions) {
						tipoinstruccionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoInstruccion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoInstruccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoInstruccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoInstruccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoInstruccionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoInstruccionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoInstruccionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoInstruccion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoInstruccion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccionLogic.getTipoInstruccions()) {
				
						if(sTipoSeleccionar.equals(TipoInstruccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinstruccionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInstruccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinstruccionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstruccion tipoinstruccionAux:tipoinstruccions) {
					
						if(sTipoSeleccionar.equals(TipoInstruccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoinstruccionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoInstruccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoinstruccionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoInstruccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoInstruccionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoInstruccion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoInstruccion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoInstruccion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoInstruccion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoInstruccion(conSplash);
				
					this.generarReporteTipoInstruccionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoInstruccionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInstruccionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoInstruccionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInstruccion();
				
				this.exportarTipoInstruccionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoInstruccions();
				//this.importarTipoInstruccions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoInstruccion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoInstruccionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Instruccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoInstruccion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoInstruccion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoInstruccion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoInstruccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoInstruccion.jComboBoxTiposAccionesFormularioTipoInstruccion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoInstruccion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoInstruccion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoInstruccionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoInstruccion();
			
			if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
			TipoInstruccion tipoinstruccion=new TipoInstruccion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoInstruccion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoInstruccion.getSelectedItem();
			
			
			
			
			tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoinstruccionsSeleccionados.size()==1) {
				for(TipoInstruccion tipoinstruccionAux:tipoinstruccionsSeleccionados) {
					tipoinstruccion=tipoinstruccionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,tipoinstruccion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoInstruccion();
			
      		//this.finishProcessTipoInstruccion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoInstruccionReturnGeneral() throws Exception {
		if(this.tipoinstruccionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoinstruccionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoinstruccionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoinstruccionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoinstruccionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoinstruccionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoInstruccion(false);
		}
		
		if(this.tipoinstruccionReturnGeneral.getConRetornoLista() || this.tipoinstruccionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoinstruccionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinstruccionLogic.setTipoInstruccions(this.tipoinstruccionReturnGeneral.getTipoInstruccions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoinstruccionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoinstruccionLogic.setTipoInstruccion(this.tipoinstruccionReturnGeneral.getTipoInstruccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoInstruccion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoInstruccion() throws Exception {
		
		
	}
	
	public ArrayList<TipoInstruccion> getTipoInstruccionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoInstruccion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoInstruccion tipoinstruccionAux:tipoinstruccionLogic.getTipoInstruccions()) {
					if(tipoinstruccionAux.getIsSelected()) {
						tipoinstruccionsSeleccionados.add(tipoinstruccionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoInstruccion tipoinstruccionAux:this.tipoinstruccions) {
					if(tipoinstruccionAux.getIsSelected()) {
						tipoinstruccionsSeleccionados.add(tipoinstruccionAux);				
					}
				}
			}
			
			if(tipoinstruccionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoinstruccionsSeleccionados.addAll(this.tipoinstruccionLogic.getTipoInstruccions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoinstruccionsSeleccionados.addAll(this.tipoinstruccions);				
					}
				}
			}
		} else {
			tipoinstruccionsSeleccionados.add(this.tipoinstruccion);
		}
		
		return tipoinstruccionsSeleccionados;
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
	
	public void generarReporteTipoInstruccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoInstruccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoInstruccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInstruccionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoInstruccionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoInstruccionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Instruccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoInstruccionsSeleccionados() throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoInstruccions("Todos",tipoinstruccionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoInstruccionsSeleccionados() throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoInstruccions("Todos",tipoinstruccionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoInstruccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoInstruccions("Todos",tipoinstruccionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoInstruccionsSeleccionados() throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoInstruccion();
		
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoInstruccion();
		
		
		//this.generarReporteTipoInstruccions("Todos",tipoinstruccionsSeleccionados ,tipoinstruccionImplementable,tipoinstruccionImplementableHome);
	}
	
	public void mostrarImportacionTipoInstruccions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoInstruccion();
		
		this.abrirFrameImportacionTipoInstruccion();		
		
			
		//this.generarReporteTipoInstruccions("Todos",tipoinstruccionsSeleccionados ,tipoinstruccionImplementable,tipoinstruccionImplementableHome);
	}
	
	public void importarTipoInstruccions() throws Exception {		
	
	}
	
	public void exportarTipoInstruccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoInstruccionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoInstruccionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoInstruccionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Instruccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoInstruccionsSeleccionados() throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstruccion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoInstruccion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoInstruccion tipoinstruccionAux:tipoinstruccionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoInstruccion(tipoinstruccionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoinstruccionAux.setsDetalleGeneralEntityReporte(tipoinstruccionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoInstruccion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoInstruccionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInstruccionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInstruccionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoInstruccionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoInstruccion(TipoInstruccion tipoinstruccion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoinstruccion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinstruccion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinstruccion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoinstruccion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoInstruccionsSeleccionados() throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstruccion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoInstruccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoInstruccion(row);				
				iRow++;
			}				
			
			for(TipoInstruccion tipoinstruccionAux:tipoinstruccionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoInstruccion(tipoinstruccionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoInstruccionsSeleccionados() throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();		
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoinstruccion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoinstruccions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoinstruccion");
			//elementRoot.appendChild(element);
		
			for(TipoInstruccion tipoinstruccionAux:tipoinstruccionsSeleccionados) {
				element = document.createElement("tipoinstruccion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoInstruccion(tipoinstruccionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Instruccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoInstruccion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoInstruccionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoInstruccion(TipoInstruccion tipoinstruccion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinstruccion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinstruccion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoinstruccion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoInstruccion(TipoInstruccion tipoinstruccion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoInstruccionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoinstruccion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoInstruccionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoinstruccion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoInstruccionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoinstruccion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoInstruccionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoinstruccion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoInstruccionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados=new ArrayList<TipoInstruccion>();
		
		tipoinstruccionsSeleccionados=this.getTipoInstruccionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoInstruccion(tipoinstruccionsSeleccionados);
		
		this.generarReporteTipoInstruccions("Todos",tipoinstruccionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoInstruccion(ArrayList<TipoInstruccion> tipoinstruccionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoInstruccion tipoinstruccionAux:tipoinstruccionsSeleccionados) {
				tipoinstruccionAux.setsDetalleGeneralEntityReporte(tipoinstruccionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoInstruccionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoinstruccionAux.setsDescripcionGeneralEntityReporte1(tipoinstruccionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoInstruccionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoinstruccionAux.setsDescripcionGeneralEntityReporte1(tipoinstruccionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoInstruccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoInstruccion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoInstruccion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoInstruccion=false;
			this.isVisibilidadCeldaActualizarTipoInstruccion=false;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
			this.isVisibilidadCeldaCancelarTipoInstruccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstruccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoInstruccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
			this.isVisibilidadCeldaModificarTipoInstruccion=false;
			this.isVisibilidadCeldaActualizarTipoInstruccion=true;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
			this.isVisibilidadCeldaCancelarTipoInstruccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstruccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoInstruccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
			this.isVisibilidadCeldaModificarTipoInstruccion=false;
			this.isVisibilidadCeldaActualizarTipoInstruccion=true;
			this.isVisibilidadCeldaEliminarTipoInstruccion=true;
			this.isVisibilidadCeldaCancelarTipoInstruccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstruccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoInstruccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
			this.isVisibilidadCeldaModificarTipoInstruccion=false;
			this.isVisibilidadCeldaActualizarTipoInstruccion=true;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
			this.isVisibilidadCeldaCancelarTipoInstruccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoInstruccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=true;
			this.isVisibilidadCeldaModificarTipoInstruccion=false;
			this.isVisibilidadCeldaActualizarTipoInstruccion=false;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
			this.isVisibilidadCeldaCancelarTipoInstruccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstruccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoInstruccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
			this.isVisibilidadCeldaActualizarTipoInstruccion=false;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
			this.isVisibilidadCeldaCancelarTipoInstruccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoInstruccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
			this.isVisibilidadCeldaModificarTipoInstruccion=true;
			this.isVisibilidadCeldaActualizarTipoInstruccion=false;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
			this.isVisibilidadCeldaCancelarTipoInstruccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoInstruccion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoInstruccionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoInstruccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=true;
		} else {
			this.actualizarEstadoPanelsTipoInstruccion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoInstruccion=false;
			//this.isVisibilidadCeldaVerFormTipoInstruccion=false;
			this.isVisibilidadCeldaDuplicarTipoInstruccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoinstruccionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoInstruccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
			if(!tipoinstruccionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;												
			}
			
			this.jButtonCerrarTipoInstruccion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoInstruccion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoinstruccion)) {
			this.isVisibilidadCeldaActualizarTipoInstruccion=false;
			this.isVisibilidadCeldaEliminarTipoInstruccion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoInstruccion() {
		this.isVisibilidadCeldaNuevoTipoInstruccion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoInstruccion=false;
	}
	
	public void actualizarEstadoPanelsTipoInstruccion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoInstruccion!=null) {
				this.jScrollPanelDatosEdicionTipoInstruccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstruccion!=null) {
				this.jScrollPanelDatosTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstruccion!=null) {
				this.jPanelPaginacionTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstruccion!=null) {
				this.jPanelParametrosReportesTipoInstruccion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoInstruccion!=null) {
				this.jScrollPanelDatosEdicionTipoInstruccion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoInstruccion!=null) {
				this.jScrollPanelDatosTipoInstruccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInstruccion!=null) {
				this.jPanelPaginacionTipoInstruccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInstruccion!=null) {
				this.jPanelParametrosReportesTipoInstruccion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoInstruccion!=null) {
				this.jScrollPanelDatosEdicionTipoInstruccion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoInstruccion!=null) {
				this.jScrollPanelDatosTipoInstruccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInstruccion!=null) {
				this.jPanelPaginacionTipoInstruccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInstruccion!=null) {
				this.jPanelParametrosReportesTipoInstruccion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoInstruccion!=null) {
				this.jScrollPanelDatosEdicionTipoInstruccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstruccion!=null) {
				this.jScrollPanelDatosTipoInstruccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoInstruccion!=null) {
				this.jPanelPaginacionTipoInstruccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoInstruccion!=null) {
				this.jPanelParametrosReportesTipoInstruccion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoInstruccion!=null) {
				this.jScrollPanelDatosEdicionTipoInstruccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoInstruccion!=null) {
				this.jScrollPanelDatosTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstruccion!=null) {
				this.jPanelPaginacionTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstruccion!=null) {
				this.jPanelParametrosReportesTipoInstruccion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoInstruccion!=null) {
				this.jScrollPanelDatosEdicionTipoInstruccion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoInstruccion!=null) {
				this.jScrollPanelDatosTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstruccion!=null) {
				this.jPanelPaginacionTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstruccion!=null) {
				this.jPanelParametrosReportesTipoInstruccion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoInstruccion!=null) {
				this.jScrollPanelDatosEdicionTipoInstruccion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoInstruccion!=null) {
				this.jScrollPanelDatosTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoInstruccion!=null) {
				this.jPanelPaginacionTipoInstruccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoInstruccion!=null) {
				this.jPanelParametrosReportesTipoInstruccion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoinstruccionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoInstruccionParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.tipoinstruccionSessionBean==null) {
				this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean.setsPathNavegacionActual(tipoinstruccionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(TipoInstruccionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoInstruccion(true);
			this.jInternalFrameDetalleFormTipoInstruccion.empleadoSessionBean.setlidTipoInstruccionActual(this.idTipoInstruccionActual);

			tipoinstruccionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoInstruccion(true);
			tipoinstruccionSessionBean.setlIdTipoInstruccionActualForeignKey(this.idTipoInstruccionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoInstruccionSessionBean tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
		
		if(this.tipoinstruccionSessionBean==null) {
			this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
		}
		
		this.tipoinstruccionSessionBean.setsUltimaBusquedaTipoInstruccion(this.getsAccionBusqueda());
		this.tipoinstruccionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoinstruccionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoInstruccionSessionBean tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
		
		if(this.tipoinstruccionSessionBean==null) {
			this.tipoinstruccionSessionBean=new TipoInstruccionSessionBean();
		}
		
		if(this.tipoinstruccionSessionBean.getsUltimaBusquedaTipoInstruccion()!=null&&!this.tipoinstruccionSessionBean.getsUltimaBusquedaTipoInstruccion().equals("")) {
			this.setsAccionBusqueda(tipoinstruccionSessionBean.getsUltimaBusquedaTipoInstruccion());
			this.setiNumeroPaginacion(tipoinstruccionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoinstruccionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoinstruccionSessionBean.setsUltimaBusquedaTipoInstruccion("");
		this.tipoinstruccionSessionBean.setiNumeroPaginacion(TipoInstruccionConstantesFunciones.INUMEROPAGINACION);
		this.tipoinstruccionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoInstruccion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoInstruccion() {
		this.updateBorderResaltarBusquedasFormularioTipoInstruccion();
		this.updateVisibilidadBusquedasFormularioTipoInstruccion();
		this.updateHabilitarBusquedasFormularioTipoInstruccion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoInstruccion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoInstruccion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoInstruccion() {
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
	
	public void updateControlesFormularioTipoInstruccion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoInstruccion();
		this.updateVisibilidadResaltarControlesFormularioTipoInstruccion();
		this.updateHabilitarResaltarControlesFormularioTipoInstruccion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoInstruccion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoinstruccionConstantesFunciones.resaltaridTipoInstruccion!=null && this.jInternalFrameDetalleFormTipoInstruccion!=null) {this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.setBorder(this.tipoinstruccionConstantesFunciones.resaltaridTipoInstruccion);}
		if(this.tipoinstruccionConstantesFunciones.resaltarcodigoTipoInstruccion!=null && this.jInternalFrameDetalleFormTipoInstruccion!=null) {this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.setBorder(this.tipoinstruccionConstantesFunciones.resaltarcodigoTipoInstruccion);}
		if(this.tipoinstruccionConstantesFunciones.resaltarnombreTipoInstruccion!=null && this.jInternalFrameDetalleFormTipoInstruccion!=null) {this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.setBorder(this.tipoinstruccionConstantesFunciones.resaltarnombreTipoInstruccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoInstruccion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
	
		//this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.setVisible(this.tipoinstruccionConstantesFunciones.mostraridTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.jPanelidTipoInstruccion.setVisible(this.tipoinstruccionConstantesFunciones.mostraridTipoInstruccion);
		//this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.setVisible(this.tipoinstruccionConstantesFunciones.mostrarcodigoTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.jPanelcodigoTipoInstruccion.setVisible(this.tipoinstruccionConstantesFunciones.mostrarcodigoTipoInstruccion);
		//this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.setVisible(this.tipoinstruccionConstantesFunciones.mostrarnombreTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.jPanelnombreTipoInstruccion.setVisible(this.tipoinstruccionConstantesFunciones.mostrarnombreTipoInstruccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoInstruccion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoInstruccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoInstruccion!=null) {
	
		this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldidTipoInstruccion.setEnabled(this.tipoinstruccionConstantesFunciones.activaridTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.jTextFieldcodigoTipoInstruccion.setEnabled(this.tipoinstruccionConstantesFunciones.activarcodigoTipoInstruccion);
		this.jInternalFrameDetalleFormTipoInstruccion.jTextAreanombreTipoInstruccion.setEnabled(this.tipoinstruccionConstantesFunciones.activarnombreTipoInstruccion);
		}
	}
	
		
}