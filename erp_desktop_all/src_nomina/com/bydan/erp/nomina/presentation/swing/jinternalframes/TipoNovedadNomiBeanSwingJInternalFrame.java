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

import com.bydan.erp.nomina.util.TipoNovedadNomiConstantesFunciones;
import com.bydan.erp.nomina.util.TipoNovedadNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoNovedadNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoNovedadNomiBean;
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
public class TipoNovedadNomiBeanSwingJInternalFrame extends TipoNovedadNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoNovedadNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoNovedadNomi> tiponovedadnomiValidator = new ClassValidator<TipoNovedadNomi>(TipoNovedadNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoNovedadNomi tiponovedadnomi;	
	public TipoNovedadNomi tiponovedadnomiAux;
	public TipoNovedadNomi tiponovedadnomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoNovedadNomi tiponovedadnomiTotales;
	public Long idTipoNovedadNomiActual;
	public Long iIdNuevoTipoNovedadNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosNovedadNomi=false;

	public Boolean getIsTienePermisosNovedadNomi() {
		return isTienePermisosNovedadNomi;
	}

	public void setIsTienePermisosNovedadNomi(Boolean isTienePermisosNovedadNomi) {
		this.isTienePermisosNovedadNomi= isTienePermisosNovedadNomi;
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
	
	public Boolean isPermisoTodoTipoNovedadNomi;
	public Boolean isPermisoNuevoTipoNovedadNomi;
	public Boolean isPermisoActualizarTipoNovedadNomi;
	public Boolean isPermisoActualizarOriginalTipoNovedadNomi;
	public Boolean isPermisoEliminarTipoNovedadNomi;
	public Boolean isPermisoGuardarCambiosTipoNovedadNomi;
	public Boolean isPermisoConsultaTipoNovedadNomi;
	public Boolean isPermisoBusquedaTipoNovedadNomi;
	public Boolean isPermisoReporteTipoNovedadNomi;
	public Boolean isPermisoPaginacionMedioTipoNovedadNomi;
	public Boolean isPermisoPaginacionAltoTipoNovedadNomi;
	public Boolean isPermisoPaginacionTodoTipoNovedadNomi;
	public Boolean isPermisoCopiarTipoNovedadNomi;
	public Boolean isPermisoVerFormTipoNovedadNomi;
	public Boolean isPermisoDuplicarTipoNovedadNomi;
	public Boolean isPermisoOrdenTipoNovedadNomi;
	
	
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
	
	public TipoNovedadNomiParameterReturnGeneral tiponovedadnomiReturnGeneral;
	public TipoNovedadNomiParameterReturnGeneral tiponovedadnomiParameterGeneral;
	
	

	public NovedadNomiLogic novedadnomiLogic=null;

	public NovedadNomiLogic getNovedadNomiLogic() {
		return novedadnomiLogic;
	}

	public void setNovedadNomiLogic(NovedadNomiLogic novedadnomiLogic) {
		this.novedadnomiLogic = novedadnomiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoNovedadNomi=false;
	public Boolean esParaAccionDesdeFormularioTipoNovedadNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoNovedadNomiSessionBeanAdditional tiponovedadnomiSessionBeanAdditional=null;
	
	public TipoNovedadNomiSessionBeanAdditional getTipoNovedadNomiSessionBeanAdditional() {
		return this.tiponovedadnomiSessionBeanAdditional;
	}
	
	public void setTipoNovedadNomiSessionBeanAdditional(TipoNovedadNomiSessionBeanAdditional tiponovedadnomiSessionBeanAdditional) {
		try {
			this.tiponovedadnomiSessionBeanAdditional=tiponovedadnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoNovedadNomiBeanSwingJInternalFrameAdditional tiponovedadnomiBeanSwingJInternalFrameAdditional=null;
	//public class TipoNovedadNomiBeanSwingJInternalFrame
	
	public TipoNovedadNomiBeanSwingJInternalFrameAdditional getTipoNovedadNomiBeanSwingJInternalFrameAdditional() {
		return this.tiponovedadnomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoNovedadNomiBeanSwingJInternalFrameAdditional(TipoNovedadNomiBeanSwingJInternalFrameAdditional tiponovedadnomiBeanSwingJInternalFrameAdditional) {
		try {
			this.tiponovedadnomiBeanSwingJInternalFrameAdditional=tiponovedadnomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoNovedadNomiLogic tiponovedadnomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoNovedadNomi tiponovedadnomiBean;
	public TipoNovedadNomiConstantesFunciones tiponovedadnomiConstantesFunciones;
	//public TipoNovedadNomiParameterReturnGeneral tiponovedadnomiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoNovedadNomi> tiponovedadnomis;	
	//public List<TipoNovedadNomi> tiponovedadnomisEliminados;
	//public List<TipoNovedadNomi> tiponovedadnomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoNovedadNomi=false;
	public Boolean isVisibilidadCeldaDuplicarTipoNovedadNomi=true;
	public Boolean isVisibilidadCeldaCopiarTipoNovedadNomi=true;
	public Boolean isVisibilidadCeldaVerFormTipoNovedadNomi=true;
	public Boolean isVisibilidadCeldaOrdenTipoNovedadNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
	public Boolean isVisibilidadCeldaModificarTipoNovedadNomi=false;
	public Boolean isVisibilidadCeldaActualizarTipoNovedadNomi=false;
	public Boolean isVisibilidadCeldaEliminarTipoNovedadNomi=false;
	public Boolean isVisibilidadCeldaCancelarTipoNovedadNomi=false;
	public Boolean isVisibilidadCeldaGuardarTipoNovedadNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;	
	
	
	
	public Long getiIdNuevoTipoNovedadNomi() {
		return this.iIdNuevoTipoNovedadNomi;
	}

	public void setiIdNuevoTipoNovedadNomi(Long iIdNuevoTipoNovedadNomi) {
		this.iIdNuevoTipoNovedadNomi = iIdNuevoTipoNovedadNomi;
	}
	
	public Long getidTipoNovedadNomiActual() {
		return this.idTipoNovedadNomiActual;
	}

	public void setidTipoNovedadNomiActual(Long idTipoNovedadNomiActual) {
		this.idTipoNovedadNomiActual = idTipoNovedadNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoNovedadNomi gettiponovedadnomi() {
		return this.tiponovedadnomi;
	}

	public void settiponovedadnomi(TipoNovedadNomi tiponovedadnomi) {
		this.tiponovedadnomi = tiponovedadnomi;
	}
	
	public TipoNovedadNomi gettiponovedadnomiAux() {
		return this.tiponovedadnomiAux;
	}

	public void settiponovedadnomiAux(TipoNovedadNomi tiponovedadnomiAux) {
		this.tiponovedadnomiAux = tiponovedadnomiAux;
	}				
	
	public TipoNovedadNomi gettiponovedadnomiAnterior() {
		return this.tiponovedadnomiAnterior;
	}

	public void settiponovedadnomiAnterior(TipoNovedadNomi tiponovedadnomiAnterior) {
		this.tiponovedadnomiAnterior = tiponovedadnomiAnterior;
	}	
	
	public TipoNovedadNomi gettiponovedadnomiTotales() {
		return this.tiponovedadnomiTotales;
	}

	public void settiponovedadnomiTotales(TipoNovedadNomi tiponovedadnomiTotales) {
		this.tiponovedadnomiTotales = tiponovedadnomiTotales;
	}	
	
	public TipoNovedadNomi gettiponovedadnomiBean() {
		return this.tiponovedadnomiBean;
	}

	public void settiponovedadnomiBean(TipoNovedadNomi tiponovedadnomiBean) {
		this.tiponovedadnomiBean = tiponovedadnomiBean;
	}	
	
	public TipoNovedadNomiParameterReturnGeneral gettiponovedadnomiReturnGeneral() {
		return this.tiponovedadnomiReturnGeneral;
	}

	public void settiponovedadnomiReturnGeneral(TipoNovedadNomiParameterReturnGeneral tiponovedadnomiReturnGeneral) {
		this.tiponovedadnomiReturnGeneral = tiponovedadnomiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoNovedadNomiLogic getTipoNovedadNomiLogic()	{		
		return tiponovedadnomiLogic;
	}

	public void setTipoNovedadNomiLogic(TipoNovedadNomiLogic tiponovedadnomiLogic) {
		this.tiponovedadnomiLogic = tiponovedadnomiLogic;
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
	
	public Boolean getIsEsNuevoTipoNovedadNomi() {
		return isEsNuevoTipoNovedadNomi;
	}

	public void setIsEsNuevoTipoNovedadNomi(Boolean isEsNuevoTipoNovedadNomi) {
		this.isEsNuevoTipoNovedadNomi = isEsNuevoTipoNovedadNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoNovedadNomi() {
		return esParaAccionDesdeFormularioTipoNovedadNomi;
	}
	
	public void setEsParaAccionDesdeFormularioTipoNovedadNomi(Boolean esParaAccionDesdeFormularioTipoNovedadNomi) {
		this.esParaAccionDesdeFormularioTipoNovedadNomi = esParaAccionDesdeFormularioTipoNovedadNomi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoNovedadNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoNovedadNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoNovedadNomi(this.tiponovedadnomiLogic.getTipoNovedadNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoNovedadNomiConstantesFunciones.refrescarForeignKeysDescripcionesTipoNovedadNomi(this.tiponovedadnomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiponovedadnomiLogic.setTipoNovedadNomis(this.tiponovedadnomis);
			tiponovedadnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoNovedadNomiParameterReturnGeneral getTipoNovedadNomiParameterGeneral() {
		return this.tiponovedadnomiParameterGeneral;
	}
	
	public void setTipoNovedadNomiParameterGeneral(TipoNovedadNomiParameterReturnGeneral tiponovedadnomiParameterGeneral) {
		this.tiponovedadnomiParameterGeneral = tiponovedadnomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoNovedadNomi() {
		return isPermisoTodoTipoNovedadNomi;
	}

	public void setIsPermisoTodoTipoNovedadNomi(Boolean isPermisoTodoTipoNovedadNomi) {
		this.isPermisoTodoTipoNovedadNomi = isPermisoTodoTipoNovedadNomi;
	}

	public Boolean getIsPermisoNuevoTipoNovedadNomi() {
		return isPermisoNuevoTipoNovedadNomi;
	}

	public void setIsPermisoNuevoTipoNovedadNomi(Boolean isPermisoNuevoTipoNovedadNomi) {
		this.isPermisoNuevoTipoNovedadNomi = isPermisoNuevoTipoNovedadNomi;
	}

	public Boolean getIsPermisoActualizarTipoNovedadNomi() {
		return isPermisoActualizarTipoNovedadNomi;
	}

	public void setIsPermisoActualizarTipoNovedadNomi(Boolean isPermisoActualizarTipoNovedadNomi) {
		this.isPermisoActualizarTipoNovedadNomi = isPermisoActualizarTipoNovedadNomi;
	}

	public Boolean getIsPermisoEliminarTipoNovedadNomi() {
		return isPermisoEliminarTipoNovedadNomi;
	}

	public void setIsPermisoEliminarTipoNovedadNomi(Boolean isPermisoEliminarTipoNovedadNomi) {
		this.isPermisoEliminarTipoNovedadNomi = isPermisoEliminarTipoNovedadNomi;
	}

	public Boolean getIsPermisoGuardarCambiosTipoNovedadNomi() {
		return isPermisoGuardarCambiosTipoNovedadNomi;
	}

	public void setIsPermisoGuardarCambiosTipoNovedadNomi(Boolean isPermisoGuardarCambiosTipoNovedadNomi) {
		this.isPermisoGuardarCambiosTipoNovedadNomi = isPermisoGuardarCambiosTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoConsultaTipoNovedadNomi() {
		return isPermisoConsultaTipoNovedadNomi;
	}

	public void setIsPermisoConsultaTipoNovedadNomi(Boolean isPermisoConsultaTipoNovedadNomi) {
		this.isPermisoConsultaTipoNovedadNomi = isPermisoConsultaTipoNovedadNomi;
	}

	public Boolean getIsPermisoBusquedaTipoNovedadNomi() {
		return isPermisoBusquedaTipoNovedadNomi;
	}

	public void setIsPermisoBusquedaTipoNovedadNomi(Boolean isPermisoBusquedaTipoNovedadNomi) {
		this.isPermisoBusquedaTipoNovedadNomi = isPermisoBusquedaTipoNovedadNomi;
	}

	public Boolean getIsPermisoReporteTipoNovedadNomi() {
		return isPermisoReporteTipoNovedadNomi;
	}

	public void setIsPermisoReporteTipoNovedadNomi(Boolean isPermisoReporteTipoNovedadNomi) {
		this.isPermisoReporteTipoNovedadNomi = isPermisoReporteTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoNovedadNomi() {
		return isPermisoPaginacionMedioTipoNovedadNomi;
	}

	public void setIsPermisoPaginacionMedioTipoNovedadNomi(Boolean isPermisoPaginacionMedioTipoNovedadNomi) {
		this.isPermisoPaginacionMedioTipoNovedadNomi = isPermisoPaginacionMedioTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoNovedadNomi() {
		return isPermisoPaginacionTodoTipoNovedadNomi;
	}

	public void setIsPermisoPaginacionTodoTipoNovedadNomi(Boolean isPermisoPaginacionTodoTipoNovedadNomi) {
		this.isPermisoPaginacionTodoTipoNovedadNomi = isPermisoPaginacionTodoTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoNovedadNomi() {
		return isPermisoPaginacionAltoTipoNovedadNomi;
	}

	public void setIsPermisoPaginacionAltoTipoNovedadNomi(Boolean isPermisoPaginacionAltoTipoNovedadNomi) {
		this.isPermisoPaginacionAltoTipoNovedadNomi = isPermisoPaginacionAltoTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoCopiarTipoNovedadNomi() {
		return isPermisoCopiarTipoNovedadNomi;
	}

	public void setIsPermisoCopiarTipoNovedadNomi(Boolean isPermisoCopiarTipoNovedadNomi) {
		this.isPermisoCopiarTipoNovedadNomi = isPermisoCopiarTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoVerFormTipoNovedadNomi() {
		return isPermisoVerFormTipoNovedadNomi;
	}

	public void setIsPermisoVerFormTipoNovedadNomi(Boolean isPermisoVerFormTipoNovedadNomi) {
		this.isPermisoVerFormTipoNovedadNomi = isPermisoVerFormTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoDuplicarTipoNovedadNomi() {
		return isPermisoDuplicarTipoNovedadNomi;
	}

	public void setIsPermisoDuplicarTipoNovedadNomi(Boolean isPermisoDuplicarTipoNovedadNomi) {
		this.isPermisoDuplicarTipoNovedadNomi = isPermisoDuplicarTipoNovedadNomi;
	}
	
	public Boolean getIsPermisoOrdenTipoNovedadNomi() {
		return isPermisoOrdenTipoNovedadNomi;
	}

	public void setIsPermisoOrdenTipoNovedadNomi(Boolean isPermisoOrdenTipoNovedadNomi) {
		this.isPermisoOrdenTipoNovedadNomi = isPermisoOrdenTipoNovedadNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoNovedadNomi() {
		return isVisibilidadCeldaNuevoTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaNuevoTipoNovedadNomi(Boolean isVisibilidadCeldaNuevoTipoNovedadNomi) {
		this.isVisibilidadCeldaNuevoTipoNovedadNomi = isVisibilidadCeldaNuevoTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoNovedadNomi() {
		return isVisibilidadCeldaDuplicarTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaDuplicarTipoNovedadNomi(Boolean isVisibilidadCeldaDuplicarTipoNovedadNomi) {
		this.isVisibilidadCeldaDuplicarTipoNovedadNomi = isVisibilidadCeldaDuplicarTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoNovedadNomi() {
		return isVisibilidadCeldaCopiarTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaCopiarTipoNovedadNomi(Boolean isVisibilidadCeldaCopiarTipoNovedadNomi) {
		this.isVisibilidadCeldaCopiarTipoNovedadNomi = isVisibilidadCeldaCopiarTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoNovedadNomi() {
		return isVisibilidadCeldaVerFormTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaVerFormTipoNovedadNomi(Boolean isVisibilidadCeldaVerFormTipoNovedadNomi) {
		this.isVisibilidadCeldaVerFormTipoNovedadNomi = isVisibilidadCeldaVerFormTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoNovedadNomi() {
		return isVisibilidadCeldaOrdenTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaOrdenTipoNovedadNomi(Boolean isVisibilidadCeldaOrdenTipoNovedadNomi) {
		this.isVisibilidadCeldaOrdenTipoNovedadNomi = isVisibilidadCeldaOrdenTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoNovedadNomi() {
		return isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoNovedadNomi(Boolean isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi) {
		this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi = isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoNovedadNomi() {
		return isVisibilidadCeldaModificarTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaModificarTipoNovedadNomi(Boolean isVisibilidadCeldaModificarTipoNovedadNomi) {
		this.isVisibilidadCeldaModificarTipoNovedadNomi = isVisibilidadCeldaModificarTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoNovedadNomi() {
		return isVisibilidadCeldaActualizarTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaActualizarTipoNovedadNomi(Boolean isVisibilidadCeldaActualizarTipoNovedadNomi) {
		this.isVisibilidadCeldaActualizarTipoNovedadNomi = isVisibilidadCeldaActualizarTipoNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoNovedadNomi() {
		return isVisibilidadCeldaEliminarTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaEliminarTipoNovedadNomi(Boolean isVisibilidadCeldaEliminarTipoNovedadNomi) {
		this.isVisibilidadCeldaEliminarTipoNovedadNomi = isVisibilidadCeldaEliminarTipoNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoNovedadNomi() {
		return isVisibilidadCeldaCancelarTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaCancelarTipoNovedadNomi(Boolean isVisibilidadCeldaCancelarTipoNovedadNomi) {
		this.isVisibilidadCeldaCancelarTipoNovedadNomi = isVisibilidadCeldaCancelarTipoNovedadNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoNovedadNomi() {
		return isVisibilidadCeldaGuardarTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaGuardarTipoNovedadNomi(Boolean isVisibilidadCeldaGuardarTipoNovedadNomi) {
		this.isVisibilidadCeldaGuardarTipoNovedadNomi = isVisibilidadCeldaGuardarTipoNovedadNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoNovedadNomi() {
		return isVisibilidadCeldaGuardarCambiosTipoNovedadNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoNovedadNomi(Boolean isVisibilidadCeldaGuardarCambiosTipoNovedadNomi) {
		this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi = isVisibilidadCeldaGuardarCambiosTipoNovedadNomi;
	}
		
	public TipoNovedadNomiSessionBean gettiponovedadnomiSessionBean() {
		return this.tiponovedadnomiSessionBean;
	}
	
	public void settiponovedadnomiSessionBean(TipoNovedadNomiSessionBean tiponovedadnomiSessionBean) {
		this.tiponovedadnomiSessionBean=tiponovedadnomiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoNovedadNomi tiponovedadnomi,TipoNovedadNomi tiponovedadnomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoNovedadNomi(tiponovedadnomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiponovedadnomiAux.setId(tiponovedadnomi.getId());
		tiponovedadnomiAux.setVersionRow(tiponovedadnomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoNovedadNomi();
		
			int intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiponovedadnomiValidator.getInvalidValues(this.tiponovedadnomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiponovedadnomiLogic.setDatosCliente(datosCliente);
			tiponovedadnomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiponovedadnomiAux=new  TipoNovedadNomi();
				
				tiponovedadnomiAux.setIsNew(true);
				tiponovedadnomiAux.setIsChanged(true);
				
				tiponovedadnomiAux.setTipoNovedadNomiOriginal(this.tiponovedadnomi);
				
				tiponovedadnomiAux.setId(this.tiponovedadnomi.getId());	
				tiponovedadnomiAux.setVersionRow(this.tiponovedadnomi.getVersionRow());	
				tiponovedadnomiAux.setcodigo(this.tiponovedadnomi.getcodigo());	
				tiponovedadnomiAux.setnombre(this.tiponovedadnomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiponovedadnomiAux,tiponovedadnomiLogic.getTipoNovedadNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponovedadnomiAux,tiponovedadnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponovedadnomiLogic.saveTipoNovedadNomis();//WithConnection
						//tiponovedadnomiLogic.getSetVersionRowTipoNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponovedadnomi,tiponovedadnomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis().addAll(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis.addAll(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponovedadnomiLogic.saveTipoNovedadNomiRelaciones(tiponovedadnomiAux,this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());//WithConnection
								//tiponovedadnomiLogic.getSetVersionRowTipoNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponovedadnomi,tiponovedadnomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis= new ArrayList<NovedadNomi>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponovedadnomiAux.setNovedadNomis(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponovedadnomiAux,tiponovedadnomiLogic.getTipoNovedadNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponovedadnomiAux,tiponovedadnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponovedadnomi,tiponovedadnomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiponovedadnomiAux=new  TipoNovedadNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado() 
					|| (this.tiponovedadnomiSessionBean.getEsGuardarRelacionado() && this.tiponovedadnomi.getId()>=0)) {
						
					tiponovedadnomiAux.setIsNew(false);
				}
				
				tiponovedadnomiAux.setIsDeleted(false);
			
				tiponovedadnomiAux.setId(this.tiponovedadnomi.getId());	
				tiponovedadnomiAux.setVersionRow(this.tiponovedadnomi.getVersionRow());	
				tiponovedadnomiAux.setcodigo(this.tiponovedadnomi.getcodigo());	
				tiponovedadnomiAux.setnombre(this.tiponovedadnomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponovedadnomiAux,tiponovedadnomiLogic.getTipoNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponovedadnomiAux,tiponovedadnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponovedadnomiLogic.saveTipoNovedadNomis();//WithConnection
						//tiponovedadnomiLogic.getSetVersionRowTipoNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponovedadnomi,tiponovedadnomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis().addAll(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis.addAll(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponovedadnomiLogic.saveTipoNovedadNomiRelaciones(tiponovedadnomiAux,this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());//WithConnection
								//tiponovedadnomiLogic.getSetVersionRowTipoNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponovedadnomi,tiponovedadnomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis= new ArrayList<NovedadNomi>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponovedadnomiAux.setNovedadNomis(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponovedadnomiAux,tiponovedadnomiLogic.getTipoNovedadNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponovedadnomiAux,tiponovedadnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponovedadnomi,tiponovedadnomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiponovedadnomiAux=new  TipoNovedadNomi();
				
				tiponovedadnomiAux.setIsNew(false);
				tiponovedadnomiAux.setIsChanged(false);
				
				tiponovedadnomiAux.setIsDeleted(true);
				
				tiponovedadnomiAux.setId(this.tiponovedadnomi.getId());	
				tiponovedadnomiAux.setVersionRow(this.tiponovedadnomi.getVersionRow());	
				tiponovedadnomiAux.setcodigo(this.tiponovedadnomi.getcodigo());	
				tiponovedadnomiAux.setnombre(this.tiponovedadnomi.getnombre());	
				
				if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiponovedadnomiAux.getId()>=0) {	
						this.tiponovedadnomisEliminados.add(tiponovedadnomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiponovedadnomiAux,tiponovedadnomiLogic.getTipoNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponovedadnomiAux,tiponovedadnomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponovedadnomiLogic.saveTipoNovedadNomis();//WithConnection
						//tiponovedadnomiLogic.getSetVersionRowTipoNovedadNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis().addAll(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis.addAll(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponovedadnomiLogic.saveTipoNovedadNomiRelaciones(tiponovedadnomiAux,this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());//WithConnection
								//tiponovedadnomiLogic.getSetVersionRowTipoNovedadNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(new ArrayList<NovedadNomi>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis= new ArrayList<NovedadNomi>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.quitarFilaTotales();}
							tiponovedadnomiAux.setNovedadNomis(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiponovedadnomiAux,tiponovedadnomiLogic.getTipoNovedadNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiponovedadnomiAux,tiponovedadnomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.getTipoNovedadNomis().addAll(this.tiponovedadnomisEliminados);
					
					tiponovedadnomiLogic.saveTipoNovedadNomis();//WithConnection
					//tiponovedadnomiLogic.getSetVersionRowTipoNovedadNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiponovedadnomisEliminados= new ArrayList<TipoNovedadNomi>();		
			}
			
			if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Novedad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiponovedadnomi=tiponovedadnomiAux;
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
      		//this.finishProcessTipoNovedadNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoNovedadNomi tiponovedadnomiLocal) throws Exception {
		
		if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiponovedadnomiLocal.setNovedadNomis(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
			
			} else {
			
				tiponovedadnomiLocal.setNovedadNomis(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoNovedadNomi tiponovedadnomiLocal) throws Exception {	
		if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoNovedadNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiponovedadnomiValidator.getInvalidValues(this.tiponovedadnomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoNovedadNomi tiponovedadnomi,List<TipoNovedadNomi> tiponovedadnomis) throws Exception {
		try	{		
			TipoNovedadNomiConstantesFunciones.actualizarLista(tiponovedadnomi,tiponovedadnomis,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoNovedadNomi tiponovedadnomi,List<TipoNovedadNomi> tiponovedadnomis) throws Exception {
		try	{			
			TipoNovedadNomiConstantesFunciones.actualizarSelectedLista(tiponovedadnomi,tiponovedadnomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoNovedadNomi> tiponovedadnomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiponovedadnomisLocal=this.tiponovedadnomiLogic.getTipoNovedadNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiponovedadnomisLocal=this.tiponovedadnomis;
			}
			//ARCHITECTURE
		
			for(TipoNovedadNomi tiponovedadnomiLocal:tiponovedadnomisLocal) {
				if(this.permiteMantenimiento(tiponovedadnomiLocal) && tiponovedadnomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoNovedadNomiConstantesFunciones.getTipoNovedadNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoNovedadNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNovedadNomi.jLabelcodigoTipoNovedadNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoNovedadNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNovedadNomi.jLabelnombreTipoNovedadNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNovedadNomi.jLabelcodigoTipoNovedadNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNovedadNomi.jLabelnombreTipoNovedadNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("NovedadNomi")) {
			if(this.tiponovedadnomi==null) {
				this.tiponovedadnomi= new TipoNovedadNomi();
			}

			if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoNovedadNomi
				this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);

				this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getnovedadnomi().setTipoNovedadNomi(this.tiponovedadnomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoNovedadNomi--;	
		
		
		this.tiponovedadnomiAux=new TipoNovedadNomi();
		
		this.tiponovedadnomiAux.setId(this.iIdNuevoTipoNovedadNomi);
		this.tiponovedadnomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponovedadnomiLogic.getTipoNovedadNomis().add(this.tiponovedadnomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiponovedadnomis.add(this.tiponovedadnomiAux);
		}
		//ARCHITECTURE
		
		this.tiponovedadnomi=this.tiponovedadnomiAux;
		
		if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoNovedadNomi(this.tiponovedadnomi);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNovedadNomi(this.tiponovedadnomi);
		}
				
		//this.setDefaultControlesTipoNovedadNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoNovedadNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoNovedadNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNovedadNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNovedadNomi(this.tiponovedadnomiBean,this.tiponovedadnomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
			classes=TipoNovedadNomiConstantesFunciones.getClassesRelationshipsOfTipoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiponovedadnomiReturnGeneral=tiponovedadnomiLogic.procesarEventosTipoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponovedadnomiLogic.getTipoNovedadNomis(),this.tiponovedadnomi,this.tiponovedadnomiParameterGeneral,this.isEsNuevoTipoNovedadNomi,classes);//this.tiponovedadnomiLogic.getTipoNovedadNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoNovedadNomi(this.tiponovedadnomiReturnGeneral,this.tiponovedadnomiBean,false);
		
		if(this.tiponovedadnomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNovedadNomi(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoNovedadNomi(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi());
		}
		
		if(this.tiponovedadnomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoNovedadNomi(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi(),classes);//this.tiponovedadnomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoNovedadNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoNovedadNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.RecargarFormTipoNovedadNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoNovedadNomi(false);
						
			if(tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getEsGuardarRelacionado() && NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNovedadNomiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNovedadNomi();
			}
			
			this.actualizarVisualTableDatosTipoNovedadNomi();
			
			this.jTableDatosTipoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoTipoNovedadNomi(), this.getIndiceNuevoTipoNovedadNomi());
			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
						
			this.actualizarEstadoCeldasBotonesTipoNovedadNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoNovedadNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.setEnabled(isHabilitar && this.tiponovedadnomiConstantesFunciones.activarcodigoTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.setEnabled(isHabilitar && this.tiponovedadnomiConstantesFunciones.activarnombreTipoNovedadNomi);	
		
	};
	
	public void setDefaultControlesTipoNovedadNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoNovedadNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiponovedadnomiSessionBean.setConGuardarRelaciones(true);			
			this.tiponovedadnomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiponovedadnomiSessionBean.setConGuardarRelaciones(false);			
			this.tiponovedadnomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoNovedadNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
				if(tiponovedadnomiAux.getId().equals(this.iIdNuevoTipoNovedadNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomis) {
				if(tiponovedadnomiAux.getId().equals(this.iIdNuevoTipoNovedadNomi)) {
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
	
	public int getIndiceActualTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
				if(tiponovedadnomiAux.getId().equals(tiponovedadnomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomis) {
				if(tiponovedadnomiAux.getId().equals(tiponovedadnomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoNovedadNomi(TipoNovedadNomi tiponovedadnomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
				if(tiponovedadnomiAux.getTipoNovedadNomiOriginal().getId().equals(tiponovedadnomiOriginal.getId())) {
					existe=true;
					tiponovedadnomiOriginal.setId(tiponovedadnomiAux.getId());
					tiponovedadnomiOriginal.setVersionRow(tiponovedadnomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomis) {
				if(tiponovedadnomiAux.getTipoNovedadNomiOriginal().getId().equals(tiponovedadnomiOriginal.getId())) {
					existe=true;
					tiponovedadnomiOriginal.setId(tiponovedadnomiAux.getId());
					tiponovedadnomiOriginal.setVersionRow(tiponovedadnomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoNovedadNomi(Boolean esParaCancelar) throws Exception {
		tiponovedadnomisAux=new ArrayList<TipoNovedadNomi>();
		tiponovedadnomiAux=new TipoNovedadNomi();
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
					if(tiponovedadnomiAux.getId()<0) {
						tiponovedadnomisAux.add(tiponovedadnomiAux);
					}		
				}
				this.iIdNuevoTipoNovedadNomi=0L;
				this.tiponovedadnomiLogic.getTipoNovedadNomis().removeAll(tiponovedadnomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomis) {
					if(tiponovedadnomiAux.getId()<0) {
						tiponovedadnomisAux.add(tiponovedadnomiAux);
					}		
				}
				this.iIdNuevoTipoNovedadNomi=0L;
				this.tiponovedadnomis.removeAll(tiponovedadnomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoNovedadNomi 
					&& this.tiponovedadnomiLogic.getTipoNovedadNomis().size()>0
					) {
					tiponovedadnomiAux=this.tiponovedadnomiLogic.getTipoNovedadNomis().get(this.tiponovedadnomiLogic.getTipoNovedadNomis().size() - 1);
				
					if(tiponovedadnomiAux.getId()<0) {
						this.tiponovedadnomiLogic.getTipoNovedadNomis().remove(tiponovedadnomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoNovedadNomi && this.tiponovedadnomis.size()>0) {
					tiponovedadnomiAux=this.tiponovedadnomis.get(this.tiponovedadnomis.size() - 1);
				
					if(tiponovedadnomiAux.getId()<0) {
						this.tiponovedadnomis.remove(tiponovedadnomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoNovedadNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiponovedadnomi.getId()<0) {
				this.tiponovedadnomiLogic.getTipoNovedadNomis().remove(this.tiponovedadnomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiponovedadnomi.getId()<0) {
				this.tiponovedadnomis.remove(this.tiponovedadnomi);
			}
		}			
	}
	
	public void setEstadosInicialesTipoNovedadNomi(List<TipoNovedadNomi> tiponovedadnomisAux) throws Exception {
		TipoNovedadNomiConstantesFunciones.setEstadosInicialesTipoNovedadNomi(tiponovedadnomisAux);
	}
	
	public void setEstadosInicialesTipoNovedadNomi(TipoNovedadNomi tiponovedadnomiAux) throws Exception {
		TipoNovedadNomiConstantesFunciones.setEstadosInicialesTipoNovedadNomi(tiponovedadnomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoNovedadNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoNovedadNomiActual()) {
				if(!this.isEsNuevoTipoNovedadNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoNovedadNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoNovedadNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Novedad ?", "MANTENIMIENTO DE Tipo Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoNovedadNomi tiponovedadnomi) throws Exception {
		TipoNovedadNomiConstantesFunciones.seleccionarAsignar(this.tiponovedadnomi,tiponovedadnomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoNovedadNomi=this.isPermisoActualizarOriginalTipoNovedadNomi;
			
			
			this.seleccionarAsignar(tiponovedadnomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNovedadNomiConstantesFunciones.quitarEspaciosTipoNovedadNomi(this.tiponovedadnomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiponovedadnomiSessionBean.setsFuncionBusquedaRapida(this.tiponovedadnomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoNovedadNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoNovedadNomi(esParaCancelar);				
				this.cancelarNuevoTipoNovedadNomi(esParaCancelar);								
			}
			
			this.tiponovedadnomi=new TipoNovedadNomi();
			
			this.inicializarTipoNovedadNomi();
			
			this.actualizarEstadoCeldasBotonesTipoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoNovedadNomi() throws Exception {
		try {
			TipoNovedadNomiConstantesFunciones.inicializarTipoNovedadNomi(this.tiponovedadnomi);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiponovedadnomiLogic.getTipoNovedadNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoNovedadNomis(String sAccionBusqueda,List<TipoNovedadNomi> tiponovedadnomisParaReportes) throws Exception {
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
					sPathReporteFinal="TipoNovedadNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoNovedadNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoNovedadNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoNovedadNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Novedads");		
		parameters.put("busquedapor", TipoNovedadNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(NovedadNomi.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoNovedadNomiLogic tiponovedadnomiLogicAuxiliar=new TipoNovedadNomiLogic();
					tiponovedadnomiLogicAuxiliar.setDatosCliente(tiponovedadnomiLogic.getDatosCliente());				
					tiponovedadnomiLogicAuxiliar.setTipoNovedadNomis(tiponovedadnomisParaReportes);
					
					tiponovedadnomiLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoNovedadNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiponovedadnomisParaReportes=tiponovedadnomiLogicAuxiliar.getTipoNovedadNomis();
					
					//tiponovedadnomiLogic.getNewConnexionToDeep();
					
					//for (TipoNovedadNomi tiponovedadnomi:tiponovedadnomisParaReportes) {
					//	tiponovedadnomiLogic.deepLoad(tiponovedadnomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiponovedadnomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiponovedadnomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileNovedadNomi = AuxiliarReportes.class.getResourceAsStream("NovedadNomiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_novedadnomi", reportFileNovedadNomi);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoNovedadNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoNovedadNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoNovedadNomi=new JRBeanArrayDataSource(TipoNovedadNomiJInternalFrame.TraerTipoNovedadNomiBeans(tiponovedadnomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoNovedadNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoNovedadNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoNovedadNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoNovedadNomiBean.TraerTipoNovedadNomiBeans(tiponovedadnomisParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,tiponovedadnomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,tiponovedadnomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomiActionPerformed(null);
					//this.generarExcelReporteTipoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,tiponovedadnomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,tiponovedadnomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,tiponovedadnomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoNovedadNomis(sAccionBusqueda,sTipoArchivoReporte,tiponovedadnomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNovedadNomi> tiponovedadnomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponovedadnomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNovedadNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNovedadNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoNovedadNomi tiponovedadnomi : tiponovedadnomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoNovedadNomiConstantesFunciones.generarExcelReporteDataTipoNovedadNomi("NORMAL",row,workbook,tiponovedadnomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoNovedadNomi(String sTipo,Row row,Workbook workbook) {
		
		TipoNovedadNomiConstantesFunciones.generarExcelReporteHeaderTipoNovedadNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNovedadNomi> tiponovedadnomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponovedadnomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNovedadNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoNovedadNomi tiponovedadnomi : tiponovedadnomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoNovedadNomiConstantesFunciones.getTipoNovedadNomiDescripcion(tiponovedadnomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponovedadnomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponovedadnomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoNovedadNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNovedadNomi> tiponovedadnomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoNovedadNomi> tiponovedadnomisRespaldo=null;
		
		classes=TipoNovedadNomiConstantesFunciones.getClassesRelationshipsOfTipoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiponovedadnomiLogic.setDatosCliente(this.datosCliente);
		this.tiponovedadnomiLogic.setDatosDeep(this.datosDeep);
		this.tiponovedadnomiLogic.setIsConDeep(true);
		
		tiponovedadnomisRespaldo=this.tiponovedadnomiLogic.getTipoNovedadNomis();
		
		this.tiponovedadnomiLogic.setTipoNovedadNomis(tiponovedadnomisParaReportes);	
		this.tiponovedadnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiponovedadnomisParaReportes=this.tiponovedadnomiLogic.getTipoNovedadNomis();
		this.tiponovedadnomiLogic.setTipoNovedadNomis(tiponovedadnomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponovedadnomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNovedadNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNovedadNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoNovedadNomi tiponovedadnomi : tiponovedadnomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoNovedadNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoNovedadNomiConstantesFunciones.generarExcelReporteDataTipoNovedadNomi("NORMAL",row,workbook,tiponovedadnomi,cellStyleDataAux);
		
			
			


				//NovedadNomi
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NovedadNomiConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiponovedadnomi.getNovedadNomis()!=null && tiponovedadnomi.getNovedadNomis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NovedadNomiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NovedadNomiConstantesFunciones.generarExcelReporteHeaderNovedadNomi("RELACIONADO",row,workbook);
				}

				if(tiponovedadnomi.getNovedadNomis()!=null) {
					i2=0;
					for(NovedadNomi novedadnomi : tiponovedadnomi.getNovedadNomis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NovedadNomiConstantesFunciones.generarExcelReporteDataNovedadNomi("RELACIONADO",row,workbook,novedadnomi,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoNovedadNomiConstantesFunciones.getTipoNovedadNomiDescripcion(tiponovedadnomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoNovedadNomi() throws Exception {		
		this.startProcessTipoNovedadNomi(true);
	}
	
	public void startProcessTipoNovedadNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoNovedadNomi, this.jScrollPanelDatosTipoNovedadNomi,this.jPanelPaginacionTipoNovedadNomi, this.jScrollPanelDatosEdicionTipoNovedadNomi, this.jPanelAccionesTipoNovedadNomi,this.jPanelAccionesFormularioTipoNovedadNomi,this.jmenuBarTipoNovedadNomi,this.jmenuBarDetalleTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,this.jTtoolBarDetalleTipoNovedadNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNovedadNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoNovedadNomi=this.jPanelParametrosReportesTipoNovedadNomi;
		//final JScrollPane jScrollPanelDatosTipoNovedadNomi=this.jScrollPanelDatosTipoNovedadNomi;
		final JTable jTableDatosTipoNovedadNomi=this.jTableDatosTipoNovedadNomi;		
		final JPanel jPanelPaginacionTipoNovedadNomi=this.jPanelPaginacionTipoNovedadNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoNovedadNomi=this.jScrollPanelDatosEdicionTipoNovedadNomi;
		final JPanel jPanelAccionesTipoNovedadNomi=this.jPanelAccionesTipoNovedadNomi;
		
		JPanel jPanelCamposAuxiliarTipoNovedadNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoNovedadNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			jPanelCamposAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jPanelCamposTipoNovedadNomi;
			jPanelAccionesFormularioAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jPanelAccionesFormularioTipoNovedadNomi;
		}
		
		final JPanel jPanelCamposTipoNovedadNomi=jPanelCamposAuxiliarTipoNovedadNomi;
		final JPanel jPanelAccionesFormularioTipoNovedadNomi=jPanelAccionesFormularioAuxiliarTipoNovedadNomi;
		
		
		final JMenuBar jmenuBarTipoNovedadNomi=this.jmenuBarTipoNovedadNomi;
		final JToolBar jTtoolBarTipoNovedadNomi=this.jTtoolBarTipoNovedadNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoNovedadNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNovedadNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			jmenuBarDetalleAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jmenuBarDetalleTipoNovedadNomi;
			jTtoolBarDetalleAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jTtoolBarDetalleTipoNovedadNomi;
		}
		
		final JMenuBar jmenuBarDetalleTipoNovedadNomi=jmenuBarDetalleAuxiliarTipoNovedadNomi;
		final JToolBar jTtoolBarDetalleTipoNovedadNomi=jTtoolBarDetalleAuxiliarTipoNovedadNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNovedadNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNovedadNomi;
			processRunnable.jTableDatos=jTableDatosTipoNovedadNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoNovedadNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNovedadNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNovedadNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNovedadNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNovedadNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNovedadNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoNovedadNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNovedadNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoNovedadNomi ,jPanelParametrosReportesTipoNovedadNomi,jTableDatosTipoNovedadNomi, /*jScrollPanelDatosTipoNovedadNomi,*/jPanelCamposTipoNovedadNomi,jPanelPaginacionTipoNovedadNomi, /*jScrollPanelDatosEdicionTipoNovedadNomi,*/ jPanelAccionesTipoNovedadNomi,jPanelAccionesFormularioTipoNovedadNomi,jmenuBarTipoNovedadNomi,jmenuBarDetalleTipoNovedadNomi,jTtoolBarTipoNovedadNomi,jTtoolBarDetalleTipoNovedadNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoNovedadNomi, jScrollPanelDatosTipoNovedadNomi,jPanelPaginacionTipoNovedadNomi, jScrollPanelDatosEdicionTipoNovedadNomi, jPanelAccionesTipoNovedadNomi,jPanelAccionesFormularioTipoNovedadNomi,jmenuBarTipoNovedadNomi,jmenuBarDetalleTipoNovedadNomi,jTtoolBarTipoNovedadNomi,jTtoolBarDetalleTipoNovedadNomi);
						
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
	
	public void finishProcessTipoNovedadNomi() {// throws Exception 
		this.finishProcessTipoNovedadNomi(true);
	}
	
	public void finishProcessTipoNovedadNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoNovedadNomi, this.jScrollPanelDatosTipoNovedadNomi,this.jPanelPaginacionTipoNovedadNomi, this.jScrollPanelDatosEdicionTipoNovedadNomi, this.jPanelAccionesTipoNovedadNomi,this.jPanelAccionesFormularioTipoNovedadNomi,this.jmenuBarTipoNovedadNomi,this.jmenuBarDetalleTipoNovedadNomi,this.jTtoolBarTipoNovedadNomi,this.jTtoolBarDetalleTipoNovedadNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNovedadNomi=null; 
		
		final JPanel jPanelParametrosReportesTipoNovedadNomi=this.jPanelParametrosReportesTipoNovedadNomi;
		//final JScrollPane jScrollPanelDatosTipoNovedadNomi=this.jScrollPanelDatosTipoNovedadNomi;
		final JTable jTableDatosTipoNovedadNomi=this.jTableDatosTipoNovedadNomi;		
		final JPanel jPanelPaginacionTipoNovedadNomi=this.jPanelPaginacionTipoNovedadNomi;
		//final JScrollPane jScrollPanelDatosEdicionTipoNovedadNomi=this.jScrollPanelDatosEdicionTipoNovedadNomi;
		final JPanel jPanelAccionesTipoNovedadNomi=this.jPanelAccionesTipoNovedadNomi;
		
		JPanel jPanelCamposAuxiliarTipoNovedadNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoNovedadNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			jPanelCamposAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jPanelCamposTipoNovedadNomi;
			jPanelAccionesFormularioAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jPanelAccionesFormularioTipoNovedadNomi;
		}
		
		final JPanel jPanelCamposTipoNovedadNomi=jPanelCamposAuxiliarTipoNovedadNomi;
		final JPanel jPanelAccionesFormularioTipoNovedadNomi=jPanelAccionesFormularioAuxiliarTipoNovedadNomi;
		
		
		final JMenuBar jmenuBarTipoNovedadNomi=this.jmenuBarTipoNovedadNomi;		
		final JToolBar jTtoolBarTipoNovedadNomi=this.jTtoolBarTipoNovedadNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoNovedadNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNovedadNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			jmenuBarDetalleAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jmenuBarDetalleTipoNovedadNomi;
			jTtoolBarDetalleAuxiliarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jTtoolBarDetalleTipoNovedadNomi;		
		}
		
		final JMenuBar jmenuBarDetalleTipoNovedadNomi=jmenuBarDetalleAuxiliarTipoNovedadNomi;
		final JToolBar jTtoolBarDetalleTipoNovedadNomi=jTtoolBarDetalleAuxiliarTipoNovedadNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNovedadNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNovedadNomi;
			processRunnable.jTableDatos=jTableDatosTipoNovedadNomi;
			processRunnable.jPanelCampos=jPanelCamposTipoNovedadNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNovedadNomi;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNovedadNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNovedadNomi;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNovedadNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNovedadNomi;
			processRunnable.jTtoolBar=jTtoolBarTipoNovedadNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNovedadNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoNovedadNomi ,jPanelParametrosReportesTipoNovedadNomi, jTableDatosTipoNovedadNomi,/*jScrollPanelDatosTipoNovedadNomi,*/jPanelCamposTipoNovedadNomi,jPanelPaginacionTipoNovedadNomi, /*jScrollPanelDatosEdicionTipoNovedadNomi,*/ jPanelAccionesTipoNovedadNomi,jPanelAccionesFormularioTipoNovedadNomi,jmenuBarTipoNovedadNomi,jmenuBarDetalleTipoNovedadNomi,jTtoolBarTipoNovedadNomi,jTtoolBarDetalleTipoNovedadNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoNovedadNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoNovedadNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoNovedadNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoNovedadNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoNovedadNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoNovedadNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoNovedadNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiponovedadnomiConstantesFunciones.getsFinalQueryTipoNovedadNomi();
		String  finalQueryPaginacionTodos=this.tiponovedadnomiConstantesFunciones.getsFinalQueryTipoNovedadNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesNoTipoNovedadNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoNovedadNomiConstantesFunciones.getArrayColumnasGlobalesTipoNovedadNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoNovedadNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiponovedadnomisEliminados= new ArrayList<TipoNovedadNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoNovedadNomi();
		
				///*TipoNovedadNomiSessionBean*/this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
			
			if(this.tiponovedadnomiSessionBean==null) {
				this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
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
					this.iNumeroPaginacion=TipoNovedadNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoNovedadNomiConstantesFunciones.getClassesForeignKeysOfTipoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiponovedadnomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiponovedadnomisAux= new ArrayList<TipoNovedadNomi>();
			
				
			tiponovedadnomiLogic.setDatosCliente(this.datosCliente);
			tiponovedadnomiLogic.setDatosDeep(this.datosDeep);
			tiponovedadnomiLogic.setIsConDeep(true);
			
			
			tiponovedadnomiLogic.getTipoNovedadNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiponovedadnomiLogic.getTodosTipoNovedadNomis(finalQueryGlobal,pagination);
					
					//tiponovedadnomiLogic.getTodosTipoNovedadNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiponovedadnomiLogic.getTipoNovedadNomis()==null|| tiponovedadnomiLogic.getTipoNovedadNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponovedadnomisAux= new ArrayList<TipoNovedadNomi>();
							tiponovedadnomisAux.addAll(tiponovedadnomiLogic.getTipoNovedadNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponovedadnomisAux= new ArrayList<TipoNovedadNomi>();
							tiponovedadnomisAux.addAll(tiponovedadnomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponovedadnomiLogic.getTodosTipoNovedadNomis(finalQueryGlobal+"",this.pagination);												
							
							//tiponovedadnomiLogic.getTodosTipoNovedadNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomiLogic.getTipoNovedadNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponovedadnomiLogic.setTipoNovedadNomis(new ArrayList<TipoNovedadNomi>());					
							tiponovedadnomiLogic.getTipoNovedadNomis().addAll(tiponovedadnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponovedadnomis=new ArrayList<TipoNovedadNomi>();
							tiponovedadnomis.addAll(tiponovedadnomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoNovedadNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoNovedadNomi=this.idActual;
				
				} else if(this.idTipoNovedadNomiActual!=null && this.idTipoNovedadNomiActual!=0L) {
					idTipoNovedadNomi=idTipoNovedadNomiActual;
				}
				
					
				this.sDetalleReporte=TipoNovedadNomiConstantesFunciones.getDetalleIndicePorId(idTipoNovedadNomi);
				
				this.tiponovedadnomis=new ArrayList<TipoNovedadNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiponovedadnomiLogic.getEntity(idTipoNovedadNomi);
					
					//tiponovedadnomiLogic.getEntityWithConnection(idTipoNovedadNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponovedadnomiLogic.setTipoNovedadNomis(new ArrayList<TipoNovedadNomi>());
					tiponovedadnomiLogic.getTipoNovedadNomis().add(tiponovedadnomiLogic.getTipoNovedadNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponovedadnomis=new ArrayList<TipoNovedadNomi>();
					this.tiponovedadnomis.add(tiponovedadnomi);
				}
				
				if(tiponovedadnomiLogic.getTipoNovedadNomi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoNovedadNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoNovedadNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponovedadnomiLogic.getTipoNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponovedadnomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponovedadnomiLogic.getTipoNovedadNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponovedadnomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoNovedadNomi tiponovedadnomi) {
		Boolean permite=true;
		
		if(this.tiponovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoNovedadNomiConstantesFunciones.getOrderByListaTipoNovedadNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoNovedadNomiConstantesFunciones.getOrderByListaTipoNovedadNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNovedadNomi tiponovedadnomi:tiponovedadnomiLogic.getTipoNovedadNomis()) {
				if(tiponovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					tiponovedadnomiTotales=tiponovedadnomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNovedadNomi tiponovedadnomi:this.tiponovedadnomis) {
				if(tiponovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					tiponovedadnomiTotales=tiponovedadnomi;
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
			this.tiponovedadnomiAux=new TipoNovedadNomi();
			this.tiponovedadnomiAux.setsType(Constantes2.S_TOTALES);
			this.tiponovedadnomiAux.setIsNew(false);
			this.tiponovedadnomiAux.setIsChanged(false);
			this.tiponovedadnomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoNovedadNomiConstantesFunciones.TotalizarValoresFilaTipoNovedadNomi(this.tiponovedadnomiLogic.getTipoNovedadNomis(),this.tiponovedadnomiAux);
				
				this.tiponovedadnomiLogic.getTipoNovedadNomis().add(this.tiponovedadnomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoNovedadNomiConstantesFunciones.TotalizarValoresFilaTipoNovedadNomi(this.tiponovedadnomis,this.tiponovedadnomiAux);
				
				this.tiponovedadnomis.add(this.tiponovedadnomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiponovedadnomiTotales=new TipoNovedadNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponovedadnomiLogic.getTipoNovedadNomis().remove(tiponovedadnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponovedadnomis.remove(tiponovedadnomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiponovedadnomiTotales=new TipoNovedadNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNovedadNomi tiponovedadnomi:tiponovedadnomiLogic.getTipoNovedadNomis()) {
				if(tiponovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					tiponovedadnomiTotales=tiponovedadnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNovedadNomiConstantesFunciones.TotalizarValoresFilaTipoNovedadNomi(this.tiponovedadnomiLogic.getTipoNovedadNomis(),tiponovedadnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNovedadNomi tiponovedadnomi:this.tiponovedadnomis) {
				if(tiponovedadnomi.getsType().equals(Constantes2.S_TOTALES)) {
					tiponovedadnomiTotales=tiponovedadnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNovedadNomiConstantesFunciones.TotalizarValoresFilaTipoNovedadNomi(this.tiponovedadnomis,tiponovedadnomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoNovedadNomi() {
		this.isPermisoTodoTipoNovedadNomi=false;
		this.isPermisoNuevoTipoNovedadNomi=false;
		this.isPermisoActualizarTipoNovedadNomi=false;
		this.isPermisoActualizarOriginalTipoNovedadNomi=false;
		this.isPermisoEliminarTipoNovedadNomi=false;
		this.isPermisoGuardarCambiosTipoNovedadNomi=false;
		this.isPermisoConsultaTipoNovedadNomi=false;
		this.isPermisoBusquedaTipoNovedadNomi=false;
		this.isPermisoReporteTipoNovedadNomi=false;		
		this.isPermisoOrdenTipoNovedadNomi=false;		
		this.isPermisoPaginacionMedioTipoNovedadNomi=false;		
		this.isPermisoPaginacionAltoTipoNovedadNomi=false;
		this.isPermisoPaginacionTodoTipoNovedadNomi=false;
		this.isPermisoCopiarTipoNovedadNomi=false;		
		this.isPermisoVerFormTipoNovedadNomi=false;		
		this.isPermisoDuplicarTipoNovedadNomi=false;		
		this.isPermisoOrdenTipoNovedadNomi=false;		
	}
	
	public void setPermisosUsuarioTipoNovedadNomi(Boolean isPermiso) {
		this.isPermisoTodoTipoNovedadNomi=isPermiso;
		this.isPermisoNuevoTipoNovedadNomi=isPermiso;
		this.isPermisoActualizarTipoNovedadNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoNovedadNomi=isPermiso;
		this.isPermisoEliminarTipoNovedadNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoNovedadNomi=isPermiso;
		this.isPermisoConsultaTipoNovedadNomi=isPermiso;
		this.isPermisoBusquedaTipoNovedadNomi=isPermiso;
		this.isPermisoReporteTipoNovedadNomi=isPermiso;
		this.isPermisoOrdenTipoNovedadNomi=isPermiso;		
		this.isPermisoPaginacionMedioTipoNovedadNomi=isPermiso;		
		this.isPermisoPaginacionAltoTipoNovedadNomi=isPermiso;		
		this.isPermisoPaginacionTodoTipoNovedadNomi=isPermiso;		
		this.isPermisoCopiarTipoNovedadNomi=isPermiso;		
		this.isPermisoVerFormTipoNovedadNomi=isPermiso;		
		this.isPermisoDuplicarTipoNovedadNomi=isPermiso;
		this.isPermisoOrdenTipoNovedadNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoNovedadNomi(Boolean isPermiso) {
		//this.isPermisoTodoTipoNovedadNomi=isPermiso;
		this.isPermisoNuevoTipoNovedadNomi=isPermiso;
		this.isPermisoActualizarTipoNovedadNomi=isPermiso;
		this.isPermisoActualizarOriginalTipoNovedadNomi=isPermiso;
		this.isPermisoEliminarTipoNovedadNomi=isPermiso;
		this.isPermisoGuardarCambiosTipoNovedadNomi=isPermiso;
		//this.isPermisoConsultaTipoNovedadNomi=isPermiso;
		//this.isPermisoBusquedaTipoNovedadNomi=isPermiso;
		//this.isPermisoReporteTipoNovedadNomi=isPermiso;
		//this.isPermisoOrdenTipoNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionMedioTipoNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionAltoTipoNovedadNomi=isPermiso;		
		//this.isPermisoPaginacionTodoTipoNovedadNomi=isPermiso;		
		//this.isPermisoCopiarTipoNovedadNomi=isPermiso;		
		//this.isPermisoDuplicarTipoNovedadNomi=isPermiso;
		//this.isPermisoOrdenTipoNovedadNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoNovedadNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(NovedadNomiConstantesFunciones.SNOMBREOPCION);
		
		if(TipoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosNovedadNomi=false;
		this.isTienePermisosNovedadNomi=this.verificarGetPermisosUsuarioOpcionTipoNovedadNomiClaseRelacionada(this.opcionsRelacionadas,NovedadNomiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoNovedadNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoNovedadNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosNovedadNomi=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoNovedadNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoNovedadNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoNovedadNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosNovedadNomi && this.jInternalFrameDetalleFormTipoNovedadNomi!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.remove(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoNovedadNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoNovedadNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoNovedadNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoNovedadNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoNovedadNomi=this.isPermisoActualizarTipoNovedadNomi;
			this.isPermisoEliminarTipoNovedadNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoNovedadNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoNovedadNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoNovedadNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoNovedadNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoNovedadNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNovedadNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoNovedadNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoNovedadNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoNovedadNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoNovedadNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoNovedadNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoNovedadNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNovedadNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoNovedadNomi.setToolTipText(this.jTableDatosTipoNovedadNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoNovedadNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoNovedadNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoNovedadNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosNovedadNomi && this.tiponovedadnomiConstantesFunciones.mostrarNovedadNomiTipoNovedadNomi && !TipoNovedadNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Novedad Nomi");
			reporte.setsDescripcion("Novedad Nomi");
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
	
		
	public void inicializarCombosForeignKeyTipoNovedadNomiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoNovedadNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoNovedadNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoNovedadNomiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoNovedadNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoNovedadNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoNovedadNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoNovedadNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoNovedadNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNovedadNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoNovedadNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNovedadNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoNovedadNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoNovedadNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoNovedadNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoNovedadNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoNovedadNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoNovedadNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoNovedadNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoNovedadNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoNovedadNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean(); 
		this.tiponovedadnomiConstantesFunciones=new TipoNovedadNomiConstantesFunciones(); 
		this.tiponovedadnomiBean=new TipoNovedadNomi();//(this.tiponovedadnomiConstantesFunciones); 		
		this.tiponovedadnomiReturnGeneral=new TipoNovedadNomiParameterReturnGeneral(); 
		
		this.tiponovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoNovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoNovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoNovedadNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoNovedadNomi(true);
			
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
			
			this.tiponovedadnomiConstantesFunciones=new TipoNovedadNomiConstantesFunciones(); 
			this.tiponovedadnomiBean=new TipoNovedadNomi();//this.tiponovedadnomiConstantesFunciones); 			
			this.tiponovedadnomiReturnGeneral=new TipoNovedadNomiParameterReturnGeneral(); 
		
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Novedad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiponovedadnomi=new TipoNovedadNomi();
			this.tiponovedadnomis = new ArrayList<TipoNovedadNomi>();
			this.tiponovedadnomisAux = new ArrayList<TipoNovedadNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic=new TipoNovedadNomiLogic();
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.tiponovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiponovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoNovedadNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNovedadNomi);	
					}
					
					if(this.jInternalFrameImportacionTipoNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNovedadNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoNovedadNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoNovedadNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNovedadNomi);
				this.jInternalFrameDetalleFormTipoNovedadNomi.setVisible(false);
				this.jInternalFrameDetalleFormTipoNovedadNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNovedadNomi);
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoNovedadNomi);
					this.jInternalFrameImportacionTipoNovedadNomi.setVisible(false);
					this.jInternalFrameImportacionTipoNovedadNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoNovedadNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoNovedadNomi);
					this.jInternalFrameOrderByTipoNovedadNomi.setVisible(false);
					this.jInternalFrameOrderByTipoNovedadNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoNovedadNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoNovedadNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiponovedadnomiReturnGeneral=new TipoNovedadNomiParameterReturnGeneral();
			
			this.tiponovedadnomiParameterGeneral=new TipoNovedadNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiponovedadnomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoNovedadNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(NovedadNomiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNovedadNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado(),this.tiponovedadnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNovedadNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado(),this.tiponovedadnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
			this.isVisibilidadCeldaDuplicarTipoNovedadNomi=true;
			this.isVisibilidadCeldaCopiarTipoNovedadNomi=true;
			this.isVisibilidadCeldaVerFormTipoNovedadNomi=true;
			this.isVisibilidadCeldaOrdenTipoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
			this.isVisibilidadCeldaModificarTipoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoNovedadNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoNovedadNomi(false);
			
			this.setPermisosUsuarioTipoNovedadNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado() 
				|| (this.tiponovedadnomiSessionBean.getEsGuardarRelacionado() && this.tiponovedadnomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoNovedadNomiClasesRelacionadas();
			}
			
			if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoNovedadNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoNovedadNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoNovedadNomi();
			}
			
			if(!this.isPermisoBusquedaTipoNovedadNomi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoNovedadNomi,this.isPermisoPaginacionMedioTipoNovedadNomi,this.isPermisoPaginacionTodoTipoNovedadNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoNovedadNomiConstantesFunciones.getTiposSeleccionarTipoNovedadNomi());
				
				this.tiposColumnasSelect=TipoNovedadNomiConstantesFunciones.getTiposSeleccionarTipoNovedadNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoNovedadNomi();				
				//this.tiposRelacionesSelect=TipoNovedadNomiConstantesFunciones.getTiposRelacionesTipoNovedadNomi(true);
				
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
			//if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoNovedadNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoNovedadNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoNovedadNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNovedadNomi() ;
			
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
			
			
			this.novedadnomiLogic=new NovedadNomiLogic(); 
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
				tiponovedadnomiImplementable= (TipoNovedadNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNovedadNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiponovedadnomiImplementableHome= (TipoNovedadNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNovedadNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiponovedadnomis= new ArrayList<TipoNovedadNomi>();
			this.tiponovedadnomisEliminados= new ArrayList<TipoNovedadNomi>();
						
			this.isEsNuevoTipoNovedadNomi=false;
			this.esParaAccionDesdeFormularioTipoNovedadNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoNovedadNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoNovedadNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoNovedadNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoNovedadNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoNovedadNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoNovedadNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoNovedadNomi();
			}
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoNovedadNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoNovedadNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoNovedadNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoNovedadNomi")) {
				iIndex=this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Novedad Nomis")) {
					if(!NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoNovedadNomi();

						this.cargarParteTabPanelRelacionadaNovedadNomi(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoNovedadNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaNovedadNomi(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoNovedadNomi.cargarSessionConBeanSwingJInternalFrameNovedadNomi(false,true,iIndex);
		this.jButtonNovedadNomiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNovedadNomi();

		//this.jTabbedPaneRelacionesTipoNovedadNomi.updateUI();
		//this.jTabbedPaneRelacionesTipoNovedadNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoNovedadNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("NovedadNomi")) {
				int row=this.jTableDatosTipoNovedadNomi.getSelectedRow();
				jButtonNovedadNomiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Novedad Nomi")) {

					if(this.isTienePermisosNovedadNomi && this.tiponovedadnomiConstantesFunciones.mostrarNovedadNomiTipoNovedadNomi && !TipoNovedadNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Novedad Nomis"+"("+NovedadNomiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Novedad Nomis");

						if(tiponovedadnomiConstantesFunciones.resaltarNovedadNomiTipoNovedadNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiponovedadnomiConstantesFunciones.resaltarNovedadNomiTipoNovedadNomi);
						}

						jmenuItem.setEnabled(this.tiponovedadnomiConstantesFunciones.activarNovedadNomiTipoNovedadNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NovedadNomi"));

						

						this.jInternalFrameDetalleFormTipoNovedadNomi.jmenuDetalleTipoNovedadNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoNovedadNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoNovedadNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoNovedadNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoNovedadNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoNovedadNomi();
		
		this.cargarCombosFrameForeignKeyTipoNovedadNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoNovedadNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoNovedadNomi();
		}
	}
	
	
	
	public void jButtonNuevoTipoNovedadNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
			
			if(jTableDatosTipoNovedadNomi.getRowCount()>=1) {
				jTableDatosTipoNovedadNomi.removeRowSelectionInterval(0, jTableDatosTipoNovedadNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoNovedadNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoNovedadNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoNovedadNomi(true);			
			//this.tiponovedadnomi=new TipoNovedadNomi();
			//this.tiponovedadnomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNovedadNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNovedadNomi() ;
			
			if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNovedadNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiponovedadnomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);				
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
			if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoNovedadNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoNovedadNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoNovedadNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoNovedadNomi.getSelectedRows().length;			
			}
			
			tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoNovedadNomi--;			
				//TipoNovedadNomi tiponovedadnomiAux= new TipoNovedadNomi();			
				//tiponovedadnomiAux.setId(this.iIdNuevoTipoNovedadNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoNovedadNomi tiponovedadnomiOrigen=new TipoNovedadNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoNovedadNomi tiponovedadnomiOrigen : tiponovedadnomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiponovedadnomiOrigen =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponovedadnomiOrigen =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoNovedadNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiponovedadnomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoNovedadNomi(tiponovedadnomiOrigen,this.tiponovedadnomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponovedadnomiLogic.getTipoNovedadNomis().add(this.tiponovedadnomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponovedadnomis.add(this.tiponovedadnomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
				
				this.jTableDatosTipoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoTipoNovedadNomi(), this.getIndiceNuevoTipoNovedadNomi());
				
				int iLastRow =  this.jTableDatosTipoNovedadNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNovedadNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNovedadNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();									
		
			TipoNovedadNomi tiponovedadnomiOrigen=new TipoNovedadNomi();
			TipoNovedadNomi tiponovedadnomiDestino=new TipoNovedadNomi();
				
			tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoNovedadNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiponovedadnomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoNovedadNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponovedadnomiOrigen =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponovedadnomiOrigen =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponovedadnomiDestino =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponovedadnomiDestino =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiponovedadnomiOrigen =tiponovedadnomisSeleccionados.get(0);
				tiponovedadnomiDestino =tiponovedadnomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoNovedadNomi(tiponovedadnomiOrigen,tiponovedadnomiDestino,true,false);
				
				tiponovedadnomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponovedadnomiDestino,tiponovedadnomiLogic.getTipoNovedadNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponovedadnomiDestino,tiponovedadnomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
				
				//this.jTableDatosTipoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoTipoNovedadNomi(), this.getIndiceNuevoTipoNovedadNomi());
				
				int iLastRow =  this.jTableDatosTipoNovedadNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNovedadNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNovedadNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoNovedadNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoNovedadNomi.isVisible();
			
			
			this.jPanelParametrosReportesTipoNovedadNomi.setVisible(!isVisible);
			this.jPanelPaginacionTipoNovedadNomi.setVisible(!isVisible);
			this.jPanelAccionesTipoNovedadNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoNovedadNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoNovedadNomi();
			
			this.abrirFrameOrderByTipoNovedadNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoNovedadNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoNovedadNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNovedadNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoNovedadNomi.isMaximum()) {
					this.jInternalFrameDetalleFormTipoNovedadNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoNovedadNomi.setSize(this.jInternalFrameDetalleFormTipoNovedadNomi.iWidthFormulario,this.jInternalFrameDetalleFormTipoNovedadNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoNovedadNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoNovedadNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoNovedadNomi.isMaximum()) {
						this.jInternalFrameDetalleFormTipoNovedadNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoNovedadNomi.jContentPaneDetalleTipoNovedadNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoNovedadNomi.jContentPaneDetalleTipoNovedadNomi.getWidth(),TipoNovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoNovedadNomi.jContentPaneDetalleTipoNovedadNomi.getWidth(),TipoNovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoNovedadNomi.jContentPaneDetalleTipoNovedadNomi.getWidth(),TipoNovedadNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNovedadNomi();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoNovedadNomi.setVisible(true);
	        this.jInternalFrameDetalleFormTipoNovedadNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoNovedadNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoNovedadNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNovedadNomi,false,this);
				} else {
					this.jInternalFrameOrderByTipoNovedadNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNovedadNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoNovedadNomi);
				this.jInternalFrameOrderByTipoNovedadNomi.setVisible(false);
				this.jInternalFrameOrderByTipoNovedadNomi.setSelected(false);
				
				this.jInternalFrameOrderByTipoNovedadNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNovedadNomi"));
				
				this.inicializarActualizarBindingTablaOrderByTipoNovedadNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoNovedadNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoNovedadNomi==null) {
				
				this.jInternalFrameImportacionTipoNovedadNomi=new ImportacionJInternalFrame(TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNovedadNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoNovedadNomi);
				this.jInternalFrameImportacionTipoNovedadNomi.setVisible(false);
				this.jInternalFrameImportacionTipoNovedadNomi.setSelected(false);


				this.jInternalFrameImportacionTipoNovedadNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNovedadNomi"));
				this.jInternalFrameImportacionTipoNovedadNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNovedadNomi"));
				this.jInternalFrameImportacionTipoNovedadNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNovedadNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoNovedadNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoNovedadNomi==null) {
				this.jInternalFrameReporteDinamicoTipoNovedadNomi=new ReporteDinamicoJInternalFrame(TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNovedadNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNovedadNomi);
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNovedadNomi"));
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNovedadNomi"));
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNovedadNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNovedadNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaNovedadNomi() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoNovedadNomi.jContentPaneDetalleTipoNovedadNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoNovedadNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNovedadNomi);
			
	       	this.jInternalFrameDetalleFormTipoNovedadNomi.setVisible(false);
	        this.jInternalFrameDetalleFormTipoNovedadNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoNovedadNomi.dispose();
			//this.jInternalFrameDetalleFormTipoNovedadNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoNovedadNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoNovedadNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoNovedadNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoNovedadNomi.setVisible(true);
	        this.jInternalFrameImportacionTipoNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoNovedadNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoNovedadNomi.setVisible(true);
	        this.jInternalFrameOrderByTipoNovedadNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoNovedadNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoNovedadNomi.setVisible(false);
	        this.jInternalFrameOrderByTipoNovedadNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoNovedadNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoNovedadNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoNovedadNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoNovedadNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoNovedadNomi.setVisible(false);
	        this.jInternalFrameImportacionTipoNovedadNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoNovedadNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoNovedadNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoNovedadNomi(true);
			//this.isEsNuevoTipoNovedadNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNovedadNomi(false) ;
			
			if(tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getEsGuardarRelacionado() && NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNovedadNomiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNovedadNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNovedadNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoNovedadNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoNovedadNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoNovedadNomi(true);
			//this.isEsNuevoTipoNovedadNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiponovedadnomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoNovedadNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoNovedadNomi(false) ;
			
			if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNovedadNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNovedadNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoNovedadNomi(false);
			
			//if(!this.isEsNuevoTipoNovedadNomi) {								
				int intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
				
			}
			
			if(this.permiteMantenimiento(this.tiponovedadnomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoNovedadNomi=true;
					this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
					this.isEsNuevoTipoNovedadNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoNovedadNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoNovedadNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNovedadNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNovedadNomi(false);
				
				this.habilitarDeshabilitarControlesTipoNovedadNomi(false);
			
												
				
				if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoNovedadNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoNovedadNomiActionPerformed(evt,tiponovedadnomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoNovedadNomi(this.tiponovedadnomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoNovedadNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiponovedadnomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiponovedadnomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				this.tiponovedadnomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				this.tiponovedadnomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiponovedadnomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoNovedadNomiModel) this.jTableDatosTipoNovedadNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoNovedadNomi=true;
				this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
				this.isEsNuevoTipoNovedadNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNovedadNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNovedadNomi(false);
				
				this.habilitarDeshabilitarControlesTipoNovedadNomi(false);
				
				
				
				if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoNovedadNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoNovedadNomi.getRowCount()>=1) {
				jTableDatosTipoNovedadNomi.removeRowSelectionInterval(0, jTableDatosTipoNovedadNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoNovedadNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNovedadNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNovedadNomi(false) ;
			
			this.isEsNuevoTipoNovedadNomi=false;
			
			if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoNovedadNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoNovedadNomi(false);
				
				//SI ES MANUAL
				if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoNovedadNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoNovedadNomi--;			
			//TipoNovedadNomi tiponovedadnomiAux= new TipoNovedadNomi();			
			//tiponovedadnomiAux.setId(this.iIdNuevoTipoNovedadNomi);
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoNovedadNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
			
			this.tiponovedadnomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiponovedadnomiLogic.getTipoNovedadNomis().add(this.tiponovedadnomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiponovedadnomis.add(this.tiponovedadnomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
			
			this.jTableDatosTipoNovedadNomi.setRowSelectionInterval(this.getIndiceNuevoTipoNovedadNomi(), this.getIndiceNuevoTipoNovedadNomi());
			
			int iLastRow =  this.jTableDatosTipoNovedadNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoNovedadNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoNovedadNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoNovedadNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNovedadNomi(false);
			
			//SI ES MANUAL
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNovedadNomi();
			}
			
			//this.abrirFrameTreeTipoNovedadNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo NovedadS ?", "MANTENIMIENTO DE Tipo Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoNovedadNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoNovedadNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiponovedadnomiReturnGeneral=tiponovedadnomiLogic.procesarImportacionTipoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiponovedadnomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoNovedadNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoNovedadNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoNovedadNomi.setFileImportacion(this.jInternalFrameImportacionTipoNovedadNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoNovedadNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoNovedadNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoNovedadNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoNovedadNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		

		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoNovedadNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoNovedadNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponovedadnomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoNovedadNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoNovedadNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoNovedadNomi tiponovedadnomi:tiponovedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponovedadnomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoNovedadNomi tiponovedadnomi:tiponovedadnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponovedadnomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoNovedadNomi(row);				
			//	iRow++;
			//}				
			
			//for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoNovedadNomi(tiponovedadnomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNovedadNomi(false);
			
			//SI ES MANUAL
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNovedadNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNovedadNomi(false);
			
			//SI ES MANUAL
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNovedadNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoNovedadNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNovedadNomi(false);
			
			//SI ES MANUAL
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNovedadNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponovedadnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoNovedadNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoNovedadNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoNovedadNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoNovedadNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoNovedadNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoNovedadNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoNovedadNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoNovedadNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoNovedadNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoNovedadNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoNovedadNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoNovedadNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoNovedadNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoNovedadNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNovedadNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoNovedadNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoNovedadNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoNovedadNomi();
		
		this.inicializarActualizarBindingBotonesManualTipoNovedadNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNovedadNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNovedadNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNovedadNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNovedadNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoNovedadNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoNovedadNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoNovedadNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoNovedadNomi.jCheckBoxPostAccionNuevoTipoNovedadNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoNovedadNomi.jCheckBoxPostAccionSinCerrarTipoNovedadNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoNovedadNomi.jCheckBoxPostAccionSinMensajeTipoNovedadNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoNovedadNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoNovedadNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoNovedadNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
				this.jInternalFrameDetalleFormTipoNovedadNomi.jCheckBoxPostAccionNuevoTipoNovedadNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoNovedadNomi.jCheckBoxPostAccionSinCerrarTipoNovedadNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoNovedadNomi.jCheckBoxPostAccionSinMensajeTipoNovedadNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoNovedadNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoNovedadNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoNovedadNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoNovedadNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoNovedadNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoNovedadNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoNovedadNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoNovedadNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoNovedadNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoNovedadNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNovedadNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoNovedadNomi() throws Exception {
		try	{
			if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNovedadNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNovedadNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNovedadNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoNovedadNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoNovedadNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoNovedadNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoNovedadNomi.addItem(reporte);
			}
			
			
			if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoNovedadNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoNovedadNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoNovedadNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoNovedadNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoNovedadNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoNovedadNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoNovedadNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNovedadNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNovedadNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoNovedadNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoNovedadNomi(Boolean esInicializar) throws Exception {				
		if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNovedadNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoNovedadNomi() throws Exception {
		this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoNovedadNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoNovedadNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoNovedadNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoNovedadNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNovedadNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoNovedadNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoNovedadNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoNovedadNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiponovedadnomiLogic.getTipoNovedadNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiponovedadnomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoNovedadNomi.setModel(new TipoNovedadNomiModel(this.tiponovedadnomiLogic.getTipoNovedadNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoNovedadNomi.setModel(new TipoNovedadNomiModel(this.tiponovedadnomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoNovedadNomi!=null && this.jInternalFrameOrderByTipoNovedadNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoNovedadNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNovedadNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoNovedadNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,tiponovedadnomiConstantesFunciones.resaltarSeleccionarTipoNovedadNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoNovedadNomiConstantesFunciones.SCLASSWEBTITULO,tiponovedadnomiConstantesFunciones.resaltarSeleccionarTipoNovedadNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNovedadNomi,TipoNovedadNomiConstantesFunciones.LABEL_ID));

		if(this.tiponovedadnomiConstantesFunciones.mostraridTipoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNovedadNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiponovedadnomiConstantesFunciones.resaltaridTipoNovedadNomi,this.tiponovedadnomiConstantesFunciones.activaridTipoNovedadNomi,this,true,"idTipoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponovedadnomiConstantesFunciones.resaltaridTipoNovedadNomi,this.tiponovedadnomiConstantesFunciones.activaridTipoNovedadNomi,this,true,"idTipoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNovedadNomi,TipoNovedadNomiConstantesFunciones.LABEL_CODIGO));

		if(this.tiponovedadnomiConstantesFunciones.mostrarcodigoTipoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNovedadNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponovedadnomiConstantesFunciones.resaltarcodigoTipoNovedadNomi,this.tiponovedadnomiConstantesFunciones.activarcodigoTipoNovedadNomi,this,true,"codigoTipoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponovedadnomiConstantesFunciones.resaltarcodigoTipoNovedadNomi,this.tiponovedadnomiConstantesFunciones.activarcodigoTipoNovedadNomi,this,true,"codigoTipoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNovedadNomi,TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.tiponovedadnomiConstantesFunciones.mostrarnombreTipoNovedadNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponovedadnomiConstantesFunciones.resaltarnombreTipoNovedadNomi,this.tiponovedadnomiConstantesFunciones.activarnombreTipoNovedadNomi,this,true,"nombreTipoNovedadNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponovedadnomiConstantesFunciones.resaltarnombreTipoNovedadNomi,this.tiponovedadnomiConstantesFunciones.activarnombreTipoNovedadNomi,this,true,"nombreTipoNovedadNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNovedadNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosNovedadNomi && this.tiponovedadnomiConstantesFunciones.mostrarNovedadNomiTipoNovedadNomi && !TipoNovedadNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Novedad Nomis");
				tableColumn.setHeaderValue("Novedad Nomis");
				tableColumn.setCellRenderer(new NovedadNomiTableCell(tiponovedadnomiConstantesFunciones.resaltarNovedadNomiTipoNovedadNomi,this,this.tiponovedadnomiConstantesFunciones.activarNovedadNomiTipoNovedadNomi));
				tableColumn.setCellEditor(new NovedadNomiTableCell(tiponovedadnomiConstantesFunciones.resaltarNovedadNomiTipoNovedadNomi,this,this.tiponovedadnomiConstantesFunciones.activarNovedadNomiTipoNovedadNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoNovedadNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNovedadNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNovedadNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoNovedadNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoNovedadNomi.addColumn(tableColumn);
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
			
			this.jTableDatosTipoNovedadNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoNovedadNomi.moveColumn(this.jTableDatosTipoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoNovedadNomi.moveColumn(this.jTableDatosTipoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoNovedadNomi.moveColumn(this.jTableDatosTipoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoNovedadNomi.moveColumn(this.jTableDatosTipoNovedadNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoNovedadNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoNovedadNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoNovedadNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoNovedadNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoNovedadNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoNovedadNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoNovedadNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoNovedadNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiponovedadnomiLogic.getTipoNovedadNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiponovedadnomis.size()-1;
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
		//this.jTableDatosTipoNovedadNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoNovedadNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoNovedadNomi();
			
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
				
				//this.isEsNuevoTipoNovedadNomi=false;
					
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
				if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNovedadNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNovedadNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiponovedadnomi.getsType().equals("DUPLICADO")
				   || this.tiponovedadnomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoNovedadNomi=true;
				
				} else {
					this.isEsNuevoTipoNovedadNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
					if(this.tiponovedadnomi.getId()>=0 && !this.tiponovedadnomi.getIsNew()) {						
						this.isEsNuevoTipoNovedadNomi=false;
						
					} else {
						this.isEsNuevoTipoNovedadNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoNovedadNomi(esRelaciones);						
				
				this.seleccionarTipoNovedadNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiponovedadnomi.getId()<0) {
					this.isEsNuevoTipoNovedadNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoNovedadNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoNovedadNomi(evt,rowIndex);
				}	
				
				if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoNovedadNomi: " + this.dDif); 
					}
				}								
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoNovedadNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiponovedadnomi)) {
					if(this.tiponovedadnomi.getId()>0) {
						this.tiponovedadnomi.setIsDeleted(true);
						
						this.tiponovedadnomisEliminados.add(this.tiponovedadnomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponovedadnomiLogic.getTipoNovedadNomis().remove(this.tiponovedadnomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponovedadnomis.remove(this.tiponovedadnomi);				
					}
					
					
					((TipoNovedadNomiModel) this.jTableDatosTipoNovedadNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNovedadNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoNovedadNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoNovedadNomi) {
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNovedadNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNovedadNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoNovedadNomi(this.tiponovedadnomi);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoNovedadNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoNovedadNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNovedadNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoNovedadNomi(tiponovedadnomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoNovedadNomi(tiponovedadnomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoNovedadNomi(tiponovedadnomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoNovedadNomi(tiponovedadnomi);
	}
	
	public void setVariablesObjetoActualToFormularioTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.setText(tiponovedadnomi.getId().toString());
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.setText(tiponovedadnomi.getcodigo());
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.setText(tiponovedadnomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoNovedadNomi tiponovedadnomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiponovedadnomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoNovedadNomi tiponovedadnomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiponovedadnomiLocal=this.tiponovedadnomi;
			} else {
				tiponovedadnomiLocal=this.tiponovedadnomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiponovedadnomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoNovedadNomi(tiponovedadnomiLocal,true);
					
					if(tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiponovedadnomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiponovedadnomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNovedadNomi(tiponovedadnomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(tiponovedadnomi);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNovedadNomi(tiponovedadnomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.getText()==null || this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.getText()=="" || this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.setText("0");
			}

			if(conColumnasBase) {tiponovedadnomi.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNovedadNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNovedadNomi.jLabelIdTipoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponovedadnomi.setcodigo(this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNovedadNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNovedadNomi.jLabelcodigoTipoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponovedadnomi.setnombre(this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNovedadNomi.jLabelnombreTipoNovedadNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNovedadNomi(TipoNovedadNomi tiponovedadnomiBean,TipoNovedadNomi tiponovedadnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoNovedadNomi(TipoNovedadNomi tiponovedadnomiOrigen,TipoNovedadNomi tiponovedadnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponovedadnomiOrigen.getId()!=null && !tiponovedadnomiOrigen.getId().equals(0L))) {tiponovedadnomi.setId(tiponovedadnomiOrigen.getId());}}
			if(conDefault || (!conDefault && tiponovedadnomiOrigen.getcodigo()!=null && !tiponovedadnomiOrigen.getcodigo().equals(""))) {tiponovedadnomi.setcodigo(tiponovedadnomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiponovedadnomiOrigen.getnombre()!=null && !tiponovedadnomiOrigen.getnombre().equals(""))) {tiponovedadnomi.setnombre(tiponovedadnomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.setText(tiponovedadnomi.getId().toString());
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.setText(tiponovedadnomi.getcodigo());
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.setText(tiponovedadnomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNovedadNomi(TipoNovedadNomiBean tiponovedadnomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.setText(tiponovedadnomiBean.getId().toString());
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.setText(tiponovedadnomiBean.getcodigo());
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.setText(tiponovedadnomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoNovedadNomi(TipoNovedadNomiParameterReturnGeneral tiponovedadnomiReturnGeneral,TipoNovedadNomiBean tiponovedadnomiBean,Boolean conDefault) throws Exception { 
		try {
			TipoNovedadNomi tiponovedadnomiLocal=new TipoNovedadNomi();
			
			tiponovedadnomiLocal=tiponovedadnomiReturnGeneral.getTipoNovedadNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponovedadnomiLocal.getId()!=null && !tiponovedadnomiLocal.getId().equals(0L))) {tiponovedadnomiBean.setId(tiponovedadnomiLocal.getId());}}
			if(conDefault || (!conDefault && tiponovedadnomiLocal.getcodigo()!=null && !tiponovedadnomiLocal.getcodigo().equals(""))) {tiponovedadnomiBean.setcodigo(tiponovedadnomiLocal.getcodigo());}
			if(conDefault || (!conDefault && tiponovedadnomiLocal.getnombre()!=null && !tiponovedadnomiLocal.getnombre().equals(""))) {tiponovedadnomiBean.setnombre(tiponovedadnomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoNovedadNomiGenerico(Long idTipoNovedadNomiSeleccionado,JComboBox jComboBoxTipoNovedadNomi,List<TipoNovedadNomi> tiponovedadnomisLocal)throws Exception {
		try {
			TipoNovedadNomi  tiponovedadnomiTemp=null;

			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisLocal) {
				if(tiponovedadnomiAux.getId()!=null && tiponovedadnomiAux.getId().equals(idTipoNovedadNomiSeleccionado)) {
					tiponovedadnomiTemp=tiponovedadnomiAux;
					break;
				}
			}

			jComboBoxTipoNovedadNomi.setSelectedItem(tiponovedadnomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoNovedadNomiGenerico(JComboBox jComboBoxTipoNovedadNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNovedadNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoNovedadNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNovedadNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoNovedadNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("NovedadNomi")) {
			jButtonNovedadNomiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponovedadnomi=(TipoNovedadNomi) tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponovedadnomi =(TipoNovedadNomi) tiponovedadnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoNovedadNomi tiponovedadnomiRow=new TipoNovedadNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponovedadnomiRow=(TipoNovedadNomi) tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponovedadnomiRow=(TipoNovedadNomi) tiponovedadnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonNovedadNomiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoNovedadNomi tiponovedadnomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponovedadnomi = (TipoNovedadNomi)this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiponovedadnomi = (TipoNovedadNomi)this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiponovedadnomi!=null) {
						this.tiponovedadnomi = tiponovedadnomi;
					} else {
						this.tiponovedadnomi = new TipoNovedadNomi();
					}
				}

				if(this.isTienePermisosNovedadNomi && this.permiteMantenimiento(this.tiponovedadnomi)) {
					NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup=new NovedadNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						novedadnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup;
					} else {
						novedadnomiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame;
					}

					List<TipoNovedadNomi> tiponovedadnomis=new ArrayList<TipoNovedadNomi>();
					tiponovedadnomis.add(this.tiponovedadnomi);
					if(!esRelacionado) {
						//novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setConGuardarRelaciones(false);
						//novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					novedadnomiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoNovedadNomi.cargarNovedadNomiBeanSwingJInternalFrame(tiponovedadnomis,this.tiponovedadnomi,novedadnomiBeanSwingJInternalFrame,/*conInicializar,*/novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getConGuardarRelaciones(),novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.getEsGuardarRelacionado());
					novedadnomiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("no_relacionado");

						novedadnomiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NovedadNomiConstantesFunciones.ITAMANIOFILATABLA + (NovedadNomiConstantesFunciones.ITAMANIOFILATABLA/2));

						novedadnomiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoNovedadNomi=(TitledBorder)this.jScrollPanelDatosTipoNovedadNomi.getBorder();
						TitledBorder titledBorderNovedadNomi=(TitledBorder)novedadnomiBeanSwingJInternalFrame.jScrollPanelDatosNovedadNomi.getBorder();

						titledBorderNovedadNomi.setTitle(titledBorderTipoNovedadNomi.getTitle() + " -> Novedad Nomi");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,novedadnomiBeanSwingJInternalFrame);
						}

						novedadnomiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(novedadnomiBeanSwingJInternalFrame);

						novedadnomiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Novedad Nomi",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoNovedadNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi));			
			this.jButtonDuplicarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoNovedadNomi && this.isPermisoDuplicarTipoNovedadNomi));			
			this.jButtonCopiarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarTipoNovedadNomi && this.isPermisoCopiarTipoNovedadNomi));
			this.jButtonVerFormTipoNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormTipoNovedadNomi && this.isPermisoVerFormTipoNovedadNomi));
			
			this.jButtonAbrirOrderByTipoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenTipoNovedadNomi && this.isPermisoOrdenTipoNovedadNomi));			
			
			this.jButtonNuevoRelacionesTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi));			
			this.jButtonNuevoGuardarCambiosTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaModificarTipoNovedadNomi && this.isPermisoActualizarTipoNovedadNomi));	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarTipoNovedadNomi && this.isPermisoActualizarTipoNovedadNomi));	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarTipoNovedadNomi && this.isPermisoEliminarTipoNovedadNomi));
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarTipoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarTipoNovedadNomi);							
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi));						
			this.jButtonDuplicarToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoNovedadNomi && this.isPermisoDuplicarTipoNovedadNomi));						
			this.jButtonCopiarToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarTipoNovedadNomi && this.isPermisoCopiarTipoNovedadNomi));			
			this.jButtonVerFormToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormTipoNovedadNomi && this.isPermisoVerFormTipoNovedadNomi));			
			this.jButtonAbrirOrderByToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenTipoNovedadNomi && this.isPermisoOrdenTipoNovedadNomi));
			this.jButtonNuevoRelacionesToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi));			
			this.jButtonNuevoGuardarCambiosToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));			
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaModificarTipoNovedadNomi && this.isPermisoActualizarTipoNovedadNomi));	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarTipoNovedadNomi  && this.isPermisoActualizarTipoNovedadNomi));	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarTipoNovedadNomi && this.isPermisoEliminarTipoNovedadNomi));
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarToolBarTipoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarTipoNovedadNomi);				
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi));			
			this.jMenuItemDuplicarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaDuplicarTipoNovedadNomi && this.isPermisoDuplicarTipoNovedadNomi));			
			this.jMenuItemCopiarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaCopiarTipoNovedadNomi && this.isPermisoCopiarTipoNovedadNomi));			
			this.jMenuItemVerFormTipoNovedadNomi.setVisible((this.isVisibilidadCeldaVerFormTipoNovedadNomi && this.isPermisoVerFormTipoNovedadNomi));			
			this.jMenuItemAbrirOrderByTipoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenTipoNovedadNomi && this.isPermisoOrdenTipoNovedadNomi));			
			//this.jMenuItemMostrarOcultarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenTipoNovedadNomi && this.isPermisoOrdenTipoNovedadNomi));
			this.jMenuItemDetalleAbrirOrderByTipoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenTipoNovedadNomi && this.isPermisoOrdenTipoNovedadNomi));			
			//this.jMenuItemDetalleMostrarOcultarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaOrdenTipoNovedadNomi && this.isPermisoOrdenTipoNovedadNomi));			
			this.jMenuItemNuevoRelacionesTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi));			
			this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi.setVisible((this.isVisibilidadCeldaNuevoTipoNovedadNomi && this.isPermisoNuevoTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));									
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemModificarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaModificarTipoNovedadNomi && this.isPermisoActualizarTipoNovedadNomi));	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemActualizarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaActualizarTipoNovedadNomi && this.isPermisoActualizarTipoNovedadNomi));	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemEliminarTipoNovedadNomi.setVisible((this.isVisibilidadCeldaEliminarTipoNovedadNomi && this.isPermisoEliminarTipoNovedadNomi));
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemCancelarTipoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarTipoNovedadNomi);				
			}
			
			this.jMenuItemGuardarCambiosTipoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));						
			this.jMenuItemGuardarCambiosTablaTipoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=this.jButtonNuevoTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaDuplicarTipoNovedadNomi=this.jButtonDuplicarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCopiarTipoNovedadNomi=this.jButtonCopiarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaVerFormTipoNovedadNomi=this.jButtonVerFormTipoNovedadNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoNovedadNomi=this.jButtonAbrirOrderByTipoNovedadNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=this.jButtonNuevoRelacionesTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaModificarTipoNovedadNomi=this.jButtonModificarTipoNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=this.jButtonGuardarCambiosTablaTipoNovedadNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=this.jButtonNuevoToolBarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=this.jButtonNuevoRelacionesToolBarTipoNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.isVisibilidadCeldaModificarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarToolBarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarToolBarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarToolBarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarToolBarTipoNovedadNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNovedadNomi=this.jButtonGuardarCambiosToolBarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=this.jButtonGuardarCambiosTablaToolBarTipoNovedadNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=this.jMenuItemNuevoTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=this.jMenuItemNuevoRelacionesTipoNovedadNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.isVisibilidadCeldaModificarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemModificarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemActualizarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemEliminarTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemCancelarTipoNovedadNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNovedadNomi=this.jMenuItemGuardarCambiosTipoNovedadNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=this.jMenuItemGuardarCambiosTablaTipoNovedadNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoNovedadNomi(Boolean esInicializar) {
		if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
				//if(this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNovedadNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoNovedadNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoNovedadNomi() {
		this.jButtonNuevoTipoNovedadNomi.setVisible(this.isPermisoNuevoTipoNovedadNomi);			
		this.jButtonDuplicarTipoNovedadNomi.setVisible(this.isPermisoDuplicarTipoNovedadNomi);			
		this.jButtonCopiarTipoNovedadNomi.setVisible(this.isPermisoCopiarTipoNovedadNomi);			
		this.jButtonVerFormTipoNovedadNomi.setVisible(this.isPermisoVerFormTipoNovedadNomi);			
		
		this.jButtonAbrirOrderByTipoNovedadNomi.setVisible(this.isPermisoOrdenTipoNovedadNomi);					
		
		this.jButtonNuevoRelacionesTipoNovedadNomi.setVisible(this.isPermisoNuevoTipoNovedadNomi);			
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarTipoNovedadNomi.setVisible(this.isPermisoActualizarTipoNovedadNomi);	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarTipoNovedadNomi.setVisible(this.isPermisoActualizarTipoNovedadNomi);	
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarTipoNovedadNomi.setVisible(this.isPermisoEliminarTipoNovedadNomi);
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarTipoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarTipoNovedadNomi);						
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.setVisible(this.isPermisoGuardarCambiosTipoNovedadNomi);							
		}
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.setVisible(this.isPermisoActualizarTipoNovedadNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNovedadNomi() {
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarTipoNovedadNomi.setVisible(this.isPermisoActualizarTipoNovedadNomi);	
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarTipoNovedadNomi.setVisible(this.isPermisoActualizarTipoNovedadNomi);	
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarTipoNovedadNomi.setVisible(this.isPermisoEliminarTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarTipoNovedadNomi.setVisible(this.isVisibilidadCeldaCancelarTipoNovedadNomi);							
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.setVisible((this.isVisibilidadCeldaGuardarTipoNovedadNomi && this.isPermisoGuardarCambiosTipoNovedadNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoNovedadNomi() {
		if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoNovedadNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoNovedadNomi() {
	}
	
	public void jTableDatosTipoNovedadNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoNovedadNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.gettiponovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponovedadnomi==null) {
						this.tiponovedadnomi = new TipoNovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
				}

				if(this.tiponovedadnomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiponovedadnomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.gettiponovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponovedadnomi==null) {
						this.tiponovedadnomi = new TipoNovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
				}

				if(this.tiponovedadnomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiponovedadnomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoNovedadNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.gettiponovedadnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponovedadnomi==null) {
						this.tiponovedadnomi = new TipoNovedadNomi();
					}

					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);
				}

				if(this.tiponovedadnomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiponovedadnomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNovedadNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoNovedadNomi() {
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
		

		if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoNovedadNomi.dispose();
			this.jInternalFrameDetalleFormTipoNovedadNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
			this.jInternalFrameReporteDinamicoTipoNovedadNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoNovedadNomi.dispose();
			this.jInternalFrameReporteDinamicoTipoNovedadNomi=null;
		}
		
		if(this.jInternalFrameImportacionTipoNovedadNomi!=null) {
			this.jInternalFrameImportacionTipoNovedadNomi.setVisible(false);	    			
			this.jInternalFrameImportacionTipoNovedadNomi.dispose();
			this.jInternalFrameImportacionTipoNovedadNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoNovedadNomi();
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoNovedadNomi")) {
				jButtonDuplicarTipoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoNovedadNomi")) {
				jButtonCopiarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoNovedadNomi")) {
				jButtonVerFormTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoNovedadNomi")) {
				jButtonDuplicarTipoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoNovedadNomi")) {
				jButtonDuplicarTipoNovedadNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoNovedadNomi")) {
				jButtonModificarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoNovedadNomi")) {
				jButtonModificarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoNovedadNomi")) {
				jButtonModificarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoNovedadNomi")) {
				jButtonActualizarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoNovedadNomi")) {
				jButtonActualizarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoNovedadNomi")) {
				jButtonActualizarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoNovedadNomi")) {
				jButtonEliminarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoNovedadNomi")) {
				jButtonEliminarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoNovedadNomi")) {
				jButtonEliminarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoNovedadNomi")) {
				jButtonCancelarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoNovedadNomi")) {
				jButtonCancelarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoNovedadNomi")) {
				jButtonCancelarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoNovedadNomi")) {
				jButtonCerrarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoNovedadNomi")) {
				jButtonCerrarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoNovedadNomi")) {
				jButtonCerrarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoNovedadNomi")) {
				jButtonMostrarOcultarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoNovedadNomi")) {
				jButtonCancelarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoNovedadNomi")) {
				jButtonCopiarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoNovedadNomi")) {
				jButtonVerFormTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoNovedadNomi")) {
				jButtonCopiarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoNovedadNomi")) {
				jButtonVerFormTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoNovedadNomi")) {
				jButtonRecargarInformacionTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoNovedadNomi")) {
				jButtonRecargarInformacionTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoNovedadNomi")) {
				jButtonRecargarInformacionTipoNovedadNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoNovedadNomi")) {
				jButtonAnterioresTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoNovedadNomi")) {
				jButtonAnterioresTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoNovedadNomi")) {
				jButtonAnterioresTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoNovedadNomi")) {
				jButtonSiguientesTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoNovedadNomi")) {
				jButtonSiguientesTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoNovedadNomi")) {
				jButtonSiguientesTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoNovedadNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoNovedadNomi")) {
				jButtonAbrirOrderByTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoNovedadNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoNovedadNomi")) {
				jButtonMostrarOcultarTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNovedadNomi")) {
				jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoNovedadNomi")) {
				jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoNovedadNomi")) {
				jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoNovedadNomi")) {
				jButtonCerrarReporteDinamicoTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoNovedadNomi")) {
				jButtonGenerarReporteDinamicoTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoNovedadNomi")) {
				
				jButtonGenerarExcelReporteDinamicoTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoNovedadNomi")) {
				jButtonCerrarImportacionTipoNovedadNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoNovedadNomi")) {
				
				jButtonGenerarImportacionTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoNovedadNomi")) {
				
				jButtonAbrirImportacionTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoNovedadNomi")) {
				jComboBoxTiposAccionesTipoNovedadNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoNovedadNomi")) {
				jComboBoxTiposRelacionesTipoNovedadNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoNovedadNomi")) {
				jComboBoxTiposAccionesTipoNovedadNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoNovedadNomi")) {
				
				jComboBoxTiposSeleccionarTipoNovedadNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoNovedadNomi")) {
				jTextFieldValorCampoGeneralTipoNovedadNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoNovedadNomi")) {
				jButtonAbrirOrderByTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoNovedadNomi")) {
				jButtonAbrirOrderByTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoNovedadNomi")) {
				jButtonCerrarOrderByTipoNovedadNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNovedadNomiBusqueda")) {
				this.jButtonidTipoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNovedadNomiBusqueda")) {
				this.jButtoncodigoTipoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNovedadNomiBusqueda")) {
				this.jButtonnombreTipoNovedadNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoNovedadNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNovedadNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoNovedadNomi tiponovedadnomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiponovedadnomiLocal=this.tiponovedadnomi;
			} else {
				tiponovedadnomiLocal=this.tiponovedadnomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
							
				
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
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
			
			


			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNovedadNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
								
						
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
								
				
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
							
				
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNovedadNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
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
			
			


			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
								
				
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNovedadNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoNovedadNomi")) {
					jCheckBoxSeleccionarTodosTipoNovedadNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoNovedadNomi")) {
					jCheckBoxSeleccionadosTipoNovedadNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoNovedadNomi")) {
					
				}
				
				


				
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
												
				
				


				
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNovedadNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNovedadNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
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
			
			


			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNovedadNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponovedadnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponovedadnomi);
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
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
				
				


				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNovedadNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNovedadNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNovedadNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponovedadnomiAnterior =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoNovedadNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoNovedadNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoNovedadNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiponovedadnomi =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiponovedadnomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoNovedadNomi")) {
				
				}
				
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoNovedadNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoNovedadNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoNovedadNomi")) {
			
			}
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoNovedadNomi();
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
			if(sTipo.equals("NuevoTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoNovedadNomi")) {
				jButtonDuplicarTipoNovedadNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoNovedadNomi")) {
				jButtonCopiarTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoNovedadNomi")) {
				jButtonVerFormTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoNovedadNomi")) {
				jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoNovedadNomi")) {
				jButtonModificarTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoNovedadNomi")) {
				jButtonActualizarTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoNovedadNomi")) {
				jButtonEliminarTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoNovedadNomi")) {
				jButtonCancelarTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoNovedadNomi")) {
				jButtonCerrarTipoNovedadNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoNovedadNomi")) {
				jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNovedadNomi")) {
				jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoNovedadNomi")) {
				jButtonAbrirOrderByTipoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoNovedadNomi")) {
				jButtonRecargarInformacionTipoNovedadNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoNovedadNomi")) {
				jButtonAnterioresTipoNovedadNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoNovedadNomi")) {
				jButtonSiguientesTipoNovedadNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNovedadNomiBusqueda")) {
				this.jButtonidTipoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNovedadNomiBusqueda")) {
				this.jButtoncodigoTipoNovedadNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNovedadNomiBusqueda")) {
				this.jButtonnombreTipoNovedadNomiBusquedaActionPerformed(evt);
			}
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoNovedadNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoNovedadNomi")) {
				closingInternalFrameTipoNovedadNomi();
				
			} else if(sTipo.equals("jButtonCancelarTipoNovedadNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoNovedadNomi = (JInternalFrameBase)evt.getSource();
	            	
	            TipoNovedadNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoNovedadNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNovedadNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoNovedadNomiActionPerformed(null);
			}
			
			TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponovedadnomi,new Object(),this.tiponovedadnomiParameterGeneral,this.tiponovedadnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoNovedadNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoNovedadNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoNovedadNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiponovedadnomi)) {
			if(!esControlTabla) {
				if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);			
				}
				
				if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponovedadnomiReturnGeneral=tiponovedadnomiLogic.procesarEventosTipoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponovedadnomiLogic.getTipoNovedadNomis(),this.tiponovedadnomi,this.tiponovedadnomiParameterGeneral,this.isEsNuevoTipoNovedadNomi,classes);//this.tiponovedadnomiLogic.getTipoNovedadNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoNovedadNomi(this.tiponovedadnomiReturnGeneral,this.tiponovedadnomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoNovedadNomi(classes,this.tiponovedadnomiReturnGeneral,this.tiponovedadnomiBean,false);
					}
						
					if(this.tiponovedadnomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoNovedadNomi(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoNovedadNomi(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi());	
					}
						
					if(this.tiponovedadnomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoNovedadNomi(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi(),classes);//this.tiponovedadnomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoNovedadNomi(this.tiponovedadnomi,classes);//this.tiponovedadnomiBean);									
				}
			
				if(TipoNovedadNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoNovedadNomi(this.tiponovedadnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNovedadNomi(this.tiponovedadnomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiponovedadnomiAnterior!=null) {
						this.tiponovedadnomi=this.tiponovedadnomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponovedadnomiReturnGeneral=tiponovedadnomiLogic.procesarEventosTipoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponovedadnomiLogic.getTipoNovedadNomis(),this.tiponovedadnomi,this.tiponovedadnomiParameterGeneral,this.isEsNuevoTipoNovedadNomi,classes);//this.tiponovedadnomiLogic.getTipoNovedadNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponovedadnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponovedadnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi(),tiponovedadnomiLogic.getTipoNovedadNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi(),this.tiponovedadnomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoNovedadNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoNovedadNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoNovedadNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoNovedadNomi() throws Exception {
		
		TipoNovedadNomiModel tiponovedadnomiModel=(TipoNovedadNomiModel)this.jTableDatosTipoNovedadNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponovedadnomiModel.tiponovedadnomis=this.tiponovedadnomiLogic.getTipoNovedadNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiponovedadnomiModel.tiponovedadnomis=this.tiponovedadnomis;
		}
		
		
		((TipoNovedadNomiModel) this.jTableDatosTipoNovedadNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoNovedadNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiponovedadnomiAnterior(),this.tiponovedadnomiLogic.getTipoNovedadNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiponovedadnomiAnterior(),this.tiponovedadnomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoNovedadNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadNomi.class)) {
					this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(tiponovedadnomi.getNovedadNomis());
					this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
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
										
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponovedadnomi,new Object(),generalEntityParameterGeneral,this.tiponovedadnomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoNovedadNomiConstantesFunciones.getClassesRelationshipsOfTipoNovedadNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoNovedadNomiConstantesFunciones.getClassesRelationshipsFromStringsOfTipoNovedadNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoNovedadNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoNovedadNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponovedadnomi,new Object(),generalEntityParameterGeneral,this.tiponovedadnomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoNovedadNomi(TipoNovedadNomiBean tiponovedadnomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadNomi.class)) {
					this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.setNovedadNomis(tiponovedadnomi.getNovedadNomis());
					this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadNomi(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoNovedadNomi(ArrayList<Classe> classes,TipoNovedadNomiReturnGeneral tiponovedadnomiReturnGeneral,TipoNovedadNomiBean tiponovedadnomiBean,Boolean conDefault) throws Exception {
		
			this.tiponovedadnomiBean.setNovedadNomis(tiponovedadnomiReturnGeneral.getTipoNovedadNomi().getNovedadNomis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(NovedadNomi.class)) {
					tiponovedadnomi.setNovedadNomis(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiBeanSwingJInternalFrame.novedadnomiLogic.getNovedadNomis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiponovedadnomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoNovedadNomi = new TipoNovedadNomiDetalleFormJInternalFrame(jDesktopPane,this.tiponovedadnomiSessionBean.getConGuardarRelaciones(),this.tiponovedadnomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.setVisible(false);
		this.jInternalFrameDetalleFormTipoNovedadNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.tiponovedadnomiLogic=this.tiponovedadnomiLogic;
		
		this.cargarCombosFrameForeignKeyTipoNovedadNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNovedadNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNovedadNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoNovedadNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoNovedadNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNovedadNomi"));
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoNovedadNomi"));

		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarToolBarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNovedadNomi"));
					
		this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemModificarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarToolBarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNovedadNomi"));
						
		this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemActualizarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNovedadNomi"));
								
		this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemEliminarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoNovedadNomi"));
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNovedadNomi"));
					
		this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemCancelarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNovedadNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemDetalleCerrarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNovedadNomi"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNovedadNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNovedadNomi"));
		
		
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNovedadNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonidTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtoncodigoTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonnombreTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNovedadNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNovedadNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoNovedadNomi"));
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNovedadNomi"));
		}
		
		this.jTableDatosTipoNovedadNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoNovedadNomi"));
		
		this.jTableDatosTipoNovedadNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoNovedadNomi"));
		
		this.jButtonNuevoTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoTipoNovedadNomi"));
		
		this.jButtonDuplicarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"DuplicarTipoNovedadNomi"));
		
		this.jButtonCopiarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"CopiarTipoNovedadNomi"));
		
		this.jButtonVerFormTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"VerFormTipoNovedadNomi"));
		
		
		this.jButtonNuevoToolBarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoNovedadNomi"));
			
		this.jButtonDuplicarToolBarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoNovedadNomi"));
			
		this.jMenuItemNuevoTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoNovedadNomi"));
			
		this.jMenuItemDuplicarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoNovedadNomi"));		
		
		
		this.jButtonNuevoRelacionesTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoNovedadNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoNovedadNomi"));
			
		this.jMenuItemNuevoRelacionesTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoNovedadNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarTipoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonModificarToolBarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNovedadNomi"));
			
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemModificarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"ActualizarTipoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonActualizarToolBarTipoNovedadNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNovedadNomi"));
				
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemActualizarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarTipoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonEliminarToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNovedadNomi"));
						
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemEliminarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarTipoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonCancelarToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNovedadNomi"));
			
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemCancelarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNovedadNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoNovedadNomi"));		
		
		
		this.jButtonCerrarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarTipoNovedadNomi"));
		
		
		this.jButtonCerrarToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoNovedadNomi"));
			
		this.jMenuItemCerrarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoNovedadNomi"));
			
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jMenuItemDetalleCerrarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNovedadNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoNovedadNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNovedadNomi"));
		}
		
		this.jButtonCopiarToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoNovedadNomi"));
			
		this.jButtonVerFormToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoNovedadNomi"));
		
		this.jMenuItemGuardarCambiosTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoNovedadNomi"));
			
		this.jMenuItemCopiarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoNovedadNomi"));		
		
		this.jMenuItemVerFormTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoNovedadNomi"));		
		
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNovedadNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoNovedadNomi"));
			
		this.jMenuItemGuardarCambiosTablaTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNovedadNomi"));		
		
		
		
		this.jButtonRecargarInformacionTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoNovedadNomi"));
					
		this.jButtonRecargarInformacionToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoNovedadNomi"));
		
		this.jMenuItemRecargarInformacionTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoNovedadNomi"));		
		
		
		
		this.jButtonAnterioresTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"AnterioresTipoNovedadNomi"));
		
		
		this.jButtonAnterioresToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoNovedadNomi"));
		
		this.jMenuItemAnterioresTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoNovedadNomi"));		
		
		
		this.jButtonSiguientesTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"SiguientesTipoNovedadNomi"));
		
		
		this.jButtonSiguientesToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoNovedadNomi"));
			
		this.jMenuItemSiguientesTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoNovedadNomi"));
			
		this.jMenuItemAbrirOrderByTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoNovedadNomi"));
			
		this.jMenuItemMostrarOcultarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoNovedadNomi"));
			
		this.jMenuItemDetalleAbrirOrderByTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoNovedadNomi"));
			
		this.jMenuItemDetalleMostarOcultarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoNovedadNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoNovedadNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoNovedadNomi"));
			
		this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoNovedadNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoNovedadNomi"));

		this.jCheckBoxSeleccionadosTipoNovedadNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoNovedadNomi"));
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNovedadNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoNovedadNomi"));
			
		this.jComboBoxTiposAccionesTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoNovedadNomi"));
					
		this.jComboBoxTiposSeleccionarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoNovedadNomi"));
			
		this.jTextFieldValorCampoGeneralTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoNovedadNomi"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonidTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtoncodigoTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonnombreTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNovedadNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoNovedadNomi!=null) {
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNovedadNomi"));
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNovedadNomi"));
				this.jInternalFrameReporteDinamicoTipoNovedadNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNovedadNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNovedadNomi"));				
			//this.jButtonGenerarReporteDinamicoTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNovedadNomi"));
			//this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNovedadNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoNovedadNomi!=null) {
				this.jInternalFrameImportacionTipoNovedadNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNovedadNomi"));
				this.jInternalFrameImportacionTipoNovedadNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNovedadNomi"));
				this.jInternalFrameImportacionTipoNovedadNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNovedadNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoNovedadNomi"));
			
			this.jButtonAbrirOrderByToolBarTipoNovedadNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoNovedadNomi"));			
			
			if(this.jInternalFrameOrderByTipoNovedadNomi!=null) {
				this.jInternalFrameOrderByTipoNovedadNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNovedadNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNovedadNomi.jTabbedPaneRelacionesTipoNovedadNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNovedadNomi"));
		
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
            		closingInternalFrameTipoNovedadNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoNovedadNomi = (JInternalFrameBase)event.getSource();
	            	
	            TipoNovedadNomiBeanSwingJInternalFrame jInternalFrameParent=(TipoNovedadNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNovedadNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoNovedadNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoNovedadNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoNovedadNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoNovedadNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoNovedadNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoNovedadNomi";
		inputMap = this.jButtonNuevoTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoNovedadNomi";
		inputMap = this.jButtonNuevoRelacionesTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNovedadNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoNovedadNomi";
		inputMap = this.jButtonModificarTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoNovedadNomi";
		inputMap = this.jButtonActualizarTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoNovedadNomi";
		inputMap = this.jButtonEliminarTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoNovedadNomi";
		inputMap = this.jButtonCancelarTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoNovedadNomi";
		inputMap = this.jButtonCerrarTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoNovedadNomi";
		inputMap = this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonGuardarCambiosTipoNovedadNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoNovedadNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoNovedadNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoNovedadNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoNovedadNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoNovedadNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonidTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtoncodigoTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNovedadNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNovedadNomi.jButtonnombreTipoNovedadNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNovedadNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoNovedadNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoNovedadNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoNovedadNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoNovedadNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoNovedadNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
					tiponovedadnomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomis) {
					tiponovedadnomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoNovedadNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNovedadNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
						tiponovedadnomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomis) {
						tiponovedadnomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNovedadNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNovedadNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNovedadNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoNovedadNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNovedadNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoNovedadNomi.getSelectedRows();
			
			TipoNovedadNomi tiponovedadnomiLocal=new TipoNovedadNomi();
			
			//this.seleccionarTodosTipoNovedadNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponovedadnomiLocal =(TipoNovedadNomi) this.tiponovedadnomiLogic.getTipoNovedadNomis().toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiponovedadnomiLocal =(TipoNovedadNomi) this.tiponovedadnomis.toArray()[this.jTableDatosTipoNovedadNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiponovedadnomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
						tiponovedadnomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomis) {
						tiponovedadnomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNovedadNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNovedadNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNovedadNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoNovedadNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoNovedadNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoNovedadNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoNovedadNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoNovedadNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomiLogic.getTipoNovedadNomis()) {
				
						if(sTipoSeleccionar.equals(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponovedadnomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponovedadnomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomis) {
					
						if(sTipoSeleccionar.equals(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponovedadnomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponovedadnomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoNovedadNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoNovedadNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoNovedadNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoNovedadNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoNovedadNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoNovedadNomi(conSplash);
				
					this.generarReporteTipoNovedadNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoNovedadNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNovedadNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNovedadNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNovedadNomi();
				
				this.exportarTipoNovedadNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoNovedadNomis();
				//this.importarTipoNovedadNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNovedadNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoNovedadNomisSeleccionados();
				//this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoNovedadNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoNovedadNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoNovedadNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoNovedadNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoNovedadNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoNovedadNomi(conSplash);
					
						//this.actualizarParametrosGeneralTipoNovedadNomi();
						
						this.generarReporteProcesoAccionTipoNovedadNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoNovedadNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo NovedadS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Novedad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoNovedadNomi();
				
						this.actualizarParametrosGeneralTipoNovedadNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiponovedadnomiReturnGeneral=tiponovedadnomiLogic.procesarAccionTipoNovedadNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiponovedadnomiLogic.getTipoNovedadNomis(),this.tiponovedadnomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoNovedadNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoNovedadNomi();
					
					TipoNovedadNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoNovedadNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNovedadNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNovedadNomi.jComboBoxTiposAccionesFormularioTipoNovedadNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoNovedadNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoNovedadNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoNovedadNomi();
			
			if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
			TipoNovedadNomi tiponovedadnomi=new TipoNovedadNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoNovedadNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoNovedadNomi.getSelectedItem();
			
			
			
			
			tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiponovedadnomisSeleccionados.size()==1) {
				for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisSeleccionados) {
					tiponovedadnomi=tiponovedadnomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Novedad Nomi")) {
					jButtonNovedadNomiActionPerformed(null,rowIndex,true,false,tiponovedadnomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoNovedadNomi();
			
      		//this.finishProcessTipoNovedadNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoNovedadNomiReturnGeneral() throws Exception {
		if(this.tiponovedadnomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiponovedadnomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiponovedadnomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiponovedadnomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiponovedadnomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiponovedadnomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoNovedadNomi(false);
		}
		
		if(this.tiponovedadnomiReturnGeneral.getConRetornoLista() || this.tiponovedadnomiReturnGeneral.getConRetornoObjeto()) {
			if(this.tiponovedadnomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponovedadnomiLogic.setTipoNovedadNomis(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiponovedadnomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponovedadnomiLogic.setTipoNovedadNomi(this.tiponovedadnomiReturnGeneral.getTipoNovedadNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoNovedadNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoNovedadNomi() throws Exception {
		
		
	}
	
	public ArrayList<TipoNovedadNomi> getTipoNovedadNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoNovedadNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomiLogic.getTipoNovedadNomis()) {
					if(tiponovedadnomiAux.getIsSelected()) {
						tiponovedadnomisSeleccionados.add(tiponovedadnomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNovedadNomi tiponovedadnomiAux:this.tiponovedadnomis) {
					if(tiponovedadnomiAux.getIsSelected()) {
						tiponovedadnomisSeleccionados.add(tiponovedadnomiAux);				
					}
				}
			}
			
			if(tiponovedadnomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiponovedadnomisSeleccionados.addAll(this.tiponovedadnomiLogic.getTipoNovedadNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiponovedadnomisSeleccionados.addAll(this.tiponovedadnomis);				
					}
				}
			}
		} else {
			tiponovedadnomisSeleccionados.add(this.tiponovedadnomi);
		}
		
		return tiponovedadnomisSeleccionados;
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
	
	public void generarReporteTipoNovedadNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoNovedadNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoNovedadNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNovedadNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNovedadNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoNovedadNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Novedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoNovedadNomisSeleccionados() throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomisSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoNovedadNomisSeleccionados() throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoNovedadNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoNovedadNomisSeleccionados() throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoNovedadNomi();
		
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoNovedadNomi();
		
		
		//this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomisSeleccionados ,tiponovedadnomiImplementable,tiponovedadnomiImplementableHome);
	}
	
	public void mostrarImportacionTipoNovedadNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoNovedadNomi();
		
		this.abrirFrameImportacionTipoNovedadNomi();		
		
			
		//this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomisSeleccionados ,tiponovedadnomiImplementable,tiponovedadnomiImplementableHome);
	}
	
	public void importarTipoNovedadNomis() throws Exception {		
	
	}
	
	public void exportarTipoNovedadNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoNovedadNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoNovedadNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoNovedadNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Novedad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoNovedadNomisSeleccionados() throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponovedadnomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoNovedadNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoNovedadNomi(tiponovedadnomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiponovedadnomiAux.setsDetalleGeneralEntityReporte(tiponovedadnomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoNovedadNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoNovedadNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNovedadNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNovedadNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiponovedadnomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponovedadnomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponovedadnomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponovedadnomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoNovedadNomisSeleccionados() throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponovedadnomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoNovedadNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoNovedadNomi(row);				
				iRow++;
			}				
			
			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoNovedadNomi(tiponovedadnomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoNovedadNomisSeleccionados() throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();		
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponovedadnomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiponovedadnomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiponovedadnomi");
			//elementRoot.appendChild(element);
		
			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisSeleccionados) {
				element = document.createElement("tiponovedadnomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoNovedadNomi(tiponovedadnomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Novedad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoNovedadNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiponovedadnomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponovedadnomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponovedadnomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoNovedadNomi(TipoNovedadNomi tiponovedadnomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoNovedadNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiponovedadnomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoNovedadNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiponovedadnomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoNovedadNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiponovedadnomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoNovedadNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiponovedadnomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoNovedadNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados=new ArrayList<TipoNovedadNomi>();
		
		tiponovedadnomisSeleccionados=this.getTipoNovedadNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoNovedadNomi(tiponovedadnomisSeleccionados);
		
		this.generarReporteTipoNovedadNomis("Todos",tiponovedadnomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoNovedadNomi(ArrayList<TipoNovedadNomi> tiponovedadnomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoNovedadNomi tiponovedadnomiAux:tiponovedadnomisSeleccionados) {
				tiponovedadnomiAux.setsDetalleGeneralEntityReporte(tiponovedadnomiAux.toString());
			
				if(sTipoSeleccionar.equals(TipoNovedadNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiponovedadnomiAux.setsDescripcionGeneralEntityReporte1(tiponovedadnomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoNovedadNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiponovedadnomiAux.setsDescripcionGeneralEntityReporte1(tiponovedadnomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNovedadNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoNovedadNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoNovedadNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=true;
				this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=true;
			}
			
			this.isVisibilidadCeldaModificarTipoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
			this.isVisibilidadCeldaModificarTipoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=true;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
			this.isVisibilidadCeldaModificarTipoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=true;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=true;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
			this.isVisibilidadCeldaModificarTipoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=true;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=true;
			this.isVisibilidadCeldaModificarTipoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
			this.isVisibilidadCeldaModificarTipoNovedadNomi=true;
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
			this.isVisibilidadCeldaCancelarTipoNovedadNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNovedadNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoNovedadNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=true;
		} else {
			this.actualizarEstadoPanelsTipoNovedadNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoNovedadNomi=false;
			//this.isVisibilidadCeldaVerFormTipoNovedadNomi=false;
			this.isVisibilidadCeldaDuplicarTipoNovedadNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiponovedadnomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
			if(!tiponovedadnomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;												
			}
			
			this.jButtonCerrarTipoNovedadNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNovedadNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.tiponovedadnomi)) {
			this.isVisibilidadCeldaActualizarTipoNovedadNomi=false;
			this.isVisibilidadCeldaEliminarTipoNovedadNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNovedadNomi() {
		this.isVisibilidadCeldaNuevoTipoNovedadNomi=false;
		this.isVisibilidadCeldaGuardarCambiosTipoNovedadNomi=false;
	}
	
	public void actualizarEstadoPanelsTipoNovedadNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionTipoNovedadNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNovedadNomi!=null) {
				this.jScrollPanelDatosTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNovedadNomi!=null) {
				this.jPanelPaginacionTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNovedadNomi!=null) {
				this.jPanelParametrosReportesTipoNovedadNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionTipoNovedadNomi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoNovedadNomi!=null) {
				this.jScrollPanelDatosTipoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNovedadNomi!=null) {
				this.jPanelPaginacionTipoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNovedadNomi!=null) {
				this.jPanelParametrosReportesTipoNovedadNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionTipoNovedadNomi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoNovedadNomi!=null) {
				this.jScrollPanelDatosTipoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNovedadNomi!=null) {
				this.jPanelPaginacionTipoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNovedadNomi!=null) {
				this.jPanelParametrosReportesTipoNovedadNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionTipoNovedadNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNovedadNomi!=null) {
				this.jScrollPanelDatosTipoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNovedadNomi!=null) {
				this.jPanelPaginacionTipoNovedadNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNovedadNomi!=null) {
				this.jPanelParametrosReportesTipoNovedadNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionTipoNovedadNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNovedadNomi!=null) {
				this.jScrollPanelDatosTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNovedadNomi!=null) {
				this.jPanelPaginacionTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNovedadNomi!=null) {
				this.jPanelParametrosReportesTipoNovedadNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionTipoNovedadNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoNovedadNomi!=null) {
				this.jScrollPanelDatosTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNovedadNomi!=null) {
				this.jPanelPaginacionTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNovedadNomi!=null) {
				this.jPanelParametrosReportesTipoNovedadNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoNovedadNomi!=null) {
				this.jScrollPanelDatosEdicionTipoNovedadNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoNovedadNomi!=null) {
				this.jScrollPanelDatosTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNovedadNomi!=null) {
				this.jPanelPaginacionTipoNovedadNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNovedadNomi!=null) {
				this.jPanelParametrosReportesTipoNovedadNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tiponovedadnomiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoNovedadNomiParaNovedadNomis() throws Exception {
		Boolean isPaginaPopupNovedadNomi=false;

		try {

			if(this.tiponovedadnomiSessionBean==null) {
				this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean==null) {
				this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean=new NovedadNomiSessionBean();
			}

			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean.setsPathNavegacionActual(tiponovedadnomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NovedadNomiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNovedadNomi=this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNovedadNomi(true);
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNovedadNomi(TipoNovedadNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean.setisBusquedaDesdeForeignKeySesionTipoNovedadNomi(true);
			this.jInternalFrameDetalleFormTipoNovedadNomi.novedadnomiSessionBean.setlidTipoNovedadNomiActual(this.idTipoNovedadNomiActual);

			tiponovedadnomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoNovedadNomi(true);
			tiponovedadnomiSessionBean.setlIdTipoNovedadNomiActualForeignKey(this.idTipoNovedadNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoNovedadNomiSessionBean tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
		
		if(this.tiponovedadnomiSessionBean==null) {
			this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
		}
		
		this.tiponovedadnomiSessionBean.setsUltimaBusquedaTipoNovedadNomi(this.getsAccionBusqueda());
		this.tiponovedadnomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiponovedadnomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoNovedadNomiSessionBean tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
		
		if(this.tiponovedadnomiSessionBean==null) {
			this.tiponovedadnomiSessionBean=new TipoNovedadNomiSessionBean();
		}
		
		if(this.tiponovedadnomiSessionBean.getsUltimaBusquedaTipoNovedadNomi()!=null&&!this.tiponovedadnomiSessionBean.getsUltimaBusquedaTipoNovedadNomi().equals("")) {
			this.setsAccionBusqueda(tiponovedadnomiSessionBean.getsUltimaBusquedaTipoNovedadNomi());
			this.setiNumeroPaginacion(tiponovedadnomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiponovedadnomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tiponovedadnomiSessionBean.setsUltimaBusquedaTipoNovedadNomi("");
		this.tiponovedadnomiSessionBean.setiNumeroPaginacion(TipoNovedadNomiConstantesFunciones.INUMEROPAGINACION);
		this.tiponovedadnomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoNovedadNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoNovedadNomi() {
		this.updateBorderResaltarBusquedasFormularioTipoNovedadNomi();
		this.updateVisibilidadBusquedasFormularioTipoNovedadNomi();
		this.updateHabilitarBusquedasFormularioTipoNovedadNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoNovedadNomi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoNovedadNomi() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoNovedadNomi() {
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
	
	public void updateControlesFormularioTipoNovedadNomi() throws Exception {

		if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoNovedadNomi();
		this.updateVisibilidadResaltarControlesFormularioTipoNovedadNomi();
		this.updateHabilitarResaltarControlesFormularioTipoNovedadNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoNovedadNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiponovedadnomiConstantesFunciones.resaltaridTipoNovedadNomi!=null && this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.setBorder(this.tiponovedadnomiConstantesFunciones.resaltaridTipoNovedadNomi);}
		if(this.tiponovedadnomiConstantesFunciones.resaltarcodigoTipoNovedadNomi!=null && this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.setBorder(this.tiponovedadnomiConstantesFunciones.resaltarcodigoTipoNovedadNomi);}
		if(this.tiponovedadnomiConstantesFunciones.resaltarnombreTipoNovedadNomi!=null && this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.setBorder(this.tiponovedadnomiConstantesFunciones.resaltarnombreTipoNovedadNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoNovedadNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
	
		//this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.setVisible(this.tiponovedadnomiConstantesFunciones.mostraridTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.jPanelidTipoNovedadNomi.setVisible(this.tiponovedadnomiConstantesFunciones.mostraridTipoNovedadNomi);
		//this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.setVisible(this.tiponovedadnomiConstantesFunciones.mostrarcodigoTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.jPanelcodigoTipoNovedadNomi.setVisible(this.tiponovedadnomiConstantesFunciones.mostrarcodigoTipoNovedadNomi);
		//this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.setVisible(this.tiponovedadnomiConstantesFunciones.mostrarnombreTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.jPanelnombreTipoNovedadNomi.setVisible(this.tiponovedadnomiConstantesFunciones.mostrarnombreTipoNovedadNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoNovedadNomi() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNovedadNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNovedadNomi!=null) {
	
		this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldidTipoNovedadNomi.setEnabled(this.tiponovedadnomiConstantesFunciones.activaridTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.jTextFieldcodigoTipoNovedadNomi.setEnabled(this.tiponovedadnomiConstantesFunciones.activarcodigoTipoNovedadNomi);
		this.jInternalFrameDetalleFormTipoNovedadNomi.jTextAreanombreTipoNovedadNomi.setEnabled(this.tiponovedadnomiConstantesFunciones.activarnombreTipoNovedadNomi);
		}
	}
	
		
}