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

import com.bydan.erp.nomina.util.PuntajeNomiConstantesFunciones;
import com.bydan.erp.nomina.util.PuntajeNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.PuntajeNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.PuntajeNomiBean;
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
public class PuntajeNomiBeanSwingJInternalFrame extends PuntajeNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PuntajeNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PuntajeNomi> puntajenomiValidator = new ClassValidator<PuntajeNomi>(PuntajeNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PuntajeNomi puntajenomi;	
	public PuntajeNomi puntajenomiAux;
	public PuntajeNomi puntajenomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PuntajeNomi puntajenomiTotales;
	public Long idPuntajeNomiActual;
	public Long iIdNuevoPuntajeNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosFormatoNomi=false;

	public Boolean getIsTienePermisosFormatoNomi() {
		return isTienePermisosFormatoNomi;
	}

	public void setIsTienePermisosFormatoNomi(Boolean isTienePermisosFormatoNomi) {
		this.isTienePermisosFormatoNomi= isTienePermisosFormatoNomi;
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
	
	public Boolean isPermisoTodoPuntajeNomi;
	public Boolean isPermisoNuevoPuntajeNomi;
	public Boolean isPermisoActualizarPuntajeNomi;
	public Boolean isPermisoActualizarOriginalPuntajeNomi;
	public Boolean isPermisoEliminarPuntajeNomi;
	public Boolean isPermisoGuardarCambiosPuntajeNomi;
	public Boolean isPermisoConsultaPuntajeNomi;
	public Boolean isPermisoBusquedaPuntajeNomi;
	public Boolean isPermisoReportePuntajeNomi;
	public Boolean isPermisoPaginacionMedioPuntajeNomi;
	public Boolean isPermisoPaginacionAltoPuntajeNomi;
	public Boolean isPermisoPaginacionTodoPuntajeNomi;
	public Boolean isPermisoCopiarPuntajeNomi;
	public Boolean isPermisoVerFormPuntajeNomi;
	public Boolean isPermisoDuplicarPuntajeNomi;
	public Boolean isPermisoOrdenPuntajeNomi;
	
	
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
	
	public PuntajeNomiParameterReturnGeneral puntajenomiReturnGeneral;
	public PuntajeNomiParameterReturnGeneral puntajenomiParameterGeneral;
	
	

	public FormatoNomiLogic formatonomiLogic=null;

	public FormatoNomiLogic getFormatoNomiLogic() {
		return formatonomiLogic;
	}

	public void setFormatoNomiLogic(FormatoNomiLogic formatonomiLogic) {
		this.formatonomiLogic = formatonomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPuntajeNomi=false;
	public Boolean esParaAccionDesdeFormularioPuntajeNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PuntajeNomiSessionBeanAdditional puntajenomiSessionBeanAdditional=null;
	
	public PuntajeNomiSessionBeanAdditional getPuntajeNomiSessionBeanAdditional() {
		return this.puntajenomiSessionBeanAdditional;
	}
	
	public void setPuntajeNomiSessionBeanAdditional(PuntajeNomiSessionBeanAdditional puntajenomiSessionBeanAdditional) {
		try {
			this.puntajenomiSessionBeanAdditional=puntajenomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PuntajeNomiBeanSwingJInternalFrameAdditional puntajenomiBeanSwingJInternalFrameAdditional=null;
	//public class PuntajeNomiBeanSwingJInternalFrame
	
	public PuntajeNomiBeanSwingJInternalFrameAdditional getPuntajeNomiBeanSwingJInternalFrameAdditional() {
		return this.puntajenomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setPuntajeNomiBeanSwingJInternalFrameAdditional(PuntajeNomiBeanSwingJInternalFrameAdditional puntajenomiBeanSwingJInternalFrameAdditional) {
		try {
			this.puntajenomiBeanSwingJInternalFrameAdditional=puntajenomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PuntajeNomiLogic puntajenomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PuntajeNomi puntajenomiBean;
	public PuntajeNomiConstantesFunciones puntajenomiConstantesFunciones;
	//public PuntajeNomiParameterReturnGeneral puntajenomiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<PuntajeNomi> puntajenomis;	
	//public List<PuntajeNomi> puntajenomisEliminados;
	//public List<PuntajeNomi> puntajenomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPuntajeNomi=false;
	public Boolean isVisibilidadCeldaDuplicarPuntajeNomi=true;
	public Boolean isVisibilidadCeldaCopiarPuntajeNomi=true;
	public Boolean isVisibilidadCeldaVerFormPuntajeNomi=true;
	public Boolean isVisibilidadCeldaOrdenPuntajeNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
	public Boolean isVisibilidadCeldaModificarPuntajeNomi=false;
	public Boolean isVisibilidadCeldaActualizarPuntajeNomi=false;
	public Boolean isVisibilidadCeldaEliminarPuntajeNomi=false;
	public Boolean isVisibilidadCeldaCancelarPuntajeNomi=false;
	public Boolean isVisibilidadCeldaGuardarPuntajeNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;	
	
	
	
	public Long getiIdNuevoPuntajeNomi() {
		return this.iIdNuevoPuntajeNomi;
	}

	public void setiIdNuevoPuntajeNomi(Long iIdNuevoPuntajeNomi) {
		this.iIdNuevoPuntajeNomi = iIdNuevoPuntajeNomi;
	}
	
	public Long getidPuntajeNomiActual() {
		return this.idPuntajeNomiActual;
	}

	public void setidPuntajeNomiActual(Long idPuntajeNomiActual) {
		this.idPuntajeNomiActual = idPuntajeNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PuntajeNomi getpuntajenomi() {
		return this.puntajenomi;
	}

	public void setpuntajenomi(PuntajeNomi puntajenomi) {
		this.puntajenomi = puntajenomi;
	}
	
	public PuntajeNomi getpuntajenomiAux() {
		return this.puntajenomiAux;
	}

	public void setpuntajenomiAux(PuntajeNomi puntajenomiAux) {
		this.puntajenomiAux = puntajenomiAux;
	}				
	
	public PuntajeNomi getpuntajenomiAnterior() {
		return this.puntajenomiAnterior;
	}

	public void setpuntajenomiAnterior(PuntajeNomi puntajenomiAnterior) {
		this.puntajenomiAnterior = puntajenomiAnterior;
	}	
	
	public PuntajeNomi getpuntajenomiTotales() {
		return this.puntajenomiTotales;
	}

	public void setpuntajenomiTotales(PuntajeNomi puntajenomiTotales) {
		this.puntajenomiTotales = puntajenomiTotales;
	}	
	
	public PuntajeNomi getpuntajenomiBean() {
		return this.puntajenomiBean;
	}

	public void setpuntajenomiBean(PuntajeNomi puntajenomiBean) {
		this.puntajenomiBean = puntajenomiBean;
	}	
	
	public PuntajeNomiParameterReturnGeneral getpuntajenomiReturnGeneral() {
		return this.puntajenomiReturnGeneral;
	}

	public void setpuntajenomiReturnGeneral(PuntajeNomiParameterReturnGeneral puntajenomiReturnGeneral) {
		this.puntajenomiReturnGeneral = puntajenomiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PuntajeNomiLogic getPuntajeNomiLogic()	{		
		return puntajenomiLogic;
	}

	public void setPuntajeNomiLogic(PuntajeNomiLogic puntajenomiLogic) {
		this.puntajenomiLogic = puntajenomiLogic;
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
	
	public Boolean getIsEsNuevoPuntajeNomi() {
		return isEsNuevoPuntajeNomi;
	}

	public void setIsEsNuevoPuntajeNomi(Boolean isEsNuevoPuntajeNomi) {
		this.isEsNuevoPuntajeNomi = isEsNuevoPuntajeNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioPuntajeNomi() {
		return esParaAccionDesdeFormularioPuntajeNomi;
	}
	
	public void setEsParaAccionDesdeFormularioPuntajeNomi(Boolean esParaAccionDesdeFormularioPuntajeNomi) {
		this.esParaAccionDesdeFormularioPuntajeNomi = esParaAccionDesdeFormularioPuntajeNomi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesPuntajeNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PuntajeNomiConstantesFunciones.refrescarForeignKeysDescripcionesPuntajeNomi(this.puntajenomiLogic.getPuntajeNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PuntajeNomiConstantesFunciones.refrescarForeignKeysDescripcionesPuntajeNomi(this.puntajenomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//puntajenomiLogic.setPuntajeNomis(this.puntajenomis);
			puntajenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PuntajeNomiParameterReturnGeneral getPuntajeNomiParameterGeneral() {
		return this.puntajenomiParameterGeneral;
	}
	
	public void setPuntajeNomiParameterGeneral(PuntajeNomiParameterReturnGeneral puntajenomiParameterGeneral) {
		this.puntajenomiParameterGeneral = puntajenomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPuntajeNomi() {
		return isPermisoTodoPuntajeNomi;
	}

	public void setIsPermisoTodoPuntajeNomi(Boolean isPermisoTodoPuntajeNomi) {
		this.isPermisoTodoPuntajeNomi = isPermisoTodoPuntajeNomi;
	}

	public Boolean getIsPermisoNuevoPuntajeNomi() {
		return isPermisoNuevoPuntajeNomi;
	}

	public void setIsPermisoNuevoPuntajeNomi(Boolean isPermisoNuevoPuntajeNomi) {
		this.isPermisoNuevoPuntajeNomi = isPermisoNuevoPuntajeNomi;
	}

	public Boolean getIsPermisoActualizarPuntajeNomi() {
		return isPermisoActualizarPuntajeNomi;
	}

	public void setIsPermisoActualizarPuntajeNomi(Boolean isPermisoActualizarPuntajeNomi) {
		this.isPermisoActualizarPuntajeNomi = isPermisoActualizarPuntajeNomi;
	}

	public Boolean getIsPermisoEliminarPuntajeNomi() {
		return isPermisoEliminarPuntajeNomi;
	}

	public void setIsPermisoEliminarPuntajeNomi(Boolean isPermisoEliminarPuntajeNomi) {
		this.isPermisoEliminarPuntajeNomi = isPermisoEliminarPuntajeNomi;
	}

	public Boolean getIsPermisoGuardarCambiosPuntajeNomi() {
		return isPermisoGuardarCambiosPuntajeNomi;
	}

	public void setIsPermisoGuardarCambiosPuntajeNomi(Boolean isPermisoGuardarCambiosPuntajeNomi) {
		this.isPermisoGuardarCambiosPuntajeNomi = isPermisoGuardarCambiosPuntajeNomi;
	}
	
	public Boolean getIsPermisoConsultaPuntajeNomi() {
		return isPermisoConsultaPuntajeNomi;
	}

	public void setIsPermisoConsultaPuntajeNomi(Boolean isPermisoConsultaPuntajeNomi) {
		this.isPermisoConsultaPuntajeNomi = isPermisoConsultaPuntajeNomi;
	}

	public Boolean getIsPermisoBusquedaPuntajeNomi() {
		return isPermisoBusquedaPuntajeNomi;
	}

	public void setIsPermisoBusquedaPuntajeNomi(Boolean isPermisoBusquedaPuntajeNomi) {
		this.isPermisoBusquedaPuntajeNomi = isPermisoBusquedaPuntajeNomi;
	}

	public Boolean getIsPermisoReportePuntajeNomi() {
		return isPermisoReportePuntajeNomi;
	}

	public void setIsPermisoReportePuntajeNomi(Boolean isPermisoReportePuntajeNomi) {
		this.isPermisoReportePuntajeNomi = isPermisoReportePuntajeNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioPuntajeNomi() {
		return isPermisoPaginacionMedioPuntajeNomi;
	}

	public void setIsPermisoPaginacionMedioPuntajeNomi(Boolean isPermisoPaginacionMedioPuntajeNomi) {
		this.isPermisoPaginacionMedioPuntajeNomi = isPermisoPaginacionMedioPuntajeNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoPuntajeNomi() {
		return isPermisoPaginacionTodoPuntajeNomi;
	}

	public void setIsPermisoPaginacionTodoPuntajeNomi(Boolean isPermisoPaginacionTodoPuntajeNomi) {
		this.isPermisoPaginacionTodoPuntajeNomi = isPermisoPaginacionTodoPuntajeNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoPuntajeNomi() {
		return isPermisoPaginacionAltoPuntajeNomi;
	}

	public void setIsPermisoPaginacionAltoPuntajeNomi(Boolean isPermisoPaginacionAltoPuntajeNomi) {
		this.isPermisoPaginacionAltoPuntajeNomi = isPermisoPaginacionAltoPuntajeNomi;
	}
	
	public Boolean getIsPermisoCopiarPuntajeNomi() {
		return isPermisoCopiarPuntajeNomi;
	}

	public void setIsPermisoCopiarPuntajeNomi(Boolean isPermisoCopiarPuntajeNomi) {
		this.isPermisoCopiarPuntajeNomi = isPermisoCopiarPuntajeNomi;
	}
	
	public Boolean getIsPermisoVerFormPuntajeNomi() {
		return isPermisoVerFormPuntajeNomi;
	}

	public void setIsPermisoVerFormPuntajeNomi(Boolean isPermisoVerFormPuntajeNomi) {
		this.isPermisoVerFormPuntajeNomi = isPermisoVerFormPuntajeNomi;
	}
	
	public Boolean getIsPermisoDuplicarPuntajeNomi() {
		return isPermisoDuplicarPuntajeNomi;
	}

	public void setIsPermisoDuplicarPuntajeNomi(Boolean isPermisoDuplicarPuntajeNomi) {
		this.isPermisoDuplicarPuntajeNomi = isPermisoDuplicarPuntajeNomi;
	}
	
	public Boolean getIsPermisoOrdenPuntajeNomi() {
		return isPermisoOrdenPuntajeNomi;
	}

	public void setIsPermisoOrdenPuntajeNomi(Boolean isPermisoOrdenPuntajeNomi) {
		this.isPermisoOrdenPuntajeNomi = isPermisoOrdenPuntajeNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPuntajeNomi() {
		return isVisibilidadCeldaNuevoPuntajeNomi;
	}

	public void setIsVisibilidadCeldaNuevoPuntajeNomi(Boolean isVisibilidadCeldaNuevoPuntajeNomi) {
		this.isVisibilidadCeldaNuevoPuntajeNomi = isVisibilidadCeldaNuevoPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPuntajeNomi() {
		return isVisibilidadCeldaDuplicarPuntajeNomi;
	}

	public void setIsVisibilidadCeldaDuplicarPuntajeNomi(Boolean isVisibilidadCeldaDuplicarPuntajeNomi) {
		this.isVisibilidadCeldaDuplicarPuntajeNomi = isVisibilidadCeldaDuplicarPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPuntajeNomi() {
		return isVisibilidadCeldaCopiarPuntajeNomi;
	}

	public void setIsVisibilidadCeldaCopiarPuntajeNomi(Boolean isVisibilidadCeldaCopiarPuntajeNomi) {
		this.isVisibilidadCeldaCopiarPuntajeNomi = isVisibilidadCeldaCopiarPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPuntajeNomi() {
		return isVisibilidadCeldaVerFormPuntajeNomi;
	}

	public void setIsVisibilidadCeldaVerFormPuntajeNomi(Boolean isVisibilidadCeldaVerFormPuntajeNomi) {
		this.isVisibilidadCeldaVerFormPuntajeNomi = isVisibilidadCeldaVerFormPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPuntajeNomi() {
		return isVisibilidadCeldaOrdenPuntajeNomi;
	}

	public void setIsVisibilidadCeldaOrdenPuntajeNomi(Boolean isVisibilidadCeldaOrdenPuntajeNomi) {
		this.isVisibilidadCeldaOrdenPuntajeNomi = isVisibilidadCeldaOrdenPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPuntajeNomi() {
		return isVisibilidadCeldaNuevoRelacionesPuntajeNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPuntajeNomi(Boolean isVisibilidadCeldaNuevoRelacionesPuntajeNomi) {
		this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi = isVisibilidadCeldaNuevoRelacionesPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPuntajeNomi() {
		return isVisibilidadCeldaModificarPuntajeNomi;
	}

	public void setIsVisibilidadCeldaModificarPuntajeNomi(Boolean isVisibilidadCeldaModificarPuntajeNomi) {
		this.isVisibilidadCeldaModificarPuntajeNomi = isVisibilidadCeldaModificarPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPuntajeNomi() {
		return isVisibilidadCeldaActualizarPuntajeNomi;
	}

	public void setIsVisibilidadCeldaActualizarPuntajeNomi(Boolean isVisibilidadCeldaActualizarPuntajeNomi) {
		this.isVisibilidadCeldaActualizarPuntajeNomi = isVisibilidadCeldaActualizarPuntajeNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarPuntajeNomi() {
		return isVisibilidadCeldaEliminarPuntajeNomi;
	}

	public void setIsVisibilidadCeldaEliminarPuntajeNomi(Boolean isVisibilidadCeldaEliminarPuntajeNomi) {
		this.isVisibilidadCeldaEliminarPuntajeNomi = isVisibilidadCeldaEliminarPuntajeNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarPuntajeNomi() {
		return isVisibilidadCeldaCancelarPuntajeNomi;
	}

	public void setIsVisibilidadCeldaCancelarPuntajeNomi(Boolean isVisibilidadCeldaCancelarPuntajeNomi) {
		this.isVisibilidadCeldaCancelarPuntajeNomi = isVisibilidadCeldaCancelarPuntajeNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarPuntajeNomi() {
		return isVisibilidadCeldaGuardarPuntajeNomi;
	}

	public void setIsVisibilidadCeldaGuardarPuntajeNomi(Boolean isVisibilidadCeldaGuardarPuntajeNomi) {
		this.isVisibilidadCeldaGuardarPuntajeNomi = isVisibilidadCeldaGuardarPuntajeNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPuntajeNomi() {
		return isVisibilidadCeldaGuardarCambiosPuntajeNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPuntajeNomi(Boolean isVisibilidadCeldaGuardarCambiosPuntajeNomi) {
		this.isVisibilidadCeldaGuardarCambiosPuntajeNomi = isVisibilidadCeldaGuardarCambiosPuntajeNomi;
	}
		
	public PuntajeNomiSessionBean getpuntajenomiSessionBean() {
		return this.puntajenomiSessionBean;
	}
	
	public void setpuntajenomiSessionBean(PuntajeNomiSessionBean puntajenomiSessionBean) {
		this.puntajenomiSessionBean=puntajenomiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(PuntajeNomi puntajenomi)throws Exception {
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
	
	public void bugActualizarReferenciaActual(PuntajeNomi puntajenomi,PuntajeNomi puntajenomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPuntajeNomi(puntajenomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		puntajenomiAux.setId(puntajenomi.getId());
		puntajenomiAux.setVersionRow(puntajenomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPuntajeNomi();
		
			int intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = puntajenomiValidator.getInvalidValues(this.puntajenomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			puntajenomiLogic.setDatosCliente(datosCliente);
			puntajenomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				puntajenomiAux=new  PuntajeNomi();
				
				puntajenomiAux.setIsNew(true);
				puntajenomiAux.setIsChanged(true);
				
				puntajenomiAux.setPuntajeNomiOriginal(this.puntajenomi);
				
				puntajenomiAux.setId(this.puntajenomi.getId());	
				puntajenomiAux.setVersionRow(this.puntajenomi.getVersionRow());	
				puntajenomiAux.setnombre(this.puntajenomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.puntajenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(puntajenomiAux,puntajenomiLogic.getPuntajeNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntajenomiAux,puntajenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.puntajenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puntajenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntajenomiLogic.savePuntajeNomis();//WithConnection
						//puntajenomiLogic.getSetVersionRowPuntajeNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.puntajenomi,puntajenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				puntajenomiAux=new  PuntajeNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.puntajenomiSessionBean.getEsGuardarRelacionado() 
					|| (this.puntajenomiSessionBean.getEsGuardarRelacionado() && this.puntajenomi.getId()>=0)) {
						
					puntajenomiAux.setIsNew(false);
				}
				
				puntajenomiAux.setIsDeleted(false);
			
				puntajenomiAux.setId(this.puntajenomi.getId());	
				puntajenomiAux.setVersionRow(this.puntajenomi.getVersionRow());	
				puntajenomiAux.setnombre(this.puntajenomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(puntajenomiAux,puntajenomiLogic.getPuntajeNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntajenomiAux,puntajenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.puntajenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puntajenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntajenomiLogic.savePuntajeNomis();//WithConnection
						//puntajenomiLogic.getSetVersionRowPuntajeNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.puntajenomi,puntajenomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				puntajenomiAux=new  PuntajeNomi();
				
				puntajenomiAux.setIsNew(false);
				puntajenomiAux.setIsChanged(false);
				
				puntajenomiAux.setIsDeleted(true);
				
				puntajenomiAux.setId(this.puntajenomi.getId());	
				puntajenomiAux.setVersionRow(this.puntajenomi.getVersionRow());	
				puntajenomiAux.setnombre(this.puntajenomi.getnombre());	
				
				if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.puntajenomiAux.getId()>=0) {	
						this.puntajenomisEliminados.add(puntajenomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(puntajenomiAux,puntajenomiLogic.getPuntajeNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntajenomiAux,puntajenomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.puntajenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.puntajenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntajenomiLogic.savePuntajeNomis();//WithConnection
						//puntajenomiLogic.getSetVersionRowPuntajeNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.quitarFilaTotales();}
							puntajenomiAux.setFormatoNomis(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiLogic.getFormatoNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.puntajenomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(puntajenomiAux,puntajenomiLogic.getPuntajeNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(puntajenomiAux,puntajenomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.getPuntajeNomis().addAll(this.puntajenomisEliminados);
					
					puntajenomiLogic.savePuntajeNomis();//WithConnection
					//puntajenomiLogic.getSetVersionRowPuntajeNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.puntajenomisEliminados= new ArrayList<PuntajeNomi>();		
			}
			
			if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Puntaje Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.puntajenomi=puntajenomiAux;
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
      		//this.finishProcessPuntajeNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(PuntajeNomi puntajenomiLocal) throws Exception {
		
		if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				puntajenomiLocal.setFormatoNomis(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiLogic.getFormatoNomis());
			
			} else {
			
				puntajenomiLocal.setFormatoNomis(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PuntajeNomi puntajenomiLocal) throws Exception {	
		if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarPuntajeNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = puntajenomiValidator.getInvalidValues(this.puntajenomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PuntajeNomi puntajenomi,List<PuntajeNomi> puntajenomis) throws Exception {
		try	{		
			PuntajeNomiConstantesFunciones.actualizarLista(puntajenomi,puntajenomis,this.puntajenomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PuntajeNomi puntajenomi,List<PuntajeNomi> puntajenomis) throws Exception {
		try	{			
			PuntajeNomiConstantesFunciones.actualizarSelectedLista(puntajenomi,puntajenomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PuntajeNomi> puntajenomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				puntajenomisLocal=this.puntajenomiLogic.getPuntajeNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				puntajenomisLocal=this.puntajenomis;
			}
			//ARCHITECTURE
		
			for(PuntajeNomi puntajenomiLocal:puntajenomisLocal) {
				if(this.permiteMantenimiento(puntajenomiLocal) && puntajenomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PuntajeNomiConstantesFunciones.getPuntajeNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PuntajeNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuntajeNomi.jLabelnombrePuntajeNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPuntajeNomi.jLabelnombrePuntajeNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("FormatoNomi")) {
			if(this.puntajenomi==null) {
				this.puntajenomi= new PuntajeNomi();
			}

			if(this.puntajenomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPuntajeNomi
				this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);

				this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.getformatonomi().setPuntajeNomi(this.puntajenomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPuntajeNomi--;	
		
		
		this.puntajenomiAux=new PuntajeNomi();
		
		this.puntajenomiAux.setId(this.iIdNuevoPuntajeNomi);
		this.puntajenomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.puntajenomiLogic.getPuntajeNomis().add(this.puntajenomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.puntajenomis.add(this.puntajenomiAux);
		}
		//ARCHITECTURE
		
		this.puntajenomi=this.puntajenomiAux;
		
		if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPuntajeNomi(this.puntajenomi);
			this.setVariablesObjetoActualToFormularioForeignKeyPuntajeNomi(this.puntajenomi);
		}
				
		//this.setDefaultControlesPuntajeNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPuntajeNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPuntajeNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPuntajeNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPuntajeNomi(this.puntajenomiBean,this.puntajenomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PuntajeNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
			classes=PuntajeNomiConstantesFunciones.getClassesRelationshipsOfPuntajeNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.puntajenomiReturnGeneral=puntajenomiLogic.procesarEventosPuntajeNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puntajenomiLogic.getPuntajeNomis(),this.puntajenomi,this.puntajenomiParameterGeneral,this.isEsNuevoPuntajeNomi,classes);//this.puntajenomiLogic.getPuntajeNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPuntajeNomi(this.puntajenomiReturnGeneral,this.puntajenomiBean,false);
		
		if(this.puntajenomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPuntajeNomi(this.puntajenomiReturnGeneral.getPuntajeNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPuntajeNomi(this.puntajenomiReturnGeneral.getPuntajeNomi());
		}
		
		if(this.puntajenomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPuntajeNomi(this.puntajenomiReturnGeneral.getPuntajeNomi(),classes);//this.puntajenomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPuntajeNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPuntajeNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.RecargarFormPuntajeNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPuntajeNomi(false);
						
			if(puntajenomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.getEsGuardarRelacionado() && FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuntajeNomi();
			}
			
			this.actualizarVisualTableDatosPuntajeNomi();
			
			this.jTableDatosPuntajeNomi.setRowSelectionInterval(this.getIndiceNuevoPuntajeNomi(), this.getIndiceNuevoPuntajeNomi());
			
			this.seleccionarFilaTablaPuntajeNomiActual();
						
			this.actualizarEstadoCeldasBotonesPuntajeNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPuntajeNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.setEnabled(isHabilitar && this.puntajenomiConstantesFunciones.activarnombrePuntajeNomi);	
		
	};
	
	public void setDefaultControlesPuntajeNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPuntajeNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.puntajenomiSessionBean.setConGuardarRelaciones(true);			
			this.puntajenomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.puntajenomiSessionBean.setConGuardarRelaciones(false);			
			this.puntajenomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPuntajeNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
				if(puntajenomiAux.getId().equals(this.iIdNuevoPuntajeNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntajeNomi puntajenomiAux:this.puntajenomis) {
				if(puntajenomiAux.getId().equals(this.iIdNuevoPuntajeNomi)) {
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
	
	public int getIndiceActualPuntajeNomi(PuntajeNomi puntajenomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
				if(puntajenomiAux.getId().equals(puntajenomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntajeNomi puntajenomiAux:this.puntajenomis) {
				if(puntajenomiAux.getId().equals(puntajenomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPuntajeNomi(PuntajeNomi puntajenomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
				if(puntajenomiAux.getPuntajeNomiOriginal().getId().equals(puntajenomiOriginal.getId())) {
					existe=true;
					puntajenomiOriginal.setId(puntajenomiAux.getId());
					puntajenomiOriginal.setVersionRow(puntajenomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntajeNomi puntajenomiAux:this.puntajenomis) {
				if(puntajenomiAux.getPuntajeNomiOriginal().getId().equals(puntajenomiOriginal.getId())) {
					existe=true;
					puntajenomiOriginal.setId(puntajenomiAux.getId());
					puntajenomiOriginal.setVersionRow(puntajenomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPuntajeNomi(Boolean esParaCancelar) throws Exception {
		puntajenomisAux=new ArrayList<PuntajeNomi>();
		puntajenomiAux=new PuntajeNomi();
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
					if(puntajenomiAux.getId()<0) {
						puntajenomisAux.add(puntajenomiAux);
					}		
				}
				this.iIdNuevoPuntajeNomi=0L;
				this.puntajenomiLogic.getPuntajeNomis().removeAll(puntajenomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntajeNomi puntajenomiAux:this.puntajenomis) {
					if(puntajenomiAux.getId()<0) {
						puntajenomisAux.add(puntajenomiAux);
					}		
				}
				this.iIdNuevoPuntajeNomi=0L;
				this.puntajenomis.removeAll(puntajenomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPuntajeNomi 
					&& this.puntajenomiLogic.getPuntajeNomis().size()>0
					) {
					puntajenomiAux=this.puntajenomiLogic.getPuntajeNomis().get(this.puntajenomiLogic.getPuntajeNomis().size() - 1);
				
					if(puntajenomiAux.getId()<0) {
						this.puntajenomiLogic.getPuntajeNomis().remove(puntajenomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPuntajeNomi && this.puntajenomis.size()>0) {
					puntajenomiAux=this.puntajenomis.get(this.puntajenomis.size() - 1);
				
					if(puntajenomiAux.getId()<0) {
						this.puntajenomis.remove(puntajenomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPuntajeNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(puntajenomi.getId()<0) {
				this.puntajenomiLogic.getPuntajeNomis().remove(this.puntajenomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(puntajenomi.getId()<0) {
				this.puntajenomis.remove(this.puntajenomi);
			}
		}			
	}
	
	public void setEstadosInicialesPuntajeNomi(List<PuntajeNomi> puntajenomisAux) throws Exception {
		PuntajeNomiConstantesFunciones.setEstadosInicialesPuntajeNomi(puntajenomisAux);
	}
	
	public void setEstadosInicialesPuntajeNomi(PuntajeNomi puntajenomiAux) throws Exception {
		PuntajeNomiConstantesFunciones.setEstadosInicialesPuntajeNomi(puntajenomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPuntajeNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPuntajeNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPuntajeNomiActual()) {
				if(!this.isEsNuevoPuntajeNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPuntajeNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPuntajeNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPuntajeNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Puntaje Nomi ?", "MANTENIMIENTO DE Puntaje Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPuntajeNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PuntajeNomi puntajenomi) throws Exception {
		PuntajeNomiConstantesFunciones.seleccionarAsignar(this.puntajenomi,puntajenomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPuntajeNomi=this.isPermisoActualizarOriginalPuntajeNomi;
			
			
			this.seleccionarAsignar(puntajenomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PuntajeNomiConstantesFunciones.quitarEspaciosPuntajeNomi(this.puntajenomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPuntajeNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.puntajenomiSessionBean.setsFuncionBusquedaRapida(this.puntajenomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPuntajeNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPuntajeNomi(esParaCancelar);				
				this.cancelarNuevoPuntajeNomi(esParaCancelar);								
			}
			
			this.puntajenomi=new PuntajeNomi();
			
			this.inicializarPuntajeNomi();
			
			this.actualizarEstadoCeldasBotonesPuntajeNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPuntajeNomi() throws Exception {
		try {
			PuntajeNomiConstantesFunciones.inicializarPuntajeNomi(this.puntajenomi);
			
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
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.puntajenomiLogic.getPuntajeNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePuntajeNomis(String sAccionBusqueda,List<PuntajeNomi> puntajenomisParaReportes) throws Exception {
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
					sPathReporteFinal="PuntajeNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PuntajeNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PuntajeNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PuntajeNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Puntaje Nomis");		
		parameters.put("busquedapor", PuntajeNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(FormatoNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PuntajeNomiLogic puntajenomiLogicAuxiliar=new PuntajeNomiLogic();
					puntajenomiLogicAuxiliar.setDatosCliente(puntajenomiLogic.getDatosCliente());				
					puntajenomiLogicAuxiliar.setPuntajeNomis(puntajenomisParaReportes);
					
					puntajenomiLogicAuxiliar.cargarRelacionesLoteForeignKeyPuntajeNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					puntajenomisParaReportes=puntajenomiLogicAuxiliar.getPuntajeNomis();
					
					//puntajenomiLogic.getNewConnexionToDeep();
					
					//for (PuntajeNomi puntajenomi:puntajenomisParaReportes) {
					//	puntajenomiLogic.deepLoad(puntajenomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//puntajenomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//puntajenomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormatoNomi = AuxiliarReportes.class.getResourceAsStream("FormatoNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formatonomi", reportFileFormatoNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePuntajeNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PuntajeNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PuntajeNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePuntajeNomi=new JRBeanArrayDataSource(PuntajeNomiJInternalFrame.TraerPuntajeNomiBeans(puntajenomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePuntajeNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PuntajeNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PuntajeNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PuntajeNomiBean.TraerPuntajeNomiBeans(puntajenomisParaReportes).toArray()));
							
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
				this.generarExcelReportePuntajeNomis(sAccionBusqueda,sTipoArchivoReporte,puntajenomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPuntajeNomis(sAccionBusqueda,sTipoArchivoReporte,puntajenomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPuntajeNomiActionPerformed(null);
					//this.generarExcelReportePuntajeNomis(sAccionBusqueda,sTipoArchivoReporte,puntajenomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPuntajeNomis(sAccionBusqueda,sTipoArchivoReporte,puntajenomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPuntajeNomis(sAccionBusqueda,sTipoArchivoReporte,puntajenomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPuntajeNomis(sAccionBusqueda,sTipoArchivoReporte,puntajenomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePuntajeNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<PuntajeNomi> puntajenomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntajenomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PuntajeNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPuntajeNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PuntajeNomi puntajenomi : puntajenomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PuntajeNomiConstantesFunciones.generarExcelReporteDataPuntajeNomi("NORMAL",row,workbook,puntajenomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPuntajeNomi(String sTipo,Row row,Workbook workbook) {
		
		PuntajeNomiConstantesFunciones.generarExcelReporteHeaderPuntajeNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPuntajeNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<PuntajeNomi> puntajenomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntajenomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PuntajeNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PuntajeNomi puntajenomi : puntajenomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PuntajeNomiConstantesFunciones.getPuntajeNomiDescripcion(puntajenomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PuntajeNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PuntajeNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(puntajenomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPuntajeNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<PuntajeNomi> puntajenomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PuntajeNomi> puntajenomisRespaldo=null;
		
		classes=PuntajeNomiConstantesFunciones.getClassesRelationshipsOfPuntajeNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.puntajenomiLogic.setDatosCliente(this.datosCliente);
		this.puntajenomiLogic.setDatosDeep(this.datosDeep);
		this.puntajenomiLogic.setIsConDeep(true);
		
		puntajenomisRespaldo=this.puntajenomiLogic.getPuntajeNomis();
		
		this.puntajenomiLogic.setPuntajeNomis(puntajenomisParaReportes);	
		this.puntajenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		puntajenomisParaReportes=this.puntajenomiLogic.getPuntajeNomis();
		this.puntajenomiLogic.setPuntajeNomis(puntajenomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntajenomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PuntajeNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPuntajeNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PuntajeNomi puntajenomi : puntajenomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPuntajeNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PuntajeNomiConstantesFunciones.generarExcelReporteDataPuntajeNomi("NORMAL",row,workbook,puntajenomi,cellStyleDataAux);
		
			
			


				//FormatoNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormatoNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(puntajenomi.getFormatoNomis()!=null && puntajenomi.getFormatoNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormatoNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormatoNomiConstantesFunciones.generarExcelReporteHeaderFormatoNomi("RELACIONADO",row,workbook);
				}

				if(puntajenomi.getFormatoNomis()!=null) {
					i2=0;
					for(FormatoNomi formatonomi : puntajenomi.getFormatoNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormatoNomiConstantesFunciones.generarExcelReporteDataFormatoNomi("RELACIONADO",row,workbook,formatonomi,cellStyleDataAuxHijo);
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
		cell.setCellValue(PuntajeNomiConstantesFunciones.getPuntajeNomiDescripcion(puntajenomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPuntajeNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPuntajeNomi() throws Exception {		
		this.startProcessPuntajeNomi(true);
	}
	
	public void startProcessPuntajeNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesPuntajeNomi, this.jScrollPanelDatosPuntajeNomi,this.jPanelPaginacionPuntajeNomi, this.jScrollPanelDatosEdicionPuntajeNomi, this.jPanelAccionesPuntajeNomi,this.jPanelAccionesFormularioPuntajeNomi,this.jmenuBarPuntajeNomi,this.jmenuBarDetallePuntajeNomi,this.jTtoolBarPuntajeNomi,this.jTtoolBarDetallePuntajeNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasPuntajeNomi=null; 
		
		final JPanel jPanelParametrosReportesPuntajeNomi=this.jPanelParametrosReportesPuntajeNomi;
		//final JScrollPane jScrollPanelDatosPuntajeNomi=this.jScrollPanelDatosPuntajeNomi;
		final JTable jTableDatosPuntajeNomi=this.jTableDatosPuntajeNomi;		
		final JPanel jPanelPaginacionPuntajeNomi=this.jPanelPaginacionPuntajeNomi;
		//final JScrollPane jScrollPanelDatosEdicionPuntajeNomi=this.jScrollPanelDatosEdicionPuntajeNomi;
		final JPanel jPanelAccionesPuntajeNomi=this.jPanelAccionesPuntajeNomi;
		
		JPanel jPanelCamposAuxiliarPuntajeNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPuntajeNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			jPanelCamposAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jPanelCamposPuntajeNomi;
			jPanelAccionesFormularioAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jPanelAccionesFormularioPuntajeNomi;
		}
		
		final JPanel jPanelCamposPuntajeNomi=jPanelCamposAuxiliarPuntajeNomi;
		final JPanel jPanelAccionesFormularioPuntajeNomi=jPanelAccionesFormularioAuxiliarPuntajeNomi;
		
		
		final JMenuBar jmenuBarPuntajeNomi=this.jmenuBarPuntajeNomi;
		final JToolBar jTtoolBarPuntajeNomi=this.jTtoolBarPuntajeNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPuntajeNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPuntajeNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			jmenuBarDetalleAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jmenuBarDetallePuntajeNomi;
			jTtoolBarDetalleAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jTtoolBarDetallePuntajeNomi;
		}
		
		final JMenuBar jmenuBarDetallePuntajeNomi=jmenuBarDetalleAuxiliarPuntajeNomi;
		final JToolBar jTtoolBarDetallePuntajeNomi=jTtoolBarDetalleAuxiliarPuntajeNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPuntajeNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPuntajeNomi;
			processRunnable.jTableDatos=jTableDatosPuntajeNomi;
			processRunnable.jPanelCampos=jPanelCamposPuntajeNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionPuntajeNomi;
			processRunnable.jPanelAcciones=jPanelAccionesPuntajeNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPuntajeNomi;
			
			
			processRunnable.jmenuBar=jmenuBarPuntajeNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePuntajeNomi;
			processRunnable.jTtoolBar=jTtoolBarPuntajeNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePuntajeNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPuntajeNomi ,jPanelParametrosReportesPuntajeNomi,jTableDatosPuntajeNomi, /*jScrollPanelDatosPuntajeNomi,*/jPanelCamposPuntajeNomi,jPanelPaginacionPuntajeNomi, /*jScrollPanelDatosEdicionPuntajeNomi,*/ jPanelAccionesPuntajeNomi,jPanelAccionesFormularioPuntajeNomi,jmenuBarPuntajeNomi,jmenuBarDetallePuntajeNomi,jTtoolBarPuntajeNomi,jTtoolBarDetallePuntajeNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesPuntajeNomi, jScrollPanelDatosPuntajeNomi,jPanelPaginacionPuntajeNomi, jScrollPanelDatosEdicionPuntajeNomi, jPanelAccionesPuntajeNomi,jPanelAccionesFormularioPuntajeNomi,jmenuBarPuntajeNomi,jmenuBarDetallePuntajeNomi,jTtoolBarPuntajeNomi,jTtoolBarDetallePuntajeNomi);
						
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
	
	public void finishProcessPuntajeNomi() {// throws Exception 
		this.finishProcessPuntajeNomi(true);
	}
	
	public void finishProcessPuntajeNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesPuntajeNomi, this.jScrollPanelDatosPuntajeNomi,this.jPanelPaginacionPuntajeNomi, this.jScrollPanelDatosEdicionPuntajeNomi, this.jPanelAccionesPuntajeNomi,this.jPanelAccionesFormularioPuntajeNomi,this.jmenuBarPuntajeNomi,this.jmenuBarDetallePuntajeNomi,this.jTtoolBarPuntajeNomi,this.jTtoolBarDetallePuntajeNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasPuntajeNomi=null; 
		
		final JPanel jPanelParametrosReportesPuntajeNomi=this.jPanelParametrosReportesPuntajeNomi;
		//final JScrollPane jScrollPanelDatosPuntajeNomi=this.jScrollPanelDatosPuntajeNomi;
		final JTable jTableDatosPuntajeNomi=this.jTableDatosPuntajeNomi;		
		final JPanel jPanelPaginacionPuntajeNomi=this.jPanelPaginacionPuntajeNomi;
		//final JScrollPane jScrollPanelDatosEdicionPuntajeNomi=this.jScrollPanelDatosEdicionPuntajeNomi;
		final JPanel jPanelAccionesPuntajeNomi=this.jPanelAccionesPuntajeNomi;
		
		JPanel jPanelCamposAuxiliarPuntajeNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPuntajeNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			jPanelCamposAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jPanelCamposPuntajeNomi;
			jPanelAccionesFormularioAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jPanelAccionesFormularioPuntajeNomi;
		}
		
		final JPanel jPanelCamposPuntajeNomi=jPanelCamposAuxiliarPuntajeNomi;
		final JPanel jPanelAccionesFormularioPuntajeNomi=jPanelAccionesFormularioAuxiliarPuntajeNomi;
		
		
		final JMenuBar jmenuBarPuntajeNomi=this.jmenuBarPuntajeNomi;		
		final JToolBar jTtoolBarPuntajeNomi=this.jTtoolBarPuntajeNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarPuntajeNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPuntajeNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			jmenuBarDetalleAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jmenuBarDetallePuntajeNomi;
			jTtoolBarDetalleAuxiliarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jTtoolBarDetallePuntajeNomi;		
		}
		
		final JMenuBar jmenuBarDetallePuntajeNomi=jmenuBarDetalleAuxiliarPuntajeNomi;
		final JToolBar jTtoolBarDetallePuntajeNomi=jTtoolBarDetalleAuxiliarPuntajeNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPuntajeNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPuntajeNomi;
			processRunnable.jTableDatos=jTableDatosPuntajeNomi;
			processRunnable.jPanelCampos=jPanelCamposPuntajeNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionPuntajeNomi;
			processRunnable.jPanelAcciones=jPanelAccionesPuntajeNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPuntajeNomi;
			
			
			processRunnable.jmenuBar=jmenuBarPuntajeNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePuntajeNomi;
			processRunnable.jTtoolBar=jTtoolBarPuntajeNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePuntajeNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPuntajeNomi ,jPanelParametrosReportesPuntajeNomi, jTableDatosPuntajeNomi,/*jScrollPanelDatosPuntajeNomi,*/jPanelCamposPuntajeNomi,jPanelPaginacionPuntajeNomi, /*jScrollPanelDatosEdicionPuntajeNomi,*/ jPanelAccionesPuntajeNomi,jPanelAccionesFormularioPuntajeNomi,jmenuBarPuntajeNomi,jmenuBarDetallePuntajeNomi,jTtoolBarPuntajeNomi,jTtoolBarDetallePuntajeNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPuntajeNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPuntajeNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPuntajeNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPuntajeNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPuntajeNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePuntajeNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPuntajeNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPuntajeNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePuntajeNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.puntajenomiConstantesFunciones.getsFinalQueryPuntajeNomi();
		String  finalQueryPaginacionTodos=this.puntajenomiConstantesFunciones.getsFinalQueryPuntajeNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PuntajeNomiConstantesFunciones.getArrayColumnasGlobalesNoPuntajeNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PuntajeNomiConstantesFunciones.getArrayColumnasGlobalesPuntajeNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PuntajeNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.puntajenomisEliminados= new ArrayList<PuntajeNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPuntajeNomi();
		
				///*PuntajeNomiSessionBean*/this.puntajenomiSessionBean=new PuntajeNomiSessionBean();
			
			if(this.puntajenomiSessionBean==null) {
				this.puntajenomiSessionBean=new PuntajeNomiSessionBean();
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
					this.iNumeroPaginacion=PuntajeNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PuntajeNomiConstantesFunciones.getClassesForeignKeysOfPuntajeNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/puntajenomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			puntajenomisAux= new ArrayList<PuntajeNomi>();
			
				
			puntajenomiLogic.setDatosCliente(this.datosCliente);
			puntajenomiLogic.setDatosDeep(this.datosDeep);
			puntajenomiLogic.setIsConDeep(true);
			
			
			puntajenomiLogic.getPuntajeNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					puntajenomiLogic.getTodosPuntajeNomis(finalQueryGlobal,pagination);
					
					//puntajenomiLogic.getTodosPuntajeNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(puntajenomiLogic.getPuntajeNomis()==null|| puntajenomiLogic.getPuntajeNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puntajenomisAux= new ArrayList<PuntajeNomi>();
							puntajenomisAux.addAll(puntajenomiLogic.getPuntajeNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puntajenomisAux= new ArrayList<PuntajeNomi>();
							puntajenomisAux.addAll(puntajenomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puntajenomiLogic.getTodosPuntajeNomis(finalQueryGlobal+"",this.pagination);												
							
							//puntajenomiLogic.getTodosPuntajeNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePuntajeNomis("Todos",puntajenomiLogic.getPuntajeNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							puntajenomiLogic.setPuntajeNomis(new ArrayList<PuntajeNomi>());					
							puntajenomiLogic.getPuntajeNomis().addAll(puntajenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puntajenomis=new ArrayList<PuntajeNomi>();
							puntajenomis.addAll(puntajenomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPuntajeNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPuntajeNomi=this.idActual;
				
				} else if(this.idPuntajeNomiActual!=null && this.idPuntajeNomiActual!=0L) {
					idPuntajeNomi=idPuntajeNomiActual;
				}
				
					
				this.sDetalleReporte=PuntajeNomiConstantesFunciones.getDetalleIndicePorId(idPuntajeNomi);
				
				this.puntajenomis=new ArrayList<PuntajeNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					puntajenomiLogic.getEntity(idPuntajeNomi);
					
					//puntajenomiLogic.getEntityWithConnection(idPuntajeNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puntajenomiLogic.setPuntajeNomis(new ArrayList<PuntajeNomi>());
					puntajenomiLogic.getPuntajeNomis().add(puntajenomiLogic.getPuntajeNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puntajenomis=new ArrayList<PuntajeNomi>();
					this.puntajenomis.add(puntajenomi);
				}
				
				if(puntajenomiLogic.getPuntajeNomi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPuntajeNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPuntajeNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=puntajenomiLogic.getPuntajeNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puntajenomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=puntajenomiLogic.getPuntajeNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=puntajenomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PuntajeNomi puntajenomi) {
		Boolean permite=true;
		
		if(this.puntajenomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PuntajeNomiConstantesFunciones.getOrderByListaPuntajeNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PuntajeNomiConstantesFunciones.getOrderByListaPuntajeNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntajeNomi puntajenomi:puntajenomiLogic.getPuntajeNomis()) {
				if(puntajenomi.getsType().equals(Constantes2.S_TOTALES)) {
					puntajenomiTotales=puntajenomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntajeNomi puntajenomi:this.puntajenomis) {
				if(puntajenomi.getsType().equals(Constantes2.S_TOTALES)) {
					puntajenomiTotales=puntajenomi;
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
			this.puntajenomiAux=new PuntajeNomi();
			this.puntajenomiAux.setsType(Constantes2.S_TOTALES);
			this.puntajenomiAux.setIsNew(false);
			this.puntajenomiAux.setIsChanged(false);
			this.puntajenomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PuntajeNomiConstantesFunciones.TotalizarValoresFilaPuntajeNomi(this.puntajenomiLogic.getPuntajeNomis(),this.puntajenomiAux);
				
				this.puntajenomiLogic.getPuntajeNomis().add(this.puntajenomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PuntajeNomiConstantesFunciones.TotalizarValoresFilaPuntajeNomi(this.puntajenomis,this.puntajenomiAux);
				
				this.puntajenomis.add(this.puntajenomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		puntajenomiTotales=new PuntajeNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.puntajenomiLogic.getPuntajeNomis().remove(puntajenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.puntajenomis.remove(puntajenomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		puntajenomiTotales=new PuntajeNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PuntajeNomi puntajenomi:puntajenomiLogic.getPuntajeNomis()) {
				if(puntajenomi.getsType().equals(Constantes2.S_TOTALES)) {
					puntajenomiTotales=puntajenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PuntajeNomiConstantesFunciones.TotalizarValoresFilaPuntajeNomi(this.puntajenomiLogic.getPuntajeNomis(),puntajenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PuntajeNomi puntajenomi:this.puntajenomis) {
				if(puntajenomi.getsType().equals(Constantes2.S_TOTALES)) {
					puntajenomiTotales=puntajenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PuntajeNomiConstantesFunciones.TotalizarValoresFilaPuntajeNomi(this.puntajenomis,puntajenomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosPuntajeNomi() {
		this.isPermisoTodoPuntajeNomi=false;
		this.isPermisoNuevoPuntajeNomi=false;
		this.isPermisoActualizarPuntajeNomi=false;
		this.isPermisoActualizarOriginalPuntajeNomi=false;
		this.isPermisoEliminarPuntajeNomi=false;
		this.isPermisoGuardarCambiosPuntajeNomi=false;
		this.isPermisoConsultaPuntajeNomi=false;
		this.isPermisoBusquedaPuntajeNomi=false;
		this.isPermisoReportePuntajeNomi=false;		
		this.isPermisoOrdenPuntajeNomi=false;		
		this.isPermisoPaginacionMedioPuntajeNomi=false;		
		this.isPermisoPaginacionAltoPuntajeNomi=false;
		this.isPermisoPaginacionTodoPuntajeNomi=false;
		this.isPermisoCopiarPuntajeNomi=false;		
		this.isPermisoVerFormPuntajeNomi=false;		
		this.isPermisoDuplicarPuntajeNomi=false;		
		this.isPermisoOrdenPuntajeNomi=false;		
	}
	
	public void setPermisosUsuarioPuntajeNomi(Boolean isPermiso) {
		this.isPermisoTodoPuntajeNomi=isPermiso;
		this.isPermisoNuevoPuntajeNomi=isPermiso;
		this.isPermisoActualizarPuntajeNomi=isPermiso;
		this.isPermisoActualizarOriginalPuntajeNomi=isPermiso;
		this.isPermisoEliminarPuntajeNomi=isPermiso;
		this.isPermisoGuardarCambiosPuntajeNomi=isPermiso;
		this.isPermisoConsultaPuntajeNomi=isPermiso;
		this.isPermisoBusquedaPuntajeNomi=isPermiso;
		this.isPermisoReportePuntajeNomi=isPermiso;
		this.isPermisoOrdenPuntajeNomi=isPermiso;		
		this.isPermisoPaginacionMedioPuntajeNomi=isPermiso;		
		this.isPermisoPaginacionAltoPuntajeNomi=isPermiso;		
		this.isPermisoPaginacionTodoPuntajeNomi=isPermiso;		
		this.isPermisoCopiarPuntajeNomi=isPermiso;		
		this.isPermisoVerFormPuntajeNomi=isPermiso;		
		this.isPermisoDuplicarPuntajeNomi=isPermiso;
		this.isPermisoOrdenPuntajeNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPuntajeNomi(Boolean isPermiso) {
		//this.isPermisoTodoPuntajeNomi=isPermiso;
		this.isPermisoNuevoPuntajeNomi=isPermiso;
		this.isPermisoActualizarPuntajeNomi=isPermiso;
		this.isPermisoActualizarOriginalPuntajeNomi=isPermiso;
		this.isPermisoEliminarPuntajeNomi=isPermiso;
		this.isPermisoGuardarCambiosPuntajeNomi=isPermiso;
		//this.isPermisoConsultaPuntajeNomi=isPermiso;
		//this.isPermisoBusquedaPuntajeNomi=isPermiso;
		//this.isPermisoReportePuntajeNomi=isPermiso;
		//this.isPermisoOrdenPuntajeNomi=isPermiso;		
		//this.isPermisoPaginacionMedioPuntajeNomi=isPermiso;		
		//this.isPermisoPaginacionAltoPuntajeNomi=isPermiso;		
		//this.isPermisoPaginacionTodoPuntajeNomi=isPermiso;		
		//this.isPermisoCopiarPuntajeNomi=isPermiso;		
		//this.isPermisoDuplicarPuntajeNomi=isPermiso;
		//this.isPermisoOrdenPuntajeNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPuntajeNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormatoNomiConstantesFunciones.SNOMBREOPCION);
		
		if(PuntajeNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormatoNomi=false;
		this.isTienePermisosFormatoNomi=this.verificarGetPermisosUsuarioOpcionPuntajeNomiClaseRelacionada(this.opcionsRelacionadas,FormatoNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPuntajeNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPuntajeNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormatoNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPuntajeNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPuntajeNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPuntajeNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormatoNomi && this.jInternalFrameDetalleFormPuntajeNomi!=null && this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.remove(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPuntajeNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PuntajeNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PuntajeNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPuntajeNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPuntajeNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPuntajeNomi=this.isPermisoActualizarPuntajeNomi;
			this.isPermisoEliminarPuntajeNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPuntajeNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPuntajeNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPuntajeNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPuntajeNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePuntajeNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPuntajeNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPuntajeNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPuntajeNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPuntajeNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPuntajeNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPuntajeNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPuntajeNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPuntajeNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPuntajeNomi.setToolTipText(this.jTableDatosPuntajeNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPuntajeNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPuntajeNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PuntajeNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PuntajeNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPuntajeNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormatoNomi && this.puntajenomiConstantesFunciones.mostrarFormatoNomiPuntajeNomi && !PuntajeNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formato Nomi");
			reporte.setsDescripcion("Formato Nomi");
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
	
		
	public void inicializarCombosForeignKeyPuntajeNomiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPuntajeNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PuntajeNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPuntajeNomiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyPuntajeNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPuntajeNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyPuntajeNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPuntajeNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPuntajeNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPuntajeNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPuntajeNomi(PuntajeNomi puntajenomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPuntajeNomi(PuntajeNomi puntajenomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPuntajeNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPuntajeNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPuntajeNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPuntajeNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPuntajeNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPuntajeNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPuntajeNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPuntajeNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public PuntajeNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PuntajeNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PuntajeNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.puntajenomiSessionBean=new PuntajeNomiSessionBean(); 
		this.puntajenomiConstantesFunciones=new PuntajeNomiConstantesFunciones(); 
		this.puntajenomiBean=new PuntajeNomi();//(this.puntajenomiConstantesFunciones); 		
		this.puntajenomiReturnGeneral=new PuntajeNomiParameterReturnGeneral(); 
		
		this.puntajenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puntajenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PuntajeNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PuntajeNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PuntajeNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPuntajeNomi(true);
			
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
			
			this.puntajenomiConstantesFunciones=new PuntajeNomiConstantesFunciones(); 
			this.puntajenomiBean=new PuntajeNomi();//this.puntajenomiConstantesFunciones); 			
			this.puntajenomiReturnGeneral=new PuntajeNomiParameterReturnGeneral(); 
		
			PuntajeNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Puntaje Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.puntajenomi=new PuntajeNomi();
			this.puntajenomis = new ArrayList<PuntajeNomi>();
			this.puntajenomisAux = new ArrayList<PuntajeNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic=new PuntajeNomiLogic();
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.puntajenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.puntajenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPuntajeNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPuntajeNomi);	
					}
					
					if(this.jInternalFrameImportacionPuntajeNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPuntajeNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPuntajeNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPuntajeNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPuntajeNomi);
				this.jInternalFrameDetalleFormPuntajeNomi.setVisible(false);
				this.jInternalFrameDetalleFormPuntajeNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPuntajeNomi);
					this.jInternalFrameReporteDinamicoPuntajeNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoPuntajeNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPuntajeNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPuntajeNomi);
					this.jInternalFrameImportacionPuntajeNomi.setVisible(false);
					this.jInternalFrameImportacionPuntajeNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPuntajeNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPuntajeNomi);
					this.jInternalFrameOrderByPuntajeNomi.setVisible(false);
					this.jInternalFrameOrderByPuntajeNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPuntajeNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PuntajeNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.puntajenomiReturnGeneral=new PuntajeNomiParameterReturnGeneral();
			
			this.puntajenomiParameterGeneral=new PuntajeNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.puntajenomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PuntajeNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormatoNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PuntajeNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.puntajenomiSessionBean.getEsGuardarRelacionado(),this.puntajenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PuntajeNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.puntajenomiSessionBean.getEsGuardarRelacionado(),this.puntajenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPuntajeNomi=false;
			this.isVisibilidadCeldaDuplicarPuntajeNomi=true;
			this.isVisibilidadCeldaCopiarPuntajeNomi=true;
			this.isVisibilidadCeldaVerFormPuntajeNomi=true;
			this.isVisibilidadCeldaOrdenPuntajeNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
			this.isVisibilidadCeldaModificarPuntajeNomi=false;
			this.isVisibilidadCeldaActualizarPuntajeNomi=false;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
			this.isVisibilidadCeldaCancelarPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPuntajeNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPuntajeNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPuntajeNomi(false);
			
			this.setPermisosUsuarioPuntajeNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puntajenomiSessionBean.getEsGuardarRelacionado() 
				|| (this.puntajenomiSessionBean.getEsGuardarRelacionado() && this.puntajenomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPuntajeNomiClasesRelacionadas();
			}
			
			if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPuntajeNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPuntajeNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPuntajeNomi();
			}
			
			if(!this.isPermisoBusquedaPuntajeNomi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPuntajeNomi,this.isPermisoPaginacionMedioPuntajeNomi,this.isPermisoPaginacionTodoPuntajeNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PuntajeNomiConstantesFunciones.getTiposSeleccionarPuntajeNomi());
				
				this.tiposColumnasSelect=PuntajeNomiConstantesFunciones.getTiposSeleccionarPuntajeNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPuntajeNomi();				
				//this.tiposRelacionesSelect=PuntajeNomiConstantesFunciones.getTiposRelacionesPuntajeNomi(true);
				
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
			//if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPuntajeNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioPuntajeNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioPuntajeNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPuntajeNomi() ;
			
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
			
			
			this.formatonomiLogic=new FormatoNomiLogic(); 
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
				puntajenomiImplementable= (PuntajeNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PuntajeNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				puntajenomiImplementableHome= (PuntajeNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PuntajeNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.puntajenomis= new ArrayList<PuntajeNomi>();
			this.puntajenomisEliminados= new ArrayList<PuntajeNomi>();
						
			this.isEsNuevoPuntajeNomi=false;
			this.esParaAccionDesdeFormularioPuntajeNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPuntajeNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPuntajeNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PuntajeNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PuntajeNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPuntajeNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPuntajeNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPuntajeNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPuntajeNomi();
			}
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPuntajeNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PuntajeNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPuntajeNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPuntajeNomi")) {
				iIndex=this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Formato Nomis")) {
					if(!FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPuntajeNomi();

						this.cargarParteTabPanelRelacionadaFormatoNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPuntajeNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormatoNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPuntajeNomi.cargarSessionConBeanSwingJInternalFrameFormatoNomi(false,true,iIndex);
		this.jButtonFormatoNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormatoNomi();

		//this.jTabbedPaneRelacionesPuntajeNomi.updateUI();
		//this.jTabbedPaneRelacionesPuntajeNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPuntajeNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("FormatoNomi")) {
				int row=this.jTableDatosPuntajeNomi.getSelectedRow();
				jButtonFormatoNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formato Nomi")) {

					if(this.isTienePermisosFormatoNomi && this.puntajenomiConstantesFunciones.mostrarFormatoNomiPuntajeNomi && !PuntajeNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formato Nomis"+"("+FormatoNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formato Nomis");

						if(puntajenomiConstantesFunciones.resaltarFormatoNomiPuntajeNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(puntajenomiConstantesFunciones.resaltarFormatoNomiPuntajeNomi);
						}

						jmenuItem.setEnabled(this.puntajenomiConstantesFunciones.activarFormatoNomiPuntajeNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FormatoNomi"));

						

						this.jInternalFrameDetalleFormPuntajeNomi.jmenuDetallePuntajeNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPuntajeNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPuntajeNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPuntajeNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPuntajeNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPuntajeNomi();
		
		this.cargarCombosFrameForeignKeyPuntajeNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPuntajeNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPuntajeNomi();
		}
	}
	
	
	
	public void jButtonNuevoPuntajeNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
			
			if(jTableDatosPuntajeNomi.getRowCount()>=1) {
				jTableDatosPuntajeNomi.removeRowSelectionInterval(0, jTableDatosPuntajeNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoPuntajeNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPuntajeNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPuntajeNomi(true);			
			//this.puntajenomi=new PuntajeNomi();
			//this.puntajenomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuntajeNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntajeNomi() ;
			
			if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuntajeNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.puntajenomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);				
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
			if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PuntajeNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPuntajeNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPuntajeNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPuntajeNomi.getSelectedRows().length;			
			}
			
			puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPuntajeNomi--;			
				//PuntajeNomi puntajenomiAux= new PuntajeNomi();			
				//puntajenomiAux.setId(this.iIdNuevoPuntajeNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PuntajeNomi puntajenomiOrigen=new PuntajeNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PuntajeNomi puntajenomiOrigen : puntajenomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							puntajenomiOrigen =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							puntajenomiOrigen =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPuntajeNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.puntajenomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPuntajeNomi(puntajenomiOrigen,this.puntajenomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.puntajenomiLogic.getPuntajeNomis().add(this.puntajenomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.puntajenomis.add(this.puntajenomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPuntajeNomi(false);
				
				this.jTableDatosPuntajeNomi.setRowSelectionInterval(this.getIndiceNuevoPuntajeNomi(), this.getIndiceNuevoPuntajeNomi());
				
				int iLastRow =  this.jTableDatosPuntajeNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPuntajeNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPuntajeNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPuntajeNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();									
		
			PuntajeNomi puntajenomiOrigen=new PuntajeNomi();
			PuntajeNomi puntajenomiDestino=new PuntajeNomi();
				
			puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPuntajeNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || puntajenomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPuntajeNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntajenomiOrigen =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						puntajenomiOrigen =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						puntajenomiDestino =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						puntajenomiDestino =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				puntajenomiOrigen =puntajenomisSeleccionados.get(0);
				puntajenomiDestino =puntajenomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPuntajeNomi(puntajenomiOrigen,puntajenomiDestino,true,false);
				
				puntajenomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(puntajenomiDestino,puntajenomiLogic.getPuntajeNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(puntajenomiDestino,puntajenomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPuntajeNomi(false);
				
				//this.jTableDatosPuntajeNomi.setRowSelectionInterval(this.getIndiceNuevoPuntajeNomi(), this.getIndiceNuevoPuntajeNomi());
				
				int iLastRow =  this.jTableDatosPuntajeNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPuntajeNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPuntajeNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPuntajeNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPuntajeNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPuntajeNomi.isVisible();
			
			
			this.jPanelParametrosReportesPuntajeNomi.setVisible(!isVisible);
			this.jPanelPaginacionPuntajeNomi.setVisible(!isVisible);
			this.jPanelAccionesPuntajeNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePuntajeNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPuntajeNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPuntajeNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPuntajeNomi();
			
			this.abrirFrameOrderByPuntajeNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPuntajeNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePuntajeNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPuntajeNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPuntajeNomi.isMaximum()) {
					this.jInternalFrameDetalleFormPuntajeNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPuntajeNomi.setSize(this.jInternalFrameDetalleFormPuntajeNomi.iWidthFormulario,this.jInternalFrameDetalleFormPuntajeNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPuntajeNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPuntajeNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPuntajeNomi.isMaximum()) {
						this.jInternalFrameDetalleFormPuntajeNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPuntajeNomi.jContentPaneDetallePuntajeNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPuntajeNomi.jContentPaneDetallePuntajeNomi.getWidth(),PuntajeNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPuntajeNomi.jContentPaneDetallePuntajeNomi.getWidth(),PuntajeNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPuntajeNomi.jContentPaneDetallePuntajeNomi.getWidth(),PuntajeNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormatoNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPuntajeNomi.setVisible(true);
	        this.jInternalFrameDetalleFormPuntajeNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPuntajeNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPuntajeNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPuntajeNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntajeNomi,false,this);
				} else {
					this.jInternalFrameOrderByPuntajeNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPuntajeNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPuntajeNomi);
				this.jInternalFrameOrderByPuntajeNomi.setVisible(false);
				this.jInternalFrameOrderByPuntajeNomi.setSelected(false);
				
				this.jInternalFrameOrderByPuntajeNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPuntajeNomi"));
				
				this.inicializarActualizarBindingTablaOrderByPuntajeNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPuntajeNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPuntajeNomi==null) {
				
				this.jInternalFrameImportacionPuntajeNomi=new ImportacionJInternalFrame(PuntajeNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPuntajeNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPuntajeNomi);
				this.jInternalFrameImportacionPuntajeNomi.setVisible(false);
				this.jInternalFrameImportacionPuntajeNomi.setSelected(false);


				this.jInternalFrameImportacionPuntajeNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPuntajeNomi"));
				this.jInternalFrameImportacionPuntajeNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPuntajeNomi"));
				this.jInternalFrameImportacionPuntajeNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPuntajeNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPuntajeNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPuntajeNomi==null) {
				this.jInternalFrameReporteDinamicoPuntajeNomi=new ReporteDinamicoJInternalFrame(PuntajeNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPuntajeNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPuntajeNomi);
				this.jInternalFrameReporteDinamicoPuntajeNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoPuntajeNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuntajeNomi"));
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuntajeNomi"));
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuntajeNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuntajeNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormatoNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPuntajeNomi.jContentPaneDetallePuntajeNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePuntajeNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPuntajeNomi);
			
	       	this.jInternalFrameDetalleFormPuntajeNomi.setVisible(false);
	        this.jInternalFrameDetalleFormPuntajeNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormPuntajeNomi.dispose();
			//this.jInternalFrameDetalleFormPuntajeNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPuntajeNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPuntajeNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoPuntajeNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPuntajeNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPuntajeNomi.setVisible(true);
	        this.jInternalFrameImportacionPuntajeNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPuntajeNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPuntajeNomi.setVisible(true);
	        this.jInternalFrameOrderByPuntajeNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPuntajeNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPuntajeNomi.setVisible(false);
	        this.jInternalFrameOrderByPuntajeNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPuntajeNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPuntajeNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoPuntajeNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPuntajeNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPuntajeNomi.setVisible(false);
	        this.jInternalFrameImportacionPuntajeNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPuntajeNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPuntajeNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPuntajeNomi(true);
			//this.isEsNuevoPuntajeNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPuntajeNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuntajeNomi(false) ;
			
			if(puntajenomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.getEsGuardarRelacionado() && FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuntajeNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntajeNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPuntajeNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPuntajeNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPuntajeNomi(true);
			//this.isEsNuevoPuntajeNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.puntajenomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPuntajeNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPuntajeNomi(false) ;
			
			if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePuntajeNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntajeNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPuntajeNomi(false);
			
			//if(!this.isEsNuevoPuntajeNomi) {								
				int intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
				
			}
			
			if(this.permiteMantenimiento(this.puntajenomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPuntajeNomi=true;
					this.inicializarActualizarBindingTablaPuntajeNomi(false);
					this.isEsNuevoPuntajeNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPuntajeNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPuntajeNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPuntajeNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuntajeNomi(false);
				
				this.habilitarDeshabilitarControlesPuntajeNomi(false);
			
												
				
				if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePuntajeNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPuntajeNomiActionPerformed(evt,puntajenomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPuntajeNomi(this.puntajenomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPuntajeNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,puntajenomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.puntajenomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				this.puntajenomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				this.puntajenomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.puntajenomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PuntajeNomiModel) this.jTableDatosPuntajeNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPuntajeNomi=true;
				this.inicializarActualizarBindingTablaPuntajeNomi(false);
				this.isEsNuevoPuntajeNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPuntajeNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuntajeNomi(false);
				
				this.habilitarDeshabilitarControlesPuntajeNomi(false);
				
				
				
				if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePuntajeNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPuntajeNomi.getRowCount()>=1) {
				jTableDatosPuntajeNomi.removeRowSelectionInterval(0, jTableDatosPuntajeNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPuntajeNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPuntajeNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPuntajeNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPuntajeNomi(false) ;
			
			this.isEsNuevoPuntajeNomi=false;
			
			if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePuntajeNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPuntajeNomi(false);
				
				//SI ES MANUAL
				if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPuntajeNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPuntajeNomi--;			
			//PuntajeNomi puntajenomiAux= new PuntajeNomi();			
			//puntajenomiAux.setId(this.iIdNuevoPuntajeNomi);
			
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPuntajeNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
			
			this.puntajenomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.puntajenomiLogic.getPuntajeNomis().add(this.puntajenomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.puntajenomis.add(this.puntajenomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPuntajeNomi(false);
			
			this.jTableDatosPuntajeNomi.setRowSelectionInterval(this.getIndiceNuevoPuntajeNomi(), this.getIndiceNuevoPuntajeNomi());
			
			int iLastRow =  this.jTableDatosPuntajeNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPuntajeNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPuntajeNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPuntajeNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPuntajeNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntajeNomi(false);
			
			//SI ES MANUAL
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuntajeNomi();
			}
			
			//this.abrirFrameTreePuntajeNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Puntaje NomiS ?", "MANTENIMIENTO DE Puntaje Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPuntajeNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPuntajeNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.puntajenomiReturnGeneral=puntajenomiLogic.procesarImportacionPuntajeNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.puntajenomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPuntajeNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPuntajeNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPuntajeNomi.setFileImportacion(this.jInternalFrameImportacionPuntajeNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPuntajeNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPuntajeNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPuntajeNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPuntajeNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		

		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PuntajeNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PuntajeNomiBaseDesign.jrxml";
			
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
			
			this.generarReportePuntajeNomis("Todos",puntajenomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PuntajeNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoPuntajeNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PuntajeNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PuntajeNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PuntajeNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntajenomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PuntajeNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PuntajeNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PuntajeNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PuntajeNomi puntajenomi:puntajenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(puntajenomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelPuntajeNomi(row);				
			//	iRow++;
			//}				
			
			//for(PuntajeNomi puntajenomiAux:puntajenomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPuntajeNomi(puntajenomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntajeNomi(false);
			
			//SI ES MANUAL
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPuntajeNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntajeNomi(false);
			
			//SI ES MANUAL
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPuntajeNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPuntajeNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPuntajeNomi(false);
			
			//SI ES MANUAL
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPuntajeNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.puntajenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPuntajeNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPuntajeNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPuntajeNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPuntajeNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPuntajeNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPuntajeNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosPuntajeNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosPuntajeNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPuntajeNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPuntajeNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPuntajeNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPuntajeNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPuntajeNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPuntajeNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPuntajeNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPuntajeNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPuntajeNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPuntajeNomi();
		
		this.inicializarActualizarBindingBotonesManualPuntajeNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPuntajeNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPuntajeNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPuntajeNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPuntajeNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPuntajeNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPuntajeNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePuntajeNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPuntajeNomi.jCheckBoxPostAccionNuevoPuntajeNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPuntajeNomi.jCheckBoxPostAccionSinCerrarPuntajeNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPuntajeNomi.jCheckBoxPostAccionSinMensajePuntajeNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPuntajeNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPuntajeNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePuntajeNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
				this.jInternalFrameDetalleFormPuntajeNomi.jCheckBoxPostAccionNuevoPuntajeNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPuntajeNomi.jCheckBoxPostAccionSinCerrarPuntajeNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPuntajeNomi.jCheckBoxPostAccionSinMensajePuntajeNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPuntajeNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPuntajeNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPuntajeNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPuntajeNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPuntajeNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPuntajeNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPuntajeNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPuntajeNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPuntajeNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPuntajeNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPuntajeNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPuntajeNomi() throws Exception {
		try	{
			if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPuntajeNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePuntajeNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPuntajeNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPuntajeNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPuntajeNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPuntajeNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPuntajeNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPuntajeNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPuntajeNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPuntajeNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPuntajeNomi.addItem(reporte);
			}
			
			
			if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPuntajeNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPuntajeNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPuntajeNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPuntajeNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPuntajeNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPuntajeNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPuntajeNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPuntajeNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPuntajeNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuntajeNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPuntajeNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPuntajeNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPuntajeNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPuntajeNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPuntajeNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPuntajeNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPuntajeNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPuntajeNomi(Boolean esInicializar) throws Exception {				
		if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPuntajeNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPuntajeNomi() throws Exception {
		this.inicializarActualizarBindingTablaPuntajeNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPuntajeNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PuntajeNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PuntajeNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPuntajeNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntajeNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PuntajeNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PuntajeNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPuntajeNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=puntajenomiLogic.getPuntajeNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=puntajenomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPuntajeNomi.setModel(new PuntajeNomiModel(this.puntajenomiLogic.getPuntajeNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPuntajeNomi.setModel(new PuntajeNomiModel(this.puntajenomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPuntajeNomi!=null && this.jInternalFrameOrderByPuntajeNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPuntajeNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPuntajeNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntajeNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PuntajeNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO,puntajenomiConstantesFunciones.resaltarSeleccionarPuntajeNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PuntajeNomiConstantesFunciones.SCLASSWEBTITULO,puntajenomiConstantesFunciones.resaltarSeleccionarPuntajeNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPuntajeNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntajeNomi,PuntajeNomiConstantesFunciones.LABEL_ID));

		if(this.puntajenomiConstantesFunciones.mostraridPuntajeNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuntajeNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.puntajenomiConstantesFunciones.resaltaridPuntajeNomi,this.puntajenomiConstantesFunciones.activaridPuntajeNomi,this,true,"idPuntajeNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.puntajenomiConstantesFunciones.resaltaridPuntajeNomi,this.puntajenomiConstantesFunciones.activaridPuntajeNomi,this,true,"idPuntajeNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPuntajeNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPuntajeNomi,PuntajeNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.puntajenomiConstantesFunciones.mostrarnombrePuntajeNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PuntajeNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.puntajenomiConstantesFunciones.resaltarnombrePuntajeNomi,this.puntajenomiConstantesFunciones.activarnombrePuntajeNomi,this,true,"nombrePuntajeNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.puntajenomiConstantesFunciones.resaltarnombrePuntajeNomi,this.puntajenomiConstantesFunciones.activarnombrePuntajeNomi,this,true,"nombrePuntajeNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PuntajeNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormatoNomi && this.puntajenomiConstantesFunciones.mostrarFormatoNomiPuntajeNomi && !PuntajeNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formato Nomis");
				tableColumn.setHeaderValue("Formato Nomis");
				tableColumn.setCellRenderer(new FormatoNomiTableCell(puntajenomiConstantesFunciones.resaltarFormatoNomiPuntajeNomi,this,this.puntajenomiConstantesFunciones.activarFormatoNomiPuntajeNomi));
				tableColumn.setCellEditor(new FormatoNomiTableCell(puntajenomiConstantesFunciones.resaltarFormatoNomiPuntajeNomi,this,this.puntajenomiConstantesFunciones.activarFormatoNomiPuntajeNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPuntajeNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.puntajenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.puntajenomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPuntajeNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.puntajenomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.puntajenomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPuntajeNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.puntajenomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.puntajenomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPuntajeNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.puntajenomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPuntajeNomi.addColumn(tableColumn);
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
			
			this.jTableDatosPuntajeNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.puntajenomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPuntajeNomi.moveColumn(this.jTableDatosPuntajeNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPuntajeNomi.moveColumn(this.jTableDatosPuntajeNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.puntajenomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPuntajeNomi.moveColumn(this.jTableDatosPuntajeNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPuntajeNomi.moveColumn(this.jTableDatosPuntajeNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPuntajeNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPuntajeNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPuntajeNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPuntajeNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPuntajeNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPuntajeNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPuntajeNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPuntajeNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=puntajenomiLogic.getPuntajeNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=puntajenomis.size()-1;
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
		//this.jTableDatosPuntajeNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPuntajeNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPuntajeNomi();
			
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
				
				//this.isEsNuevoPuntajeNomi=false;
					
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
				if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPuntajeNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPuntajeNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPuntajeNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.puntajenomi.getsType().equals("DUPLICADO")
				   || this.puntajenomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPuntajeNomi=true;
				
				} else {
					this.isEsNuevoPuntajeNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
					if(this.puntajenomi.getId()>=0 && !this.puntajenomi.getIsNew()) {						
						this.isEsNuevoPuntajeNomi=false;
						
					} else {
						this.isEsNuevoPuntajeNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPuntajeNomi(esRelaciones);						
				
				this.seleccionarPuntajeNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.puntajenomi.getId()<0) {
					this.isEsNuevoPuntajeNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPuntajeNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPuntajeNomi(evt,rowIndex);
				}	
				
				if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PuntajeNomi: " + this.dDif); 
					}
				}								
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPuntajeNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.puntajenomi)) {
					if(this.puntajenomi.getId()>0) {
						this.puntajenomi.setIsDeleted(true);
						
						this.puntajenomisEliminados.add(this.puntajenomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.puntajenomiLogic.getPuntajeNomis().remove(this.puntajenomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.puntajenomis.remove(this.puntajenomi);				
					}
					
					
					((PuntajeNomiModel) this.jTableDatosPuntajeNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPuntajeNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPuntajeNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPuntajeNomi) {
			
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPuntajeNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPuntajeNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPuntajeNomi(this.puntajenomi);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPuntajeNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPuntajeNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPuntajeNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPuntajeNomi(PuntajeNomi puntajenomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPuntajeNomi(puntajenomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPuntajeNomi(PuntajeNomi puntajenomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPuntajeNomi(puntajenomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPuntajeNomi(puntajenomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPuntajeNomi(puntajenomi);
	}
	
	public void setVariablesObjetoActualToFormularioPuntajeNomi(PuntajeNomi puntajenomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.setText(puntajenomi.getId().toString());
			this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.setText(puntajenomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PuntajeNomi puntajenomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,puntajenomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PuntajeNomi puntajenomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				puntajenomiLocal=this.puntajenomi;
			} else {
				puntajenomiLocal=this.puntajenomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(puntajenomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPuntajeNomi(puntajenomiLocal,true);
					
					if(puntajenomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(puntajenomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(puntajenomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPuntajeNomi(PuntajeNomi puntajenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPuntajeNomi(puntajenomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(puntajenomi);
	}
	
	public void setVariablesFormularioToObjetoActualPuntajeNomi(PuntajeNomi puntajenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPuntajeNomi(puntajenomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPuntajeNomi(PuntajeNomi puntajenomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.getText()==null || this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.getText()=="" || this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.setText("0");
			}

			if(conColumnasBase) {puntajenomi.setId(Long.parseLong(this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuntajeNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuntajeNomi.jLabelIdPuntajeNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			puntajenomi.setnombre(this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PuntajeNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPuntajeNomi.jLabelnombrePuntajeNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPuntajeNomi(PuntajeNomi puntajenomiBean,PuntajeNomi puntajenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPuntajeNomi(PuntajeNomi puntajenomiOrigen,PuntajeNomi puntajenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && puntajenomiOrigen.getId()!=null && !puntajenomiOrigen.getId().equals(0L))) {puntajenomi.setId(puntajenomiOrigen.getId());}}
			if(conDefault || (!conDefault && puntajenomiOrigen.getnombre()!=null && !puntajenomiOrigen.getnombre().equals(""))) {puntajenomi.setnombre(puntajenomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPuntajeNomi(PuntajeNomi puntajenomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.setText(puntajenomi.getId().toString());
			this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.setText(puntajenomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPuntajeNomi(PuntajeNomiBean puntajenomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.setText(puntajenomiBean.getId().toString());
			this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.setText(puntajenomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPuntajeNomi(PuntajeNomiParameterReturnGeneral puntajenomiReturnGeneral,PuntajeNomiBean puntajenomiBean,Boolean conDefault) throws Exception { 
		try {
			PuntajeNomi puntajenomiLocal=new PuntajeNomi();
			
			puntajenomiLocal=puntajenomiReturnGeneral.getPuntajeNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && puntajenomiLocal.getId()!=null && !puntajenomiLocal.getId().equals(0L))) {puntajenomiBean.setId(puntajenomiLocal.getId());}}
			if(conDefault || (!conDefault && puntajenomiLocal.getnombre()!=null && !puntajenomiLocal.getnombre().equals(""))) {puntajenomiBean.setnombre(puntajenomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPuntajeNomiGenerico(Long idPuntajeNomiSeleccionado,JComboBox jComboBoxPuntajeNomi,List<PuntajeNomi> puntajenomisLocal)throws Exception {
		try {
			PuntajeNomi  puntajenomiTemp=null;

			for(PuntajeNomi puntajenomiAux:puntajenomisLocal) {
				if(puntajenomiAux.getId()!=null && puntajenomiAux.getId().equals(idPuntajeNomiSeleccionado)) {
					puntajenomiTemp=puntajenomiAux;
					break;
				}
			}

			jComboBoxPuntajeNomi.setSelectedItem(puntajenomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPuntajeNomiGenerico(JComboBox jComboBoxPuntajeNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPuntajeNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPuntajeNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPuntajeNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPuntajeNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPuntajeNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPuntajeNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPuntajeNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPuntajeNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPuntajeNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPuntajeNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("FormatoNomi")) {
			jButtonFormatoNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puntajenomi=(PuntajeNomi) puntajenomiLogic.getPuntajeNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			puntajenomi =(PuntajeNomi) puntajenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PuntajeNomi puntajenomiRow=new PuntajeNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puntajenomiRow=(PuntajeNomi) puntajenomiLogic.getPuntajeNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			puntajenomiRow=(PuntajeNomi) puntajenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormatoNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PuntajeNomi puntajenomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPuntajeNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntajenomi = (PuntajeNomi)this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.puntajenomi = (PuntajeNomi)this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(puntajenomi!=null) {
						this.puntajenomi = puntajenomi;
					} else {
						this.puntajenomi = new PuntajeNomi();
					}
				}

				if(this.isTienePermisosFormatoNomi && this.permiteMantenimiento(this.puntajenomi)) {
					FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFramePopup=new FormatoNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formatonomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFramePopup;
					} else {
						formatonomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame;
					}

					List<PuntajeNomi> puntajenomis=new ArrayList<PuntajeNomi>();
					puntajenomis.add(this.puntajenomi);
					if(!esRelacionado) {
						//formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setConGuardarRelaciones(false);
						//formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formatonomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPuntajeNomi.cargarFormatoNomiBeanSwingJInternalFrame(puntajenomis,this.puntajenomi,formatonomiBeanSwingJInternalFrame,/*conInicializar,*/formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.getConGuardarRelaciones(),formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.getEsGuardarRelacionado());
					formatonomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formatonomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomi("no_relacionado");

						formatonomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormatoNomiConstantesFunciones.ITAMANIOFILATABLA + (FormatoNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						formatonomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPuntajeNomi=(TitledBorder)this.jScrollPanelDatosPuntajeNomi.getBorder();
						TitledBorder titledBorderFormatoNomi=(TitledBorder)formatonomiBeanSwingJInternalFrame.jScrollPanelDatosFormatoNomi.getBorder();

						titledBorderFormatoNomi.setTitle(titledBorderPuntajeNomi.getTitle() + " -> Formato Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formatonomiBeanSwingJInternalFrame);
						}

						formatonomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formatonomiBeanSwingJInternalFrame);

						formatonomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.puntajenomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formato Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPuntajeNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoPuntajeNomi && this.isPermisoNuevoPuntajeNomi));			
			this.jButtonDuplicarPuntajeNomi.setVisible((this.isVisibilidadCeldaDuplicarPuntajeNomi && this.isPermisoDuplicarPuntajeNomi));			
			this.jButtonCopiarPuntajeNomi.setVisible((this.isVisibilidadCeldaCopiarPuntajeNomi && this.isPermisoCopiarPuntajeNomi));
			this.jButtonVerFormPuntajeNomi.setVisible((this.isVisibilidadCeldaVerFormPuntajeNomi && this.isPermisoVerFormPuntajeNomi));
			
			this.jButtonAbrirOrderByPuntajeNomi.setVisible((this.isVisibilidadCeldaOrdenPuntajeNomi && this.isPermisoOrdenPuntajeNomi));			
			
			this.jButtonNuevoRelacionesPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi && this.isPermisoNuevoPuntajeNomi));			
			this.jButtonNuevoGuardarCambiosPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoPuntajeNomi && this.isPermisoNuevoPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));
			
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarPuntajeNomi.setVisible((this.isVisibilidadCeldaModificarPuntajeNomi && this.isPermisoActualizarPuntajeNomi));	
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarPuntajeNomi.setVisible((this.isVisibilidadCeldaActualizarPuntajeNomi && this.isPermisoActualizarPuntajeNomi));	
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarPuntajeNomi.setVisible((this.isVisibilidadCeldaEliminarPuntajeNomi && this.isPermisoEliminarPuntajeNomi));
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarPuntajeNomi.setVisible(this.isVisibilidadCeldaCancelarPuntajeNomi);							
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.setVisible((this.isVisibilidadCeldaGuardarPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaPuntajeNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoPuntajeNomi && this.isPermisoNuevoPuntajeNomi));						
			this.jButtonDuplicarToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaDuplicarPuntajeNomi && this.isPermisoDuplicarPuntajeNomi));						
			this.jButtonCopiarToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaCopiarPuntajeNomi && this.isPermisoCopiarPuntajeNomi));			
			this.jButtonVerFormToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaVerFormPuntajeNomi && this.isPermisoVerFormPuntajeNomi));			
			this.jButtonAbrirOrderByToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaOrdenPuntajeNomi && this.isPermisoOrdenPuntajeNomi));
			this.jButtonNuevoRelacionesToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi && this.isPermisoNuevoPuntajeNomi));			
			this.jButtonNuevoGuardarCambiosToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoPuntajeNomi && this.isPermisoNuevoPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));			
			
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaModificarPuntajeNomi && this.isPermisoActualizarPuntajeNomi));	
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaActualizarPuntajeNomi  && this.isPermisoActualizarPuntajeNomi));	
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaEliminarPuntajeNomi && this.isPermisoEliminarPuntajeNomi));
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarToolBarPuntajeNomi.setVisible(this.isVisibilidadCeldaCancelarPuntajeNomi);				
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaGuardarPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPuntajeNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoPuntajeNomi && this.isPermisoNuevoPuntajeNomi));			
			this.jMenuItemDuplicarPuntajeNomi.setVisible((this.isVisibilidadCeldaDuplicarPuntajeNomi && this.isPermisoDuplicarPuntajeNomi));			
			this.jMenuItemCopiarPuntajeNomi.setVisible((this.isVisibilidadCeldaCopiarPuntajeNomi && this.isPermisoCopiarPuntajeNomi));			
			this.jMenuItemVerFormPuntajeNomi.setVisible((this.isVisibilidadCeldaVerFormPuntajeNomi && this.isPermisoVerFormPuntajeNomi));			
			this.jMenuItemAbrirOrderByPuntajeNomi.setVisible((this.isVisibilidadCeldaOrdenPuntajeNomi && this.isPermisoOrdenPuntajeNomi));			
			//this.jMenuItemMostrarOcultarPuntajeNomi.setVisible((this.isVisibilidadCeldaOrdenPuntajeNomi && this.isPermisoOrdenPuntajeNomi));
			this.jMenuItemDetalleAbrirOrderByPuntajeNomi.setVisible((this.isVisibilidadCeldaOrdenPuntajeNomi && this.isPermisoOrdenPuntajeNomi));			
			//this.jMenuItemDetalleMostrarOcultarPuntajeNomi.setVisible((this.isVisibilidadCeldaOrdenPuntajeNomi && this.isPermisoOrdenPuntajeNomi));			
			this.jMenuItemNuevoRelacionesPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi && this.isPermisoNuevoPuntajeNomi));			
			this.jMenuItemNuevoGuardarCambiosPuntajeNomi.setVisible((this.isVisibilidadCeldaNuevoPuntajeNomi && this.isPermisoNuevoPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));									
			
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemModificarPuntajeNomi.setVisible((this.isVisibilidadCeldaModificarPuntajeNomi && this.isPermisoActualizarPuntajeNomi));	
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemActualizarPuntajeNomi.setVisible((this.isVisibilidadCeldaActualizarPuntajeNomi && this.isPermisoActualizarPuntajeNomi));	
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemEliminarPuntajeNomi.setVisible((this.isVisibilidadCeldaEliminarPuntajeNomi && this.isPermisoEliminarPuntajeNomi));
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemCancelarPuntajeNomi.setVisible(this.isVisibilidadCeldaCancelarPuntajeNomi);				
			}
			
			this.jMenuItemGuardarCambiosPuntajeNomi.setVisible((this.isVisibilidadCeldaGuardarPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));						
			this.jMenuItemGuardarCambiosTablaPuntajeNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPuntajeNomi=this.jButtonNuevoPuntajeNomi.isVisible();
			this.isVisibilidadCeldaDuplicarPuntajeNomi=this.jButtonDuplicarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaCopiarPuntajeNomi=this.jButtonCopiarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaVerFormPuntajeNomi=this.jButtonVerFormPuntajeNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenPuntajeNomi=this.jButtonAbrirOrderByPuntajeNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=this.jButtonNuevoRelacionesPuntajeNomi.isVisible();
			this.isVisibilidadCeldaModificarPuntajeNomi=this.jButtonModificarPuntajeNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.isVisibilidadCeldaActualizarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaEliminarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaCancelarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaGuardarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=this.jButtonGuardarCambiosTablaPuntajeNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPuntajeNomi=this.jButtonNuevoToolBarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=this.jButtonNuevoRelacionesToolBarPuntajeNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.isVisibilidadCeldaModificarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarToolBarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaActualizarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarToolBarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaEliminarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarToolBarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaCancelarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarToolBarPuntajeNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPuntajeNomi=this.jButtonGuardarCambiosToolBarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=this.jButtonGuardarCambiosTablaToolBarPuntajeNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPuntajeNomi=this.jMenuItemNuevoPuntajeNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=this.jMenuItemNuevoRelacionesPuntajeNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.isVisibilidadCeldaModificarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemModificarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaActualizarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemActualizarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaEliminarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemEliminarPuntajeNomi.isVisible();
			this.isVisibilidadCeldaCancelarPuntajeNomi=this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemCancelarPuntajeNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPuntajeNomi=this.jMenuItemGuardarCambiosPuntajeNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=this.jMenuItemGuardarCambiosTablaPuntajeNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPuntajeNomi(Boolean esInicializar) {
		if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
				//if(this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPuntajeNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualPuntajeNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPuntajeNomi() {
		this.jButtonNuevoPuntajeNomi.setVisible(this.isPermisoNuevoPuntajeNomi);			
		this.jButtonDuplicarPuntajeNomi.setVisible(this.isPermisoDuplicarPuntajeNomi);			
		this.jButtonCopiarPuntajeNomi.setVisible(this.isPermisoCopiarPuntajeNomi);			
		this.jButtonVerFormPuntajeNomi.setVisible(this.isPermisoVerFormPuntajeNomi);			
		
		this.jButtonAbrirOrderByPuntajeNomi.setVisible(this.isPermisoOrdenPuntajeNomi);					
		
		this.jButtonNuevoRelacionesPuntajeNomi.setVisible(this.isPermisoNuevoPuntajeNomi);			
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarPuntajeNomi.setVisible(this.isPermisoActualizarPuntajeNomi);	
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarPuntajeNomi.setVisible(this.isPermisoActualizarPuntajeNomi);	
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarPuntajeNomi.setVisible(this.isPermisoEliminarPuntajeNomi);
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarPuntajeNomi.setVisible(this.isVisibilidadCeldaCancelarPuntajeNomi);						
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.setVisible(this.isPermisoGuardarCambiosPuntajeNomi);							
		}
		
		this.jButtonGuardarCambiosTablaPuntajeNomi.setVisible(this.isPermisoActualizarPuntajeNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePuntajeNomi() {
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarPuntajeNomi.setVisible(this.isPermisoActualizarPuntajeNomi);	
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarPuntajeNomi.setVisible(this.isPermisoActualizarPuntajeNomi);	
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarPuntajeNomi.setVisible(this.isPermisoEliminarPuntajeNomi);
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarPuntajeNomi.setVisible(this.isVisibilidadCeldaCancelarPuntajeNomi);							
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.setVisible((this.isVisibilidadCeldaGuardarPuntajeNomi && this.isPermisoGuardarCambiosPuntajeNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPuntajeNomi() {
		if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPuntajeNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPuntajeNomi() {
	}
	
	public void jTableDatosPuntajeNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPuntajeNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPuntajeNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuntajeNomi(this.getpuntajenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puntajenomi==null) {
						this.puntajenomi = new PuntajeNomi();
					}

					this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
				}

				if(this.puntajenomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.puntajenomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuntajeNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePuntajeNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPuntajeNomi(this.getpuntajenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.puntajenomi==null) {
						this.puntajenomi = new PuntajeNomi();
					}

					this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);
				}

				if(this.puntajenomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.puntajenomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPuntajeNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFramePuntajeNomi() {
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
		

		if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
			this.jInternalFrameDetalleFormPuntajeNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormPuntajeNomi.dispose();
			this.jInternalFrameDetalleFormPuntajeNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
			this.jInternalFrameReporteDinamicoPuntajeNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPuntajeNomi.dispose();
			this.jInternalFrameReporteDinamicoPuntajeNomi=null;
		}
		
		if(this.jInternalFrameImportacionPuntajeNomi!=null) {
			this.jInternalFrameImportacionPuntajeNomi.setVisible(false);	    			
			this.jInternalFrameImportacionPuntajeNomi.dispose();
			this.jInternalFrameImportacionPuntajeNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPuntajeNomi();
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPuntajeNomi")) {
				jButtonDuplicarPuntajeNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPuntajeNomi")) {
				jButtonCopiarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormPuntajeNomi")) {
				jButtonVerFormPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPuntajeNomi")) {
				jButtonDuplicarPuntajeNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPuntajeNomi")) {
				jButtonDuplicarPuntajeNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPuntajeNomi")) {
				jButtonModificarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPuntajeNomi")) {
				jButtonModificarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPuntajeNomi")) {
				jButtonModificarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPuntajeNomi")) {
				jButtonActualizarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPuntajeNomi")) {
				jButtonActualizarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPuntajeNomi")) {
				jButtonActualizarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarPuntajeNomi")) {
				jButtonEliminarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPuntajeNomi")) {
				jButtonEliminarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPuntajeNomi")) {
				jButtonEliminarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarPuntajeNomi")) {
				jButtonCancelarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPuntajeNomi")) {
				jButtonCancelarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPuntajeNomi")) {
				jButtonCancelarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarPuntajeNomi")) {
				jButtonCerrarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPuntajeNomi")) {
				jButtonCerrarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPuntajeNomi")) {
				jButtonCerrarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPuntajeNomi")) {
				jButtonMostrarOcultarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPuntajeNomi")) {
				jButtonCancelarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPuntajeNomi")) {
				jButtonCopiarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPuntajeNomi")) {
				jButtonVerFormPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPuntajeNomi")) {
				jButtonCopiarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPuntajeNomi")) {
				jButtonVerFormPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPuntajeNomi")) {
				jButtonRecargarInformacionPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPuntajeNomi")) {
				jButtonRecargarInformacionPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPuntajeNomi")) {
				jButtonRecargarInformacionPuntajeNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPuntajeNomi")) {
				jButtonAnterioresPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPuntajeNomi")) {
				jButtonAnterioresPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePuntajeNomi")) {
				jButtonAnterioresPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPuntajeNomi")) {
				jButtonSiguientesPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPuntajeNomi")) {
				jButtonSiguientesPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPuntajeNomi")) {
				jButtonSiguientesPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPuntajeNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByPuntajeNomi")) {
				jButtonAbrirOrderByPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPuntajeNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarPuntajeNomi")) {
				jButtonMostrarOcultarPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPuntajeNomi")) {
				jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPuntajeNomi")) {
				jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPuntajeNomi")) {
				jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPuntajeNomi")) {
				jButtonCerrarReporteDinamicoPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPuntajeNomi")) {
				jButtonGenerarReporteDinamicoPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPuntajeNomi")) {
				
				jButtonGenerarExcelReporteDinamicoPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPuntajeNomi")) {
				jButtonCerrarImportacionPuntajeNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPuntajeNomi")) {
				
				jButtonGenerarImportacionPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPuntajeNomi")) {
				
				jButtonAbrirImportacionPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPuntajeNomi")) {
				jComboBoxTiposAccionesPuntajeNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPuntajeNomi")) {
				jComboBoxTiposRelacionesPuntajeNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPuntajeNomi")) {
				jComboBoxTiposAccionesPuntajeNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPuntajeNomi")) {
				
				jComboBoxTiposSeleccionarPuntajeNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPuntajeNomi")) {
				jTextFieldValorCampoGeneralPuntajeNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPuntajeNomi")) {
				jButtonAbrirOrderByPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPuntajeNomi")) {
				jButtonAbrirOrderByPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPuntajeNomi")) {
				jButtonCerrarOrderByPuntajeNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPuntajeNomiBusqueda")) {
				this.jButtonidPuntajeNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePuntajeNomiBusqueda")) {
				this.jButtonnombrePuntajeNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPuntajeNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntajeNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PuntajeNomi puntajenomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				puntajenomiLocal=this.puntajenomi;
			} else {
				puntajenomiLocal=this.puntajenomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
							
				
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
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
			
			


			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntajeNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
								
						
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
								
				
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
							
				
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntajeNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
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
			
			


			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
								
				
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntajeNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPuntajeNomi")) {
					jCheckBoxSeleccionarTodosPuntajeNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPuntajeNomi")) {
					jCheckBoxSeleccionadosPuntajeNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPuntajeNomi")) {
					
				}
				
				


				
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
												
				
				


				
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntajeNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntajeNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
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
			
			


			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPuntajeNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.puntajenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.puntajenomi);
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
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
				
				


				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PuntajeNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PuntajeNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPuntajeNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.puntajenomiAnterior =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPuntajeNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPuntajeNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPuntajeNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.puntajenomi =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.puntajenomi =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.puntajenomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPuntajeNomi")) {
				
				}
				
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPuntajeNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPuntajeNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPuntajeNomi")) {
			
			}
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPuntajeNomi();
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
			if(sTipo.equals("NuevoPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPuntajeNomi")) {
				jButtonDuplicarPuntajeNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPuntajeNomi")) {
				jButtonCopiarPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPuntajeNomi")) {
				jButtonVerFormPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPuntajeNomi")) {
				jButtonNuevoPuntajeNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPuntajeNomi")) {
				jButtonModificarPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPuntajeNomi")) {
				jButtonActualizarPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPuntajeNomi")) {
				jButtonEliminarPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPuntajeNomi")) {
				jButtonCancelarPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPuntajeNomi")) {
				jButtonCerrarPuntajeNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPuntajeNomi")) {
				jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPuntajeNomi")) {
				jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPuntajeNomi")) {
				jButtonAbrirOrderByPuntajeNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPuntajeNomi")) {
				jButtonRecargarInformacionPuntajeNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPuntajeNomi")) {
				jButtonAnterioresPuntajeNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPuntajeNomi")) {
				jButtonSiguientesPuntajeNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPuntajeNomiBusqueda")) {
				this.jButtonidPuntajeNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePuntajeNomiBusqueda")) {
				this.jButtonnombrePuntajeNomiBusquedaActionPerformed(evt);
			}
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPuntajeNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePuntajeNomi")) {
				closingInternalFramePuntajeNomi();
				
			} else if(sTipo.equals("jButtonCancelarPuntajeNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormPuntajeNomi = (JInternalFrameBase)evt.getSource();
	            	
	            PuntajeNomiBeanSwingJInternalFrame jInternalFrameParent=(PuntajeNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormPuntajeNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPuntajeNomiActionPerformed(null);
			}
			
			PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.puntajenomi,new Object(),this.puntajenomiParameterGeneral,this.puntajenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPuntajeNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPuntajeNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPuntajeNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.puntajenomi)) {
			if(!esControlTabla) {
				if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);			
				}
				
				if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPuntajeNomi(this.puntajenomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.puntajenomiReturnGeneral=puntajenomiLogic.procesarEventosPuntajeNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puntajenomiLogic.getPuntajeNomis(),this.puntajenomi,this.puntajenomiParameterGeneral,this.isEsNuevoPuntajeNomi,classes);//this.puntajenomiLogic.getPuntajeNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPuntajeNomi(this.puntajenomiReturnGeneral,this.puntajenomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPuntajeNomi(classes,this.puntajenomiReturnGeneral,this.puntajenomiBean,false);
					}
						
					if(this.puntajenomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPuntajeNomi(this.puntajenomiReturnGeneral.getPuntajeNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPuntajeNomi(this.puntajenomiReturnGeneral.getPuntajeNomi());	
					}
						
					if(this.puntajenomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPuntajeNomi(this.puntajenomiReturnGeneral.getPuntajeNomi(),classes);//this.puntajenomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPuntajeNomi(this.puntajenomi,classes);//this.puntajenomiBean);									
				}
			
				if(PuntajeNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPuntajeNomi(this.puntajenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPuntajeNomi(this.puntajenomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.puntajenomiAnterior!=null) {
						this.puntajenomi=this.puntajenomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.puntajenomiReturnGeneral=puntajenomiLogic.procesarEventosPuntajeNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puntajenomiLogic.getPuntajeNomis(),this.puntajenomi,this.puntajenomiParameterGeneral,this.isEsNuevoPuntajeNomi,classes);//this.puntajenomiLogic.getPuntajeNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.puntajenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.puntajenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.puntajenomiReturnGeneral.getPuntajeNomi(),puntajenomiLogic.getPuntajeNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.puntajenomiReturnGeneral.getPuntajeNomi(),this.puntajenomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPuntajeNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosPuntajeNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPuntajeNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosPuntajeNomi() throws Exception {
		
		PuntajeNomiModel puntajenomiModel=(PuntajeNomiModel)this.jTableDatosPuntajeNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			puntajenomiModel.puntajenomis=this.puntajenomiLogic.getPuntajeNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			puntajenomiModel.puntajenomis=this.puntajenomis;
		}
		
		
		((PuntajeNomiModel) this.jTableDatosPuntajeNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPuntajeNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpuntajenomiAnterior(),this.puntajenomiLogic.getPuntajeNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpuntajenomiAnterior(),this.puntajenomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPuntajeNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPuntajeNomi(PuntajeNomi puntajenomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomi.class)) {
					this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiLogic.setFormatoNomis(puntajenomi.getFormatoNomis());
					this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
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
										
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puntajenomi,new Object(),generalEntityParameterGeneral,this.puntajenomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.puntajenomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PuntajeNomiConstantesFunciones.getClassesRelationshipsOfPuntajeNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PuntajeNomiConstantesFunciones.getClassesRelationshipsFromStringsOfPuntajeNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPuntajeNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PuntajeNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.puntajenomi,new Object(),generalEntityParameterGeneral,this.puntajenomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPuntajeNomi(PuntajeNomiBean puntajenomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomi.class)) {
					this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiLogic.setFormatoNomis(puntajenomi.getFormatoNomis());
					this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPuntajeNomi(ArrayList<Classe> classes,PuntajeNomiReturnGeneral puntajenomiReturnGeneral,PuntajeNomiBean puntajenomiBean,Boolean conDefault) throws Exception {
		
			this.puntajenomiBean.setFormatoNomis(puntajenomiReturnGeneral.getPuntajeNomi().getFormatoNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPuntajeNomi(PuntajeNomi puntajenomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(FormatoNomi.class)) {
					puntajenomi.setFormatoNomis(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiBeanSwingJInternalFrame.formatonomiLogic.getFormatoNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.puntajenomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPuntajeNomi = new PuntajeNomiDetalleFormJInternalFrame(jDesktopPane,this.puntajenomiSessionBean.getConGuardarRelaciones(),this.puntajenomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPuntajeNomi);
		this.jInternalFrameDetalleFormPuntajeNomi.setVisible(false);
		this.jInternalFrameDetalleFormPuntajeNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormPuntajeNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPuntajeNomi.puntajenomiLogic=this.puntajenomiLogic;
		
		this.cargarCombosFrameForeignKeyPuntajeNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePuntajeNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePuntajeNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPuntajeNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPuntajeNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPuntajeNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPuntajeNomi"));
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarPuntajeNomi.addActionListener(new ButtonActionListener(this,"ModificarPuntajeNomi"));

		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarToolBarPuntajeNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarPuntajeNomi"));
					
		this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemModificarPuntajeNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarPuntajeNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarPuntajeNomi.addActionListener (new ButtonActionListener(this,"ActualizarPuntajeNomi"));
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarToolBarPuntajeNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPuntajeNomi"));
						
		this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemActualizarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPuntajeNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarPuntajeNomi.addActionListener (new ButtonActionListener(this,"EliminarPuntajeNomi"));
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarPuntajeNomi"));
								
		this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemEliminarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPuntajeNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarPuntajeNomi.addActionListener (new ButtonActionListener(this,"CancelarPuntajeNomi"));
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarPuntajeNomi"));
					
		this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemCancelarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPuntajeNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemDetalleCerrarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPuntajeNomi"));		
		
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuntajeNomi"));
		
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuntajeNomi"));
		
		
		
		this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPuntajeNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonidPuntajeNomiBusqueda.addActionListener(new ButtonActionListener(this,"idPuntajeNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonnombrePuntajeNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombrePuntajeNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPuntajeNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePuntajeNomi"));
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPuntajeNomi"));
		}
		
		this.jTableDatosPuntajeNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPuntajeNomi"));
		
		this.jTableDatosPuntajeNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPuntajeNomi"));
		
		this.jButtonNuevoPuntajeNomi.addActionListener(new ButtonActionListener(this,"NuevoPuntajeNomi"));
		
		this.jButtonDuplicarPuntajeNomi.addActionListener(new ButtonActionListener(this,"DuplicarPuntajeNomi"));
		
		this.jButtonCopiarPuntajeNomi.addActionListener(new ButtonActionListener(this,"CopiarPuntajeNomi"));
		
		this.jButtonVerFormPuntajeNomi.addActionListener(new ButtonActionListener(this,"VerFormPuntajeNomi"));
		
		
		this.jButtonNuevoToolBarPuntajeNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarPuntajeNomi"));
			
		this.jButtonDuplicarToolBarPuntajeNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPuntajeNomi"));
			
		this.jMenuItemNuevoPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPuntajeNomi"));
			
		this.jMenuItemDuplicarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPuntajeNomi"));		
		
		
		this.jButtonNuevoRelacionesPuntajeNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPuntajeNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarPuntajeNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPuntajeNomi"));
			
		this.jMenuItemNuevoRelacionesPuntajeNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPuntajeNomi"));		
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarPuntajeNomi.addActionListener(new ButtonActionListener(this,"ModificarPuntajeNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonModificarToolBarPuntajeNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarPuntajeNomi"));
			
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemModificarPuntajeNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarPuntajeNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarPuntajeNomi.addActionListener (new ButtonActionListener(this,"ActualizarPuntajeNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonActualizarToolBarPuntajeNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPuntajeNomi"));
				
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemActualizarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPuntajeNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarPuntajeNomi.addActionListener (new ButtonActionListener(this,"EliminarPuntajeNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonEliminarToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarPuntajeNomi"));
						
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemEliminarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPuntajeNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarPuntajeNomi.addActionListener (new ButtonActionListener(this,"CancelarPuntajeNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonCancelarToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarPuntajeNomi"));
			
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemCancelarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPuntajeNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPuntajeNomi"));		
		
		
		this.jButtonCerrarPuntajeNomi.addActionListener (new ButtonActionListener(this,"CerrarPuntajeNomi"));
		
		
		this.jButtonCerrarToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarPuntajeNomi"));
			
		this.jMenuItemCerrarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPuntajeNomi"));
			
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jMenuItemDetalleCerrarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPuntajeNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosPuntajeNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPuntajeNomi"));
		}
		
		this.jButtonCopiarToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarPuntajeNomi"));
			
		this.jButtonVerFormToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarPuntajeNomi"));
		
		this.jMenuItemGuardarCambiosPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPuntajeNomi"));
			
		this.jMenuItemCopiarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPuntajeNomi"));		
		
		this.jMenuItemVerFormPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPuntajeNomi"));		
		
		
		this.jButtonGuardarCambiosTablaPuntajeNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPuntajeNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPuntajeNomi"));
			
		this.jMenuItemGuardarCambiosTablaPuntajeNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPuntajeNomi"));		
		
		
		
		this.jButtonRecargarInformacionPuntajeNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionPuntajeNomi"));
					
		this.jButtonRecargarInformacionToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPuntajeNomi"));
		
		this.jMenuItemRecargarInformacionPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPuntajeNomi"));		
		
		
		
		this.jButtonAnterioresPuntajeNomi.addActionListener (new ButtonActionListener(this,"AnterioresPuntajeNomi"));
		
		
		this.jButtonAnterioresToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPuntajeNomi"));
		
		this.jMenuItemAnterioresPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPuntajeNomi"));		
		
		
		this.jButtonSiguientesPuntajeNomi.addActionListener (new ButtonActionListener(this,"SiguientesPuntajeNomi"));
		
		
		this.jButtonSiguientesToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPuntajeNomi"));
			
		this.jMenuItemSiguientesPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPuntajeNomi"));
			
		this.jMenuItemAbrirOrderByPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPuntajeNomi"));
			
		this.jMenuItemMostrarOcultarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPuntajeNomi"));
			
		this.jMenuItemDetalleAbrirOrderByPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPuntajeNomi"));
			
		this.jMenuItemDetalleMostarOcultarPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPuntajeNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosPuntajeNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPuntajeNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPuntajeNomi"));
			
		this.jMenuItemNuevoGuardarCambiosPuntajeNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPuntajeNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPuntajeNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPuntajeNomi"));

		this.jCheckBoxSeleccionadosPuntajeNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPuntajeNomi"));
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPuntajeNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesPuntajeNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesPuntajeNomi"));
			
		this.jComboBoxTiposAccionesPuntajeNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesPuntajeNomi"));
					
		this.jComboBoxTiposSeleccionarPuntajeNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPuntajeNomi"));
			
		this.jTextFieldValorCampoGeneralPuntajeNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPuntajeNomi"));		
		
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonidPuntajeNomiBusqueda.addActionListener(new ButtonActionListener(this,"idPuntajeNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonnombrePuntajeNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombrePuntajeNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPuntajeNomi!=null) {
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuntajeNomi"));
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuntajeNomi"));
				this.jInternalFrameReporteDinamicoPuntajeNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuntajeNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoPuntajeNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPuntajeNomi"));				
			//this.jButtonGenerarReporteDinamicoPuntajeNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPuntajeNomi"));
			//this.jButtonGenerarExcelReporteDinamicoPuntajeNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPuntajeNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPuntajeNomi!=null) {
				this.jInternalFrameImportacionPuntajeNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPuntajeNomi"));
				this.jInternalFrameImportacionPuntajeNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPuntajeNomi"));
				this.jInternalFrameImportacionPuntajeNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPuntajeNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPuntajeNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByPuntajeNomi"));
			
			this.jButtonAbrirOrderByToolBarPuntajeNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPuntajeNomi"));			
			
			if(this.jInternalFrameOrderByPuntajeNomi!=null) {
				this.jInternalFrameOrderByPuntajeNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPuntajeNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPuntajeNomi.jTabbedPaneRelacionesPuntajeNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPuntajeNomi"));
		
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
            		closingInternalFramePuntajeNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPuntajeNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPuntajeNomi = (JInternalFrameBase)event.getSource();
	            	
	            PuntajeNomiBeanSwingJInternalFrame jInternalFrameParent=(PuntajeNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormPuntajeNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPuntajeNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPuntajeNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPuntajeNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPuntajeNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPuntajeNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntajeNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntajeNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntajeNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPuntajeNomi";
		inputMap = this.jButtonNuevoPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPuntajeNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntajeNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntajeNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPuntajeNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPuntajeNomi";
		inputMap = this.jButtonNuevoRelacionesPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPuntajeNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPuntajeNomi";
		inputMap = this.jButtonModificarPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPuntajeNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPuntajeNomi";
		inputMap = this.jButtonActualizarPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPuntajeNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPuntajeNomi";
		inputMap = this.jButtonEliminarPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPuntajeNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPuntajeNomi";
		inputMap = this.jButtonCancelarPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPuntajeNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPuntajeNomi";
		inputMap = this.jButtonCerrarPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPuntajeNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPuntajeNomi";
		inputMap = this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonGuardarCambiosPuntajeNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPuntajeNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPuntajeNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPuntajeNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPuntajeNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPuntajeNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPuntajeNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPuntajeNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPuntajeNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPuntajeNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonidPuntajeNomiBusqueda.addActionListener(new ButtonActionListener(this,"idPuntajeNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPuntajeNomi.jButtonnombrePuntajeNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombrePuntajeNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPuntajeNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPuntajeNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPuntajeNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPuntajeNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPuntajeNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
					puntajenomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntajeNomi puntajenomiAux:puntajenomis) {
					puntajenomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPuntajeNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPuntajeNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
						puntajenomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PuntajeNomi puntajenomiAux:puntajenomis) {
						puntajenomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PuntajeNomi puntajenomiAux:puntajenomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPuntajeNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPuntajeNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPuntajeNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPuntajeNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPuntajeNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPuntajeNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPuntajeNomi.getSelectedRows();
			
			PuntajeNomi puntajenomiLocal=new PuntajeNomi();
			
			//this.seleccionarTodosPuntajeNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					puntajenomiLocal =(PuntajeNomi) this.puntajenomiLogic.getPuntajeNomis().toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					puntajenomiLocal =(PuntajeNomi) this.puntajenomis.toArray()[this.jTableDatosPuntajeNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				puntajenomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
						puntajenomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PuntajeNomi puntajenomiAux:puntajenomis) {
						puntajenomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPuntajeNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPuntajeNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPuntajeNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPuntajeNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPuntajeNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPuntajeNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPuntajeNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPuntajeNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPuntajeNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PuntajeNomi puntajenomiAux:this.puntajenomiLogic.getPuntajeNomis()) {
				
						if(sTipoSeleccionar.equals(PuntajeNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							puntajenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntajeNomi puntajenomiAux:puntajenomis) {
					
						if(sTipoSeleccionar.equals(PuntajeNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							puntajenomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPuntajeNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPuntajeNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPuntajeNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPuntajeNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPuntajeNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePuntajeNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessPuntajeNomi(conSplash);
				
					this.generarReportePuntajeNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPuntajeNomisSeleccionados();
				//this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPuntajeNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPuntajeNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPuntajeNomi();
				
				this.exportarPuntajeNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPuntajeNomis();
				//this.importarPuntajeNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPuntajeNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPuntajeNomisSeleccionados();
				//this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Puntaje Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPuntajeNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPuntajeNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPuntajeNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(PuntajeNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePuntajeNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPuntajeNomi(conSplash);
					
						//this.actualizarParametrosGeneralPuntajeNomi();
						
						this.generarReporteProcesoAccionPuntajeNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PuntajeNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Puntaje NomiS SELECCIONADOS?", "MANTENIMIENTO DE Puntaje Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPuntajeNomi();
				
						this.actualizarParametrosGeneralPuntajeNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.puntajenomiReturnGeneral=puntajenomiLogic.procesarAccionPuntajeNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.puntajenomiLogic.getPuntajeNomis(),this.puntajenomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPuntajeNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPuntajeNomi();
					
					PuntajeNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPuntajeNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPuntajeNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPuntajeNomi.jComboBoxTiposAccionesFormularioPuntajeNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPuntajeNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPuntajeNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPuntajeNomi();
			
			if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
			PuntajeNomi puntajenomi=new PuntajeNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPuntajeNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPuntajeNomi.getSelectedItem();
			
			
			
			
			puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(puntajenomisSeleccionados.size()==1) {
				for(PuntajeNomi puntajenomiAux:puntajenomisSeleccionados) {
					puntajenomi=puntajenomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formato Nomi")) {
					jButtonFormatoNomiActionPerformed(null,rowIndex,true,false,puntajenomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPuntajeNomi();
			
      		//this.finishProcessPuntajeNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPuntajeNomiReturnGeneral() throws Exception {
		if(this.puntajenomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.puntajenomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.puntajenomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.puntajenomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.puntajenomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.puntajenomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPuntajeNomi(false);
		}
		
		if(this.puntajenomiReturnGeneral.getConRetornoLista() || this.puntajenomiReturnGeneral.getConRetornoObjeto()) {
			if(this.puntajenomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.puntajenomiLogic.setPuntajeNomis(this.puntajenomiReturnGeneral.getPuntajeNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.puntajenomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.puntajenomiLogic.setPuntajeNomi(this.puntajenomiReturnGeneral.getPuntajeNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPuntajeNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralPuntajeNomi() throws Exception {
		
		
	}
	
	public ArrayList<PuntajeNomi> getPuntajeNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPuntajeNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PuntajeNomi puntajenomiAux:puntajenomiLogic.getPuntajeNomis()) {
					if(puntajenomiAux.getIsSelected()) {
						puntajenomisSeleccionados.add(puntajenomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PuntajeNomi puntajenomiAux:this.puntajenomis) {
					if(puntajenomiAux.getIsSelected()) {
						puntajenomisSeleccionados.add(puntajenomiAux);				
					}
				}
			}
			
			if(puntajenomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						puntajenomisSeleccionados.addAll(this.puntajenomiLogic.getPuntajeNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						puntajenomisSeleccionados.addAll(this.puntajenomis);				
					}
				}
			}
		} else {
			puntajenomisSeleccionados.add(this.puntajenomi);
		}
		
		return puntajenomisSeleccionados;
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
	
	public void generarReportePuntajeNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPuntajeNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPuntajeNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPuntajeNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPuntajeNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPuntajeNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Puntaje Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPuntajeNomisSeleccionados() throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePuntajeNomis("Todos",puntajenomisSeleccionados);
		
	}	
	
	public void generarReporteNormalPuntajeNomisSeleccionados() throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePuntajeNomis("Todos",puntajenomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPuntajeNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePuntajeNomis("Todos",puntajenomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPuntajeNomisSeleccionados() throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPuntajeNomi();
		
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPuntajeNomi();
		
		
		//this.generarReportePuntajeNomis("Todos",puntajenomisSeleccionados ,puntajenomiImplementable,puntajenomiImplementableHome);
	}
	
	public void mostrarImportacionPuntajeNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPuntajeNomi();
		
		this.abrirFrameImportacionPuntajeNomi();		
		
			
		//this.generarReportePuntajeNomis("Todos",puntajenomisSeleccionados ,puntajenomiImplementable,puntajenomiImplementableHome);
	}
	
	public void importarPuntajeNomis() throws Exception {		
	
	}
	
	public void exportarPuntajeNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPuntajeNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPuntajeNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPuntajeNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Puntaje Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPuntajeNomisSeleccionados() throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntajenomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPuntajeNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PuntajeNomi puntajenomiAux:puntajenomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPuntajeNomi(puntajenomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//puntajenomiAux.setsDetalleGeneralEntityReporte(puntajenomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPuntajeNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PuntajeNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuntajeNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PuntajeNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPuntajeNomi(PuntajeNomi puntajenomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=puntajenomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=puntajenomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=puntajenomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPuntajeNomisSeleccionados() throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntajenomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PuntajeNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPuntajeNomi(row);				
				iRow++;
			}				
			
			for(PuntajeNomi puntajenomiAux:puntajenomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPuntajeNomi(puntajenomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPuntajeNomisSeleccionados() throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();		
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"puntajenomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("puntajenomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("puntajenomi");
			//elementRoot.appendChild(element);
		
			for(PuntajeNomi puntajenomiAux:puntajenomisSeleccionados) {
				element = document.createElement("puntajenomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPuntajeNomi(puntajenomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Puntaje Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPuntajeNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PuntajeNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PuntajeNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PuntajeNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPuntajeNomi(PuntajeNomi puntajenomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(puntajenomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(puntajenomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlPuntajeNomi(PuntajeNomi puntajenomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PuntajeNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(puntajenomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PuntajeNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(puntajenomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(PuntajeNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(puntajenomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoPuntajeNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PuntajeNomi> puntajenomisSeleccionados=new ArrayList<PuntajeNomi>();
		
		puntajenomisSeleccionados=this.getPuntajeNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPuntajeNomi(puntajenomisSeleccionados);
		
		this.generarReportePuntajeNomis("Todos",puntajenomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPuntajeNomi(ArrayList<PuntajeNomi> puntajenomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PuntajeNomi puntajenomiAux:puntajenomisSeleccionados) {
				puntajenomiAux.setsDetalleGeneralEntityReporte(puntajenomiAux.toString());
			
				if(sTipoSeleccionar.equals(PuntajeNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					puntajenomiAux.setsDescripcionGeneralEntityReporte1(puntajenomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PuntajeNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPuntajeNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPuntajeNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=true;
				this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=true;
			}
			
			this.isVisibilidadCeldaModificarPuntajeNomi=false;
			this.isVisibilidadCeldaActualizarPuntajeNomi=false;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
			this.isVisibilidadCeldaCancelarPuntajeNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntajeNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPuntajeNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
			this.isVisibilidadCeldaModificarPuntajeNomi=false;
			this.isVisibilidadCeldaActualizarPuntajeNomi=true;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
			this.isVisibilidadCeldaCancelarPuntajeNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntajeNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPuntajeNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
			this.isVisibilidadCeldaModificarPuntajeNomi=false;
			this.isVisibilidadCeldaActualizarPuntajeNomi=true;
			this.isVisibilidadCeldaEliminarPuntajeNomi=true;
			this.isVisibilidadCeldaCancelarPuntajeNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntajeNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPuntajeNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
			this.isVisibilidadCeldaModificarPuntajeNomi=false;
			this.isVisibilidadCeldaActualizarPuntajeNomi=true;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
			this.isVisibilidadCeldaCancelarPuntajeNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPuntajeNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=true;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=true;
			this.isVisibilidadCeldaModificarPuntajeNomi=false;
			this.isVisibilidadCeldaActualizarPuntajeNomi=false;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
			this.isVisibilidadCeldaCancelarPuntajeNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntajeNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPuntajeNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
			this.isVisibilidadCeldaActualizarPuntajeNomi=false;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
			this.isVisibilidadCeldaCancelarPuntajeNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPuntajeNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
			this.isVisibilidadCeldaModificarPuntajeNomi=true;
			this.isVisibilidadCeldaActualizarPuntajeNomi=false;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
			this.isVisibilidadCeldaCancelarPuntajeNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarPuntajeNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PuntajeNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPuntajeNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=true;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=true;
		} else {
			this.actualizarEstadoPanelsPuntajeNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPuntajeNomi=false;
			//this.isVisibilidadCeldaVerFormPuntajeNomi=false;
			this.isVisibilidadCeldaDuplicarPuntajeNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!puntajenomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoPuntajeNomi=false;
			this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(puntajenomiSessionBean.getEsGuardarRelacionado()) {
			if(!puntajenomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;												
			}
			
			this.jButtonCerrarPuntajeNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPuntajeNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.puntajenomi)) {
			this.isVisibilidadCeldaActualizarPuntajeNomi=false;
			this.isVisibilidadCeldaEliminarPuntajeNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPuntajeNomi() {
		this.isVisibilidadCeldaNuevoPuntajeNomi=false;
		this.isVisibilidadCeldaGuardarCambiosPuntajeNomi=false;
	}
	
	public void actualizarEstadoPanelsPuntajeNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPuntajeNomi!=null) {
				this.jScrollPanelDatosEdicionPuntajeNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPuntajeNomi!=null) {
				this.jScrollPanelDatosPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntajeNomi!=null) {
				this.jPanelPaginacionPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntajeNomi!=null) {
				this.jPanelParametrosReportesPuntajeNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPuntajeNomi!=null) {
				this.jScrollPanelDatosEdicionPuntajeNomi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosPuntajeNomi!=null) {
				this.jScrollPanelDatosPuntajeNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuntajeNomi!=null) {
				this.jPanelPaginacionPuntajeNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuntajeNomi!=null) {
				this.jPanelParametrosReportesPuntajeNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPuntajeNomi!=null) {
				this.jScrollPanelDatosEdicionPuntajeNomi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosPuntajeNomi!=null) {
				this.jScrollPanelDatosPuntajeNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuntajeNomi!=null) {
				this.jPanelPaginacionPuntajeNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuntajeNomi!=null) {
				this.jPanelParametrosReportesPuntajeNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPuntajeNomi!=null) {
				this.jScrollPanelDatosEdicionPuntajeNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPuntajeNomi!=null) {
				this.jScrollPanelDatosPuntajeNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionPuntajeNomi!=null) {
				this.jPanelPaginacionPuntajeNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPuntajeNomi!=null) {
				this.jPanelParametrosReportesPuntajeNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPuntajeNomi!=null) {
				this.jScrollPanelDatosEdicionPuntajeNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPuntajeNomi!=null) {
				this.jScrollPanelDatosPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntajeNomi!=null) {
				this.jPanelPaginacionPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntajeNomi!=null) {
				this.jPanelParametrosReportesPuntajeNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPuntajeNomi!=null) {
				this.jScrollPanelDatosEdicionPuntajeNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosPuntajeNomi!=null) {
				this.jScrollPanelDatosPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntajeNomi!=null) {
				this.jPanelPaginacionPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntajeNomi!=null) {
				this.jPanelParametrosReportesPuntajeNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPuntajeNomi!=null) {
				this.jScrollPanelDatosEdicionPuntajeNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosPuntajeNomi!=null) {
				this.jScrollPanelDatosPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionPuntajeNomi!=null) {
				this.jPanelPaginacionPuntajeNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPuntajeNomi!=null) {
				this.jPanelParametrosReportesPuntajeNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.puntajenomiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionPuntajeNomiParaFormatoNomis() throws Exception {
		Boolean isPaginaPopupFormatoNomi=false;

		try {

			if(this.puntajenomiSessionBean==null) {
				this.puntajenomiSessionBean=new PuntajeNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean==null) {
				this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean=new FormatoNomiSessionBean();
			}

			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean.setsPathNavegacionActual(puntajenomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormatoNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormatoNomi=this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormatoNomi(true);
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormatoNomi(PuntajeNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean.setisBusquedaDesdeForeignKeySesionPuntajeNomi(true);
			this.jInternalFrameDetalleFormPuntajeNomi.formatonomiSessionBean.setlidPuntajeNomiActual(this.idPuntajeNomiActual);

			puntajenomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPuntajeNomi(true);
			puntajenomiSessionBean.setlIdPuntajeNomiActualForeignKey(this.idPuntajeNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PuntajeNomiSessionBean puntajenomiSessionBean=new PuntajeNomiSessionBean();
		
		if(this.puntajenomiSessionBean==null) {
			this.puntajenomiSessionBean=new PuntajeNomiSessionBean();
		}
		
		this.puntajenomiSessionBean.setsUltimaBusquedaPuntajeNomi(this.getsAccionBusqueda());
		this.puntajenomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.puntajenomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PuntajeNomiSessionBean puntajenomiSessionBean=new PuntajeNomiSessionBean();
		
		if(this.puntajenomiSessionBean==null) {
			this.puntajenomiSessionBean=new PuntajeNomiSessionBean();
		}
		
		if(this.puntajenomiSessionBean.getsUltimaBusquedaPuntajeNomi()!=null&&!this.puntajenomiSessionBean.getsUltimaBusquedaPuntajeNomi().equals("")) {
			this.setsAccionBusqueda(puntajenomiSessionBean.getsUltimaBusquedaPuntajeNomi());
			this.setiNumeroPaginacion(puntajenomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(puntajenomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.puntajenomiSessionBean.setsUltimaBusquedaPuntajeNomi("");
		this.puntajenomiSessionBean.setiNumeroPaginacion(PuntajeNomiConstantesFunciones.INUMEROPAGINACION);
		this.puntajenomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPuntajeNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPuntajeNomi() {
		this.updateBorderResaltarBusquedasFormularioPuntajeNomi();
		this.updateVisibilidadBusquedasFormularioPuntajeNomi();
		this.updateHabilitarBusquedasFormularioPuntajeNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioPuntajeNomi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioPuntajeNomi() {
	}
	
	public void updateHabilitarBusquedasFormularioPuntajeNomi() {
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
	
	public void updateControlesFormularioPuntajeNomi() throws Exception {

		if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPuntajeNomi();
		this.updateVisibilidadResaltarControlesFormularioPuntajeNomi();
		this.updateHabilitarResaltarControlesFormularioPuntajeNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioPuntajeNomi() throws Exception {
		if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.puntajenomiConstantesFunciones.resaltaridPuntajeNomi!=null && this.jInternalFrameDetalleFormPuntajeNomi!=null) {this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.setBorder(this.puntajenomiConstantesFunciones.resaltaridPuntajeNomi);}
		if(this.puntajenomiConstantesFunciones.resaltarnombrePuntajeNomi!=null && this.jInternalFrameDetalleFormPuntajeNomi!=null) {this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.setBorder(this.puntajenomiConstantesFunciones.resaltarnombrePuntajeNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPuntajeNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
	
		//this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.setVisible(this.puntajenomiConstantesFunciones.mostraridPuntajeNomi);
		this.jInternalFrameDetalleFormPuntajeNomi.jPanelidPuntajeNomi.setVisible(this.puntajenomiConstantesFunciones.mostraridPuntajeNomi);
		//this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.setVisible(this.puntajenomiConstantesFunciones.mostrarnombrePuntajeNomi);
		this.jInternalFrameDetalleFormPuntajeNomi.jPanelnombrePuntajeNomi.setVisible(this.puntajenomiConstantesFunciones.mostrarnombrePuntajeNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPuntajeNomi() throws Exception {
		if(this.jInternalFrameDetalleFormPuntajeNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPuntajeNomi!=null) {
	
		this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldidPuntajeNomi.setEnabled(this.puntajenomiConstantesFunciones.activaridPuntajeNomi);
		this.jInternalFrameDetalleFormPuntajeNomi.jTextFieldnombrePuntajeNomi.setEnabled(this.puntajenomiConstantesFunciones.activarnombrePuntajeNomi);
		}
	}
	
		
}