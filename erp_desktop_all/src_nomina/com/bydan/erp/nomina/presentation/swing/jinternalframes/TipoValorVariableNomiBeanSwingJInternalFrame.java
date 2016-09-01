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

import com.bydan.erp.nomina.util.TipoValorVariableNomiConstantesFunciones;
import com.bydan.erp.nomina.util.TipoValorVariableNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoValorVariableNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoValorVariableNomiBean;
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
public class TipoValorVariableNomiBeanSwingJInternalFrame extends TipoValorVariableNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoValorVariableNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoValorVariableNomi> tipovalorvariablenomiValidator = new ClassValidator<TipoValorVariableNomi>(TipoValorVariableNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoValorVariableNomi tipovalorvariablenomi;	
	public TipoValorVariableNomi tipovalorvariablenomiAux;
	public TipoValorVariableNomi tipovalorvariablenomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoValorVariableNomi tipovalorvariablenomiTotales;
	public Long idTipoValorVariableNomiActual;
	public Long iIdNuevoTipoValorVariableNomi=0L;
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
	
	public Boolean isPermisoTodoTipoValorVariableNomi;
	public Boolean isPermisoNuevoTipoValorVariableNomi;
	public Boolean isPermisoActualizarTipoValorVariableNomi;
	public Boolean isPermisoActualizarOriginalTipoValorVariableNomi;
	public Boolean isPermisoEliminarTipoValorVariableNomi;
	public Boolean isPermisoGuardarCambiosTipoValorVariableNomi;
	public Boolean isPermisoConsultaTipoValorVariableNomi;
	public Boolean isPermisoBusquedaTipoValorVariableNomi;
	public Boolean isPermisoReporteTipoValorVariableNomi;
	public Boolean isPermisoPaginacionMedioTipoValorVariableNomi;
	public Boolean isPermisoPaginacionAltoTipoValorVariableNomi;
	public Boolean isPermisoPaginacionTodoTipoValorVariableNomi;
	public Boolean isPermisoCopiarTipoValorVariableNomi;
	public Boolean isPermisoVerFormTipoValorVariableNomi;
	public Boolean isPermisoDuplicarTipoValorVariableNomi;
	public Boolean isPermisoOrdenTipoValorVariableNomi;
	
	
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
	
	public TipoValorVariableNomiParameterReturnGeneral tipovalorvariablenomiReturnGeneral;
	public TipoValorVariableNomiParameterReturnGeneral tipovalorvariablenomiParameterGeneral;
	
	

	public VariableNomiLogic variablenomiLogic=null;

	public VariableNomiLogic getVariableNomiLogic() {
		return variablenomiLogic;
	}

	public void setVariableNomiLogic(VariableNomiLogic variablenomiLogic) {
		this.variablenomiLogic = variablenomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoValorVariableNomi=false;
	public Boolean esParaAccionDesdeFormularioTipoValorVariableNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoValorVariableNomiSessionBeanAdditional tipovalorvariablenomiSessionBeanAdditional=null;
	
	public TipoValorVariableNomiSessionBeanAdditional getTipoValorVariableNomiSessionBeanAdditional() {
		return this.tipovalorvariablenomiSessionBeanAdditional;
	}
	
	public void setTipoValorVariableNomiSessionBeanAdditional(TipoValorVariableNomiSessionBeanAdditional tipovalorvariablenomiSessionBeanAdditional) {
		try {
			this.tipovalorvariablenomiSessionBeanAdditional=tipovalorvariablenomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoValorVariableNomiBeanSwingJInternalFrameAdditional tipovalorvariablenomiBeanSwingJInternalFrameAdditional=null;
	//public class TipoValorVariableNomiBeanSwingJInternalFrame
	
	public TipoValorVariableNomiBeanSwingJInternalFrameAdditional getTipoValorVariableNomiBeanSwingJInternalFrameAdditional() {
		return this.tipovalorvariablenomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoValorVariableNomiBeanSwingJInternalFrameAdditional(TipoValorVariableNomiBeanSwingJInternalFrameAdditional tipovalorvariablenomiBeanSwingJInternalFrameAdditional) {
		try {
			this.tipovalorvariablenomiBeanSwingJInternalFrameAdditional=tipovalorvariablenomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoValorVariableNomiLogic tipovalorvariablenomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoValorVariableNomi tipovalorvariablenomiBean;
	public TipoValorVariableNomiConstantesFunciones tipovalorvariablenomiConstantesFunciones;
	//public TipoValorVariableNomiParameterReturnGeneral tipovalorvariablenomiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoValorVariableNomi> tipovalorvariablenomis;	
	//public List<TipoValorVariableNomi> tipovalorvariablenomisEliminados;
	//public List<TipoValorVariableNomi> tipovalorvariablenomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
	public Boolean isVisibilidadCeldaDuplicarTipoValorVariableNomi=true;
	public Boolean isVisibilidadCeldaCopiarTipoValorVariableNomi=true;
	public Boolean isVisibilidadCeldaVerFormTipoValorVariableNomi=true;
	public Boolean isVisibilidadCeldaOrdenTipoValorVariableNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
	public Boolean isVisibilidadCeldaModificarTipoValorVariableNomi=false;
	public Boolean isVisibilidadCeldaActualizarTipoValorVariableNomi=false;
	public Boolean isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
	public Boolean isVisibilidadCeldaCancelarTipoValorVariableNomi=false;
	public Boolean isVisibilidadCeldaGuardarTipoValorVariableNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;	
	
	
	
	public Long getiIdNuevoTipoValorVariableNomi() {
		return this.iIdNuevoTipoValorVariableNomi;
	}

	public void setiIdNuevoTipoValorVariableNomi(Long iIdNuevoTipoValorVariableNomi) {
		this.iIdNuevoTipoValorVariableNomi = iIdNuevoTipoValorVariableNomi;
	}
	
	public Long getidTipoValorVariableNomiActual() {
		return this.idTipoValorVariableNomiActual;
	}

	public void setidTipoValorVariableNomiActual(Long idTipoValorVariableNomiActual) {
		this.idTipoValorVariableNomiActual = idTipoValorVariableNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoValorVariableNomi gettipovalorvariablenomi() {
		return this.tipovalorvariablenomi;
	}

	public void settipovalorvariablenomi(TipoValorVariableNomi tipovalorvariablenomi) {
		this.tipovalorvariablenomi = tipovalorvariablenomi;
	}
	
	public TipoValorVariableNomi gettipovalorvariablenomiAux() {
		return this.tipovalorvariablenomiAux;
	}

	public void settipovalorvariablenomiAux(TipoValorVariableNomi tipovalorvariablenomiAux) {
		this.tipovalorvariablenomiAux = tipovalorvariablenomiAux;
	}				
	
	public TipoValorVariableNomi gettipovalorvariablenomiAnterior() {
		return this.tipovalorvariablenomiAnterior;
	}

	public void settipovalorvariablenomiAnterior(TipoValorVariableNomi tipovalorvariablenomiAnterior) {
		this.tipovalorvariablenomiAnterior = tipovalorvariablenomiAnterior;
	}	
	
	public TipoValorVariableNomi gettipovalorvariablenomiTotales() {
		return this.tipovalorvariablenomiTotales;
	}

	public void settipovalorvariablenomiTotales(TipoValorVariableNomi tipovalorvariablenomiTotales) {
		this.tipovalorvariablenomiTotales = tipovalorvariablenomiTotales;
	}	
	
	public TipoValorVariableNomi gettipovalorvariablenomiBean() {
		return this.tipovalorvariablenomiBean;
	}

	public void settipovalorvariablenomiBean(TipoValorVariableNomi tipovalorvariablenomiBean) {
		this.tipovalorvariablenomiBean = tipovalorvariablenomiBean;
	}	
	
	public TipoValorVariableNomiParameterReturnGeneral gettipovalorvariablenomiReturnGeneral() {
		return this.tipovalorvariablenomiReturnGeneral;
	}

	public void settipovalorvariablenomiReturnGeneral(TipoValorVariableNomiParameterReturnGeneral tipovalorvariablenomiReturnGeneral) {
		this.tipovalorvariablenomiReturnGeneral = tipovalorvariablenomiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoValorVariableNomiLogic getTipoValorVariableNomiLogic()	{		
		return tipovalorvariablenomiLogic;
	}

	public void setTipoValorVariableNomiLogic(TipoValorVariableNomiLogic tipovalorvariablenomiLogic) {
		this.tipovalorvariablenomiLogic = tipovalorvariablenomiLogic;
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
	
	public Boolean getIsEsNuevoTipoValorVariableNomi() {
		return isEsNuevoTipoValorVariableNomi;
	}

	public void setIsEsNuevoTipoValorVariableNomi(Boolean isEsNuevoTipoValorVariableNomi) {
		this.isEsNuevoTipoValorVariableNomi = isEsNuevoTipoValorVariableNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoValorVariableNomi() {
		return esParaAccionDesdeFormularioTipoValorVariableNomi;
	}
	
	public void setEsParaAccionDesdeFormularioTipoValorVariableNomi(Boolean esParaAccionDesdeFormularioTipoValorVariableNomi) {
		this.esParaAccionDesdeFormularioTipoValorVariableNomi = esParaAccionDesdeFormularioTipoValorVariableNomi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoValorVariableNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoValorVariableNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoValorVariableNomi(this.tipovalorvariablenomiLogic.getTipoValorVariableNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoValorVariableNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoValorVariableNomi(this.tipovalorvariablenomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipovalorvariablenomiLogic.setTipoValorVariableNomis(this.tipovalorvariablenomis);
			tipovalorvariablenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoValorVariableNomiParameterReturnGeneral getTipoValorVariableNomiParameterGeneral() {
		return this.tipovalorvariablenomiParameterGeneral;
	}
	
	public void setTipoValorVariableNomiParameterGeneral(TipoValorVariableNomiParameterReturnGeneral tipovalorvariablenomiParameterGeneral) {
		this.tipovalorvariablenomiParameterGeneral = tipovalorvariablenomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoValorVariableNomi() {
		return isPermisoTodoTipoValorVariableNomi;
	}

	public void setIsPermisoTodoTipoValorVariableNomi(Boolean isPermisoTodoTipoValorVariableNomi) {
		this.isPermisoTodoTipoValorVariableNomi = isPermisoTodoTipoValorVariableNomi;
	}

	public Boolean getIsPermisoNuevoTipoValorVariableNomi() {
		return isPermisoNuevoTipoValorVariableNomi;
	}

	public void setIsPermisoNuevoTipoValorVariableNomi(Boolean isPermisoNuevoTipoValorVariableNomi) {
		this.isPermisoNuevoTipoValorVariableNomi = isPermisoNuevoTipoValorVariableNomi;
	}

	public Boolean getIsPermisoActualizarTipoValorVariableNomi() {
		return isPermisoActualizarTipoValorVariableNomi;
	}

	public void setIsPermisoActualizarTipoValorVariableNomi(Boolean isPermisoActualizarTipoValorVariableNomi) {
		this.isPermisoActualizarTipoValorVariableNomi = isPermisoActualizarTipoValorVariableNomi;
	}

	public Boolean getIsPermisoEliminarTipoValorVariableNomi() {
		return isPermisoEliminarTipoValorVariableNomi;
	}

	public void setIsPermisoEliminarTipoValorVariableNomi(Boolean isPermisoEliminarTipoValorVariableNomi) {
		this.isPermisoEliminarTipoValorVariableNomi = isPermisoEliminarTipoValorVariableNomi;
	}

	public Boolean getIsPermisoGuardarCambiosTipoValorVariableNomi() {
		return isPermisoGuardarCambiosTipoValorVariableNomi;
	}

	public void setIsPermisoGuardarCambiosTipoValorVariableNomi(Boolean isPermisoGuardarCambiosTipoValorVariableNomi) {
		this.isPermisoGuardarCambiosTipoValorVariableNomi = isPermisoGuardarCambiosTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoConsultaTipoValorVariableNomi() {
		return isPermisoConsultaTipoValorVariableNomi;
	}

	public void setIsPermisoConsultaTipoValorVariableNomi(Boolean isPermisoConsultaTipoValorVariableNomi) {
		this.isPermisoConsultaTipoValorVariableNomi = isPermisoConsultaTipoValorVariableNomi;
	}

	public Boolean getIsPermisoBusquedaTipoValorVariableNomi() {
		return isPermisoBusquedaTipoValorVariableNomi;
	}

	public void setIsPermisoBusquedaTipoValorVariableNomi(Boolean isPermisoBusquedaTipoValorVariableNomi) {
		this.isPermisoBusquedaTipoValorVariableNomi = isPermisoBusquedaTipoValorVariableNomi;
	}

	public Boolean getIsPermisoReporteTipoValorVariableNomi() {
		return isPermisoReporteTipoValorVariableNomi;
	}

	public void setIsPermisoReporteTipoValorVariableNomi(Boolean isPermisoReporteTipoValorVariableNomi) {
		this.isPermisoReporteTipoValorVariableNomi = isPermisoReporteTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoValorVariableNomi() {
		return isPermisoPaginacionMedioTipoValorVariableNomi;
	}

	public void setIsPermisoPaginacionMedioTipoValorVariableNomi(Boolean isPermisoPaginacionMedioTipoValorVariableNomi) {
		this.isPermisoPaginacionMedioTipoValorVariableNomi = isPermisoPaginacionMedioTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoValorVariableNomi() {
		return isPermisoPaginacionTodoTipoValorVariableNomi;
	}

	public void setIsPermisoPaginacionTodoTipoValorVariableNomi(Boolean isPermisoPaginacionTodoTipoValorVariableNomi) {
		this.isPermisoPaginacionTodoTipoValorVariableNomi = isPermisoPaginacionTodoTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoValorVariableNomi() {
		return isPermisoPaginacionAltoTipoValorVariableNomi;
	}

	public void setIsPermisoPaginacionAltoTipoValorVariableNomi(Boolean isPermisoPaginacionAltoTipoValorVariableNomi) {
		this.isPermisoPaginacionAltoTipoValorVariableNomi = isPermisoPaginacionAltoTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoCopiarTipoValorVariableNomi() {
		return isPermisoCopiarTipoValorVariableNomi;
	}

	public void setIsPermisoCopiarTipoValorVariableNomi(Boolean isPermisoCopiarTipoValorVariableNomi) {
		this.isPermisoCopiarTipoValorVariableNomi = isPermisoCopiarTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoVerFormTipoValorVariableNomi() {
		return isPermisoVerFormTipoValorVariableNomi;
	}

	public void setIsPermisoVerFormTipoValorVariableNomi(Boolean isPermisoVerFormTipoValorVariableNomi) {
		this.isPermisoVerFormTipoValorVariableNomi = isPermisoVerFormTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoDuplicarTipoValorVariableNomi() {
		return isPermisoDuplicarTipoValorVariableNomi;
	}

	public void setIsPermisoDuplicarTipoValorVariableNomi(Boolean isPermisoDuplicarTipoValorVariableNomi) {
		this.isPermisoDuplicarTipoValorVariableNomi = isPermisoDuplicarTipoValorVariableNomi;
	}
	
	public Boolean getIsPermisoOrdenTipoValorVariableNomi() {
		return isPermisoOrdenTipoValorVariableNomi;
	}

	public void setIsPermisoOrdenTipoValorVariableNomi(Boolean isPermisoOrdenTipoValorVariableNomi) {
		this.isPermisoOrdenTipoValorVariableNomi = isPermisoOrdenTipoValorVariableNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoValorVariableNomi() {
		return isVisibilidadCeldaNuevoTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaNuevoTipoValorVariableNomi(Boolean isVisibilidadCeldaNuevoTipoValorVariableNomi) {
		this.isVisibilidadCeldaNuevoTipoValorVariableNomi = isVisibilidadCeldaNuevoTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoValorVariableNomi() {
		return isVisibilidadCeldaDuplicarTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaDuplicarTipoValorVariableNomi(Boolean isVisibilidadCeldaDuplicarTipoValorVariableNomi) {
		this.isVisibilidadCeldaDuplicarTipoValorVariableNomi = isVisibilidadCeldaDuplicarTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoValorVariableNomi() {
		return isVisibilidadCeldaCopiarTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaCopiarTipoValorVariableNomi(Boolean isVisibilidadCeldaCopiarTipoValorVariableNomi) {
		this.isVisibilidadCeldaCopiarTipoValorVariableNomi = isVisibilidadCeldaCopiarTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoValorVariableNomi() {
		return isVisibilidadCeldaVerFormTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaVerFormTipoValorVariableNomi(Boolean isVisibilidadCeldaVerFormTipoValorVariableNomi) {
		this.isVisibilidadCeldaVerFormTipoValorVariableNomi = isVisibilidadCeldaVerFormTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoValorVariableNomi() {
		return isVisibilidadCeldaOrdenTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaOrdenTipoValorVariableNomi(Boolean isVisibilidadCeldaOrdenTipoValorVariableNomi) {
		this.isVisibilidadCeldaOrdenTipoValorVariableNomi = isVisibilidadCeldaOrdenTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi() {
		return isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi(Boolean isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi) {
		this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi = isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoValorVariableNomi() {
		return isVisibilidadCeldaModificarTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaModificarTipoValorVariableNomi(Boolean isVisibilidadCeldaModificarTipoValorVariableNomi) {
		this.isVisibilidadCeldaModificarTipoValorVariableNomi = isVisibilidadCeldaModificarTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoValorVariableNomi() {
		return isVisibilidadCeldaActualizarTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaActualizarTipoValorVariableNomi(Boolean isVisibilidadCeldaActualizarTipoValorVariableNomi) {
		this.isVisibilidadCeldaActualizarTipoValorVariableNomi = isVisibilidadCeldaActualizarTipoValorVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoValorVariableNomi() {
		return isVisibilidadCeldaEliminarTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaEliminarTipoValorVariableNomi(Boolean isVisibilidadCeldaEliminarTipoValorVariableNomi) {
		this.isVisibilidadCeldaEliminarTipoValorVariableNomi = isVisibilidadCeldaEliminarTipoValorVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoValorVariableNomi() {
		return isVisibilidadCeldaCancelarTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaCancelarTipoValorVariableNomi(Boolean isVisibilidadCeldaCancelarTipoValorVariableNomi) {
		this.isVisibilidadCeldaCancelarTipoValorVariableNomi = isVisibilidadCeldaCancelarTipoValorVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoValorVariableNomi() {
		return isVisibilidadCeldaGuardarTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaGuardarTipoValorVariableNomi(Boolean isVisibilidadCeldaGuardarTipoValorVariableNomi) {
		this.isVisibilidadCeldaGuardarTipoValorVariableNomi = isVisibilidadCeldaGuardarTipoValorVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoValorVariableNomi() {
		return isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoValorVariableNomi(Boolean isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi) {
		this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi = isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi;
	}
		
	public TipoValorVariableNomiSessionBean gettipovalorvariablenomiSessionBean() {
		return this.tipovalorvariablenomiSessionBean;
	}
	
	public void settipovalorvariablenomiSessionBean(TipoValorVariableNomiSessionBean tipovalorvariablenomiSessionBean) {
		this.tipovalorvariablenomiSessionBean=tipovalorvariablenomiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoValorVariableNomi tipovalorvariablenomi,TipoValorVariableNomi tipovalorvariablenomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoValorVariableNomi(tipovalorvariablenomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipovalorvariablenomiAux.setId(tipovalorvariablenomi.getId());
		tipovalorvariablenomiAux.setVersionRow(tipovalorvariablenomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoValorVariableNomi();
		
			int intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipovalorvariablenomiValidator.getInvalidValues(this.tipovalorvariablenomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipovalorvariablenomiLogic.setDatosCliente(datosCliente);
			tipovalorvariablenomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipovalorvariablenomiAux=new  TipoValorVariableNomi();
				
				tipovalorvariablenomiAux.setIsNew(true);
				tipovalorvariablenomiAux.setIsChanged(true);
				
				tipovalorvariablenomiAux.setTipoValorVariableNomiOriginal(this.tipovalorvariablenomi);
				
				tipovalorvariablenomiAux.setId(this.tipovalorvariablenomi.getId());	
				tipovalorvariablenomiAux.setVersionRow(this.tipovalorvariablenomi.getVersionRow());	
				tipovalorvariablenomiAux.setcodigo(this.tipovalorvariablenomi.getcodigo());	
				tipovalorvariablenomiAux.setnombre(this.tipovalorvariablenomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomiLogic.getTipoValorVariableNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovalorvariablenomiLogic.saveTipoValorVariableNomis();//WithConnection
						//tipovalorvariablenomiLogic.getSetVersionRowTipoValorVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovalorvariablenomi,tipovalorvariablenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis().addAll(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis.addAll(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovalorvariablenomiLogic.saveTipoValorVariableNomiRelaciones(tipovalorvariablenomiAux,this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());//WithConnection
								//tipovalorvariablenomiLogic.getSetVersionRowTipoValorVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovalorvariablenomi,tipovalorvariablenomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis= new ArrayList<VariableNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovalorvariablenomiAux.setVariableNomis(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomiLogic.getTipoValorVariableNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovalorvariablenomi,tipovalorvariablenomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipovalorvariablenomiAux=new  TipoValorVariableNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado() 
					|| (this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado() && this.tipovalorvariablenomi.getId()>=0)) {
						
					tipovalorvariablenomiAux.setIsNew(false);
				}
				
				tipovalorvariablenomiAux.setIsDeleted(false);
			
				tipovalorvariablenomiAux.setId(this.tipovalorvariablenomi.getId());	
				tipovalorvariablenomiAux.setVersionRow(this.tipovalorvariablenomi.getVersionRow());	
				tipovalorvariablenomiAux.setcodigo(this.tipovalorvariablenomi.getcodigo());	
				tipovalorvariablenomiAux.setnombre(this.tipovalorvariablenomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomiLogic.getTipoValorVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovalorvariablenomiLogic.saveTipoValorVariableNomis();//WithConnection
						//tipovalorvariablenomiLogic.getSetVersionRowTipoValorVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovalorvariablenomi,tipovalorvariablenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis().addAll(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis.addAll(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovalorvariablenomiLogic.saveTipoValorVariableNomiRelaciones(tipovalorvariablenomiAux,this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());//WithConnection
								//tipovalorvariablenomiLogic.getSetVersionRowTipoValorVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovalorvariablenomi,tipovalorvariablenomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis= new ArrayList<VariableNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovalorvariablenomiAux.setVariableNomis(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomiLogic.getTipoValorVariableNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovalorvariablenomi,tipovalorvariablenomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipovalorvariablenomiAux=new  TipoValorVariableNomi();
				
				tipovalorvariablenomiAux.setIsNew(false);
				tipovalorvariablenomiAux.setIsChanged(false);
				
				tipovalorvariablenomiAux.setIsDeleted(true);
				
				tipovalorvariablenomiAux.setId(this.tipovalorvariablenomi.getId());	
				tipovalorvariablenomiAux.setVersionRow(this.tipovalorvariablenomi.getVersionRow());	
				tipovalorvariablenomiAux.setcodigo(this.tipovalorvariablenomi.getcodigo());	
				tipovalorvariablenomiAux.setnombre(this.tipovalorvariablenomi.getnombre());	
				
				if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipovalorvariablenomiAux.getId()>=0) {	
						this.tipovalorvariablenomisEliminados.add(tipovalorvariablenomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomiLogic.getTipoValorVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovalorvariablenomiLogic.saveTipoValorVariableNomis();//WithConnection
						//tipovalorvariablenomiLogic.getSetVersionRowTipoValorVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis().addAll(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis.addAll(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipovalorvariablenomiLogic.saveTipoValorVariableNomiRelaciones(tipovalorvariablenomiAux,this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());//WithConnection
								//tipovalorvariablenomiLogic.getSetVersionRowTipoValorVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis= new ArrayList<VariableNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tipovalorvariablenomiAux.setVariableNomis(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomiLogic.getTipoValorVariableNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipovalorvariablenomiAux,tipovalorvariablenomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().addAll(this.tipovalorvariablenomisEliminados);
					
					tipovalorvariablenomiLogic.saveTipoValorVariableNomis();//WithConnection
					//tipovalorvariablenomiLogic.getSetVersionRowTipoValorVariableNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipovalorvariablenomisEliminados= new ArrayList<TipoValorVariableNomi>();		
			}
			
			if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Valor Variable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipovalorvariablenomi=tipovalorvariablenomiAux;
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
      		//this.finishProcessTipoValorVariableNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoValorVariableNomi tipovalorvariablenomiLocal) throws Exception {
		
		if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipovalorvariablenomiLocal.setVariableNomis(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
			
			} else {
			
				tipovalorvariablenomiLocal.setVariableNomis(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoValorVariableNomi tipovalorvariablenomiLocal) throws Exception {	
		if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoValorVariableNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipovalorvariablenomiValidator.getInvalidValues(this.tipovalorvariablenomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoValorVariableNomi tipovalorvariablenomi,List<TipoValorVariableNomi> tipovalorvariablenomis) throws Exception {
		try	{		
			TipoValorVariableNomiConstantesFunciones.actualizarLista(tipovalorvariablenomi,tipovalorvariablenomis,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoValorVariableNomi tipovalorvariablenomi,List<TipoValorVariableNomi> tipovalorvariablenomis) throws Exception {
		try	{			
			TipoValorVariableNomiConstantesFunciones.actualizarSelectedLista(tipovalorvariablenomi,tipovalorvariablenomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoValorVariableNomi> tipovalorvariablenomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipovalorvariablenomisLocal=this.tipovalorvariablenomiLogic.getTipoValorVariableNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipovalorvariablenomisLocal=this.tipovalorvariablenomis;
			}
			//ARCHITECTURE
		
			for(TipoValorVariableNomi tipovalorvariablenomiLocal:tipovalorvariablenomisLocal) {
				if(this.permiteMantenimiento(tipovalorvariablenomiLocal) && tipovalorvariablenomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoValorVariableNomiConstantesFunciones.getTipoValorVariableNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoValorVariableNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValorVariableNomi.jLabelcodigoTipoValorVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoValorVariableNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValorVariableNomi.jLabelnombreTipoValorVariableNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoValorVariableNomi.jLabelcodigoTipoValorVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoValorVariableNomi.jLabelnombreTipoValorVariableNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("VariableNomi")) {
			if(this.tipovalorvariablenomi==null) {
				this.tipovalorvariablenomi= new TipoValorVariableNomi();
			}

			if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoValorVariableNomi
				this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);

				this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.getvariablenomi().setTipoValorVariableNomi(this.tipovalorvariablenomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoValorVariableNomi--;	
		
		
		this.tipovalorvariablenomiAux=new TipoValorVariableNomi();
		
		this.tipovalorvariablenomiAux.setId(this.iIdNuevoTipoValorVariableNomi);
		this.tipovalorvariablenomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().add(this.tipovalorvariablenomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipovalorvariablenomis.add(this.tipovalorvariablenomiAux);
		}
		//ARCHITECTURE
		
		this.tipovalorvariablenomi=this.tipovalorvariablenomiAux;
		
		if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoValorVariableNomi(this.tipovalorvariablenomi);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoValorVariableNomi(this.tipovalorvariablenomi);
		}
				
		//this.setDefaultControlesTipoValorVariableNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoValorVariableNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoValorVariableNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoValorVariableNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomiBean,this.tipovalorvariablenomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
			classes=TipoValorVariableNomiConstantesFunciones.getClassesRelationshipsOfTipoValorVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipovalorvariablenomiReturnGeneral=tipovalorvariablenomiLogic.procesarEventosTipoValorVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovalorvariablenomiLogic.getTipoValorVariableNomis(),this.tipovalorvariablenomi,this.tipovalorvariablenomiParameterGeneral,this.isEsNuevoTipoValorVariableNomi,classes);//this.tipovalorvariablenomiLogic.getTipoValorVariableNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral,this.tipovalorvariablenomiBean,false);
		
		if(this.tipovalorvariablenomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi());
		}
		
		if(this.tipovalorvariablenomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi(),classes);//this.tipovalorvariablenomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoValorVariableNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoValorVariableNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.RecargarFormTipoValorVariableNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoValorVariableNomi(false);
						
			if(tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getEsGuardarRelacionado() && VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVariableNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoValorVariableNomi();
			}
			
			this.actualizarVisualTableDatosTipoValorVariableNomi();
			
			this.jTableDatosTipoValorVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoValorVariableNomi(), this.getIndiceNuevoTipoValorVariableNomi());
			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
						
			this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoValorVariableNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.setEnabled(isHabilitar && this.tipovalorvariablenomiConstantesFunciones.activarcodigoTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.setEnabled(isHabilitar && this.tipovalorvariablenomiConstantesFunciones.activarnombreTipoValorVariableNomi);	
		
	};
	
	public void setDefaultControlesTipoValorVariableNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoValorVariableNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipovalorvariablenomiSessionBean.setConGuardarRelaciones(true);			
			this.tipovalorvariablenomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipovalorvariablenomiSessionBean.setConGuardarRelaciones(false);			
			this.tipovalorvariablenomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoValorVariableNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
				if(tipovalorvariablenomiAux.getId().equals(this.iIdNuevoTipoValorVariableNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomis) {
				if(tipovalorvariablenomiAux.getId().equals(this.iIdNuevoTipoValorVariableNomi)) {
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
	
	public int getIndiceActualTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
				if(tipovalorvariablenomiAux.getId().equals(tipovalorvariablenomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomis) {
				if(tipovalorvariablenomiAux.getId().equals(tipovalorvariablenomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
				if(tipovalorvariablenomiAux.getTipoValorVariableNomiOriginal().getId().equals(tipovalorvariablenomiOriginal.getId())) {
					existe=true;
					tipovalorvariablenomiOriginal.setId(tipovalorvariablenomiAux.getId());
					tipovalorvariablenomiOriginal.setVersionRow(tipovalorvariablenomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomis) {
				if(tipovalorvariablenomiAux.getTipoValorVariableNomiOriginal().getId().equals(tipovalorvariablenomiOriginal.getId())) {
					existe=true;
					tipovalorvariablenomiOriginal.setId(tipovalorvariablenomiAux.getId());
					tipovalorvariablenomiOriginal.setVersionRow(tipovalorvariablenomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoValorVariableNomi(Boolean esParaCancelar) throws Exception {
		tipovalorvariablenomisAux=new ArrayList<TipoValorVariableNomi>();
		tipovalorvariablenomiAux=new TipoValorVariableNomi();
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
					if(tipovalorvariablenomiAux.getId()<0) {
						tipovalorvariablenomisAux.add(tipovalorvariablenomiAux);
					}		
				}
				this.iIdNuevoTipoValorVariableNomi=0L;
				this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().removeAll(tipovalorvariablenomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomis) {
					if(tipovalorvariablenomiAux.getId()<0) {
						tipovalorvariablenomisAux.add(tipovalorvariablenomiAux);
					}		
				}
				this.iIdNuevoTipoValorVariableNomi=0L;
				this.tipovalorvariablenomis.removeAll(tipovalorvariablenomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoValorVariableNomi 
					&& this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().size()>0
					) {
					tipovalorvariablenomiAux=this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().get(this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().size() - 1);
				
					if(tipovalorvariablenomiAux.getId()<0) {
						this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().remove(tipovalorvariablenomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoValorVariableNomi && this.tipovalorvariablenomis.size()>0) {
					tipovalorvariablenomiAux=this.tipovalorvariablenomis.get(this.tipovalorvariablenomis.size() - 1);
				
					if(tipovalorvariablenomiAux.getId()<0) {
						this.tipovalorvariablenomis.remove(tipovalorvariablenomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoValorVariableNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipovalorvariablenomi.getId()<0) {
				this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().remove(this.tipovalorvariablenomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipovalorvariablenomi.getId()<0) {
				this.tipovalorvariablenomis.remove(this.tipovalorvariablenomi);
			}
		}			
	}
	
	public void setEstadosInicialesTipoValorVariableNomi(List<TipoValorVariableNomi> tipovalorvariablenomisAux) throws Exception {
		TipoValorVariableNomiConstantesFunciones.setEstadosInicialesTipoValorVariableNomi(tipovalorvariablenomisAux);
	}
	
	public void setEstadosInicialesTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomiAux) throws Exception {
		TipoValorVariableNomiConstantesFunciones.setEstadosInicialesTipoValorVariableNomi(tipovalorvariablenomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoValorVariableNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoValorVariableNomiActual()) {
				if(!this.isEsNuevoTipoValorVariableNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoValorVariableNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoValorVariableNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Valor Variable ?", "MANTENIMIENTO DE Tipo Valor Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoValorVariableNomi tipovalorvariablenomi) throws Exception {
		TipoValorVariableNomiConstantesFunciones.seleccionarAsignar(this.tipovalorvariablenomi,tipovalorvariablenomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoValorVariableNomi=this.isPermisoActualizarOriginalTipoValorVariableNomi;
			
			
			this.seleccionarAsignar(tipovalorvariablenomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoValorVariableNomiConstantesFunciones.quitarEspaciosTipoValorVariableNomi(this.tipovalorvariablenomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipovalorvariablenomiSessionBean.setsFuncionBusquedaRapida(this.tipovalorvariablenomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoValorVariableNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoValorVariableNomi(esParaCancelar);				
				this.cancelarNuevoTipoValorVariableNomi(esParaCancelar);								
			}
			
			this.tipovalorvariablenomi=new TipoValorVariableNomi();
			
			this.inicializarTipoValorVariableNomi();
			
			this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoValorVariableNomi() throws Exception {
		try {
			TipoValorVariableNomiConstantesFunciones.inicializarTipoValorVariableNomi(this.tipovalorvariablenomi);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoValorVariableNomis(String sAccionBusqueda,List<TipoValorVariableNomi> tipovalorvariablenomisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoValorVariableNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoValorVariableNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoValorVariableNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoValorVariableNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Valor Variables");		
		parameters.put("busquedapor", TipoValorVariableNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoValorVariableNomiLogic tipovalorvariablenomiLogicAuxiliar=new TipoValorVariableNomiLogic();
					tipovalorvariablenomiLogicAuxiliar.setDatosCliente(tipovalorvariablenomiLogic.getDatosCliente());				
					tipovalorvariablenomiLogicAuxiliar.setTipoValorVariableNomis(tipovalorvariablenomisParaReportes);
					
					tipovalorvariablenomiLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoValorVariableNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipovalorvariablenomisParaReportes=tipovalorvariablenomiLogicAuxiliar.getTipoValorVariableNomis();
					
					//tipovalorvariablenomiLogic.getNewConnexionToDeep();
					
					//for (TipoValorVariableNomi tipovalorvariablenomi:tipovalorvariablenomisParaReportes) {
					//	tipovalorvariablenomiLogic.deepLoad(tipovalorvariablenomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipovalorvariablenomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipovalorvariablenomiLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoValorVariableNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoValorVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoValorVariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoValorVariableNomi=new JRBeanArrayDataSource(TipoValorVariableNomiJInternalFrame.TraerTipoValorVariableNomiBeans(tipovalorvariablenomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoValorVariableNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoValorVariableNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoValorVariableNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoValorVariableNomiBean.TraerTipoValorVariableNomiBeans(tipovalorvariablenomisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoValorVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovalorvariablenomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoValorVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovalorvariablenomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomiActionPerformed(null);
					//this.generarExcelReporteTipoValorVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovalorvariablenomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoValorVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovalorvariablenomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoValorVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovalorvariablenomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoValorVariableNomis(sAccionBusqueda,sTipoArchivoReporte,tipovalorvariablenomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoValorVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoValorVariableNomi> tipovalorvariablenomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovalorvariablenomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoValorVariableNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoValorVariableNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoValorVariableNomi tipovalorvariablenomi : tipovalorvariablenomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoValorVariableNomiConstantesFunciones.generarExcelReporteDataTipoValorVariableNomi("NORMAL",row,workbook,tipovalorvariablenomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoValorVariableNomi(String sTipo,Row row,Workbook workbook) {
		
		TipoValorVariableNomiConstantesFunciones.generarExcelReporteHeaderTipoValorVariableNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoValorVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoValorVariableNomi> tipovalorvariablenomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovalorvariablenomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoValorVariableNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoValorVariableNomi tipovalorvariablenomi : tipovalorvariablenomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoValorVariableNomiConstantesFunciones.getTipoValorVariableNomiDescripcion(tipovalorvariablenomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovalorvariablenomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovalorvariablenomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoValorVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoValorVariableNomi> tipovalorvariablenomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoValorVariableNomi> tipovalorvariablenomisRespaldo=null;
		
		classes=TipoValorVariableNomiConstantesFunciones.getClassesRelationshipsOfTipoValorVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipovalorvariablenomiLogic.setDatosCliente(this.datosCliente);
		this.tipovalorvariablenomiLogic.setDatosDeep(this.datosDeep);
		this.tipovalorvariablenomiLogic.setIsConDeep(true);
		
		tipovalorvariablenomisRespaldo=this.tipovalorvariablenomiLogic.getTipoValorVariableNomis();
		
		this.tipovalorvariablenomiLogic.setTipoValorVariableNomis(tipovalorvariablenomisParaReportes);	
		this.tipovalorvariablenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipovalorvariablenomisParaReportes=this.tipovalorvariablenomiLogic.getTipoValorVariableNomis();
		this.tipovalorvariablenomiLogic.setTipoValorVariableNomis(tipovalorvariablenomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovalorvariablenomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoValorVariableNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoValorVariableNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoValorVariableNomi tipovalorvariablenomi : tipovalorvariablenomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoValorVariableNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoValorVariableNomiConstantesFunciones.generarExcelReporteDataTipoValorVariableNomi("NORMAL",row,workbook,tipovalorvariablenomi,cellStyleDataAux);
		
			
			


				//VariableNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(VariableNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovalorvariablenomi.getVariableNomis()!=null && tipovalorvariablenomi.getVariableNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(VariableNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					VariableNomiConstantesFunciones.generarExcelReporteHeaderVariableNomi("RELACIONADO",row,workbook);
				}

				if(tipovalorvariablenomi.getVariableNomis()!=null) {
					i2=0;
					for(VariableNomi variablenomi : tipovalorvariablenomi.getVariableNomis()) {
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
		cell.setCellValue(TipoValorVariableNomiConstantesFunciones.getTipoValorVariableNomiDescripcion(tipovalorvariablenomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoValorVariableNomi() throws Exception {		
		this.startProcessTipoValorVariableNomi(true);
	}
	
	public void startProcessTipoValorVariableNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoValorVariableNomi, this.jScrollPanelDatosTipoValorVariableNomi,this.jPanelPaginacionTipoValorVariableNomi, this.jScrollPanelDatosEdicionTipoValorVariableNomi, this.jPanelAccionesTipoValorVariableNomi,this.jPanelAccionesFormularioTipoValorVariableNomi,this.jmenuBarTipoValorVariableNomi,this.jmenuBarDetalleTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,this.jTtoolBarDetalleTipoValorVariableNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoValorVariableNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoValorVariableNomi=this.jPanelParametrosReportesTipoValorVariableNomi;
		//final JScrollPane jScrollPanelDatosTipoValorVariableNomi=this.jScrollPanelDatosTipoValorVariableNomi;
		final JTable jTableDatosTipoValorVariableNomi=this.jTableDatosTipoValorVariableNomi;		
		final JPanel jPanelPaginacionTipoValorVariableNomi=this.jPanelPaginacionTipoValorVariableNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoValorVariableNomi=this.jScrollPanelDatosEdicionTipoValorVariableNomi;
		final JPanel jPanelAccionesTipoValorVariableNomi=this.jPanelAccionesTipoValorVariableNomi;
		
		JPanel jPanelCamposAuxiliarTipoValorVariableNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoValorVariableNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			jPanelCamposAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jPanelCamposTipoValorVariableNomi;
			jPanelAccionesFormularioAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jPanelAccionesFormularioTipoValorVariableNomi;
		}
		
		final JPanel jPanelCamposTipoValorVariableNomi=jPanelCamposAuxiliarTipoValorVariableNomi;
		final JPanel jPanelAccionesFormularioTipoValorVariableNomi=jPanelAccionesFormularioAuxiliarTipoValorVariableNomi;
		
		
		final JMenuBar jmenuBarTipoValorVariableNomi=this.jmenuBarTipoValorVariableNomi;
		final JToolBar jTtoolBarTipoValorVariableNomi=this.jTtoolBarTipoValorVariableNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoValorVariableNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoValorVariableNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			jmenuBarDetalleAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jmenuBarDetalleTipoValorVariableNomi;
			jTtoolBarDetalleAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jTtoolBarDetalleTipoValorVariableNomi;
		}
		
		final JMenuBar jmenuBarDetalleTipoValorVariableNomi=jmenuBarDetalleAuxiliarTipoValorVariableNomi;
		final JToolBar jTtoolBarDetalleTipoValorVariableNomi=jTtoolBarDetalleAuxiliarTipoValorVariableNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoValorVariableNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoValorVariableNomi;
			processRunnable.jTableDatos=jTableDatosTipoValorVariableNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoValorVariableNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoValorVariableNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoValorVariableNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoValorVariableNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoValorVariableNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoValorVariableNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoValorVariableNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoValorVariableNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoValorVariableNomi ,jPanelParametrosReportesTipoValorVariableNomi,jTableDatosTipoValorVariableNomi, /*jScrollPanelDatosTipoValorVariableNomi,*/jPanelCamposTipoValorVariableNomi,jPanelPaginacionTipoValorVariableNomi, /*jScrollPanelDatosEdicionTipoValorVariableNomi,*/ jPanelAccionesTipoValorVariableNomi,jPanelAccionesFormularioTipoValorVariableNomi,jmenuBarTipoValorVariableNomi,jmenuBarDetalleTipoValorVariableNomi,jTtoolBarTipoValorVariableNomi,jTtoolBarDetalleTipoValorVariableNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoValorVariableNomi, jScrollPanelDatosTipoValorVariableNomi,jPanelPaginacionTipoValorVariableNomi, jScrollPanelDatosEdicionTipoValorVariableNomi, jPanelAccionesTipoValorVariableNomi,jPanelAccionesFormularioTipoValorVariableNomi,jmenuBarTipoValorVariableNomi,jmenuBarDetalleTipoValorVariableNomi,jTtoolBarTipoValorVariableNomi,jTtoolBarDetalleTipoValorVariableNomi);
						
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
	
	public void finishProcessTipoValorVariableNomi() {// throws Exception 
		this.finishProcessTipoValorVariableNomi(true);
	}
	
	public void finishProcessTipoValorVariableNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoValorVariableNomi, this.jScrollPanelDatosTipoValorVariableNomi,this.jPanelPaginacionTipoValorVariableNomi, this.jScrollPanelDatosEdicionTipoValorVariableNomi, this.jPanelAccionesTipoValorVariableNomi,this.jPanelAccionesFormularioTipoValorVariableNomi,this.jmenuBarTipoValorVariableNomi,this.jmenuBarDetalleTipoValorVariableNomi,this.jTtoolBarTipoValorVariableNomi,this.jTtoolBarDetalleTipoValorVariableNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoValorVariableNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoValorVariableNomi=this.jPanelParametrosReportesTipoValorVariableNomi;
		//final JScrollPane jScrollPanelDatosTipoValorVariableNomi=this.jScrollPanelDatosTipoValorVariableNomi;
		final JTable jTableDatosTipoValorVariableNomi=this.jTableDatosTipoValorVariableNomi;		
		final JPanel jPanelPaginacionTipoValorVariableNomi=this.jPanelPaginacionTipoValorVariableNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoValorVariableNomi=this.jScrollPanelDatosEdicionTipoValorVariableNomi;
		final JPanel jPanelAccionesTipoValorVariableNomi=this.jPanelAccionesTipoValorVariableNomi;
		
		JPanel jPanelCamposAuxiliarTipoValorVariableNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoValorVariableNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			jPanelCamposAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jPanelCamposTipoValorVariableNomi;
			jPanelAccionesFormularioAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jPanelAccionesFormularioTipoValorVariableNomi;
		}
		
		final JPanel jPanelCamposTipoValorVariableNomi=jPanelCamposAuxiliarTipoValorVariableNomi;
		final JPanel jPanelAccionesFormularioTipoValorVariableNomi=jPanelAccionesFormularioAuxiliarTipoValorVariableNomi;
		
		
		final JMenuBar jmenuBarTipoValorVariableNomi=this.jmenuBarTipoValorVariableNomi;		
		final JToolBar jTtoolBarTipoValorVariableNomi=this.jTtoolBarTipoValorVariableNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoValorVariableNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoValorVariableNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			jmenuBarDetalleAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jmenuBarDetalleTipoValorVariableNomi;
			jTtoolBarDetalleAuxiliarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jTtoolBarDetalleTipoValorVariableNomi;		
		}
		
		final JMenuBar jmenuBarDetalleTipoValorVariableNomi=jmenuBarDetalleAuxiliarTipoValorVariableNomi;
		final JToolBar jTtoolBarDetalleTipoValorVariableNomi=jTtoolBarDetalleAuxiliarTipoValorVariableNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoValorVariableNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoValorVariableNomi;
			processRunnable.jTableDatos=jTableDatosTipoValorVariableNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoValorVariableNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoValorVariableNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoValorVariableNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoValorVariableNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoValorVariableNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoValorVariableNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoValorVariableNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoValorVariableNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoValorVariableNomi ,jPanelParametrosReportesTipoValorVariableNomi, jTableDatosTipoValorVariableNomi,/*jScrollPanelDatosTipoValorVariableNomi,*/jPanelCamposTipoValorVariableNomi,jPanelPaginacionTipoValorVariableNomi, /*jScrollPanelDatosEdicionTipoValorVariableNomi,*/ jPanelAccionesTipoValorVariableNomi,jPanelAccionesFormularioTipoValorVariableNomi,jmenuBarTipoValorVariableNomi,jmenuBarDetalleTipoValorVariableNomi,jTtoolBarTipoValorVariableNomi,jTtoolBarDetalleTipoValorVariableNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoValorVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoValorVariableNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoValorVariableNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoValorVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoValorVariableNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoValorVariableNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoValorVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoValorVariableNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoValorVariableNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipovalorvariablenomiConstantesFunciones.getsFinalQueryTipoValorVariableNomi();
		String  finalQueryPaginacionTodos=this.tipovalorvariablenomiConstantesFunciones.getsFinalQueryTipoValorVariableNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoValorVariableNomiConstantesFunciones.getArrayColumnasGlobalesNoTipoValorVariableNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoValorVariableNomiConstantesFunciones.getArrayColumnasGlobalesTipoValorVariableNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoValorVariableNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipovalorvariablenomisEliminados= new ArrayList<TipoValorVariableNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoValorVariableNomi();
		
				///*TipoValorVariableNomiSessionBean*/this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
			
			if(this.tipovalorvariablenomiSessionBean==null) {
				this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
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
					this.iNumeroPaginacion=TipoValorVariableNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoValorVariableNomiConstantesFunciones.getClassesForeignKeysOfTipoValorVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipovalorvariablenomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipovalorvariablenomisAux= new ArrayList<TipoValorVariableNomi>();
			
				
			tipovalorvariablenomiLogic.setDatosCliente(this.datosCliente);
			tipovalorvariablenomiLogic.setDatosDeep(this.datosDeep);
			tipovalorvariablenomiLogic.setIsConDeep(true);
			
			
			tipovalorvariablenomiLogic.getTipoValorVariableNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipovalorvariablenomiLogic.getTodosTipoValorVariableNomis(finalQueryGlobal,pagination);
					
					//tipovalorvariablenomiLogic.getTodosTipoValorVariableNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipovalorvariablenomiLogic.getTipoValorVariableNomis()==null|| tipovalorvariablenomiLogic.getTipoValorVariableNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovalorvariablenomisAux= new ArrayList<TipoValorVariableNomi>();
							tipovalorvariablenomisAux.addAll(tipovalorvariablenomiLogic.getTipoValorVariableNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovalorvariablenomisAux= new ArrayList<TipoValorVariableNomi>();
							tipovalorvariablenomisAux.addAll(tipovalorvariablenomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovalorvariablenomiLogic.getTodosTipoValorVariableNomis(finalQueryGlobal+"",this.pagination);												
							
							//tipovalorvariablenomiLogic.getTodosTipoValorVariableNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomiLogic.getTipoValorVariableNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipovalorvariablenomiLogic.setTipoValorVariableNomis(new ArrayList<TipoValorVariableNomi>());					
							tipovalorvariablenomiLogic.getTipoValorVariableNomis().addAll(tipovalorvariablenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovalorvariablenomis=new ArrayList<TipoValorVariableNomi>();
							tipovalorvariablenomis.addAll(tipovalorvariablenomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoValorVariableNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoValorVariableNomi=this.idActual;
				
				} else if(this.idTipoValorVariableNomiActual!=null && this.idTipoValorVariableNomiActual!=0L) {
					idTipoValorVariableNomi=idTipoValorVariableNomiActual;
				}
				
					
				this.sDetalleReporte=TipoValorVariableNomiConstantesFunciones.getDetalleIndicePorId(idTipoValorVariableNomi);
				
				this.tipovalorvariablenomis=new ArrayList<TipoValorVariableNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipovalorvariablenomiLogic.getEntity(idTipoValorVariableNomi);
					
					//tipovalorvariablenomiLogic.getEntityWithConnection(idTipoValorVariableNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovalorvariablenomiLogic.setTipoValorVariableNomis(new ArrayList<TipoValorVariableNomi>());
					tipovalorvariablenomiLogic.getTipoValorVariableNomis().add(tipovalorvariablenomiLogic.getTipoValorVariableNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovalorvariablenomis=new ArrayList<TipoValorVariableNomi>();
					this.tipovalorvariablenomis.add(tipovalorvariablenomi);
				}
				
				if(tipovalorvariablenomiLogic.getTipoValorVariableNomi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoValorVariableNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoValorVariableNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovalorvariablenomiLogic.getTipoValorVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovalorvariablenomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipovalorvariablenomiLogic.getTipoValorVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipovalorvariablenomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoValorVariableNomi tipovalorvariablenomi) {
		Boolean permite=true;
		
		if(this.tipovalorvariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoValorVariableNomiConstantesFunciones.getOrderByListaTipoValorVariableNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoValorVariableNomiConstantesFunciones.getOrderByListaTipoValorVariableNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValorVariableNomi tipovalorvariablenomi:tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
				if(tipovalorvariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovalorvariablenomiTotales=tipovalorvariablenomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValorVariableNomi tipovalorvariablenomi:this.tipovalorvariablenomis) {
				if(tipovalorvariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovalorvariablenomiTotales=tipovalorvariablenomi;
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
			this.tipovalorvariablenomiAux=new TipoValorVariableNomi();
			this.tipovalorvariablenomiAux.setsType(Constantes2.S_TOTALES);
			this.tipovalorvariablenomiAux.setIsNew(false);
			this.tipovalorvariablenomiAux.setIsChanged(false);
			this.tipovalorvariablenomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoValorVariableNomiConstantesFunciones.TotalizarValoresFilaTipoValorVariableNomi(this.tipovalorvariablenomiLogic.getTipoValorVariableNomis(),this.tipovalorvariablenomiAux);
				
				this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().add(this.tipovalorvariablenomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoValorVariableNomiConstantesFunciones.TotalizarValoresFilaTipoValorVariableNomi(this.tipovalorvariablenomis,this.tipovalorvariablenomiAux);
				
				this.tipovalorvariablenomis.add(this.tipovalorvariablenomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipovalorvariablenomiTotales=new TipoValorVariableNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().remove(tipovalorvariablenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipovalorvariablenomis.remove(tipovalorvariablenomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipovalorvariablenomiTotales=new TipoValorVariableNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoValorVariableNomi tipovalorvariablenomi:tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
				if(tipovalorvariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovalorvariablenomiTotales=tipovalorvariablenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoValorVariableNomiConstantesFunciones.TotalizarValoresFilaTipoValorVariableNomi(this.tipovalorvariablenomiLogic.getTipoValorVariableNomis(),tipovalorvariablenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoValorVariableNomi tipovalorvariablenomi:this.tipovalorvariablenomis) {
				if(tipovalorvariablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					tipovalorvariablenomiTotales=tipovalorvariablenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoValorVariableNomiConstantesFunciones.TotalizarValoresFilaTipoValorVariableNomi(this.tipovalorvariablenomis,tipovalorvariablenomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoValorVariableNomi() {
		this.isPermisoTodoTipoValorVariableNomi=false;
		this.isPermisoNuevoTipoValorVariableNomi=false;
		this.isPermisoActualizarTipoValorVariableNomi=false;
		this.isPermisoActualizarOriginalTipoValorVariableNomi=false;
		this.isPermisoEliminarTipoValorVariableNomi=false;
		this.isPermisoGuardarCambiosTipoValorVariableNomi=false;
		this.isPermisoConsultaTipoValorVariableNomi=false;
		this.isPermisoBusquedaTipoValorVariableNomi=false;
		this.isPermisoReporteTipoValorVariableNomi=false;		
		this.isPermisoOrdenTipoValorVariableNomi=false;		
		this.isPermisoPaginacionMedioTipoValorVariableNomi=false;		
		this.isPermisoPaginacionAltoTipoValorVariableNomi=false;
		this.isPermisoPaginacionTodoTipoValorVariableNomi=false;
		this.isPermisoCopiarTipoValorVariableNomi=false;		
		this.isPermisoVerFormTipoValorVariableNomi=false;		
		this.isPermisoDuplicarTipoValorVariableNomi=false;		
		this.isPermisoOrdenTipoValorVariableNomi=false;		
	}
	
	public void setPermisosUsuarioTipoValorVariableNomi(Boolean isPermiso) {
		this.isPermisoTodoTipoValorVariableNomi=isPermiso;
		this.isPermisoNuevoTipoValorVariableNomi=isPermiso;
		this.isPermisoActualizarTipoValorVariableNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoValorVariableNomi=isPermiso;
		this.isPermisoEliminarTipoValorVariableNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoValorVariableNomi=isPermiso;
		this.isPermisoConsultaTipoValorVariableNomi=isPermiso;
		this.isPermisoBusquedaTipoValorVariableNomi=isPermiso;
		this.isPermisoReporteTipoValorVariableNomi=isPermiso;
		this.isPermisoOrdenTipoValorVariableNomi=isPermiso;		
		this.isPermisoPaginacionMedioTipoValorVariableNomi=isPermiso;		
		this.isPermisoPaginacionAltoTipoValorVariableNomi=isPermiso;		
		this.isPermisoPaginacionTodoTipoValorVariableNomi=isPermiso;		
		this.isPermisoCopiarTipoValorVariableNomi=isPermiso;		
		this.isPermisoVerFormTipoValorVariableNomi=isPermiso;		
		this.isPermisoDuplicarTipoValorVariableNomi=isPermiso;
		this.isPermisoOrdenTipoValorVariableNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoValorVariableNomi(Boolean isPermiso) {
		//this.isPermisoTodoTipoValorVariableNomi=isPermiso;
		this.isPermisoNuevoTipoValorVariableNomi=isPermiso;
		this.isPermisoActualizarTipoValorVariableNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoValorVariableNomi=isPermiso;
		this.isPermisoEliminarTipoValorVariableNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoValorVariableNomi=isPermiso;
		//this.isPermisoConsultaTipoValorVariableNomi=isPermiso;
		//this.isPermisoBusquedaTipoValorVariableNomi=isPermiso;
		//this.isPermisoReporteTipoValorVariableNomi=isPermiso;
		//this.isPermisoOrdenTipoValorVariableNomi=isPermiso;		
		//this.isPermisoPaginacionMedioTipoValorVariableNomi=isPermiso;		
		//this.isPermisoPaginacionAltoTipoValorVariableNomi=isPermiso;		
		//this.isPermisoPaginacionTodoTipoValorVariableNomi=isPermiso;		
		//this.isPermisoCopiarTipoValorVariableNomi=isPermiso;		
		//this.isPermisoDuplicarTipoValorVariableNomi=isPermiso;
		//this.isPermisoOrdenTipoValorVariableNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoValorVariableNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(VariableNomiConstantesFunciones.SNOMBREOPCION);
		
		if(TipoValorVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosVariableNomi=this.verificarGetPermisosUsuarioOpcionTipoValorVariableNomiClaseRelacionada(this.opcionsRelacionadas,VariableNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoValorVariableNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoValorVariableNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosVariableNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoValorVariableNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoValorVariableNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoValorVariableNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosVariableNomi && this.jInternalFrameDetalleFormTipoValorVariableNomi!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.remove(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoValorVariableNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoValorVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoValorVariableNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoValorVariableNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoValorVariableNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoValorVariableNomi=this.isPermisoActualizarTipoValorVariableNomi;
			this.isPermisoEliminarTipoValorVariableNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoValorVariableNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoValorVariableNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoValorVariableNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoValorVariableNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoValorVariableNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoValorVariableNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoValorVariableNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoValorVariableNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoValorVariableNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoValorVariableNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoValorVariableNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoValorVariableNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoValorVariableNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoValorVariableNomi.setToolTipText(this.jTableDatosTipoValorVariableNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoValorVariableNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoValorVariableNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoValorVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoValorVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoValorVariableNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosVariableNomi && this.tipovalorvariablenomiConstantesFunciones.mostrarVariableNomiTipoValorVariableNomi && !TipoValorVariableNomiConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoValorVariableNomiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoValorVariableNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoValorVariableNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoValorVariableNomiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoValorVariableNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoValorVariableNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoValorVariableNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoValorVariableNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoValorVariableNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoValorVariableNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoValorVariableNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoValorVariableNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoValorVariableNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoValorVariableNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoValorVariableNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoValorVariableNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoValorVariableNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoValorVariableNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoValorVariableNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoValorVariableNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoValorVariableNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean(); 
		this.tipovalorvariablenomiConstantesFunciones=new TipoValorVariableNomiConstantesFunciones(); 
		this.tipovalorvariablenomiBean=new TipoValorVariableNomi();//(this.tipovalorvariablenomiConstantesFunciones); 		
		this.tipovalorvariablenomiReturnGeneral=new TipoValorVariableNomiParameterReturnGeneral(); 
		
		this.tipovalorvariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovalorvariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoValorVariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoValorVariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoValorVariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoValorVariableNomi(true);
			
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
			
			this.tipovalorvariablenomiConstantesFunciones=new TipoValorVariableNomiConstantesFunciones(); 
			this.tipovalorvariablenomiBean=new TipoValorVariableNomi();//this.tipovalorvariablenomiConstantesFunciones); 			
			this.tipovalorvariablenomiReturnGeneral=new TipoValorVariableNomiParameterReturnGeneral(); 
		
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Valor Variable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipovalorvariablenomi=new TipoValorVariableNomi();
			this.tipovalorvariablenomis = new ArrayList<TipoValorVariableNomi>();
			this.tipovalorvariablenomisAux = new ArrayList<TipoValorVariableNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic=new TipoValorVariableNomiLogic();
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.tipovalorvariablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipovalorvariablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoValorVariableNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoValorVariableNomi);	
					}
					
					if(this.jInternalFrameImportacionTipoValorVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoValorVariableNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoValorVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoValorVariableNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoValorVariableNomi);
				this.jInternalFrameDetalleFormTipoValorVariableNomi.setVisible(false);
				this.jInternalFrameDetalleFormTipoValorVariableNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoValorVariableNomi);
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoValorVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoValorVariableNomi);
					this.jInternalFrameImportacionTipoValorVariableNomi.setVisible(false);
					this.jInternalFrameImportacionTipoValorVariableNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoValorVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoValorVariableNomi);
					this.jInternalFrameOrderByTipoValorVariableNomi.setVisible(false);
					this.jInternalFrameOrderByTipoValorVariableNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoValorVariableNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoValorVariableNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipovalorvariablenomiReturnGeneral=new TipoValorVariableNomiParameterReturnGeneral();
			
			this.tipovalorvariablenomiParameterGeneral=new TipoValorVariableNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipovalorvariablenomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoValorVariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(VariableNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoValorVariableNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado(),this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoValorVariableNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado(),this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
			this.isVisibilidadCeldaDuplicarTipoValorVariableNomi=true;
			this.isVisibilidadCeldaCopiarTipoValorVariableNomi=true;
			this.isVisibilidadCeldaVerFormTipoValorVariableNomi=true;
			this.isVisibilidadCeldaOrdenTipoValorVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoValorVariableNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoValorVariableNomi(false);
			
			this.setPermisosUsuarioTipoValorVariableNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado() 
				|| (this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado() && this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoValorVariableNomiClasesRelacionadas();
			}
			
			if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoValorVariableNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoValorVariableNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoValorVariableNomi();
			}
			
			if(!this.isPermisoBusquedaTipoValorVariableNomi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoValorVariableNomi,this.isPermisoPaginacionMedioTipoValorVariableNomi,this.isPermisoPaginacionTodoTipoValorVariableNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoValorVariableNomiConstantesFunciones.getTiposSeleccionarTipoValorVariableNomi());
				
				this.tiposColumnasSelect=TipoValorVariableNomiConstantesFunciones.getTiposSeleccionarTipoValorVariableNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoValorVariableNomi();				
				//this.tiposRelacionesSelect=TipoValorVariableNomiConstantesFunciones.getTiposRelacionesTipoValorVariableNomi(true);
				
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
			//if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoValorVariableNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoValorVariableNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoValorVariableNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoValorVariableNomi() ;
			
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
				tipovalorvariablenomiImplementable= (TipoValorVariableNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoValorVariableNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipovalorvariablenomiImplementableHome= (TipoValorVariableNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoValorVariableNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipovalorvariablenomis= new ArrayList<TipoValorVariableNomi>();
			this.tipovalorvariablenomisEliminados= new ArrayList<TipoValorVariableNomi>();
						
			this.isEsNuevoTipoValorVariableNomi=false;
			this.esParaAccionDesdeFormularioTipoValorVariableNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoValorVariableNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoValorVariableNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoValorVariableNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoValorVariableNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoValorVariableNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoValorVariableNomi();
			}
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoValorVariableNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoValorVariableNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoValorVariableNomi() {
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
			if(sTipo.equals("RelacionesTipoValorVariableNomi")) {
				iIndex=this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Variable Nominas")) {
					if(!VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoValorVariableNomi();

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
				this.finishProcessTipoValorVariableNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaVariableNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoValorVariableNomi.cargarSessionConBeanSwingJInternalFrameVariableNomi(false,true,iIndex);
		this.jButtonVariableNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVariableNomi();

		//this.jTabbedPaneRelacionesTipoValorVariableNomi.updateUI();
		//this.jTabbedPaneRelacionesTipoValorVariableNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoValorVariableNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("VariableNomi")) {
				int row=this.jTableDatosTipoValorVariableNomi.getSelectedRow();
				jButtonVariableNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Variable Nomina")) {

					if(this.isTienePermisosVariableNomi && this.tipovalorvariablenomiConstantesFunciones.mostrarVariableNomiTipoValorVariableNomi && !TipoValorVariableNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Variable Nominas"+"("+VariableNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Variable Nominas");

						if(tipovalorvariablenomiConstantesFunciones.resaltarVariableNomiTipoValorVariableNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipovalorvariablenomiConstantesFunciones.resaltarVariableNomiTipoValorVariableNomi);
						}

						jmenuItem.setEnabled(this.tipovalorvariablenomiConstantesFunciones.activarVariableNomiTipoValorVariableNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"VariableNomi"));

						

						this.jInternalFrameDetalleFormTipoValorVariableNomi.jmenuDetalleTipoValorVariableNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoValorVariableNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoValorVariableNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoValorVariableNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoValorVariableNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoValorVariableNomi();
		
		this.cargarCombosFrameForeignKeyTipoValorVariableNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoValorVariableNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoValorVariableNomi();
		}
	}
	
	
	
	public void jButtonNuevoTipoValorVariableNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
			
			if(jTableDatosTipoValorVariableNomi.getRowCount()>=1) {
				jTableDatosTipoValorVariableNomi.removeRowSelectionInterval(0, jTableDatosTipoValorVariableNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoValorVariableNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoValorVariableNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoValorVariableNomi(true);			
			//this.tipovalorvariablenomi=new TipoValorVariableNomi();
			//this.tipovalorvariablenomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoValorVariableNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi() ;
			
			if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoValorVariableNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipovalorvariablenomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);				
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
			if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoValorVariableNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoValorVariableNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoValorVariableNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoValorVariableNomi.getSelectedRows().length;			
			}
			
			tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoValorVariableNomi--;			
				//TipoValorVariableNomi tipovalorvariablenomiAux= new TipoValorVariableNomi();			
				//tipovalorvariablenomiAux.setId(this.iIdNuevoTipoValorVariableNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoValorVariableNomi tipovalorvariablenomiOrigen=new TipoValorVariableNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoValorVariableNomi tipovalorvariablenomiOrigen : tipovalorvariablenomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipovalorvariablenomiOrigen =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipovalorvariablenomiOrigen =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoValorVariableNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipovalorvariablenomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoValorVariableNomi(tipovalorvariablenomiOrigen,this.tipovalorvariablenomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().add(this.tipovalorvariablenomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovalorvariablenomis.add(this.tipovalorvariablenomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
				
				this.jTableDatosTipoValorVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoValorVariableNomi(), this.getIndiceNuevoTipoValorVariableNomi());
				
				int iLastRow =  this.jTableDatosTipoValorVariableNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoValorVariableNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoValorVariableNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();									
		
			TipoValorVariableNomi tipovalorvariablenomiOrigen=new TipoValorVariableNomi();
			TipoValorVariableNomi tipovalorvariablenomiDestino=new TipoValorVariableNomi();
				
			tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoValorVariableNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipovalorvariablenomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoValorVariableNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovalorvariablenomiOrigen =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovalorvariablenomiOrigen =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipovalorvariablenomiDestino =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipovalorvariablenomiDestino =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipovalorvariablenomiOrigen =tipovalorvariablenomisSeleccionados.get(0);
				tipovalorvariablenomiDestino =tipovalorvariablenomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoValorVariableNomi(tipovalorvariablenomiOrigen,tipovalorvariablenomiDestino,true,false);
				
				tipovalorvariablenomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipovalorvariablenomiDestino,tipovalorvariablenomiLogic.getTipoValorVariableNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipovalorvariablenomiDestino,tipovalorvariablenomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
				
				//this.jTableDatosTipoValorVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoValorVariableNomi(), this.getIndiceNuevoTipoValorVariableNomi());
				
				int iLastRow =  this.jTableDatosTipoValorVariableNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoValorVariableNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoValorVariableNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoValorVariableNomi.isVisible();
			
			
			this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(!isVisible);
			this.jPanelPaginacionTipoValorVariableNomi.setVisible(!isVisible);
			this.jPanelAccionesTipoValorVariableNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoValorVariableNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoValorVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoValorVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoValorVariableNomi();
			
			this.abrirFrameOrderByTipoValorVariableNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoValorVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoValorVariableNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoValorVariableNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoValorVariableNomi.isMaximum()) {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoValorVariableNomi.setSize(this.jInternalFrameDetalleFormTipoValorVariableNomi.iWidthFormulario,this.jInternalFrameDetalleFormTipoValorVariableNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoValorVariableNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoValorVariableNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoValorVariableNomi.isMaximum()) {
						this.jInternalFrameDetalleFormTipoValorVariableNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoValorVariableNomi.jContentPaneDetalleTipoValorVariableNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoValorVariableNomi.jContentPaneDetalleTipoValorVariableNomi.getWidth(),TipoValorVariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoValorVariableNomi.jContentPaneDetalleTipoValorVariableNomi.getWidth(),TipoValorVariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoValorVariableNomi.jContentPaneDetalleTipoValorVariableNomi.getWidth(),TipoValorVariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVariableNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoValorVariableNomi.setVisible(true);
	        this.jInternalFrameDetalleFormTipoValorVariableNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoValorVariableNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoValorVariableNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoValorVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValorVariableNomi,false,this);
				} else {
					this.jInternalFrameOrderByTipoValorVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoValorVariableNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoValorVariableNomi);
				this.jInternalFrameOrderByTipoValorVariableNomi.setVisible(false);
				this.jInternalFrameOrderByTipoValorVariableNomi.setSelected(false);
				
				this.jInternalFrameOrderByTipoValorVariableNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoValorVariableNomi"));
				
				this.inicializarActualizarBindingTablaOrderByTipoValorVariableNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoValorVariableNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoValorVariableNomi==null) {
				
				this.jInternalFrameImportacionTipoValorVariableNomi=new ImportacionJInternalFrame(TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoValorVariableNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoValorVariableNomi);
				this.jInternalFrameImportacionTipoValorVariableNomi.setVisible(false);
				this.jInternalFrameImportacionTipoValorVariableNomi.setSelected(false);


				this.jInternalFrameImportacionTipoValorVariableNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoValorVariableNomi"));
				this.jInternalFrameImportacionTipoValorVariableNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoValorVariableNomi"));
				this.jInternalFrameImportacionTipoValorVariableNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoValorVariableNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoValorVariableNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi==null) {
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi=new ReporteDinamicoJInternalFrame(TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoValorVariableNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoValorVariableNomi);
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoValorVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoValorVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoValorVariableNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoValorVariableNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaVariableNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoValorVariableNomi.jContentPaneDetalleTipoValorVariableNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoValorVariableNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoValorVariableNomi);
			
	       	this.jInternalFrameDetalleFormTipoValorVariableNomi.setVisible(false);
	        this.jInternalFrameDetalleFormTipoValorVariableNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoValorVariableNomi.dispose();
			//this.jInternalFrameDetalleFormTipoValorVariableNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoValorVariableNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoValorVariableNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoValorVariableNomi.setVisible(true);
	        this.jInternalFrameImportacionTipoValorVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoValorVariableNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoValorVariableNomi.setVisible(true);
	        this.jInternalFrameOrderByTipoValorVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoValorVariableNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoValorVariableNomi.setVisible(false);
	        this.jInternalFrameOrderByTipoValorVariableNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoValorVariableNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoValorVariableNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoValorVariableNomi.setVisible(false);
	        this.jInternalFrameImportacionTipoValorVariableNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoValorVariableNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoValorVariableNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoValorVariableNomi(true);
			//this.isEsNuevoTipoValorVariableNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoValorVariableNomi(false) ;
			
			if(tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getEsGuardarRelacionado() && VariableNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVariableNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoValorVariableNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoValorVariableNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoValorVariableNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoValorVariableNomi(true);
			//this.isEsNuevoTipoValorVariableNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipovalorvariablenomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoValorVariableNomi(false) ;
			
			if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoValorVariableNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoValorVariableNomi(false);
			
			//if(!this.isEsNuevoTipoValorVariableNomi) {								
				int intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
				
			}
			
			if(this.permiteMantenimiento(this.tipovalorvariablenomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoValorVariableNomi=true;
					this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
					this.isEsNuevoTipoValorVariableNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoValorVariableNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoValorVariableNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoValorVariableNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi(false);
				
				this.habilitarDeshabilitarControlesTipoValorVariableNomi(false);
			
												
				
				if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoValorVariableNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoValorVariableNomiActionPerformed(evt,tipovalorvariablenomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoValorVariableNomi(this.tipovalorvariablenomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoValorVariableNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipovalorvariablenomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipovalorvariablenomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				this.tipovalorvariablenomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				this.tipovalorvariablenomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipovalorvariablenomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoValorVariableNomiModel) this.jTableDatosTipoValorVariableNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoValorVariableNomi=true;
				this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
				this.isEsNuevoTipoValorVariableNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoValorVariableNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi(false);
				
				this.habilitarDeshabilitarControlesTipoValorVariableNomi(false);
				
				
				
				if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoValorVariableNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoValorVariableNomi.getRowCount()>=1) {
				jTableDatosTipoValorVariableNomi.removeRowSelectionInterval(0, jTableDatosTipoValorVariableNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoValorVariableNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoValorVariableNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi(false) ;
			
			this.isEsNuevoTipoValorVariableNomi=false;
			
			if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoValorVariableNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoValorVariableNomi(false);
				
				//SI ES MANUAL
				if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoValorVariableNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoValorVariableNomi--;			
			//TipoValorVariableNomi tipovalorvariablenomiAux= new TipoValorVariableNomi();			
			//tipovalorvariablenomiAux.setId(this.iIdNuevoTipoValorVariableNomi);
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoValorVariableNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
			
			this.tipovalorvariablenomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().add(this.tipovalorvariablenomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipovalorvariablenomis.add(this.tipovalorvariablenomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
			
			this.jTableDatosTipoValorVariableNomi.setRowSelectionInterval(this.getIndiceNuevoTipoValorVariableNomi(), this.getIndiceNuevoTipoValorVariableNomi());
			
			int iLastRow =  this.jTableDatosTipoValorVariableNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoValorVariableNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoValorVariableNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoValorVariableNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValorVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoValorVariableNomi();
			}
			
			//this.abrirFrameTreeTipoValorVariableNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Valor VariableS ?", "MANTENIMIENTO DE Tipo Valor Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoValorVariableNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoValorVariableNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipovalorvariablenomiReturnGeneral=tipovalorvariablenomiLogic.procesarImportacionTipoValorVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipovalorvariablenomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoValorVariableNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoValorVariableNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoValorVariableNomi.setFileImportacion(this.jInternalFrameImportacionTipoValorVariableNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoValorVariableNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoValorVariableNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoValorVariableNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoValorVariableNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		

		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoValorVariableNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoValorVariableNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovalorvariablenomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoValorVariableNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoValorVariableNomi tipovalorvariablenomi:tipovalorvariablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovalorvariablenomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoValorVariableNomi tipovalorvariablenomi:tipovalorvariablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovalorvariablenomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoValorVariableNomi(row);				
			//	iRow++;
			//}				
			
			//for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoValorVariableNomi(tipovalorvariablenomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValorVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoValorVariableNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValorVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoValorVariableNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoValorVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoValorVariableNomi(false);
			
			//SI ES MANUAL
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoValorVariableNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoValorVariableNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoValorVariableNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoValorVariableNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoValorVariableNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoValorVariableNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoValorVariableNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoValorVariableNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoValorVariableNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoValorVariableNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoValorVariableNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoValorVariableNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoValorVariableNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoValorVariableNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoValorVariableNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoValorVariableNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoValorVariableNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoValorVariableNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoValorVariableNomi();
		
		this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoValorVariableNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoValorVariableNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoValorVariableNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoValorVariableNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoValorVariableNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoValorVariableNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoValorVariableNomi.jCheckBoxPostAccionNuevoTipoValorVariableNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoValorVariableNomi.jCheckBoxPostAccionSinCerrarTipoValorVariableNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoValorVariableNomi.jCheckBoxPostAccionSinMensajeTipoValorVariableNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoValorVariableNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoValorVariableNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
				this.jInternalFrameDetalleFormTipoValorVariableNomi.jCheckBoxPostAccionNuevoTipoValorVariableNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoValorVariableNomi.jCheckBoxPostAccionSinCerrarTipoValorVariableNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoValorVariableNomi.jCheckBoxPostAccionSinMensajeTipoValorVariableNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoValorVariableNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoValorVariableNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoValorVariableNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoValorVariableNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoValorVariableNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoValorVariableNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoValorVariableNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoValorVariableNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoValorVariableNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoValorVariableNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoValorVariableNomi() throws Exception {
		try	{
			if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoValorVariableNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoValorVariableNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoValorVariableNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoValorVariableNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoValorVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoValorVariableNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoValorVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoValorVariableNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoValorVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoValorVariableNomi.addItem(reporte);
			}
			
			
			if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoValorVariableNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoValorVariableNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoValorVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoValorVariableNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoValorVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoValorVariableNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoValorVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoValorVariableNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoValorVariableNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoValorVariableNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoValorVariableNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoValorVariableNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoValorVariableNomi(Boolean esInicializar) throws Exception {				
		if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoValorVariableNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoValorVariableNomi() throws Exception {
		this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoValorVariableNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoValorVariableNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoValorVariableNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoValorVariableNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValorVariableNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoValorVariableNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoValorVariableNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoValorVariableNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipovalorvariablenomiLogic.getTipoValorVariableNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipovalorvariablenomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoValorVariableNomi.setModel(new TipoValorVariableNomiModel(this.tipovalorvariablenomiLogic.getTipoValorVariableNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoValorVariableNomi.setModel(new TipoValorVariableNomiModel(this.tipovalorvariablenomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoValorVariableNomi!=null && this.jInternalFrameOrderByTipoValorVariableNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoValorVariableNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValorVariableNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoValorVariableNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO,tipovalorvariablenomiConstantesFunciones.resaltarSeleccionarTipoValorVariableNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoValorVariableNomiConstantesFunciones.SCLASSWEBTITULO,tipovalorvariablenomiConstantesFunciones.resaltarSeleccionarTipoValorVariableNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValorVariableNomi,TipoValorVariableNomiConstantesFunciones.LABEL_ID));

		if(this.tipovalorvariablenomiConstantesFunciones.mostraridTipoValorVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoValorVariableNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipovalorvariablenomiConstantesFunciones.resaltaridTipoValorVariableNomi,this.tipovalorvariablenomiConstantesFunciones.activaridTipoValorVariableNomi,this,true,"idTipoValorVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovalorvariablenomiConstantesFunciones.resaltaridTipoValorVariableNomi,this.tipovalorvariablenomiConstantesFunciones.activaridTipoValorVariableNomi,this,true,"idTipoValorVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValorVariableNomi,TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO));

		if(this.tipovalorvariablenomiConstantesFunciones.mostrarcodigoTipoValorVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovalorvariablenomiConstantesFunciones.resaltarcodigoTipoValorVariableNomi,this.tipovalorvariablenomiConstantesFunciones.activarcodigoTipoValorVariableNomi,this,true,"codigoTipoValorVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovalorvariablenomiConstantesFunciones.resaltarcodigoTipoValorVariableNomi,this.tipovalorvariablenomiConstantesFunciones.activarcodigoTipoValorVariableNomi,this,true,"codigoTipoValorVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoValorVariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoValorVariableNomi,TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.tipovalorvariablenomiConstantesFunciones.mostrarnombreTipoValorVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipovalorvariablenomiConstantesFunciones.resaltarnombreTipoValorVariableNomi,this.tipovalorvariablenomiConstantesFunciones.activarnombreTipoValorVariableNomi,this,true,"nombreTipoValorVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipovalorvariablenomiConstantesFunciones.resaltarnombreTipoValorVariableNomi,this.tipovalorvariablenomiConstantesFunciones.activarnombreTipoValorVariableNomi,this,true,"nombreTipoValorVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoValorVariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosVariableNomi && this.tipovalorvariablenomiConstantesFunciones.mostrarVariableNomiTipoValorVariableNomi && !TipoValorVariableNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Variable Nominas");
				tableColumn.setHeaderValue("Variable Nominas");
				tableColumn.setCellRenderer(new VariableNomiTableCell(tipovalorvariablenomiConstantesFunciones.resaltarVariableNomiTipoValorVariableNomi,this,this.tipovalorvariablenomiConstantesFunciones.activarVariableNomiTipoValorVariableNomi));
				tableColumn.setCellEditor(new VariableNomiTableCell(tipovalorvariablenomiConstantesFunciones.resaltarVariableNomiTipoValorVariableNomi,this,this.tipovalorvariablenomiConstantesFunciones.activarVariableNomiTipoValorVariableNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoValorVariableNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoValorVariableNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoValorVariableNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoValorVariableNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoValorVariableNomi.addColumn(tableColumn);
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
			
			this.jTableDatosTipoValorVariableNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoValorVariableNomi.moveColumn(this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoValorVariableNomi.moveColumn(this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoValorVariableNomi.moveColumn(this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoValorVariableNomi.moveColumn(this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoValorVariableNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoValorVariableNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoValorVariableNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoValorVariableNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoValorVariableNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoValorVariableNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipovalorvariablenomiLogic.getTipoValorVariableNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipovalorvariablenomis.size()-1;
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
		//this.jTableDatosTipoValorVariableNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoValorVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoValorVariableNomi();
			
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
				
				//this.isEsNuevoTipoValorVariableNomi=false;
					
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
				if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoValorVariableNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoValorVariableNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipovalorvariablenomi.getsType().equals("DUPLICADO")
				   || this.tipovalorvariablenomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoValorVariableNomi=true;
				
				} else {
					this.isEsNuevoTipoValorVariableNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
					if(this.tipovalorvariablenomi.getId()>=0 && !this.tipovalorvariablenomi.getIsNew()) {						
						this.isEsNuevoTipoValorVariableNomi=false;
						
					} else {
						this.isEsNuevoTipoValorVariableNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoValorVariableNomi(esRelaciones);						
				
				this.seleccionarTipoValorVariableNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipovalorvariablenomi.getId()<0) {
					this.isEsNuevoTipoValorVariableNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoValorVariableNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoValorVariableNomi(evt,rowIndex);
				}	
				
				if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoValorVariableNomi: " + this.dDif); 
					}
				}								
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoValorVariableNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipovalorvariablenomi)) {
					if(this.tipovalorvariablenomi.getId()>0) {
						this.tipovalorvariablenomi.setIsDeleted(true);
						
						this.tipovalorvariablenomisEliminados.add(this.tipovalorvariablenomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().remove(this.tipovalorvariablenomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipovalorvariablenomis.remove(this.tipovalorvariablenomi);				
					}
					
					
					((TipoValorVariableNomiModel) this.jTableDatosTipoValorVariableNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoValorVariableNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoValorVariableNomi) {
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoValorVariableNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoValorVariableNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoValorVariableNomi(this.tipovalorvariablenomi);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoValorVariableNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoValorVariableNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoValorVariableNomi(tipovalorvariablenomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoValorVariableNomi(tipovalorvariablenomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoValorVariableNomi(tipovalorvariablenomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoValorVariableNomi(tipovalorvariablenomi);
	}
	
	public void setVariablesObjetoActualToFormularioTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.setText(tipovalorvariablenomi.getId().toString());
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.setText(tipovalorvariablenomi.getcodigo());
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.setText(tipovalorvariablenomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoValorVariableNomi tipovalorvariablenomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipovalorvariablenomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoValorVariableNomi tipovalorvariablenomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipovalorvariablenomiLocal=this.tipovalorvariablenomi;
			} else {
				tipovalorvariablenomiLocal=this.tipovalorvariablenomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipovalorvariablenomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoValorVariableNomi(tipovalorvariablenomiLocal,true);
					
					if(tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipovalorvariablenomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipovalorvariablenomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(tipovalorvariablenomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(tipovalorvariablenomi);
	}
	
	public void setVariablesFormularioToObjetoActualTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(tipovalorvariablenomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.getText()==null || this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.getText()=="" || this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.setText("0");
			}

			if(conColumnasBase) {tipovalorvariablenomi.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoValorVariableNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValorVariableNomi.jLabelIdTipoValorVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovalorvariablenomi.setcodigo(this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValorVariableNomi.jLabelcodigoTipoValorVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovalorvariablenomi.setnombre(this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoValorVariableNomi.jLabelnombreTipoValorVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomiBean,TipoValorVariableNomi tipovalorvariablenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomiOrigen,TipoValorVariableNomi tipovalorvariablenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovalorvariablenomiOrigen.getId()!=null && !tipovalorvariablenomiOrigen.getId().equals(0L))) {tipovalorvariablenomi.setId(tipovalorvariablenomiOrigen.getId());}}
			if(conDefault || (!conDefault && tipovalorvariablenomiOrigen.getcodigo()!=null && !tipovalorvariablenomiOrigen.getcodigo().equals(""))) {tipovalorvariablenomi.setcodigo(tipovalorvariablenomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipovalorvariablenomiOrigen.getnombre()!=null && !tipovalorvariablenomiOrigen.getnombre().equals(""))) {tipovalorvariablenomi.setnombre(tipovalorvariablenomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.setText(tipovalorvariablenomi.getId().toString());
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.setText(tipovalorvariablenomi.getcodigo());
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.setText(tipovalorvariablenomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoValorVariableNomi(TipoValorVariableNomiBean tipovalorvariablenomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.setText(tipovalorvariablenomiBean.getId().toString());
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.setText(tipovalorvariablenomiBean.getcodigo());
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.setText(tipovalorvariablenomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoValorVariableNomi(TipoValorVariableNomiParameterReturnGeneral tipovalorvariablenomiReturnGeneral,TipoValorVariableNomiBean tipovalorvariablenomiBean,Boolean conDefault) throws Exception { 
		try {
			TipoValorVariableNomi tipovalorvariablenomiLocal=new TipoValorVariableNomi();
			
			tipovalorvariablenomiLocal=tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipovalorvariablenomiLocal.getId()!=null && !tipovalorvariablenomiLocal.getId().equals(0L))) {tipovalorvariablenomiBean.setId(tipovalorvariablenomiLocal.getId());}}
			if(conDefault || (!conDefault && tipovalorvariablenomiLocal.getcodigo()!=null && !tipovalorvariablenomiLocal.getcodigo().equals(""))) {tipovalorvariablenomiBean.setcodigo(tipovalorvariablenomiLocal.getcodigo());}
			if(conDefault || (!conDefault && tipovalorvariablenomiLocal.getnombre()!=null && !tipovalorvariablenomiLocal.getnombre().equals(""))) {tipovalorvariablenomiBean.setnombre(tipovalorvariablenomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoValorVariableNomiGenerico(Long idTipoValorVariableNomiSeleccionado,JComboBox jComboBoxTipoValorVariableNomi,List<TipoValorVariableNomi> tipovalorvariablenomisLocal)throws Exception {
		try {
			TipoValorVariableNomi  tipovalorvariablenomiTemp=null;

			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisLocal) {
				if(tipovalorvariablenomiAux.getId()!=null && tipovalorvariablenomiAux.getId().equals(idTipoValorVariableNomiSeleccionado)) {
					tipovalorvariablenomiTemp=tipovalorvariablenomiAux;
					break;
				}
			}

			jComboBoxTipoValorVariableNomi.setSelectedItem(tipovalorvariablenomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoValorVariableNomiGenerico(JComboBox jComboBoxTipoValorVariableNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoValorVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoValorVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoValorVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoValorVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoValorVariableNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoValorVariableNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoValorVariableNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoValorVariableNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoValorVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoValorVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovalorvariablenomi=(TipoValorVariableNomi) tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovalorvariablenomi =(TipoValorVariableNomi) tipovalorvariablenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoValorVariableNomi tipovalorvariablenomiRow=new TipoValorVariableNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovalorvariablenomiRow=(TipoValorVariableNomi) tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovalorvariablenomiRow=(TipoValorVariableNomi) tipovalorvariablenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonVariableNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoValorVariableNomi tipovalorvariablenomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovalorvariablenomi = (TipoValorVariableNomi)this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovalorvariablenomi = (TipoValorVariableNomi)this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovalorvariablenomi!=null) {
						this.tipovalorvariablenomi = tipovalorvariablenomi;
					} else {
						this.tipovalorvariablenomi = new TipoValorVariableNomi();
					}
				}

				if(this.isTienePermisosVariableNomi && this.permiteMantenimiento(this.tipovalorvariablenomi)) {
					VariableNomiBeanSwingJInternalFrame variablenomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFramePopup=new VariableNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						variablenomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFramePopup;
					} else {
						variablenomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame;
					}

					List<TipoValorVariableNomi> tipovalorvariablenomis=new ArrayList<TipoValorVariableNomi>();
					tipovalorvariablenomis.add(this.tipovalorvariablenomi);
					if(!esRelacionado) {
						//variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setConGuardarRelaciones(false);
						//variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					variablenomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoValorVariableNomi.cargarVariableNomiBeanSwingJInternalFrame(tipovalorvariablenomis,this.tipovalorvariablenomi,variablenomiBeanSwingJInternalFrame,/*conInicializar,*/variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getConGuardarRelaciones(),variablenomiBeanSwingJInternalFrame.variablenomiSessionBean.getEsGuardarRelacionado());
					variablenomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						variablenomiBeanSwingJInternalFrame.actualizarEstadoPanelsVariableNomi("no_relacionado");

						variablenomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(VariableNomiConstantesFunciones.ITAMANIOFILATABLA + (VariableNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						variablenomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoValorVariableNomi=(TitledBorder)this.jScrollPanelDatosTipoValorVariableNomi.getBorder();
						TitledBorder titledBorderVariableNomi=(TitledBorder)variablenomiBeanSwingJInternalFrame.jScrollPanelDatosVariableNomi.getBorder();

						titledBorderVariableNomi.setTitle(titledBorderTipoValorVariableNomi.getTitle() + " -> Variable Nomina");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,variablenomiBeanSwingJInternalFrame);
						}

						variablenomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(variablenomiBeanSwingJInternalFrame);

						variablenomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Variable Nomina",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoValorVariableNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi));			
			this.jButtonDuplicarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoValorVariableNomi && this.isPermisoDuplicarTipoValorVariableNomi));			
			this.jButtonCopiarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaCopiarTipoValorVariableNomi && this.isPermisoCopiarTipoValorVariableNomi));
			this.jButtonVerFormTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaVerFormTipoValorVariableNomi && this.isPermisoVerFormTipoValorVariableNomi));
			
			this.jButtonAbrirOrderByTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoValorVariableNomi && this.isPermisoOrdenTipoValorVariableNomi));			
			
			this.jButtonNuevoRelacionesTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi));			
			this.jButtonNuevoGuardarCambiosTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaModificarTipoValorVariableNomi && this.isPermisoActualizarTipoValorVariableNomi));	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaActualizarTipoValorVariableNomi && this.isPermisoActualizarTipoValorVariableNomi));	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaEliminarTipoValorVariableNomi && this.isPermisoEliminarTipoValorVariableNomi));
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarTipoValorVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoValorVariableNomi);							
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi));						
			this.jButtonDuplicarToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoValorVariableNomi && this.isPermisoDuplicarTipoValorVariableNomi));						
			this.jButtonCopiarToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaCopiarTipoValorVariableNomi && this.isPermisoCopiarTipoValorVariableNomi));			
			this.jButtonVerFormToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaVerFormTipoValorVariableNomi && this.isPermisoVerFormTipoValorVariableNomi));			
			this.jButtonAbrirOrderByToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoValorVariableNomi && this.isPermisoOrdenTipoValorVariableNomi));
			this.jButtonNuevoRelacionesToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi));			
			this.jButtonNuevoGuardarCambiosToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));			
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaModificarTipoValorVariableNomi && this.isPermisoActualizarTipoValorVariableNomi));	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaActualizarTipoValorVariableNomi  && this.isPermisoActualizarTipoValorVariableNomi));	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaEliminarTipoValorVariableNomi && this.isPermisoEliminarTipoValorVariableNomi));
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarToolBarTipoValorVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoValorVariableNomi);				
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi));			
			this.jMenuItemDuplicarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoValorVariableNomi && this.isPermisoDuplicarTipoValorVariableNomi));			
			this.jMenuItemCopiarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaCopiarTipoValorVariableNomi && this.isPermisoCopiarTipoValorVariableNomi));			
			this.jMenuItemVerFormTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaVerFormTipoValorVariableNomi && this.isPermisoVerFormTipoValorVariableNomi));			
			this.jMenuItemAbrirOrderByTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoValorVariableNomi && this.isPermisoOrdenTipoValorVariableNomi));			
			//this.jMenuItemMostrarOcultarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoValorVariableNomi && this.isPermisoOrdenTipoValorVariableNomi));
			this.jMenuItemDetalleAbrirOrderByTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoValorVariableNomi && this.isPermisoOrdenTipoValorVariableNomi));			
			//this.jMenuItemDetalleMostrarOcultarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaOrdenTipoValorVariableNomi && this.isPermisoOrdenTipoValorVariableNomi));			
			this.jMenuItemNuevoRelacionesTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi));			
			this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaNuevoTipoValorVariableNomi && this.isPermisoNuevoTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));									
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemModificarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaModificarTipoValorVariableNomi && this.isPermisoActualizarTipoValorVariableNomi));	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemActualizarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaActualizarTipoValorVariableNomi && this.isPermisoActualizarTipoValorVariableNomi));	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemEliminarTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaEliminarTipoValorVariableNomi && this.isPermisoEliminarTipoValorVariableNomi));
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemCancelarTipoValorVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoValorVariableNomi);				
			}
			
			this.jMenuItemGuardarCambiosTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));						
			this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=this.jButtonNuevoTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaDuplicarTipoValorVariableNomi=this.jButtonDuplicarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaCopiarTipoValorVariableNomi=this.jButtonCopiarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaVerFormTipoValorVariableNomi=this.jButtonVerFormTipoValorVariableNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoValorVariableNomi=this.jButtonAbrirOrderByTipoValorVariableNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=this.jButtonNuevoRelacionesTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=this.jButtonModificarTipoValorVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=this.jButtonGuardarCambiosTablaTipoValorVariableNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=this.jButtonNuevoToolBarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=this.jButtonNuevoRelacionesToolBarTipoValorVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarToolBarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarToolBarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarToolBarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarToolBarTipoValorVariableNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoValorVariableNomi=this.jButtonGuardarCambiosToolBarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=this.jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=this.jMenuItemNuevoTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=this.jMenuItemNuevoRelacionesTipoValorVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemModificarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemActualizarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemEliminarTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemCancelarTipoValorVariableNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoValorVariableNomi=this.jMenuItemGuardarCambiosTipoValorVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoValorVariableNomi(Boolean esInicializar) {
		if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
				//if(this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoValorVariableNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoValorVariableNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoValorVariableNomi() {
		this.jButtonNuevoTipoValorVariableNomi.setVisible(this.isPermisoNuevoTipoValorVariableNomi);			
		this.jButtonDuplicarTipoValorVariableNomi.setVisible(this.isPermisoDuplicarTipoValorVariableNomi);			
		this.jButtonCopiarTipoValorVariableNomi.setVisible(this.isPermisoCopiarTipoValorVariableNomi);			
		this.jButtonVerFormTipoValorVariableNomi.setVisible(this.isPermisoVerFormTipoValorVariableNomi);			
		
		this.jButtonAbrirOrderByTipoValorVariableNomi.setVisible(this.isPermisoOrdenTipoValorVariableNomi);					
		
		this.jButtonNuevoRelacionesTipoValorVariableNomi.setVisible(this.isPermisoNuevoTipoValorVariableNomi);			
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarTipoValorVariableNomi.setVisible(this.isPermisoActualizarTipoValorVariableNomi);	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarTipoValorVariableNomi.setVisible(this.isPermisoActualizarTipoValorVariableNomi);	
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarTipoValorVariableNomi.setVisible(this.isPermisoEliminarTipoValorVariableNomi);
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarTipoValorVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoValorVariableNomi);						
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.setVisible(this.isPermisoGuardarCambiosTipoValorVariableNomi);							
		}
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.setVisible(this.isPermisoActualizarTipoValorVariableNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoValorVariableNomi() {
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarTipoValorVariableNomi.setVisible(this.isPermisoActualizarTipoValorVariableNomi);	
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarTipoValorVariableNomi.setVisible(this.isPermisoActualizarTipoValorVariableNomi);	
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarTipoValorVariableNomi.setVisible(this.isPermisoEliminarTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarTipoValorVariableNomi.setVisible(this.isVisibilidadCeldaCancelarTipoValorVariableNomi);							
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.setVisible((this.isVisibilidadCeldaGuardarTipoValorVariableNomi && this.isPermisoGuardarCambiosTipoValorVariableNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoValorVariableNomi() {
		if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoValorVariableNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoValorVariableNomi() {
	}
	
	public void jTableDatosTipoValorVariableNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoValorVariableNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoValorVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.gettipovalorvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovalorvariablenomi==null) {
						this.tipovalorvariablenomi = new TipoValorVariableNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
				}

				if(this.tipovalorvariablenomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipovalorvariablenomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoValorVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoValorVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.gettipovalorvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovalorvariablenomi==null) {
						this.tipovalorvariablenomi = new TipoValorVariableNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
				}

				if(this.tipovalorvariablenomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipovalorvariablenomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoValorVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoValorVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.gettipovalorvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovalorvariablenomi==null) {
						this.tipovalorvariablenomi = new TipoValorVariableNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);
				}

				if(this.tipovalorvariablenomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipovalorvariablenomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoValorVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoValorVariableNomi() {
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
		

		if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.dispose();
			this.jInternalFrameDetalleFormTipoValorVariableNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
			this.jInternalFrameReporteDinamicoTipoValorVariableNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoValorVariableNomi.dispose();
			this.jInternalFrameReporteDinamicoTipoValorVariableNomi=null;
		}
		
		if(this.jInternalFrameImportacionTipoValorVariableNomi!=null) {
			this.jInternalFrameImportacionTipoValorVariableNomi.setVisible(false);	    			
			this.jInternalFrameImportacionTipoValorVariableNomi.dispose();
			this.jInternalFrameImportacionTipoValorVariableNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoValorVariableNomi();
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoValorVariableNomi")) {
				jButtonDuplicarTipoValorVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoValorVariableNomi")) {
				jButtonCopiarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoValorVariableNomi")) {
				jButtonVerFormTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoValorVariableNomi")) {
				jButtonDuplicarTipoValorVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoValorVariableNomi")) {
				jButtonDuplicarTipoValorVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoValorVariableNomi")) {
				jButtonModificarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoValorVariableNomi")) {
				jButtonModificarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoValorVariableNomi")) {
				jButtonModificarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoValorVariableNomi")) {
				jButtonActualizarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoValorVariableNomi")) {
				jButtonActualizarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoValorVariableNomi")) {
				jButtonActualizarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoValorVariableNomi")) {
				jButtonEliminarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoValorVariableNomi")) {
				jButtonEliminarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoValorVariableNomi")) {
				jButtonEliminarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoValorVariableNomi")) {
				jButtonCancelarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoValorVariableNomi")) {
				jButtonCancelarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoValorVariableNomi")) {
				jButtonCancelarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoValorVariableNomi")) {
				jButtonCerrarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoValorVariableNomi")) {
				jButtonCerrarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoValorVariableNomi")) {
				jButtonCerrarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoValorVariableNomi")) {
				jButtonMostrarOcultarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoValorVariableNomi")) {
				jButtonCancelarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoValorVariableNomi")) {
				jButtonCopiarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoValorVariableNomi")) {
				jButtonVerFormTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoValorVariableNomi")) {
				jButtonCopiarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoValorVariableNomi")) {
				jButtonVerFormTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoValorVariableNomi")) {
				jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoValorVariableNomi")) {
				jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoValorVariableNomi")) {
				jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoValorVariableNomi")) {
				jButtonAnterioresTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoValorVariableNomi")) {
				jButtonAnterioresTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoValorVariableNomi")) {
				jButtonAnterioresTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoValorVariableNomi")) {
				jButtonSiguientesTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoValorVariableNomi")) {
				jButtonSiguientesTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoValorVariableNomi")) {
				jButtonSiguientesTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoValorVariableNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoValorVariableNomi")) {
				jButtonAbrirOrderByTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoValorVariableNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoValorVariableNomi")) {
				jButtonMostrarOcultarTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoValorVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoValorVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoValorVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoValorVariableNomi")) {
				jButtonCerrarReporteDinamicoTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoValorVariableNomi")) {
				jButtonGenerarReporteDinamicoTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoValorVariableNomi")) {
				
				jButtonGenerarExcelReporteDinamicoTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoValorVariableNomi")) {
				jButtonCerrarImportacionTipoValorVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoValorVariableNomi")) {
				
				jButtonGenerarImportacionTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoValorVariableNomi")) {
				
				jButtonAbrirImportacionTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoValorVariableNomi")) {
				jComboBoxTiposAccionesTipoValorVariableNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoValorVariableNomi")) {
				jComboBoxTiposRelacionesTipoValorVariableNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoValorVariableNomi")) {
				jComboBoxTiposAccionesTipoValorVariableNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoValorVariableNomi")) {
				
				jComboBoxTiposSeleccionarTipoValorVariableNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoValorVariableNomi")) {
				jTextFieldValorCampoGeneralTipoValorVariableNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoValorVariableNomi")) {
				jButtonAbrirOrderByTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoValorVariableNomi")) {
				jButtonAbrirOrderByTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoValorVariableNomi")) {
				jButtonCerrarOrderByTipoValorVariableNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoValorVariableNomiBusqueda")) {
				this.jButtonidTipoValorVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoValorVariableNomiBusqueda")) {
				this.jButtoncodigoTipoValorVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoValorVariableNomiBusqueda")) {
				this.jButtonnombreTipoValorVariableNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoValorVariableNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoValorVariableNomi tipovalorvariablenomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipovalorvariablenomiLocal=this.tipovalorvariablenomi;
			} else {
				tipovalorvariablenomiLocal=this.tipovalorvariablenomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
							
				
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
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
			
			


			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValorVariableNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
								
						
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
								
				
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
							
				
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
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
			
			


			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
								
				
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValorVariableNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoValorVariableNomi")) {
					jCheckBoxSeleccionarTodosTipoValorVariableNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoValorVariableNomi")) {
					jCheckBoxSeleccionadosTipoValorVariableNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoValorVariableNomi")) {
					
				}
				
				


				
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
												
				
				


				
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValorVariableNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
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
			
			


			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovalorvariablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovalorvariablenomi);
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
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
				
				


				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoValorVariableNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoValorVariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoValorVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovalorvariablenomiAnterior =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoValorVariableNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoValorVariableNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoValorVariableNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipovalorvariablenomi =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipovalorvariablenomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoValorVariableNomi")) {
				
				}
				
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoValorVariableNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoValorVariableNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoValorVariableNomi")) {
			
			}
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoValorVariableNomi();
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
			if(sTipo.equals("NuevoTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoValorVariableNomi")) {
				jButtonDuplicarTipoValorVariableNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoValorVariableNomi")) {
				jButtonCopiarTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoValorVariableNomi")) {
				jButtonVerFormTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoValorVariableNomi")) {
				jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoValorVariableNomi")) {
				jButtonModificarTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoValorVariableNomi")) {
				jButtonActualizarTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoValorVariableNomi")) {
				jButtonEliminarTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoValorVariableNomi")) {
				jButtonCancelarTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoValorVariableNomi")) {
				jButtonCerrarTipoValorVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoValorVariableNomi")) {
				jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoValorVariableNomi")) {
				jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoValorVariableNomi")) {
				jButtonAbrirOrderByTipoValorVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoValorVariableNomi")) {
				jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoValorVariableNomi")) {
				jButtonAnterioresTipoValorVariableNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoValorVariableNomi")) {
				jButtonSiguientesTipoValorVariableNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoValorVariableNomiBusqueda")) {
				this.jButtonidTipoValorVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoValorVariableNomiBusqueda")) {
				this.jButtoncodigoTipoValorVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoValorVariableNomiBusqueda")) {
				this.jButtonnombreTipoValorVariableNomiBusquedaActionPerformed(evt);
			}
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoValorVariableNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoValorVariableNomi")) {
				closingInternalFrameTipoValorVariableNomi();
				
			} else if(sTipo.equals("jButtonCancelarTipoValorVariableNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoValorVariableNomi = (JInternalFrameBase)evt.getSource();
	            	
	            TipoValorVariableNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoValorVariableNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoValorVariableNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoValorVariableNomiActionPerformed(null);
			}
			
			TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovalorvariablenomi,new Object(),this.tipovalorvariablenomiParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoValorVariableNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoValorVariableNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoValorVariableNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipovalorvariablenomi)) {
			if(!esControlTabla) {
				if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);			
				}
				
				if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovalorvariablenomiReturnGeneral=tipovalorvariablenomiLogic.procesarEventosTipoValorVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovalorvariablenomiLogic.getTipoValorVariableNomis(),this.tipovalorvariablenomi,this.tipovalorvariablenomiParameterGeneral,this.isEsNuevoTipoValorVariableNomi,classes);//this.tipovalorvariablenomiLogic.getTipoValorVariableNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral,this.tipovalorvariablenomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoValorVariableNomi(classes,this.tipovalorvariablenomiReturnGeneral,this.tipovalorvariablenomiBean,false);
					}
						
					if(this.tipovalorvariablenomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi());	
					}
						
					if(this.tipovalorvariablenomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi(),classes);//this.tipovalorvariablenomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoValorVariableNomi(this.tipovalorvariablenomi,classes);//this.tipovalorvariablenomiBean);									
				}
			
				if(TipoValorVariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoValorVariableNomi(this.tipovalorvariablenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoValorVariableNomi(this.tipovalorvariablenomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipovalorvariablenomiAnterior!=null) {
						this.tipovalorvariablenomi=this.tipovalorvariablenomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipovalorvariablenomiReturnGeneral=tipovalorvariablenomiLogic.procesarEventosTipoValorVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovalorvariablenomiLogic.getTipoValorVariableNomis(),this.tipovalorvariablenomi,this.tipovalorvariablenomiParameterGeneral,this.isEsNuevoTipoValorVariableNomi,classes);//this.tipovalorvariablenomiLogic.getTipoValorVariableNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipovalorvariablenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi(),tipovalorvariablenomiLogic.getTipoValorVariableNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi(),this.tipovalorvariablenomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoValorVariableNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoValorVariableNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoValorVariableNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoValorVariableNomi() throws Exception {
		
		TipoValorVariableNomiModel tipovalorvariablenomiModel=(TipoValorVariableNomiModel)this.jTableDatosTipoValorVariableNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovalorvariablenomiModel.tipovalorvariablenomis=this.tipovalorvariablenomiLogic.getTipoValorVariableNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipovalorvariablenomiModel.tipovalorvariablenomis=this.tipovalorvariablenomis;
		}
		
		
		((TipoValorVariableNomiModel) this.jTableDatosTipoValorVariableNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoValorVariableNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipovalorvariablenomiAnterior(),this.tipovalorvariablenomiLogic.getTipoValorVariableNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipovalorvariablenomiAnterior(),this.tipovalorvariablenomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoValorVariableNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VariableNomi.class)) {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(tipovalorvariablenomi.getVariableNomis());
					this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaVariableNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
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
										
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovalorvariablenomi,new Object(),generalEntityParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoValorVariableNomiConstantesFunciones.getClassesRelationshipsOfTipoValorVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoValorVariableNomiConstantesFunciones.getClassesRelationshipsFromStringsOfTipoValorVariableNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoValorVariableNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoValorVariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovalorvariablenomi,new Object(),generalEntityParameterGeneral,this.tipovalorvariablenomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoValorVariableNomi(TipoValorVariableNomiBean tipovalorvariablenomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(VariableNomi.class)) {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.setVariableNomis(tipovalorvariablenomi.getVariableNomis());
					this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaVariableNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoValorVariableNomi(ArrayList<Classe> classes,TipoValorVariableNomiReturnGeneral tipovalorvariablenomiReturnGeneral,TipoValorVariableNomiBean tipovalorvariablenomiBean,Boolean conDefault) throws Exception {
		
			this.tipovalorvariablenomiBean.setVariableNomis(tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi().getVariableNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(VariableNomi.class)) {
					tipovalorvariablenomi.setVariableNomis(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiBeanSwingJInternalFrame.variablenomiLogic.getVariableNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipovalorvariablenomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi = new TipoValorVariableNomiDetalleFormJInternalFrame(jDesktopPane,this.tipovalorvariablenomiSessionBean.getConGuardarRelaciones(),this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.setVisible(false);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.tipovalorvariablenomiLogic=this.tipovalorvariablenomiLogic;
		
		this.cargarCombosFrameForeignKeyTipoValorVariableNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoValorVariableNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoValorVariableNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoValorVariableNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoValorVariableNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoValorVariableNomi"));
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoValorVariableNomi"));

		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarToolBarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoValorVariableNomi"));
					
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemModificarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoValorVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoValorVariableNomi"));
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarToolBarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoValorVariableNomi"));
						
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemActualizarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoValorVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoValorVariableNomi"));
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoValorVariableNomi"));
								
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemEliminarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoValorVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoValorVariableNomi"));
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoValorVariableNomi"));
					
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemCancelarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoValorVariableNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemDetalleCerrarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoValorVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoValorVariableNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoValorVariableNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoValorVariableNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonidTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoValorVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtoncodigoTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoValorVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonnombreTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoValorVariableNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoValorVariableNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoValorVariableNomi"));
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoValorVariableNomi"));
		}
		
		this.jTableDatosTipoValorVariableNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoValorVariableNomi"));
		
		this.jTableDatosTipoValorVariableNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoValorVariableNomi"));
		
		this.jButtonNuevoTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoTipoValorVariableNomi"));
		
		this.jButtonDuplicarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"DuplicarTipoValorVariableNomi"));
		
		this.jButtonCopiarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"CopiarTipoValorVariableNomi"));
		
		this.jButtonVerFormTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"VerFormTipoValorVariableNomi"));
		
		
		this.jButtonNuevoToolBarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoValorVariableNomi"));
			
		this.jButtonDuplicarToolBarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoValorVariableNomi"));
			
		this.jMenuItemNuevoTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoValorVariableNomi"));
			
		this.jMenuItemDuplicarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoValorVariableNomi"));		
		
		
		this.jButtonNuevoRelacionesTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoValorVariableNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoValorVariableNomi"));
			
		this.jMenuItemNuevoRelacionesTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoValorVariableNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoValorVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonModificarToolBarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoValorVariableNomi"));
			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemModificarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoValorVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoValorVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonActualizarToolBarTipoValorVariableNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoValorVariableNomi"));
				
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemActualizarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoValorVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoValorVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonEliminarToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoValorVariableNomi"));
						
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemEliminarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoValorVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoValorVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonCancelarToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoValorVariableNomi"));
			
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemCancelarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoValorVariableNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoValorVariableNomi"));		
		
		
		this.jButtonCerrarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarTipoValorVariableNomi"));
		
		
		this.jButtonCerrarToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoValorVariableNomi"));
			
		this.jMenuItemCerrarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoValorVariableNomi"));
			
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jMenuItemDetalleCerrarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoValorVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoValorVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoValorVariableNomi"));
		}
		
		this.jButtonCopiarToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoValorVariableNomi"));
			
		this.jButtonVerFormToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoValorVariableNomi"));
		
		this.jMenuItemGuardarCambiosTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoValorVariableNomi"));
			
		this.jMenuItemCopiarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoValorVariableNomi"));		
		
		this.jMenuItemVerFormTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoValorVariableNomi"));		
		
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoValorVariableNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoValorVariableNomi"));
			
		this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoValorVariableNomi"));		
		
		
		
		this.jButtonRecargarInformacionTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoValorVariableNomi"));
					
		this.jButtonRecargarInformacionToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoValorVariableNomi"));
		
		this.jMenuItemRecargarInformacionTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoValorVariableNomi"));		
		
		
		
		this.jButtonAnterioresTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"AnterioresTipoValorVariableNomi"));
		
		
		this.jButtonAnterioresToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoValorVariableNomi"));
		
		this.jMenuItemAnterioresTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoValorVariableNomi"));		
		
		
		this.jButtonSiguientesTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"SiguientesTipoValorVariableNomi"));
		
		
		this.jButtonSiguientesToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoValorVariableNomi"));
			
		this.jMenuItemSiguientesTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoValorVariableNomi"));
			
		this.jMenuItemAbrirOrderByTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoValorVariableNomi"));
			
		this.jMenuItemMostrarOcultarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoValorVariableNomi"));
			
		this.jMenuItemDetalleAbrirOrderByTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoValorVariableNomi"));
			
		this.jMenuItemDetalleMostarOcultarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoValorVariableNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoValorVariableNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoValorVariableNomi"));
			
		this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoValorVariableNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoValorVariableNomi"));

		this.jCheckBoxSeleccionadosTipoValorVariableNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoValorVariableNomi"));
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoValorVariableNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoValorVariableNomi"));
			
		this.jComboBoxTiposAccionesTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoValorVariableNomi"));
					
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoValorVariableNomi"));
			
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoValorVariableNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonidTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoValorVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtoncodigoTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoValorVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonnombreTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoValorVariableNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoValorVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoValorVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoValorVariableNomi"));
				this.jInternalFrameReporteDinamicoTipoValorVariableNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoValorVariableNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoValorVariableNomi"));				
			//this.jButtonGenerarReporteDinamicoTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoValorVariableNomi"));
			//this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoValorVariableNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoValorVariableNomi!=null) {
				this.jInternalFrameImportacionTipoValorVariableNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoValorVariableNomi"));
				this.jInternalFrameImportacionTipoValorVariableNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoValorVariableNomi"));
				this.jInternalFrameImportacionTipoValorVariableNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoValorVariableNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoValorVariableNomi"));
			
			this.jButtonAbrirOrderByToolBarTipoValorVariableNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoValorVariableNomi"));			
			
			if(this.jInternalFrameOrderByTipoValorVariableNomi!=null) {
				this.jInternalFrameOrderByTipoValorVariableNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoValorVariableNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoValorVariableNomi.jTabbedPaneRelacionesTipoValorVariableNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoValorVariableNomi"));
		
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
            		closingInternalFrameTipoValorVariableNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoValorVariableNomi = (JInternalFrameBase)event.getSource();
	            	
	            TipoValorVariableNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoValorVariableNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoValorVariableNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoValorVariableNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoValorVariableNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoValorVariableNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoValorVariableNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoValorVariableNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoValorVariableNomi";
		inputMap = this.jButtonNuevoTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoValorVariableNomi";
		inputMap = this.jButtonNuevoRelacionesTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoValorVariableNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoValorVariableNomi";
		inputMap = this.jButtonModificarTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoValorVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoValorVariableNomi";
		inputMap = this.jButtonActualizarTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoValorVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoValorVariableNomi";
		inputMap = this.jButtonEliminarTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoValorVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoValorVariableNomi";
		inputMap = this.jButtonCancelarTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoValorVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoValorVariableNomi";
		inputMap = this.jButtonCerrarTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoValorVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoValorVariableNomi";
		inputMap = this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonGuardarCambiosTipoValorVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoValorVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoValorVariableNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoValorVariableNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoValorVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoValorVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoValorVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoValorVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoValorVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoValorVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonidTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoValorVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtoncodigoTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoValorVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jButtonnombreTipoValorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoValorVariableNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoValorVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoValorVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoValorVariableNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoValorVariableNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoValorVariableNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
					tipovalorvariablenomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomis) {
					tipovalorvariablenomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoValorVariableNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoValorVariableNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
						tipovalorvariablenomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomis) {
						tipovalorvariablenomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoValorVariableNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoValorVariableNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoValorVariableNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoValorVariableNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoValorVariableNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoValorVariableNomi.getSelectedRows();
			
			TipoValorVariableNomi tipovalorvariablenomiLocal=new TipoValorVariableNomi();
			
			//this.seleccionarTodosTipoValorVariableNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovalorvariablenomiLocal =(TipoValorVariableNomi) this.tipovalorvariablenomiLogic.getTipoValorVariableNomis().toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipovalorvariablenomiLocal =(TipoValorVariableNomi) this.tipovalorvariablenomis.toArray()[this.jTableDatosTipoValorVariableNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipovalorvariablenomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
						tipovalorvariablenomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomis) {
						tipovalorvariablenomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoValorVariableNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoValorVariableNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoValorVariableNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoValorVariableNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoValorVariableNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoValorVariableNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoValorVariableNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoValorVariableNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
				
						if(sTipoSeleccionar.equals(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovalorvariablenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovalorvariablenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomis) {
					
						if(sTipoSeleccionar.equals(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipovalorvariablenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipovalorvariablenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoValorVariableNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoValorVariableNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoValorVariableNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoValorVariableNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoValorVariableNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoValorVariableNomi(conSplash);
				
					this.generarReporteTipoValorVariableNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoValorVariableNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoValorVariableNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoValorVariableNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoValorVariableNomi();
				
				this.exportarTipoValorVariableNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoValorVariableNomis();
				//this.importarTipoValorVariableNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoValorVariableNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoValorVariableNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Valor Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoValorVariableNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoValorVariableNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoValorVariableNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoValorVariableNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoValorVariableNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoValorVariableNomi(conSplash);
					
						//this.actualizarParametrosGeneralTipoValorVariableNomi();
						
						this.generarReporteProcesoAccionTipoValorVariableNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoValorVariableNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Valor VariableS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Valor Variable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoValorVariableNomi();
				
						this.actualizarParametrosGeneralTipoValorVariableNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipovalorvariablenomiReturnGeneral=tipovalorvariablenomiLogic.procesarAccionTipoValorVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipovalorvariablenomiLogic.getTipoValorVariableNomis(),this.tipovalorvariablenomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoValorVariableNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoValorVariableNomi();
					
					TipoValorVariableNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoValorVariableNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoValorVariableNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoValorVariableNomi.jComboBoxTiposAccionesFormularioTipoValorVariableNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoValorVariableNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoValorVariableNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoValorVariableNomi();
			
			if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
			TipoValorVariableNomi tipovalorvariablenomi=new TipoValorVariableNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoValorVariableNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoValorVariableNomi.getSelectedItem();
			
			
			
			
			tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipovalorvariablenomisSeleccionados.size()==1) {
				for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisSeleccionados) {
					tipovalorvariablenomi=tipovalorvariablenomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Variable Nomina")) {
					jButtonVariableNomiActionPerformed(null,rowIndex,true,false,tipovalorvariablenomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoValorVariableNomi();
			
      		//this.finishProcessTipoValorVariableNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoValorVariableNomiReturnGeneral() throws Exception {
		if(this.tipovalorvariablenomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipovalorvariablenomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipovalorvariablenomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipovalorvariablenomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipovalorvariablenomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipovalorvariablenomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoValorVariableNomi(false);
		}
		
		if(this.tipovalorvariablenomiReturnGeneral.getConRetornoLista() || this.tipovalorvariablenomiReturnGeneral.getConRetornoObjeto()) {
			if(this.tipovalorvariablenomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovalorvariablenomiLogic.setTipoValorVariableNomis(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipovalorvariablenomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipovalorvariablenomiLogic.setTipoValorVariableNomi(this.tipovalorvariablenomiReturnGeneral.getTipoValorVariableNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoValorVariableNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoValorVariableNomi() throws Exception {
		
		
	}
	
	public ArrayList<TipoValorVariableNomi> getTipoValorVariableNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoValorVariableNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomiLogic.getTipoValorVariableNomis()) {
					if(tipovalorvariablenomiAux.getIsSelected()) {
						tipovalorvariablenomisSeleccionados.add(tipovalorvariablenomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoValorVariableNomi tipovalorvariablenomiAux:this.tipovalorvariablenomis) {
					if(tipovalorvariablenomiAux.getIsSelected()) {
						tipovalorvariablenomisSeleccionados.add(tipovalorvariablenomiAux);				
					}
				}
			}
			
			if(tipovalorvariablenomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipovalorvariablenomisSeleccionados.addAll(this.tipovalorvariablenomiLogic.getTipoValorVariableNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipovalorvariablenomisSeleccionados.addAll(this.tipovalorvariablenomis);				
					}
				}
			}
		} else {
			tipovalorvariablenomisSeleccionados.add(this.tipovalorvariablenomi);
		}
		
		return tipovalorvariablenomisSeleccionados;
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
	
	public void generarReporteTipoValorVariableNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoValorVariableNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoValorVariableNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoValorVariableNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoValorVariableNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoValorVariableNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Valor Variable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoValorVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoValorVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoValorVariableNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoValorVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoValorVariableNomi();
		
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoValorVariableNomi();
		
		
		//this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomisSeleccionados ,tipovalorvariablenomiImplementable,tipovalorvariablenomiImplementableHome);
	}
	
	public void mostrarImportacionTipoValorVariableNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoValorVariableNomi();
		
		this.abrirFrameImportacionTipoValorVariableNomi();		
		
			
		//this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomisSeleccionados ,tipovalorvariablenomiImplementable,tipovalorvariablenomiImplementableHome);
	}
	
	public void importarTipoValorVariableNomis() throws Exception {		
	
	}
	
	public void exportarTipoValorVariableNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoValorVariableNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoValorVariableNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoValorVariableNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Valor Variable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoValorVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovalorvariablenomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoValorVariableNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoValorVariableNomi(tipovalorvariablenomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipovalorvariablenomiAux.setsDetalleGeneralEntityReporte(tipovalorvariablenomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoValorVariableNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoValorVariableNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoValorVariableNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipovalorvariablenomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovalorvariablenomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovalorvariablenomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovalorvariablenomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoValorVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovalorvariablenomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoValorVariableNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoValorVariableNomi(row);				
				iRow++;
			}				
			
			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoValorVariableNomi(tipovalorvariablenomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoValorVariableNomisSeleccionados() throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();		
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovalorvariablenomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipovalorvariablenomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipovalorvariablenomi");
			//elementRoot.appendChild(element);
		
			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisSeleccionados) {
				element = document.createElement("tipovalorvariablenomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoValorVariableNomi(tipovalorvariablenomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Valor Variable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoValorVariableNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipovalorvariablenomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovalorvariablenomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovalorvariablenomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoValorVariableNomi(TipoValorVariableNomi tipovalorvariablenomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoValorVariableNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipovalorvariablenomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoValorVariableNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipovalorvariablenomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoValorVariableNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipovalorvariablenomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoValorVariableNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipovalorvariablenomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoValorVariableNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados=new ArrayList<TipoValorVariableNomi>();
		
		tipovalorvariablenomisSeleccionados=this.getTipoValorVariableNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoValorVariableNomi(tipovalorvariablenomisSeleccionados);
		
		this.generarReporteTipoValorVariableNomis("Todos",tipovalorvariablenomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoValorVariableNomi(ArrayList<TipoValorVariableNomi> tipovalorvariablenomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisSeleccionados) {
				tipovalorvariablenomiAux.setsDetalleGeneralEntityReporte(tipovalorvariablenomiAux.toString());
			
				if(sTipoSeleccionar.equals(TipoValorVariableNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipovalorvariablenomiAux.setsDescripcionGeneralEntityReporte1(tipovalorvariablenomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoValorVariableNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipovalorvariablenomiAux.setsDescripcionGeneralEntityReporte1(tipovalorvariablenomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoValorVariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoValorVariableNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoValorVariableNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=true;
				this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=true;
			}
			
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=true;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=true;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=true;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=true;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=true;
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
			this.isVisibilidadCeldaModificarTipoValorVariableNomi=true;
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaCancelarTipoValorVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoValorVariableNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoValorVariableNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=true;
		} else {
			this.actualizarEstadoPanelsTipoValorVariableNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoValorVariableNomi=false;
			//this.isVisibilidadCeldaVerFormTipoValorVariableNomi=false;
			this.isVisibilidadCeldaDuplicarTipoValorVariableNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
			if(!tipovalorvariablenomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;												
			}
			
			this.jButtonCerrarTipoValorVariableNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoValorVariableNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.tipovalorvariablenomi)) {
			this.isVisibilidadCeldaActualizarTipoValorVariableNomi=false;
			this.isVisibilidadCeldaEliminarTipoValorVariableNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoValorVariableNomi() {
		this.isVisibilidadCeldaNuevoTipoValorVariableNomi=false;
		this.isVisibilidadCeldaGuardarCambiosTipoValorVariableNomi=false;
	}
	
	public void actualizarEstadoPanelsTipoValorVariableNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoValorVariableNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValorVariableNomi!=null) {
				this.jPanelPaginacionTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValorVariableNomi!=null) {
				this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoValorVariableNomi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosTipoValorVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoValorVariableNomi!=null) {
				this.jPanelPaginacionTipoValorVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoValorVariableNomi!=null) {
				this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoValorVariableNomi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosTipoValorVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoValorVariableNomi!=null) {
				this.jPanelPaginacionTipoValorVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoValorVariableNomi!=null) {
				this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoValorVariableNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosTipoValorVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoValorVariableNomi!=null) {
				this.jPanelPaginacionTipoValorVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoValorVariableNomi!=null) {
				this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoValorVariableNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValorVariableNomi!=null) {
				this.jPanelPaginacionTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValorVariableNomi!=null) {
				this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoValorVariableNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValorVariableNomi!=null) {
				this.jPanelPaginacionTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValorVariableNomi!=null) {
				this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosEdicionTipoValorVariableNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoValorVariableNomi!=null) {
				this.jScrollPanelDatosTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoValorVariableNomi!=null) {
				this.jPanelPaginacionTipoValorVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoValorVariableNomi!=null) {
				this.jPanelParametrosReportesTipoValorVariableNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipovalorvariablenomiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoValorVariableNomiParaVariableNomis() throws Exception {
		Boolean isPaginaPopupVariableNomi=false;

		try {

			if(this.tipovalorvariablenomiSessionBean==null) {
				this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean==null) {
				this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean=new VariableNomiSessionBean();
			}

			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean.setsPathNavegacionActual(tipovalorvariablenomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VariableNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupVariableNomi=this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVariableNomi(true);
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVariableNomi(TipoValorVariableNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoValorVariableNomi(true);
			this.jInternalFrameDetalleFormTipoValorVariableNomi.variablenomiSessionBean.setlidTipoValorVariableNomiActual(this.idTipoValorVariableNomiActual);

			tipovalorvariablenomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoValorVariableNomi(true);
			tipovalorvariablenomiSessionBean.setlIdTipoValorVariableNomiActualForeignKey(this.idTipoValorVariableNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoValorVariableNomiSessionBean tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
		
		if(this.tipovalorvariablenomiSessionBean==null) {
			this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
		}
		
		this.tipovalorvariablenomiSessionBean.setsUltimaBusquedaTipoValorVariableNomi(this.getsAccionBusqueda());
		this.tipovalorvariablenomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipovalorvariablenomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoValorVariableNomiSessionBean tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
		
		if(this.tipovalorvariablenomiSessionBean==null) {
			this.tipovalorvariablenomiSessionBean=new TipoValorVariableNomiSessionBean();
		}
		
		if(this.tipovalorvariablenomiSessionBean.getsUltimaBusquedaTipoValorVariableNomi()!=null&&!this.tipovalorvariablenomiSessionBean.getsUltimaBusquedaTipoValorVariableNomi().equals("")) {
			this.setsAccionBusqueda(tipovalorvariablenomiSessionBean.getsUltimaBusquedaTipoValorVariableNomi());
			this.setiNumeroPaginacion(tipovalorvariablenomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipovalorvariablenomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipovalorvariablenomiSessionBean.setsUltimaBusquedaTipoValorVariableNomi("");
		this.tipovalorvariablenomiSessionBean.setiNumeroPaginacion(TipoValorVariableNomiConstantesFunciones.INUMEROPAGINACION);
		this.tipovalorvariablenomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoValorVariableNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoValorVariableNomi() {
		this.updateBorderResaltarBusquedasFormularioTipoValorVariableNomi();
		this.updateVisibilidadBusquedasFormularioTipoValorVariableNomi();
		this.updateHabilitarBusquedasFormularioTipoValorVariableNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoValorVariableNomi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoValorVariableNomi() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoValorVariableNomi() {
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
	
	public void updateControlesFormularioTipoValorVariableNomi() throws Exception {

		if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoValorVariableNomi();
		this.updateVisibilidadResaltarControlesFormularioTipoValorVariableNomi();
		this.updateHabilitarResaltarControlesFormularioTipoValorVariableNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoValorVariableNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipovalorvariablenomiConstantesFunciones.resaltaridTipoValorVariableNomi!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.setBorder(this.tipovalorvariablenomiConstantesFunciones.resaltaridTipoValorVariableNomi);}
		if(this.tipovalorvariablenomiConstantesFunciones.resaltarcodigoTipoValorVariableNomi!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.setBorder(this.tipovalorvariablenomiConstantesFunciones.resaltarcodigoTipoValorVariableNomi);}
		if(this.tipovalorvariablenomiConstantesFunciones.resaltarnombreTipoValorVariableNomi!=null && this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.setBorder(this.tipovalorvariablenomiConstantesFunciones.resaltarnombreTipoValorVariableNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoValorVariableNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
	
		//this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.setVisible(this.tipovalorvariablenomiConstantesFunciones.mostraridTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jPanelidTipoValorVariableNomi.setVisible(this.tipovalorvariablenomiConstantesFunciones.mostraridTipoValorVariableNomi);
		//this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.setVisible(this.tipovalorvariablenomiConstantesFunciones.mostrarcodigoTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jPanelcodigoTipoValorVariableNomi.setVisible(this.tipovalorvariablenomiConstantesFunciones.mostrarcodigoTipoValorVariableNomi);
		//this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.setVisible(this.tipovalorvariablenomiConstantesFunciones.mostrarnombreTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jPanelnombreTipoValorVariableNomi.setVisible(this.tipovalorvariablenomiConstantesFunciones.mostrarnombreTipoValorVariableNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoValorVariableNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoValorVariableNomi!=null) {
	
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldidTipoValorVariableNomi.setEnabled(this.tipovalorvariablenomiConstantesFunciones.activaridTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextFieldcodigoTipoValorVariableNomi.setEnabled(this.tipovalorvariablenomiConstantesFunciones.activarcodigoTipoValorVariableNomi);
		this.jInternalFrameDetalleFormTipoValorVariableNomi.jTextAreanombreTipoValorVariableNomi.setEnabled(this.tipovalorvariablenomiConstantesFunciones.activarnombreTipoValorVariableNomi);
		}
	}
	
		
}