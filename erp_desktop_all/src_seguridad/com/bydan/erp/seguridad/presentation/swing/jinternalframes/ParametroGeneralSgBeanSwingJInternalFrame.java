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

import com.bydan.erp.seguridad.util.ParametroGeneralSgConstantesFunciones;
import com.bydan.erp.seguridad.util.ParametroGeneralSgParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.ParametroGeneralSgParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.ParametroGeneralSgBean;
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
public class ParametroGeneralSgBeanSwingJInternalFrame extends ParametroGeneralSgJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroGeneralSgBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroGeneralSg> parametrogeneralsgValidator = new ClassValidator<ParametroGeneralSg>(ParametroGeneralSg.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroGeneralSg parametrogeneralsg;	
	public ParametroGeneralSg parametrogeneralsgAux;
	public ParametroGeneralSg parametrogeneralsgAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroGeneralSg parametrogeneralsgTotales;
	public Long idParametroGeneralSgActual;
	public Long iIdNuevoParametroGeneralSg=0L;
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
	
	public Boolean isPermisoTodoParametroGeneralSg;
	public Boolean isPermisoNuevoParametroGeneralSg;
	public Boolean isPermisoActualizarParametroGeneralSg;
	public Boolean isPermisoActualizarOriginalParametroGeneralSg;
	public Boolean isPermisoEliminarParametroGeneralSg;
	public Boolean isPermisoGuardarCambiosParametroGeneralSg;
	public Boolean isPermisoConsultaParametroGeneralSg;
	public Boolean isPermisoBusquedaParametroGeneralSg;
	public Boolean isPermisoReporteParametroGeneralSg;
	public Boolean isPermisoPaginacionMedioParametroGeneralSg;
	public Boolean isPermisoPaginacionAltoParametroGeneralSg;
	public Boolean isPermisoPaginacionTodoParametroGeneralSg;
	public Boolean isPermisoCopiarParametroGeneralSg;
	public Boolean isPermisoVerFormParametroGeneralSg;
	public Boolean isPermisoDuplicarParametroGeneralSg;
	public Boolean isPermisoOrdenParametroGeneralSg;
	
	
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
	
	public ParametroGeneralSgParameterReturnGeneral parametrogeneralsgReturnGeneral;
	public ParametroGeneralSgParameterReturnGeneral parametrogeneralsgParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroGeneralSg=false;
	public Boolean esParaAccionDesdeFormularioParametroGeneralSg=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroGeneralSgSessionBeanAdditional parametrogeneralsgSessionBeanAdditional=null;
	
	public ParametroGeneralSgSessionBeanAdditional getParametroGeneralSgSessionBeanAdditional() {
		return this.parametrogeneralsgSessionBeanAdditional;
	}
	
	public void setParametroGeneralSgSessionBeanAdditional(ParametroGeneralSgSessionBeanAdditional parametrogeneralsgSessionBeanAdditional) {
		try {
			this.parametrogeneralsgSessionBeanAdditional=parametrogeneralsgSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroGeneralSgBeanSwingJInternalFrameAdditional parametrogeneralsgBeanSwingJInternalFrameAdditional=null;
	//public class ParametroGeneralSgBeanSwingJInternalFrame
	
	public ParametroGeneralSgBeanSwingJInternalFrameAdditional getParametroGeneralSgBeanSwingJInternalFrameAdditional() {
		return this.parametrogeneralsgBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroGeneralSgBeanSwingJInternalFrameAdditional(ParametroGeneralSgBeanSwingJInternalFrameAdditional parametrogeneralsgBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrogeneralsgBeanSwingJInternalFrameAdditional=parametrogeneralsgBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroGeneralSgLogic parametrogeneralsgLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroGeneralSg parametrogeneralsgBean;
	public ParametroGeneralSgConstantesFunciones parametrogeneralsgConstantesFunciones;
	//public ParametroGeneralSgParameterReturnGeneral parametrogeneralsgReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<ParametroGeneralSg> parametrogeneralsgs;	
	//public List<ParametroGeneralSg> parametrogeneralsgsEliminados;
	//public List<ParametroGeneralSg> parametrogeneralsgsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroGeneralSg=false;
	public Boolean isVisibilidadCeldaDuplicarParametroGeneralSg=true;
	public Boolean isVisibilidadCeldaCopiarParametroGeneralSg=true;
	public Boolean isVisibilidadCeldaVerFormParametroGeneralSg=true;
	public Boolean isVisibilidadCeldaOrdenParametroGeneralSg=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
	public Boolean isVisibilidadCeldaModificarParametroGeneralSg=false;
	public Boolean isVisibilidadCeldaActualizarParametroGeneralSg=false;
	public Boolean isVisibilidadCeldaEliminarParametroGeneralSg=false;
	public Boolean isVisibilidadCeldaCancelarParametroGeneralSg=false;
	public Boolean isVisibilidadCeldaGuardarParametroGeneralSg=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;	
	
	
	
	public Long getiIdNuevoParametroGeneralSg() {
		return this.iIdNuevoParametroGeneralSg;
	}

	public void setiIdNuevoParametroGeneralSg(Long iIdNuevoParametroGeneralSg) {
		this.iIdNuevoParametroGeneralSg = iIdNuevoParametroGeneralSg;
	}
	
	public Long getidParametroGeneralSgActual() {
		return this.idParametroGeneralSgActual;
	}

	public void setidParametroGeneralSgActual(Long idParametroGeneralSgActual) {
		this.idParametroGeneralSgActual = idParametroGeneralSgActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroGeneralSg getparametrogeneralsg() {
		return this.parametrogeneralsg;
	}

	public void setparametrogeneralsg(ParametroGeneralSg parametrogeneralsg) {
		this.parametrogeneralsg = parametrogeneralsg;
	}
	
	public ParametroGeneralSg getparametrogeneralsgAux() {
		return this.parametrogeneralsgAux;
	}

	public void setparametrogeneralsgAux(ParametroGeneralSg parametrogeneralsgAux) {
		this.parametrogeneralsgAux = parametrogeneralsgAux;
	}				
	
	public ParametroGeneralSg getparametrogeneralsgAnterior() {
		return this.parametrogeneralsgAnterior;
	}

	public void setparametrogeneralsgAnterior(ParametroGeneralSg parametrogeneralsgAnterior) {
		this.parametrogeneralsgAnterior = parametrogeneralsgAnterior;
	}	
	
	public ParametroGeneralSg getparametrogeneralsgTotales() {
		return this.parametrogeneralsgTotales;
	}

	public void setparametrogeneralsgTotales(ParametroGeneralSg parametrogeneralsgTotales) {
		this.parametrogeneralsgTotales = parametrogeneralsgTotales;
	}	
	
	public ParametroGeneralSg getparametrogeneralsgBean() {
		return this.parametrogeneralsgBean;
	}

	public void setparametrogeneralsgBean(ParametroGeneralSg parametrogeneralsgBean) {
		this.parametrogeneralsgBean = parametrogeneralsgBean;
	}	
	
	public ParametroGeneralSgParameterReturnGeneral getparametrogeneralsgReturnGeneral() {
		return this.parametrogeneralsgReturnGeneral;
	}

	public void setparametrogeneralsgReturnGeneral(ParametroGeneralSgParameterReturnGeneral parametrogeneralsgReturnGeneral) {
		this.parametrogeneralsgReturnGeneral = parametrogeneralsgReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroGeneralSgLogic getParametroGeneralSgLogic()	{		
		return parametrogeneralsgLogic;
	}

	public void setParametroGeneralSgLogic(ParametroGeneralSgLogic parametrogeneralsgLogic) {
		this.parametrogeneralsgLogic = parametrogeneralsgLogic;
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
	
	public Boolean getIsEsNuevoParametroGeneralSg() {
		return isEsNuevoParametroGeneralSg;
	}

	public void setIsEsNuevoParametroGeneralSg(Boolean isEsNuevoParametroGeneralSg) {
		this.isEsNuevoParametroGeneralSg = isEsNuevoParametroGeneralSg;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroGeneralSg() {
		return esParaAccionDesdeFormularioParametroGeneralSg;
	}
	
	public void setEsParaAccionDesdeFormularioParametroGeneralSg(Boolean esParaAccionDesdeFormularioParametroGeneralSg) {
		this.esParaAccionDesdeFormularioParametroGeneralSg = esParaAccionDesdeFormularioParametroGeneralSg;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesParametroGeneralSg() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroGeneralSgConstantesFunciones.refrescarForeignKeysDescripcionesParametroGeneralSg(this.parametrogeneralsgLogic.getParametroGeneralSgs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroGeneralSgConstantesFunciones.refrescarForeignKeysDescripcionesParametroGeneralSg(this.parametrogeneralsgs);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrogeneralsgLogic.setParametroGeneralSgs(this.parametrogeneralsgs);
			parametrogeneralsgLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroGeneralSgParameterReturnGeneral getParametroGeneralSgParameterGeneral() {
		return this.parametrogeneralsgParameterGeneral;
	}
	
	public void setParametroGeneralSgParameterGeneral(ParametroGeneralSgParameterReturnGeneral parametrogeneralsgParameterGeneral) {
		this.parametrogeneralsgParameterGeneral = parametrogeneralsgParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroGeneralSg() {
		return isPermisoTodoParametroGeneralSg;
	}

	public void setIsPermisoTodoParametroGeneralSg(Boolean isPermisoTodoParametroGeneralSg) {
		this.isPermisoTodoParametroGeneralSg = isPermisoTodoParametroGeneralSg;
	}

	public Boolean getIsPermisoNuevoParametroGeneralSg() {
		return isPermisoNuevoParametroGeneralSg;
	}

	public void setIsPermisoNuevoParametroGeneralSg(Boolean isPermisoNuevoParametroGeneralSg) {
		this.isPermisoNuevoParametroGeneralSg = isPermisoNuevoParametroGeneralSg;
	}

	public Boolean getIsPermisoActualizarParametroGeneralSg() {
		return isPermisoActualizarParametroGeneralSg;
	}

	public void setIsPermisoActualizarParametroGeneralSg(Boolean isPermisoActualizarParametroGeneralSg) {
		this.isPermisoActualizarParametroGeneralSg = isPermisoActualizarParametroGeneralSg;
	}

	public Boolean getIsPermisoEliminarParametroGeneralSg() {
		return isPermisoEliminarParametroGeneralSg;
	}

	public void setIsPermisoEliminarParametroGeneralSg(Boolean isPermisoEliminarParametroGeneralSg) {
		this.isPermisoEliminarParametroGeneralSg = isPermisoEliminarParametroGeneralSg;
	}

	public Boolean getIsPermisoGuardarCambiosParametroGeneralSg() {
		return isPermisoGuardarCambiosParametroGeneralSg;
	}

	public void setIsPermisoGuardarCambiosParametroGeneralSg(Boolean isPermisoGuardarCambiosParametroGeneralSg) {
		this.isPermisoGuardarCambiosParametroGeneralSg = isPermisoGuardarCambiosParametroGeneralSg;
	}
	
	public Boolean getIsPermisoConsultaParametroGeneralSg() {
		return isPermisoConsultaParametroGeneralSg;
	}

	public void setIsPermisoConsultaParametroGeneralSg(Boolean isPermisoConsultaParametroGeneralSg) {
		this.isPermisoConsultaParametroGeneralSg = isPermisoConsultaParametroGeneralSg;
	}

	public Boolean getIsPermisoBusquedaParametroGeneralSg() {
		return isPermisoBusquedaParametroGeneralSg;
	}

	public void setIsPermisoBusquedaParametroGeneralSg(Boolean isPermisoBusquedaParametroGeneralSg) {
		this.isPermisoBusquedaParametroGeneralSg = isPermisoBusquedaParametroGeneralSg;
	}

	public Boolean getIsPermisoReporteParametroGeneralSg() {
		return isPermisoReporteParametroGeneralSg;
	}

	public void setIsPermisoReporteParametroGeneralSg(Boolean isPermisoReporteParametroGeneralSg) {
		this.isPermisoReporteParametroGeneralSg = isPermisoReporteParametroGeneralSg;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroGeneralSg() {
		return isPermisoPaginacionMedioParametroGeneralSg;
	}

	public void setIsPermisoPaginacionMedioParametroGeneralSg(Boolean isPermisoPaginacionMedioParametroGeneralSg) {
		this.isPermisoPaginacionMedioParametroGeneralSg = isPermisoPaginacionMedioParametroGeneralSg;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroGeneralSg() {
		return isPermisoPaginacionTodoParametroGeneralSg;
	}

	public void setIsPermisoPaginacionTodoParametroGeneralSg(Boolean isPermisoPaginacionTodoParametroGeneralSg) {
		this.isPermisoPaginacionTodoParametroGeneralSg = isPermisoPaginacionTodoParametroGeneralSg;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroGeneralSg() {
		return isPermisoPaginacionAltoParametroGeneralSg;
	}

	public void setIsPermisoPaginacionAltoParametroGeneralSg(Boolean isPermisoPaginacionAltoParametroGeneralSg) {
		this.isPermisoPaginacionAltoParametroGeneralSg = isPermisoPaginacionAltoParametroGeneralSg;
	}
	
	public Boolean getIsPermisoCopiarParametroGeneralSg() {
		return isPermisoCopiarParametroGeneralSg;
	}

	public void setIsPermisoCopiarParametroGeneralSg(Boolean isPermisoCopiarParametroGeneralSg) {
		this.isPermisoCopiarParametroGeneralSg = isPermisoCopiarParametroGeneralSg;
	}
	
	public Boolean getIsPermisoVerFormParametroGeneralSg() {
		return isPermisoVerFormParametroGeneralSg;
	}

	public void setIsPermisoVerFormParametroGeneralSg(Boolean isPermisoVerFormParametroGeneralSg) {
		this.isPermisoVerFormParametroGeneralSg = isPermisoVerFormParametroGeneralSg;
	}
	
	public Boolean getIsPermisoDuplicarParametroGeneralSg() {
		return isPermisoDuplicarParametroGeneralSg;
	}

	public void setIsPermisoDuplicarParametroGeneralSg(Boolean isPermisoDuplicarParametroGeneralSg) {
		this.isPermisoDuplicarParametroGeneralSg = isPermisoDuplicarParametroGeneralSg;
	}
	
	public Boolean getIsPermisoOrdenParametroGeneralSg() {
		return isPermisoOrdenParametroGeneralSg;
	}

	public void setIsPermisoOrdenParametroGeneralSg(Boolean isPermisoOrdenParametroGeneralSg) {
		this.isPermisoOrdenParametroGeneralSg = isPermisoOrdenParametroGeneralSg;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroGeneralSg() {
		return isVisibilidadCeldaNuevoParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaNuevoParametroGeneralSg(Boolean isVisibilidadCeldaNuevoParametroGeneralSg) {
		this.isVisibilidadCeldaNuevoParametroGeneralSg = isVisibilidadCeldaNuevoParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroGeneralSg() {
		return isVisibilidadCeldaDuplicarParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaDuplicarParametroGeneralSg(Boolean isVisibilidadCeldaDuplicarParametroGeneralSg) {
		this.isVisibilidadCeldaDuplicarParametroGeneralSg = isVisibilidadCeldaDuplicarParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroGeneralSg() {
		return isVisibilidadCeldaCopiarParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaCopiarParametroGeneralSg(Boolean isVisibilidadCeldaCopiarParametroGeneralSg) {
		this.isVisibilidadCeldaCopiarParametroGeneralSg = isVisibilidadCeldaCopiarParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroGeneralSg() {
		return isVisibilidadCeldaVerFormParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaVerFormParametroGeneralSg(Boolean isVisibilidadCeldaVerFormParametroGeneralSg) {
		this.isVisibilidadCeldaVerFormParametroGeneralSg = isVisibilidadCeldaVerFormParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroGeneralSg() {
		return isVisibilidadCeldaOrdenParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaOrdenParametroGeneralSg(Boolean isVisibilidadCeldaOrdenParametroGeneralSg) {
		this.isVisibilidadCeldaOrdenParametroGeneralSg = isVisibilidadCeldaOrdenParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroGeneralSg() {
		return isVisibilidadCeldaNuevoRelacionesParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroGeneralSg(Boolean isVisibilidadCeldaNuevoRelacionesParametroGeneralSg) {
		this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg = isVisibilidadCeldaNuevoRelacionesParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroGeneralSg() {
		return isVisibilidadCeldaModificarParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaModificarParametroGeneralSg(Boolean isVisibilidadCeldaModificarParametroGeneralSg) {
		this.isVisibilidadCeldaModificarParametroGeneralSg = isVisibilidadCeldaModificarParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroGeneralSg() {
		return isVisibilidadCeldaActualizarParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaActualizarParametroGeneralSg(Boolean isVisibilidadCeldaActualizarParametroGeneralSg) {
		this.isVisibilidadCeldaActualizarParametroGeneralSg = isVisibilidadCeldaActualizarParametroGeneralSg;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroGeneralSg() {
		return isVisibilidadCeldaEliminarParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaEliminarParametroGeneralSg(Boolean isVisibilidadCeldaEliminarParametroGeneralSg) {
		this.isVisibilidadCeldaEliminarParametroGeneralSg = isVisibilidadCeldaEliminarParametroGeneralSg;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroGeneralSg() {
		return isVisibilidadCeldaCancelarParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaCancelarParametroGeneralSg(Boolean isVisibilidadCeldaCancelarParametroGeneralSg) {
		this.isVisibilidadCeldaCancelarParametroGeneralSg = isVisibilidadCeldaCancelarParametroGeneralSg;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroGeneralSg() {
		return isVisibilidadCeldaGuardarParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaGuardarParametroGeneralSg(Boolean isVisibilidadCeldaGuardarParametroGeneralSg) {
		this.isVisibilidadCeldaGuardarParametroGeneralSg = isVisibilidadCeldaGuardarParametroGeneralSg;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroGeneralSg() {
		return isVisibilidadCeldaGuardarCambiosParametroGeneralSg;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroGeneralSg(Boolean isVisibilidadCeldaGuardarCambiosParametroGeneralSg) {
		this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg = isVisibilidadCeldaGuardarCambiosParametroGeneralSg;
	}
		
	public ParametroGeneralSgSessionBean getparametrogeneralsgSessionBean() {
		return this.parametrogeneralsgSessionBean;
	}
	
	public void setparametrogeneralsgSessionBean(ParametroGeneralSgSessionBean parametrogeneralsgSessionBean) {
		this.parametrogeneralsgSessionBean=parametrogeneralsgSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(ParametroGeneralSg parametrogeneralsg)throws Exception {
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
	
	public void bugActualizarReferenciaActual(ParametroGeneralSg parametrogeneralsg,ParametroGeneralSg parametrogeneralsgAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroGeneralSg(parametrogeneralsg);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrogeneralsgAux.setId(parametrogeneralsg.getId());
		parametrogeneralsgAux.setVersionRow(parametrogeneralsg.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroGeneralSg();
		
			int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrogeneralsgValidator.getInvalidValues(this.parametrogeneralsg);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrogeneralsgLogic.setDatosCliente(datosCliente);
			parametrogeneralsgLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrogeneralsgAux=new  ParametroGeneralSg();
				
				parametrogeneralsgAux.setIsNew(true);
				parametrogeneralsgAux.setIsChanged(true);
				
				parametrogeneralsgAux.setParametroGeneralSgOriginal(this.parametrogeneralsg);
				
				parametrogeneralsgAux.setId(this.parametrogeneralsg.getId());	
				parametrogeneralsgAux.setVersionRow(this.parametrogeneralsg.getVersionRow());	
				parametrogeneralsgAux.setnombre_sistema(this.parametrogeneralsg.getnombre_sistema());	
				parametrogeneralsgAux.setnombre_simple_sistema(this.parametrogeneralsg.getnombre_simple_sistema());	
				parametrogeneralsgAux.setnombre_empresa(this.parametrogeneralsg.getnombre_empresa());	
				parametrogeneralsgAux.setversion_sistema(this.parametrogeneralsg.getversion_sistema());	
				parametrogeneralsgAux.setsiglas_sistema(this.parametrogeneralsg.getsiglas_sistema());	
				parametrogeneralsgAux.setmail_sistema(this.parametrogeneralsg.getmail_sistema());	
				parametrogeneralsgAux.settelefono_sistema(this.parametrogeneralsg.gettelefono_sistema());	
				parametrogeneralsgAux.setfax_sistema(this.parametrogeneralsg.getfax_sistema());	
				parametrogeneralsgAux.setrepresentante_nombre(this.parametrogeneralsg.getrepresentante_nombre());	
				parametrogeneralsgAux.setcodigo_proceso_actualizacion(this.parametrogeneralsg.getcodigo_proceso_actualizacion());	
				parametrogeneralsgAux.setesta_activo(this.parametrogeneralsg.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrogeneralsgSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrogeneralsgAux,parametrogeneralsgLogic.getParametroGeneralSgs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralsgAux,parametrogeneralsgs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsgLogic.saveParametroGeneralSgs();//WithConnection
						//parametrogeneralsgLogic.getSetVersionRowParametroGeneralSgs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrogeneralsg,parametrogeneralsgAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrogeneralsgAux=new  ParametroGeneralSg();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() && this.parametrogeneralsg.getId()>=0)) {
						
					parametrogeneralsgAux.setIsNew(false);
				}
				
				parametrogeneralsgAux.setIsDeleted(false);
			
				parametrogeneralsgAux.setId(this.parametrogeneralsg.getId());	
				parametrogeneralsgAux.setVersionRow(this.parametrogeneralsg.getVersionRow());	
				parametrogeneralsgAux.setnombre_sistema(this.parametrogeneralsg.getnombre_sistema());	
				parametrogeneralsgAux.setnombre_simple_sistema(this.parametrogeneralsg.getnombre_simple_sistema());	
				parametrogeneralsgAux.setnombre_empresa(this.parametrogeneralsg.getnombre_empresa());	
				parametrogeneralsgAux.setversion_sistema(this.parametrogeneralsg.getversion_sistema());	
				parametrogeneralsgAux.setsiglas_sistema(this.parametrogeneralsg.getsiglas_sistema());	
				parametrogeneralsgAux.setmail_sistema(this.parametrogeneralsg.getmail_sistema());	
				parametrogeneralsgAux.settelefono_sistema(this.parametrogeneralsg.gettelefono_sistema());	
				parametrogeneralsgAux.setfax_sistema(this.parametrogeneralsg.getfax_sistema());	
				parametrogeneralsgAux.setrepresentante_nombre(this.parametrogeneralsg.getrepresentante_nombre());	
				parametrogeneralsgAux.setcodigo_proceso_actualizacion(this.parametrogeneralsg.getcodigo_proceso_actualizacion());	
				parametrogeneralsgAux.setesta_activo(this.parametrogeneralsg.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrogeneralsgAux,parametrogeneralsgLogic.getParametroGeneralSgs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralsgAux,parametrogeneralsgs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsgLogic.saveParametroGeneralSgs();//WithConnection
						//parametrogeneralsgLogic.getSetVersionRowParametroGeneralSgs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrogeneralsg,parametrogeneralsgAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrogeneralsgAux=new  ParametroGeneralSg();
				
				parametrogeneralsgAux.setIsNew(false);
				parametrogeneralsgAux.setIsChanged(false);
				
				parametrogeneralsgAux.setIsDeleted(true);
				
				parametrogeneralsgAux.setId(this.parametrogeneralsg.getId());	
				parametrogeneralsgAux.setVersionRow(this.parametrogeneralsg.getVersionRow());	
				parametrogeneralsgAux.setnombre_sistema(this.parametrogeneralsg.getnombre_sistema());	
				parametrogeneralsgAux.setnombre_simple_sistema(this.parametrogeneralsg.getnombre_simple_sistema());	
				parametrogeneralsgAux.setnombre_empresa(this.parametrogeneralsg.getnombre_empresa());	
				parametrogeneralsgAux.setversion_sistema(this.parametrogeneralsg.getversion_sistema());	
				parametrogeneralsgAux.setsiglas_sistema(this.parametrogeneralsg.getsiglas_sistema());	
				parametrogeneralsgAux.setmail_sistema(this.parametrogeneralsg.getmail_sistema());	
				parametrogeneralsgAux.settelefono_sistema(this.parametrogeneralsg.gettelefono_sistema());	
				parametrogeneralsgAux.setfax_sistema(this.parametrogeneralsg.getfax_sistema());	
				parametrogeneralsgAux.setrepresentante_nombre(this.parametrogeneralsg.getrepresentante_nombre());	
				parametrogeneralsgAux.setcodigo_proceso_actualizacion(this.parametrogeneralsg.getcodigo_proceso_actualizacion());	
				parametrogeneralsgAux.setesta_activo(this.parametrogeneralsg.getesta_activo());	
				
				if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrogeneralsgAux.getId()>=0) {	
						this.parametrogeneralsgsEliminados.add(parametrogeneralsgAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrogeneralsgAux,parametrogeneralsgLogic.getParametroGeneralSgs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralsgAux,parametrogeneralsgs);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsgLogic.saveParametroGeneralSgs();//WithConnection
						//parametrogeneralsgLogic.getSetVersionRowParametroGeneralSgs();//WithConnection
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
					this.parametrogeneralsgLogic.getParametroGeneralSgs().addAll(this.parametrogeneralsgsEliminados);
					
					parametrogeneralsgLogic.saveParametroGeneralSgs();//WithConnection
					//parametrogeneralsgLogic.getSetVersionRowParametroGeneralSgs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.parametrogeneralsgsEliminados= new ArrayList<ParametroGeneralSg>();		
			}
			
			if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro General GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrogeneralsg=parametrogeneralsgAux;
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
      		//this.finishProcessParametroGeneralSg();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroGeneralSg parametrogeneralsgLocal) throws Exception {
		
		if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroGeneralSg parametrogeneralsgLocal) throws Exception {	
		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarParametroGeneralSgActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrogeneralsgValidator.getInvalidValues(this.parametrogeneralsg);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception {
		try	{		
			ParametroGeneralSgConstantesFunciones.actualizarLista(parametrogeneralsg,parametrogeneralsgs,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroGeneralSg parametrogeneralsg,List<ParametroGeneralSg> parametrogeneralsgs) throws Exception {
		try	{			
			ParametroGeneralSgConstantesFunciones.actualizarSelectedLista(parametrogeneralsg,parametrogeneralsgs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroGeneralSg> parametrogeneralsgsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrogeneralsgsLocal=this.parametrogeneralsgLogic.getParametroGeneralSgs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrogeneralsgsLocal=this.parametrogeneralsgs;
			}
			//ARCHITECTURE
		
			for(ParametroGeneralSg parametrogeneralsgLocal:parametrogeneralsgsLocal) {
				if(this.permiteMantenimiento(parametrogeneralsgLocal) && parametrogeneralsgLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroGeneralSgConstantesFunciones.getParametroGeneralSgLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.NOMBRESISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_sistemaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.NOMBRESIMPLESISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_simple_sistemaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.NOMBREEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_empresaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.VERSIONSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelversion_sistemaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.SIGLASSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelsiglas_sistemaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.MAILSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelmail_sistemaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.TELEFONOSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabeltelefono_sistemaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.FAXSISTEMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelfax_sistemaParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.REPRESENTANTENOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelrepresentante_nombreParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.CODIGOPROCESOACTUALIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelcodigo_proceso_actualizacionParametroGeneralSg,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralSgConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelesta_activoParametroGeneralSg,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_sistemaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_simple_sistemaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_empresaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelversion_sistemaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelsiglas_sistemaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelmail_sistemaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabeltelefono_sistemaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelfax_sistemaParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelrepresentante_nombreParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelcodigo_proceso_actualizacionParametroGeneralSg,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelesta_activoParametroGeneralSg,"");
		
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
		this.iIdNuevoParametroGeneralSg--;	
		
		
		this.parametrogeneralsgAux=new ParametroGeneralSg();
		
		this.parametrogeneralsgAux.setId(this.iIdNuevoParametroGeneralSg);
		this.parametrogeneralsgAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrogeneralsgLogic.getParametroGeneralSgs().add(this.parametrogeneralsgAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrogeneralsgs.add(this.parametrogeneralsgAux);
		}
		//ARCHITECTURE
		
		this.parametrogeneralsg=this.parametrogeneralsgAux;
		
		if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroGeneralSg(this.parametrogeneralsg);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneralSg(this.parametrogeneralsg);
		}
				
		//this.setDefaultControlesParametroGeneralSg();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroGeneralSg();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroGeneralSg();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGeneralSg();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroGeneralSg(this.parametrogeneralsgBean,this.parametrogeneralsg,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
			classes=ParametroGeneralSgConstantesFunciones.getClassesRelationshipsOfParametroGeneralSg(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrogeneralsgReturnGeneral=parametrogeneralsgLogic.procesarEventosParametroGeneralSgsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogeneralsgLogic.getParametroGeneralSgs(),this.parametrogeneralsg,this.parametrogeneralsgParameterGeneral,this.isEsNuevoParametroGeneralSg,classes);//this.parametrogeneralsgLogic.getParametroGeneralSg()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroGeneralSg(this.parametrogeneralsgReturnGeneral,this.parametrogeneralsgBean,false);
		
		if(this.parametrogeneralsgReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneralSg(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroGeneralSg(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg());
		}
		
		if(this.parametrogeneralsgReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroGeneralSg(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg(),classes);//this.parametrogeneralsgBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroGeneralSg();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroGeneralSg();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.RecargarFormParametroGeneralSg(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroGeneralSg(false);
						
			if(parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGeneralSg();
			}
			
			this.actualizarVisualTableDatosParametroGeneralSg();
			
			this.jTableDatosParametroGeneralSg.setRowSelectionInterval(this.getIndiceNuevoParametroGeneralSg(), this.getIndiceNuevoParametroGeneralSg());
			
			this.seleccionarFilaTablaParametroGeneralSgActual();
						
			this.actualizarEstadoCeldasBotonesParametroGeneralSg("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroGeneralSg(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarnombre_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarnombre_simple_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarnombre_empresaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarversion_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarsiglas_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarmail_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activartelefono_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarfax_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarrepresentante_nombreParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activarcodigo_proceso_actualizacionParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setEnabled(isHabilitar && this.parametrogeneralsgConstantesFunciones.activaresta_activoParametroGeneralSg);	
		
	};
	
	public void setDefaultControlesParametroGeneralSg() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroGeneralSg(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrogeneralsgSessionBean.setConGuardarRelaciones(true);			
			this.parametrogeneralsgSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.setVisible(true);
			
					
		} else {
			//this.parametrogeneralsgSessionBean.setConGuardarRelaciones(false);			
			this.parametrogeneralsgSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroGeneralSg() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
				if(parametrogeneralsgAux.getId().equals(this.iIdNuevoParametroGeneralSg)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgs) {
				if(parametrogeneralsgAux.getId().equals(this.iIdNuevoParametroGeneralSg)) {
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
	
	public int getIndiceActualParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
				if(parametrogeneralsgAux.getId().equals(parametrogeneralsg.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgs) {
				if(parametrogeneralsgAux.getId().equals(parametrogeneralsg.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroGeneralSg(ParametroGeneralSg parametrogeneralsgOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
				if(parametrogeneralsgAux.getParametroGeneralSgOriginal().getId().equals(parametrogeneralsgOriginal.getId())) {
					existe=true;
					parametrogeneralsgOriginal.setId(parametrogeneralsgAux.getId());
					parametrogeneralsgOriginal.setVersionRow(parametrogeneralsgAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgs) {
				if(parametrogeneralsgAux.getParametroGeneralSgOriginal().getId().equals(parametrogeneralsgOriginal.getId())) {
					existe=true;
					parametrogeneralsgOriginal.setId(parametrogeneralsgAux.getId());
					parametrogeneralsgOriginal.setVersionRow(parametrogeneralsgAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroGeneralSg(Boolean esParaCancelar) throws Exception {
		parametrogeneralsgsAux=new ArrayList<ParametroGeneralSg>();
		parametrogeneralsgAux=new ParametroGeneralSg();
		
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
					if(parametrogeneralsgAux.getId()<0) {
						parametrogeneralsgsAux.add(parametrogeneralsgAux);
					}		
				}
				this.iIdNuevoParametroGeneralSg=0L;
				this.parametrogeneralsgLogic.getParametroGeneralSgs().removeAll(parametrogeneralsgsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgs) {
					if(parametrogeneralsgAux.getId()<0) {
						parametrogeneralsgsAux.add(parametrogeneralsgAux);
					}		
				}
				this.iIdNuevoParametroGeneralSg=0L;
				this.parametrogeneralsgs.removeAll(parametrogeneralsgsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroGeneralSg 
					&& this.parametrogeneralsgLogic.getParametroGeneralSgs().size()>0
					) {
					parametrogeneralsgAux=this.parametrogeneralsgLogic.getParametroGeneralSgs().get(this.parametrogeneralsgLogic.getParametroGeneralSgs().size() - 1);
				
					if(parametrogeneralsgAux.getId()<0) {
						this.parametrogeneralsgLogic.getParametroGeneralSgs().remove(parametrogeneralsgAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroGeneralSg && this.parametrogeneralsgs.size()>0) {
					parametrogeneralsgAux=this.parametrogeneralsgs.get(this.parametrogeneralsgs.size() - 1);
				
					if(parametrogeneralsgAux.getId()<0) {
						this.parametrogeneralsgs.remove(parametrogeneralsgAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroGeneralSg(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrogeneralsg.getId()<0) {
				this.parametrogeneralsgLogic.getParametroGeneralSgs().remove(this.parametrogeneralsg);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrogeneralsg.getId()<0) {
				this.parametrogeneralsgs.remove(this.parametrogeneralsg);
			}
		}			
	}
	
	public void setEstadosInicialesParametroGeneralSg(List<ParametroGeneralSg> parametrogeneralsgsAux) throws Exception {
		ParametroGeneralSgConstantesFunciones.setEstadosInicialesParametroGeneralSg(parametrogeneralsgsAux);
	}
	
	public void setEstadosInicialesParametroGeneralSg(ParametroGeneralSg parametrogeneralsgAux) throws Exception {
		ParametroGeneralSgConstantesFunciones.setEstadosInicialesParametroGeneralSg(parametrogeneralsgAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroGeneralSgActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroGeneralSg("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroGeneralSgActual()) {
				if(!this.isEsNuevoParametroGeneralSg) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroGeneralSg("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroGeneralSg=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroGeneralSgActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro General ?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroGeneralSg("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroGeneralSg parametrogeneralsg) throws Exception {
		ParametroGeneralSgConstantesFunciones.seleccionarAsignar(this.parametrogeneralsg,parametrogeneralsg);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroGeneralSg=this.isPermisoActualizarOriginalParametroGeneralSg;
			
			
			this.seleccionarAsignar(parametrogeneralsg);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroGeneralSgConstantesFunciones.quitarEspaciosParametroGeneralSg(this.parametrogeneralsg,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroGeneralSg("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrogeneralsgSessionBean.setsFuncionBusquedaRapida(this.parametrogeneralsgSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroGeneralSg) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroGeneralSg(esParaCancelar);				
				this.cancelarNuevoParametroGeneralSg(esParaCancelar);								
			}
			
			this.parametrogeneralsg=new ParametroGeneralSg();
			
			this.inicializarParametroGeneralSg();
			
			this.actualizarEstadoCeldasBotonesParametroGeneralSg("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroGeneralSg() throws Exception {
		try {
			ParametroGeneralSgConstantesFunciones.inicializarParametroGeneralSg(this.parametrogeneralsg);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrogeneralsgLogic.getParametroGeneralSgs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroGeneralSgs(String sAccionBusqueda,List<ParametroGeneralSg> parametrogeneralsgsParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroGeneralSg"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroGeneralSgMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroGeneralSgMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroGeneralSg"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Generales");		
		parameters.put("busquedapor", ParametroGeneralSgConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroGeneralSg=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroGeneralSgConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroGeneralSgConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroGeneralSg=new JRBeanArrayDataSource(ParametroGeneralSgJInternalFrame.TraerParametroGeneralSgBeans(parametrogeneralsgsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroGeneralSg);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroGeneralSgConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroGeneralSgConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroGeneralSgBean.TraerParametroGeneralSgBeans(parametrogeneralsgsParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroGeneralSgs(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsgsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroGeneralSgs(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsgsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroGeneralSgActionPerformed(null);
					//this.generarExcelReporteParametroGeneralSgs(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsgsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroGeneralSgs(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsgsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroGeneralSgs(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsgsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroGeneralSgs(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsgsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroGeneralSgs(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGeneralSg> parametrogeneralsgsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGeneralSgs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroGeneralSg("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroGeneralSg parametrogeneralsg : parametrogeneralsgsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroGeneralSgConstantesFunciones.generarExcelReporteDataParametroGeneralSg("NORMAL",row,workbook,parametrogeneralsg,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroGeneralSg(String sTipo,Row row,Workbook workbook) {
		
		ParametroGeneralSgConstantesFunciones.generarExcelReporteHeaderParametroGeneralSg(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroGeneralSgs(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGeneralSg> parametrogeneralsgsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGeneralSgs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroGeneralSg parametrogeneralsg : parametrogeneralsgsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroGeneralSgConstantesFunciones.getParametroGeneralSgDescripcion(parametrogeneralsg));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getnombre_sistema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getnombre_simple_sistema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getnombre_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getversion_sistema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getsiglas_sistema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getmail_sistema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.gettelefono_sistema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getfax_sistema());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getrepresentante_nombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneralsg.getcodigo_proceso_actualizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrogeneralsg.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroGeneralSgs(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGeneralSg> parametrogeneralsgsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroGeneralSg> parametrogeneralsgsRespaldo=null;
		
		classes=ParametroGeneralSgConstantesFunciones.getClassesRelationshipsOfParametroGeneralSg(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrogeneralsgLogic.setDatosCliente(this.datosCliente);
		this.parametrogeneralsgLogic.setDatosDeep(this.datosDeep);
		this.parametrogeneralsgLogic.setIsConDeep(true);
		
		parametrogeneralsgsRespaldo=this.parametrogeneralsgLogic.getParametroGeneralSgs();
		
		this.parametrogeneralsgLogic.setParametroGeneralSgs(parametrogeneralsgsParaReportes);	
		this.parametrogeneralsgLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrogeneralsgsParaReportes=this.parametrogeneralsgLogic.getParametroGeneralSgs();
		this.parametrogeneralsgLogic.setParametroGeneralSgs(parametrogeneralsgsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGeneralSgs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroGeneralSg("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroGeneralSg parametrogeneralsg : parametrogeneralsgsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroGeneralSg("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroGeneralSgConstantesFunciones.generarExcelReporteDataParametroGeneralSg("NORMAL",row,workbook,parametrogeneralsg,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroGeneralSgConstantesFunciones.getParametroGeneralSgDescripcion(parametrogeneralsg));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroGeneralSg() throws Exception {		
		this.startProcessParametroGeneralSg(true);
	}
	
	public void startProcessParametroGeneralSg(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesParametroGeneralSg, this.jScrollPanelDatosParametroGeneralSg,this.jPanelPaginacionParametroGeneralSg, this.jScrollPanelDatosEdicionParametroGeneralSg, this.jPanelAccionesParametroGeneralSg,this.jPanelAccionesFormularioParametroGeneralSg,this.jmenuBarParametroGeneralSg,this.jmenuBarDetalleParametroGeneralSg,this.jTtoolBarParametroGeneralSg,this.jTtoolBarDetalleParametroGeneralSg);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroGeneralSg=null; 
		
		final JPanel jPanelParametrosReportesParametroGeneralSg=this.jPanelParametrosReportesParametroGeneralSg;
		//final JScrollPane jScrollPanelDatosParametroGeneralSg=this.jScrollPanelDatosParametroGeneralSg;
		final JTable jTableDatosParametroGeneralSg=this.jTableDatosParametroGeneralSg;		
		final JPanel jPanelPaginacionParametroGeneralSg=this.jPanelPaginacionParametroGeneralSg;
		//final JScrollPane jScrollPanelDatosEdicionParametroGeneralSg=this.jScrollPanelDatosEdicionParametroGeneralSg;
		final JPanel jPanelAccionesParametroGeneralSg=this.jPanelAccionesParametroGeneralSg;
		
		JPanel jPanelCamposAuxiliarParametroGeneralSg=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroGeneralSg=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			jPanelCamposAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jPanelCamposParametroGeneralSg;
			jPanelAccionesFormularioAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jPanelAccionesFormularioParametroGeneralSg;
		}
		
		final JPanel jPanelCamposParametroGeneralSg=jPanelCamposAuxiliarParametroGeneralSg;
		final JPanel jPanelAccionesFormularioParametroGeneralSg=jPanelAccionesFormularioAuxiliarParametroGeneralSg;
		
		
		final JMenuBar jmenuBarParametroGeneralSg=this.jmenuBarParametroGeneralSg;
		final JToolBar jTtoolBarParametroGeneralSg=this.jTtoolBarParametroGeneralSg;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroGeneralSg=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroGeneralSg=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			jmenuBarDetalleAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jmenuBarDetalleParametroGeneralSg;
			jTtoolBarDetalleAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jTtoolBarDetalleParametroGeneralSg;
		}
		
		final JMenuBar jmenuBarDetalleParametroGeneralSg=jmenuBarDetalleAuxiliarParametroGeneralSg;
		final JToolBar jTtoolBarDetalleParametroGeneralSg=jTtoolBarDetalleAuxiliarParametroGeneralSg;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroGeneralSg;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroGeneralSg;
			processRunnable.jTableDatos=jTableDatosParametroGeneralSg;
			processRunnable.jPanelCampos=jPanelCamposParametroGeneralSg;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroGeneralSg;
			processRunnable.jPanelAcciones=jPanelAccionesParametroGeneralSg;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroGeneralSg;
			
			
			processRunnable.jmenuBar=jmenuBarParametroGeneralSg;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroGeneralSg;
			processRunnable.jTtoolBar=jTtoolBarParametroGeneralSg;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroGeneralSg;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroGeneralSg ,jPanelParametrosReportesParametroGeneralSg,jTableDatosParametroGeneralSg, /*jScrollPanelDatosParametroGeneralSg,*/jPanelCamposParametroGeneralSg,jPanelPaginacionParametroGeneralSg, /*jScrollPanelDatosEdicionParametroGeneralSg,*/ jPanelAccionesParametroGeneralSg,jPanelAccionesFormularioParametroGeneralSg,jmenuBarParametroGeneralSg,jmenuBarDetalleParametroGeneralSg,jTtoolBarParametroGeneralSg,jTtoolBarDetalleParametroGeneralSg);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesParametroGeneralSg, jScrollPanelDatosParametroGeneralSg,jPanelPaginacionParametroGeneralSg, jScrollPanelDatosEdicionParametroGeneralSg, jPanelAccionesParametroGeneralSg,jPanelAccionesFormularioParametroGeneralSg,jmenuBarParametroGeneralSg,jmenuBarDetalleParametroGeneralSg,jTtoolBarParametroGeneralSg,jTtoolBarDetalleParametroGeneralSg);
						
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
	
	public void finishProcessParametroGeneralSg() {// throws Exception 
		this.finishProcessParametroGeneralSg(true);
	}
	
	public void finishProcessParametroGeneralSg(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesParametroGeneralSg, this.jScrollPanelDatosParametroGeneralSg,this.jPanelPaginacionParametroGeneralSg, this.jScrollPanelDatosEdicionParametroGeneralSg, this.jPanelAccionesParametroGeneralSg,this.jPanelAccionesFormularioParametroGeneralSg,this.jmenuBarParametroGeneralSg,this.jmenuBarDetalleParametroGeneralSg,this.jTtoolBarParametroGeneralSg,this.jTtoolBarDetalleParametroGeneralSg);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroGeneralSg=null; 
		
		final JPanel jPanelParametrosReportesParametroGeneralSg=this.jPanelParametrosReportesParametroGeneralSg;
		//final JScrollPane jScrollPanelDatosParametroGeneralSg=this.jScrollPanelDatosParametroGeneralSg;
		final JTable jTableDatosParametroGeneralSg=this.jTableDatosParametroGeneralSg;		
		final JPanel jPanelPaginacionParametroGeneralSg=this.jPanelPaginacionParametroGeneralSg;
		//final JScrollPane jScrollPanelDatosEdicionParametroGeneralSg=this.jScrollPanelDatosEdicionParametroGeneralSg;
		final JPanel jPanelAccionesParametroGeneralSg=this.jPanelAccionesParametroGeneralSg;
		
		JPanel jPanelCamposAuxiliarParametroGeneralSg=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroGeneralSg=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			jPanelCamposAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jPanelCamposParametroGeneralSg;
			jPanelAccionesFormularioAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jPanelAccionesFormularioParametroGeneralSg;
		}
		
		final JPanel jPanelCamposParametroGeneralSg=jPanelCamposAuxiliarParametroGeneralSg;
		final JPanel jPanelAccionesFormularioParametroGeneralSg=jPanelAccionesFormularioAuxiliarParametroGeneralSg;
		
		
		final JMenuBar jmenuBarParametroGeneralSg=this.jmenuBarParametroGeneralSg;		
		final JToolBar jTtoolBarParametroGeneralSg=this.jTtoolBarParametroGeneralSg;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroGeneralSg=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroGeneralSg=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			jmenuBarDetalleAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jmenuBarDetalleParametroGeneralSg;
			jTtoolBarDetalleAuxiliarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jTtoolBarDetalleParametroGeneralSg;		
		}
		
		final JMenuBar jmenuBarDetalleParametroGeneralSg=jmenuBarDetalleAuxiliarParametroGeneralSg;
		final JToolBar jTtoolBarDetalleParametroGeneralSg=jTtoolBarDetalleAuxiliarParametroGeneralSg;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroGeneralSg;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroGeneralSg;
			processRunnable.jTableDatos=jTableDatosParametroGeneralSg;
			processRunnable.jPanelCampos=jPanelCamposParametroGeneralSg;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroGeneralSg;
			processRunnable.jPanelAcciones=jPanelAccionesParametroGeneralSg;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroGeneralSg;
			
			
			processRunnable.jmenuBar=jmenuBarParametroGeneralSg;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroGeneralSg;
			processRunnable.jTtoolBar=jTtoolBarParametroGeneralSg;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroGeneralSg;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroGeneralSg ,jPanelParametrosReportesParametroGeneralSg, jTableDatosParametroGeneralSg,/*jScrollPanelDatosParametroGeneralSg,*/jPanelCamposParametroGeneralSg,jPanelPaginacionParametroGeneralSg, /*jScrollPanelDatosEdicionParametroGeneralSg,*/ jPanelAccionesParametroGeneralSg,jPanelAccionesFormularioParametroGeneralSg,jmenuBarParametroGeneralSg,jmenuBarDetalleParametroGeneralSg,jTtoolBarParametroGeneralSg,jTtoolBarDetalleParametroGeneralSg));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroGeneralSg(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroGeneralSg(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroGeneralSg(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroGeneralSg(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroGeneralSg,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroGeneralSg,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroGeneralSg(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroGeneralSg,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroGeneralSg,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrogeneralsgConstantesFunciones.getsFinalQueryParametroGeneralSg();
		String  finalQueryPaginacionTodos=this.parametrogeneralsgConstantesFunciones.getsFinalQueryParametroGeneralSg();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroGeneralSgConstantesFunciones.getArrayColumnasGlobalesNoParametroGeneralSg(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroGeneralSgConstantesFunciones.getArrayColumnasGlobalesParametroGeneralSg(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroGeneralSgConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrogeneralsgsEliminados= new ArrayList<ParametroGeneralSg>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroGeneralSg();
		
				///*ParametroGeneralSgSessionBean*/this.parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
			
			if(this.parametrogeneralsgSessionBean==null) {
				this.parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
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
					this.iNumeroPaginacion=ParametroGeneralSgConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroGeneralSgConstantesFunciones.getClassesForeignKeysOfParametroGeneralSg(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrogeneralsg."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrogeneralsgsAux= new ArrayList<ParametroGeneralSg>();
			
				
			parametrogeneralsgLogic.setDatosCliente(this.datosCliente);
			parametrogeneralsgLogic.setDatosDeep(this.datosDeep);
			parametrogeneralsgLogic.setIsConDeep(true);
			
			
			parametrogeneralsgLogic.getParametroGeneralSgDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrogeneralsgLogic.getTodosParametroGeneralSgs(finalQueryGlobal,pagination);
					
					//parametrogeneralsgLogic.getTodosParametroGeneralSgsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrogeneralsgLogic.getParametroGeneralSgs()==null|| parametrogeneralsgLogic.getParametroGeneralSgs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogeneralsgsAux= new ArrayList<ParametroGeneralSg>();
							parametrogeneralsgsAux.addAll(parametrogeneralsgLogic.getParametroGeneralSgs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralsgsAux= new ArrayList<ParametroGeneralSg>();
							parametrogeneralsgsAux.addAll(parametrogeneralsgs);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogeneralsgLogic.getTodosParametroGeneralSgs(finalQueryGlobal+"",this.pagination);												
							
							//parametrogeneralsgLogic.getTodosParametroGeneralSgsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgLogic.getParametroGeneralSgs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogeneralsgLogic.setParametroGeneralSgs(new ArrayList<ParametroGeneralSg>());					
							parametrogeneralsgLogic.getParametroGeneralSgs().addAll(parametrogeneralsgsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralsgs=new ArrayList<ParametroGeneralSg>();
							parametrogeneralsgs.addAll(parametrogeneralsgsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroGeneralSg=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroGeneralSg=this.idActual;
				
				} else if(this.idParametroGeneralSgActual!=null && this.idParametroGeneralSgActual!=0L) {
					idParametroGeneralSg=idParametroGeneralSgActual;
				}
				
					
				this.sDetalleReporte=ParametroGeneralSgConstantesFunciones.getDetalleIndicePorId(idParametroGeneralSg);
				
				this.parametrogeneralsgs=new ArrayList<ParametroGeneralSg>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrogeneralsgLogic.getEntity(idParametroGeneralSg);
					
					//parametrogeneralsgLogic.getEntityWithConnection(idParametroGeneralSg);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogeneralsgLogic.setParametroGeneralSgs(new ArrayList<ParametroGeneralSg>());
					parametrogeneralsgLogic.getParametroGeneralSgs().add(parametrogeneralsgLogic.getParametroGeneralSg());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogeneralsgs=new ArrayList<ParametroGeneralSg>();
					this.parametrogeneralsgs.add(parametrogeneralsg);
				}
				
				if(parametrogeneralsgLogic.getParametroGeneralSg()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroGeneralSg();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroGeneralSg();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrogeneralsgLogic.getParametroGeneralSgs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogeneralsgs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrogeneralsgLogic.getParametroGeneralSgs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogeneralsgs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroGeneralSg parametrogeneralsg) {
		Boolean permite=true;
		
		if(this.parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroGeneralSgConstantesFunciones.getOrderByListaParametroGeneralSg();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroGeneralSgConstantesFunciones.getOrderByListaParametroGeneralSg();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgLogic.getParametroGeneralSgs()) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneralSg parametrogeneralsg:this.parametrogeneralsgs) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
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
			this.parametrogeneralsgAux=new ParametroGeneralSg();
			this.parametrogeneralsgAux.setsType(Constantes2.S_TOTALES);
			this.parametrogeneralsgAux.setIsNew(false);
			this.parametrogeneralsgAux.setIsChanged(false);
			this.parametrogeneralsgAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroGeneralSgConstantesFunciones.TotalizarValoresFilaParametroGeneralSg(this.parametrogeneralsgLogic.getParametroGeneralSgs(),this.parametrogeneralsgAux);
				
				this.parametrogeneralsgLogic.getParametroGeneralSgs().add(this.parametrogeneralsgAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroGeneralSgConstantesFunciones.TotalizarValoresFilaParametroGeneralSg(this.parametrogeneralsgs,this.parametrogeneralsgAux);
				
				this.parametrogeneralsgs.add(this.parametrogeneralsgAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrogeneralsgTotales=new ParametroGeneralSg();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogeneralsgLogic.getParametroGeneralSgs().remove(parametrogeneralsgTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogeneralsgs.remove(parametrogeneralsgTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrogeneralsgTotales=new ParametroGeneralSg();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgLogic.getParametroGeneralSgs()) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralSgConstantesFunciones.TotalizarValoresFilaParametroGeneralSg(this.parametrogeneralsgLogic.getParametroGeneralSgs(),parametrogeneralsgTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneralSg parametrogeneralsg:this.parametrogeneralsgs) {
				if(parametrogeneralsg.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralsgTotales=parametrogeneralsg;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralSgConstantesFunciones.TotalizarValoresFilaParametroGeneralSg(this.parametrogeneralsgs,parametrogeneralsgTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosParametroGeneralSg() {
		this.isPermisoTodoParametroGeneralSg=false;
		this.isPermisoNuevoParametroGeneralSg=false;
		this.isPermisoActualizarParametroGeneralSg=false;
		this.isPermisoActualizarOriginalParametroGeneralSg=false;
		this.isPermisoEliminarParametroGeneralSg=false;
		this.isPermisoGuardarCambiosParametroGeneralSg=false;
		this.isPermisoConsultaParametroGeneralSg=false;
		this.isPermisoBusquedaParametroGeneralSg=false;
		this.isPermisoReporteParametroGeneralSg=false;		
		this.isPermisoOrdenParametroGeneralSg=false;		
		this.isPermisoPaginacionMedioParametroGeneralSg=false;		
		this.isPermisoPaginacionAltoParametroGeneralSg=false;
		this.isPermisoPaginacionTodoParametroGeneralSg=false;
		this.isPermisoCopiarParametroGeneralSg=false;		
		this.isPermisoVerFormParametroGeneralSg=false;		
		this.isPermisoDuplicarParametroGeneralSg=false;		
		this.isPermisoOrdenParametroGeneralSg=false;		
	}
	
	public void setPermisosUsuarioParametroGeneralSg(Boolean isPermiso) {
		this.isPermisoTodoParametroGeneralSg=isPermiso;
		this.isPermisoNuevoParametroGeneralSg=isPermiso;
		this.isPermisoActualizarParametroGeneralSg=isPermiso;
		this.isPermisoActualizarOriginalParametroGeneralSg=isPermiso;
		this.isPermisoEliminarParametroGeneralSg=isPermiso;
		this.isPermisoGuardarCambiosParametroGeneralSg=isPermiso;
		this.isPermisoConsultaParametroGeneralSg=isPermiso;
		this.isPermisoBusquedaParametroGeneralSg=isPermiso;
		this.isPermisoReporteParametroGeneralSg=isPermiso;
		this.isPermisoOrdenParametroGeneralSg=isPermiso;		
		this.isPermisoPaginacionMedioParametroGeneralSg=isPermiso;		
		this.isPermisoPaginacionAltoParametroGeneralSg=isPermiso;		
		this.isPermisoPaginacionTodoParametroGeneralSg=isPermiso;		
		this.isPermisoCopiarParametroGeneralSg=isPermiso;		
		this.isPermisoVerFormParametroGeneralSg=isPermiso;		
		this.isPermisoDuplicarParametroGeneralSg=isPermiso;
		this.isPermisoOrdenParametroGeneralSg=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroGeneralSg(Boolean isPermiso) {
		//this.isPermisoTodoParametroGeneralSg=isPermiso;
		this.isPermisoNuevoParametroGeneralSg=isPermiso;
		this.isPermisoActualizarParametroGeneralSg=isPermiso;
		this.isPermisoActualizarOriginalParametroGeneralSg=isPermiso;
		this.isPermisoEliminarParametroGeneralSg=isPermiso;
		this.isPermisoGuardarCambiosParametroGeneralSg=isPermiso;
		//this.isPermisoConsultaParametroGeneralSg=isPermiso;
		//this.isPermisoBusquedaParametroGeneralSg=isPermiso;
		//this.isPermisoReporteParametroGeneralSg=isPermiso;
		//this.isPermisoOrdenParametroGeneralSg=isPermiso;		
		//this.isPermisoPaginacionMedioParametroGeneralSg=isPermiso;		
		//this.isPermisoPaginacionAltoParametroGeneralSg=isPermiso;		
		//this.isPermisoPaginacionTodoParametroGeneralSg=isPermiso;		
		//this.isPermisoCopiarParametroGeneralSg=isPermiso;		
		//this.isPermisoDuplicarParametroGeneralSg=isPermiso;
		//this.isPermisoOrdenParametroGeneralSg=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroGeneralSgClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroGeneralSgJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroGeneralSg(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroGeneralSgClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroGeneralSgClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroGeneralSgClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroGeneralSgClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroGeneralSg() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroGeneralSgJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroGeneralSgConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroGeneralSg=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroGeneralSg=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroGeneralSg=this.isPermisoActualizarParametroGeneralSg;
			this.isPermisoEliminarParametroGeneralSg=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroGeneralSg=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroGeneralSg=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroGeneralSg=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroGeneralSg=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroGeneralSg=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroGeneralSg=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroGeneralSg=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroGeneralSg=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroGeneralSg=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroGeneralSg=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroGeneralSg=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroGeneralSg=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroGeneralSg=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroGeneralSg.setToolTipText(this.jTableDatosParametroGeneralSg.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroGeneralSg(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroGeneralSg(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroGeneralSgJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroGeneralSgJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroGeneralSg() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyParametroGeneralSgListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroGeneralSgListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroGeneralSgJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroGeneralSgListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyParametroGeneralSgListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroGeneralSg()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyParametroGeneralSg()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroGeneralSg(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroGeneralSg()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGeneralSg();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroGeneralSg(ParametroGeneralSg parametrogeneralsg)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroGeneralSg()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGeneralSg()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroGeneralSg()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroGeneralSg()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroGeneralSg()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroGeneralSg()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroGeneralSg(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroGeneralSg()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ParametroGeneralSgBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroGeneralSgBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroGeneralSgBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean(); 
		this.parametrogeneralsgConstantesFunciones=new ParametroGeneralSgConstantesFunciones(); 
		this.parametrogeneralsgBean=new ParametroGeneralSg();//(this.parametrogeneralsgConstantesFunciones); 		
		this.parametrogeneralsgReturnGeneral=new ParametroGeneralSgParameterReturnGeneral(); 
		
		this.parametrogeneralsgSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralsgSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroGeneralSgBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroGeneralSgBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroGeneralSgBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroGeneralSg(true);
			
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
			
			this.parametrogeneralsgConstantesFunciones=new ParametroGeneralSgConstantesFunciones(); 
			this.parametrogeneralsgBean=new ParametroGeneralSg();//this.parametrogeneralsgConstantesFunciones); 			
			this.parametrogeneralsgReturnGeneral=new ParametroGeneralSgParameterReturnGeneral(); 
		
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro General Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.parametrogeneralsg=new ParametroGeneralSg();
			this.parametrogeneralsgs = new ArrayList<ParametroGeneralSg>();
			this.parametrogeneralsgsAux = new ArrayList<ParametroGeneralSg>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic=new ParametroGeneralSgLogic();
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrogeneralsgSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrogeneralsgSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroGeneralSg);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroGeneralSg);	
					}
					
					if(this.jInternalFrameImportacionParametroGeneralSg!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroGeneralSg);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroGeneralSg!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroGeneralSg);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroGeneralSg);
				this.jInternalFrameDetalleFormParametroGeneralSg.setVisible(false);
				this.jInternalFrameDetalleFormParametroGeneralSg.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroGeneralSg);
					this.jInternalFrameReporteDinamicoParametroGeneralSg.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroGeneralSg.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroGeneralSg!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroGeneralSg);
					this.jInternalFrameImportacionParametroGeneralSg.setVisible(false);
					this.jInternalFrameImportacionParametroGeneralSg.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroGeneralSg!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroGeneralSg);
					this.jInternalFrameOrderByParametroGeneralSg.setVisible(false);
					this.jInternalFrameOrderByParametroGeneralSg.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroGeneralSgActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroGeneralSgConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrogeneralsgReturnGeneral=new ParametroGeneralSgParameterReturnGeneral();
			
			this.parametrogeneralsgParameterGeneral=new ParametroGeneralSgParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrogeneralsgLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroGeneralSgJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroGeneralSgConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),this.parametrogeneralsgSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroGeneralSgConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),this.parametrogeneralsgSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroGeneralSg=false;
			this.isVisibilidadCeldaDuplicarParametroGeneralSg=true;
			this.isVisibilidadCeldaCopiarParametroGeneralSg=true;
			this.isVisibilidadCeldaVerFormParametroGeneralSg=true;
			this.isVisibilidadCeldaOrdenParametroGeneralSg=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
			this.isVisibilidadCeldaModificarParametroGeneralSg=false;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=false;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroGeneralSg("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroGeneralSg();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroGeneralSg(false);
			
			this.setPermisosUsuarioParametroGeneralSg();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() && this.parametrogeneralsgSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroGeneralSgClasesRelacionadas();
			}
			
			if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroGeneralSgClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroGeneralSg();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroGeneralSg();
			}
			
			if(!this.isPermisoBusquedaParametroGeneralSg) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroGeneralSg,this.isPermisoPaginacionMedioParametroGeneralSg,this.isPermisoPaginacionTodoParametroGeneralSg);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroGeneralSgConstantesFunciones.getTiposSeleccionarParametroGeneralSg());
				
				this.tiposColumnasSelect=ParametroGeneralSgConstantesFunciones.getTiposSeleccionarParametroGeneralSg(true);
				
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
			//if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroGeneralSg();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,true,false);
				this.setAccionesUsuarioParametroGeneralSg(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,true,false);							
				this.setAccionesUsuarioParametroGeneralSg(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneralSg() ;
			
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
				parametrogeneralsgImplementable= (ParametroGeneralSgImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroGeneralSgConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrogeneralsgImplementableHome= (ParametroGeneralSgImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroGeneralSgConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrogeneralsgs= new ArrayList<ParametroGeneralSg>();
			this.parametrogeneralsgsEliminados= new ArrayList<ParametroGeneralSg>();
						
			this.isEsNuevoParametroGeneralSg=false;
			this.esParaAccionDesdeFormularioParametroGeneralSg=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroGeneralSg(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroGeneralSg();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroGeneralSgConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroGeneralSg("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroGeneralSg(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroGeneralSg();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroGeneralSg();
			}
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroGeneralSg(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroGeneralSg: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroGeneralSg() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroGeneralSg")) {
				iIndex=this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroGeneralSg();	
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
	
	public void cargarCombosForeignKeyParametroGeneralSg(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroGeneralSg(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroGeneralSg(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroGeneralSgListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroGeneralSg();
		
		this.cargarCombosFrameForeignKeyParametroGeneralSg();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroGeneralSg();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroGeneralSg();
		}
	}
	
	
	
	public void jButtonNuevoParametroGeneralSgActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
			
			if(jTableDatosParametroGeneralSg.getRowCount()>=1) {
				jTableDatosParametroGeneralSg.removeRowSelectionInterval(0, jTableDatosParametroGeneralSg.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroGeneralSg=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroGeneralSg(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroGeneralSg(true);			
			//this.parametrogeneralsg=new ParametroGeneralSg();
			//this.parametrogeneralsg.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGeneralSg(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneralSg() ;
			
			if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGeneralSg(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrogeneralsg);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);				
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
			if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroGeneralSg: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroGeneralSgActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroGeneralSg.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroGeneralSg.getSelectedRows().length;			
			}
			
			parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroGeneralSg--;			
				//ParametroGeneralSg parametrogeneralsgAux= new ParametroGeneralSg();			
				//parametrogeneralsgAux.setId(this.iIdNuevoParametroGeneralSg);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroGeneralSg parametrogeneralsgOrigen=new ParametroGeneralSg();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroGeneralSg parametrogeneralsgOrigen : parametrogeneralsgsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrogeneralsgOrigen =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralsgOrigen =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroGeneralSg();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrogeneralsg.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroGeneralSg(parametrogeneralsgOrigen,this.parametrogeneralsg,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrogeneralsgLogic.getParametroGeneralSgs().add(this.parametrogeneralsgAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsgs.add(this.parametrogeneralsgAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroGeneralSg(false);
				
				this.jTableDatosParametroGeneralSg.setRowSelectionInterval(this.getIndiceNuevoParametroGeneralSg(), this.getIndiceNuevoParametroGeneralSg());
				
				int iLastRow =  this.jTableDatosParametroGeneralSg.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroGeneralSg.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroGeneralSg.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGeneralSg(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();									
		
			ParametroGeneralSg parametrogeneralsgOrigen=new ParametroGeneralSg();
			ParametroGeneralSg parametrogeneralsgDestino=new ParametroGeneralSg();
				
			parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroGeneralSg.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrogeneralsgsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroGeneralSg.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsgOrigen =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrogeneralsgOrigen =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsgDestino =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrogeneralsgDestino =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrogeneralsgOrigen =parametrogeneralsgsSeleccionados.get(0);
				parametrogeneralsgDestino =parametrogeneralsgsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroGeneralSg(parametrogeneralsgOrigen,parametrogeneralsgDestino,true,false);
				
				parametrogeneralsgDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrogeneralsgDestino,parametrogeneralsgLogic.getParametroGeneralSgs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralsgDestino,parametrogeneralsgs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroGeneralSg(false);
				
				//this.jTableDatosParametroGeneralSg.setRowSelectionInterval(this.getIndiceNuevoParametroGeneralSg(), this.getIndiceNuevoParametroGeneralSg());
				
				int iLastRow =  this.jTableDatosParametroGeneralSg.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroGeneralSg.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroGeneralSg.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGeneralSg(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroGeneralSg.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroGeneralSg.isVisible();
			
			
			this.jPanelParametrosReportesParametroGeneralSg.setVisible(!isVisible);
			this.jPanelPaginacionParametroGeneralSg.setVisible(!isVisible);
			this.jPanelAccionesParametroGeneralSg.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroGeneralSg();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroGeneralSg();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroGeneralSg();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroGeneralSg();
			
			this.abrirFrameOrderByParametroGeneralSg();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroGeneralSg();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroGeneralSg(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroGeneralSg);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroGeneralSg.isMaximum()) {
					this.jInternalFrameDetalleFormParametroGeneralSg.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroGeneralSg.setSize(this.jInternalFrameDetalleFormParametroGeneralSg.iWidthFormulario,this.jInternalFrameDetalleFormParametroGeneralSg.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroGeneralSg.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroGeneralSg.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroGeneralSg.isMaximum()) {
						this.jInternalFrameDetalleFormParametroGeneralSg.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroGeneralSg.jContentPaneDetalleParametroGeneralSg.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroGeneralSg.jContentPaneDetalleParametroGeneralSg.getWidth(),ParametroGeneralSgConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroGeneralSg.jContentPaneDetalleParametroGeneralSg.getWidth(),ParametroGeneralSgConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroGeneralSg.jContentPaneDetalleParametroGeneralSg.getWidth(),ParametroGeneralSgConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroGeneralSg.setVisible(true);
	        this.jInternalFrameDetalleFormParametroGeneralSg.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroGeneralSg() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroGeneralSg==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroGeneralSg=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneralSg,false,this);
				} else {
					this.jInternalFrameOrderByParametroGeneralSg=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneralSg,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroGeneralSg);
				this.jInternalFrameOrderByParametroGeneralSg.setVisible(false);
				this.jInternalFrameOrderByParametroGeneralSg.setSelected(false);
				
				this.jInternalFrameOrderByParametroGeneralSg.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroGeneralSg"));
				
				this.inicializarActualizarBindingTablaOrderByParametroGeneralSg();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroGeneralSg() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroGeneralSg==null) {
				
				this.jInternalFrameImportacionParametroGeneralSg=new ImportacionJInternalFrame(ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroGeneralSg);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroGeneralSg);
				this.jInternalFrameImportacionParametroGeneralSg.setVisible(false);
				this.jInternalFrameImportacionParametroGeneralSg.setSelected(false);


				this.jInternalFrameImportacionParametroGeneralSg.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroGeneralSg"));
				this.jInternalFrameImportacionParametroGeneralSg.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroGeneralSg"));
				this.jInternalFrameImportacionParametroGeneralSg.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroGeneralSg"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroGeneralSg() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroGeneralSg==null) {
				this.jInternalFrameReporteDinamicoParametroGeneralSg=new ReporteDinamicoJInternalFrame(ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroGeneralSg);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroGeneralSg);
				this.jInternalFrameReporteDinamicoParametroGeneralSg.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroGeneralSg.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGeneralSg"));
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGeneralSg"));
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGeneralSg"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGeneralSg();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleParametroGeneralSg() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroGeneralSg);
			
	       	this.jInternalFrameDetalleFormParametroGeneralSg.setVisible(false);
	        this.jInternalFrameDetalleFormParametroGeneralSg.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroGeneralSg.dispose();
			//this.jInternalFrameDetalleFormParametroGeneralSg=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroGeneralSg() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroGeneralSg.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroGeneralSg.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroGeneralSg() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroGeneralSg.setVisible(true);
	        this.jInternalFrameImportacionParametroGeneralSg.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroGeneralSg() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroGeneralSg.setVisible(true);
	        this.jInternalFrameOrderByParametroGeneralSg.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroGeneralSg() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroGeneralSg.setVisible(false);
	        this.jInternalFrameOrderByParametroGeneralSg.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroGeneralSg() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroGeneralSg.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroGeneralSg.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroGeneralSg() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroGeneralSg.setVisible(false);
	        this.jInternalFrameImportacionParametroGeneralSg.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroGeneralSg(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroGeneralSg(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroGeneralSg(true);
			//this.isEsNuevoParametroGeneralSg=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroGeneralSg("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGeneralSg(false) ;
			
			if(parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGeneralSg(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneralSg(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroGeneralSgActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroGeneralSg(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroGeneralSg(true);
			//this.isEsNuevoParametroGeneralSg=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrogeneralsg.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroGeneralSg("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroGeneralSg(false) ;
			
			if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGeneralSg(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneralSg(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroGeneralSg(false);
			
			//if(!this.isEsNuevoParametroGeneralSg) {								
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				
			}
			
			if(this.permiteMantenimiento(this.parametrogeneralsg)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroGeneralSg=true;
					this.inicializarActualizarBindingTablaParametroGeneralSg(false);
					this.isEsNuevoParametroGeneralSg=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroGeneralSg=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroGeneralSg=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroGeneralSg(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGeneralSg(false);
				
				this.habilitarDeshabilitarControlesParametroGeneralSg(false);
			
												
				
				if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroGeneralSg();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroGeneralSgActionPerformed(evt,parametrogeneralsgSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroGeneralSg(this.parametrogeneralsg,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroGeneralSg.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrogeneralsgSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrogeneralsg.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				this.parametrogeneralsg.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				this.parametrogeneralsg.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrogeneralsg)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroGeneralSgModel) this.jTableDatosParametroGeneralSg.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroGeneralSg=true;
				this.inicializarActualizarBindingTablaParametroGeneralSg(false);
				this.isEsNuevoParametroGeneralSg=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroGeneralSg(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGeneralSg(false);
				
				this.habilitarDeshabilitarControlesParametroGeneralSg(false);
				
				
				
				if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroGeneralSg();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroGeneralSg.getRowCount()>=1) {
				jTableDatosParametroGeneralSg.removeRowSelectionInterval(0, jTableDatosParametroGeneralSg.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroGeneralSg(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroGeneralSg(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGeneralSg(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneralSg(false) ;
			
			this.isEsNuevoParametroGeneralSg=false;
			
			if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroGeneralSg();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroGeneralSg(false);
				
				//SI ES MANUAL
				if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroGeneralSg();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroGeneralSg--;			
			//ParametroGeneralSg parametrogeneralsgAux= new ParametroGeneralSg();			
			//parametrogeneralsgAux.setId(this.iIdNuevoParametroGeneralSg);
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroGeneralSg();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
			
			this.parametrogeneralsg.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrogeneralsgLogic.getParametroGeneralSgs().add(this.parametrogeneralsgAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrogeneralsgs.add(this.parametrogeneralsgAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroGeneralSg(false);
			
			this.jTableDatosParametroGeneralSg.setRowSelectionInterval(this.getIndiceNuevoParametroGeneralSg(), this.getIndiceNuevoParametroGeneralSg());
			
			int iLastRow =  this.jTableDatosParametroGeneralSg.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroGeneralSg.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroGeneralSg.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroGeneralSg(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroGeneralSg(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneralSg(false);
			
			//SI ES MANUAL
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGeneralSg();
			}
			
			//this.abrirFrameTreeParametroGeneralSg();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro GeneralES ?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroGeneralSg.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroGeneralSg();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrogeneralsgReturnGeneral=parametrogeneralsgLogic.procesarImportacionParametroGeneralSgsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrogeneralsgParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroGeneralSgReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroGeneralSg.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroGeneralSg.setFileImportacion(this.jInternalFrameImportacionParametroGeneralSg.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroGeneralSg.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroGeneralSg.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroGeneralSg.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroGeneralSg.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		

		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroGeneralSgBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroGeneralSgBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSimpleSistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSimpleSistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSimpleSistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSimpleSistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rsionSistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rsionSistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rsionSistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rsionSistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glasSistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glasSistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glasSistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glasSistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ilSistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ilSistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ilSistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ilSistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoSistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoSistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoSistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoSistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_xSistema_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_xSistema_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_xSistema_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_xSistema_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presentanteNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presentanteNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presentanteNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presentanteNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProcesoActualizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProcesoActualizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProcesoActualizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProcesoActualizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroGeneralSg.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA:
					sNombreCampoCategoria="nombre_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA:
					sNombreCampoCategoria="nombre_simple_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoria="nombre_empresa";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA:
					sNombreCampoCategoria="version_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA:
					sNombreCampoCategoria="siglas_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA:
					sNombreCampoCategoria="mail_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA:
					sNombreCampoCategoria="telefono_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA:
					sNombreCampoCategoria="fax_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					sNombreCampoCategoria="representante_nombre";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION:
					sNombreCampoCategoria="codigo_proceso_actualizacion";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA:
					sNombreCampoCategoriaValor="nombre_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA:
					sNombreCampoCategoriaValor="nombre_simple_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoriaValor="nombre_empresa";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA:
					sNombreCampoCategoriaValor="version_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA:
					sNombreCampoCategoriaValor="siglas_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA:
					sNombreCampoCategoriaValor="mail_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA:
					sNombreCampoCategoriaValor="telefono_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA:
					sNombreCampoCategoriaValor="fax_sistema";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					sNombreCampoCategoriaValor="representante_nombre";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION:
					sNombreCampoCategoriaValor="codigo_proceso_actualizacion";
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sistema");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Simple Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_simple_sistema");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_empresa");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Version Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"version_sistema");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas_sistema");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mail Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mail_sistema");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_sistema");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fax Sistema",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fax_sistema");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Representante Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"representante_nombre");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Proceso Actualizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_proceso_actualizacion");
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroGeneralSgs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getnombre_sistema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getnombre_simple_sistema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getnombre_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getversion_sistema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getsiglas_sistema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getmail_sistema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.gettelefono_sistema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getfax_sistema());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getrepresentante_nombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getcodigo_proceso_actualizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(ParametroGeneralSg parametrogeneralsg:parametrogeneralsgsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneralsg.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelParametroGeneralSg(row);				
			//	iRow++;
			//}				
			
			//for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroGeneralSg(parametrogeneralsgAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneralSg(false);
			
			//SI ES MANUAL
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGeneralSg();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneralSg(false);
			
			//SI ES MANUAL
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroGeneralSg();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroGeneralSgActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneralSg(false);
			
			//SI ES MANUAL
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroGeneralSg();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralsgLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroGeneralSg() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroGeneralSg.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroGeneralSg.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroGeneralSg.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroGeneralSg.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroGeneralSg.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroGeneralSg.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroGeneralSg.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroGeneralSg(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroGeneralSg(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroGeneralSg(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroGeneralSg(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroGeneralSg(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroGeneralSg(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneralSg(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroGeneralSg(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroGeneralSg() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroGeneralSg();
		
		this.inicializarActualizarBindingBotonesManualParametroGeneralSg(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroGeneralSg();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneralSg() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGeneralSg(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGeneralSg(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroGeneralSg.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroGeneralSg.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroGeneralSg.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxPostAccionNuevoParametroGeneralSg.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxPostAccionSinCerrarParametroGeneralSg.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxPostAccionSinMensajeParametroGeneralSg.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroGeneralSg.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroGeneralSg.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroGeneralSg.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
				this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxPostAccionNuevoParametroGeneralSg.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxPostAccionSinCerrarParametroGeneralSg.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxPostAccionSinMensajeParametroGeneralSg.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroGeneralSg.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroGeneralSg.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroGeneralSg.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroGeneralSg.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroGeneralSg.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroGeneralSg.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroGeneralSg.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroGeneralSg.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroGeneralSg.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroGeneralSg(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGeneralSg(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneralSg() throws Exception {
		try	{
			if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroGeneralSg();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroGeneralSg() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroGeneralSg() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroGeneralSg.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroGeneralSg.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroGeneralSg.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroGeneralSg.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroGeneralSg.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroGeneralSg.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroGeneralSg.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroGeneralSg.addItem(reporte);
			}
			
			
			if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroGeneralSg.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroGeneralSg.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroGeneralSg.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroGeneralSg.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroGeneralSg.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroGeneralSg.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroGeneralSg.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroGeneralSg.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroGeneralSg.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGeneralSg();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGeneralSg() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ParametroGeneralSgConstantesFunciones.getTiposSeleccionarParametroGeneralSg(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ParametroGeneralSgConstantesFunciones.getTiposSeleccionarParametroGeneralSg(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ParametroGeneralSgConstantesFunciones.getTiposSeleccionarParametroGeneralSg(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoParametroGeneralSg.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroGeneralSg()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroGeneralSg(Boolean esInicializar) throws Exception {				
		if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroGeneralSg();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroGeneralSg() throws Exception {
		this.inicializarActualizarBindingTablaParametroGeneralSg(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroGeneralSg() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroGeneralSgOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSgOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroGeneralSg(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrogeneralsgLogic.getParametroGeneralSgs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrogeneralsgs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroGeneralSg.setModel(new ParametroGeneralSgModel(this.parametrogeneralsgLogic.getParametroGeneralSgs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroGeneralSg.setModel(new ParametroGeneralSgModel(this.parametrogeneralsgs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroGeneralSg!=null && this.jInternalFrameOrderByParametroGeneralSg.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroGeneralSg();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO,parametrogeneralsgConstantesFunciones.resaltarSeleccionarParametroGeneralSg,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO,parametrogeneralsgConstantesFunciones.resaltarSeleccionarParametroGeneralSg,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_ID));

		if(this.parametrogeneralsgConstantesFunciones.mostraridParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrogeneralsgConstantesFunciones.resaltaridParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activaridParametroGeneralSg,iSizeTabla,this,true,"idParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltaridParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activaridParametroGeneralSg,this,true,"idParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA));

		if(this.parametrogeneralsgConstantesFunciones.mostrarnombre_sistemaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarnombre_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarnombre_sistemaParametroGeneralSg,iSizeTabla,this,true,"nombre_sistemaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarnombre_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarnombre_sistemaParametroGeneralSg,this,true,"nombre_sistemaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA));

		if(this.parametrogeneralsgConstantesFunciones.mostrarnombre_simple_sistemaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarnombre_simple_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarnombre_simple_sistemaParametroGeneralSg,iSizeTabla,this,true,"nombre_simple_sistemaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarnombre_simple_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarnombre_simple_sistemaParametroGeneralSg,this,true,"nombre_simple_sistemaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA));

		if(this.parametrogeneralsgConstantesFunciones.mostrarnombre_empresaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarnombre_empresaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarnombre_empresaParametroGeneralSg,iSizeTabla,this,true,"nombre_empresaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarnombre_empresaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarnombre_empresaParametroGeneralSg,this,true,"nombre_empresaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA));

		if(this.parametrogeneralsgConstantesFunciones.mostrarversion_sistemaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrogeneralsgConstantesFunciones.resaltarversion_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarversion_sistemaParametroGeneralSg,iSizeTabla,this,true,"version_sistemaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarversion_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarversion_sistemaParametroGeneralSg,this,true,"version_sistemaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA));

		if(this.parametrogeneralsgConstantesFunciones.mostrarsiglas_sistemaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarsiglas_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarsiglas_sistemaParametroGeneralSg,iSizeTabla,this,true,"siglas_sistemaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarsiglas_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarsiglas_sistemaParametroGeneralSg,this,true,"siglas_sistemaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA));

		if(this.parametrogeneralsgConstantesFunciones.mostrarmail_sistemaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarmail_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarmail_sistemaParametroGeneralSg,iSizeTabla,this,true,"mail_sistemaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarmail_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarmail_sistemaParametroGeneralSg,this,true,"mail_sistemaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA));

		if(this.parametrogeneralsgConstantesFunciones.mostrartelefono_sistemaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltartelefono_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activartelefono_sistemaParametroGeneralSg,iSizeTabla,this,true,"telefono_sistemaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltartelefono_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activartelefono_sistemaParametroGeneralSg,this,true,"telefono_sistemaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA));

		if(this.parametrogeneralsgConstantesFunciones.mostrarfax_sistemaParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarfax_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarfax_sistemaParametroGeneralSg,iSizeTabla,this,true,"fax_sistemaParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarfax_sistemaParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarfax_sistemaParametroGeneralSg,this,true,"fax_sistemaParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE));

		if(this.parametrogeneralsgConstantesFunciones.mostrarrepresentante_nombreParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarrepresentante_nombreParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarrepresentante_nombreParametroGeneralSg,iSizeTabla,this,true,"representante_nombreParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarrepresentante_nombreParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarrepresentante_nombreParametroGeneralSg,this,true,"representante_nombreParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION));

		if(this.parametrogeneralsgConstantesFunciones.mostrarcodigo_proceso_actualizacionParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralsgConstantesFunciones.resaltarcodigo_proceso_actualizacionParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarcodigo_proceso_actualizacionParametroGeneralSg,iSizeTabla,this,true,"codigo_proceso_actualizacionParametroGeneralSg","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltarcodigo_proceso_actualizacionParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activarcodigo_proceso_actualizacionParametroGeneralSg,this,true,"codigo_proceso_actualizacionParametroGeneralSg","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.parametrogeneralsgConstantesFunciones.mostraresta_activoParametroGeneralSg && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrogeneralsgConstantesFunciones.resaltaresta_activoParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activaresta_activoParametroGeneralSg,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrogeneralsgConstantesFunciones.resaltaresta_activoParametroGeneralSg,this.parametrogeneralsgConstantesFunciones.activaresta_activoParametroGeneralSg,this,true,"esta_activoParametroGeneralSg","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroGeneralSgPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroGeneralSg.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroGeneralSg.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroGeneralSg.addColumn(tableColumn);
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
			
			this.jTableDatosParametroGeneralSg.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroGeneralSg.moveColumn(this.jTableDatosParametroGeneralSg.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroGeneralSg.moveColumn(this.jTableDatosParametroGeneralSg.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroGeneralSg.moveColumn(this.jTableDatosParametroGeneralSg.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroGeneralSg.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroGeneralSg.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroGeneralSg,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroGeneralSg.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroGeneralSg.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroGeneralSg.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroGeneralSg.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrogeneralsgLogic.getParametroGeneralSgs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrogeneralsgs.size()-1;
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
		//this.jTableDatosParametroGeneralSg.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroGeneralSg.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroGeneralSg();
			
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
				
				//this.isEsNuevoParametroGeneralSg=false;
					
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
				if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroGeneralSg==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroGeneralSg.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroGeneralSg.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrogeneralsg.getsType().equals("DUPLICADO")
				   || this.parametrogeneralsg.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroGeneralSg=true;
				
				} else {
					this.isEsNuevoParametroGeneralSg=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrogeneralsg.getId()>=0 && !this.parametrogeneralsg.getIsNew()) {						
						this.isEsNuevoParametroGeneralSg=false;
						
					} else {
						this.isEsNuevoParametroGeneralSg=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroGeneralSg(esRelaciones);						
				
				this.seleccionarParametroGeneralSg(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrogeneralsg.getId()<0) {
					this.isEsNuevoParametroGeneralSg=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroGeneralSg(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroGeneralSg(evt,rowIndex);
				}	
				
				if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroGeneralSg: " + this.dDif); 
					}
				}								
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroGeneralSg(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrogeneralsg)) {
					if(this.parametrogeneralsg.getId()>0) {
						this.parametrogeneralsg.setIsDeleted(true);
						
						this.parametrogeneralsgsEliminados.add(this.parametrogeneralsg);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrogeneralsgLogic.getParametroGeneralSgs().remove(this.parametrogeneralsg);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsgs.remove(this.parametrogeneralsg);				
					}
					
					
					((ParametroGeneralSgModel) this.jTableDatosParametroGeneralSg.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGeneralSg(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroGeneralSg(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroGeneralSg) {
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroGeneralSg.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroGeneralSg.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroGeneralSg(this.parametrogeneralsg);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroGeneralSg("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroGeneralSg(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGeneralSg() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroGeneralSg(ParametroGeneralSg parametrogeneralsg) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroGeneralSg(parametrogeneralsg,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroGeneralSg(parametrogeneralsg);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroGeneralSg(parametrogeneralsg,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneralSg(parametrogeneralsg);
	}
	
	public void setVariablesObjetoActualToFormularioParametroGeneralSg(ParametroGeneralSg parametrogeneralsg) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.setText(parametrogeneralsg.getId().toString());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.setText(parametrogeneralsg.getnombre_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.setText(parametrogeneralsg.getnombre_simple_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.setText(parametrogeneralsg.getnombre_empresa());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.setText(parametrogeneralsg.getversion_sistema().toString());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.setText(parametrogeneralsg.getsiglas_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.setText(parametrogeneralsg.getmail_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.setText(parametrogeneralsg.gettelefono_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.setText(parametrogeneralsg.getfax_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.setText(parametrogeneralsg.getrepresentante_nombre());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setText(parametrogeneralsg.getcodigo_proceso_actualizacion());
			this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setSelected(parametrogeneralsg.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroGeneralSg parametrogeneralsgLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrogeneralsgLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroGeneralSg parametrogeneralsgLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrogeneralsgLocal=this.parametrogeneralsg;
			} else {
				parametrogeneralsgLocal=this.parametrogeneralsgAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrogeneralsgLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroGeneralSg(parametrogeneralsgLocal,true);
					
					if(parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrogeneralsgLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrogeneralsgLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroGeneralSg(parametrogeneralsg,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(parametrogeneralsg);
	}
	
	public void setVariablesFormularioToObjetoActualParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroGeneralSg(parametrogeneralsg,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.getText()==null || this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.getText()=="" || this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.setText("0");
			}

			if(conColumnasBase) {parametrogeneralsg.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelIdParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setnombre_sistema(this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_sistemaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setnombre_simple_sistema(this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_simple_sistemaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setnombre_empresa(this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelnombre_empresaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setversion_sistema(Double.parseDouble(this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelversion_sistemaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setsiglas_sistema(this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelsiglas_sistemaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setmail_sistema(this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelmail_sistemaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.settelefono_sistema(this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabeltelefono_sistemaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setfax_sistema(this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelfax_sistemaParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setrepresentante_nombre(this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelrepresentante_nombreParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setcodigo_proceso_actualizacion(this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelcodigo_proceso_actualizacionParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneralsg.setesta_activo(this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneralSg.jLabelesta_activoParametroGeneralSg,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroGeneralSg(ParametroGeneralSg parametrogeneralsgBean,ParametroGeneralSg parametrogeneralsg,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroGeneralSg(ParametroGeneralSg parametrogeneralsgOrigen,ParametroGeneralSg parametrogeneralsg,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogeneralsgOrigen.getId()!=null && !parametrogeneralsgOrigen.getId().equals(0L))) {parametrogeneralsg.setId(parametrogeneralsgOrigen.getId());}}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getnombre_sistema()!=null && !parametrogeneralsgOrigen.getnombre_sistema().equals(""))) {parametrogeneralsg.setnombre_sistema(parametrogeneralsgOrigen.getnombre_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getnombre_simple_sistema()!=null && !parametrogeneralsgOrigen.getnombre_simple_sistema().equals(""))) {parametrogeneralsg.setnombre_simple_sistema(parametrogeneralsgOrigen.getnombre_simple_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getnombre_empresa()!=null && !parametrogeneralsgOrigen.getnombre_empresa().equals(""))) {parametrogeneralsg.setnombre_empresa(parametrogeneralsgOrigen.getnombre_empresa());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getversion_sistema()!=null && !parametrogeneralsgOrigen.getversion_sistema().equals(0.0))) {parametrogeneralsg.setversion_sistema(parametrogeneralsgOrigen.getversion_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getsiglas_sistema()!=null && !parametrogeneralsgOrigen.getsiglas_sistema().equals(""))) {parametrogeneralsg.setsiglas_sistema(parametrogeneralsgOrigen.getsiglas_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getmail_sistema()!=null && !parametrogeneralsgOrigen.getmail_sistema().equals(""))) {parametrogeneralsg.setmail_sistema(parametrogeneralsgOrigen.getmail_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.gettelefono_sistema()!=null && !parametrogeneralsgOrigen.gettelefono_sistema().equals(""))) {parametrogeneralsg.settelefono_sistema(parametrogeneralsgOrigen.gettelefono_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getfax_sistema()!=null && !parametrogeneralsgOrigen.getfax_sistema().equals(""))) {parametrogeneralsg.setfax_sistema(parametrogeneralsgOrigen.getfax_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getrepresentante_nombre()!=null && !parametrogeneralsgOrigen.getrepresentante_nombre().equals(""))) {parametrogeneralsg.setrepresentante_nombre(parametrogeneralsgOrigen.getrepresentante_nombre());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getcodigo_proceso_actualizacion()!=null && !parametrogeneralsgOrigen.getcodigo_proceso_actualizacion().equals(""))) {parametrogeneralsg.setcodigo_proceso_actualizacion(parametrogeneralsgOrigen.getcodigo_proceso_actualizacion());}
			if(conDefault || (!conDefault && parametrogeneralsgOrigen.getesta_activo()!=null && !parametrogeneralsgOrigen.getesta_activo().equals(false))) {parametrogeneralsg.setesta_activo(parametrogeneralsgOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroGeneralSg(ParametroGeneralSg parametrogeneralsg) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.setText(parametrogeneralsg.getId().toString());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.setText(parametrogeneralsg.getnombre_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.setText(parametrogeneralsg.getnombre_simple_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.setText(parametrogeneralsg.getnombre_empresa());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.setText(parametrogeneralsg.getversion_sistema().toString());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.setText(parametrogeneralsg.getsiglas_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.setText(parametrogeneralsg.getmail_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.setText(parametrogeneralsg.gettelefono_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.setText(parametrogeneralsg.getfax_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.setText(parametrogeneralsg.getrepresentante_nombre());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setText(parametrogeneralsg.getcodigo_proceso_actualizacion());
			this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setSelected(parametrogeneralsg.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroGeneralSg(ParametroGeneralSgBean parametrogeneralsgBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.setText(parametrogeneralsgBean.getId().toString());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.setText(parametrogeneralsgBean.getnombre_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.setText(parametrogeneralsgBean.getnombre_simple_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.setText(parametrogeneralsgBean.getnombre_empresa());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.setText(parametrogeneralsgBean.getversion_sistema().toString());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.setText(parametrogeneralsgBean.getsiglas_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.setText(parametrogeneralsgBean.getmail_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.setText(parametrogeneralsgBean.gettelefono_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.setText(parametrogeneralsgBean.getfax_sistema());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.setText(parametrogeneralsgBean.getrepresentante_nombre());
			this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setText(parametrogeneralsgBean.getcodigo_proceso_actualizacion());
			this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setSelected(parametrogeneralsgBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroGeneralSg(ParametroGeneralSgParameterReturnGeneral parametrogeneralsgReturnGeneral,ParametroGeneralSgBean parametrogeneralsgBean,Boolean conDefault) throws Exception { 
		try {
			ParametroGeneralSg parametrogeneralsgLocal=new ParametroGeneralSg();
			
			parametrogeneralsgLocal=parametrogeneralsgReturnGeneral.getParametroGeneralSg();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogeneralsgLocal.getId()!=null && !parametrogeneralsgLocal.getId().equals(0L))) {parametrogeneralsgBean.setId(parametrogeneralsgLocal.getId());}}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getnombre_sistema()!=null && !parametrogeneralsgLocal.getnombre_sistema().equals(""))) {parametrogeneralsgBean.setnombre_sistema(parametrogeneralsgLocal.getnombre_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getnombre_simple_sistema()!=null && !parametrogeneralsgLocal.getnombre_simple_sistema().equals(""))) {parametrogeneralsgBean.setnombre_simple_sistema(parametrogeneralsgLocal.getnombre_simple_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getnombre_empresa()!=null && !parametrogeneralsgLocal.getnombre_empresa().equals(""))) {parametrogeneralsgBean.setnombre_empresa(parametrogeneralsgLocal.getnombre_empresa());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getversion_sistema()!=null && !parametrogeneralsgLocal.getversion_sistema().equals(0.0))) {parametrogeneralsgBean.setversion_sistema(parametrogeneralsgLocal.getversion_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getsiglas_sistema()!=null && !parametrogeneralsgLocal.getsiglas_sistema().equals(""))) {parametrogeneralsgBean.setsiglas_sistema(parametrogeneralsgLocal.getsiglas_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getmail_sistema()!=null && !parametrogeneralsgLocal.getmail_sistema().equals(""))) {parametrogeneralsgBean.setmail_sistema(parametrogeneralsgLocal.getmail_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.gettelefono_sistema()!=null && !parametrogeneralsgLocal.gettelefono_sistema().equals(""))) {parametrogeneralsgBean.settelefono_sistema(parametrogeneralsgLocal.gettelefono_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getfax_sistema()!=null && !parametrogeneralsgLocal.getfax_sistema().equals(""))) {parametrogeneralsgBean.setfax_sistema(parametrogeneralsgLocal.getfax_sistema());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getrepresentante_nombre()!=null && !parametrogeneralsgLocal.getrepresentante_nombre().equals(""))) {parametrogeneralsgBean.setrepresentante_nombre(parametrogeneralsgLocal.getrepresentante_nombre());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getcodigo_proceso_actualizacion()!=null && !parametrogeneralsgLocal.getcodigo_proceso_actualizacion().equals(""))) {parametrogeneralsgBean.setcodigo_proceso_actualizacion(parametrogeneralsgLocal.getcodigo_proceso_actualizacion());}
			if(conDefault || (!conDefault && parametrogeneralsgLocal.getesta_activo()!=null && !parametrogeneralsgLocal.getesta_activo().equals(false))) {parametrogeneralsgBean.setesta_activo(parametrogeneralsgLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroGeneralSgGenerico(Long idParametroGeneralSgSeleccionado,JComboBox jComboBoxParametroGeneralSg,List<ParametroGeneralSg> parametrogeneralsgsLocal)throws Exception {
		try {
			ParametroGeneralSg  parametrogeneralsgTemp=null;

			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsLocal) {
				if(parametrogeneralsgAux.getId()!=null && parametrogeneralsgAux.getId().equals(idParametroGeneralSgSeleccionado)) {
					parametrogeneralsgTemp=parametrogeneralsgAux;
					break;
				}
			}

			jComboBoxParametroGeneralSg.setSelectedItem(parametrogeneralsgTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroGeneralSgGenerico(JComboBox jComboBoxParametroGeneralSg,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneralSg.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroGeneralSg.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneralSg.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroGeneralSg.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogeneralsg=(ParametroGeneralSg) parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrogeneralsg =(ParametroGeneralSg) parametrogeneralsgs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroGeneralSg parametrogeneralsgRow=new ParametroGeneralSg();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogeneralsgRow=(ParametroGeneralSg) parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrogeneralsgRow=(ParametroGeneralSg) parametrogeneralsgs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroGeneralSg(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg));			
			this.jButtonDuplicarParametroGeneralSg.setVisible((this.isVisibilidadCeldaDuplicarParametroGeneralSg && this.isPermisoDuplicarParametroGeneralSg));			
			this.jButtonCopiarParametroGeneralSg.setVisible((this.isVisibilidadCeldaCopiarParametroGeneralSg && this.isPermisoCopiarParametroGeneralSg));
			this.jButtonVerFormParametroGeneralSg.setVisible((this.isVisibilidadCeldaVerFormParametroGeneralSg && this.isPermisoVerFormParametroGeneralSg));
			
			this.jButtonAbrirOrderByParametroGeneralSg.setVisible((this.isVisibilidadCeldaOrdenParametroGeneralSg && this.isPermisoOrdenParametroGeneralSg));			
			
			this.jButtonNuevoRelacionesParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg));			
			this.jButtonNuevoGuardarCambiosParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarParametroGeneralSg.setVisible((this.isVisibilidadCeldaModificarParametroGeneralSg && this.isPermisoActualizarParametroGeneralSg));	
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarParametroGeneralSg.setVisible((this.isVisibilidadCeldaActualizarParametroGeneralSg && this.isPermisoActualizarParametroGeneralSg));	
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarParametroGeneralSg.setVisible((this.isVisibilidadCeldaEliminarParametroGeneralSg && this.isPermisoEliminarParametroGeneralSg));
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarParametroGeneralSg.setVisible(this.isVisibilidadCeldaCancelarParametroGeneralSg);							
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.setVisible((this.isVisibilidadCeldaGuardarParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroGeneralSg.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg));						
			this.jButtonDuplicarToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaDuplicarParametroGeneralSg && this.isPermisoDuplicarParametroGeneralSg));						
			this.jButtonCopiarToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaCopiarParametroGeneralSg && this.isPermisoCopiarParametroGeneralSg));			
			this.jButtonVerFormToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaVerFormParametroGeneralSg && this.isPermisoVerFormParametroGeneralSg));			
			this.jButtonAbrirOrderByToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaOrdenParametroGeneralSg && this.isPermisoOrdenParametroGeneralSg));
			this.jButtonNuevoRelacionesToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg));			
			this.jButtonNuevoGuardarCambiosToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));			
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaModificarParametroGeneralSg && this.isPermisoActualizarParametroGeneralSg));	
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaActualizarParametroGeneralSg  && this.isPermisoActualizarParametroGeneralSg));	
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaEliminarParametroGeneralSg && this.isPermisoEliminarParametroGeneralSg));
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarToolBarParametroGeneralSg.setVisible(this.isVisibilidadCeldaCancelarParametroGeneralSg);				
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaGuardarParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroGeneralSg.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg));			
			this.jMenuItemDuplicarParametroGeneralSg.setVisible((this.isVisibilidadCeldaDuplicarParametroGeneralSg && this.isPermisoDuplicarParametroGeneralSg));			
			this.jMenuItemCopiarParametroGeneralSg.setVisible((this.isVisibilidadCeldaCopiarParametroGeneralSg && this.isPermisoCopiarParametroGeneralSg));			
			this.jMenuItemVerFormParametroGeneralSg.setVisible((this.isVisibilidadCeldaVerFormParametroGeneralSg && this.isPermisoVerFormParametroGeneralSg));			
			this.jMenuItemAbrirOrderByParametroGeneralSg.setVisible((this.isVisibilidadCeldaOrdenParametroGeneralSg && this.isPermisoOrdenParametroGeneralSg));			
			//this.jMenuItemMostrarOcultarParametroGeneralSg.setVisible((this.isVisibilidadCeldaOrdenParametroGeneralSg && this.isPermisoOrdenParametroGeneralSg));
			this.jMenuItemDetalleAbrirOrderByParametroGeneralSg.setVisible((this.isVisibilidadCeldaOrdenParametroGeneralSg && this.isPermisoOrdenParametroGeneralSg));			
			//this.jMenuItemDetalleMostrarOcultarParametroGeneralSg.setVisible((this.isVisibilidadCeldaOrdenParametroGeneralSg && this.isPermisoOrdenParametroGeneralSg));			
			this.jMenuItemNuevoRelacionesParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg));			
			this.jMenuItemNuevoGuardarCambiosParametroGeneralSg.setVisible((this.isVisibilidadCeldaNuevoParametroGeneralSg && this.isPermisoNuevoParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));									
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemModificarParametroGeneralSg.setVisible((this.isVisibilidadCeldaModificarParametroGeneralSg && this.isPermisoActualizarParametroGeneralSg));	
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemActualizarParametroGeneralSg.setVisible((this.isVisibilidadCeldaActualizarParametroGeneralSg && this.isPermisoActualizarParametroGeneralSg));	
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemEliminarParametroGeneralSg.setVisible((this.isVisibilidadCeldaEliminarParametroGeneralSg && this.isPermisoEliminarParametroGeneralSg));
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemCancelarParametroGeneralSg.setVisible(this.isVisibilidadCeldaCancelarParametroGeneralSg);				
			}
			
			this.jMenuItemGuardarCambiosParametroGeneralSg.setVisible((this.isVisibilidadCeldaGuardarParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));						
			this.jMenuItemGuardarCambiosTablaParametroGeneralSg.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=this.jButtonNuevoParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaDuplicarParametroGeneralSg=this.jButtonDuplicarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaCopiarParametroGeneralSg=this.jButtonCopiarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaVerFormParametroGeneralSg=this.jButtonVerFormParametroGeneralSg.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroGeneralSg=this.jButtonAbrirOrderByParametroGeneralSg.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=this.jButtonNuevoRelacionesParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaModificarParametroGeneralSg=this.jButtonModificarParametroGeneralSg.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.isVisibilidadCeldaActualizarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaEliminarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaCancelarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaGuardarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=this.jButtonGuardarCambiosTablaParametroGeneralSg.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroGeneralSg=this.jButtonNuevoToolBarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=this.jButtonNuevoRelacionesToolBarParametroGeneralSg.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.isVisibilidadCeldaModificarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarToolBarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaActualizarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarToolBarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaEliminarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarToolBarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaCancelarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarToolBarParametroGeneralSg.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroGeneralSg=this.jButtonGuardarCambiosToolBarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=this.jButtonGuardarCambiosTablaToolBarParametroGeneralSg.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroGeneralSg=this.jMenuItemNuevoParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=this.jMenuItemNuevoRelacionesParametroGeneralSg.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.isVisibilidadCeldaModificarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemModificarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaActualizarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemActualizarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaEliminarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemEliminarParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaCancelarParametroGeneralSg=this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemCancelarParametroGeneralSg.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroGeneralSg=this.jMenuItemGuardarCambiosParametroGeneralSg.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=this.jMenuItemGuardarCambiosTablaParametroGeneralSg.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroGeneralSg(Boolean esInicializar) {
		if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroGeneralSg();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroGeneralSg(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroGeneralSg() {
		this.jButtonNuevoParametroGeneralSg.setVisible(this.isPermisoNuevoParametroGeneralSg);			
		this.jButtonDuplicarParametroGeneralSg.setVisible(this.isPermisoDuplicarParametroGeneralSg);			
		this.jButtonCopiarParametroGeneralSg.setVisible(this.isPermisoCopiarParametroGeneralSg);			
		this.jButtonVerFormParametroGeneralSg.setVisible(this.isPermisoVerFormParametroGeneralSg);			
		
		this.jButtonAbrirOrderByParametroGeneralSg.setVisible(this.isPermisoOrdenParametroGeneralSg);					
		
		this.jButtonNuevoRelacionesParametroGeneralSg.setVisible(this.isPermisoNuevoParametroGeneralSg);			
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarParametroGeneralSg.setVisible(this.isPermisoActualizarParametroGeneralSg);	
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarParametroGeneralSg.setVisible(this.isPermisoActualizarParametroGeneralSg);	
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarParametroGeneralSg.setVisible(this.isPermisoEliminarParametroGeneralSg);
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarParametroGeneralSg.setVisible(this.isVisibilidadCeldaCancelarParametroGeneralSg);						
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.setVisible(this.isPermisoGuardarCambiosParametroGeneralSg);							
		}
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg.setVisible(this.isPermisoActualizarParametroGeneralSg);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroGeneralSg() {
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarParametroGeneralSg.setVisible(this.isPermisoActualizarParametroGeneralSg);	
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarParametroGeneralSg.setVisible(this.isPermisoActualizarParametroGeneralSg);	
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarParametroGeneralSg.setVisible(this.isPermisoEliminarParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarParametroGeneralSg.setVisible(this.isVisibilidadCeldaCancelarParametroGeneralSg);							
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.setVisible((this.isVisibilidadCeldaGuardarParametroGeneralSg && this.isPermisoGuardarCambiosParametroGeneralSg));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroGeneralSg() {
		if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroGeneralSg();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroGeneralSg() {
	}
	
	public void jTableDatosParametroGeneralSgListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroGeneralSg(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrogeneralsg.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sistemaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getnombre_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sistema like '%"+this.parametrogeneralsg.getnombre_sistema()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_simple_sistemaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getnombre_simple_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_simple_sistema like '%"+this.parametrogeneralsg.getnombre_simple_sistema()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_empresaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getnombre_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_empresa like '%"+this.parametrogeneralsg.getnombre_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonversion_sistemaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getversion_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where version_sistema = "+this.parametrogeneralsg.getversion_sistema().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglas_sistemaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getsiglas_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas_sistema like '%"+this.parametrogeneralsg.getsiglas_sistema()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmail_sistemaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getmail_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mail_sistema like '%"+this.parametrogeneralsg.getmail_sistema()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_sistemaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.gettelefono_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_sistema like '%"+this.parametrogeneralsg.gettelefono_sistema()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfax_sistemaParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getfax_sistema()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fax_sistema like '%"+this.parametrogeneralsg.getfax_sistema()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrepresentante_nombreParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getrepresentante_nombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where representante_nombre like '%"+this.parametrogeneralsg.getrepresentante_nombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_proceso_actualizacionParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getcodigo_proceso_actualizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_proceso_actualizacion like '%"+this.parametrogeneralsg.getcodigo_proceso_actualizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoParametroGeneralSgBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.getparametrogeneralsg(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneralsg==null) {
						this.parametrogeneralsg = new ParametroGeneralSg();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);
				}

				if(this.parametrogeneralsg.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.parametrogeneralsg.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneralSg(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameParametroGeneralSg() {
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
			this.jInternalFrameDetalleFormParametroGeneralSg.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroGeneralSg.dispose();
			this.jInternalFrameDetalleFormParametroGeneralSg=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
			this.jInternalFrameReporteDinamicoParametroGeneralSg.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroGeneralSg.dispose();
			this.jInternalFrameReporteDinamicoParametroGeneralSg=null;
		}
		
		if(this.jInternalFrameImportacionParametroGeneralSg!=null) {
			this.jInternalFrameImportacionParametroGeneralSg.setVisible(false);	    			
			this.jInternalFrameImportacionParametroGeneralSg.dispose();
			this.jInternalFrameImportacionParametroGeneralSg=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroGeneralSg();
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroGeneralSg")) {
				jButtonDuplicarParametroGeneralSgActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroGeneralSg")) {
				jButtonCopiarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroGeneralSg")) {
				jButtonVerFormParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroGeneralSg")) {
				jButtonDuplicarParametroGeneralSgActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroGeneralSg")) {
				jButtonDuplicarParametroGeneralSgActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroGeneralSg")) {
				jButtonModificarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroGeneralSg")) {
				jButtonModificarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroGeneralSg")) {
				jButtonModificarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroGeneralSg")) {
				jButtonActualizarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroGeneralSg")) {
				jButtonActualizarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroGeneralSg")) {
				jButtonActualizarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroGeneralSg")) {
				jButtonEliminarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroGeneralSg")) {
				jButtonEliminarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroGeneralSg")) {
				jButtonEliminarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroGeneralSg")) {
				jButtonCancelarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroGeneralSg")) {
				jButtonCancelarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroGeneralSg")) {
				jButtonCancelarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroGeneralSg")) {
				jButtonCerrarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroGeneralSg")) {
				jButtonCerrarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroGeneralSg")) {
				jButtonCerrarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroGeneralSg")) {
				jButtonMostrarOcultarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroGeneralSg")) {
				jButtonCancelarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroGeneralSg")) {
				jButtonCopiarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroGeneralSg")) {
				jButtonVerFormParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroGeneralSg")) {
				jButtonCopiarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroGeneralSg")) {
				jButtonVerFormParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroGeneralSg")) {
				jButtonRecargarInformacionParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroGeneralSg")) {
				jButtonRecargarInformacionParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroGeneralSg")) {
				jButtonRecargarInformacionParametroGeneralSgActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroGeneralSg")) {
				jButtonAnterioresParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroGeneralSg")) {
				jButtonAnterioresParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroGeneralSg")) {
				jButtonAnterioresParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroGeneralSg")) {
				jButtonSiguientesParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroGeneralSg")) {
				jButtonSiguientesParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroGeneralSg")) {
				jButtonSiguientesParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroGeneralSg") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroGeneralSg")) {
				jButtonAbrirOrderByParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroGeneralSg") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroGeneralSg")) {
				jButtonMostrarOcultarParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroGeneralSg")) {
				jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroGeneralSg")) {
				jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroGeneralSg")) {
				jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroGeneralSg")) {
				jButtonCerrarReporteDinamicoParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroGeneralSg")) {
				jButtonGenerarReporteDinamicoParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroGeneralSg")) {
				
				jButtonGenerarExcelReporteDinamicoParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroGeneralSg")) {
				jButtonCerrarImportacionParametroGeneralSgActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroGeneralSg")) {
				
				jButtonGenerarImportacionParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroGeneralSg")) {
				
				jButtonAbrirImportacionParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroGeneralSg")) {
				jComboBoxTiposAccionesParametroGeneralSgActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroGeneralSg")) {
				jComboBoxTiposRelacionesParametroGeneralSgActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroGeneralSg")) {
				jComboBoxTiposAccionesParametroGeneralSgActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroGeneralSg")) {
				
				jComboBoxTiposSeleccionarParametroGeneralSgActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroGeneralSg")) {
				jTextFieldValorCampoGeneralParametroGeneralSgActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroGeneralSg")) {
				jButtonAbrirOrderByParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroGeneralSg")) {
				jButtonAbrirOrderByParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroGeneralSg")) {
				jButtonCerrarOrderByParametroGeneralSgActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroGeneralSgBusqueda")) {
				this.jButtonidParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonnombre_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_simple_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonnombre_simple_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaParametroGeneralSgBusqueda")) {
				this.jButtonnombre_empresaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("version_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonversion_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglas_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonsiglas_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mail_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonmail_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_sistemaParametroGeneralSgBusqueda")) {
				this.jButtontelefono_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fax_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonfax_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representante_nombreParametroGeneralSgBusqueda")) {
				this.jButtonrepresentante_nombreParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_proceso_actualizacionParametroGeneralSgBusqueda")) {
				this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoParametroGeneralSgBusqueda")) {
				this.jButtonesta_activoParametroGeneralSgBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroGeneralSg();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralSgActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroGeneralSg parametrogeneralsgLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrogeneralsgLocal=this.parametrogeneralsg;
			} else {
				parametrogeneralsgLocal=this.parametrogeneralsgAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
							
				
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
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
			
			


			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralSgActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
								
						
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
								
				
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
							
				
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralSgActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
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
			
			


			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
								
				
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralSgActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroGeneralSg")) {
					jCheckBoxSeleccionarTodosParametroGeneralSgItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroGeneralSg")) {
					jCheckBoxSeleccionadosParametroGeneralSgItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroGeneralSg")) {
					
				}
				
				


				
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
												
				
				


				
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralSgActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralSgActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
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
			
			


			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralSgActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneralsg);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneralsg);
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
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
				
				


				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneralSg.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneralSg.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralSgActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralsgAnterior =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroGeneralSg")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroGeneralSgListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroGeneralSg.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrogeneralsg =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrogeneralsg);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroGeneralSg")) {
				
				}
				
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroGeneralSg")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroGeneralSg.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroGeneralSg")) {
			
			}
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroGeneralSg();
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
			if(sTipo.equals("NuevoParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroGeneralSg")) {
				jButtonDuplicarParametroGeneralSgActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroGeneralSg")) {
				jButtonCopiarParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroGeneralSg")) {
				jButtonVerFormParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroGeneralSg")) {
				jButtonNuevoParametroGeneralSgActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroGeneralSg")) {
				jButtonModificarParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroGeneralSg")) {
				jButtonActualizarParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroGeneralSg")) {
				jButtonEliminarParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroGeneralSg")) {
				jButtonCancelarParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroGeneralSg")) {
				jButtonCerrarParametroGeneralSgActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroGeneralSg")) {
				jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroGeneralSg")) {
				jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroGeneralSg")) {
				jButtonAbrirOrderByParametroGeneralSgActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroGeneralSg")) {
				jButtonRecargarInformacionParametroGeneralSgActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroGeneralSg")) {
				jButtonAnterioresParametroGeneralSgActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroGeneralSg")) {
				jButtonSiguientesParametroGeneralSgActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroGeneralSgBusqueda")) {
				this.jButtonidParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonnombre_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_simple_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonnombre_simple_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaParametroGeneralSgBusqueda")) {
				this.jButtonnombre_empresaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("version_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonversion_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglas_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonsiglas_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mail_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonmail_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_sistemaParametroGeneralSgBusqueda")) {
				this.jButtontelefono_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fax_sistemaParametroGeneralSgBusqueda")) {
				this.jButtonfax_sistemaParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representante_nombreParametroGeneralSgBusqueda")) {
				this.jButtonrepresentante_nombreParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_proceso_actualizacionParametroGeneralSgBusqueda")) {
				this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoParametroGeneralSgBusqueda")) {
				this.jButtonesta_activoParametroGeneralSgBusquedaActionPerformed(evt);
			}
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroGeneralSg();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroGeneralSg")) {
				closingInternalFrameParametroGeneralSg();
				
			} else if(sTipo.equals("jButtonCancelarParametroGeneralSg")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroGeneralSg = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroGeneralSgBeanSwingJInternalFrame jInternalFrameParent=(ParametroGeneralSgBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroGeneralSg.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroGeneralSgActionPerformed(null);
			}
			
			ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneralsg,new Object(),this.parametrogeneralsgParameterGeneral,this.parametrogeneralsgReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroGeneralSg(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroGeneralSg(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroGeneralSg(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrogeneralsg)) {
			if(!esControlTabla) {
				if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);			
				}
				
				if(this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroGeneralSg(this.parametrogeneralsg,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrogeneralsgReturnGeneral=parametrogeneralsgLogic.procesarEventosParametroGeneralSgsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneralsgLogic.getParametroGeneralSgs(),this.parametrogeneralsg,this.parametrogeneralsgParameterGeneral,this.isEsNuevoParametroGeneralSg,classes);//this.parametrogeneralsgLogic.getParametroGeneralSg()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroGeneralSg(this.parametrogeneralsgReturnGeneral,this.parametrogeneralsgBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroGeneralSg(classes,this.parametrogeneralsgReturnGeneral,this.parametrogeneralsgBean,false);
					}
						
					if(this.parametrogeneralsgReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneralSg(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroGeneralSg(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg());	
					}
						
					if(this.parametrogeneralsgReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroGeneralSg(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg(),classes);//this.parametrogeneralsgBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroGeneralSg(this.parametrogeneralsg,classes);//this.parametrogeneralsgBean);									
				}
			
				if(ParametroGeneralSgJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroGeneralSg(this.parametrogeneralsg,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneralSg(this.parametrogeneralsg);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrogeneralsgAnterior!=null) {
						this.parametrogeneralsg=this.parametrogeneralsgAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrogeneralsgReturnGeneral=parametrogeneralsgLogic.procesarEventosParametroGeneralSgsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneralsgLogic.getParametroGeneralSgs(),this.parametrogeneralsg,this.parametrogeneralsgParameterGeneral,this.isEsNuevoParametroGeneralSg,classes);//this.parametrogeneralsgLogic.getParametroGeneralSg()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrogeneralsgSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg(),parametrogeneralsgLogic.getParametroGeneralSgs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg(),this.parametrogeneralsgs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroGeneralSg.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroGeneralSg.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroGeneralSg();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroGeneralSg() throws Exception {
		
		ParametroGeneralSgModel parametrogeneralsgModel=(ParametroGeneralSgModel)this.jTableDatosParametroGeneralSg.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogeneralsgModel.parametrogeneralsgs=this.parametrogeneralsgLogic.getParametroGeneralSgs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrogeneralsgModel.parametrogeneralsgs=this.parametrogeneralsgs;
		}
		
		
		((ParametroGeneralSgModel) this.jTableDatosParametroGeneralSg.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroGeneralSg() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrogeneralsgAnterior(),this.parametrogeneralsgLogic.getParametroGeneralSgs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrogeneralsgAnterior(),this.parametrogeneralsgs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroGeneralSg();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
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
										
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneralsg,new Object(),generalEntityParameterGeneral,this.parametrogeneralsgReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroGeneralSgConstantesFunciones.getClassesRelationshipsOfParametroGeneralSg(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroGeneralSgConstantesFunciones.getClassesRelationshipsFromStringsOfParametroGeneralSg(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroGeneralSg(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroGeneralSgBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneralsg,new Object(),generalEntityParameterGeneral,this.parametrogeneralsgReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroGeneralSg(ParametroGeneralSgBean parametrogeneralsgBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroGeneralSg(ArrayList<Classe> classes,ParametroGeneralSgReturnGeneral parametrogeneralsgReturnGeneral,ParametroGeneralSgBean parametrogeneralsgBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrogeneralsg)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroGeneralSg = new ParametroGeneralSgDetalleFormJInternalFrame(jDesktopPane,this.parametrogeneralsgSessionBean.getConGuardarRelaciones(),this.parametrogeneralsgSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.setVisible(false);
		this.jInternalFrameDetalleFormParametroGeneralSg.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroGeneralSg.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroGeneralSg.parametrogeneralsgLogic=this.parametrogeneralsgLogic;
		
		this.cargarCombosFrameForeignKeyParametroGeneralSg("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroGeneralSg();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroGeneralSg();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroGeneralSg("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroGeneralSg();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroGeneralSg.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroGeneralSg"));
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"ModificarParametroGeneralSg"));

		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarToolBarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroGeneralSg"));
					
		this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemModificarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroGeneralSg"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"ActualizarParametroGeneralSg"));
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarToolBarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroGeneralSg"));
						
		this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemActualizarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroGeneralSg"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"EliminarParametroGeneralSg"));
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroGeneralSg"));
								
		this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemEliminarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroGeneralSg"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CancelarParametroGeneralSg"));
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroGeneralSg"));
					
		this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemCancelarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroGeneralSg"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemDetalleCerrarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroGeneralSg"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGeneralSg"));
		
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGeneralSg"));
		
		
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroGeneralSg"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonidParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_simple_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_empresaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonversion_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"version_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonsiglas_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"siglas_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonmail_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"mail_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtontelefono_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"telefono_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonfax_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"fax_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonrepresentante_nombreParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"representante_nombreParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"codigo_proceso_actualizacionParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonesta_activoParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoParametroGeneralSgBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroGeneralSg"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroGeneralSg"));
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroGeneralSg"));
		}
		
		this.jTableDatosParametroGeneralSg.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroGeneralSg"));
		
		this.jTableDatosParametroGeneralSg.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroGeneralSg"));
		
		this.jButtonNuevoParametroGeneralSg.addActionListener(new ButtonActionListener(this,"NuevoParametroGeneralSg"));
		
		this.jButtonDuplicarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"DuplicarParametroGeneralSg"));
		
		this.jButtonCopiarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"CopiarParametroGeneralSg"));
		
		this.jButtonVerFormParametroGeneralSg.addActionListener(new ButtonActionListener(this,"VerFormParametroGeneralSg"));
		
		
		this.jButtonNuevoToolBarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroGeneralSg"));
			
		this.jButtonDuplicarToolBarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroGeneralSg"));
			
		this.jMenuItemNuevoParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroGeneralSg"));
			
		this.jMenuItemDuplicarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroGeneralSg"));		
		
		
		this.jButtonNuevoRelacionesParametroGeneralSg.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroGeneralSg"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroGeneralSg"));
			
		this.jMenuItemNuevoRelacionesParametroGeneralSg.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroGeneralSg"));		
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"ModificarParametroGeneralSg"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonModificarToolBarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroGeneralSg"));
			
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemModificarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroGeneralSg"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"ActualizarParametroGeneralSg"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonActualizarToolBarParametroGeneralSg.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroGeneralSg"));
				
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemActualizarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroGeneralSg"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"EliminarParametroGeneralSg"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonEliminarToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroGeneralSg"));
						
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemEliminarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroGeneralSg"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CancelarParametroGeneralSg"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonCancelarToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroGeneralSg"));
			
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemCancelarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroGeneralSg"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroGeneralSg"));		
		
		
		this.jButtonCerrarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CerrarParametroGeneralSg"));
		
		
		this.jButtonCerrarToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroGeneralSg"));
			
		this.jMenuItemCerrarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroGeneralSg"));
			
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jMenuItemDetalleCerrarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroGeneralSg"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroGeneralSg"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGeneralSg"));
		}
		
		this.jButtonCopiarToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroGeneralSg"));
			
		this.jButtonVerFormToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroGeneralSg"));
		
		this.jMenuItemGuardarCambiosParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroGeneralSg"));
			
		this.jMenuItemCopiarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroGeneralSg"));		
		
		this.jMenuItemVerFormParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroGeneralSg"));		
		
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroGeneralSg"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroGeneralSg"));
			
		this.jMenuItemGuardarCambiosTablaParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroGeneralSg"));		
		
		
		
		this.jButtonRecargarInformacionParametroGeneralSg.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroGeneralSg"));
					
		this.jButtonRecargarInformacionToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroGeneralSg"));
		
		this.jMenuItemRecargarInformacionParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroGeneralSg"));		
		
		
		
		this.jButtonAnterioresParametroGeneralSg.addActionListener (new ButtonActionListener(this,"AnterioresParametroGeneralSg"));
		
		
		this.jButtonAnterioresToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroGeneralSg"));
		
		this.jMenuItemAnterioresParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroGeneralSg"));		
		
		
		this.jButtonSiguientesParametroGeneralSg.addActionListener (new ButtonActionListener(this,"SiguientesParametroGeneralSg"));
		
		
		this.jButtonSiguientesToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroGeneralSg"));
			
		this.jMenuItemSiguientesParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroGeneralSg"));
			
		this.jMenuItemAbrirOrderByParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroGeneralSg"));
			
		this.jMenuItemMostrarOcultarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroGeneralSg"));
			
		this.jMenuItemDetalleAbrirOrderByParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroGeneralSg"));
			
		this.jMenuItemDetalleMostarOcultarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroGeneralSg"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroGeneralSg.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroGeneralSg"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroGeneralSg"));
			
		this.jMenuItemNuevoGuardarCambiosParametroGeneralSg.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroGeneralSg"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroGeneralSg.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroGeneralSg"));

		this.jCheckBoxSeleccionadosParametroGeneralSg.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroGeneralSg"));
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroGeneralSg"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroGeneralSg.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroGeneralSg"));
			
		this.jComboBoxTiposAccionesParametroGeneralSg.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroGeneralSg"));
					
		this.jComboBoxTiposSeleccionarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroGeneralSg"));
			
		this.jTextFieldValorCampoGeneralParametroGeneralSg.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroGeneralSg"));		
		
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonidParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_simple_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_empresaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonversion_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"version_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonsiglas_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"siglas_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonmail_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"mail_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtontelefono_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"telefono_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonfax_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"fax_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonrepresentante_nombreParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"representante_nombreParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"codigo_proceso_actualizacionParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonesta_activoParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoParametroGeneralSgBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroGeneralSg!=null) {
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGeneralSg"));
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGeneralSg"));
				this.jInternalFrameReporteDinamicoParametroGeneralSg.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGeneralSg"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroGeneralSg.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGeneralSg"));				
			//this.jButtonGenerarReporteDinamicoParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGeneralSg"));
			//this.jButtonGenerarExcelReporteDinamicoParametroGeneralSg.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGeneralSg"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroGeneralSg!=null) {
				this.jInternalFrameImportacionParametroGeneralSg.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroGeneralSg"));
				this.jInternalFrameImportacionParametroGeneralSg.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroGeneralSg"));
				this.jInternalFrameImportacionParametroGeneralSg.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroGeneralSg"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroGeneralSg.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroGeneralSg"));
			
			this.jButtonAbrirOrderByToolBarParametroGeneralSg.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroGeneralSg"));			
			
			if(this.jInternalFrameOrderByParametroGeneralSg!=null) {
				this.jInternalFrameOrderByParametroGeneralSg.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroGeneralSg"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneralSg.jTabbedPaneRelacionesParametroGeneralSg.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroGeneralSg"));
		
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
            		closingInternalFrameParametroGeneralSg();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroGeneralSg.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroGeneralSg = (JInternalFrameBase)event.getSource();
	            	
	            ParametroGeneralSgBeanSwingJInternalFrame jInternalFrameParent=(ParametroGeneralSgBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroGeneralSg.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroGeneralSgActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroGeneralSg.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroGeneralSgListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroGeneralSg.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroGeneralSg.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralSgActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralSgActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralSgActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroGeneralSg";
		inputMap = this.jButtonNuevoParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroGeneralSgActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralSgActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralSgActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralSgActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroGeneralSg";
		inputMap = this.jButtonNuevoRelacionesParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroGeneralSgActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroGeneralSg";
		inputMap = this.jButtonModificarParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroGeneralSgActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroGeneralSg";
		inputMap = this.jButtonActualizarParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroGeneralSgActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroGeneralSg";
		inputMap = this.jButtonEliminarParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroGeneralSgActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroGeneralSg";
		inputMap = this.jButtonCancelarParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroGeneralSgActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroGeneralSg";
		inputMap = this.jButtonCerrarParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroGeneralSgActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroGeneralSg";
		inputMap = this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonGuardarCambiosParametroGeneralSg.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroGeneralSgActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroGeneralSg.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroGeneralSgItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroGeneralSg.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroGeneralSgActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroGeneralSg.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroGeneralSgActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroGeneralSg.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroGeneralSgActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonidParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_simple_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonnombre_empresaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonversion_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"version_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonsiglas_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"siglas_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonmail_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"mail_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtontelefono_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"telefono_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonfax_sistemaParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"fax_sistemaParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonrepresentante_nombreParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"representante_nombreParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"codigo_proceso_actualizacionParametroGeneralSgBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneralSg.jButtonesta_activoParametroGeneralSgBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoParametroGeneralSgBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroGeneralSg.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroGeneralSgActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroGeneralSgActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroGeneralSg.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroGeneralSg(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
					parametrogeneralsgAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgs) {
					parametrogeneralsgAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroGeneralSgItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroGeneralSg(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
						parametrogeneralsgAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgs) {
						parametrogeneralsgAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
					
						if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							parametrogeneralsgAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgs) {
						
						if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							parametrogeneralsgAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroGeneralSg(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroGeneralSg.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroGeneralSg.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroGeneralSgItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroGeneralSg(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroGeneralSg.getSelectedRows();
			
			ParametroGeneralSg parametrogeneralsgLocal=new ParametroGeneralSg();
			
			//this.seleccionarTodosParametroGeneralSg(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogeneralsgLocal =(ParametroGeneralSg) this.parametrogeneralsgLogic.getParametroGeneralSgs().toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrogeneralsgLocal =(ParametroGeneralSg) this.parametrogeneralsgs.toArray()[this.jTableDatosParametroGeneralSg.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrogeneralsgLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
						parametrogeneralsgAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgs) {
						parametrogeneralsgAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroGeneralSg(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroGeneralSg.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroGeneralSg.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralSg,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroGeneralSgItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroGeneralSgParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroGeneralSgActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroGeneralSg(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroGeneralSg.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgLogic.getParametroGeneralSgs()) {
				
						if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setnombre_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setnombre_simple_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							parametrogeneralsgAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setversion_sistema(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setsiglas_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setmail_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.settelefono_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setfax_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE)) {
							existe=true;
							parametrogeneralsgAux.setrepresentante_nombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION)) {
							existe=true;
							parametrogeneralsgAux.setcodigo_proceso_actualizacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgs) {
					
						if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setnombre_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setnombre_simple_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							parametrogeneralsgAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setversion_sistema(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setsiglas_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setmail_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.settelefono_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA)) {
							existe=true;
							parametrogeneralsgAux.setfax_sistema(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE)) {
							existe=true;
							parametrogeneralsgAux.setrepresentante_nombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION)) {
							existe=true;
							parametrogeneralsgAux.setcodigo_proceso_actualizacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroGeneralSg(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroGeneralSgActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroGeneralSg(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroGeneralSg=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroGeneralSg.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroGeneralSg) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroGeneralSg(conSplash);
				
					this.generarReporteParametroGeneralSgsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroGeneralSgsSeleccionados();
				//this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroGeneralSgsSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroGeneralSgsSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroGeneralSg();
				
				this.exportarParametroGeneralSgsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroGeneralSgs();
				//this.importarParametroGeneralSgs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroGeneralSg();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroGeneralSgsSeleccionados();
				//this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroGeneralSg();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroGeneralSg)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroGeneralSg(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroGeneralSgBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroGeneralSg) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroGeneralSg(conSplash);
					
						//this.actualizarParametrosGeneralParametroGeneralSg();
						
						this.generarReporteProcesoAccionParametroGeneralSgsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroGeneralSgBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro GeneralES SELECCIONADOS?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroGeneralSg();
				
						this.actualizarParametrosGeneralParametroGeneralSg();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrogeneralsgReturnGeneral=parametrogeneralsgLogic.procesarAccionParametroGeneralSgsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrogeneralsgLogic.getParametroGeneralSgs(),this.parametrogeneralsgParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroGeneralSgReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroGeneralSg();
					
					ParametroGeneralSgBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroGeneralSgReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroGeneralSg.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroGeneralSg.jComboBoxTiposAccionesFormularioParametroGeneralSg.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroGeneralSg(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroGeneralSgActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroGeneralSg();
			
			if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
			ParametroGeneralSg parametrogeneralsg=new ParametroGeneralSg();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroGeneralSg(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroGeneralSg.getSelectedItem();
			
			
			
			
			parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrogeneralsgsSeleccionados.size()==1) {
				for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
					parametrogeneralsg=parametrogeneralsgAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroGeneralSg();
			
      		//this.finishProcessParametroGeneralSg(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroGeneralSgReturnGeneral() throws Exception {
		if(this.parametrogeneralsgReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrogeneralsgReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrogeneralsgReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrogeneralsgReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrogeneralsgReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrogeneralsgReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroGeneralSg(false);
		}
		
		if(this.parametrogeneralsgReturnGeneral.getConRetornoLista() || this.parametrogeneralsgReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrogeneralsgReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrogeneralsgLogic.setParametroGeneralSgs(this.parametrogeneralsgReturnGeneral.getParametroGeneralSgs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrogeneralsgReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrogeneralsgLogic.setParametroGeneralSg(this.parametrogeneralsgReturnGeneral.getParametroGeneralSg());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroGeneralSg(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroGeneralSg() throws Exception {
		
		
	}
	
	public ArrayList<ParametroGeneralSg> getParametroGeneralSgsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroGeneralSg) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgLogic.getParametroGeneralSgs()) {
					if(parametrogeneralsgAux.getIsSelected()) {
						parametrogeneralsgsSeleccionados.add(parametrogeneralsgAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneralSg parametrogeneralsgAux:this.parametrogeneralsgs) {
					if(parametrogeneralsgAux.getIsSelected()) {
						parametrogeneralsgsSeleccionados.add(parametrogeneralsgAux);				
					}
				}
			}
			
			if(parametrogeneralsgsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrogeneralsgsSeleccionados.addAll(this.parametrogeneralsgLogic.getParametroGeneralSgs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrogeneralsgsSeleccionados.addAll(this.parametrogeneralsgs);				
					}
				}
			}
		} else {
			parametrogeneralsgsSeleccionados.add(this.parametrogeneralsg);
		}
		
		return parametrogeneralsgsSeleccionados;
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
	
	public void generarReporteParametroGeneralSgsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroGeneralSgsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroGeneralSgsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroGeneralSgsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroGeneralSgsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroGeneralSgsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgsSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroGeneralSgsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroGeneralSgsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroGeneralSgsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroGeneralSg();
		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroGeneralSg();
		
		
		//this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgsSeleccionados ,parametrogeneralsgImplementable,parametrogeneralsgImplementableHome);
	}
	
	public void mostrarImportacionParametroGeneralSgs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroGeneralSg();
		
		this.abrirFrameImportacionParametroGeneralSg();		
		
			
		//this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgsSeleccionados ,parametrogeneralsgImplementable,parametrogeneralsgImplementableHome);
	}
	
	public void importarParametroGeneralSgs() throws Exception {		
	
	}
	
	public void exportarParametroGeneralSgsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroGeneralSgsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroGeneralSgsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroGeneralSgsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroGeneralSgsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroGeneralSg(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroGeneralSg(parametrogeneralsgAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrogeneralsgAux.setsDetalleGeneralEntityReporte(parametrogeneralsgAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroGeneralSg(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrogeneralsg.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getnombre_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getnombre_simple_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getnombre_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getversion_sistema().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getsiglas_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getmail_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.gettelefono_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getfax_sistema();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getrepresentante_nombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getcodigo_proceso_actualizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneralsg.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroGeneralSgsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroGeneralSgs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroGeneralSg(row);				
				iRow++;
			}				
			
			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroGeneralSg(parametrogeneralsgAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroGeneralSgsSeleccionados() throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();		
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneralsg.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrogeneralsgs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrogeneralsg");
			//elementRoot.appendChild(element);
		
			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
				element = document.createElement("parametrogeneralsg");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroGeneralSg(parametrogeneralsgAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroGeneralSg(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getnombre_sistema());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getnombre_simple_sistema());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getnombre_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getversion_sistema());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getsiglas_sistema());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getmail_sistema());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.gettelefono_sistema());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getfax_sistema());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getrepresentante_nombre());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getcodigo_proceso_actualizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneralsg.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlParametroGeneralSg(ParametroGeneralSg parametrogeneralsg,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroGeneralSgConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrogeneralsg.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroGeneralSgConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrogeneralsg.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre_sistema = document.createElement(ParametroGeneralSgConstantesFunciones.NOMBRESISTEMA);
		elementnombre_sistema.appendChild(document.createTextNode(parametrogeneralsg.getnombre_sistema().trim()));
		element.appendChild(elementnombre_sistema);

		Element elementnombre_simple_sistema = document.createElement(ParametroGeneralSgConstantesFunciones.NOMBRESIMPLESISTEMA);
		elementnombre_simple_sistema.appendChild(document.createTextNode(parametrogeneralsg.getnombre_simple_sistema().trim()));
		element.appendChild(elementnombre_simple_sistema);

		Element elementnombre_empresa = document.createElement(ParametroGeneralSgConstantesFunciones.NOMBREEMPRESA);
		elementnombre_empresa.appendChild(document.createTextNode(parametrogeneralsg.getnombre_empresa().trim()));
		element.appendChild(elementnombre_empresa);

		Element elementversion_sistema = document.createElement(ParametroGeneralSgConstantesFunciones.VERSIONSISTEMA);
		elementversion_sistema.appendChild(document.createTextNode(parametrogeneralsg.getversion_sistema().toString().trim()));
		element.appendChild(elementversion_sistema);

		Element elementsiglas_sistema = document.createElement(ParametroGeneralSgConstantesFunciones.SIGLASSISTEMA);
		elementsiglas_sistema.appendChild(document.createTextNode(parametrogeneralsg.getsiglas_sistema().trim()));
		element.appendChild(elementsiglas_sistema);

		Element elementmail_sistema = document.createElement(ParametroGeneralSgConstantesFunciones.MAILSISTEMA);
		elementmail_sistema.appendChild(document.createTextNode(parametrogeneralsg.getmail_sistema().trim()));
		element.appendChild(elementmail_sistema);

		Element elementtelefono_sistema = document.createElement(ParametroGeneralSgConstantesFunciones.TELEFONOSISTEMA);
		elementtelefono_sistema.appendChild(document.createTextNode(parametrogeneralsg.gettelefono_sistema().trim()));
		element.appendChild(elementtelefono_sistema);

		Element elementfax_sistema = document.createElement(ParametroGeneralSgConstantesFunciones.FAXSISTEMA);
		elementfax_sistema.appendChild(document.createTextNode(parametrogeneralsg.getfax_sistema().trim()));
		element.appendChild(elementfax_sistema);

		Element elementrepresentante_nombre = document.createElement(ParametroGeneralSgConstantesFunciones.REPRESENTANTENOMBRE);
		elementrepresentante_nombre.appendChild(document.createTextNode(parametrogeneralsg.getrepresentante_nombre().trim()));
		element.appendChild(elementrepresentante_nombre);

		Element elementcodigo_proceso_actualizacion = document.createElement(ParametroGeneralSgConstantesFunciones.CODIGOPROCESOACTUALIZACION);
		elementcodigo_proceso_actualizacion.appendChild(document.createTextNode(parametrogeneralsg.getcodigo_proceso_actualizacion().trim()));
		element.appendChild(elementcodigo_proceso_actualizacion);

		Element elementesta_activo = document.createElement(ParametroGeneralSgConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(parametrogeneralsg.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoParametroGeneralSgsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados=new ArrayList<ParametroGeneralSg>();
		
		parametrogeneralsgsSeleccionados=this.getParametroGeneralSgsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroGeneralSg(parametrogeneralsgsSeleccionados);
		
		this.generarReporteParametroGeneralSgs("Todos",parametrogeneralsgsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroGeneralSg(ArrayList<ParametroGeneralSg> parametrogeneralsgsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroGeneralSg parametrogeneralsgAux:parametrogeneralsgsSeleccionados) {
				parametrogeneralsgAux.setsDetalleGeneralEntityReporte(parametrogeneralsgAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getnombre_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getnombre_simple_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getnombre_empresa());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getsiglas_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getmail_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.gettelefono_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getfax_sistema());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getrepresentante_nombre());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(parametrogeneralsgAux.getcodigo_proceso_actualizacion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					parametrogeneralsgAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralsgAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralSgConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroGeneralSg(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroGeneralSg=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=true;
				this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=true;
			}
			
			this.isVisibilidadCeldaModificarParametroGeneralSg=false;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=false;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;
			this.isVisibilidadCeldaModificarParametroGeneralSg=false;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=true;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;
			this.isVisibilidadCeldaModificarParametroGeneralSg=false;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=true;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=true;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;
			this.isVisibilidadCeldaModificarParametroGeneralSg=false;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=true;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=true;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=true;
			this.isVisibilidadCeldaModificarParametroGeneralSg=false;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=false;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=false;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;
			this.isVisibilidadCeldaModificarParametroGeneralSg=true;
			this.isVisibilidadCeldaActualizarParametroGeneralSg=false;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
			this.isVisibilidadCeldaCancelarParametroGeneralSg=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneralSg=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroGeneralSg=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=true;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=true;
		} else {
			this.actualizarEstadoPanelsParametroGeneralSg(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroGeneralSg=false;
			//this.isVisibilidadCeldaVerFormParametroGeneralSg=false;
			this.isVisibilidadCeldaDuplicarParametroGeneralSg=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroGeneralSg=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneralSg=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			if(!parametrogeneralsgSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;												
			}
			
			this.jButtonCerrarParametroGeneralSg.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneralSg=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrogeneralsg)) {
			this.isVisibilidadCeldaActualizarParametroGeneralSg=false;
			this.isVisibilidadCeldaEliminarParametroGeneralSg=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroGeneralSg() {
	}
	
	public void actualizarEstadoPanelsParametroGeneralSg(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroGeneralSg!=null) {
				this.jScrollPanelDatosEdicionParametroGeneralSg.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneralSg!=null) {
				this.jScrollPanelDatosParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneralSg!=null) {
				this.jPanelPaginacionParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneralSg!=null) {
				this.jPanelParametrosReportesParametroGeneralSg.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroGeneralSg!=null) {
				this.jScrollPanelDatosEdicionParametroGeneralSg.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroGeneralSg!=null) {
				this.jScrollPanelDatosParametroGeneralSg.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGeneralSg!=null) {
				this.jPanelPaginacionParametroGeneralSg.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGeneralSg!=null) {
				this.jPanelParametrosReportesParametroGeneralSg.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroGeneralSg!=null) {
				this.jScrollPanelDatosEdicionParametroGeneralSg.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosParametroGeneralSg!=null) {
				this.jScrollPanelDatosParametroGeneralSg.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGeneralSg!=null) {
				this.jPanelPaginacionParametroGeneralSg.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGeneralSg!=null) {
				this.jPanelParametrosReportesParametroGeneralSg.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroGeneralSg!=null) {
				this.jScrollPanelDatosEdicionParametroGeneralSg.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneralSg!=null) {
				this.jScrollPanelDatosParametroGeneralSg.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGeneralSg!=null) {
				this.jPanelPaginacionParametroGeneralSg.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGeneralSg!=null) {
				this.jPanelParametrosReportesParametroGeneralSg.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroGeneralSg!=null) {
				this.jScrollPanelDatosEdicionParametroGeneralSg.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneralSg!=null) {
				this.jScrollPanelDatosParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneralSg!=null) {
				this.jPanelPaginacionParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneralSg!=null) {
				this.jPanelParametrosReportesParametroGeneralSg.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroGeneralSg!=null) {
				this.jScrollPanelDatosEdicionParametroGeneralSg.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosParametroGeneralSg!=null) {
				this.jScrollPanelDatosParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneralSg!=null) {
				this.jPanelPaginacionParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneralSg!=null) {
				this.jPanelParametrosReportesParametroGeneralSg.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroGeneralSg!=null) {
				this.jScrollPanelDatosEdicionParametroGeneralSg.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosParametroGeneralSg!=null) {
				this.jScrollPanelDatosParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneralSg!=null) {
				this.jPanelPaginacionParametroGeneralSg.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneralSg!=null) {
				this.jPanelParametrosReportesParametroGeneralSg.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroGeneralSgSessionBean parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
		
		if(this.parametrogeneralsgSessionBean==null) {
			this.parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
		}
		
		this.parametrogeneralsgSessionBean.setsUltimaBusquedaParametroGeneralSg(this.getsAccionBusqueda());
		this.parametrogeneralsgSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrogeneralsgSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroGeneralSgSessionBean parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
		
		if(this.parametrogeneralsgSessionBean==null) {
			this.parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
		}
		
		if(this.parametrogeneralsgSessionBean.getsUltimaBusquedaParametroGeneralSg()!=null&&!this.parametrogeneralsgSessionBean.getsUltimaBusquedaParametroGeneralSg().equals("")) {
			this.setsAccionBusqueda(parametrogeneralsgSessionBean.getsUltimaBusquedaParametroGeneralSg());
			this.setiNumeroPaginacion(parametrogeneralsgSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrogeneralsgSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.parametrogeneralsgSessionBean.setsUltimaBusquedaParametroGeneralSg("");
		this.parametrogeneralsgSessionBean.setiNumeroPaginacion(ParametroGeneralSgConstantesFunciones.INUMEROPAGINACION);
		this.parametrogeneralsgSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroGeneralSg(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroGeneralSg() {
		this.updateBorderResaltarBusquedasFormularioParametroGeneralSg();
		this.updateVisibilidadBusquedasFormularioParametroGeneralSg();
		this.updateHabilitarBusquedasFormularioParametroGeneralSg();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroGeneralSg() {					
	}
	
	public void updateVisibilidadBusquedasFormularioParametroGeneralSg() {
	}
	
	public void updateHabilitarBusquedasFormularioParametroGeneralSg() {
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
	
	public void updateControlesFormularioParametroGeneralSg() throws Exception {

		if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroGeneralSg();
		this.updateVisibilidadResaltarControlesFormularioParametroGeneralSg();
		this.updateHabilitarResaltarControlesFormularioParametroGeneralSg();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroGeneralSg() throws Exception {
		if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrogeneralsgConstantesFunciones.resaltaridParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltaridParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarnombre_sistemaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarnombre_sistemaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarnombre_simple_sistemaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarnombre_simple_sistemaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarnombre_empresaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarnombre_empresaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarversion_sistemaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarversion_sistemaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarsiglas_sistemaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarsiglas_sistemaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarmail_sistemaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarmail_sistemaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltartelefono_sistemaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltartelefono_sistemaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarfax_sistemaParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarfax_sistemaParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarrepresentante_nombreParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarrepresentante_nombreParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltarcodigo_proceso_actualizacionParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltarcodigo_proceso_actualizacionParametroGeneralSg);}
		if(this.parametrogeneralsgConstantesFunciones.resaltaresta_activoParametroGeneralSg!=null && this.jInternalFrameDetalleFormParametroGeneralSg!=null) {this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setBorderPainted(true);this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setBorder(this.parametrogeneralsgConstantesFunciones.resaltaresta_activoParametroGeneralSg);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroGeneralSg() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
	
		//this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostraridParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelidParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostraridParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarnombre_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelnombre_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarnombre_sistemaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarnombre_simple_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelnombre_simple_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarnombre_simple_sistemaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarnombre_empresaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelnombre_empresaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarnombre_empresaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarversion_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelversion_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarversion_sistemaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarsiglas_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelsiglas_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarsiglas_sistemaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarmail_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelmail_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarmail_sistemaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrartelefono_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPaneltelefono_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrartelefono_sistemaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarfax_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelfax_sistemaParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarfax_sistemaParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarrepresentante_nombreParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelrepresentante_nombreParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarrepresentante_nombreParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarcodigo_proceso_actualizacionParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelcodigo_proceso_actualizacionParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostrarcodigo_proceso_actualizacionParametroGeneralSg);
		//this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostraresta_activoParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jPanelesta_activoParametroGeneralSg.setVisible(this.parametrogeneralsgConstantesFunciones.mostraresta_activoParametroGeneralSg);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroGeneralSg() throws Exception {
		if(this.jInternalFrameDetalleFormParametroGeneralSg==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroGeneralSg!=null) {
	
		this.jInternalFrameDetalleFormParametroGeneralSg.jLabelidParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activaridParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_sistemaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarnombre_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_simple_sistemaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarnombre_simple_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreanombre_empresaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarnombre_empresaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldversion_sistemaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarversion_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldsiglas_sistemaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarsiglas_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextAreamail_sistemaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarmail_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldtelefono_sistemaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activartelefono_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldfax_sistemaParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarfax_sistemaParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextArearepresentante_nombreParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarrepresentante_nombreParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activarcodigo_proceso_actualizacionParametroGeneralSg);
		this.jInternalFrameDetalleFormParametroGeneralSg.jCheckBoxesta_activoParametroGeneralSg.setEnabled(this.parametrogeneralsgConstantesFunciones.activaresta_activoParametroGeneralSg);
		}
	}
	
		
}