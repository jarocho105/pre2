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

import com.bydan.erp.nomina.util.TipoVariableNomiConstantesFunciones;
import com.bydan.erp.nomina.util.TipoVariableNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoVariableNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoVariableNomiBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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




@SuppressWarnings("unused")
public class TipoVariableNomiBeanSwingJInternalFrame extends TipoVariableNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoVariableNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoVariableNomi> tipovariablenomiValidator = new ClassValidator<TipoVariableNomi>(TipoVariableNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoVariableNomi tipovariablenomi;	
	public TipoVariableNomi tipovariablenomiAux;
	public TipoVariableNomi tipovariablenomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoVariableNomi tipovariablenomiTotales;
	public Long idTipoVariableNomiActual;
	public Long iIdNuevoTipoVariableNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosVariableNomi=false;

	public Boolean getIsTienePermisosVariableNomi() {
		return isTienePermisosVariableNomi;
	}

	public void setIsTienePermisosVariableNomi(Boolean isTienePermisosVariableNomi) {
		this.isTienePermisosVariableNomi= isTienePermisosVariableNomi;
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
	
	public Boolean isPermisoTodoTipoVariableNomi;
	public Boolean isPermisoNuevoTipoVariableNomi;
	public Boolean isPermisoActualizarTipoVariableNomi;
	public Boolean isPermisoActualizarOriginalTipoVariableNomi;
	public Boolean isPermisoEliminarTipoVariableNomi;
	public Boolean isPermisoGuardarCambiosTipoVariableNomi;
	public Boolean isPermisoConsultaTipoVariableNomi;
	public Boolean isPermisoBusquedaTipoVariableNomi;
	public Boolean isPermisoReporteTipoVariableNomi;
	public Boolean isPermisoPaginacionMedioTipoVariableNomi;
	public Boolean isPermisoPaginacionAltoTipoVariableNomi;
	public Boolean isPermisoPaginacionTodoTipoVariableNomi;
	public Boolean isPermisoCopiarTipoVariableNomi;
	public Boolean isPermisoVerFormTipoVariableNomi;
	public Boolean isPermisoDuplicarTipoVariableNomi;
	public Boolean isPermisoOrdenTipoVariableNomi;
	
	
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
	
	public TipoVariableNomiParameterReturnGeneral tipovariablenomiReturnGeneral;
	public TipoVariableNomiParameterReturnGeneral tipovariablenomiParameterGeneral;
	
	

	public VariableNomiLogic variablenomiLogic=null;

	public VariableNomiLogic getVariableNomiLogic() {
		return variablenomiLogic;
	}

	public void setVariableNomiLogic(VariableNomiLogic variablenomiLogic) {
		this.variablenomiLogic = variablenomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoVariableNomi=false;
	public Boolean esParaAccionDesdeFormularioTipoVariableNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoVariableNomiSessionBeanAdditional tipovariablenomiSessionBeanAdditional=null;
	
	public TipoVariableNomiSessionBeanAdditional getTipoVariableNomiSessionBeanAdditional() {
		return this.tipovariablenomiSessionBeanAdditional;
	}
	
	public void setTipoVariableNomiSessionBeanAdditional(TipoVariableNomiSessionBeanAdditional tipovariablenomiSessionBeanAdditional) {
		try {
			this.tipovariablenomiSessionBeanAdditional=tipovariablenomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoVariableNomiBeanSwingJInternalFrameAdditional tipovariablenomiBeanSwingJInternalFrameAdditional=null;
	//public class TipoVariableNomiBeanSwingJInternalFrame
	
	public TipoVariableNomiBeanSwingJInternalFrameAdditional getTipoVariableNomiBeanSwingJInternalFrameAdditional() {
		return this.tipovariablenomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoVariableNomiBeanSwingJInternalFrameAdditional(TipoVariableNomiBeanSwingJInternalFrameAdditional tipovariablenomiBeanSwingJInternalFrameAdditional) {
		try {
			this.tipovariablenomiBeanSwingJInternalFrameAdditional=tipovariablenomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoVariableNomiLogic tipovariablenomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoVariableNomi tipovariablenomiBean;
	public TipoVariableNomiConstantesFunciones tipovariablenomiConstantesFunciones;
	//public TipoVariableNomiParameterReturnGeneral tipovariablenomiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoVariableNomi> tipovariablenomis;	
	//public List<TipoVariableNomi> tipovariablenomisEliminados;
	//public List<TipoVariableNomi> tipovariablenomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoVariableNomi=false;
	public Boolean isVisibilidadCeldaDuplicarTipoVariableNomi=true;
	public Boolean isVisibilidadCeldaCopiarTipoVariableNomi=true;
	public Boolean isVisibilidadCeldaVerFormTipoVariableNomi=true;
	public Boolean isVisibilidadCeldaOrdenTipoVariableNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
	public Boolean isVisibilidadCeldaModificarTipoVariableNomi=false;
	public Boolean isVisibilidadCeldaActualizarTipoVariableNomi=false;
	public Boolean isVisibilidadCeldaEliminarTipoVariableNomi=false;
	public Boolean isVisibilidadCeldaCancelarTipoVariableNomi=false;
	public Boolean isVisibilidadCeldaGuardarTipoVariableNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;	
	
	
	
	public Long getiIdNuevoTipoVariableNomi() {
		return this.iIdNuevoTipoVariableNomi;
	}

	public void setiIdNuevoTipoVariableNomi(Long iIdNuevoTipoVariableNomi) {
		this.iIdNuevoTipoVariableNomi = iIdNuevoTipoVariableNomi;
	}
	
	public Long getidTipoVariableNomiActual() {
		return this.idTipoVariableNomiActual;
	}

	public void setidTipoVariableNomiActual(Long idTipoVariableNomiActual) {
		this.idTipoVariableNomiActual = idTipoVariableNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoVariableNomi gettipovariablenomi() {
		return this.tipovariablenomi;
	}

	public void settipovariablenomi(TipoVariableNomi tipovariablenomi) {
		this.tipovariablenomi = tipovariablenomi;
	}
	
	public TipoVariableNomi gettipovariablenomiAux() {
		return this.tipovariablenomiAux;
	}

	public void settipovariablenomiAux(TipoVariableNomi tipovariablenomiAux) {
		this.tipovariablenomiAux = tipovariablenomiAux;
	}				
	
	public TipoVariableNomi gettipovariablenomiAnterior() {
		return this.tipovariablenomiAnterior;
	}

	public void settipovariablenomiAnterior(TipoVariableNomi tipovariablenomiAnterior) {
		this.tipovariablenomiAnterior = tipovariablenomiAnterior;
	}	
	
	public TipoVariableNomi gettipovariablenomiTotales() {
		return this.tipovariablenomiTotales;
	}

	public void settipovariablenomiTotales(TipoVariableNomi tipovariablenomiTotales) {
		this.tipovariablenomiTotales = tipovariablenomiTotales;
	}	
	
	public TipoVariableNomi gettipovariablenomiBean() {
		return this.tipovariablenomiBean;
	}

	public void settipovariablenomiBean(TipoVariableNomi tipovariablenomiBean) {
		this.tipovariablenomiBean = tipovariablenomiBean;
	}	
	
	public TipoVariableNomiParameterReturnGeneral gettipovariablenomiReturnGeneral() {
		return this.tipovariablenomiReturnGeneral;
	}

	public void settipovariablenomiReturnGeneral(TipoVariableNomiParameterReturnGeneral tipovariablenomiReturnGeneral) {
		this.tipovariablenomiReturnGeneral = tipovariablenomiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoVariableNomiLogic getTipoVariableNomiLogic()	{		
		return tipovariablenomiLogic;
	}

	public void setTipoVariableNomiLogic(TipoVariableNomiLogic tipovariablenomiLogic) {
		this.tipovariablenomiLogic = tipovariablenomiLogic;
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
	
	public Boolean getIsEsNuevoTipoVariableNomi() {
		return isEsNuevoTipoVariableNomi;
	}

	public void setIsEsNuevoTipoVariableNomi(Boolean isEsNuevoTipoVariableNomi) {
		this.isEsNuevoTipoVariableNomi = isEsNuevoTipoVariableNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoVariableNomi() {
		return esParaAccionDesdeFormularioTipoVariableNomi;
	}
	
	public void setEsParaAccionDesdeFormularioTipoVariableNomi(Boolean esParaAccionDesdeFormularioTipoVariableNomi) {
		this.esParaAccionDesdeFormularioTipoVariableNomi = esParaAccionDesdeFormularioTipoVariableNomi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoVariableNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoVariableNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoVariableNomi(this.tipovariablenomiLogic.getTipoVariableNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoVariableNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoVariableNomi(this.tipovariablenomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipovariablenomiLogic.setTipoVariableNomis(this.tipovariablenomis);
			tipovariablenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoVariableNomiParameterReturnGeneral getTipoVariableNomiParameterGeneral() {
		return this.tipovariablenomiParameterGeneral;
	}
	
	public void setTipoVariableNomiParameterGeneral(TipoVariableNomiParameterReturnGeneral tipovariablenomiParameterGeneral) {
		this.tipovariablenomiParameterGeneral = tipovariablenomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoVariableNomi() {
		return isPermisoTodoTipoVariableNomi;
	}

	public void setIsPermisoTodoTipoVariableNomi(Boolean isPermisoTodoTipoVariableNomi) {
		this.isPermisoTodoTipoVariableNomi = isPermisoTodoTipoVariableNomi;
	}

	public Boolean getIsPermisoNuevoTipoVariableNomi() {
		return isPermisoNuevoTipoVariableNomi;
	}

	public void setIsPermisoNuevoTipoVariableNomi(Boolean isPermisoNuevoTipoVariableNomi) {
		this.isPermisoNuevoTipoVariableNomi = isPermisoNuevoTipoVariableNomi;
	}

	public Boolean getIsPermisoActualizarTipoVariableNomi() {
		return isPermisoActualizarTipoVariableNomi;
	}

	public void setIsPermisoActualizarTipoVariableNomi(Boolean isPermisoActualizarTipoVariableNomi) {
		this.isPermisoActualizarTipoVariableNomi = isPermisoActualizarTipoVariableNomi;
	}

	public Boolean getIsPermisoEliminarTipoVariableNomi() {
		return isPermisoEliminarTipoVariableNomi;
	}

	public void setIsPermisoEliminarTipoVariableNomi(Boolean isPermisoEliminarTipoVariableNomi) {
		this.isPermisoEliminarTipoVariableNomi = isPermisoEliminarTipoVariableNomi;
	}

	public Boolean getIsPermisoGuardarCambiosTipoVariableNomi() {
		return isPermisoGuardarCambiosTipoVariableNomi;
	}

	public void setIsPermisoGuardarCambiosTipoVariableNomi(Boolean isPermisoGuardarCambiosTipoVariableNomi) {
		this.isPermisoGuardarCambiosTipoVariableNomi = isPermisoGuardarCambiosTipoVariableNomi;
	}
	
	public Boolean getIsPermisoConsultaTipoVariableNomi() {
		return isPermisoConsultaTipoVariableNomi;
	}

	public void setIsPermisoConsultaTipoVariableNomi(Boolean isPermisoConsultaTipoVariableNomi) {
		this.isPermisoConsultaTipoVariableNomi = isPermisoConsultaTipoVariableNomi;
	}

	public Boolean getIsPermisoBusquedaTipoVariableNomi() {
		return isPermisoBusquedaTipoVariableNomi;
	}

	public void setIsPermisoBusquedaTipoVariableNomi(Boolean isPermisoBusquedaTipoVariableNomi) {
		this.isPermisoBusquedaTipoVariableNomi = isPermisoBusquedaTipoVariableNomi;
	}

	public Boolean getIsPermisoReporteTipoVariableNomi() {
		return isPermisoReporteTipoVariableNomi;
	}

	public void setIsPermisoReporteTipoVariableNomi(Boolean isPermisoReporteTipoVariableNomi) {
		this.isPermisoReporteTipoVariableNomi = isPermisoReporteTipoVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoVariableNomi() {
		return isPermisoPaginacionMedioTipoVariableNomi;
	}

	public void setIsPermisoPaginacionMedioTipoVariableNomi(Boolean isPermisoPaginacionMedioTipoVariableNomi) {
		this.isPermisoPaginacionMedioTipoVariableNomi = isPermisoPaginacionMedioTipoVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoVariableNomi() {
		return isPermisoPaginacionTodoTipoVariableNomi;
	}

	public void setIsPermisoPaginacionTodoTipoVariableNomi(Boolean isPermisoPaginacionTodoTipoVariableNomi) {
		this.isPermisoPaginacionTodoTipoVariableNomi = isPermisoPaginacionTodoTipoVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoVariableNomi() {
		return isPermisoPaginacionAltoTipoVariableNomi;
	}

	public void setIsPermisoPaginacionAltoTipoVariableNomi(Boolean isPermisoPaginacionAltoTipoVariableNomi) {
		this.isPermisoPaginacionAltoTipoVariableNomi = isPermisoPaginacionAltoTipoVariableNomi;
	}
	
	public Boolean getIsPermisoCopiarTipoVariableNomi() {
		return isPermisoCopiarTipoVariableNomi;
	}

	public void setIsPermisoCopiarTipoVariableNomi(Boolean isPermisoCopiarTipoVariableNomi) {
		this.isPermisoCopiarTipoVariableNomi = isPermisoCopiarTipoVariableNomi;
	}
	
	public Boolean getIsPermisoVerFormTipoVariableNomi() {
		return isPermisoVerFormTipoVariableNomi;
	}

	public void setIsPermisoVerFormTipoVariableNomi(Boolean isPermisoVerFormTipoVariableNomi) {
		this.isPermisoVerFormTipoVariableNomi = isPermisoVerFormTipoVariableNomi;
	}
	
	public Boolean getIsPermisoDuplicarTipoVariableNomi() {
		return isPermisoDuplicarTipoVariableNomi;
	}

	public void setIsPermisoDuplicarTipoVariableNomi(Boolean isPermisoDuplicarTipoVariableNomi) {
		this.isPermisoDuplicarTipoVariableNomi = isPermisoDuplicarTipoVariableNomi;
	}
	
	public Boolean getIsPermisoOrdenTipoVariableNomi() {
		return isPermisoOrdenTipoVariableNomi;
	}

	public void setIsPermisoOrdenTipoVariableNomi(Boolean isPermisoOrdenTipoVariableNomi) {
		this.isPermisoOrdenTipoVariableNomi = isPermisoOrdenTipoVariableNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoVariableNomi() {
		return isVisibilidadCeldaNuevoTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaNuevoTipoVariableNomi(Boolean isVisibilidadCeldaNuevoTipoVariableNomi) {
		this.isVisibilidadCeldaNuevoTipoVariableNomi = isVisibilidadCeldaNuevoTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoVariableNomi() {
		return isVisibilidadCeldaDuplicarTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaDuplicarTipoVariableNomi(Boolean isVisibilidadCeldaDuplicarTipoVariableNomi) {
		this.isVisibilidadCeldaDuplicarTipoVariableNomi = isVisibilidadCeldaDuplicarTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoVariableNomi() {
		return isVisibilidadCeldaCopiarTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaCopiarTipoVariableNomi(Boolean isVisibilidadCeldaCopiarTipoVariableNomi) {
		this.isVisibilidadCeldaCopiarTipoVariableNomi = isVisibilidadCeldaCopiarTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoVariableNomi() {
		return isVisibilidadCeldaVerFormTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaVerFormTipoVariableNomi(Boolean isVisibilidadCeldaVerFormTipoVariableNomi) {
		this.isVisibilidadCeldaVerFormTipoVariableNomi = isVisibilidadCeldaVerFormTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoVariableNomi() {
		return isVisibilidadCeldaOrdenTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaOrdenTipoVariableNomi(Boolean isVisibilidadCeldaOrdenTipoVariableNomi) {
		this.isVisibilidadCeldaOrdenTipoVariableNomi = isVisibilidadCeldaOrdenTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoVariableNomi() {
		return isVisibilidadCeldaNuevoRelacionesTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoVariableNomi(Boolean isVisibilidadCeldaNuevoRelacionesTipoVariableNomi) {
		this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi = isVisibilidadCeldaNuevoRelacionesTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoVariableNomi() {
		return isVisibilidadCeldaModificarTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaModificarTipoVariableNomi(Boolean isVisibilidadCeldaModificarTipoVariableNomi) {
		this.isVisibilidadCeldaModificarTipoVariableNomi = isVisibilidadCeldaModificarTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoVariableNomi() {
		return isVisibilidadCeldaActualizarTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaActualizarTipoVariableNomi(Boolean isVisibilidadCeldaActualizarTipoVariableNomi) {
		this.isVisibilidadCeldaActualizarTipoVariableNomi = isVisibilidadCeldaActualizarTipoVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoVariableNomi() {
		return isVisibilidadCeldaEliminarTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaEliminarTipoVariableNomi(Boolean isVisibilidadCeldaEliminarTipoVariableNomi) {
		this.isVisibilidadCeldaEliminarTipoVariableNomi = isVisibilidadCeldaEliminarTipoVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoVariableNomi() {
		return isVisibilidadCeldaCancelarTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaCancelarTipoVariableNomi(Boolean isVisibilidadCeldaCancelarTipoVariableNomi) {
		this.isVisibilidadCeldaCancelarTipoVariableNomi = isVisibilidadCeldaCancelarTipoVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoVariableNomi() {
		return isVisibilidadCeldaGuardarTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaGuardarTipoVariableNomi(Boolean isVisibilidadCeldaGuardarTipoVariableNomi) {
		this.isVisibilidadCeldaGuardarTipoVariableNomi = isVisibilidadCeldaGuardarTipoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoVariableNomi() {
		return isVisibilidadCeldaGuardarCambiosTipoVariableNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoVariableNomi(Boolean isVisibilidadCeldaGuardarCambiosTipoVariableNomi) {
		this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi = isVisibilidadCeldaGuardarCambiosTipoVariableNomi;
	}
		
	public TipoVariableNomiSessionBean gettipovariablenomiSessionBean() {
		return this.tipovariablenomiSessionBean;
	}
	
	public void settipovariablenomiSessionBean(TipoVariableNomiSessionBean tipovariablenomiSessionBean) {
		this.tipovariablenomiSessionBean=tipovariablenomiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(TipoVariableNomi tipovariablenomi)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoVariableNomi tipovariablenomi,TipoVariableNomi tipovariablenomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoVariableNomi(tipovariablenomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipovariablenomiAux.setId(tipovariablenomi.getId());
		tipovariablenomiAux.setVersionRow(tipovariablenomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoVariableNomi();
		
			int intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipovariablenomiValidator.getInvalidValues(this.tipovariablenomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipovariablenomiLogic.setDatosCliente(datosCliente);
			tipovariablenomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipovariablenomiAux=new  TipoVariableNomi();
				
				tipovariablenomiAux.setIsNew(true);
				tipovariablenomiAux.setIsChanged(true);
				
				tipovariablenomiAux.setTipoVariableNomiOriginal(this.tipovariablenomi);
				
				tipovariablenomiAux.setId(this.tipovariablenomi.getId());	
				tipovariablenomiAux.setVersionRow(this.tipovariablenomi.getVersionRow());	
				tipovariablenomiAux.setcodigo(this.tipovariablenomi.getcodigo());	
				tipovariablenomiAux.setnombre(this.tipovariablenomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipovariablenomiAux,tipovariablenomiLogic.getTipoVariableNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovariablenomiAux,tipovariablenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovariablenomiLogic.saveTipoVariableNomis();//WithConnection
						//tipovariablenomiLogic.getSetVersionRowTipoVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovariablenomi,tipovariablenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis().addAll(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis.addAll(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovariablenomiLogic.saveTipoVariableNomiRelaciones(tipovariablenomiAux,this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());//WithConnection
								//tipovariablenomiLogic.getSetVersionRowTipoVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovariablenomi,tipovariablenomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis= new ArrayList<VariableNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovariablenomiAux.setVariableNomis(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipovariablenomiAux,tipovariablenomiLogic.getTipoVariableNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipovariablenomiAux,tipovariablenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovariablenomi,tipovariablenomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipovariablenomiAux=new  TipoVariableNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado() 
					|| (this.tipovariablenomiSessionBean.getEsGuardarRelacionado() && this.tipovariablenomi.getId()>=0)) {
						
					tipovariablenomiAux.setIsNew(false);
				}
				
				tipovariablenomiAux.setIsDeleted(false);
			
				tipovariablenomiAux.setId(this.tipovariablenomi.getId());	
				tipovariablenomiAux.setVersionRow(this.tipovariablenomi.getVersionRow());	
				tipovariablenomiAux.setcodigo(this.tipovariablenomi.getcodigo());	
				tipovariablenomiAux.setnombre(this.tipovariablenomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovariablenomiAux,tipovariablenomiLogic.getTipoVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovariablenomiAux,tipovariablenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovariablenomiLogic.saveTipoVariableNomis();//WithConnection
						//tipovariablenomiLogic.getSetVersionRowTipoVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovariablenomi,tipovariablenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis().addAll(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis.addAll(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovariablenomiLogic.saveTipoVariableNomiRelaciones(tipovariablenomiAux,this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());//WithConnection
								//tipovariablenomiLogic.getSetVersionRowTipoVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovariablenomi,tipovariablenomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis= new ArrayList<VariableNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovariablenomiAux.setVariableNomis(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipovariablenomiAux,tipovariablenomiLogic.getTipoVariableNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipovariablenomiAux,tipovariablenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovariablenomi,tipovariablenomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipovariablenomiAux=new  TipoVariableNomi();
				
				tipovariablenomiAux.setIsNew(false);
				tipovariablenomiAux.setIsChanged(false);
				
				tipovariablenomiAux.setIsDeleted(true);
				
				tipovariablenomiAux.setId(this.tipovariablenomi.getId());	
				tipovariablenomiAux.setVersionRow(this.tipovariablenomi.getVersionRow());	
				tipovariablenomiAux.setcodigo(this.tipovariablenomi.getcodigo());	
				tipovariablenomiAux.setnombre(this.tipovariablenomi.getnombre());	
				
				if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipovariablenomiAux.getId()>=0) {	
						this.tipovariablenomisEliminados.add(tipovariablenomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipovariablenomiAux,tipovariablenomiLogic.getTipoVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovariablenomiAux,tipovariablenomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovariablenomiLogic.saveTipoVariableNomis();//WithConnection
						//tipovariablenomiLogic.getSetVersionRowTipoVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis().addAll(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis.addAll(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovariablenomiLogic.saveTipoVariableNomiRelaciones(tipovariablenomiAux,this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());//WithConnection
								//tipovariablenomiLogic.getSetVersionRowTipoVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis= new ArrayList<VariableNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovariablenomiAux.setVariableNomis(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipovariablenomiAux,tipovariablenomiLogic.getTipoVariableNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipovariablenomiAux,tipovariablenomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.getTipoVariableNomis().addAll(this.tipovariablenomisEliminados);
					
					tipovariablenomiLogic.saveTipoVariableNomis();//WithConnection
					//tipovariablenomiLogic.getSetVersionRowTipoVariableNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipovariablenomisEliminados= new ArrayList<TipoVariableNomi>();		
			}
			
			if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Variable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipovariablenomi=tipovariablenomiAux;
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
      		//this.finishProcessTipoVariableNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoVariableNomi tipovariablenomiLocal) throws Exception {
		
		if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipovariablenomiLocal.setVariableNomis(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
			
			} else {
			
				tipovariablenomiLocal.setVariableNomis(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoVariableNomi tipovariablenomiLocal) throws Exception {	
		if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoVariableNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipovariablenomiValidator.getInvalidValues(this.tipovariablenomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoVariableNomi tipovariablenomi,List<TipoVariableNomi> tipovariablenomis) throws Exception {
		try	{		
			TipoVariableNomiConstantesFunciones.actualizarLista(tipovariablenomi,tipovariablenomis,this.tipovariablenomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoVariableNomi tipovariablenomi,List<TipoVariableNomi> tipovariablenomis) throws Exception {
		try	{			
			TipoVariableNomiConstantesFunciones.actualizarSelectedLista(tipovariablenomi,tipovariablenomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoVariableNomi> tipovariablenomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipovariablenomisLocal=this.tipovariablenomiLogic.getTipoVariableNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipovariablenomisLocal=this.tipovariablenomis;
			}
			//ARCHITECTURE
		
			for(TipoVariableNomi tipovariablenomiLocal:tipovariablenomisLocal) {
				if(this.permiteMantenimiento(tipovariablenomiLocal) && tipovariablenomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoVariableNomiConstantesFunciones.getTipoVariableNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoVariableNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVariableNomi.jLabelcodigoTipoVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoVariableNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVariableNomi.jLabelnombreTipoVariableNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVariableNomi.jLabelcodigoTipoVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVariableNomi.jLabelnombreTipoVariableNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("VariableNomi")) {
			if(this.tipovariablenomi==null) {
				this.tipovariablenomi= new TipoVariableNomi();
			}

			if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoVariableNomi
				this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);

				this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.getvariablenomi().setTipoVariableNomi(this.tipovariablenomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoVariableNomi--;	
		
		
		this.tipovariablenomiAux=new TipoVariableNomi();
		
		this.tipovariablenomiAux.setId(this.iIdNuevoTipoVariableNomi);
		this.tipovariablenomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovariablenomiLogic.getTipoVariableNomis().add(this.tipovariablenomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipovariablenomis.add(this.tipovariablenomiAux);
		}
		//ARCHITECTURE
		
		this.tipovariablenomi=this.tipovariablenomiAux;
		
		if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoVariableNomi(this.tipovariablenomi);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVariableNomi(this.tipovariablenomi);
		}
				
		//this.setDefaultControlesTipoVariableNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoVariableNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoVariableNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVariableNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVariableNomi(this.tipovariablenomiBean,this.tipovariablenomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoVariableNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
			classes=TipoVariableNomiConstantesFunciones.getClassesRelationshipsOfTipoVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipovariablenomiReturnGeneral=tipovariablenomiLogic.procesarEventosTipoVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovariablenomiLogic.getTipoVariableNomis(),this.tipovariablenomi,this.tipovariablenomiParameterGeneral,this.isEsNuevoTipoVariableNomi,classes);//this.tipovariablenomiLogic.getTipoVariableNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoVariableNomi(this.tipovariablenomiReturnGeneral,this.tipovariablenomiBean,false);
		
		if(this.tipovariablenomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVariableNomi(this.tipovariablenomiReturnGeneral.getTipoVariableNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoVariableNomi(this.tipovariablenomiReturnGeneral.getTipoVariableNomi());
		}
		
		if(this.tipovariablenomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoVariableNomi(this.tipovariablenomiReturnGeneral.getTipoVariableNomi(),classes);//this.tipovariablenomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoVariableNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoVariableNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.RecargarFormTipoVariableNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoVariableNomi(false);
						
			if(tipovariablenomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getEsGuardarRelacionado() && VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVariableNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVariableNomi();
			}
			
			this.actualizarVisualTableDatosTipoVariableNomi();
			
			this.jTableDatosTipoVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoVariableNomi(), this.getIndiceNuevoTipoVariableNomi());
			
			this.seleccionarFilaTablaTipoVariableNomiActual();
						
			this.actualizarEstadoCeldasBotonesTipoVariableNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoVariableNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.setEnabled(isHabilitar && this.tipovariablenomiConstantesFunciones.activarcodigoTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.setEnabled(isHabilitar && this.tipovariablenomiConstantesFunciones.activarnombreTipoVariableNomi);	
		
	};
	
	public void setDefaultControlesTipoVariableNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoVariableNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipovariablenomiSessionBean.setConGuardarRelaciones(true);			
			this.tipovariablenomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipovariablenomiSessionBean.setConGuardarRelaciones(false);			
			this.tipovariablenomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoVariableNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
				if(tipovariablenomiAux.getId().equals(this.iIdNuevoTipoVariableNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomis) {
				if(tipovariablenomiAux.getId().equals(this.iIdNuevoTipoVariableNomi)) {
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
	
	public int getIndiceActualTipoVariableNomi(TipoVariableNomi tipovariablenomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
				if(tipovariablenomiAux.getId().equals(tipovariablenomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomis) {
				if(tipovariablenomiAux.getId().equals(tipovariablenomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoVariableNomi(TipoVariableNomi tipovariablenomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
				if(tipovariablenomiAux.getTipoVariableNomiOriginal().getId().equals(tipovariablenomiOriginal.getId())) {
					existe=true;
					tipovariablenomiOriginal.setId(tipovariablenomiAux.getId());
					tipovariablenomiOriginal.setVersionRow(tipovariablenomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomis) {
				if(tipovariablenomiAux.getTipoVariableNomiOriginal().getId().equals(tipovariablenomiOriginal.getId())) {
					existe=true;
					tipovariablenomiOriginal.setId(tipovariablenomiAux.getId());
					tipovariablenomiOriginal.setVersionRow(tipovariablenomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoVariableNomi(Boolean esParaCancelar) throws Exception {
		tipovariablenomisAux=new ArrayList<TipoVariableNomi>();
		tipovariablenomiAux=new TipoVariableNomi();
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
					if(tipovariablenomiAux.getId()<0) {
						tipovariablenomisAux.add(tipovariablenomiAux);
					}		
				}
				this.iIdNuevoTipoVariableNomi=0L;
				this.tipovariablenomiLogic.getTipoVariableNomis().removeAll(tipovariablenomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomis) {
					if(tipovariablenomiAux.getId()<0) {
						tipovariablenomisAux.add(tipovariablenomiAux);
					}		
				}
				this.iIdNuevoTipoVariableNomi=0L;
				this.tipovariablenomis.removeAll(tipovariablenomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoVariableNomi 
					&& this.tipovariablenomiLogic.getTipoVariableNomis().size()>0
					) {
					tipovariablenomiAux=this.tipovariablenomiLogic.getTipoVariableNomis().get(this.tipovariablenomiLogic.getTipoVariableNomis().size() - 1);
				
					if(tipovariablenomiAux.getId()<0) {
						this.tipovariablenomiLogic.getTipoVariableNomis().remove(tipovariablenomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoVariableNomi && this.tipovariablenomis.size()>0) {
					tipovariablenomiAux=this.tipovariablenomis.get(this.tipovariablenomis.size() - 1);
				
					if(tipovariablenomiAux.getId()<0) {
						this.tipovariablenomis.remove(tipovariablenomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoVariableNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipovariablenomi.getId()<0) {
				this.tipovariablenomiLogic.getTipoVariableNomis().remove(this.tipovariablenomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipovariablenomi.getId()<0) {
				this.tipovariablenomis.remove(this.tipovariablenomi);
			}
		}			
	}
	
	public void setEstadosInicialesTipoVariableNomi(List<TipoVariableNomi> tipovariablenomisAux) throws Exception {
		TipoVariableNomiConstantesFunciones.setEstadosInicialesTipoVariableNomi(tipovariablenomisAux);
	}
	
	public void setEstadosInicialesTipoVariableNomi(TipoVariableNomi tipovariablenomiAux) throws Exception {
		TipoVariableNomiConstantesFunciones.setEstadosInicialesTipoVariableNomi(tipovariablenomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoVariableNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoVariableNomiActual()) {
				if(!this.isEsNuevoTipoVariableNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoVariableNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoVariableNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Variable ?", "MANTENIMIENTO DE Tipo Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoVariableNomi tipovariablenomi) throws Exception {
		TipoVariableNomiConstantesFunciones.seleccionarAsignar(this.tipovariablenomi,tipovariablenomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoVariableNomi=this.isPermisoActualizarOriginalTipoVariableNomi;
			
			
			this.seleccionarAsignar(tipovariablenomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoVariableNomiConstantesFunciones.quitarEspaciosTipoVariableNomi(this.tipovariablenomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipovariablenomiSessionBean.setsFuncionBusquedaRapida(this.tipovariablenomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoVariableNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoVariableNomi(esParaCancelar);				
				this.cancelarNuevoTipoVariableNomi(esParaCancelar);								
			}
			
			this.tipovariablenomi=new TipoVariableNomi();
			
			this.inicializarTipoVariableNomi();
			
			this.actualizarEstadoCeldasBotonesTipoVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoVariableNomi() throws Exception {
		try {
			TipoVariableNomiConstantesFunciones.inicializarTipoVariableNomi(this.tipovariablenomi);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipovariablenomiLogic.getTipoVariableNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoVariableNomis(String sAccionBusqueda,List<TipoVariableNomi> tipovariablenomisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoVariableNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoVariableNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoVariableNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoVariableNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Variables");		
		parameters.put("busquedapor", TipoVariableNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(VariableNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoVariableNomiLogic tipovariablenomiLogicAuxiliar=new TipoVariableNomiLogic();
					tipovariablenomiLogicAuxiliar.setDatosCliente(tipovariablenomiLogic.getDatosCliente());				
					tipovariablenomiLogicAuxiliar.setTipoVariableNomis(tipovariablenomisParaReportes);
					
					tipovariablenomiLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoVariableNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipovariablenomisParaReportes=tipovariablenomiLogicAuxiliar.getTipoVariableNomis();
					
					//tipovariablenomiLogic.getNewConnexionToDeep();
					
					//for (TipoVariableNomi tipovariablenomi:tipovariablenomisParaReportes) {
					//	tipovariablenomiLogic.deepLoad(tipovariablenomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipovariablenomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipovariablenomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileVariableNomi = AuxiliarReportes.class.getResourceAsStream("VariableNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_variablenomi", reportFileVariableNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoVariableNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoVariableNomi=new JRBeanArrayDataSource(TipoVariableNomiJInternalFrame.TraerTipoVariableNomiBeans(tipovariablenomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoVariableNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoVariableNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoVariableNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoVariableNomiBean.TraerTipoVariableNomiBeans(tipovariablenomisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovariablenomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovariablenomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoVariableNomiActionPerformed(null);
					//this.generarExcelReporteTipoVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovariablenomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovariablenomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovariablenomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovariablenomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVariableNomi> tipovariablenomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovariablenomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVariableNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVariableNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoVariableNomi tipovariablenomi : tipovariablenomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoVariableNomiConstantesFunciones.generarExcelReporteDataTipoVariableNomi("NORMAL",row,workbook,tipovariablenomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoVariableNomi(String sTipo,Row row,Workbook workbook) {
		
		TipoVariableNomiConstantesFunciones.generarExcelReporteHeaderTipoVariableNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVariableNomi> tipovariablenomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovariablenomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVariableNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoVariableNomi tipovariablenomi : tipovariablenomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoVariableNomiConstantesFunciones.getTipoVariableNomiDescripcion(tipovariablenomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVariableNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovariablenomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovariablenomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVariableNomi> tipovariablenomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoVariableNomi> tipovariablenomisRespaldo=null;
		
		classes=TipoVariableNomiConstantesFunciones.getClassesRelationshipsOfTipoVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipovariablenomiLogic.setDatosCliente(this.datosCliente);
		this.tipovariablenomiLogic.setDatosDeep(this.datosDeep);
		this.tipovariablenomiLogic.setIsConDeep(true);
		
		tipovariablenomisRespaldo=this.tipovariablenomiLogic.getTipoVariableNomis();
		
		this.tipovariablenomiLogic.setTipoVariableNomis(tipovariablenomisParaReportes);	
		this.tipovariablenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipovariablenomisParaReportes=this.tipovariablenomiLogic.getTipoVariableNomis();
		this.tipovariablenomiLogic.setTipoVariableNomis(tipovariablenomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovariablenomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoVariableNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVariableNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoVariableNomi tipovariablenomi : tipovariablenomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoVariableNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoVariableNomiConstantesFunciones.generarExcelReporteDataTipoVariableNomi("NORMAL",row,workbook,tipovariablenomi,cellStyleDataAux);
		
			
			


				//VariableNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(VariableNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovariablenomi.getVariableNomis()!=null && tipovariablenomi.getVariableNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(VariableNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					VariableNomiConstantesFunciones.generarExcelReporteHeaderVariableNomi("RELACIONADO",row,workbook);
				}

				if(tipovariablenomi.getVariableNomis()!=null) {
					i2=0;
					for(VariableNomi variablenomi : tipovariablenomi.getVariableNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						VariableNomiConstantesFunciones.generarExcelReporteDataVariableNomi("RELACIONADO",row,workbook,variablenomi,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoVariableNomiConstantesFunciones.getTipoVariableNomiDescripcion(tipovariablenomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoVariableNomi() throws Exception {		
		this.startProcessTipoVariableNomi(true);
	}
	
	public void startProcessTipoVariableNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoVariableNomi, this.jScrollPanelDatosTipoVariableNomi,this.jPanelPaginacionTipoVariableNomi, this.jScrollPanelDatosEdicionTipoVariableNomi, this.jPanelAccionesTipoVariableNomi,this.jPanelAccionesFormularioTipoVariableNomi,this.jmenuBarTipoVariableNomi,this.jmenuBarDetalleTipoVariableNomi,this.jTtoolBarTipoVariableNomi,this.jTtoolBarDetalleTipoVariableNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVariableNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoVariableNomi=this.jPanelParametrosReportesTipoVariableNomi;
		//final JScrollPane jScrollPanelDatosTipoVariableNomi=this.jScrollPanelDatosTipoVariableNomi;
		final JTable jTableDatosTipoVariableNomi=this.jTableDatosTipoVariableNomi;		
		final JPanel jPanelPaginacionTipoVariableNomi=this.jPanelPaginacionTipoVariableNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoVariableNomi=this.jScrollPanelDatosEdicionTipoVariableNomi;
		final JPanel jPanelAccionesTipoVariableNomi=this.jPanelAccionesTipoVariableNomi;
		
		JPanel jPanelCamposAuxiliarTipoVariableNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoVariableNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			jPanelCamposAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jPanelCamposTipoVariableNomi;
			jPanelAccionesFormularioAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jPanelAccionesFormularioTipoVariableNomi;
		}
		
		final JPanel jPanelCamposTipoVariableNomi=jPanelCamposAuxiliarTipoVariableNomi;
		final JPanel jPanelAccionesFormularioTipoVariableNomi=jPanelAccionesFormularioAuxiliarTipoVariableNomi;
		
		
		final JMenuBar jmenuBarTipoVariableNomi=this.jmenuBarTipoVariableNomi;
		final JToolBar jTtoolBarTipoVariableNomi=this.jTtoolBarTipoVariableNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoVariableNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVariableNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			jmenuBarDetalleAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jmenuBarDetalleTipoVariableNomi;
			jTtoolBarDetalleAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jTtoolBarDetalleTipoVariableNomi;
		}
		
		final JMenuBar jmenuBarDetalleTipoVariableNomi=jmenuBarDetalleAuxiliarTipoVariableNomi;
		final JToolBar jTtoolBarDetalleTipoVariableNomi=jTtoolBarDetalleAuxiliarTipoVariableNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVariableNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVariableNomi;
			processRunnable.jTableDatos=jTableDatosTipoVariableNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoVariableNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVariableNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVariableNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVariableNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVariableNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVariableNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoVariableNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVariableNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVariableNomi ,jPanelParametrosReportesTipoVariableNomi,jTableDatosTipoVariableNomi, /*jScrollPanelDatosTipoVariableNomi,*/jPanelCamposTipoVariableNomi,jPanelPaginacionTipoVariableNomi, /*jScrollPanelDatosEdicionTipoVariableNomi,*/ jPanelAccionesTipoVariableNomi,jPanelAccionesFormularioTipoVariableNomi,jmenuBarTipoVariableNomi,jmenuBarDetalleTipoVariableNomi,jTtoolBarTipoVariableNomi,jTtoolBarDetalleTipoVariableNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoVariableNomi, jScrollPanelDatosTipoVariableNomi,jPanelPaginacionTipoVariableNomi, jScrollPanelDatosEdicionTipoVariableNomi, jPanelAccionesTipoVariableNomi,jPanelAccionesFormularioTipoVariableNomi,jmenuBarTipoVariableNomi,jmenuBarDetalleTipoVariableNomi,jTtoolBarTipoVariableNomi,jTtoolBarDetalleTipoVariableNomi);
						
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
	
	public void finishProcessTipoVariableNomi() {// throws Exception 
		this.finishProcessTipoVariableNomi(true);
	}
	
	public void finishProcessTipoVariableNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoVariableNomi, this.jScrollPanelDatosTipoVariableNomi,this.jPanelPaginacionTipoVariableNomi, this.jScrollPanelDatosEdicionTipoVariableNomi, this.jPanelAccionesTipoVariableNomi,this.jPanelAccionesFormularioTipoVariableNomi,this.jmenuBarTipoVariableNomi,this.jmenuBarDetalleTipoVariableNomi,this.jTtoolBarTipoVariableNomi,this.jTtoolBarDetalleTipoVariableNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVariableNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoVariableNomi=this.jPanelParametrosReportesTipoVariableNomi;
		//final JScrollPane jScrollPanelDatosTipoVariableNomi=this.jScrollPanelDatosTipoVariableNomi;
		final JTable jTableDatosTipoVariableNomi=this.jTableDatosTipoVariableNomi;		
		final JPanel jPanelPaginacionTipoVariableNomi=this.jPanelPaginacionTipoVariableNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoVariableNomi=this.jScrollPanelDatosEdicionTipoVariableNomi;
		final JPanel jPanelAccionesTipoVariableNomi=this.jPanelAccionesTipoVariableNomi;
		
		JPanel jPanelCamposAuxiliarTipoVariableNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoVariableNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			jPanelCamposAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jPanelCamposTipoVariableNomi;
			jPanelAccionesFormularioAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jPanelAccionesFormularioTipoVariableNomi;
		}
		
		final JPanel jPanelCamposTipoVariableNomi=jPanelCamposAuxiliarTipoVariableNomi;
		final JPanel jPanelAccionesFormularioTipoVariableNomi=jPanelAccionesFormularioAuxiliarTipoVariableNomi;
		
		
		final JMenuBar jmenuBarTipoVariableNomi=this.jmenuBarTipoVariableNomi;		
		final JToolBar jTtoolBarTipoVariableNomi=this.jTtoolBarTipoVariableNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoVariableNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVariableNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			jmenuBarDetalleAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jmenuBarDetalleTipoVariableNomi;
			jTtoolBarDetalleAuxiliarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jTtoolBarDetalleTipoVariableNomi;		
		}
		
		final JMenuBar jmenuBarDetalleTipoVariableNomi=jmenuBarDetalleAuxiliarTipoVariableNomi;
		final JToolBar jTtoolBarDetalleTipoVariableNomi=jTtoolBarDetalleAuxiliarTipoVariableNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVariableNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVariableNomi;
			processRunnable.jTableDatos=jTableDatosTipoVariableNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoVariableNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVariableNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVariableNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVariableNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVariableNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVariableNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoVariableNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVariableNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoVariableNomi ,jPanelParametrosReportesTipoVariableNomi, jTableDatosTipoVariableNomi,/*jScrollPanelDatosTipoVariableNomi,*/jPanelCamposTipoVariableNomi,jPanelPaginacionTipoVariableNomi, /*jScrollPanelDatosEdicionTipoVariableNomi,*/ jPanelAccionesTipoVariableNomi,jPanelAccionesFormularioTipoVariableNomi,jmenuBarTipoVariableNomi,jmenuBarDetalleTipoVariableNomi,jTtoolBarTipoVariableNomi,jTtoolBarDetalleTipoVariableNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoVariableNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoVariableNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoVariableNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoVariableNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoVariableNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoVariableNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipovariablenomiConstantesFunciones.getsFinalQueryTipoVariableNomi();
		String  finalQueryPaginacionTodos=this.tipovariablenomiConstantesFunciones.getsFinalQueryTipoVariableNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoVariableNomiConstantesFunciones.getArrayColumnasGlobalesNoTipoVariableNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoVariableNomiConstantesFunciones.getArrayColumnasGlobalesTipoVariableNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoVariableNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipovariablenomisEliminados= new ArrayList<TipoVariableNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoVariableNomi();
		
				///*TipoVariableNomiSessionBean*/this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
			
			if(this.tipovariablenomiSessionBean==null) {
				this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
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
					this.iNumeroPaginacion=TipoVariableNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoVariableNomiConstantesFunciones.getClassesForeignKeysOfTipoVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipovariablenomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipovariablenomisAux= new ArrayList<TipoVariableNomi>();
			
				
			tipovariablenomiLogic.setDatosCliente(this.datosCliente);
			tipovariablenomiLogic.setDatosDeep(this.datosDeep);
			tipovariablenomiLogic.setIsConDeep(true);
			
			
			tipovariablenomiLogic.getTipoVariableNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipovariablenomiLogic.getTodosTipoVariableNomis(finalQueryGlobal,pagination);
					
					//tipovariablenomiLogic.getTodosTipoVariableNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipovariablenomiLogic.getTipoVariableNomis()==null|| tipovariablenomiLogic.getTipoVariableNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovariablenomisAux= new ArrayList<TipoVariableNomi>();
							tipovariablenomisAux.addAll(tipovariablenomiLogic.getTipoVariableNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovariablenomisAux= new ArrayList<TipoVariableNomi>();
							tipovariablenomisAux.addAll(tipovariablenomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovariablenomiLogic.getTodosTipoVariableNomis(finalQueryGlobal+"",this.pagination);												
							
							//tipovariablenomiLogic.getTodosTipoVariableNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoVariableNomis("Todos",tipovariablenomiLogic.getTipoVariableNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovariablenomiLogic.setTipoVariableNomis(new ArrayList<TipoVariableNomi>());					
							tipovariablenomiLogic.getTipoVariableNomis().addAll(tipovariablenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovariablenomis=new ArrayList<TipoVariableNomi>();
							tipovariablenomis.addAll(tipovariablenomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoVariableNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoVariableNomi=this.idActual;
				
				} else if(this.idTipoVariableNomiActual!=null && this.idTipoVariableNomiActual!=0L) {
					idTipoVariableNomi=idTipoVariableNomiActual;
				}
				
					
				this.sDetalleReporte=TipoVariableNomiConstantesFunciones.getDetalleIndicePorId(idTipoVariableNomi);
				
				this.tipovariablenomis=new ArrayList<TipoVariableNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipovariablenomiLogic.getEntity(idTipoVariableNomi);
					
					//tipovariablenomiLogic.getEntityWithConnection(idTipoVariableNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovariablenomiLogic.setTipoVariableNomis(new ArrayList<TipoVariableNomi>());
					tipovariablenomiLogic.getTipoVariableNomis().add(tipovariablenomiLogic.getTipoVariableNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovariablenomis=new ArrayList<TipoVariableNomi>();
					this.tipovariablenomis.add(tipovariablenomi);
				}
				
				if(tipovariablenomiLogic.getTipoVariableNomi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoVariableNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoVariableNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovariablenomiLogic.getTipoVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovariablenomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovariablenomiLogic.getTipoVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovariablenomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoVariableNomi tipovariablenomi) {
		Boolean permite=true;
		
		if(this.tipovariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoVariableNomiConstantesFunciones.getOrderByListaTipoVariableNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoVariableNomiConstantesFunciones.getOrderByListaTipoVariableNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVariableNomi tipovariablenomi:tipovariablenomiLogic.getTipoVariableNomis()) {
				if(tipovariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovariablenomiTotales=tipovariablenomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVariableNomi tipovariablenomi:this.tipovariablenomis) {
				if(tipovariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovariablenomiTotales=tipovariablenomi;
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
			this.tipovariablenomiAux=new TipoVariableNomi();
			this.tipovariablenomiAux.setsType(Constantes2.S_TOTALES);
			this.tipovariablenomiAux.setIsNew(false);
			this.tipovariablenomiAux.setIsChanged(false);
			this.tipovariablenomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoVariableNomiConstantesFunciones.TotalizarValoresFilaTipoVariableNomi(this.tipovariablenomiLogic.getTipoVariableNomis(),this.tipovariablenomiAux);
				
				this.tipovariablenomiLogic.getTipoVariableNomis().add(this.tipovariablenomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoVariableNomiConstantesFunciones.TotalizarValoresFilaTipoVariableNomi(this.tipovariablenomis,this.tipovariablenomiAux);
				
				this.tipovariablenomis.add(this.tipovariablenomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipovariablenomiTotales=new TipoVariableNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovariablenomiLogic.getTipoVariableNomis().remove(tipovariablenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovariablenomis.remove(tipovariablenomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipovariablenomiTotales=new TipoVariableNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVariableNomi tipovariablenomi:tipovariablenomiLogic.getTipoVariableNomis()) {
				if(tipovariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovariablenomiTotales=tipovariablenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVariableNomiConstantesFunciones.TotalizarValoresFilaTipoVariableNomi(this.tipovariablenomiLogic.getTipoVariableNomis(),tipovariablenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVariableNomi tipovariablenomi:this.tipovariablenomis) {
				if(tipovariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovariablenomiTotales=tipovariablenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoVariableNomiConstantesFunciones.TotalizarValoresFilaTipoVariableNomi(this.tipovariablenomis,tipovariablenomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoVariableNomi() {
		this.isPermisoTodoTipoVariableNomi=false;
		this.isPermisoNuevoTipoVariableNomi=false;
		this.isPermisoActualizarTipoVariableNomi=false;
		this.isPermisoActualizarOriginalTipoVariableNomi=false;
		this.isPermisoEliminarTipoVariableNomi=false;
		this.isPermisoGuardarCambiosTipoVariableNomi=false;
		this.isPermisoConsultaTipoVariableNomi=false;
		this.isPermisoBusquedaTipoVariableNomi=false;
		this.isPermisoReporteTipoVariableNomi=false;		
		this.isPermisoOrdenTipoVariableNomi=false;		
		this.isPermisoPaginacionMedioTipoVariableNomi=false;		
		this.isPermisoPaginacionAltoTipoVariableNomi=false;
		this.isPermisoPaginacionTodoTipoVariableNomi=false;
		this.isPermisoCopiarTipoVariableNomi=false;		
		this.isPermisoVerFormTipoVariableNomi=false;		
		this.isPermisoDuplicarTipoVariableNomi=false;		
		this.isPermisoOrdenTipoVariableNomi=false;		
	}
	
	public void setPermisosUsuarioTipoVariableNomi(Boolean isPermiso) {
		this.isPermisoTodoTipoVariableNomi=isPermiso;
		this.isPermisoNuevoTipoVariableNomi=isPermiso;
		this.isPermisoActualizarTipoVariableNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoVariableNomi=isPermiso;
		this.isPermisoEliminarTipoVariableNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoVariableNomi=isPermiso;
		this.isPermisoConsultaTipoVariableNomi=isPermiso;
		this.isPermisoBusquedaTipoVariableNomi=isPermiso;
		this.isPermisoReporteTipoVariableNomi=isPermiso;
		this.isPermisoOrdenTipoVariableNomi=isPermiso;		
		this.isPermisoPaginacionMedioTipoVariableNomi=isPermiso;		
		this.isPermisoPaginacionAltoTipoVariableNomi=isPermiso;		
		this.isPermisoPaginacionTodoTipoVariableNomi=isPermiso;		
		this.isPermisoCopiarTipoVariableNomi=isPermiso;		
		this.isPermisoVerFormTipoVariableNomi=isPermiso;		
		this.isPermisoDuplicarTipoVariableNomi=isPermiso;
		this.isPermisoOrdenTipoVariableNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoVariableNomi(Boolean isPermiso) {
		//this.isPermisoTodoTipoVariableNomi=isPermiso;
		this.isPermisoNuevoTipoVariableNomi=isPermiso;
		this.isPermisoActualizarTipoVariableNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoVariableNomi=isPermiso;
		this.isPermisoEliminarTipoVariableNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoVariableNomi=isPermiso;
		//this.isPermisoConsultaTipoVariableNomi=isPermiso;
		//this.isPermisoBusquedaTipoVariableNomi=isPermiso;
		//this.isPermisoReporteTipoVariableNomi=isPermiso;
		//this.isPermisoOrdenTipoVariableNomi=isPermiso;		
		//this.isPermisoPaginacionMedioTipoVariableNomi=isPermiso;		
		//this.isPermisoPaginacionAltoTipoVariableNomi=isPermiso;		
		//this.isPermisoPaginacionTodoTipoVariableNomi=isPermiso;		
		//this.isPermisoCopiarTipoVariableNomi=isPermiso;		
		//this.isPermisoDuplicarTipoVariableNomi=isPermiso;
		//this.isPermisoOrdenTipoVariableNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoVariableNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(VariableNomiConstantesFunciones.SNOMBREOPCION);
		
		if(TipoVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosVariableNomi=false;
		this.isTienePermisosVariableNomi=this.verificarGetPermisosUsuarioOpcionTipoVariableNomiClaseRelacionada(this.opcionsRelacionadas,VariableNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoVariableNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoVariableNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosVariableNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoVariableNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoVariableNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoVariableNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosVariableNomi && this.jInternalFrameDetalleFormTipoVariableNomi!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.remove(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoVariableNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoVariableNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoVariableNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoVariableNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoVariableNomi=this.isPermisoActualizarTipoVariableNomi;
			this.isPermisoEliminarTipoVariableNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoVariableNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoVariableNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoVariableNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoVariableNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoVariableNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVariableNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoVariableNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoVariableNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoVariableNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoVariableNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoVariableNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoVariableNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVariableNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoVariableNomi.setToolTipText(this.jTableDatosTipoVariableNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoVariableNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoVariableNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoVariableNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosVariableNomi && this.tipovariablenomiConstantesFunciones.mostrarVariableNomiTipoVariableNomi && !TipoVariableNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Variable Nomina");
			reporte.setsDescripcion("Variable Nomina");
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
	
		
	public void inicializarCombosForeignKeyTipoVariableNomiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoVariableNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoVariableNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoVariableNomiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoVariableNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoVariableNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoVariableNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoVariableNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoVariableNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVariableNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoVariableNomi(TipoVariableNomi tipovariablenomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoVariableNomi(TipoVariableNomi tipovariablenomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoVariableNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVariableNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoVariableNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoVariableNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoVariableNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoVariableNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoVariableNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoVariableNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoVariableNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoVariableNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoVariableNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean(); 
		this.tipovariablenomiConstantesFunciones=new TipoVariableNomiConstantesFunciones(); 
		this.tipovariablenomiBean=new TipoVariableNomi();//(this.tipovariablenomiConstantesFunciones); 		
		this.tipovariablenomiReturnGeneral=new TipoVariableNomiParameterReturnGeneral(); 
		
		this.tipovariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoVariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoVariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoVariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoVariableNomi(true);
			
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
			
			this.tipovariablenomiConstantesFunciones=new TipoVariableNomiConstantesFunciones(); 
			this.tipovariablenomiBean=new TipoVariableNomi();//this.tipovariablenomiConstantesFunciones); 			
			this.tipovariablenomiReturnGeneral=new TipoVariableNomiParameterReturnGeneral(); 
		
			TipoVariableNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Variable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipovariablenomi=new TipoVariableNomi();
			this.tipovariablenomis = new ArrayList<TipoVariableNomi>();
			this.tipovariablenomisAux = new ArrayList<TipoVariableNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic=new TipoVariableNomiLogic();
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.tipovariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipovariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoVariableNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVariableNomi);	
					}
					
					if(this.jInternalFrameImportacionTipoVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVariableNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoVariableNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVariableNomi);
				this.jInternalFrameDetalleFormTipoVariableNomi.setVisible(false);
				this.jInternalFrameDetalleFormTipoVariableNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVariableNomi);
					this.jInternalFrameReporteDinamicoTipoVariableNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoVariableNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoVariableNomi);
					this.jInternalFrameImportacionTipoVariableNomi.setVisible(false);
					this.jInternalFrameImportacionTipoVariableNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoVariableNomi);
					this.jInternalFrameOrderByTipoVariableNomi.setVisible(false);
					this.jInternalFrameOrderByTipoVariableNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoVariableNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoVariableNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipovariablenomiReturnGeneral=new TipoVariableNomiParameterReturnGeneral();
			
			this.tipovariablenomiParameterGeneral=new TipoVariableNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipovariablenomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(VariableNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVariableNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovariablenomiSessionBean.getEsGuardarRelacionado(),this.tipovariablenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoVariableNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovariablenomiSessionBean.getEsGuardarRelacionado(),this.tipovariablenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
			this.isVisibilidadCeldaDuplicarTipoVariableNomi=true;
			this.isVisibilidadCeldaCopiarTipoVariableNomi=true;
			this.isVisibilidadCeldaVerFormTipoVariableNomi=true;
			this.isVisibilidadCeldaOrdenTipoVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoVariableNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoVariableNomi(false);
			
			this.setPermisosUsuarioTipoVariableNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado() 
				|| (this.tipovariablenomiSessionBean.getEsGuardarRelacionado() && this.tipovariablenomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoVariableNomiClasesRelacionadas();
			}
			
			if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoVariableNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoVariableNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoVariableNomi();
			}
			
			if(!this.isPermisoBusquedaTipoVariableNomi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoVariableNomi,this.isPermisoPaginacionMedioTipoVariableNomi,this.isPermisoPaginacionTodoTipoVariableNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoVariableNomiConstantesFunciones.getTiposSeleccionarTipoVariableNomi());
				
				this.tiposColumnasSelect=TipoVariableNomiConstantesFunciones.getTiposSeleccionarTipoVariableNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoVariableNomi();				
				//this.tiposRelacionesSelect=TipoVariableNomiConstantesFunciones.getTiposRelacionesTipoVariableNomi(true);
				
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
			//if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoVariableNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoVariableNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoVariableNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVariableNomi() ;
			
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
			
			
			this.variablenomiLogic=new VariableNomiLogic(); 
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
				tipovariablenomiImplementable= (TipoVariableNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVariableNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipovariablenomiImplementableHome= (TipoVariableNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoVariableNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipovariablenomis= new ArrayList<TipoVariableNomi>();
			this.tipovariablenomisEliminados= new ArrayList<TipoVariableNomi>();
						
			this.isEsNuevoTipoVariableNomi=false;
			this.esParaAccionDesdeFormularioTipoVariableNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoVariableNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoVariableNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoVariableNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoVariableNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoVariableNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoVariableNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoVariableNomi();
			}
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoVariableNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoVariableNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoVariableNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(VariableNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoVariableNomi")) {
				iIndex=this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Variable Nominas")) {
					if(!VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoVariableNomi();

						this.cargarParteTabPanelRelacionadaVariableNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoVariableNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaVariableNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoVariableNomi.cargarSessionConBeanSwingJInternalFrameVariableNomi(false,true,iIndex);
		this.jButtonVariableNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVariableNomi();

		//this.jTabbedPaneRelacionesTipoVariableNomi.updateUI();
		//this.jTabbedPaneRelacionesTipoVariableNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoVariableNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("VariableNomi")) {
				int row=this.jTableDatosTipoVariableNomi.getSelectedRow();
				jButtonVariableNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Variable Nomina")) {

					if(this.isTienePermisosVariableNomi && this.tipovariablenomiConstantesFunciones.mostrarVariableNomiTipoVariableNomi && !TipoVariableNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Variable Nominas"+"("+VariableNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Variable Nominas");

						if(tipovariablenomiConstantesFunciones.resaltarVariableNomiTipoVariableNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipovariablenomiConstantesFunciones.resaltarVariableNomiTipoVariableNomi);
						}

						jmenuItem.setEnabled(this.tipovariablenomiConstantesFunciones.activarVariableNomiTipoVariableNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VariableNomi"));

						

						this.jInternalFrameDetalleFormTipoVariableNomi.jmenuDetalleTipoVariableNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoVariableNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoVariableNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoVariableNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoVariableNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoVariableNomi();
		
		this.cargarCombosFrameForeignKeyTipoVariableNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoVariableNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoVariableNomi();
		}
	}
	
	
	
	public void jButtonNuevoTipoVariableNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
			
			if(jTableDatosTipoVariableNomi.getRowCount()>=1) {
				jTableDatosTipoVariableNomi.removeRowSelectionInterval(0, jTableDatosTipoVariableNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoVariableNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoVariableNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoVariableNomi(true);			
			//this.tipovariablenomi=new TipoVariableNomi();
			//this.tipovariablenomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVariableNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVariableNomi() ;
			
			if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVariableNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipovariablenomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);				
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
			if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoVariableNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoVariableNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoVariableNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoVariableNomi.getSelectedRows().length;			
			}
			
			tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoVariableNomi--;			
				//TipoVariableNomi tipovariablenomiAux= new TipoVariableNomi();			
				//tipovariablenomiAux.setId(this.iIdNuevoTipoVariableNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoVariableNomi tipovariablenomiOrigen=new TipoVariableNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoVariableNomi tipovariablenomiOrigen : tipovariablenomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipovariablenomiOrigen =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovariablenomiOrigen =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoVariableNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipovariablenomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoVariableNomi(tipovariablenomiOrigen,this.tipovariablenomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovariablenomiLogic.getTipoVariableNomis().add(this.tipovariablenomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovariablenomis.add(this.tipovariablenomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoVariableNomi(false);
				
				this.jTableDatosTipoVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoVariableNomi(), this.getIndiceNuevoTipoVariableNomi());
				
				int iLastRow =  this.jTableDatosTipoVariableNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVariableNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVariableNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVariableNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();									
		
			TipoVariableNomi tipovariablenomiOrigen=new TipoVariableNomi();
			TipoVariableNomi tipovariablenomiDestino=new TipoVariableNomi();
				
			tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoVariableNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipovariablenomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoVariableNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovariablenomiOrigen =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovariablenomiOrigen =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovariablenomiDestino =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovariablenomiDestino =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipovariablenomiOrigen =tipovariablenomisSeleccionados.get(0);
				tipovariablenomiDestino =tipovariablenomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoVariableNomi(tipovariablenomiOrigen,tipovariablenomiDestino,true,false);
				
				tipovariablenomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovariablenomiDestino,tipovariablenomiLogic.getTipoVariableNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovariablenomiDestino,tipovariablenomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoVariableNomi(false);
				
				//this.jTableDatosTipoVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoVariableNomi(), this.getIndiceNuevoTipoVariableNomi());
				
				int iLastRow =  this.jTableDatosTipoVariableNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVariableNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVariableNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVariableNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoVariableNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoVariableNomi.isVisible();
			
			
			this.jPanelParametrosReportesTipoVariableNomi.setVisible(!isVisible);
			this.jPanelPaginacionTipoVariableNomi.setVisible(!isVisible);
			this.jPanelAccionesTipoVariableNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoVariableNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoVariableNomi();
			
			this.abrirFrameOrderByTipoVariableNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoVariableNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVariableNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoVariableNomi.isMaximum()) {
					this.jInternalFrameDetalleFormTipoVariableNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoVariableNomi.setSize(this.jInternalFrameDetalleFormTipoVariableNomi.iWidthFormulario,this.jInternalFrameDetalleFormTipoVariableNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoVariableNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoVariableNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoVariableNomi.isMaximum()) {
						this.jInternalFrameDetalleFormTipoVariableNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoVariableNomi.jContentPaneDetalleTipoVariableNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoVariableNomi.jContentPaneDetalleTipoVariableNomi.getWidth(),TipoVariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoVariableNomi.jContentPaneDetalleTipoVariableNomi.getWidth(),TipoVariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoVariableNomi.jContentPaneDetalleTipoVariableNomi.getWidth(),TipoVariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVariableNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoVariableNomi.setVisible(true);
	        this.jInternalFrameDetalleFormTipoVariableNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoVariableNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoVariableNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVariableNomi,false,this);
				} else {
					this.jInternalFrameOrderByTipoVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVariableNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoVariableNomi);
				this.jInternalFrameOrderByTipoVariableNomi.setVisible(false);
				this.jInternalFrameOrderByTipoVariableNomi.setSelected(false);
				
				this.jInternalFrameOrderByTipoVariableNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVariableNomi"));
				
				this.inicializarActualizarBindingTablaOrderByTipoVariableNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoVariableNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoVariableNomi==null) {
				
				this.jInternalFrameImportacionTipoVariableNomi=new ImportacionJInternalFrame(TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVariableNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoVariableNomi);
				this.jInternalFrameImportacionTipoVariableNomi.setVisible(false);
				this.jInternalFrameImportacionTipoVariableNomi.setSelected(false);


				this.jInternalFrameImportacionTipoVariableNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVariableNomi"));
				this.jInternalFrameImportacionTipoVariableNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVariableNomi"));
				this.jInternalFrameImportacionTipoVariableNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVariableNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoVariableNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoVariableNomi==null) {
				this.jInternalFrameReporteDinamicoTipoVariableNomi=new ReporteDinamicoJInternalFrame(TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVariableNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVariableNomi);
				this.jInternalFrameReporteDinamicoTipoVariableNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoVariableNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVariableNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVariableNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaVariableNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoVariableNomi.jContentPaneDetalleTipoVariableNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoVariableNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVariableNomi);
			
	       	this.jInternalFrameDetalleFormTipoVariableNomi.setVisible(false);
	        this.jInternalFrameDetalleFormTipoVariableNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoVariableNomi.dispose();
			//this.jInternalFrameDetalleFormTipoVariableNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoVariableNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoVariableNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoVariableNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoVariableNomi.setVisible(true);
	        this.jInternalFrameImportacionTipoVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoVariableNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoVariableNomi.setVisible(true);
	        this.jInternalFrameOrderByTipoVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoVariableNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoVariableNomi.setVisible(false);
	        this.jInternalFrameOrderByTipoVariableNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoVariableNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoVariableNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoVariableNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoVariableNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoVariableNomi.setVisible(false);
	        this.jInternalFrameImportacionTipoVariableNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoVariableNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoVariableNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoVariableNomi(true);
			//this.isEsNuevoTipoVariableNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVariableNomi(false) ;
			
			if(tipovariablenomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getEsGuardarRelacionado() && VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVariableNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVariableNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVariableNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoVariableNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoVariableNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoVariableNomi(true);
			//this.isEsNuevoTipoVariableNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipovariablenomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoVariableNomi(false) ;
			
			if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVariableNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVariableNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoVariableNomi(false);
			
			//if(!this.isEsNuevoTipoVariableNomi) {								
				int intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
				
			}
			
			if(this.permiteMantenimiento(this.tipovariablenomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoVariableNomi=true;
					this.inicializarActualizarBindingTablaTipoVariableNomi(false);
					this.isEsNuevoTipoVariableNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoVariableNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoVariableNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVariableNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVariableNomi(false);
				
				this.habilitarDeshabilitarControlesTipoVariableNomi(false);
			
												
				
				if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoVariableNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoVariableNomiActionPerformed(evt,tipovariablenomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoVariableNomi(this.tipovariablenomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoVariableNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipovariablenomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipovariablenomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				this.tipovariablenomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				this.tipovariablenomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipovariablenomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoVariableNomiModel) this.jTableDatosTipoVariableNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoVariableNomi=true;
				this.inicializarActualizarBindingTablaTipoVariableNomi(false);
				this.isEsNuevoTipoVariableNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVariableNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVariableNomi(false);
				
				this.habilitarDeshabilitarControlesTipoVariableNomi(false);
				
				
				
				if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoVariableNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoVariableNomi.getRowCount()>=1) {
				jTableDatosTipoVariableNomi.removeRowSelectionInterval(0, jTableDatosTipoVariableNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoVariableNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoVariableNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVariableNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVariableNomi(false) ;
			
			this.isEsNuevoTipoVariableNomi=false;
			
			if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoVariableNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoVariableNomi(false);
				
				//SI ES MANUAL
				if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoVariableNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoVariableNomi--;			
			//TipoVariableNomi tipovariablenomiAux= new TipoVariableNomi();			
			//tipovariablenomiAux.setId(this.iIdNuevoTipoVariableNomi);
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoVariableNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
			
			this.tipovariablenomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipovariablenomiLogic.getTipoVariableNomis().add(this.tipovariablenomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipovariablenomis.add(this.tipovariablenomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoVariableNomi(false);
			
			this.jTableDatosTipoVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoVariableNomi(), this.getIndiceNuevoTipoVariableNomi());
			
			int iLastRow =  this.jTableDatosTipoVariableNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoVariableNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoVariableNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoVariableNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoVariableNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVariableNomi();
			}
			
			//this.abrirFrameTreeTipoVariableNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo VariableS ?", "MANTENIMIENTO DE Tipo Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoVariableNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoVariableNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipovariablenomiReturnGeneral=tipovariablenomiLogic.procesarImportacionTipoVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipovariablenomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoVariableNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoVariableNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoVariableNomi.setFileImportacion(this.jInternalFrameImportacionTipoVariableNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoVariableNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoVariableNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoVariableNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoVariableNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		

		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoVariableNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoVariableNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoVariableNomis("Todos",tipovariablenomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVariableNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoVariableNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoVariableNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoVariableNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoVariableNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoVariableNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoVariableNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoVariableNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoVariableNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovariablenomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoVariableNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoVariableNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoVariableNomi tipovariablenomi:tipovariablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovariablenomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoVariableNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoVariableNomi tipovariablenomi:tipovariablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovariablenomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoVariableNomi(row);				
			//	iRow++;
			//}				
			
			//for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoVariableNomi(tipovariablenomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVariableNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVariableNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVariableNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoVariableNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoVariableNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoVariableNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoVariableNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoVariableNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoVariableNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoVariableNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoVariableNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoVariableNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoVariableNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoVariableNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoVariableNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoVariableNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoVariableNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVariableNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoVariableNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoVariableNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoVariableNomi();
		
		this.inicializarActualizarBindingBotonesManualTipoVariableNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVariableNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVariableNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVariableNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVariableNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoVariableNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoVariableNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoVariableNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoVariableNomi.jCheckBoxPostAccionNuevoTipoVariableNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoVariableNomi.jCheckBoxPostAccionSinCerrarTipoVariableNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoVariableNomi.jCheckBoxPostAccionSinMensajeTipoVariableNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoVariableNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoVariableNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoVariableNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
				this.jInternalFrameDetalleFormTipoVariableNomi.jCheckBoxPostAccionNuevoTipoVariableNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoVariableNomi.jCheckBoxPostAccionSinCerrarTipoVariableNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoVariableNomi.jCheckBoxPostAccionSinMensajeTipoVariableNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoVariableNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoVariableNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoVariableNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoVariableNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoVariableNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoVariableNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoVariableNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoVariableNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoVariableNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoVariableNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVariableNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoVariableNomi() throws Exception {
		try	{
			if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVariableNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVariableNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVariableNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoVariableNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoVariableNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoVariableNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoVariableNomi.addItem(reporte);
			}
			
			
			if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoVariableNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoVariableNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoVariableNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoVariableNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoVariableNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoVariableNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVariableNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVariableNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVariableNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVariableNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoVariableNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoVariableNomi(Boolean esInicializar) throws Exception {				
		if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVariableNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoVariableNomi() throws Exception {
		this.inicializarActualizarBindingTablaTipoVariableNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoVariableNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoVariableNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoVariableNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoVariableNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVariableNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoVariableNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoVariableNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoVariableNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipovariablenomiLogic.getTipoVariableNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipovariablenomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoVariableNomi.setModel(new TipoVariableNomiModel(this.tipovariablenomiLogic.getTipoVariableNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoVariableNomi.setModel(new TipoVariableNomiModel(this.tipovariablenomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoVariableNomi!=null && this.jInternalFrameOrderByTipoVariableNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoVariableNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVariableNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoVariableNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO,tipovariablenomiConstantesFunciones.resaltarSeleccionarTipoVariableNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoVariableNomiConstantesFunciones.SCLASSWEBTITULO,tipovariablenomiConstantesFunciones.resaltarSeleccionarTipoVariableNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVariableNomi,TipoVariableNomiConstantesFunciones.LABEL_ID));

		if(this.tipovariablenomiConstantesFunciones.mostraridTipoVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVariableNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipovariablenomiConstantesFunciones.resaltaridTipoVariableNomi,this.tipovariablenomiConstantesFunciones.activaridTipoVariableNomi,this,true,"idTipoVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovariablenomiConstantesFunciones.resaltaridTipoVariableNomi,this.tipovariablenomiConstantesFunciones.activaridTipoVariableNomi,this,true,"idTipoVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVariableNomi,TipoVariableNomiConstantesFunciones.LABEL_CODIGO));

		if(this.tipovariablenomiConstantesFunciones.mostrarcodigoTipoVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVariableNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovariablenomiConstantesFunciones.resaltarcodigoTipoVariableNomi,this.tipovariablenomiConstantesFunciones.activarcodigoTipoVariableNomi,this,true,"codigoTipoVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovariablenomiConstantesFunciones.resaltarcodigoTipoVariableNomi,this.tipovariablenomiConstantesFunciones.activarcodigoTipoVariableNomi,this,true,"codigoTipoVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVariableNomi,TipoVariableNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.tipovariablenomiConstantesFunciones.mostrarnombreTipoVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoVariableNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovariablenomiConstantesFunciones.resaltarnombreTipoVariableNomi,this.tipovariablenomiConstantesFunciones.activarnombreTipoVariableNomi,this,true,"nombreTipoVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovariablenomiConstantesFunciones.resaltarnombreTipoVariableNomi,this.tipovariablenomiConstantesFunciones.activarnombreTipoVariableNomi,this,true,"nombreTipoVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoVariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosVariableNomi && this.tipovariablenomiConstantesFunciones.mostrarVariableNomiTipoVariableNomi && !TipoVariableNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Variable Nominas");
				tableColumn.setHeaderValue("Variable Nominas");
				tableColumn.setCellRenderer(new VariableNomiTableCell(tipovariablenomiConstantesFunciones.resaltarVariableNomiTipoVariableNomi,this,this.tipovariablenomiConstantesFunciones.activarVariableNomiTipoVariableNomi));
				tableColumn.setCellEditor(new VariableNomiTableCell(tipovariablenomiConstantesFunciones.resaltarVariableNomiTipoVariableNomi,this,this.tipovariablenomiConstantesFunciones.activarVariableNomiTipoVariableNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoVariableNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovariablenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovariablenomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVariableNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovariablenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovariablenomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVariableNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipovariablenomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipovariablenomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoVariableNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoVariableNomi.addColumn(tableColumn);
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
			
			this.jTableDatosTipoVariableNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoVariableNomi.moveColumn(this.jTableDatosTipoVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoVariableNomi.moveColumn(this.jTableDatosTipoVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoVariableNomi.moveColumn(this.jTableDatosTipoVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoVariableNomi.moveColumn(this.jTableDatosTipoVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoVariableNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoVariableNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoVariableNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoVariableNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoVariableNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoVariableNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoVariableNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoVariableNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipovariablenomiLogic.getTipoVariableNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipovariablenomis.size()-1;
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
		//this.jTableDatosTipoVariableNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoVariableNomi();
			
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
				
				//this.isEsNuevoTipoVariableNomi=false;
					
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
				if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoVariableNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVariableNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVariableNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipovariablenomi.getsType().equals("DUPLICADO")
				   || this.tipovariablenomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoVariableNomi=true;
				
				} else {
					this.isEsNuevoTipoVariableNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
					if(this.tipovariablenomi.getId()>=0 && !this.tipovariablenomi.getIsNew()) {						
						this.isEsNuevoTipoVariableNomi=false;
						
					} else {
						this.isEsNuevoTipoVariableNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoVariableNomi(esRelaciones);						
				
				this.seleccionarTipoVariableNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipovariablenomi.getId()<0) {
					this.isEsNuevoTipoVariableNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoVariableNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoVariableNomi(evt,rowIndex);
				}	
				
				if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoVariableNomi: " + this.dDif); 
					}
				}								
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoVariableNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipovariablenomi)) {
					if(this.tipovariablenomi.getId()>0) {
						this.tipovariablenomi.setIsDeleted(true);
						
						this.tipovariablenomisEliminados.add(this.tipovariablenomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovariablenomiLogic.getTipoVariableNomis().remove(this.tipovariablenomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovariablenomis.remove(this.tipovariablenomi);				
					}
					
					
					((TipoVariableNomiModel) this.jTableDatosTipoVariableNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVariableNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoVariableNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoVariableNomi) {
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVariableNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVariableNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoVariableNomi(this.tipovariablenomi);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoVariableNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoVariableNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVariableNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVariableNomi(TipoVariableNomi tipovariablenomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoVariableNomi(tipovariablenomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVariableNomi(TipoVariableNomi tipovariablenomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoVariableNomi(tipovariablenomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoVariableNomi(tipovariablenomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoVariableNomi(tipovariablenomi);
	}
	
	public void setVariablesObjetoActualToFormularioTipoVariableNomi(TipoVariableNomi tipovariablenomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.setText(tipovariablenomi.getId().toString());
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.setText(tipovariablenomi.getcodigo());
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.setText(tipovariablenomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoVariableNomi tipovariablenomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipovariablenomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoVariableNomi tipovariablenomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipovariablenomiLocal=this.tipovariablenomi;
			} else {
				tipovariablenomiLocal=this.tipovariablenomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipovariablenomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoVariableNomi(tipovariablenomiLocal,true);
					
					if(tipovariablenomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipovariablenomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipovariablenomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoVariableNomi(TipoVariableNomi tipovariablenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVariableNomi(tipovariablenomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(tipovariablenomi);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVariableNomi(TipoVariableNomi tipovariablenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVariableNomi(tipovariablenomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVariableNomi(TipoVariableNomi tipovariablenomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.getText()==null || this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.getText()=="" || this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.setText("0");
			}

			if(conColumnasBase) {tipovariablenomi.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVariableNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVariableNomi.jLabelIdTipoVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovariablenomi.setcodigo(this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVariableNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVariableNomi.jLabelcodigoTipoVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovariablenomi.setnombre(this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoVariableNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVariableNomi.jLabelnombreTipoVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVariableNomi(TipoVariableNomi tipovariablenomiBean,TipoVariableNomi tipovariablenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoVariableNomi(TipoVariableNomi tipovariablenomiOrigen,TipoVariableNomi tipovariablenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovariablenomiOrigen.getId()!=null && !tipovariablenomiOrigen.getId().equals(0L))) {tipovariablenomi.setId(tipovariablenomiOrigen.getId());}}
			if(conDefault || (!conDefault && tipovariablenomiOrigen.getcodigo()!=null && !tipovariablenomiOrigen.getcodigo().equals(""))) {tipovariablenomi.setcodigo(tipovariablenomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipovariablenomiOrigen.getnombre()!=null && !tipovariablenomiOrigen.getnombre().equals(""))) {tipovariablenomi.setnombre(tipovariablenomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVariableNomi(TipoVariableNomi tipovariablenomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.setText(tipovariablenomi.getId().toString());
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.setText(tipovariablenomi.getcodigo());
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.setText(tipovariablenomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVariableNomi(TipoVariableNomiBean tipovariablenomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.setText(tipovariablenomiBean.getId().toString());
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.setText(tipovariablenomiBean.getcodigo());
			this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.setText(tipovariablenomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoVariableNomi(TipoVariableNomiParameterReturnGeneral tipovariablenomiReturnGeneral,TipoVariableNomiBean tipovariablenomiBean,Boolean conDefault) throws Exception { 
		try {
			TipoVariableNomi tipovariablenomiLocal=new TipoVariableNomi();
			
			tipovariablenomiLocal=tipovariablenomiReturnGeneral.getTipoVariableNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovariablenomiLocal.getId()!=null && !tipovariablenomiLocal.getId().equals(0L))) {tipovariablenomiBean.setId(tipovariablenomiLocal.getId());}}
			if(conDefault || (!conDefault && tipovariablenomiLocal.getcodigo()!=null && !tipovariablenomiLocal.getcodigo().equals(""))) {tipovariablenomiBean.setcodigo(tipovariablenomiLocal.getcodigo());}
			if(conDefault || (!conDefault && tipovariablenomiLocal.getnombre()!=null && !tipovariablenomiLocal.getnombre().equals(""))) {tipovariablenomiBean.setnombre(tipovariablenomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoVariableNomiGenerico(Long idTipoVariableNomiSeleccionado,JComboBox jComboBoxTipoVariableNomi,List<TipoVariableNomi> tipovariablenomisLocal)throws Exception {
		try {
			TipoVariableNomi  tipovariablenomiTemp=null;

			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisLocal) {
				if(tipovariablenomiAux.getId()!=null && tipovariablenomiAux.getId().equals(idTipoVariableNomiSeleccionado)) {
					tipovariablenomiTemp=tipovariablenomiAux;
					break;
				}
			}

			jComboBoxTipoVariableNomi.setSelectedItem(tipovariablenomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoVariableNomiGenerico(JComboBox jComboBoxTipoVariableNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVariableNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoVariableNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVariableNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoVariableNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("VariableNomi")) {
			jButtonVariableNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovariablenomi=(TipoVariableNomi) tipovariablenomiLogic.getTipoVariableNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovariablenomi =(TipoVariableNomi) tipovariablenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoVariableNomi tipovariablenomiRow=new TipoVariableNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovariablenomiRow=(TipoVariableNomi) tipovariablenomiLogic.getTipoVariableNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovariablenomiRow=(TipoVariableNomi) tipovariablenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonVariableNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoVariableNomi tipovariablenomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoVariableNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovariablenomi = (TipoVariableNomi)this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovariablenomi = (TipoVariableNomi)this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovariablenomi!=null) {
						this.tipovariablenomi = tipovariablenomi;
					} else {
						this.tipovariablenomi = new TipoVariableNomi();
					}
				}

				if(this.isTienePermisosVariableNomi && this.permiteMantenimiento(this.tipovariablenomi)) {
					VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFramePopup=new VariableNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						variablenomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFramePopup;
					} else {
						variablenomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame;
					}

					List<TipoVariableNomi> tipovariablenomis=new ArrayList<TipoVariableNomi>();
					tipovariablenomis.add(this.tipovariablenomi);
					if(!esRelacionado) {
						//variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setConGuardarRelaciones(false);
						//variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					variablenomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoVariableNomi.cargarVariableNomiBeanSwingJInternalFrame(tipovariablenomis,this.tipovariablenomi,variablenomiBeanSwingJInternalFrame,/*conInicializar,*/variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getConGuardarRelaciones(),variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getEsGuardarRelacionado());
					variablenomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						variablenomiBeanSwingJInternalFrame.actualizarEstadoPanelsVariableNomi("no_relacionado");

						variablenomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(VariableNomiConstantesFunciones.ITAMANIOFILATABLA + (VariableNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						variablenomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoVariableNomi=(TitledBorder)this.jScrollPanelDatosTipoVariableNomi.getBorder();
						TitledBorder titledBorderVariableNomi=(TitledBorder)variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.getBorder();

						titledBorderVariableNomi.setTitle(titledBorderTipoVariableNomi.getTitle() + " -> Variable Nomina");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,variablenomiBeanSwingJInternalFrame);
						}

						variablenomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(variablenomiBeanSwingJInternalFrame);

						variablenomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Variable Nomina",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoVariableNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi));			
			this.jButtonDuplicarTipoVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoVariableNomi && this.isPermisoDuplicarTipoVariableNomi));			
			this.jButtonCopiarTipoVariableNomi.setVisible((this.isVisibilidadCeldaCopiarTipoVariableNomi && this.isPermisoCopiarTipoVariableNomi));
			this.jButtonVerFormTipoVariableNomi.setVisible((this.isVisibilidadCeldaVerFormTipoVariableNomi && this.isPermisoVerFormTipoVariableNomi));
			
			this.jButtonAbrirOrderByTipoVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoVariableNomi && this.isPermisoOrdenTipoVariableNomi));			
			
			this.jButtonNuevoRelacionesTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi));			
			this.jButtonNuevoGuardarCambiosTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarTipoVariableNomi.setVisible((this.isVisibilidadCeldaModificarTipoVariableNomi && this.isPermisoActualizarTipoVariableNomi));	
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarTipoVariableNomi.setVisible((this.isVisibilidadCeldaActualizarTipoVariableNomi && this.isPermisoActualizarTipoVariableNomi));	
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarTipoVariableNomi.setVisible((this.isVisibilidadCeldaEliminarTipoVariableNomi && this.isPermisoEliminarTipoVariableNomi));
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarTipoVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoVariableNomi);							
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi));						
			this.jButtonDuplicarToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoVariableNomi && this.isPermisoDuplicarTipoVariableNomi));						
			this.jButtonCopiarToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaCopiarTipoVariableNomi && this.isPermisoCopiarTipoVariableNomi));			
			this.jButtonVerFormToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaVerFormTipoVariableNomi && this.isPermisoVerFormTipoVariableNomi));			
			this.jButtonAbrirOrderByToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoVariableNomi && this.isPermisoOrdenTipoVariableNomi));
			this.jButtonNuevoRelacionesToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi));			
			this.jButtonNuevoGuardarCambiosToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));			
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaModificarTipoVariableNomi && this.isPermisoActualizarTipoVariableNomi));	
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaActualizarTipoVariableNomi  && this.isPermisoActualizarTipoVariableNomi));	
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaEliminarTipoVariableNomi && this.isPermisoEliminarTipoVariableNomi));
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarToolBarTipoVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoVariableNomi);				
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi));			
			this.jMenuItemDuplicarTipoVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoVariableNomi && this.isPermisoDuplicarTipoVariableNomi));			
			this.jMenuItemCopiarTipoVariableNomi.setVisible((this.isVisibilidadCeldaCopiarTipoVariableNomi && this.isPermisoCopiarTipoVariableNomi));			
			this.jMenuItemVerFormTipoVariableNomi.setVisible((this.isVisibilidadCeldaVerFormTipoVariableNomi && this.isPermisoVerFormTipoVariableNomi));			
			this.jMenuItemAbrirOrderByTipoVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoVariableNomi && this.isPermisoOrdenTipoVariableNomi));			
			//this.jMenuItemMostrarOcultarTipoVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoVariableNomi && this.isPermisoOrdenTipoVariableNomi));
			this.jMenuItemDetalleAbrirOrderByTipoVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoVariableNomi && this.isPermisoOrdenTipoVariableNomi));			
			//this.jMenuItemDetalleMostrarOcultarTipoVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoVariableNomi && this.isPermisoOrdenTipoVariableNomi));			
			this.jMenuItemNuevoRelacionesTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi));			
			this.jMenuItemNuevoGuardarCambiosTipoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoVariableNomi && this.isPermisoNuevoTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));									
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemModificarTipoVariableNomi.setVisible((this.isVisibilidadCeldaModificarTipoVariableNomi && this.isPermisoActualizarTipoVariableNomi));	
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemActualizarTipoVariableNomi.setVisible((this.isVisibilidadCeldaActualizarTipoVariableNomi && this.isPermisoActualizarTipoVariableNomi));	
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemEliminarTipoVariableNomi.setVisible((this.isVisibilidadCeldaEliminarTipoVariableNomi && this.isPermisoEliminarTipoVariableNomi));
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemCancelarTipoVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoVariableNomi);				
			}
			
			this.jMenuItemGuardarCambiosTipoVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));						
			this.jMenuItemGuardarCambiosTablaTipoVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=this.jButtonNuevoTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaDuplicarTipoVariableNomi=this.jButtonDuplicarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaCopiarTipoVariableNomi=this.jButtonCopiarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaVerFormTipoVariableNomi=this.jButtonVerFormTipoVariableNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoVariableNomi=this.jButtonAbrirOrderByTipoVariableNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=this.jButtonNuevoRelacionesTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaModificarTipoVariableNomi=this.jButtonModificarTipoVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.isVisibilidadCeldaActualizarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=this.jButtonGuardarCambiosTablaTipoVariableNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoVariableNomi=this.jButtonNuevoToolBarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=this.jButtonNuevoRelacionesToolBarTipoVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.isVisibilidadCeldaModificarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarToolBarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarToolBarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarToolBarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarToolBarTipoVariableNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVariableNomi=this.jButtonGuardarCambiosToolBarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=this.jButtonGuardarCambiosTablaToolBarTipoVariableNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoVariableNomi=this.jMenuItemNuevoTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=this.jMenuItemNuevoRelacionesTipoVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.isVisibilidadCeldaModificarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemModificarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemActualizarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemEliminarTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemCancelarTipoVariableNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVariableNomi=this.jMenuItemGuardarCambiosTipoVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=this.jMenuItemGuardarCambiosTablaTipoVariableNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoVariableNomi(Boolean esInicializar) {
		if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
				//if(this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVariableNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoVariableNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoVariableNomi() {
		this.jButtonNuevoTipoVariableNomi.setVisible(this.isPermisoNuevoTipoVariableNomi);			
		this.jButtonDuplicarTipoVariableNomi.setVisible(this.isPermisoDuplicarTipoVariableNomi);			
		this.jButtonCopiarTipoVariableNomi.setVisible(this.isPermisoCopiarTipoVariableNomi);			
		this.jButtonVerFormTipoVariableNomi.setVisible(this.isPermisoVerFormTipoVariableNomi);			
		
		this.jButtonAbrirOrderByTipoVariableNomi.setVisible(this.isPermisoOrdenTipoVariableNomi);					
		
		this.jButtonNuevoRelacionesTipoVariableNomi.setVisible(this.isPermisoNuevoTipoVariableNomi);			
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarTipoVariableNomi.setVisible(this.isPermisoActualizarTipoVariableNomi);	
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarTipoVariableNomi.setVisible(this.isPermisoActualizarTipoVariableNomi);	
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarTipoVariableNomi.setVisible(this.isPermisoEliminarTipoVariableNomi);
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarTipoVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoVariableNomi);						
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.setVisible(this.isPermisoGuardarCambiosTipoVariableNomi);							
		}
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi.setVisible(this.isPermisoActualizarTipoVariableNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVariableNomi() {
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarTipoVariableNomi.setVisible(this.isPermisoActualizarTipoVariableNomi);	
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarTipoVariableNomi.setVisible(this.isPermisoActualizarTipoVariableNomi);	
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarTipoVariableNomi.setVisible(this.isPermisoEliminarTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarTipoVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoVariableNomi);							
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoVariableNomi && this.isPermisoGuardarCambiosTipoVariableNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoVariableNomi() {
		if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoVariableNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoVariableNomi() {
	}
	
	public void jTableDatosTipoVariableNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoVariableNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.gettipovariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovariablenomi==null) {
						this.tipovariablenomi = new TipoVariableNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
				}

				if(this.tipovariablenomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipovariablenomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.gettipovariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovariablenomi==null) {
						this.tipovariablenomi = new TipoVariableNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
				}

				if(this.tipovariablenomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipovariablenomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.gettipovariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovariablenomi==null) {
						this.tipovariablenomi = new TipoVariableNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);
				}

				if(this.tipovariablenomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipovariablenomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoVariableNomi() {
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
		

		if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoVariableNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoVariableNomi.dispose();
			this.jInternalFrameDetalleFormTipoVariableNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
			this.jInternalFrameReporteDinamicoTipoVariableNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoVariableNomi.dispose();
			this.jInternalFrameReporteDinamicoTipoVariableNomi=null;
		}
		
		if(this.jInternalFrameImportacionTipoVariableNomi!=null) {
			this.jInternalFrameImportacionTipoVariableNomi.setVisible(false);	    			
			this.jInternalFrameImportacionTipoVariableNomi.dispose();
			this.jInternalFrameImportacionTipoVariableNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoVariableNomi();
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoVariableNomi")) {
				jButtonDuplicarTipoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoVariableNomi")) {
				jButtonCopiarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoVariableNomi")) {
				jButtonVerFormTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoVariableNomi")) {
				jButtonDuplicarTipoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoVariableNomi")) {
				jButtonDuplicarTipoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoVariableNomi")) {
				jButtonModificarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoVariableNomi")) {
				jButtonModificarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoVariableNomi")) {
				jButtonModificarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoVariableNomi")) {
				jButtonActualizarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoVariableNomi")) {
				jButtonActualizarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoVariableNomi")) {
				jButtonActualizarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoVariableNomi")) {
				jButtonEliminarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoVariableNomi")) {
				jButtonEliminarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoVariableNomi")) {
				jButtonEliminarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoVariableNomi")) {
				jButtonCancelarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoVariableNomi")) {
				jButtonCancelarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoVariableNomi")) {
				jButtonCancelarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoVariableNomi")) {
				jButtonCerrarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoVariableNomi")) {
				jButtonCerrarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoVariableNomi")) {
				jButtonCerrarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoVariableNomi")) {
				jButtonMostrarOcultarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoVariableNomi")) {
				jButtonCancelarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoVariableNomi")) {
				jButtonCopiarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoVariableNomi")) {
				jButtonVerFormTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoVariableNomi")) {
				jButtonCopiarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoVariableNomi")) {
				jButtonVerFormTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoVariableNomi")) {
				jButtonRecargarInformacionTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoVariableNomi")) {
				jButtonRecargarInformacionTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoVariableNomi")) {
				jButtonRecargarInformacionTipoVariableNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoVariableNomi")) {
				jButtonAnterioresTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoVariableNomi")) {
				jButtonAnterioresTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoVariableNomi")) {
				jButtonAnterioresTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoVariableNomi")) {
				jButtonSiguientesTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoVariableNomi")) {
				jButtonSiguientesTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoVariableNomi")) {
				jButtonSiguientesTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoVariableNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoVariableNomi")) {
				jButtonAbrirOrderByTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoVariableNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoVariableNomi")) {
				jButtonMostrarOcultarTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoVariableNomi")) {
				jButtonCerrarReporteDinamicoTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoVariableNomi")) {
				jButtonGenerarReporteDinamicoTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoVariableNomi")) {
				
				jButtonGenerarExcelReporteDinamicoTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoVariableNomi")) {
				jButtonCerrarImportacionTipoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoVariableNomi")) {
				
				jButtonGenerarImportacionTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoVariableNomi")) {
				
				jButtonAbrirImportacionTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoVariableNomi")) {
				jComboBoxTiposAccionesTipoVariableNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoVariableNomi")) {
				jComboBoxTiposRelacionesTipoVariableNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoVariableNomi")) {
				jComboBoxTiposAccionesTipoVariableNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoVariableNomi")) {
				
				jComboBoxTiposSeleccionarTipoVariableNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoVariableNomi")) {
				jTextFieldValorCampoGeneralTipoVariableNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoVariableNomi")) {
				jButtonAbrirOrderByTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoVariableNomi")) {
				jButtonAbrirOrderByTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoVariableNomi")) {
				jButtonCerrarOrderByTipoVariableNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVariableNomiBusqueda")) {
				this.jButtonidTipoVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVariableNomiBusqueda")) {
				this.jButtoncodigoTipoVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVariableNomiBusqueda")) {
				this.jButtonnombreTipoVariableNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoVariableNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVariableNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoVariableNomi tipovariablenomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipovariablenomiLocal=this.tipovariablenomi;
			} else {
				tipovariablenomiLocal=this.tipovariablenomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
							
				
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
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
			
			


			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVariableNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
								
						
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
								
				
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
							
				
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVariableNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
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
			
			


			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
								
				
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVariableNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoVariableNomi")) {
					jCheckBoxSeleccionarTodosTipoVariableNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoVariableNomi")) {
					jCheckBoxSeleccionadosTipoVariableNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoVariableNomi")) {
					
				}
				
				


				
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
												
				
				


				
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVariableNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVariableNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
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
			
			


			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoVariableNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovariablenomi);
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
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
				
				


				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVariableNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovariablenomiAnterior =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoVariableNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoVariableNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoVariableNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipovariablenomi =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipovariablenomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoVariableNomi")) {
				
				}
				
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoVariableNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoVariableNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoVariableNomi")) {
			
			}
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoVariableNomi();
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
			if(sTipo.equals("NuevoTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoVariableNomi")) {
				jButtonDuplicarTipoVariableNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoVariableNomi")) {
				jButtonCopiarTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoVariableNomi")) {
				jButtonVerFormTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoVariableNomi")) {
				jButtonNuevoTipoVariableNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoVariableNomi")) {
				jButtonModificarTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoVariableNomi")) {
				jButtonActualizarTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoVariableNomi")) {
				jButtonEliminarTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoVariableNomi")) {
				jButtonCancelarTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoVariableNomi")) {
				jButtonCerrarTipoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoVariableNomi")) {
				jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoVariableNomi")) {
				jButtonAbrirOrderByTipoVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoVariableNomi")) {
				jButtonRecargarInformacionTipoVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoVariableNomi")) {
				jButtonAnterioresTipoVariableNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoVariableNomi")) {
				jButtonSiguientesTipoVariableNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoVariableNomiBusqueda")) {
				this.jButtonidTipoVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoVariableNomiBusqueda")) {
				this.jButtoncodigoTipoVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoVariableNomiBusqueda")) {
				this.jButtonnombreTipoVariableNomiBusquedaActionPerformed(evt);
			}
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoVariableNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoVariableNomi")) {
				closingInternalFrameTipoVariableNomi();
				
			} else if(sTipo.equals("jButtonCancelarTipoVariableNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoVariableNomi = (JInternalFrameBase)evt.getSource();
	            	
	            TipoVariableNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoVariableNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVariableNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoVariableNomiActionPerformed(null);
			}
			
			TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovariablenomi,new Object(),this.tipovariablenomiParameterGeneral,this.tipovariablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoVariableNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoVariableNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoVariableNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipovariablenomi)) {
			if(!esControlTabla) {
				if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);			
				}
				
				if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoVariableNomi(this.tipovariablenomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovariablenomiReturnGeneral=tipovariablenomiLogic.procesarEventosTipoVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovariablenomiLogic.getTipoVariableNomis(),this.tipovariablenomi,this.tipovariablenomiParameterGeneral,this.isEsNuevoTipoVariableNomi,classes);//this.tipovariablenomiLogic.getTipoVariableNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoVariableNomi(this.tipovariablenomiReturnGeneral,this.tipovariablenomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoVariableNomi(classes,this.tipovariablenomiReturnGeneral,this.tipovariablenomiBean,false);
					}
						
					if(this.tipovariablenomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoVariableNomi(this.tipovariablenomiReturnGeneral.getTipoVariableNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoVariableNomi(this.tipovariablenomiReturnGeneral.getTipoVariableNomi());	
					}
						
					if(this.tipovariablenomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoVariableNomi(this.tipovariablenomiReturnGeneral.getTipoVariableNomi(),classes);//this.tipovariablenomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoVariableNomi(this.tipovariablenomi,classes);//this.tipovariablenomiBean);									
				}
			
				if(TipoVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoVariableNomi(this.tipovariablenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVariableNomi(this.tipovariablenomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipovariablenomiAnterior!=null) {
						this.tipovariablenomi=this.tipovariablenomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovariablenomiReturnGeneral=tipovariablenomiLogic.procesarEventosTipoVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovariablenomiLogic.getTipoVariableNomis(),this.tipovariablenomi,this.tipovariablenomiParameterGeneral,this.isEsNuevoTipoVariableNomi,classes);//this.tipovariablenomiLogic.getTipoVariableNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovariablenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovariablenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipovariablenomiReturnGeneral.getTipoVariableNomi(),tipovariablenomiLogic.getTipoVariableNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipovariablenomiReturnGeneral.getTipoVariableNomi(),this.tipovariablenomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoVariableNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoVariableNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoVariableNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoVariableNomi() throws Exception {
		
		TipoVariableNomiModel tipovariablenomiModel=(TipoVariableNomiModel)this.jTableDatosTipoVariableNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovariablenomiModel.tipovariablenomis=this.tipovariablenomiLogic.getTipoVariableNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipovariablenomiModel.tipovariablenomis=this.tipovariablenomis;
		}
		
		
		((TipoVariableNomiModel) this.jTableDatosTipoVariableNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoVariableNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipovariablenomiAnterior(),this.tipovariablenomiLogic.getTipoVariableNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipovariablenomiAnterior(),this.tipovariablenomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoVariableNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoVariableNomi(TipoVariableNomi tipovariablenomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VariableNomi.class)) {
					this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(tipovariablenomi.getVariableNomis());
					this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaVariableNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
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
										
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovariablenomi,new Object(),generalEntityParameterGeneral,this.tipovariablenomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipovariablenomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoVariableNomiConstantesFunciones.getClassesRelationshipsOfTipoVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoVariableNomiConstantesFunciones.getClassesRelationshipsFromStringsOfTipoVariableNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoVariableNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovariablenomi,new Object(),generalEntityParameterGeneral,this.tipovariablenomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoVariableNomi(TipoVariableNomiBean tipovariablenomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VariableNomi.class)) {
					this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(tipovariablenomi.getVariableNomis());
					this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaVariableNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoVariableNomi(ArrayList<Classe> classes,TipoVariableNomiReturnGeneral tipovariablenomiReturnGeneral,TipoVariableNomiBean tipovariablenomiBean,Boolean conDefault) throws Exception {
		
			this.tipovariablenomiBean.setVariableNomis(tipovariablenomiReturnGeneral.getTipoVariableNomi().getVariableNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoVariableNomi(TipoVariableNomi tipovariablenomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(VariableNomi.class)) {
					tipovariablenomi.setVariableNomis(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipovariablenomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoVariableNomi = new TipoVariableNomiDetalleFormJInternalFrame(jDesktopPane,this.tipovariablenomiSessionBean.getConGuardarRelaciones(),this.tipovariablenomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.setVisible(false);
		this.jInternalFrameDetalleFormTipoVariableNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoVariableNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoVariableNomi.tipovariablenomiLogic=this.tipovariablenomiLogic;
		
		this.cargarCombosFrameForeignKeyTipoVariableNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVariableNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVariableNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoVariableNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoVariableNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoVariableNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVariableNomi"));
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoVariableNomi"));

		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarToolBarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVariableNomi"));
					
		this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemModificarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoVariableNomi"));
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarToolBarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVariableNomi"));
						
		this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemActualizarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoVariableNomi"));
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVariableNomi"));
								
		this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemEliminarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoVariableNomi"));
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVariableNomi"));
					
		this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemCancelarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVariableNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemDetalleCerrarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVariableNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVariableNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVariableNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonidTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtoncodigoTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonnombreTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVariableNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVariableNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoVariableNomi"));
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVariableNomi"));
		}
		
		this.jTableDatosTipoVariableNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoVariableNomi"));
		
		this.jTableDatosTipoVariableNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoVariableNomi"));
		
		this.jButtonNuevoTipoVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoTipoVariableNomi"));
		
		this.jButtonDuplicarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"DuplicarTipoVariableNomi"));
		
		this.jButtonCopiarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"CopiarTipoVariableNomi"));
		
		this.jButtonVerFormTipoVariableNomi.addActionListener(new ButtonActionListener(this,"VerFormTipoVariableNomi"));
		
		
		this.jButtonNuevoToolBarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoVariableNomi"));
			
		this.jButtonDuplicarToolBarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoVariableNomi"));
			
		this.jMenuItemNuevoTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoVariableNomi"));
			
		this.jMenuItemDuplicarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoVariableNomi"));		
		
		
		this.jButtonNuevoRelacionesTipoVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoVariableNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoVariableNomi"));
			
		this.jMenuItemNuevoRelacionesTipoVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoVariableNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonModificarToolBarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVariableNomi"));
			
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemModificarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonActualizarToolBarTipoVariableNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVariableNomi"));
				
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemActualizarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonEliminarToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVariableNomi"));
						
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemEliminarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonCancelarToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVariableNomi"));
			
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemCancelarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVariableNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoVariableNomi"));		
		
		
		this.jButtonCerrarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarTipoVariableNomi"));
		
		
		this.jButtonCerrarToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoVariableNomi"));
			
		this.jMenuItemCerrarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoVariableNomi"));
			
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jMenuItemDetalleCerrarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVariableNomi"));
		}
		
		this.jButtonCopiarToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoVariableNomi"));
			
		this.jButtonVerFormToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoVariableNomi"));
		
		this.jMenuItemGuardarCambiosTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoVariableNomi"));
			
		this.jMenuItemCopiarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoVariableNomi"));		
		
		this.jMenuItemVerFormTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoVariableNomi"));		
		
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVariableNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoVariableNomi"));
			
		this.jMenuItemGuardarCambiosTablaTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVariableNomi"));		
		
		
		
		this.jButtonRecargarInformacionTipoVariableNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoVariableNomi"));
					
		this.jButtonRecargarInformacionToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoVariableNomi"));
		
		this.jMenuItemRecargarInformacionTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoVariableNomi"));		
		
		
		
		this.jButtonAnterioresTipoVariableNomi.addActionListener (new ButtonActionListener(this,"AnterioresTipoVariableNomi"));
		
		
		this.jButtonAnterioresToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoVariableNomi"));
		
		this.jMenuItemAnterioresTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoVariableNomi"));		
		
		
		this.jButtonSiguientesTipoVariableNomi.addActionListener (new ButtonActionListener(this,"SiguientesTipoVariableNomi"));
		
		
		this.jButtonSiguientesToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoVariableNomi"));
			
		this.jMenuItemSiguientesTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoVariableNomi"));
			
		this.jMenuItemAbrirOrderByTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoVariableNomi"));
			
		this.jMenuItemMostrarOcultarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoVariableNomi"));
			
		this.jMenuItemDetalleAbrirOrderByTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoVariableNomi"));
			
		this.jMenuItemDetalleMostarOcultarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoVariableNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoVariableNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoVariableNomi"));
			
		this.jMenuItemNuevoGuardarCambiosTipoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoVariableNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoVariableNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoVariableNomi"));

		this.jCheckBoxSeleccionadosTipoVariableNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoVariableNomi"));
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVariableNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoVariableNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoVariableNomi"));
			
		this.jComboBoxTiposAccionesTipoVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoVariableNomi"));
					
		this.jComboBoxTiposSeleccionarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoVariableNomi"));
			
		this.jTextFieldValorCampoGeneralTipoVariableNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoVariableNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonidTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtoncodigoTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonnombreTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVariableNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoVariableNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVariableNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVariableNomi"));				
			//this.jButtonGenerarReporteDinamicoTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVariableNomi"));
			//this.jButtonGenerarExcelReporteDinamicoTipoVariableNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVariableNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoVariableNomi!=null) {
				this.jInternalFrameImportacionTipoVariableNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVariableNomi"));
				this.jInternalFrameImportacionTipoVariableNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVariableNomi"));
				this.jInternalFrameImportacionTipoVariableNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVariableNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoVariableNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoVariableNomi"));
			
			this.jButtonAbrirOrderByToolBarTipoVariableNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoVariableNomi"));			
			
			if(this.jInternalFrameOrderByTipoVariableNomi!=null) {
				this.jInternalFrameOrderByTipoVariableNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVariableNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVariableNomi.jTabbedPaneRelacionesTipoVariableNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVariableNomi"));
		
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
            		closingInternalFrameTipoVariableNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoVariableNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoVariableNomi = (JInternalFrameBase)event.getSource();
	            	
	            TipoVariableNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoVariableNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVariableNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoVariableNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoVariableNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoVariableNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoVariableNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoVariableNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoVariableNomi";
		inputMap = this.jButtonNuevoTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVariableNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoVariableNomi";
		inputMap = this.jButtonNuevoRelacionesTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoVariableNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoVariableNomi";
		inputMap = this.jButtonModificarTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoVariableNomi";
		inputMap = this.jButtonActualizarTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoVariableNomi";
		inputMap = this.jButtonEliminarTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoVariableNomi";
		inputMap = this.jButtonCancelarTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoVariableNomi";
		inputMap = this.jButtonCerrarTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoVariableNomi";
		inputMap = this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonGuardarCambiosTipoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoVariableNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoVariableNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonidTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtoncodigoTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVariableNomi.jButtonnombreTipoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoVariableNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoVariableNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoVariableNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoVariableNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
					tipovariablenomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVariableNomi tipovariablenomiAux:tipovariablenomis) {
					tipovariablenomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoVariableNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVariableNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
						tipovariablenomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVariableNomi tipovariablenomiAux:tipovariablenomis) {
						tipovariablenomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVariableNomi tipovariablenomiAux:tipovariablenomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVariableNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVariableNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVariableNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVariableNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoVariableNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVariableNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoVariableNomi.getSelectedRows();
			
			TipoVariableNomi tipovariablenomiLocal=new TipoVariableNomi();
			
			//this.seleccionarTodosTipoVariableNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovariablenomiLocal =(TipoVariableNomi) this.tipovariablenomiLogic.getTipoVariableNomis().toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipovariablenomiLocal =(TipoVariableNomi) this.tipovariablenomis.toArray()[this.jTableDatosTipoVariableNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipovariablenomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
						tipovariablenomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVariableNomi tipovariablenomiAux:tipovariablenomis) {
						tipovariablenomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoVariableNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVariableNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVariableNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVariableNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoVariableNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoVariableNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoVariableNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoVariableNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoVariableNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomiLogic.getTipoVariableNomis()) {
				
						if(sTipoSeleccionar.equals(TipoVariableNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovariablenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovariablenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVariableNomi tipovariablenomiAux:tipovariablenomis) {
					
						if(sTipoSeleccionar.equals(TipoVariableNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovariablenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovariablenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVariableNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoVariableNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoVariableNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoVariableNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoVariableNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoVariableNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoVariableNomi(conSplash);
				
					this.generarReporteTipoVariableNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoVariableNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVariableNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoVariableNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVariableNomi();
				
				this.exportarTipoVariableNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoVariableNomis();
				//this.importarTipoVariableNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVariableNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoVariableNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoVariableNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoVariableNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoVariableNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoVariableNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoVariableNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoVariableNomi(conSplash);
					
						//this.actualizarParametrosGeneralTipoVariableNomi();
						
						this.generarReporteProcesoAccionTipoVariableNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoVariableNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo VariableS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoVariableNomi();
				
						this.actualizarParametrosGeneralTipoVariableNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipovariablenomiReturnGeneral=tipovariablenomiLogic.procesarAccionTipoVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipovariablenomiLogic.getTipoVariableNomis(),this.tipovariablenomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoVariableNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoVariableNomi();
					
					TipoVariableNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoVariableNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoVariableNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoVariableNomi.jComboBoxTiposAccionesFormularioTipoVariableNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoVariableNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoVariableNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoVariableNomi();
			
			if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
			TipoVariableNomi tipovariablenomi=new TipoVariableNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoVariableNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoVariableNomi.getSelectedItem();
			
			
			
			
			tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipovariablenomisSeleccionados.size()==1) {
				for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisSeleccionados) {
					tipovariablenomi=tipovariablenomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Variable Nomina")) {
					jButtonVariableNomiActionPerformed(null,rowIndex,true,false,tipovariablenomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoVariableNomi();
			
      		//this.finishProcessTipoVariableNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoVariableNomiReturnGeneral() throws Exception {
		if(this.tipovariablenomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipovariablenomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipovariablenomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipovariablenomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipovariablenomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipovariablenomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoVariableNomi(false);
		}
		
		if(this.tipovariablenomiReturnGeneral.getConRetornoLista() || this.tipovariablenomiReturnGeneral.getConRetornoObjeto()) {
			if(this.tipovariablenomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovariablenomiLogic.setTipoVariableNomis(this.tipovariablenomiReturnGeneral.getTipoVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipovariablenomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovariablenomiLogic.setTipoVariableNomi(this.tipovariablenomiReturnGeneral.getTipoVariableNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoVariableNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoVariableNomi() throws Exception {
		
		
	}
	
	public ArrayList<TipoVariableNomi> getTipoVariableNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoVariableNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoVariableNomi tipovariablenomiAux:tipovariablenomiLogic.getTipoVariableNomis()) {
					if(tipovariablenomiAux.getIsSelected()) {
						tipovariablenomisSeleccionados.add(tipovariablenomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVariableNomi tipovariablenomiAux:this.tipovariablenomis) {
					if(tipovariablenomiAux.getIsSelected()) {
						tipovariablenomisSeleccionados.add(tipovariablenomiAux);				
					}
				}
			}
			
			if(tipovariablenomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipovariablenomisSeleccionados.addAll(this.tipovariablenomiLogic.getTipoVariableNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipovariablenomisSeleccionados.addAll(this.tipovariablenomis);				
					}
				}
			}
		} else {
			tipovariablenomisSeleccionados.add(this.tipovariablenomi);
		}
		
		return tipovariablenomisSeleccionados;
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
	
	public void generarReporteTipoVariableNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoVariableNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoVariableNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVariableNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoVariableNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoVariableNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Variable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoVariableNomis("Todos",tipovariablenomisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoVariableNomis("Todos",tipovariablenomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoVariableNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoVariableNomis("Todos",tipovariablenomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoVariableNomi();
		
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoVariableNomi();
		
		
		//this.generarReporteTipoVariableNomis("Todos",tipovariablenomisSeleccionados ,tipovariablenomiImplementable,tipovariablenomiImplementableHome);
	}
	
	public void mostrarImportacionTipoVariableNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoVariableNomi();
		
		this.abrirFrameImportacionTipoVariableNomi();		
		
			
		//this.generarReporteTipoVariableNomis("Todos",tipovariablenomisSeleccionados ,tipovariablenomiImplementable,tipovariablenomiImplementableHome);
	}
	
	public void importarTipoVariableNomis() throws Exception {		
	
	}
	
	public void exportarTipoVariableNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoVariableNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoVariableNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoVariableNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Variable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovariablenomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoVariableNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoVariableNomi(tipovariablenomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipovariablenomiAux.setsDetalleGeneralEntityReporte(tipovariablenomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoVariableNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoVariableNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVariableNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVariableNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoVariableNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoVariableNomi(TipoVariableNomi tipovariablenomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipovariablenomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovariablenomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovariablenomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovariablenomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovariablenomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoVariableNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoVariableNomi(row);				
				iRow++;
			}				
			
			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoVariableNomi(tipovariablenomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();		
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovariablenomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipovariablenomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipovariablenomi");
			//elementRoot.appendChild(element);
		
			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisSeleccionados) {
				element = document.createElement("tipovariablenomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoVariableNomi(tipovariablenomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoVariableNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoVariableNomi(TipoVariableNomi tipovariablenomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipovariablenomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovariablenomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovariablenomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoVariableNomi(TipoVariableNomi tipovariablenomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoVariableNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipovariablenomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoVariableNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipovariablenomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoVariableNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipovariablenomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoVariableNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipovariablenomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoVariableNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados=new ArrayList<TipoVariableNomi>();
		
		tipovariablenomisSeleccionados=this.getTipoVariableNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoVariableNomi(tipovariablenomisSeleccionados);
		
		this.generarReporteTipoVariableNomis("Todos",tipovariablenomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoVariableNomi(ArrayList<TipoVariableNomi> tipovariablenomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisSeleccionados) {
				tipovariablenomiAux.setsDetalleGeneralEntityReporte(tipovariablenomiAux.toString());
			
				if(sTipoSeleccionar.equals(TipoVariableNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipovariablenomiAux.setsDescripcionGeneralEntityReporte1(tipovariablenomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoVariableNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipovariablenomiAux.setsDescripcionGeneralEntityReporte1(tipovariablenomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoVariableNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoVariableNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=true;
				this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=true;
			}
			
			this.isVisibilidadCeldaModificarTipoVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=true;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=true;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=true;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=true;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=true;
			this.isVisibilidadCeldaModificarTipoVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoVariableNomi=true;
			this.isVisibilidadCeldaActualizarTipoVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVariableNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoVariableNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=true;
		} else {
			this.actualizarEstadoPanelsTipoVariableNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoVariableNomi=false;
			//this.isVisibilidadCeldaVerFormTipoVariableNomi=false;
			this.isVisibilidadCeldaDuplicarTipoVariableNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipovariablenomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
			if(!tipovariablenomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;												
			}
			
			this.jButtonCerrarTipoVariableNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVariableNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.tipovariablenomi)) {
			this.isVisibilidadCeldaActualizarTipoVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoVariableNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVariableNomi() {
		this.isVisibilidadCeldaNuevoTipoVariableNomi=false;
		this.isVisibilidadCeldaGuardarCambiosTipoVariableNomi=false;
	}
	
	public void actualizarEstadoPanelsTipoVariableNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoVariableNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVariableNomi!=null) {
				this.jScrollPanelDatosTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVariableNomi!=null) {
				this.jPanelPaginacionTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVariableNomi!=null) {
				this.jPanelParametrosReportesTipoVariableNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoVariableNomi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoVariableNomi!=null) {
				this.jScrollPanelDatosTipoVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVariableNomi!=null) {
				this.jPanelPaginacionTipoVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVariableNomi!=null) {
				this.jPanelParametrosReportesTipoVariableNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoVariableNomi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoVariableNomi!=null) {
				this.jScrollPanelDatosTipoVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVariableNomi!=null) {
				this.jPanelPaginacionTipoVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVariableNomi!=null) {
				this.jPanelParametrosReportesTipoVariableNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoVariableNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVariableNomi!=null) {
				this.jScrollPanelDatosTipoVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVariableNomi!=null) {
				this.jPanelPaginacionTipoVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVariableNomi!=null) {
				this.jPanelParametrosReportesTipoVariableNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoVariableNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVariableNomi!=null) {
				this.jScrollPanelDatosTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVariableNomi!=null) {
				this.jPanelPaginacionTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVariableNomi!=null) {
				this.jPanelParametrosReportesTipoVariableNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoVariableNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoVariableNomi!=null) {
				this.jScrollPanelDatosTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVariableNomi!=null) {
				this.jPanelPaginacionTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVariableNomi!=null) {
				this.jPanelParametrosReportesTipoVariableNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoVariableNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoVariableNomi!=null) {
				this.jScrollPanelDatosTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVariableNomi!=null) {
				this.jPanelPaginacionTipoVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVariableNomi!=null) {
				this.jPanelParametrosReportesTipoVariableNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipovariablenomiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoVariableNomiParaVariableNomis() throws Exception {
		Boolean isPaginaPopupVariableNomi=false;

		try {

			if(this.tipovariablenomiSessionBean==null) {
				this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean==null) {
				this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean=new VariableNomiSessionBean();
			}

			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean.setsPathNavegacionActual(tipovariablenomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupVariableNomi=this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVariableNomi(true);
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi(TipoVariableNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoVariableNomi(true);
			this.jInternalFrameDetalleFormTipoVariableNomi.variablenomiSessionBean.setlidTipoVariableNomiActual(this.idTipoVariableNomiActual);

			tipovariablenomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoVariableNomi(true);
			tipovariablenomiSessionBean.setlIdTipoVariableNomiActualForeignKey(this.idTipoVariableNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoVariableNomiSessionBean tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
		
		if(this.tipovariablenomiSessionBean==null) {
			this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
		}
		
		this.tipovariablenomiSessionBean.setsUltimaBusquedaTipoVariableNomi(this.getsAccionBusqueda());
		this.tipovariablenomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipovariablenomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoVariableNomiSessionBean tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
		
		if(this.tipovariablenomiSessionBean==null) {
			this.tipovariablenomiSessionBean=new TipoVariableNomiSessionBean();
		}
		
		if(this.tipovariablenomiSessionBean.getsUltimaBusquedaTipoVariableNomi()!=null&&!this.tipovariablenomiSessionBean.getsUltimaBusquedaTipoVariableNomi().equals("")) {
			this.setsAccionBusqueda(tipovariablenomiSessionBean.getsUltimaBusquedaTipoVariableNomi());
			this.setiNumeroPaginacion(tipovariablenomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipovariablenomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipovariablenomiSessionBean.setsUltimaBusquedaTipoVariableNomi("");
		this.tipovariablenomiSessionBean.setiNumeroPaginacion(TipoVariableNomiConstantesFunciones.INUMEROPAGINACION);
		this.tipovariablenomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoVariableNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoVariableNomi() {
		this.updateBorderResaltarBusquedasFormularioTipoVariableNomi();
		this.updateVisibilidadBusquedasFormularioTipoVariableNomi();
		this.updateHabilitarBusquedasFormularioTipoVariableNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoVariableNomi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoVariableNomi() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoVariableNomi() {
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
	
	public void updateControlesFormularioTipoVariableNomi() throws Exception {

		if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoVariableNomi();
		this.updateVisibilidadResaltarControlesFormularioTipoVariableNomi();
		this.updateHabilitarResaltarControlesFormularioTipoVariableNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoVariableNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipovariablenomiConstantesFunciones.resaltaridTipoVariableNomi!=null && this.jInternalFrameDetalleFormTipoVariableNomi!=null) {this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.setBorder(this.tipovariablenomiConstantesFunciones.resaltaridTipoVariableNomi);}
		if(this.tipovariablenomiConstantesFunciones.resaltarcodigoTipoVariableNomi!=null && this.jInternalFrameDetalleFormTipoVariableNomi!=null) {this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.setBorder(this.tipovariablenomiConstantesFunciones.resaltarcodigoTipoVariableNomi);}
		if(this.tipovariablenomiConstantesFunciones.resaltarnombreTipoVariableNomi!=null && this.jInternalFrameDetalleFormTipoVariableNomi!=null) {this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.setBorder(this.tipovariablenomiConstantesFunciones.resaltarnombreTipoVariableNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoVariableNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
	
		//this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.setVisible(this.tipovariablenomiConstantesFunciones.mostraridTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.jPanelidTipoVariableNomi.setVisible(this.tipovariablenomiConstantesFunciones.mostraridTipoVariableNomi);
		//this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.setVisible(this.tipovariablenomiConstantesFunciones.mostrarcodigoTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.jPanelcodigoTipoVariableNomi.setVisible(this.tipovariablenomiConstantesFunciones.mostrarcodigoTipoVariableNomi);
		//this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.setVisible(this.tipovariablenomiConstantesFunciones.mostrarnombreTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.jPanelnombreTipoVariableNomi.setVisible(this.tipovariablenomiConstantesFunciones.mostrarnombreTipoVariableNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoVariableNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVariableNomi!=null) {
	
		this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldidTipoVariableNomi.setEnabled(this.tipovariablenomiConstantesFunciones.activaridTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.jTextFieldcodigoTipoVariableNomi.setEnabled(this.tipovariablenomiConstantesFunciones.activarcodigoTipoVariableNomi);
		this.jInternalFrameDetalleFormTipoVariableNomi.jTextAreanombreTipoVariableNomi.setEnabled(this.tipovariablenomiConstantesFunciones.activarnombreTipoVariableNomi);
		}
	}
	
		
}