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

import com.bydan.erp.nomina.util.EstadoSolicitudNomiConstantesFunciones;
import com.bydan.erp.nomina.util.EstadoSolicitudNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EstadoSolicitudNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EstadoSolicitudNomiBean;
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
public class EstadoSolicitudNomiBeanSwingJInternalFrame extends EstadoSolicitudNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoSolicitudNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoSolicitudNomi> estadosolicitudnomiValidator = new ClassValidator<EstadoSolicitudNomi>(EstadoSolicitudNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoSolicitudNomi estadosolicitudnomi;	
	public EstadoSolicitudNomi estadosolicitudnomiAux;
	public EstadoSolicitudNomi estadosolicitudnomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoSolicitudNomi estadosolicitudnomiTotales;
	public Long idEstadoSolicitudNomiActual;
	public Long iIdNuevoEstadoSolicitudNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosSolicitudReemplazo=false;

	public Boolean getIsTienePermisosSolicitudReemplazo() {
		return isTienePermisosSolicitudReemplazo;
	}

	public void setIsTienePermisosSolicitudReemplazo(Boolean isTienePermisosSolicitudReemplazo) {
		this.isTienePermisosSolicitudReemplazo= isTienePermisosSolicitudReemplazo;
	}


	public Boolean isTienePermisosSolicitudHoraExtra=false;

	public Boolean getIsTienePermisosSolicitudHoraExtra() {
		return isTienePermisosSolicitudHoraExtra;
	}

	public void setIsTienePermisosSolicitudHoraExtra(Boolean isTienePermisosSolicitudHoraExtra) {
		this.isTienePermisosSolicitudHoraExtra= isTienePermisosSolicitudHoraExtra;
	}


	public Boolean isTienePermisosSolicitudVacacion=false;

	public Boolean getIsTienePermisosSolicitudVacacion() {
		return isTienePermisosSolicitudVacacion;
	}

	public void setIsTienePermisosSolicitudVacacion(Boolean isTienePermisosSolicitudVacacion) {
		this.isTienePermisosSolicitudVacacion= isTienePermisosSolicitudVacacion;
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
	
	public Boolean isPermisoTodoEstadoSolicitudNomi;
	public Boolean isPermisoNuevoEstadoSolicitudNomi;
	public Boolean isPermisoActualizarEstadoSolicitudNomi;
	public Boolean isPermisoActualizarOriginalEstadoSolicitudNomi;
	public Boolean isPermisoEliminarEstadoSolicitudNomi;
	public Boolean isPermisoGuardarCambiosEstadoSolicitudNomi;
	public Boolean isPermisoConsultaEstadoSolicitudNomi;
	public Boolean isPermisoBusquedaEstadoSolicitudNomi;
	public Boolean isPermisoReporteEstadoSolicitudNomi;
	public Boolean isPermisoPaginacionMedioEstadoSolicitudNomi;
	public Boolean isPermisoPaginacionAltoEstadoSolicitudNomi;
	public Boolean isPermisoPaginacionTodoEstadoSolicitudNomi;
	public Boolean isPermisoCopiarEstadoSolicitudNomi;
	public Boolean isPermisoVerFormEstadoSolicitudNomi;
	public Boolean isPermisoDuplicarEstadoSolicitudNomi;
	public Boolean isPermisoOrdenEstadoSolicitudNomi;
	
	
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
	
	public EstadoSolicitudNomiParameterReturnGeneral estadosolicitudnomiReturnGeneral;
	public EstadoSolicitudNomiParameterReturnGeneral estadosolicitudnomiParameterGeneral;
	
	

	public SolicitudReemplazoLogic solicitudreemplazoLogic=null;

	public SolicitudReemplazoLogic getSolicitudReemplazoLogic() {
		return solicitudreemplazoLogic;
	}

	public void setSolicitudReemplazoLogic(SolicitudReemplazoLogic solicitudreemplazoLogic) {
		this.solicitudreemplazoLogic = solicitudreemplazoLogic;
	}


	public SolicitudHoraExtraLogic solicitudhoraextraLogic=null;

	public SolicitudHoraExtraLogic getSolicitudHoraExtraLogic() {
		return solicitudhoraextraLogic;
	}

	public void setSolicitudHoraExtraLogic(SolicitudHoraExtraLogic solicitudhoraextraLogic) {
		this.solicitudhoraextraLogic = solicitudhoraextraLogic;
	}


	public SolicitudVacacionLogic solicitudvacacionLogic=null;

	public SolicitudVacacionLogic getSolicitudVacacionLogic() {
		return solicitudvacacionLogic;
	}

	public void setSolicitudVacacionLogic(SolicitudVacacionLogic solicitudvacacionLogic) {
		this.solicitudvacacionLogic = solicitudvacacionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoSolicitudNomi=false;
	public Boolean esParaAccionDesdeFormularioEstadoSolicitudNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoSolicitudNomiSessionBeanAdditional estadosolicitudnomiSessionBeanAdditional=null;
	
	public EstadoSolicitudNomiSessionBeanAdditional getEstadoSolicitudNomiSessionBeanAdditional() {
		return this.estadosolicitudnomiSessionBeanAdditional;
	}
	
	public void setEstadoSolicitudNomiSessionBeanAdditional(EstadoSolicitudNomiSessionBeanAdditional estadosolicitudnomiSessionBeanAdditional) {
		try {
			this.estadosolicitudnomiSessionBeanAdditional=estadosolicitudnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoSolicitudNomiBeanSwingJInternalFrameAdditional estadosolicitudnomiBeanSwingJInternalFrameAdditional=null;
	//public class EstadoSolicitudNomiBeanSwingJInternalFrame
	
	public EstadoSolicitudNomiBeanSwingJInternalFrameAdditional getEstadoSolicitudNomiBeanSwingJInternalFrameAdditional() {
		return this.estadosolicitudnomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoSolicitudNomiBeanSwingJInternalFrameAdditional(EstadoSolicitudNomiBeanSwingJInternalFrameAdditional estadosolicitudnomiBeanSwingJInternalFrameAdditional) {
		try {
			this.estadosolicitudnomiBeanSwingJInternalFrameAdditional=estadosolicitudnomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoSolicitudNomiLogic estadosolicitudnomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoSolicitudNomi estadosolicitudnomiBean;
	public EstadoSolicitudNomiConstantesFunciones estadosolicitudnomiConstantesFunciones;
	//public EstadoSolicitudNomiParameterReturnGeneral estadosolicitudnomiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoSolicitudNomi> estadosolicitudnomis;	
	//public List<EstadoSolicitudNomi> estadosolicitudnomisEliminados;
	//public List<EstadoSolicitudNomi> estadosolicitudnomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoSolicitudNomi=true;
	public Boolean isVisibilidadCeldaCopiarEstadoSolicitudNomi=true;
	public Boolean isVisibilidadCeldaVerFormEstadoSolicitudNomi=true;
	public Boolean isVisibilidadCeldaOrdenEstadoSolicitudNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
	public Boolean isVisibilidadCeldaModificarEstadoSolicitudNomi=false;
	public Boolean isVisibilidadCeldaActualizarEstadoSolicitudNomi=false;
	public Boolean isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
	public Boolean isVisibilidadCeldaCancelarEstadoSolicitudNomi=false;
	public Boolean isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;	
	
	
	
	public Long getiIdNuevoEstadoSolicitudNomi() {
		return this.iIdNuevoEstadoSolicitudNomi;
	}

	public void setiIdNuevoEstadoSolicitudNomi(Long iIdNuevoEstadoSolicitudNomi) {
		this.iIdNuevoEstadoSolicitudNomi = iIdNuevoEstadoSolicitudNomi;
	}
	
	public Long getidEstadoSolicitudNomiActual() {
		return this.idEstadoSolicitudNomiActual;
	}

	public void setidEstadoSolicitudNomiActual(Long idEstadoSolicitudNomiActual) {
		this.idEstadoSolicitudNomiActual = idEstadoSolicitudNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoSolicitudNomi getestadosolicitudnomi() {
		return this.estadosolicitudnomi;
	}

	public void setestadosolicitudnomi(EstadoSolicitudNomi estadosolicitudnomi) {
		this.estadosolicitudnomi = estadosolicitudnomi;
	}
	
	public EstadoSolicitudNomi getestadosolicitudnomiAux() {
		return this.estadosolicitudnomiAux;
	}

	public void setestadosolicitudnomiAux(EstadoSolicitudNomi estadosolicitudnomiAux) {
		this.estadosolicitudnomiAux = estadosolicitudnomiAux;
	}				
	
	public EstadoSolicitudNomi getestadosolicitudnomiAnterior() {
		return this.estadosolicitudnomiAnterior;
	}

	public void setestadosolicitudnomiAnterior(EstadoSolicitudNomi estadosolicitudnomiAnterior) {
		this.estadosolicitudnomiAnterior = estadosolicitudnomiAnterior;
	}	
	
	public EstadoSolicitudNomi getestadosolicitudnomiTotales() {
		return this.estadosolicitudnomiTotales;
	}

	public void setestadosolicitudnomiTotales(EstadoSolicitudNomi estadosolicitudnomiTotales) {
		this.estadosolicitudnomiTotales = estadosolicitudnomiTotales;
	}	
	
	public EstadoSolicitudNomi getestadosolicitudnomiBean() {
		return this.estadosolicitudnomiBean;
	}

	public void setestadosolicitudnomiBean(EstadoSolicitudNomi estadosolicitudnomiBean) {
		this.estadosolicitudnomiBean = estadosolicitudnomiBean;
	}	
	
	public EstadoSolicitudNomiParameterReturnGeneral getestadosolicitudnomiReturnGeneral() {
		return this.estadosolicitudnomiReturnGeneral;
	}

	public void setestadosolicitudnomiReturnGeneral(EstadoSolicitudNomiParameterReturnGeneral estadosolicitudnomiReturnGeneral) {
		this.estadosolicitudnomiReturnGeneral = estadosolicitudnomiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoSolicitudNomiLogic getEstadoSolicitudNomiLogic()	{		
		return estadosolicitudnomiLogic;
	}

	public void setEstadoSolicitudNomiLogic(EstadoSolicitudNomiLogic estadosolicitudnomiLogic) {
		this.estadosolicitudnomiLogic = estadosolicitudnomiLogic;
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
	
	public Boolean getIsEsNuevoEstadoSolicitudNomi() {
		return isEsNuevoEstadoSolicitudNomi;
	}

	public void setIsEsNuevoEstadoSolicitudNomi(Boolean isEsNuevoEstadoSolicitudNomi) {
		this.isEsNuevoEstadoSolicitudNomi = isEsNuevoEstadoSolicitudNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoSolicitudNomi() {
		return esParaAccionDesdeFormularioEstadoSolicitudNomi;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoSolicitudNomi(Boolean esParaAccionDesdeFormularioEstadoSolicitudNomi) {
		this.esParaAccionDesdeFormularioEstadoSolicitudNomi = esParaAccionDesdeFormularioEstadoSolicitudNomi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoSolicitudNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoSolicitudNomiConstantesFunciones.refrescarForeignKeysDescripcionesEstadoSolicitudNomi(this.estadosolicitudnomiLogic.getEstadoSolicitudNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoSolicitudNomiConstantesFunciones.refrescarForeignKeysDescripcionesEstadoSolicitudNomi(this.estadosolicitudnomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadosolicitudnomiLogic.setEstadoSolicitudNomis(this.estadosolicitudnomis);
			estadosolicitudnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoSolicitudNomiParameterReturnGeneral getEstadoSolicitudNomiParameterGeneral() {
		return this.estadosolicitudnomiParameterGeneral;
	}
	
	public void setEstadoSolicitudNomiParameterGeneral(EstadoSolicitudNomiParameterReturnGeneral estadosolicitudnomiParameterGeneral) {
		this.estadosolicitudnomiParameterGeneral = estadosolicitudnomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoSolicitudNomi() {
		return isPermisoTodoEstadoSolicitudNomi;
	}

	public void setIsPermisoTodoEstadoSolicitudNomi(Boolean isPermisoTodoEstadoSolicitudNomi) {
		this.isPermisoTodoEstadoSolicitudNomi = isPermisoTodoEstadoSolicitudNomi;
	}

	public Boolean getIsPermisoNuevoEstadoSolicitudNomi() {
		return isPermisoNuevoEstadoSolicitudNomi;
	}

	public void setIsPermisoNuevoEstadoSolicitudNomi(Boolean isPermisoNuevoEstadoSolicitudNomi) {
		this.isPermisoNuevoEstadoSolicitudNomi = isPermisoNuevoEstadoSolicitudNomi;
	}

	public Boolean getIsPermisoActualizarEstadoSolicitudNomi() {
		return isPermisoActualizarEstadoSolicitudNomi;
	}

	public void setIsPermisoActualizarEstadoSolicitudNomi(Boolean isPermisoActualizarEstadoSolicitudNomi) {
		this.isPermisoActualizarEstadoSolicitudNomi = isPermisoActualizarEstadoSolicitudNomi;
	}

	public Boolean getIsPermisoEliminarEstadoSolicitudNomi() {
		return isPermisoEliminarEstadoSolicitudNomi;
	}

	public void setIsPermisoEliminarEstadoSolicitudNomi(Boolean isPermisoEliminarEstadoSolicitudNomi) {
		this.isPermisoEliminarEstadoSolicitudNomi = isPermisoEliminarEstadoSolicitudNomi;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoSolicitudNomi() {
		return isPermisoGuardarCambiosEstadoSolicitudNomi;
	}

	public void setIsPermisoGuardarCambiosEstadoSolicitudNomi(Boolean isPermisoGuardarCambiosEstadoSolicitudNomi) {
		this.isPermisoGuardarCambiosEstadoSolicitudNomi = isPermisoGuardarCambiosEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoConsultaEstadoSolicitudNomi() {
		return isPermisoConsultaEstadoSolicitudNomi;
	}

	public void setIsPermisoConsultaEstadoSolicitudNomi(Boolean isPermisoConsultaEstadoSolicitudNomi) {
		this.isPermisoConsultaEstadoSolicitudNomi = isPermisoConsultaEstadoSolicitudNomi;
	}

	public Boolean getIsPermisoBusquedaEstadoSolicitudNomi() {
		return isPermisoBusquedaEstadoSolicitudNomi;
	}

	public void setIsPermisoBusquedaEstadoSolicitudNomi(Boolean isPermisoBusquedaEstadoSolicitudNomi) {
		this.isPermisoBusquedaEstadoSolicitudNomi = isPermisoBusquedaEstadoSolicitudNomi;
	}

	public Boolean getIsPermisoReporteEstadoSolicitudNomi() {
		return isPermisoReporteEstadoSolicitudNomi;
	}

	public void setIsPermisoReporteEstadoSolicitudNomi(Boolean isPermisoReporteEstadoSolicitudNomi) {
		this.isPermisoReporteEstadoSolicitudNomi = isPermisoReporteEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoSolicitudNomi() {
		return isPermisoPaginacionMedioEstadoSolicitudNomi;
	}

	public void setIsPermisoPaginacionMedioEstadoSolicitudNomi(Boolean isPermisoPaginacionMedioEstadoSolicitudNomi) {
		this.isPermisoPaginacionMedioEstadoSolicitudNomi = isPermisoPaginacionMedioEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoSolicitudNomi() {
		return isPermisoPaginacionTodoEstadoSolicitudNomi;
	}

	public void setIsPermisoPaginacionTodoEstadoSolicitudNomi(Boolean isPermisoPaginacionTodoEstadoSolicitudNomi) {
		this.isPermisoPaginacionTodoEstadoSolicitudNomi = isPermisoPaginacionTodoEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoSolicitudNomi() {
		return isPermisoPaginacionAltoEstadoSolicitudNomi;
	}

	public void setIsPermisoPaginacionAltoEstadoSolicitudNomi(Boolean isPermisoPaginacionAltoEstadoSolicitudNomi) {
		this.isPermisoPaginacionAltoEstadoSolicitudNomi = isPermisoPaginacionAltoEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoCopiarEstadoSolicitudNomi() {
		return isPermisoCopiarEstadoSolicitudNomi;
	}

	public void setIsPermisoCopiarEstadoSolicitudNomi(Boolean isPermisoCopiarEstadoSolicitudNomi) {
		this.isPermisoCopiarEstadoSolicitudNomi = isPermisoCopiarEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoVerFormEstadoSolicitudNomi() {
		return isPermisoVerFormEstadoSolicitudNomi;
	}

	public void setIsPermisoVerFormEstadoSolicitudNomi(Boolean isPermisoVerFormEstadoSolicitudNomi) {
		this.isPermisoVerFormEstadoSolicitudNomi = isPermisoVerFormEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoDuplicarEstadoSolicitudNomi() {
		return isPermisoDuplicarEstadoSolicitudNomi;
	}

	public void setIsPermisoDuplicarEstadoSolicitudNomi(Boolean isPermisoDuplicarEstadoSolicitudNomi) {
		this.isPermisoDuplicarEstadoSolicitudNomi = isPermisoDuplicarEstadoSolicitudNomi;
	}
	
	public Boolean getIsPermisoOrdenEstadoSolicitudNomi() {
		return isPermisoOrdenEstadoSolicitudNomi;
	}

	public void setIsPermisoOrdenEstadoSolicitudNomi(Boolean isPermisoOrdenEstadoSolicitudNomi) {
		this.isPermisoOrdenEstadoSolicitudNomi = isPermisoOrdenEstadoSolicitudNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoSolicitudNomi() {
		return isVisibilidadCeldaNuevoEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaNuevoEstadoSolicitudNomi(Boolean isVisibilidadCeldaNuevoEstadoSolicitudNomi) {
		this.isVisibilidadCeldaNuevoEstadoSolicitudNomi = isVisibilidadCeldaNuevoEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoSolicitudNomi() {
		return isVisibilidadCeldaDuplicarEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoSolicitudNomi(Boolean isVisibilidadCeldaDuplicarEstadoSolicitudNomi) {
		this.isVisibilidadCeldaDuplicarEstadoSolicitudNomi = isVisibilidadCeldaDuplicarEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoSolicitudNomi() {
		return isVisibilidadCeldaCopiarEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaCopiarEstadoSolicitudNomi(Boolean isVisibilidadCeldaCopiarEstadoSolicitudNomi) {
		this.isVisibilidadCeldaCopiarEstadoSolicitudNomi = isVisibilidadCeldaCopiarEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoSolicitudNomi() {
		return isVisibilidadCeldaVerFormEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaVerFormEstadoSolicitudNomi(Boolean isVisibilidadCeldaVerFormEstadoSolicitudNomi) {
		this.isVisibilidadCeldaVerFormEstadoSolicitudNomi = isVisibilidadCeldaVerFormEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoSolicitudNomi() {
		return isVisibilidadCeldaOrdenEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaOrdenEstadoSolicitudNomi(Boolean isVisibilidadCeldaOrdenEstadoSolicitudNomi) {
		this.isVisibilidadCeldaOrdenEstadoSolicitudNomi = isVisibilidadCeldaOrdenEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi() {
		return isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi(Boolean isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi = isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoSolicitudNomi() {
		return isVisibilidadCeldaModificarEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaModificarEstadoSolicitudNomi(Boolean isVisibilidadCeldaModificarEstadoSolicitudNomi) {
		this.isVisibilidadCeldaModificarEstadoSolicitudNomi = isVisibilidadCeldaModificarEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoSolicitudNomi() {
		return isVisibilidadCeldaActualizarEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaActualizarEstadoSolicitudNomi(Boolean isVisibilidadCeldaActualizarEstadoSolicitudNomi) {
		this.isVisibilidadCeldaActualizarEstadoSolicitudNomi = isVisibilidadCeldaActualizarEstadoSolicitudNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoSolicitudNomi() {
		return isVisibilidadCeldaEliminarEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaEliminarEstadoSolicitudNomi(Boolean isVisibilidadCeldaEliminarEstadoSolicitudNomi) {
		this.isVisibilidadCeldaEliminarEstadoSolicitudNomi = isVisibilidadCeldaEliminarEstadoSolicitudNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoSolicitudNomi() {
		return isVisibilidadCeldaCancelarEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaCancelarEstadoSolicitudNomi(Boolean isVisibilidadCeldaCancelarEstadoSolicitudNomi) {
		this.isVisibilidadCeldaCancelarEstadoSolicitudNomi = isVisibilidadCeldaCancelarEstadoSolicitudNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoSolicitudNomi() {
		return isVisibilidadCeldaGuardarEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaGuardarEstadoSolicitudNomi(Boolean isVisibilidadCeldaGuardarEstadoSolicitudNomi) {
		this.isVisibilidadCeldaGuardarEstadoSolicitudNomi = isVisibilidadCeldaGuardarEstadoSolicitudNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi() {
		return isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi(Boolean isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi) {
		this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi = isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi;
	}
		
	public EstadoSolicitudNomiSessionBean getestadosolicitudnomiSessionBean() {
		return this.estadosolicitudnomiSessionBean;
	}
	
	public void setestadosolicitudnomiSessionBean(EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean) {
		this.estadosolicitudnomiSessionBean=estadosolicitudnomiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoSolicitudNomi estadosolicitudnomi,EstadoSolicitudNomi estadosolicitudnomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoSolicitudNomi(estadosolicitudnomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadosolicitudnomiAux.setId(estadosolicitudnomi.getId());
		estadosolicitudnomiAux.setVersionRow(estadosolicitudnomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoSolicitudNomi();
		
			int intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadosolicitudnomiValidator.getInvalidValues(this.estadosolicitudnomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadosolicitudnomiLogic.setDatosCliente(datosCliente);
			estadosolicitudnomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadosolicitudnomiAux=new  EstadoSolicitudNomi();
				
				estadosolicitudnomiAux.setIsNew(true);
				estadosolicitudnomiAux.setIsChanged(true);
				
				estadosolicitudnomiAux.setEstadoSolicitudNomiOriginal(this.estadosolicitudnomi);
				
				estadosolicitudnomiAux.setId(this.estadosolicitudnomi.getId());	
				estadosolicitudnomiAux.setVersionRow(this.estadosolicitudnomi.getVersionRow());	
				estadosolicitudnomiAux.setcodigo(this.estadosolicitudnomi.getcodigo());	
				estadosolicitudnomiAux.setnombre(this.estadosolicitudnomi.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadosolicitudnomiAux,estadosolicitudnomiLogic.getEstadoSolicitudNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadosolicitudnomiAux,estadosolicitudnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosolicitudnomiLogic.saveEstadoSolicitudNomis();//WithConnection
						//estadosolicitudnomiLogic.getSetVersionRowEstadoSolicitudNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadosolicitudnomi,estadosolicitudnomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazosEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextrasEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazos.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazosEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextras.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextrasEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacions.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadosolicitudnomiLogic.saveEstadoSolicitudNomiRelaciones(estadosolicitudnomiAux,this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos(),this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());//WithConnection
								//estadosolicitudnomiLogic.getSetVersionRowEstadoSolicitudNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadosolicitudnomi,estadosolicitudnomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazos= new ArrayList<SolicitudReemplazo>();
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextras= new ArrayList<SolicitudHoraExtra>();
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacions= new ArrayList<SolicitudVacacion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudReemplazos(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos());

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudHoraExtras(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras());

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudVacacions(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadosolicitudnomiAux,estadosolicitudnomiLogic.getEstadoSolicitudNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadosolicitudnomiAux,estadosolicitudnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadosolicitudnomi,estadosolicitudnomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadosolicitudnomiAux=new  EstadoSolicitudNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado() 
					|| (this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado() && this.estadosolicitudnomi.getId()>=0)) {
						
					estadosolicitudnomiAux.setIsNew(false);
				}
				
				estadosolicitudnomiAux.setIsDeleted(false);
			
				estadosolicitudnomiAux.setId(this.estadosolicitudnomi.getId());	
				estadosolicitudnomiAux.setVersionRow(this.estadosolicitudnomi.getVersionRow());	
				estadosolicitudnomiAux.setcodigo(this.estadosolicitudnomi.getcodigo());	
				estadosolicitudnomiAux.setnombre(this.estadosolicitudnomi.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadosolicitudnomiAux,estadosolicitudnomiLogic.getEstadoSolicitudNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadosolicitudnomiAux,estadosolicitudnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosolicitudnomiLogic.saveEstadoSolicitudNomis();//WithConnection
						//estadosolicitudnomiLogic.getSetVersionRowEstadoSolicitudNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadosolicitudnomi,estadosolicitudnomiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazosEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextrasEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazos.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazosEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextras.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextrasEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacions.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadosolicitudnomiLogic.saveEstadoSolicitudNomiRelaciones(estadosolicitudnomiAux,this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos(),this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());//WithConnection
								//estadosolicitudnomiLogic.getSetVersionRowEstadoSolicitudNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadosolicitudnomi,estadosolicitudnomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazos= new ArrayList<SolicitudReemplazo>();
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextras= new ArrayList<SolicitudHoraExtra>();
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacions= new ArrayList<SolicitudVacacion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudReemplazos(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos());

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudHoraExtras(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras());

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudVacacions(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadosolicitudnomiAux,estadosolicitudnomiLogic.getEstadoSolicitudNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadosolicitudnomiAux,estadosolicitudnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadosolicitudnomi,estadosolicitudnomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadosolicitudnomiAux=new  EstadoSolicitudNomi();
				
				estadosolicitudnomiAux.setIsNew(false);
				estadosolicitudnomiAux.setIsChanged(false);
				
				estadosolicitudnomiAux.setIsDeleted(true);
				
				estadosolicitudnomiAux.setId(this.estadosolicitudnomi.getId());	
				estadosolicitudnomiAux.setVersionRow(this.estadosolicitudnomi.getVersionRow());	
				estadosolicitudnomiAux.setcodigo(this.estadosolicitudnomi.getcodigo());	
				estadosolicitudnomiAux.setnombre(this.estadosolicitudnomi.getnombre());	
				
				if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadosolicitudnomiAux.getId()>=0) {	
						this.estadosolicitudnomisEliminados.add(estadosolicitudnomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadosolicitudnomiAux,estadosolicitudnomiLogic.getEstadoSolicitudNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadosolicitudnomiAux,estadosolicitudnomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosolicitudnomiLogic.saveEstadoSolicitudNomis();//WithConnection
						//estadosolicitudnomiLogic.getSetVersionRowEstadoSolicitudNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazosEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextrasEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions().addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazos.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazosEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextras.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextrasEliminados);
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacions.addAll(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadosolicitudnomiLogic.saveEstadoSolicitudNomiRelaciones(estadosolicitudnomiAux,this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos(),this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras(),this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());//WithConnection
								//estadosolicitudnomiLogic.getSetVersionRowEstadoSolicitudNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.setSolicitudReemplazos(new ArrayList<SolicitudReemplazo>());
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.setSolicitudHoraExtras(new ArrayList<SolicitudHoraExtra>());
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.setSolicitudVacacions(new ArrayList<SolicitudVacacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazos= new ArrayList<SolicitudReemplazo>();
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextras= new ArrayList<SolicitudHoraExtra>();
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacions= new ArrayList<SolicitudVacacion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudReemplazos(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos());

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudHoraExtras(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras());

							if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.quitarFilaTotales();}
							estadosolicitudnomiAux.setSolicitudVacacions(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadosolicitudnomiAux,estadosolicitudnomiLogic.getEstadoSolicitudNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadosolicitudnomiAux,estadosolicitudnomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().addAll(this.estadosolicitudnomisEliminados);
					
					estadosolicitudnomiLogic.saveEstadoSolicitudNomis();//WithConnection
					//estadosolicitudnomiLogic.getSetVersionRowEstadoSolicitudNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadosolicitudnomisEliminados= new ArrayList<EstadoSolicitudNomi>();		
			}
			
			if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Solicitud GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadosolicitudnomi=estadosolicitudnomiAux;
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
      		//this.finishProcessEstadoSolicitudNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoSolicitudNomi estadosolicitudnomiLocal) throws Exception {
		
		if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadosolicitudnomiLocal.setSolicitudReemplazos(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos());
				estadosolicitudnomiLocal.setSolicitudHoraExtras(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras());
				estadosolicitudnomiLocal.setSolicitudVacacions(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());
			
			} else {
			
				estadosolicitudnomiLocal.setSolicitudReemplazos(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazos);
				estadosolicitudnomiLocal.setSolicitudHoraExtras(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextras);
				estadosolicitudnomiLocal.setSolicitudVacacions(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoSolicitudNomi estadosolicitudnomiLocal) throws Exception {	
		if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoSolicitudNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadosolicitudnomiValidator.getInvalidValues(this.estadosolicitudnomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoSolicitudNomi estadosolicitudnomi,List<EstadoSolicitudNomi> estadosolicitudnomis) throws Exception {
		try	{		
			EstadoSolicitudNomiConstantesFunciones.actualizarLista(estadosolicitudnomi,estadosolicitudnomis,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoSolicitudNomi estadosolicitudnomi,List<EstadoSolicitudNomi> estadosolicitudnomis) throws Exception {
		try	{			
			EstadoSolicitudNomiConstantesFunciones.actualizarSelectedLista(estadosolicitudnomi,estadosolicitudnomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoSolicitudNomi> estadosolicitudnomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadosolicitudnomisLocal=this.estadosolicitudnomiLogic.getEstadoSolicitudNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadosolicitudnomisLocal=this.estadosolicitudnomis;
			}
			//ARCHITECTURE
		
			for(EstadoSolicitudNomi estadosolicitudnomiLocal:estadosolicitudnomisLocal) {
				if(this.permiteMantenimiento(estadosolicitudnomiLocal) && estadosolicitudnomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoSolicitudNomiConstantesFunciones.getEstadoSolicitudNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoSolicitudNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoSolicitudNomi.jLabelcodigoEstadoSolicitudNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoSolicitudNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoSolicitudNomi.jLabelnombreEstadoSolicitudNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoSolicitudNomi.jLabelcodigoEstadoSolicitudNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoSolicitudNomi.jLabelnombreEstadoSolicitudNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("SolicitudReemplazo")) {
			if(this.estadosolicitudnomi==null) {
				this.estadosolicitudnomi= new EstadoSolicitudNomi();
			}

			if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoSolicitudNomi
				this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);

				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.getsolicitudreemplazo().setEstadoSolicitudNomi(this.estadosolicitudnomi);
			}

			return;
		}
		 else  if(sTipo.equals("SolicitudHoraExtra")) {
			if(this.estadosolicitudnomi==null) {
				this.estadosolicitudnomi= new EstadoSolicitudNomi();
			}

			if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoSolicitudNomi
				this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);

				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.getsolicitudhoraextra().setEstadoSolicitudNomi(this.estadosolicitudnomi);
			}

			return;
		}
		 else  if(sTipo.equals("SolicitudVacacion")) {
			if(this.estadosolicitudnomi==null) {
				this.estadosolicitudnomi= new EstadoSolicitudNomi();
			}

			if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoSolicitudNomi
				this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);

				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.getsolicitudvacacion().setEstadoSolicitudNomi(this.estadosolicitudnomi);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoSolicitudNomi--;	
		
		
		this.estadosolicitudnomiAux=new EstadoSolicitudNomi();
		
		this.estadosolicitudnomiAux.setId(this.iIdNuevoEstadoSolicitudNomi);
		this.estadosolicitudnomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().add(this.estadosolicitudnomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadosolicitudnomis.add(this.estadosolicitudnomiAux);
		}
		//ARCHITECTURE
		
		this.estadosolicitudnomi=this.estadosolicitudnomiAux;
		
		if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoSolicitudNomi(this.estadosolicitudnomi);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoSolicitudNomi(this.estadosolicitudnomi);
		}
				
		//this.setDefaultControlesEstadoSolicitudNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoSolicitudNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoSolicitudNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoSolicitudNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomiBean,this.estadosolicitudnomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
			classes=EstadoSolicitudNomiConstantesFunciones.getClassesRelationshipsOfEstadoSolicitudNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadosolicitudnomiReturnGeneral=estadosolicitudnomiLogic.procesarEventosEstadoSolicitudNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadosolicitudnomiLogic.getEstadoSolicitudNomis(),this.estadosolicitudnomi,this.estadosolicitudnomiParameterGeneral,this.isEsNuevoEstadoSolicitudNomi,classes);//this.estadosolicitudnomiLogic.getEstadoSolicitudNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral,this.estadosolicitudnomiBean,false);
		
		if(this.estadosolicitudnomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi());
		}
		
		if(this.estadosolicitudnomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi(),classes);//this.estadosolicitudnomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoSolicitudNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoSolicitudNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.RecargarFormEstadoSolicitudNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoSolicitudNomi(false);
						
			if(estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.getEsGuardarRelacionado() && SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSolicitudReemplazoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.getEsGuardarRelacionado() && SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSolicitudHoraExtraActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.getEsGuardarRelacionado() && SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSolicitudVacacionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoSolicitudNomi();
			}
			
			this.actualizarVisualTableDatosEstadoSolicitudNomi();
			
			this.jTableDatosEstadoSolicitudNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoSolicitudNomi(), this.getIndiceNuevoEstadoSolicitudNomi());
			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
						
			this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoSolicitudNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.setEnabled(isHabilitar && this.estadosolicitudnomiConstantesFunciones.activarcodigoEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.setEnabled(isHabilitar && this.estadosolicitudnomiConstantesFunciones.activarnombreEstadoSolicitudNomi);	
		
	};
	
	public void setDefaultControlesEstadoSolicitudNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoSolicitudNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadosolicitudnomiSessionBean.setConGuardarRelaciones(true);			
			this.estadosolicitudnomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadosolicitudnomiSessionBean.setConGuardarRelaciones(false);			
			this.estadosolicitudnomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoSolicitudNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
				if(estadosolicitudnomiAux.getId().equals(this.iIdNuevoEstadoSolicitudNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomis) {
				if(estadosolicitudnomiAux.getId().equals(this.iIdNuevoEstadoSolicitudNomi)) {
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
	
	public int getIndiceActualEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
				if(estadosolicitudnomiAux.getId().equals(estadosolicitudnomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomis) {
				if(estadosolicitudnomiAux.getId().equals(estadosolicitudnomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
				if(estadosolicitudnomiAux.getEstadoSolicitudNomiOriginal().getId().equals(estadosolicitudnomiOriginal.getId())) {
					existe=true;
					estadosolicitudnomiOriginal.setId(estadosolicitudnomiAux.getId());
					estadosolicitudnomiOriginal.setVersionRow(estadosolicitudnomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomis) {
				if(estadosolicitudnomiAux.getEstadoSolicitudNomiOriginal().getId().equals(estadosolicitudnomiOriginal.getId())) {
					existe=true;
					estadosolicitudnomiOriginal.setId(estadosolicitudnomiAux.getId());
					estadosolicitudnomiOriginal.setVersionRow(estadosolicitudnomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoSolicitudNomi(Boolean esParaCancelar) throws Exception {
		estadosolicitudnomisAux=new ArrayList<EstadoSolicitudNomi>();
		estadosolicitudnomiAux=new EstadoSolicitudNomi();
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
					if(estadosolicitudnomiAux.getId()<0) {
						estadosolicitudnomisAux.add(estadosolicitudnomiAux);
					}		
				}
				this.iIdNuevoEstadoSolicitudNomi=0L;
				this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().removeAll(estadosolicitudnomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomis) {
					if(estadosolicitudnomiAux.getId()<0) {
						estadosolicitudnomisAux.add(estadosolicitudnomiAux);
					}		
				}
				this.iIdNuevoEstadoSolicitudNomi=0L;
				this.estadosolicitudnomis.removeAll(estadosolicitudnomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoSolicitudNomi 
					&& this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().size()>0
					) {
					estadosolicitudnomiAux=this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().get(this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().size() - 1);
				
					if(estadosolicitudnomiAux.getId()<0) {
						this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().remove(estadosolicitudnomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoSolicitudNomi && this.estadosolicitudnomis.size()>0) {
					estadosolicitudnomiAux=this.estadosolicitudnomis.get(this.estadosolicitudnomis.size() - 1);
				
					if(estadosolicitudnomiAux.getId()<0) {
						this.estadosolicitudnomis.remove(estadosolicitudnomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoSolicitudNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadosolicitudnomi.getId()<0) {
				this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().remove(this.estadosolicitudnomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadosolicitudnomi.getId()<0) {
				this.estadosolicitudnomis.remove(this.estadosolicitudnomi);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoSolicitudNomi(List<EstadoSolicitudNomi> estadosolicitudnomisAux) throws Exception {
		EstadoSolicitudNomiConstantesFunciones.setEstadosInicialesEstadoSolicitudNomi(estadosolicitudnomisAux);
	}
	
	public void setEstadosInicialesEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomiAux) throws Exception {
		EstadoSolicitudNomiConstantesFunciones.setEstadosInicialesEstadoSolicitudNomi(estadosolicitudnomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoSolicitudNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoSolicitudNomiActual()) {
				if(!this.isEsNuevoEstadoSolicitudNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoSolicitudNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoSolicitudNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Solicitud ?", "MANTENIMIENTO DE Estado Solicitud", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoSolicitudNomi estadosolicitudnomi) throws Exception {
		EstadoSolicitudNomiConstantesFunciones.seleccionarAsignar(this.estadosolicitudnomi,estadosolicitudnomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoSolicitudNomi=this.isPermisoActualizarOriginalEstadoSolicitudNomi;
			
			
			this.seleccionarAsignar(estadosolicitudnomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoSolicitudNomiConstantesFunciones.quitarEspaciosEstadoSolicitudNomi(this.estadosolicitudnomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadosolicitudnomiSessionBean.setsFuncionBusquedaRapida(this.estadosolicitudnomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoSolicitudNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoSolicitudNomi(esParaCancelar);				
				this.cancelarNuevoEstadoSolicitudNomi(esParaCancelar);								
			}
			
			this.estadosolicitudnomi=new EstadoSolicitudNomi();
			
			this.inicializarEstadoSolicitudNomi();
			
			this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoSolicitudNomi() throws Exception {
		try {
			EstadoSolicitudNomiConstantesFunciones.inicializarEstadoSolicitudNomi(this.estadosolicitudnomi);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoSolicitudNomis(String sAccionBusqueda,List<EstadoSolicitudNomi> estadosolicitudnomisParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoSolicitudNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoSolicitudNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoSolicitudNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoSolicitudNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Solicituds");		
		parameters.put("busquedapor", EstadoSolicitudNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(SolicitudReemplazo.class));
			classes.add(new Classe(SolicitudHoraExtra.class));
			classes.add(new Classe(SolicitudVacacion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoSolicitudNomiLogic estadosolicitudnomiLogicAuxiliar=new EstadoSolicitudNomiLogic();
					estadosolicitudnomiLogicAuxiliar.setDatosCliente(estadosolicitudnomiLogic.getDatosCliente());				
					estadosolicitudnomiLogicAuxiliar.setEstadoSolicitudNomis(estadosolicitudnomisParaReportes);
					
					estadosolicitudnomiLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoSolicitudNomiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadosolicitudnomisParaReportes=estadosolicitudnomiLogicAuxiliar.getEstadoSolicitudNomis();
					
					//estadosolicitudnomiLogic.getNewConnexionToDeep();
					
					//for (EstadoSolicitudNomi estadosolicitudnomi:estadosolicitudnomisParaReportes) {
					//	estadosolicitudnomiLogic.deepLoad(estadosolicitudnomi, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadosolicitudnomiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadosolicitudnomiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileSolicitudReemplazo = AuxiliarReportes.class.getResourceAsStream("SolicitudReemplazoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_solicitudreemplazo", reportFileSolicitudReemplazo);

			InputStream reportFileSolicitudHoraExtra = AuxiliarReportes.class.getResourceAsStream("SolicitudHoraExtraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_solicitudhoraextra", reportFileSolicitudHoraExtra);

			InputStream reportFileSolicitudVacacion = AuxiliarReportes.class.getResourceAsStream("SolicitudVacacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_solicitudvacacion", reportFileSolicitudVacacion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoSolicitudNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoSolicitudNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoSolicitudNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoSolicitudNomi=new JRBeanArrayDataSource(EstadoSolicitudNomiJInternalFrame.TraerEstadoSolicitudNomiBeans(estadosolicitudnomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoSolicitudNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoSolicitudNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoSolicitudNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoSolicitudNomiBean.TraerEstadoSolicitudNomiBeans(estadosolicitudnomisParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoSolicitudNomis(sAccionBusqueda,sTipoArchivoReporte,estadosolicitudnomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoSolicitudNomis(sAccionBusqueda,sTipoArchivoReporte,estadosolicitudnomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomiActionPerformed(null);
					//this.generarExcelReporteEstadoSolicitudNomis(sAccionBusqueda,sTipoArchivoReporte,estadosolicitudnomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoSolicitudNomis(sAccionBusqueda,sTipoArchivoReporte,estadosolicitudnomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoSolicitudNomis(sAccionBusqueda,sTipoArchivoReporte,estadosolicitudnomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoSolicitudNomis(sAccionBusqueda,sTipoArchivoReporte,estadosolicitudnomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoSolicitudNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoSolicitudNomi> estadosolicitudnomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosolicitudnomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoSolicitudNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoSolicitudNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoSolicitudNomi estadosolicitudnomi : estadosolicitudnomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoSolicitudNomiConstantesFunciones.generarExcelReporteDataEstadoSolicitudNomi("NORMAL",row,workbook,estadosolicitudnomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoSolicitudNomi(String sTipo,Row row,Workbook workbook) {
		
		EstadoSolicitudNomiConstantesFunciones.generarExcelReporteHeaderEstadoSolicitudNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoSolicitudNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoSolicitudNomi> estadosolicitudnomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosolicitudnomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoSolicitudNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoSolicitudNomi estadosolicitudnomi : estadosolicitudnomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosolicitudnomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadosolicitudnomi.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoSolicitudNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoSolicitudNomi> estadosolicitudnomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoSolicitudNomi> estadosolicitudnomisRespaldo=null;
		
		classes=EstadoSolicitudNomiConstantesFunciones.getClassesRelationshipsOfEstadoSolicitudNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadosolicitudnomiLogic.setDatosCliente(this.datosCliente);
		this.estadosolicitudnomiLogic.setDatosDeep(this.datosDeep);
		this.estadosolicitudnomiLogic.setIsConDeep(true);
		
		estadosolicitudnomisRespaldo=this.estadosolicitudnomiLogic.getEstadoSolicitudNomis();
		
		this.estadosolicitudnomiLogic.setEstadoSolicitudNomis(estadosolicitudnomisParaReportes);	
		this.estadosolicitudnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadosolicitudnomisParaReportes=this.estadosolicitudnomiLogic.getEstadoSolicitudNomis();
		this.estadosolicitudnomiLogic.setEstadoSolicitudNomis(estadosolicitudnomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosolicitudnomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoSolicitudNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoSolicitudNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoSolicitudNomi estadosolicitudnomi : estadosolicitudnomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoSolicitudNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoSolicitudNomiConstantesFunciones.generarExcelReporteDataEstadoSolicitudNomi("NORMAL",row,workbook,estadosolicitudnomi,cellStyleDataAux);
		
			
			


				//SolicitudReemplazo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadosolicitudnomi.getSolicitudReemplazos()!=null && estadosolicitudnomi.getSolicitudReemplazos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SolicitudReemplazoConstantesFunciones.generarExcelReporteHeaderSolicitudReemplazo("RELACIONADO",row,workbook);
				}

				if(estadosolicitudnomi.getSolicitudReemplazos()!=null) {
					i2=0;
					for(SolicitudReemplazo solicitudreemplazo : estadosolicitudnomi.getSolicitudReemplazos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SolicitudReemplazoConstantesFunciones.generarExcelReporteDataSolicitudReemplazo("RELACIONADO",row,workbook,solicitudreemplazo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SolicitudHoraExtra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadosolicitudnomi.getSolicitudHoraExtras()!=null && estadosolicitudnomi.getSolicitudHoraExtras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SolicitudHoraExtraConstantesFunciones.generarExcelReporteHeaderSolicitudHoraExtra("RELACIONADO",row,workbook);
				}

				if(estadosolicitudnomi.getSolicitudHoraExtras()!=null) {
					i2=0;
					for(SolicitudHoraExtra solicitudhoraextra : estadosolicitudnomi.getSolicitudHoraExtras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SolicitudHoraExtraConstantesFunciones.generarExcelReporteDataSolicitudHoraExtra("RELACIONADO",row,workbook,solicitudhoraextra,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//SolicitudVacacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadosolicitudnomi.getSolicitudVacacions()!=null && estadosolicitudnomi.getSolicitudVacacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SolicitudVacacionConstantesFunciones.generarExcelReporteHeaderSolicitudVacacion("RELACIONADO",row,workbook);
				}

				if(estadosolicitudnomi.getSolicitudVacacions()!=null) {
					i2=0;
					for(SolicitudVacacion solicitudvacacion : estadosolicitudnomi.getSolicitudVacacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SolicitudVacacionConstantesFunciones.generarExcelReporteDataSolicitudVacacion("RELACIONADO",row,workbook,solicitudvacacion,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.getEstadoSolicitudNomiDescripcion(estadosolicitudnomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoSolicitudNomi() throws Exception {		
		this.startProcessEstadoSolicitudNomi(true);
	}
	
	public void startProcessEstadoSolicitudNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoSolicitudNomi, this.jScrollPanelDatosEstadoSolicitudNomi,this.jPanelPaginacionEstadoSolicitudNomi, this.jScrollPanelDatosEdicionEstadoSolicitudNomi, this.jPanelAccionesEstadoSolicitudNomi,this.jPanelAccionesFormularioEstadoSolicitudNomi,this.jmenuBarEstadoSolicitudNomi,this.jmenuBarDetalleEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,this.jTtoolBarDetalleEstadoSolicitudNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoSolicitudNomi=null; 
		
		final JPanel jPanelParametrosReportesEstadoSolicitudNomi=this.jPanelParametrosReportesEstadoSolicitudNomi;
		//final JScrollPane jScrollPanelDatosEstadoSolicitudNomi=this.jScrollPanelDatosEstadoSolicitudNomi;
		final JTable jTableDatosEstadoSolicitudNomi=this.jTableDatosEstadoSolicitudNomi;		
		final JPanel jPanelPaginacionEstadoSolicitudNomi=this.jPanelPaginacionEstadoSolicitudNomi;
		//final JScrollPane jScrollPanelDatosEdicionEstadoSolicitudNomi=this.jScrollPanelDatosEdicionEstadoSolicitudNomi;
		final JPanel jPanelAccionesEstadoSolicitudNomi=this.jPanelAccionesEstadoSolicitudNomi;
		
		JPanel jPanelCamposAuxiliarEstadoSolicitudNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoSolicitudNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			jPanelCamposAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jPanelCamposEstadoSolicitudNomi;
			jPanelAccionesFormularioAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jPanelAccionesFormularioEstadoSolicitudNomi;
		}
		
		final JPanel jPanelCamposEstadoSolicitudNomi=jPanelCamposAuxiliarEstadoSolicitudNomi;
		final JPanel jPanelAccionesFormularioEstadoSolicitudNomi=jPanelAccionesFormularioAuxiliarEstadoSolicitudNomi;
		
		
		final JMenuBar jmenuBarEstadoSolicitudNomi=this.jmenuBarEstadoSolicitudNomi;
		final JToolBar jTtoolBarEstadoSolicitudNomi=this.jTtoolBarEstadoSolicitudNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoSolicitudNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoSolicitudNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			jmenuBarDetalleAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jmenuBarDetalleEstadoSolicitudNomi;
			jTtoolBarDetalleAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTtoolBarDetalleEstadoSolicitudNomi;
		}
		
		final JMenuBar jmenuBarDetalleEstadoSolicitudNomi=jmenuBarDetalleAuxiliarEstadoSolicitudNomi;
		final JToolBar jTtoolBarDetalleEstadoSolicitudNomi=jTtoolBarDetalleAuxiliarEstadoSolicitudNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoSolicitudNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoSolicitudNomi;
			processRunnable.jTableDatos=jTableDatosEstadoSolicitudNomi;
			processRunnable.jPanelCampos=jPanelCamposEstadoSolicitudNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoSolicitudNomi;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoSolicitudNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoSolicitudNomi;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoSolicitudNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoSolicitudNomi;
			processRunnable.jTtoolBar=jTtoolBarEstadoSolicitudNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoSolicitudNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoSolicitudNomi ,jPanelParametrosReportesEstadoSolicitudNomi,jTableDatosEstadoSolicitudNomi, /*jScrollPanelDatosEstadoSolicitudNomi,*/jPanelCamposEstadoSolicitudNomi,jPanelPaginacionEstadoSolicitudNomi, /*jScrollPanelDatosEdicionEstadoSolicitudNomi,*/ jPanelAccionesEstadoSolicitudNomi,jPanelAccionesFormularioEstadoSolicitudNomi,jmenuBarEstadoSolicitudNomi,jmenuBarDetalleEstadoSolicitudNomi,jTtoolBarEstadoSolicitudNomi,jTtoolBarDetalleEstadoSolicitudNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoSolicitudNomi, jScrollPanelDatosEstadoSolicitudNomi,jPanelPaginacionEstadoSolicitudNomi, jScrollPanelDatosEdicionEstadoSolicitudNomi, jPanelAccionesEstadoSolicitudNomi,jPanelAccionesFormularioEstadoSolicitudNomi,jmenuBarEstadoSolicitudNomi,jmenuBarDetalleEstadoSolicitudNomi,jTtoolBarEstadoSolicitudNomi,jTtoolBarDetalleEstadoSolicitudNomi);
						
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
	
	public void finishProcessEstadoSolicitudNomi() {// throws Exception 
		this.finishProcessEstadoSolicitudNomi(true);
	}
	
	public void finishProcessEstadoSolicitudNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoSolicitudNomi, this.jScrollPanelDatosEstadoSolicitudNomi,this.jPanelPaginacionEstadoSolicitudNomi, this.jScrollPanelDatosEdicionEstadoSolicitudNomi, this.jPanelAccionesEstadoSolicitudNomi,this.jPanelAccionesFormularioEstadoSolicitudNomi,this.jmenuBarEstadoSolicitudNomi,this.jmenuBarDetalleEstadoSolicitudNomi,this.jTtoolBarEstadoSolicitudNomi,this.jTtoolBarDetalleEstadoSolicitudNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoSolicitudNomi=null; 
		
		final JPanel jPanelParametrosReportesEstadoSolicitudNomi=this.jPanelParametrosReportesEstadoSolicitudNomi;
		//final JScrollPane jScrollPanelDatosEstadoSolicitudNomi=this.jScrollPanelDatosEstadoSolicitudNomi;
		final JTable jTableDatosEstadoSolicitudNomi=this.jTableDatosEstadoSolicitudNomi;		
		final JPanel jPanelPaginacionEstadoSolicitudNomi=this.jPanelPaginacionEstadoSolicitudNomi;
		//final JScrollPane jScrollPanelDatosEdicionEstadoSolicitudNomi=this.jScrollPanelDatosEdicionEstadoSolicitudNomi;
		final JPanel jPanelAccionesEstadoSolicitudNomi=this.jPanelAccionesEstadoSolicitudNomi;
		
		JPanel jPanelCamposAuxiliarEstadoSolicitudNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoSolicitudNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			jPanelCamposAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jPanelCamposEstadoSolicitudNomi;
			jPanelAccionesFormularioAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jPanelAccionesFormularioEstadoSolicitudNomi;
		}
		
		final JPanel jPanelCamposEstadoSolicitudNomi=jPanelCamposAuxiliarEstadoSolicitudNomi;
		final JPanel jPanelAccionesFormularioEstadoSolicitudNomi=jPanelAccionesFormularioAuxiliarEstadoSolicitudNomi;
		
		
		final JMenuBar jmenuBarEstadoSolicitudNomi=this.jmenuBarEstadoSolicitudNomi;		
		final JToolBar jTtoolBarEstadoSolicitudNomi=this.jTtoolBarEstadoSolicitudNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoSolicitudNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoSolicitudNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			jmenuBarDetalleAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jmenuBarDetalleEstadoSolicitudNomi;
			jTtoolBarDetalleAuxiliarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTtoolBarDetalleEstadoSolicitudNomi;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoSolicitudNomi=jmenuBarDetalleAuxiliarEstadoSolicitudNomi;
		final JToolBar jTtoolBarDetalleEstadoSolicitudNomi=jTtoolBarDetalleAuxiliarEstadoSolicitudNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoSolicitudNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoSolicitudNomi;
			processRunnable.jTableDatos=jTableDatosEstadoSolicitudNomi;
			processRunnable.jPanelCampos=jPanelCamposEstadoSolicitudNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoSolicitudNomi;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoSolicitudNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoSolicitudNomi;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoSolicitudNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoSolicitudNomi;
			processRunnable.jTtoolBar=jTtoolBarEstadoSolicitudNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoSolicitudNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoSolicitudNomi ,jPanelParametrosReportesEstadoSolicitudNomi, jTableDatosEstadoSolicitudNomi,/*jScrollPanelDatosEstadoSolicitudNomi,*/jPanelCamposEstadoSolicitudNomi,jPanelPaginacionEstadoSolicitudNomi, /*jScrollPanelDatosEdicionEstadoSolicitudNomi,*/ jPanelAccionesEstadoSolicitudNomi,jPanelAccionesFormularioEstadoSolicitudNomi,jmenuBarEstadoSolicitudNomi,jmenuBarDetalleEstadoSolicitudNomi,jTtoolBarEstadoSolicitudNomi,jTtoolBarDetalleEstadoSolicitudNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoSolicitudNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoSolicitudNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoSolicitudNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoSolicitudNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoSolicitudNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoSolicitudNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoSolicitudNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoSolicitudNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoSolicitudNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadosolicitudnomiConstantesFunciones.getsFinalQueryEstadoSolicitudNomi();
		String  finalQueryPaginacionTodos=this.estadosolicitudnomiConstantesFunciones.getsFinalQueryEstadoSolicitudNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoSolicitudNomiConstantesFunciones.getArrayColumnasGlobalesNoEstadoSolicitudNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoSolicitudNomiConstantesFunciones.getArrayColumnasGlobalesEstadoSolicitudNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoSolicitudNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadosolicitudnomisEliminados= new ArrayList<EstadoSolicitudNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoSolicitudNomi();
		
				///*EstadoSolicitudNomiSessionBean*/this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
			
			if(this.estadosolicitudnomiSessionBean==null) {
				this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
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
					this.iNumeroPaginacion=EstadoSolicitudNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoSolicitudNomiConstantesFunciones.getClassesForeignKeysOfEstadoSolicitudNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadosolicitudnomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadosolicitudnomisAux= new ArrayList<EstadoSolicitudNomi>();
			
				
			estadosolicitudnomiLogic.setDatosCliente(this.datosCliente);
			estadosolicitudnomiLogic.setDatosDeep(this.datosDeep);
			estadosolicitudnomiLogic.setIsConDeep(true);
			
			
			estadosolicitudnomiLogic.getEstadoSolicitudNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadosolicitudnomiLogic.getTodosEstadoSolicitudNomis(finalQueryGlobal,pagination);
					
					//estadosolicitudnomiLogic.getTodosEstadoSolicitudNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadosolicitudnomiLogic.getEstadoSolicitudNomis()==null|| estadosolicitudnomiLogic.getEstadoSolicitudNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadosolicitudnomisAux= new ArrayList<EstadoSolicitudNomi>();
							estadosolicitudnomisAux.addAll(estadosolicitudnomiLogic.getEstadoSolicitudNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosolicitudnomisAux= new ArrayList<EstadoSolicitudNomi>();
							estadosolicitudnomisAux.addAll(estadosolicitudnomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadosolicitudnomiLogic.getTodosEstadoSolicitudNomis(finalQueryGlobal+"",this.pagination);												
							
							//estadosolicitudnomiLogic.getTodosEstadoSolicitudNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomiLogic.getEstadoSolicitudNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadosolicitudnomiLogic.setEstadoSolicitudNomis(new ArrayList<EstadoSolicitudNomi>());					
							estadosolicitudnomiLogic.getEstadoSolicitudNomis().addAll(estadosolicitudnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosolicitudnomis=new ArrayList<EstadoSolicitudNomi>();
							estadosolicitudnomis.addAll(estadosolicitudnomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoSolicitudNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoSolicitudNomi=this.idActual;
				
				} else if(this.idEstadoSolicitudNomiActual!=null && this.idEstadoSolicitudNomiActual!=0L) {
					idEstadoSolicitudNomi=idEstadoSolicitudNomiActual;
				}
				
					
				this.sDetalleReporte=EstadoSolicitudNomiConstantesFunciones.getDetalleIndicePorId(idEstadoSolicitudNomi);
				
				this.estadosolicitudnomis=new ArrayList<EstadoSolicitudNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadosolicitudnomiLogic.getEntity(idEstadoSolicitudNomi);
					
					//estadosolicitudnomiLogic.getEntityWithConnection(idEstadoSolicitudNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadosolicitudnomiLogic.setEstadoSolicitudNomis(new ArrayList<EstadoSolicitudNomi>());
					estadosolicitudnomiLogic.getEstadoSolicitudNomis().add(estadosolicitudnomiLogic.getEstadoSolicitudNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosolicitudnomis=new ArrayList<EstadoSolicitudNomi>();
					this.estadosolicitudnomis.add(estadosolicitudnomi);
				}
				
				if(estadosolicitudnomiLogic.getEstadoSolicitudNomi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoSolicitudNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoSolicitudNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadosolicitudnomiLogic.getEstadoSolicitudNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosolicitudnomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadosolicitudnomiLogic.getEstadoSolicitudNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadosolicitudnomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoSolicitudNomi estadosolicitudnomi) {
		Boolean permite=true;
		
		if(this.estadosolicitudnomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoSolicitudNomiConstantesFunciones.getOrderByListaEstadoSolicitudNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoSolicitudNomiConstantesFunciones.getOrderByListaEstadoSolicitudNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoSolicitudNomi estadosolicitudnomi:estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
				if(estadosolicitudnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadosolicitudnomiTotales=estadosolicitudnomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomis) {
				if(estadosolicitudnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadosolicitudnomiTotales=estadosolicitudnomi;
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
			this.estadosolicitudnomiAux=new EstadoSolicitudNomi();
			this.estadosolicitudnomiAux.setsType(Constantes2.S_TOTALES);
			this.estadosolicitudnomiAux.setIsNew(false);
			this.estadosolicitudnomiAux.setIsChanged(false);
			this.estadosolicitudnomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoSolicitudNomiConstantesFunciones.TotalizarValoresFilaEstadoSolicitudNomi(this.estadosolicitudnomiLogic.getEstadoSolicitudNomis(),this.estadosolicitudnomiAux);
				
				this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().add(this.estadosolicitudnomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoSolicitudNomiConstantesFunciones.TotalizarValoresFilaEstadoSolicitudNomi(this.estadosolicitudnomis,this.estadosolicitudnomiAux);
				
				this.estadosolicitudnomis.add(this.estadosolicitudnomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadosolicitudnomiTotales=new EstadoSolicitudNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().remove(estadosolicitudnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadosolicitudnomis.remove(estadosolicitudnomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadosolicitudnomiTotales=new EstadoSolicitudNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoSolicitudNomi estadosolicitudnomi:estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
				if(estadosolicitudnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadosolicitudnomiTotales=estadosolicitudnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoSolicitudNomiConstantesFunciones.TotalizarValoresFilaEstadoSolicitudNomi(this.estadosolicitudnomiLogic.getEstadoSolicitudNomis(),estadosolicitudnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoSolicitudNomi estadosolicitudnomi:this.estadosolicitudnomis) {
				if(estadosolicitudnomi.getsType().equals(Constantes2.S_TOTALES)) {
					estadosolicitudnomiTotales=estadosolicitudnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoSolicitudNomiConstantesFunciones.TotalizarValoresFilaEstadoSolicitudNomi(this.estadosolicitudnomis,estadosolicitudnomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoSolicitudNomi() {
		this.isPermisoTodoEstadoSolicitudNomi=false;
		this.isPermisoNuevoEstadoSolicitudNomi=false;
		this.isPermisoActualizarEstadoSolicitudNomi=false;
		this.isPermisoActualizarOriginalEstadoSolicitudNomi=false;
		this.isPermisoEliminarEstadoSolicitudNomi=false;
		this.isPermisoGuardarCambiosEstadoSolicitudNomi=false;
		this.isPermisoConsultaEstadoSolicitudNomi=false;
		this.isPermisoBusquedaEstadoSolicitudNomi=false;
		this.isPermisoReporteEstadoSolicitudNomi=false;		
		this.isPermisoOrdenEstadoSolicitudNomi=false;		
		this.isPermisoPaginacionMedioEstadoSolicitudNomi=false;		
		this.isPermisoPaginacionAltoEstadoSolicitudNomi=false;
		this.isPermisoPaginacionTodoEstadoSolicitudNomi=false;
		this.isPermisoCopiarEstadoSolicitudNomi=false;		
		this.isPermisoVerFormEstadoSolicitudNomi=false;		
		this.isPermisoDuplicarEstadoSolicitudNomi=false;		
		this.isPermisoOrdenEstadoSolicitudNomi=false;		
	}
	
	public void setPermisosUsuarioEstadoSolicitudNomi(Boolean isPermiso) {
		this.isPermisoTodoEstadoSolicitudNomi=isPermiso;
		this.isPermisoNuevoEstadoSolicitudNomi=isPermiso;
		this.isPermisoActualizarEstadoSolicitudNomi=isPermiso;
		this.isPermisoActualizarOriginalEstadoSolicitudNomi=isPermiso;
		this.isPermisoEliminarEstadoSolicitudNomi=isPermiso;
		this.isPermisoGuardarCambiosEstadoSolicitudNomi=isPermiso;
		this.isPermisoConsultaEstadoSolicitudNomi=isPermiso;
		this.isPermisoBusquedaEstadoSolicitudNomi=isPermiso;
		this.isPermisoReporteEstadoSolicitudNomi=isPermiso;
		this.isPermisoOrdenEstadoSolicitudNomi=isPermiso;		
		this.isPermisoPaginacionMedioEstadoSolicitudNomi=isPermiso;		
		this.isPermisoPaginacionAltoEstadoSolicitudNomi=isPermiso;		
		this.isPermisoPaginacionTodoEstadoSolicitudNomi=isPermiso;		
		this.isPermisoCopiarEstadoSolicitudNomi=isPermiso;		
		this.isPermisoVerFormEstadoSolicitudNomi=isPermiso;		
		this.isPermisoDuplicarEstadoSolicitudNomi=isPermiso;
		this.isPermisoOrdenEstadoSolicitudNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoSolicitudNomi(Boolean isPermiso) {
		//this.isPermisoTodoEstadoSolicitudNomi=isPermiso;
		this.isPermisoNuevoEstadoSolicitudNomi=isPermiso;
		this.isPermisoActualizarEstadoSolicitudNomi=isPermiso;
		this.isPermisoActualizarOriginalEstadoSolicitudNomi=isPermiso;
		this.isPermisoEliminarEstadoSolicitudNomi=isPermiso;
		this.isPermisoGuardarCambiosEstadoSolicitudNomi=isPermiso;
		//this.isPermisoConsultaEstadoSolicitudNomi=isPermiso;
		//this.isPermisoBusquedaEstadoSolicitudNomi=isPermiso;
		//this.isPermisoReporteEstadoSolicitudNomi=isPermiso;
		//this.isPermisoOrdenEstadoSolicitudNomi=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoSolicitudNomi=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoSolicitudNomi=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoSolicitudNomi=isPermiso;		
		//this.isPermisoCopiarEstadoSolicitudNomi=isPermiso;		
		//this.isPermisoDuplicarEstadoSolicitudNomi=isPermiso;
		//this.isPermisoOrdenEstadoSolicitudNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoSolicitudNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(SolicitudReemplazoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SolicitudHoraExtraConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SolicitudVacacionConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoSolicitudNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosSolicitudReemplazo=false;
		this.isTienePermisosSolicitudReemplazo=this.verificarGetPermisosUsuarioOpcionEstadoSolicitudNomiClaseRelacionada(this.opcionsRelacionadas,SolicitudReemplazoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSolicitudHoraExtra=false;
		this.isTienePermisosSolicitudHoraExtra=this.verificarGetPermisosUsuarioOpcionEstadoSolicitudNomiClaseRelacionada(this.opcionsRelacionadas,SolicitudHoraExtraConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSolicitudVacacion=false;
		this.isTienePermisosSolicitudVacacion=this.verificarGetPermisosUsuarioOpcionEstadoSolicitudNomiClaseRelacionada(this.opcionsRelacionadas,SolicitudVacacionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoSolicitudNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoSolicitudNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosSolicitudReemplazo=conPermiso;
		this.isTienePermisosSolicitudHoraExtra=conPermiso;
		this.isTienePermisosSolicitudVacacion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoSolicitudNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoSolicitudNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoSolicitudNomiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosSolicitudReemplazo && this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.remove(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSolicitudHoraExtra && this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.remove(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSolicitudVacacion && this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.remove(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoSolicitudNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoSolicitudNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoSolicitudNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoSolicitudNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoSolicitudNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoSolicitudNomi=this.isPermisoActualizarEstadoSolicitudNomi;
			this.isPermisoEliminarEstadoSolicitudNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoSolicitudNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoSolicitudNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoSolicitudNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoSolicitudNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoSolicitudNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoSolicitudNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoSolicitudNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoSolicitudNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoSolicitudNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoSolicitudNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoSolicitudNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoSolicitudNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoSolicitudNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoSolicitudNomi.setToolTipText(this.jTableDatosEstadoSolicitudNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoSolicitudNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoSolicitudNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoSolicitudNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoSolicitudNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoSolicitudNomi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosSolicitudReemplazo && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudReemplazoEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Solicitud Reemplazo");
			reporte.setsDescripcion("Solicitud Reemplazo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSolicitudHoraExtra && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudHoraExtraEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Solicitud Hora Extra");
			reporte.setsDescripcion("Solicitud Hora Extra");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSolicitudVacacion && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudVacacionEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Solicitud Vacacion");
			reporte.setsDescripcion("Solicitud Vacacion");
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
	
		
	public void inicializarCombosForeignKeyEstadoSolicitudNomiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoSolicitudNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoSolicitudNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoSolicitudNomiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoSolicitudNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoSolicitudNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoSolicitudNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoSolicitudNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoSolicitudNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoSolicitudNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoSolicitudNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoSolicitudNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoSolicitudNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoSolicitudNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoSolicitudNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoSolicitudNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoSolicitudNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoSolicitudNomi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoSolicitudNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoSolicitudNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoSolicitudNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean(); 
		this.estadosolicitudnomiConstantesFunciones=new EstadoSolicitudNomiConstantesFunciones(); 
		this.estadosolicitudnomiBean=new EstadoSolicitudNomi();//(this.estadosolicitudnomiConstantesFunciones); 		
		this.estadosolicitudnomiReturnGeneral=new EstadoSolicitudNomiParameterReturnGeneral(); 
		
		this.estadosolicitudnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadosolicitudnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoSolicitudNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoSolicitudNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoSolicitudNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoSolicitudNomi(true);
			
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
			
			this.estadosolicitudnomiConstantesFunciones=new EstadoSolicitudNomiConstantesFunciones(); 
			this.estadosolicitudnomiBean=new EstadoSolicitudNomi();//this.estadosolicitudnomiConstantesFunciones); 			
			this.estadosolicitudnomiReturnGeneral=new EstadoSolicitudNomiParameterReturnGeneral(); 
		
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Solicitud Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadosolicitudnomi=new EstadoSolicitudNomi();
			this.estadosolicitudnomis = new ArrayList<EstadoSolicitudNomi>();
			this.estadosolicitudnomisAux = new ArrayList<EstadoSolicitudNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic=new EstadoSolicitudNomiLogic();
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estadosolicitudnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadosolicitudnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoSolicitudNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoSolicitudNomi);	
					}
					
					if(this.jInternalFrameImportacionEstadoSolicitudNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoSolicitudNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoSolicitudNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoSolicitudNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoSolicitudNomi);
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.setVisible(false);
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi);
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoSolicitudNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoSolicitudNomi);
					this.jInternalFrameImportacionEstadoSolicitudNomi.setVisible(false);
					this.jInternalFrameImportacionEstadoSolicitudNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoSolicitudNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoSolicitudNomi);
					this.jInternalFrameOrderByEstadoSolicitudNomi.setVisible(false);
					this.jInternalFrameOrderByEstadoSolicitudNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoSolicitudNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoSolicitudNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadosolicitudnomiReturnGeneral=new EstadoSolicitudNomiParameterReturnGeneral();
			
			this.estadosolicitudnomiParameterGeneral=new EstadoSolicitudNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadosolicitudnomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoSolicitudNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(SolicitudReemplazoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SolicitudHoraExtraConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SolicitudVacacionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoSolicitudNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado(),this.estadosolicitudnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoSolicitudNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado(),this.estadosolicitudnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaDuplicarEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaCopiarEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaVerFormEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaOrdenEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoSolicitudNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoSolicitudNomi(false);
			
			this.setPermisosUsuarioEstadoSolicitudNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado() 
				|| (this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado() && this.estadosolicitudnomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoSolicitudNomiClasesRelacionadas();
			}
			
			if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoSolicitudNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoSolicitudNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoSolicitudNomi();
			}
			
			if(!this.isPermisoBusquedaEstadoSolicitudNomi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoSolicitudNomi,this.isPermisoPaginacionMedioEstadoSolicitudNomi,this.isPermisoPaginacionTodoEstadoSolicitudNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoSolicitudNomiConstantesFunciones.getTiposSeleccionarEstadoSolicitudNomi());
				
				this.tiposColumnasSelect=EstadoSolicitudNomiConstantesFunciones.getTiposSeleccionarEstadoSolicitudNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoSolicitudNomi();				
				//this.tiposRelacionesSelect=EstadoSolicitudNomiConstantesFunciones.getTiposRelacionesEstadoSolicitudNomi(true);
				
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
			//if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoSolicitudNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoSolicitudNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoSolicitudNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoSolicitudNomi() ;
			
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
			
			
			this.solicitudreemplazoLogic=new SolicitudReemplazoLogic();
			this.solicitudhoraextraLogic=new SolicitudHoraExtraLogic();
			this.solicitudvacacionLogic=new SolicitudVacacionLogic(); 
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
				estadosolicitudnomiImplementable= (EstadoSolicitudNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoSolicitudNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadosolicitudnomiImplementableHome= (EstadoSolicitudNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoSolicitudNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadosolicitudnomis= new ArrayList<EstadoSolicitudNomi>();
			this.estadosolicitudnomisEliminados= new ArrayList<EstadoSolicitudNomi>();
						
			this.isEsNuevoEstadoSolicitudNomi=false;
			this.esParaAccionDesdeFormularioEstadoSolicitudNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoSolicitudNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoSolicitudNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoSolicitudNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoSolicitudNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoSolicitudNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoSolicitudNomi();
			}
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoSolicitudNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoSolicitudNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoSolicitudNomi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoSolicitudNomi")) {
				iIndex=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();	
				
				

				if(sTitle.equals("Solicitud Hora Extras")) {
					if(!SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoSolicitudNomi();

						this.cargarParteTabPanelRelacionadaSolicitudHoraExtra(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Solicitud Reemplazos")) {
					if(!SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoSolicitudNomi();

						this.cargarParteTabPanelRelacionadaSolicitudReemplazo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Solicitud Vacaciones")) {
					if(!SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoSolicitudNomi();

						this.cargarParteTabPanelRelacionadaSolicitudVacacion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoSolicitudNomi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaSolicitudHoraExtra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.cargarSessionConBeanSwingJInternalFrameSolicitudHoraExtra(false,true,iIndex);
		this.jButtonSolicitudHoraExtraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSolicitudHoraExtra();

		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.updateUI();
		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSolicitudReemplazo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.cargarSessionConBeanSwingJInternalFrameSolicitudReemplazo(false,true,iIndex);
		this.jButtonSolicitudReemplazoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSolicitudReemplazo();

		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.updateUI();
		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSolicitudVacacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.cargarSessionConBeanSwingJInternalFrameSolicitudVacacion(false,true,iIndex);
		this.jButtonSolicitudVacacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSolicitudVacacion();

		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.updateUI();
		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoSolicitudNomi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("SolicitudReemplazo")) {
				int row=this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
				jButtonSolicitudReemplazoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SolicitudHoraExtra")) {
				int row=this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
				jButtonSolicitudHoraExtraActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("SolicitudVacacion")) {
				int row=this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
				jButtonSolicitudVacacionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Solicitud Reemplazo")) {

					if(this.isTienePermisosSolicitudReemplazo && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudReemplazoEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Solicitud Reemplazos"+"("+SolicitudReemplazoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Solicitud Reemplazos");

						if(estadosolicitudnomiConstantesFunciones.resaltarSolicitudReemplazoEstadoSolicitudNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadosolicitudnomiConstantesFunciones.resaltarSolicitudReemplazoEstadoSolicitudNomi);
						}

						jmenuItem.setEnabled(this.estadosolicitudnomiConstantesFunciones.activarSolicitudReemplazoEstadoSolicitudNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SolicitudReemplazo"));

						

						this.jInternalFrameDetalleFormEstadoSolicitudNomi.jmenuDetalleEstadoSolicitudNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Solicitud Hora Extra")) {

					if(this.isTienePermisosSolicitudHoraExtra && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudHoraExtraEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Solicitud Hora Extras"+"("+SolicitudHoraExtraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Solicitud Hora Extras");

						if(estadosolicitudnomiConstantesFunciones.resaltarSolicitudHoraExtraEstadoSolicitudNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadosolicitudnomiConstantesFunciones.resaltarSolicitudHoraExtraEstadoSolicitudNomi);
						}

						jmenuItem.setEnabled(this.estadosolicitudnomiConstantesFunciones.activarSolicitudHoraExtraEstadoSolicitudNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SolicitudHoraExtra"));

						

						this.jInternalFrameDetalleFormEstadoSolicitudNomi.jmenuDetalleEstadoSolicitudNomi.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Solicitud Vacacion")) {

					if(this.isTienePermisosSolicitudVacacion && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudVacacionEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Solicitud Vacaciones"+"("+SolicitudVacacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Solicitud Vacaciones");

						if(estadosolicitudnomiConstantesFunciones.resaltarSolicitudVacacionEstadoSolicitudNomi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadosolicitudnomiConstantesFunciones.resaltarSolicitudVacacionEstadoSolicitudNomi);
						}

						jmenuItem.setEnabled(this.estadosolicitudnomiConstantesFunciones.activarSolicitudVacacionEstadoSolicitudNomi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"SolicitudVacacion"));

						

						this.jInternalFrameDetalleFormEstadoSolicitudNomi.jmenuDetalleEstadoSolicitudNomi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoSolicitudNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoSolicitudNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoSolicitudNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoSolicitudNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoSolicitudNomi();
		
		this.cargarCombosFrameForeignKeyEstadoSolicitudNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoSolicitudNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoSolicitudNomi();
		}
	}
	
	
	
	public void jButtonNuevoEstadoSolicitudNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
			
			if(jTableDatosEstadoSolicitudNomi.getRowCount()>=1) {
				jTableDatosEstadoSolicitudNomi.removeRowSelectionInterval(0, jTableDatosEstadoSolicitudNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoSolicitudNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoSolicitudNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoSolicitudNomi(true);			
			//this.estadosolicitudnomi=new EstadoSolicitudNomi();
			//this.estadosolicitudnomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi() ;
			
			if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoSolicitudNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadosolicitudnomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);				
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
			if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoSolicitudNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoSolicitudNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoSolicitudNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoSolicitudNomi.getSelectedRows().length;			
			}
			
			estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoSolicitudNomi--;			
				//EstadoSolicitudNomi estadosolicitudnomiAux= new EstadoSolicitudNomi();			
				//estadosolicitudnomiAux.setId(this.iIdNuevoEstadoSolicitudNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoSolicitudNomi estadosolicitudnomiOrigen=new EstadoSolicitudNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoSolicitudNomi estadosolicitudnomiOrigen : estadosolicitudnomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadosolicitudnomiOrigen =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadosolicitudnomiOrigen =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoSolicitudNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadosolicitudnomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoSolicitudNomi(estadosolicitudnomiOrigen,this.estadosolicitudnomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().add(this.estadosolicitudnomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadosolicitudnomis.add(this.estadosolicitudnomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
				
				this.jTableDatosEstadoSolicitudNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoSolicitudNomi(), this.getIndiceNuevoEstadoSolicitudNomi());
				
				int iLastRow =  this.jTableDatosEstadoSolicitudNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoSolicitudNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoSolicitudNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();									
		
			EstadoSolicitudNomi estadosolicitudnomiOrigen=new EstadoSolicitudNomi();
			EstadoSolicitudNomi estadosolicitudnomiDestino=new EstadoSolicitudNomi();
				
			estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoSolicitudNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadosolicitudnomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoSolicitudNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosolicitudnomiOrigen =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadosolicitudnomiOrigen =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadosolicitudnomiDestino =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadosolicitudnomiDestino =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadosolicitudnomiOrigen =estadosolicitudnomisSeleccionados.get(0);
				estadosolicitudnomiDestino =estadosolicitudnomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoSolicitudNomi(estadosolicitudnomiOrigen,estadosolicitudnomiDestino,true,false);
				
				estadosolicitudnomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadosolicitudnomiDestino,estadosolicitudnomiLogic.getEstadoSolicitudNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadosolicitudnomiDestino,estadosolicitudnomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
				
				//this.jTableDatosEstadoSolicitudNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoSolicitudNomi(), this.getIndiceNuevoEstadoSolicitudNomi());
				
				int iLastRow =  this.jTableDatosEstadoSolicitudNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoSolicitudNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoSolicitudNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoSolicitudNomi.isVisible();
			
			
			this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(!isVisible);
			this.jPanelPaginacionEstadoSolicitudNomi.setVisible(!isVisible);
			this.jPanelAccionesEstadoSolicitudNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoSolicitudNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoSolicitudNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoSolicitudNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoSolicitudNomi();
			
			this.abrirFrameOrderByEstadoSolicitudNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoSolicitudNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoSolicitudNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoSolicitudNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoSolicitudNomi.setSize(this.jInternalFrameDetalleFormEstadoSolicitudNomi.iWidthFormulario,this.jInternalFrameDetalleFormEstadoSolicitudNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoSolicitudNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoSolicitudNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoSolicitudNomi.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jContentPaneDetalleEstadoSolicitudNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jContentPaneDetalleEstadoSolicitudNomi.getWidth(),EstadoSolicitudNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jContentPaneDetalleEstadoSolicitudNomi.getWidth(),EstadoSolicitudNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jContentPaneDetalleEstadoSolicitudNomi.getWidth(),EstadoSolicitudNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSolicitudHoraExtra();
					}

					if(SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSolicitudReemplazo();
					}

					if(SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSolicitudVacacion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoSolicitudNomi.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoSolicitudNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoSolicitudNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoSolicitudNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoSolicitudNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoSolicitudNomi,false,this);
				} else {
					this.jInternalFrameOrderByEstadoSolicitudNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoSolicitudNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoSolicitudNomi);
				this.jInternalFrameOrderByEstadoSolicitudNomi.setVisible(false);
				this.jInternalFrameOrderByEstadoSolicitudNomi.setSelected(false);
				
				this.jInternalFrameOrderByEstadoSolicitudNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoSolicitudNomi"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoSolicitudNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoSolicitudNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoSolicitudNomi==null) {
				
				this.jInternalFrameImportacionEstadoSolicitudNomi=new ImportacionJInternalFrame(EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoSolicitudNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoSolicitudNomi);
				this.jInternalFrameImportacionEstadoSolicitudNomi.setVisible(false);
				this.jInternalFrameImportacionEstadoSolicitudNomi.setSelected(false);


				this.jInternalFrameImportacionEstadoSolicitudNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoSolicitudNomi"));
				this.jInternalFrameImportacionEstadoSolicitudNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoSolicitudNomi"));
				this.jInternalFrameImportacionEstadoSolicitudNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoSolicitudNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoSolicitudNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi==null) {
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi=new ReporteDinamicoJInternalFrame(EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoSolicitudNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi);
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoSolicitudNomi"));
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoSolicitudNomi"));
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoSolicitudNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoSolicitudNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaSolicitudHoraExtra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.jScrollPanelDatosSolicitudHoraExtra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jContentPaneDetalleEstadoSolicitudNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.jScrollPanelDatosSolicitudHoraExtra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.jScrollPanelDatosSolicitudHoraExtra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.jScrollPanelDatosSolicitudHoraExtra.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSolicitudReemplazo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.jScrollPanelDatosSolicitudReemplazo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jContentPaneDetalleEstadoSolicitudNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.jScrollPanelDatosSolicitudReemplazo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.jScrollPanelDatosSolicitudReemplazo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.jScrollPanelDatosSolicitudReemplazo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSolicitudVacacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.jScrollPanelDatosSolicitudVacacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jContentPaneDetalleEstadoSolicitudNomi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.jScrollPanelDatosSolicitudVacacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.jScrollPanelDatosSolicitudVacacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.jScrollPanelDatosSolicitudVacacion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoSolicitudNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoSolicitudNomi);
			
	       	this.jInternalFrameDetalleFormEstadoSolicitudNomi.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoSolicitudNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoSolicitudNomi.dispose();
			//this.jInternalFrameDetalleFormEstadoSolicitudNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoSolicitudNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoSolicitudNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoSolicitudNomi.setVisible(true);
	        this.jInternalFrameImportacionEstadoSolicitudNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoSolicitudNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoSolicitudNomi.setVisible(true);
	        this.jInternalFrameOrderByEstadoSolicitudNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoSolicitudNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoSolicitudNomi.setVisible(false);
	        this.jInternalFrameOrderByEstadoSolicitudNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoSolicitudNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoSolicitudNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoSolicitudNomi.setVisible(false);
	        this.jInternalFrameImportacionEstadoSolicitudNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoSolicitudNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoSolicitudNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoSolicitudNomi(true);
			//this.isEsNuevoEstadoSolicitudNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(false) ;
			
			if(estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.getEsGuardarRelacionado() && SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSolicitudReemplazoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.getEsGuardarRelacionado() && SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSolicitudHoraExtraActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.getEsGuardarRelacionado() && SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSolicitudVacacionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoSolicitudNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoSolicitudNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoSolicitudNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoSolicitudNomi(true);
			//this.isEsNuevoEstadoSolicitudNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadosolicitudnomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(false) ;
			
			if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoSolicitudNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoSolicitudNomi(false);
			
			//if(!this.isEsNuevoEstadoSolicitudNomi) {								
				int intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
				
			}
			
			if(this.permiteMantenimiento(this.estadosolicitudnomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoSolicitudNomi=true;
					this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
					this.isEsNuevoEstadoSolicitudNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoSolicitudNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoSolicitudNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(false);
				
				this.habilitarDeshabilitarControlesEstadoSolicitudNomi(false);
			
												
				
				if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoSolicitudNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,estadosolicitudnomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoSolicitudNomi(this.estadosolicitudnomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoSolicitudNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadosolicitudnomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadosolicitudnomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				this.estadosolicitudnomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				this.estadosolicitudnomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadosolicitudnomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoSolicitudNomiModel) this.jTableDatosEstadoSolicitudNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoSolicitudNomi=true;
				this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
				this.isEsNuevoEstadoSolicitudNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(false);
				
				this.habilitarDeshabilitarControlesEstadoSolicitudNomi(false);
				
				
				
				if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoSolicitudNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoSolicitudNomi.getRowCount()>=1) {
				jTableDatosEstadoSolicitudNomi.removeRowSelectionInterval(0, jTableDatosEstadoSolicitudNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoSolicitudNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(false) ;
			
			this.isEsNuevoEstadoSolicitudNomi=false;
			
			if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoSolicitudNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoSolicitudNomi(false);
				
				//SI ES MANUAL
				if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoSolicitudNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoSolicitudNomi--;			
			//EstadoSolicitudNomi estadosolicitudnomiAux= new EstadoSolicitudNomi();			
			//estadosolicitudnomiAux.setId(this.iIdNuevoEstadoSolicitudNomi);
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoSolicitudNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
			
			this.estadosolicitudnomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().add(this.estadosolicitudnomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadosolicitudnomis.add(this.estadosolicitudnomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
			
			this.jTableDatosEstadoSolicitudNomi.setRowSelectionInterval(this.getIndiceNuevoEstadoSolicitudNomi(), this.getIndiceNuevoEstadoSolicitudNomi());
			
			int iLastRow =  this.jTableDatosEstadoSolicitudNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoSolicitudNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoSolicitudNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoSolicitudNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoSolicitudNomi(false);
			
			//SI ES MANUAL
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoSolicitudNomi();
			}
			
			//this.abrirFrameTreeEstadoSolicitudNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado SolicitudS ?", "MANTENIMIENTO DE Estado Solicitud", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoSolicitudNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoSolicitudNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadosolicitudnomiReturnGeneral=estadosolicitudnomiLogic.procesarImportacionEstadoSolicitudNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadosolicitudnomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoSolicitudNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoSolicitudNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoSolicitudNomi.setFileImportacion(this.jInternalFrameImportacionEstadoSolicitudNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoSolicitudNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoSolicitudNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoSolicitudNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoSolicitudNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		

		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoSolicitudNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoSolicitudNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosolicitudnomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoSolicitudNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoSolicitudNomi estadosolicitudnomi:estadosolicitudnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosolicitudnomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoSolicitudNomi estadosolicitudnomi:estadosolicitudnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadosolicitudnomi.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoSolicitudNomi(row);				
			//	iRow++;
			//}				
			
			//for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoSolicitudNomi(estadosolicitudnomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoSolicitudNomi(false);
			
			//SI ES MANUAL
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoSolicitudNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoSolicitudNomi(false);
			
			//SI ES MANUAL
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoSolicitudNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoSolicitudNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoSolicitudNomi(false);
			
			//SI ES MANUAL
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoSolicitudNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoSolicitudNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoSolicitudNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoSolicitudNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoSolicitudNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoSolicitudNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoSolicitudNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoSolicitudNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoSolicitudNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoSolicitudNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoSolicitudNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoSolicitudNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoSolicitudNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoSolicitudNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoSolicitudNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoSolicitudNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoSolicitudNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoSolicitudNomi();
		
		this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoSolicitudNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoSolicitudNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoSolicitudNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoSolicitudNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoSolicitudNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoSolicitudNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jCheckBoxPostAccionNuevoEstadoSolicitudNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoSolicitudNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoSolicitudNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.jCheckBoxPostAccionNuevoEstadoSolicitudNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.jCheckBoxPostAccionSinCerrarEstadoSolicitudNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.jCheckBoxPostAccionSinMensajeEstadoSolicitudNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoSolicitudNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoSolicitudNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoSolicitudNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoSolicitudNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoSolicitudNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoSolicitudNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoSolicitudNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoSolicitudNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoSolicitudNomi() throws Exception {
		try	{
			if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoSolicitudNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoSolicitudNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoSolicitudNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoSolicitudNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoSolicitudNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoSolicitudNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoSolicitudNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoSolicitudNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoSolicitudNomi.addItem(reporte);
			}
			
			
			if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoSolicitudNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoSolicitudNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoSolicitudNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoSolicitudNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoSolicitudNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoSolicitudNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoSolicitudNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoSolicitudNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoSolicitudNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoSolicitudNomi(Boolean esInicializar) throws Exception {				
		if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoSolicitudNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoSolicitudNomi() throws Exception {
		this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoSolicitudNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoSolicitudNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoSolicitudNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoSolicitudNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoSolicitudNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoSolicitudNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoSolicitudNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoSolicitudNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadosolicitudnomiLogic.getEstadoSolicitudNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadosolicitudnomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoSolicitudNomi.setModel(new EstadoSolicitudNomiModel(this.estadosolicitudnomiLogic.getEstadoSolicitudNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoSolicitudNomi.setModel(new EstadoSolicitudNomiModel(this.estadosolicitudnomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoSolicitudNomi!=null && this.jInternalFrameOrderByEstadoSolicitudNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoSolicitudNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoSolicitudNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoSolicitudNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO,estadosolicitudnomiConstantesFunciones.resaltarSeleccionarEstadoSolicitudNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoSolicitudNomiConstantesFunciones.SCLASSWEBTITULO,estadosolicitudnomiConstantesFunciones.resaltarSeleccionarEstadoSolicitudNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoSolicitudNomi,EstadoSolicitudNomiConstantesFunciones.LABEL_ID));

		if(this.estadosolicitudnomiConstantesFunciones.mostraridEstadoSolicitudNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoSolicitudNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadosolicitudnomiConstantesFunciones.resaltaridEstadoSolicitudNomi,this.estadosolicitudnomiConstantesFunciones.activaridEstadoSolicitudNomi,this,true,"idEstadoSolicitudNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosolicitudnomiConstantesFunciones.resaltaridEstadoSolicitudNomi,this.estadosolicitudnomiConstantesFunciones.activaridEstadoSolicitudNomi,this,true,"idEstadoSolicitudNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoSolicitudNomi,EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO));

		if(this.estadosolicitudnomiConstantesFunciones.mostrarcodigoEstadoSolicitudNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadosolicitudnomiConstantesFunciones.resaltarcodigoEstadoSolicitudNomi,this.estadosolicitudnomiConstantesFunciones.activarcodigoEstadoSolicitudNomi,this,true,"codigoEstadoSolicitudNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosolicitudnomiConstantesFunciones.resaltarcodigoEstadoSolicitudNomi,this.estadosolicitudnomiConstantesFunciones.activarcodigoEstadoSolicitudNomi,this,true,"codigoEstadoSolicitudNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoSolicitudNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoSolicitudNomi,EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.estadosolicitudnomiConstantesFunciones.mostrarnombreEstadoSolicitudNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadosolicitudnomiConstantesFunciones.resaltarnombreEstadoSolicitudNomi,this.estadosolicitudnomiConstantesFunciones.activarnombreEstadoSolicitudNomi,this,true,"nombreEstadoSolicitudNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadosolicitudnomiConstantesFunciones.resaltarnombreEstadoSolicitudNomi,this.estadosolicitudnomiConstantesFunciones.activarnombreEstadoSolicitudNomi,this,true,"nombreEstadoSolicitudNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoSolicitudNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosSolicitudReemplazo && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudReemplazoEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Solicitud Reemplazos");
				tableColumn.setHeaderValue("Solicitud Reemplazos");
				tableColumn.setCellRenderer(new SolicitudReemplazoTableCell(estadosolicitudnomiConstantesFunciones.resaltarSolicitudReemplazoEstadoSolicitudNomi,this,this.estadosolicitudnomiConstantesFunciones.activarSolicitudReemplazoEstadoSolicitudNomi));
				tableColumn.setCellEditor(new SolicitudReemplazoTableCell(estadosolicitudnomiConstantesFunciones.resaltarSolicitudReemplazoEstadoSolicitudNomi,this,this.estadosolicitudnomiConstantesFunciones.activarSolicitudReemplazoEstadoSolicitudNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosSolicitudHoraExtra && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudHoraExtraEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Solicitud Hora Extras");
				tableColumn.setHeaderValue("Solicitud Hora Extras");
				tableColumn.setCellRenderer(new SolicitudHoraExtraTableCell(estadosolicitudnomiConstantesFunciones.resaltarSolicitudHoraExtraEstadoSolicitudNomi,this,this.estadosolicitudnomiConstantesFunciones.activarSolicitudHoraExtraEstadoSolicitudNomi));
				tableColumn.setCellEditor(new SolicitudHoraExtraTableCell(estadosolicitudnomiConstantesFunciones.resaltarSolicitudHoraExtraEstadoSolicitudNomi,this,this.estadosolicitudnomiConstantesFunciones.activarSolicitudHoraExtraEstadoSolicitudNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);
			}

			if(this.isTienePermisosSolicitudVacacion && this.estadosolicitudnomiConstantesFunciones.mostrarSolicitudVacacionEstadoSolicitudNomi && !EstadoSolicitudNomiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Solicitud Vacaciones");
				tableColumn.setHeaderValue("Solicitud Vacaciones");
				tableColumn.setCellRenderer(new SolicitudVacacionTableCell(estadosolicitudnomiConstantesFunciones.resaltarSolicitudVacacionEstadoSolicitudNomi,this,this.estadosolicitudnomiConstantesFunciones.activarSolicitudVacacionEstadoSolicitudNomi));
				tableColumn.setCellEditor(new SolicitudVacacionTableCell(estadosolicitudnomiConstantesFunciones.resaltarSolicitudVacacionEstadoSolicitudNomi,this,this.estadosolicitudnomiConstantesFunciones.activarSolicitudVacacionEstadoSolicitudNomi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoSolicitudNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoSolicitudNomi.moveColumn(this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoSolicitudNomi.moveColumn(this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoSolicitudNomi.moveColumn(this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoSolicitudNomi.moveColumn(this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoSolicitudNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoSolicitudNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoSolicitudNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoSolicitudNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoSolicitudNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoSolicitudNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadosolicitudnomiLogic.getEstadoSolicitudNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadosolicitudnomis.size()-1;
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
		//this.jTableDatosEstadoSolicitudNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoSolicitudNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoSolicitudNomi();
			
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
				
				//this.isEsNuevoEstadoSolicitudNomi=false;
					
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
				if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoSolicitudNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoSolicitudNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadosolicitudnomi.getsType().equals("DUPLICADO")
				   || this.estadosolicitudnomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoSolicitudNomi=true;
				
				} else {
					this.isEsNuevoEstadoSolicitudNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
					if(this.estadosolicitudnomi.getId()>=0 && !this.estadosolicitudnomi.getIsNew()) {						
						this.isEsNuevoEstadoSolicitudNomi=false;
						
					} else {
						this.isEsNuevoEstadoSolicitudNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoSolicitudNomi(esRelaciones);						
				
				this.seleccionarEstadoSolicitudNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadosolicitudnomi.getId()<0) {
					this.isEsNuevoEstadoSolicitudNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoSolicitudNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoSolicitudNomi(evt,rowIndex);
				}	
				
				if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoSolicitudNomi: " + this.dDif); 
					}
				}								
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoSolicitudNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadosolicitudnomi)) {
					if(this.estadosolicitudnomi.getId()>0) {
						this.estadosolicitudnomi.setIsDeleted(true);
						
						this.estadosolicitudnomisEliminados.add(this.estadosolicitudnomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().remove(this.estadosolicitudnomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadosolicitudnomis.remove(this.estadosolicitudnomi);				
					}
					
					
					((EstadoSolicitudNomiModel) this.jTableDatosEstadoSolicitudNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoSolicitudNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoSolicitudNomi) {
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoSolicitudNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoSolicitudNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoSolicitudNomi(this.estadosolicitudnomi);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoSolicitudNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoSolicitudNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoSolicitudNomi(estadosolicitudnomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoSolicitudNomi(estadosolicitudnomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoSolicitudNomi(estadosolicitudnomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoSolicitudNomi(estadosolicitudnomi);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.setText(estadosolicitudnomi.getId().toString());
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.setText(estadosolicitudnomi.getcodigo());
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.setText(estadosolicitudnomi.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoSolicitudNomi estadosolicitudnomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadosolicitudnomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoSolicitudNomi estadosolicitudnomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadosolicitudnomiLocal=this.estadosolicitudnomi;
			} else {
				estadosolicitudnomiLocal=this.estadosolicitudnomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadosolicitudnomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoSolicitudNomi(estadosolicitudnomiLocal,true);
					
					if(estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadosolicitudnomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadosolicitudnomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(estadosolicitudnomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(estadosolicitudnomi);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(estadosolicitudnomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.getText()==null || this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.getText()=="" || this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.setText("0");
			}

			if(conColumnasBase) {estadosolicitudnomi.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoSolicitudNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoSolicitudNomi.jLabelIdEstadoSolicitudNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosolicitudnomi.setcodigo(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoSolicitudNomi.jLabelcodigoEstadoSolicitudNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadosolicitudnomi.setnombre(this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoSolicitudNomi.jLabelnombreEstadoSolicitudNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomiBean,EstadoSolicitudNomi estadosolicitudnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomiOrigen,EstadoSolicitudNomi estadosolicitudnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadosolicitudnomiOrigen.getId()!=null && !estadosolicitudnomiOrigen.getId().equals(0L))) {estadosolicitudnomi.setId(estadosolicitudnomiOrigen.getId());}}
			if(conDefault || (!conDefault && estadosolicitudnomiOrigen.getcodigo()!=null && !estadosolicitudnomiOrigen.getcodigo().equals(""))) {estadosolicitudnomi.setcodigo(estadosolicitudnomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadosolicitudnomiOrigen.getnombre()!=null && !estadosolicitudnomiOrigen.getnombre().equals(""))) {estadosolicitudnomi.setnombre(estadosolicitudnomiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.setText(estadosolicitudnomi.getId().toString());
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.setText(estadosolicitudnomi.getcodigo());
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.setText(estadosolicitudnomi.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoSolicitudNomi(EstadoSolicitudNomiBean estadosolicitudnomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.setText(estadosolicitudnomiBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.setText(estadosolicitudnomiBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.setText(estadosolicitudnomiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoSolicitudNomi(EstadoSolicitudNomiParameterReturnGeneral estadosolicitudnomiReturnGeneral,EstadoSolicitudNomiBean estadosolicitudnomiBean,Boolean conDefault) throws Exception { 
		try {
			EstadoSolicitudNomi estadosolicitudnomiLocal=new EstadoSolicitudNomi();
			
			estadosolicitudnomiLocal=estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadosolicitudnomiLocal.getId()!=null && !estadosolicitudnomiLocal.getId().equals(0L))) {estadosolicitudnomiBean.setId(estadosolicitudnomiLocal.getId());}}
			if(conDefault || (!conDefault && estadosolicitudnomiLocal.getcodigo()!=null && !estadosolicitudnomiLocal.getcodigo().equals(""))) {estadosolicitudnomiBean.setcodigo(estadosolicitudnomiLocal.getcodigo());}
			if(conDefault || (!conDefault && estadosolicitudnomiLocal.getnombre()!=null && !estadosolicitudnomiLocal.getnombre().equals(""))) {estadosolicitudnomiBean.setnombre(estadosolicitudnomiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoSolicitudNomiGenerico(Long idEstadoSolicitudNomiSeleccionado,JComboBox jComboBoxEstadoSolicitudNomi,List<EstadoSolicitudNomi> estadosolicitudnomisLocal)throws Exception {
		try {
			EstadoSolicitudNomi  estadosolicitudnomiTemp=null;

			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisLocal) {
				if(estadosolicitudnomiAux.getId()!=null && estadosolicitudnomiAux.getId().equals(idEstadoSolicitudNomiSeleccionado)) {
					estadosolicitudnomiTemp=estadosolicitudnomiAux;
					break;
				}
			}

			jComboBoxEstadoSolicitudNomi.setSelectedItem(estadosolicitudnomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoSolicitudNomiGenerico(JComboBox jComboBoxEstadoSolicitudNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoSolicitudNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoSolicitudNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoSolicitudNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoSolicitudNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoSolicitudNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoSolicitudNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoSolicitudNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoSolicitudNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoSolicitudNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoSolicitudNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("SolicitudReemplazo")) {
			jButtonSolicitudReemplazoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SolicitudHoraExtra")) {
			jButtonSolicitudHoraExtraActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("SolicitudVacacion")) {
			jButtonSolicitudVacacionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosolicitudnomi=(EstadoSolicitudNomi) estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadosolicitudnomi =(EstadoSolicitudNomi) estadosolicitudnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoSolicitudNomi estadosolicitudnomiRow=new EstadoSolicitudNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosolicitudnomiRow=(EstadoSolicitudNomi) estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadosolicitudnomiRow=(EstadoSolicitudNomi) estadosolicitudnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonSolicitudReemplazoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoSolicitudNomi estadosolicitudnomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomi = (EstadoSolicitudNomi)this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadosolicitudnomi = (EstadoSolicitudNomi)this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadosolicitudnomi!=null) {
						this.estadosolicitudnomi = estadosolicitudnomi;
					} else {
						this.estadosolicitudnomi = new EstadoSolicitudNomi();
					}
				}

				if(this.isTienePermisosSolicitudReemplazo && this.permiteMantenimiento(this.estadosolicitudnomi)) {
					SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFramePopup=new SolicitudReemplazoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						solicitudreemplazoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFramePopup;
					} else {
						solicitudreemplazoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame;
					}

					List<EstadoSolicitudNomi> estadosolicitudnomis=new ArrayList<EstadoSolicitudNomi>();
					estadosolicitudnomis.add(this.estadosolicitudnomi);
					if(!esRelacionado) {
						//solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setConGuardarRelaciones(false);
						//solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					solicitudreemplazoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.cargarSolicitudReemplazoBeanSwingJInternalFrame(estadosolicitudnomis,this.estadosolicitudnomi,solicitudreemplazoBeanSwingJInternalFrame,/*conInicializar,*/solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.getConGuardarRelaciones(),solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.getEsGuardarRelacionado());
					solicitudreemplazoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						solicitudreemplazoBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudReemplazo("no_relacionado");

						solicitudreemplazoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SolicitudReemplazoConstantesFunciones.ITAMANIOFILATABLA + (SolicitudReemplazoConstantesFunciones.ITAMANIOFILATABLA/2));

						solicitudreemplazoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoSolicitudNomi=(TitledBorder)this.jScrollPanelDatosEstadoSolicitudNomi.getBorder();
						TitledBorder titledBorderSolicitudReemplazo=(TitledBorder)solicitudreemplazoBeanSwingJInternalFrame.jScrollPanelDatosSolicitudReemplazo.getBorder();

						titledBorderSolicitudReemplazo.setTitle(titledBorderEstadoSolicitudNomi.getTitle() + " -> Solicitud Reemplazo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,solicitudreemplazoBeanSwingJInternalFrame);
						}

						solicitudreemplazoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(solicitudreemplazoBeanSwingJInternalFrame);

						solicitudreemplazoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Solicitud Reemplazo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSolicitudHoraExtraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoSolicitudNomi estadosolicitudnomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomi = (EstadoSolicitudNomi)this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadosolicitudnomi = (EstadoSolicitudNomi)this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadosolicitudnomi!=null) {
						this.estadosolicitudnomi = estadosolicitudnomi;
					} else {
						this.estadosolicitudnomi = new EstadoSolicitudNomi();
					}
				}

				if(this.isTienePermisosSolicitudHoraExtra && this.permiteMantenimiento(this.estadosolicitudnomi)) {
					SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFramePopup=new SolicitudHoraExtraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						solicitudhoraextraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFramePopup;
					} else {
						solicitudhoraextraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame;
					}

					List<EstadoSolicitudNomi> estadosolicitudnomis=new ArrayList<EstadoSolicitudNomi>();
					estadosolicitudnomis.add(this.estadosolicitudnomi);
					if(!esRelacionado) {
						//solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setConGuardarRelaciones(false);
						//solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					solicitudhoraextraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.cargarSolicitudHoraExtraBeanSwingJInternalFrame(estadosolicitudnomis,this.estadosolicitudnomi,solicitudhoraextraBeanSwingJInternalFrame,/*conInicializar,*/solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.getConGuardarRelaciones(),solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.getEsGuardarRelacionado());
					solicitudhoraextraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						solicitudhoraextraBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudHoraExtra("no_relacionado");

						solicitudhoraextraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SolicitudHoraExtraConstantesFunciones.ITAMANIOFILATABLA + (SolicitudHoraExtraConstantesFunciones.ITAMANIOFILATABLA/2));

						solicitudhoraextraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoSolicitudNomi=(TitledBorder)this.jScrollPanelDatosEstadoSolicitudNomi.getBorder();
						TitledBorder titledBorderSolicitudHoraExtra=(TitledBorder)solicitudhoraextraBeanSwingJInternalFrame.jScrollPanelDatosSolicitudHoraExtra.getBorder();

						titledBorderSolicitudHoraExtra.setTitle(titledBorderEstadoSolicitudNomi.getTitle() + " -> Solicitud Hora Extra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,solicitudhoraextraBeanSwingJInternalFrame);
						}

						solicitudhoraextraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(solicitudhoraextraBeanSwingJInternalFrame);

						solicitudhoraextraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Solicitud Hora Extra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSolicitudVacacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoSolicitudNomi estadosolicitudnomi) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomi = (EstadoSolicitudNomi)this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadosolicitudnomi = (EstadoSolicitudNomi)this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadosolicitudnomi!=null) {
						this.estadosolicitudnomi = estadosolicitudnomi;
					} else {
						this.estadosolicitudnomi = new EstadoSolicitudNomi();
					}
				}

				if(this.isTienePermisosSolicitudVacacion && this.permiteMantenimiento(this.estadosolicitudnomi)) {
					SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFramePopup=new SolicitudVacacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						solicitudvacacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFramePopup;
					} else {
						solicitudvacacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame;
					}

					List<EstadoSolicitudNomi> estadosolicitudnomis=new ArrayList<EstadoSolicitudNomi>();
					estadosolicitudnomis.add(this.estadosolicitudnomi);
					if(!esRelacionado) {
						//solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setConGuardarRelaciones(false);
						//solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					solicitudvacacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.cargarSolicitudVacacionBeanSwingJInternalFrame(estadosolicitudnomis,this.estadosolicitudnomi,solicitudvacacionBeanSwingJInternalFrame,/*conInicializar,*/solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.getConGuardarRelaciones(),solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.getEsGuardarRelacionado());
					solicitudvacacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						solicitudvacacionBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudVacacion("no_relacionado");

						solicitudvacacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SolicitudVacacionConstantesFunciones.ITAMANIOFILATABLA + (SolicitudVacacionConstantesFunciones.ITAMANIOFILATABLA/2));

						solicitudvacacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoSolicitudNomi=(TitledBorder)this.jScrollPanelDatosEstadoSolicitudNomi.getBorder();
						TitledBorder titledBorderSolicitudVacacion=(TitledBorder)solicitudvacacionBeanSwingJInternalFrame.jScrollPanelDatosSolicitudVacacion.getBorder();

						titledBorderSolicitudVacacion.setTitle(titledBorderEstadoSolicitudNomi.getTitle() + " -> Solicitud Vacacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,solicitudvacacionBeanSwingJInternalFrame);
						}

						solicitudvacacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(solicitudvacacionBeanSwingJInternalFrame);

						solicitudvacacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Solicitud Vacacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi));			
			this.jButtonDuplicarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaDuplicarEstadoSolicitudNomi && this.isPermisoDuplicarEstadoSolicitudNomi));			
			this.jButtonCopiarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaCopiarEstadoSolicitudNomi && this.isPermisoCopiarEstadoSolicitudNomi));
			this.jButtonVerFormEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaVerFormEstadoSolicitudNomi && this.isPermisoVerFormEstadoSolicitudNomi));
			
			this.jButtonAbrirOrderByEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoSolicitudNomi && this.isPermisoOrdenEstadoSolicitudNomi));			
			
			this.jButtonNuevoRelacionesEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi));			
			this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaModificarEstadoSolicitudNomi && this.isPermisoActualizarEstadoSolicitudNomi));	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaActualizarEstadoSolicitudNomi && this.isPermisoActualizarEstadoSolicitudNomi));	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaEliminarEstadoSolicitudNomi && this.isPermisoEliminarEstadoSolicitudNomi));
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarEstadoSolicitudNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoSolicitudNomi);							
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi));						
			this.jButtonDuplicarToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaDuplicarEstadoSolicitudNomi && this.isPermisoDuplicarEstadoSolicitudNomi));						
			this.jButtonCopiarToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaCopiarEstadoSolicitudNomi && this.isPermisoCopiarEstadoSolicitudNomi));			
			this.jButtonVerFormToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaVerFormEstadoSolicitudNomi && this.isPermisoVerFormEstadoSolicitudNomi));			
			this.jButtonAbrirOrderByToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoSolicitudNomi && this.isPermisoOrdenEstadoSolicitudNomi));
			this.jButtonNuevoRelacionesToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));			
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaModificarEstadoSolicitudNomi && this.isPermisoActualizarEstadoSolicitudNomi));	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaActualizarEstadoSolicitudNomi  && this.isPermisoActualizarEstadoSolicitudNomi));	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaEliminarEstadoSolicitudNomi && this.isPermisoEliminarEstadoSolicitudNomi));
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarToolBarEstadoSolicitudNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoSolicitudNomi);				
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi));			
			this.jMenuItemDuplicarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaDuplicarEstadoSolicitudNomi && this.isPermisoDuplicarEstadoSolicitudNomi));			
			this.jMenuItemCopiarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaCopiarEstadoSolicitudNomi && this.isPermisoCopiarEstadoSolicitudNomi));			
			this.jMenuItemVerFormEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaVerFormEstadoSolicitudNomi && this.isPermisoVerFormEstadoSolicitudNomi));			
			this.jMenuItemAbrirOrderByEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoSolicitudNomi && this.isPermisoOrdenEstadoSolicitudNomi));			
			//this.jMenuItemMostrarOcultarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoSolicitudNomi && this.isPermisoOrdenEstadoSolicitudNomi));
			this.jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoSolicitudNomi && this.isPermisoOrdenEstadoSolicitudNomi));			
			//this.jMenuItemDetalleMostrarOcultarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaOrdenEstadoSolicitudNomi && this.isPermisoOrdenEstadoSolicitudNomi));			
			this.jMenuItemNuevoRelacionesEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi));			
			this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaNuevoEstadoSolicitudNomi && this.isPermisoNuevoEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));									
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemModificarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaModificarEstadoSolicitudNomi && this.isPermisoActualizarEstadoSolicitudNomi));	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemActualizarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaActualizarEstadoSolicitudNomi && this.isPermisoActualizarEstadoSolicitudNomi));	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemEliminarEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaEliminarEstadoSolicitudNomi && this.isPermisoEliminarEstadoSolicitudNomi));
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemCancelarEstadoSolicitudNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoSolicitudNomi);				
			}
			
			this.jMenuItemGuardarCambiosEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));						
			this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=this.jButtonNuevoEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoSolicitudNomi=this.jButtonDuplicarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaCopiarEstadoSolicitudNomi=this.jButtonCopiarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaVerFormEstadoSolicitudNomi=this.jButtonVerFormEstadoSolicitudNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoSolicitudNomi=this.jButtonAbrirOrderByEstadoSolicitudNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=this.jButtonNuevoRelacionesEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=this.jButtonModificarEstadoSolicitudNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=this.jButtonNuevoToolBarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=this.jButtonNuevoRelacionesToolBarEstadoSolicitudNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarToolBarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarToolBarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarToolBarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarToolBarEstadoSolicitudNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=this.jButtonGuardarCambiosToolBarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=this.jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=this.jMenuItemNuevoEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=this.jMenuItemNuevoRelacionesEstadoSolicitudNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemModificarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemActualizarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemEliminarEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemCancelarEstadoSolicitudNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=this.jMenuItemGuardarCambiosEstadoSolicitudNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoSolicitudNomi(Boolean esInicializar) {
		if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
				//if(this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoSolicitudNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoSolicitudNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoSolicitudNomi() {
		this.jButtonNuevoEstadoSolicitudNomi.setVisible(this.isPermisoNuevoEstadoSolicitudNomi);			
		this.jButtonDuplicarEstadoSolicitudNomi.setVisible(this.isPermisoDuplicarEstadoSolicitudNomi);			
		this.jButtonCopiarEstadoSolicitudNomi.setVisible(this.isPermisoCopiarEstadoSolicitudNomi);			
		this.jButtonVerFormEstadoSolicitudNomi.setVisible(this.isPermisoVerFormEstadoSolicitudNomi);			
		
		this.jButtonAbrirOrderByEstadoSolicitudNomi.setVisible(this.isPermisoOrdenEstadoSolicitudNomi);					
		
		this.jButtonNuevoRelacionesEstadoSolicitudNomi.setVisible(this.isPermisoNuevoEstadoSolicitudNomi);			
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarEstadoSolicitudNomi.setVisible(this.isPermisoActualizarEstadoSolicitudNomi);	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarEstadoSolicitudNomi.setVisible(this.isPermisoActualizarEstadoSolicitudNomi);	
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarEstadoSolicitudNomi.setVisible(this.isPermisoEliminarEstadoSolicitudNomi);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarEstadoSolicitudNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoSolicitudNomi);						
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.setVisible(this.isPermisoGuardarCambiosEstadoSolicitudNomi);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.setVisible(this.isPermisoActualizarEstadoSolicitudNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoSolicitudNomi() {
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarEstadoSolicitudNomi.setVisible(this.isPermisoActualizarEstadoSolicitudNomi);	
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarEstadoSolicitudNomi.setVisible(this.isPermisoActualizarEstadoSolicitudNomi);	
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarEstadoSolicitudNomi.setVisible(this.isPermisoEliminarEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarEstadoSolicitudNomi.setVisible(this.isVisibilidadCeldaCancelarEstadoSolicitudNomi);							
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.setVisible((this.isVisibilidadCeldaGuardarEstadoSolicitudNomi && this.isPermisoGuardarCambiosEstadoSolicitudNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoSolicitudNomi() {
		if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoSolicitudNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoSolicitudNomi() {
	}
	
	public void jTableDatosEstadoSolicitudNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoSolicitudNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoSolicitudNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.getestadosolicitudnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosolicitudnomi==null) {
						this.estadosolicitudnomi = new EstadoSolicitudNomi();
					}

					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
				}

				if(this.estadosolicitudnomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadosolicitudnomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoSolicitudNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoSolicitudNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.getestadosolicitudnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosolicitudnomi==null) {
						this.estadosolicitudnomi = new EstadoSolicitudNomi();
					}

					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
				}

				if(this.estadosolicitudnomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadosolicitudnomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoSolicitudNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoSolicitudNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.getestadosolicitudnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadosolicitudnomi==null) {
						this.estadosolicitudnomi = new EstadoSolicitudNomi();
					}

					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);
				}

				if(this.estadosolicitudnomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadosolicitudnomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoSolicitudNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoSolicitudNomi() {
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.dispose();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
			this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.dispose();
			this.jInternalFrameReporteDinamicoEstadoSolicitudNomi=null;
		}
		
		if(this.jInternalFrameImportacionEstadoSolicitudNomi!=null) {
			this.jInternalFrameImportacionEstadoSolicitudNomi.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoSolicitudNomi.dispose();
			this.jInternalFrameImportacionEstadoSolicitudNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoSolicitudNomi();
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoSolicitudNomi")) {
				jButtonDuplicarEstadoSolicitudNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoSolicitudNomi")) {
				jButtonCopiarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoSolicitudNomi")) {
				jButtonVerFormEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoSolicitudNomi")) {
				jButtonDuplicarEstadoSolicitudNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoSolicitudNomi")) {
				jButtonDuplicarEstadoSolicitudNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoSolicitudNomi")) {
				jButtonModificarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoSolicitudNomi")) {
				jButtonModificarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoSolicitudNomi")) {
				jButtonModificarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoSolicitudNomi")) {
				jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoSolicitudNomi")) {
				jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoSolicitudNomi")) {
				jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoSolicitudNomi")) {
				jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoSolicitudNomi")) {
				jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoSolicitudNomi")) {
				jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoSolicitudNomi")) {
				jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoSolicitudNomi")) {
				jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoSolicitudNomi")) {
				jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoSolicitudNomi")) {
				jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoSolicitudNomi")) {
				jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoSolicitudNomi")) {
				jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoSolicitudNomi")) {
				jButtonMostrarOcultarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoSolicitudNomi")) {
				jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoSolicitudNomi")) {
				jButtonCopiarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoSolicitudNomi")) {
				jButtonVerFormEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoSolicitudNomi")) {
				jButtonCopiarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoSolicitudNomi")) {
				jButtonVerFormEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoSolicitudNomi")) {
				jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoSolicitudNomi")) {
				jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoSolicitudNomi")) {
				jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoSolicitudNomi")) {
				jButtonAnterioresEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoSolicitudNomi")) {
				jButtonAnterioresEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoSolicitudNomi")) {
				jButtonAnterioresEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoSolicitudNomi")) {
				jButtonSiguientesEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoSolicitudNomi")) {
				jButtonSiguientesEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoSolicitudNomi")) {
				jButtonSiguientesEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoSolicitudNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoSolicitudNomi")) {
				jButtonAbrirOrderByEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoSolicitudNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoSolicitudNomi")) {
				jButtonMostrarOcultarEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoSolicitudNomi")) {
				jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoSolicitudNomi")) {
				jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoSolicitudNomi")) {
				jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoSolicitudNomi")) {
				jButtonCerrarReporteDinamicoEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoSolicitudNomi")) {
				jButtonGenerarReporteDinamicoEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoSolicitudNomi")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoSolicitudNomi")) {
				jButtonCerrarImportacionEstadoSolicitudNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoSolicitudNomi")) {
				
				jButtonGenerarImportacionEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoSolicitudNomi")) {
				
				jButtonAbrirImportacionEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoSolicitudNomi")) {
				jComboBoxTiposAccionesEstadoSolicitudNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoSolicitudNomi")) {
				jComboBoxTiposRelacionesEstadoSolicitudNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoSolicitudNomi")) {
				jComboBoxTiposAccionesEstadoSolicitudNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoSolicitudNomi")) {
				
				jComboBoxTiposSeleccionarEstadoSolicitudNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoSolicitudNomi")) {
				jTextFieldValorCampoGeneralEstadoSolicitudNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoSolicitudNomi")) {
				jButtonAbrirOrderByEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoSolicitudNomi")) {
				jButtonAbrirOrderByEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoSolicitudNomi")) {
				jButtonCerrarOrderByEstadoSolicitudNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoSolicitudNomiBusqueda")) {
				this.jButtonidEstadoSolicitudNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoSolicitudNomiBusqueda")) {
				this.jButtoncodigoEstadoSolicitudNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoSolicitudNomiBusqueda")) {
				this.jButtonnombreEstadoSolicitudNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoSolicitudNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoSolicitudNomi estadosolicitudnomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadosolicitudnomiLocal=this.estadosolicitudnomi;
			} else {
				estadosolicitudnomiLocal=this.estadosolicitudnomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
							
				
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
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
			
			


			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoSolicitudNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
								
						
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
								
				
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
							
				
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
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
			
			


			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
								
				
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoSolicitudNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoSolicitudNomi")) {
					jCheckBoxSeleccionarTodosEstadoSolicitudNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoSolicitudNomi")) {
					jCheckBoxSeleccionadosEstadoSolicitudNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoSolicitudNomi")) {
					
				}
				
				


				
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
												
				
				


				
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoSolicitudNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
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
			
			


			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadosolicitudnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadosolicitudnomi);
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
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
				
				


				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoSolicitudNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoSolicitudNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoSolicitudNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadosolicitudnomiAnterior =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoSolicitudNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoSolicitudNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoSolicitudNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadosolicitudnomi =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadosolicitudnomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoSolicitudNomi")) {
				
				}
				
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoSolicitudNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoSolicitudNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoSolicitudNomi")) {
			
			}
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoSolicitudNomi();
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoSolicitudNomi")) {
				jButtonDuplicarEstadoSolicitudNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoSolicitudNomi")) {
				jButtonCopiarEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoSolicitudNomi")) {
				jButtonVerFormEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoSolicitudNomi")) {
				jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoSolicitudNomi")) {
				jButtonModificarEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoSolicitudNomi")) {
				jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoSolicitudNomi")) {
				jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoSolicitudNomi")) {
				jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoSolicitudNomi")) {
				jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoSolicitudNomi")) {
				jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoSolicitudNomi")) {
				jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoSolicitudNomi")) {
				jButtonAbrirOrderByEstadoSolicitudNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoSolicitudNomi")) {
				jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoSolicitudNomi")) {
				jButtonAnterioresEstadoSolicitudNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoSolicitudNomi")) {
				jButtonSiguientesEstadoSolicitudNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoSolicitudNomiBusqueda")) {
				this.jButtonidEstadoSolicitudNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoSolicitudNomiBusqueda")) {
				this.jButtoncodigoEstadoSolicitudNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoSolicitudNomiBusqueda")) {
				this.jButtonnombreEstadoSolicitudNomiBusquedaActionPerformed(evt);
			}
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoSolicitudNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoSolicitudNomi")) {
				closingInternalFrameEstadoSolicitudNomi();
				
			} else if(sTipo.equals("jButtonCancelarEstadoSolicitudNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoSolicitudNomi = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoSolicitudNomiBeanSwingJInternalFrame jInternalFrameParent=(EstadoSolicitudNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoSolicitudNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoSolicitudNomiActionPerformed(null);
			}
			
			EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadosolicitudnomi,new Object(),this.estadosolicitudnomiParameterGeneral,this.estadosolicitudnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoSolicitudNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoSolicitudNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoSolicitudNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadosolicitudnomi)) {
			if(!esControlTabla) {
				if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);			
				}
				
				if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadosolicitudnomiReturnGeneral=estadosolicitudnomiLogic.procesarEventosEstadoSolicitudNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosolicitudnomiLogic.getEstadoSolicitudNomis(),this.estadosolicitudnomi,this.estadosolicitudnomiParameterGeneral,this.isEsNuevoEstadoSolicitudNomi,classes);//this.estadosolicitudnomiLogic.getEstadoSolicitudNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral,this.estadosolicitudnomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoSolicitudNomi(classes,this.estadosolicitudnomiReturnGeneral,this.estadosolicitudnomiBean,false);
					}
						
					if(this.estadosolicitudnomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi());	
					}
						
					if(this.estadosolicitudnomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi(),classes);//this.estadosolicitudnomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoSolicitudNomi(this.estadosolicitudnomi,classes);//this.estadosolicitudnomiBean);									
				}
			
				if(EstadoSolicitudNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoSolicitudNomi(this.estadosolicitudnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoSolicitudNomi(this.estadosolicitudnomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadosolicitudnomiAnterior!=null) {
						this.estadosolicitudnomi=this.estadosolicitudnomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadosolicitudnomiReturnGeneral=estadosolicitudnomiLogic.procesarEventosEstadoSolicitudNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosolicitudnomiLogic.getEstadoSolicitudNomis(),this.estadosolicitudnomi,this.estadosolicitudnomiParameterGeneral,this.isEsNuevoEstadoSolicitudNomi,classes);//this.estadosolicitudnomiLogic.getEstadoSolicitudNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadosolicitudnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi(),estadosolicitudnomiLogic.getEstadoSolicitudNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi(),this.estadosolicitudnomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoSolicitudNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoSolicitudNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoSolicitudNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoSolicitudNomi() throws Exception {
		
		EstadoSolicitudNomiModel estadosolicitudnomiModel=(EstadoSolicitudNomiModel)this.jTableDatosEstadoSolicitudNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadosolicitudnomiModel.estadosolicitudnomis=this.estadosolicitudnomiLogic.getEstadoSolicitudNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadosolicitudnomiModel.estadosolicitudnomis=this.estadosolicitudnomis;
		}
		
		
		((EstadoSolicitudNomiModel) this.jTableDatosEstadoSolicitudNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoSolicitudNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadosolicitudnomiAnterior(),this.estadosolicitudnomiLogic.getEstadoSolicitudNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadosolicitudnomiAnterior(),this.estadosolicitudnomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoSolicitudNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudReemplazo.class)) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.setSolicitudReemplazos(estadosolicitudnomi.getSolicitudReemplazos());
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudReemplazo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudHoraExtra.class)) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.setSolicitudHoraExtras(estadosolicitudnomi.getSolicitudHoraExtras());
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudVacacion.class)) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.setSolicitudVacacions(estadosolicitudnomi.getSolicitudVacacions());
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudVacacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
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
										
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosolicitudnomi,new Object(),generalEntityParameterGeneral,this.estadosolicitudnomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoSolicitudNomiConstantesFunciones.getClassesRelationshipsOfEstadoSolicitudNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoSolicitudNomiConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoSolicitudNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoSolicitudNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadosolicitudnomi,new Object(),generalEntityParameterGeneral,this.estadosolicitudnomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoSolicitudNomi(EstadoSolicitudNomiBean estadosolicitudnomiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudReemplazo.class)) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.setSolicitudReemplazos(estadosolicitudnomi.getSolicitudReemplazos());
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudReemplazo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudHoraExtra.class)) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.setSolicitudHoraExtras(estadosolicitudnomi.getSolicitudHoraExtras());
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudHoraExtra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudVacacion.class)) {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.setSolicitudVacacions(estadosolicitudnomi.getSolicitudVacacions());
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudVacacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoSolicitudNomi(ArrayList<Classe> classes,EstadoSolicitudNomiReturnGeneral estadosolicitudnomiReturnGeneral,EstadoSolicitudNomiBean estadosolicitudnomiBean,Boolean conDefault) throws Exception {
		
			this.estadosolicitudnomiBean.setSolicitudReemplazos(estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi().getSolicitudReemplazos());
			this.estadosolicitudnomiBean.setSolicitudHoraExtras(estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi().getSolicitudHoraExtras());
			this.estadosolicitudnomiBean.setSolicitudVacacions(estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi().getSolicitudVacacions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudReemplazo.class)) {
					estadosolicitudnomi.setSolicitudReemplazos(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoLogic.getSolicitudReemplazos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudHoraExtra.class)) {
					estadosolicitudnomi.setSolicitudHoraExtras(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraLogic.getSolicitudHoraExtras());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(SolicitudVacacion.class)) {
					estadosolicitudnomi.setSolicitudVacacions(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionLogic.getSolicitudVacacions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadosolicitudnomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi = new EstadoSolicitudNomiDetalleFormJInternalFrame(jDesktopPane,this.estadosolicitudnomiSessionBean.getConGuardarRelaciones(),this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.setVisible(false);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.estadosolicitudnomiLogic=this.estadosolicitudnomiLogic;
		
		this.cargarCombosFrameForeignKeyEstadoSolicitudNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoSolicitudNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoSolicitudNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoSolicitudNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoSolicitudNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoSolicitudNomi"));
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"ModificarEstadoSolicitudNomi"));

		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarToolBarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoSolicitudNomi"));
					
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemModificarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoSolicitudNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"ActualizarEstadoSolicitudNomi"));
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarToolBarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoSolicitudNomi"));
						
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemActualizarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoSolicitudNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"EliminarEstadoSolicitudNomi"));
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoSolicitudNomi"));
								
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemEliminarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoSolicitudNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CancelarEstadoSolicitudNomi"));
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoSolicitudNomi"));
					
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemCancelarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoSolicitudNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemDetalleCerrarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoSolicitudNomi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoSolicitudNomi"));
		
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoSolicitudNomi"));
		
		
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoSolicitudNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonidEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoSolicitudNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtoncodigoEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoSolicitudNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonnombreEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoSolicitudNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoSolicitudNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoSolicitudNomi"));
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoSolicitudNomi"));
		}
		
		this.jTableDatosEstadoSolicitudNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoSolicitudNomi"));
		
		this.jTableDatosEstadoSolicitudNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoSolicitudNomi"));
		
		this.jButtonNuevoEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"NuevoEstadoSolicitudNomi"));
		
		this.jButtonDuplicarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"DuplicarEstadoSolicitudNomi"));
		
		this.jButtonCopiarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"CopiarEstadoSolicitudNomi"));
		
		this.jButtonVerFormEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"VerFormEstadoSolicitudNomi"));
		
		
		this.jButtonNuevoToolBarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoSolicitudNomi"));
			
		this.jButtonDuplicarToolBarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoSolicitudNomi"));
			
		this.jMenuItemNuevoEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoSolicitudNomi"));
			
		this.jMenuItemDuplicarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoSolicitudNomi"));		
		
		
		this.jButtonNuevoRelacionesEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoSolicitudNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoSolicitudNomi"));
			
		this.jMenuItemNuevoRelacionesEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoSolicitudNomi"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"ModificarEstadoSolicitudNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonModificarToolBarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoSolicitudNomi"));
			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemModificarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoSolicitudNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"ActualizarEstadoSolicitudNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonActualizarToolBarEstadoSolicitudNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoSolicitudNomi"));
				
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemActualizarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoSolicitudNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"EliminarEstadoSolicitudNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonEliminarToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoSolicitudNomi"));
						
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemEliminarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoSolicitudNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CancelarEstadoSolicitudNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonCancelarToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoSolicitudNomi"));
			
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemCancelarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoSolicitudNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoSolicitudNomi"));		
		
		
		this.jButtonCerrarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CerrarEstadoSolicitudNomi"));
		
		
		this.jButtonCerrarToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoSolicitudNomi"));
			
		this.jMenuItemCerrarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoSolicitudNomi"));
			
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jMenuItemDetalleCerrarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoSolicitudNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoSolicitudNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoSolicitudNomi"));
		}
		
		this.jButtonCopiarToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoSolicitudNomi"));
			
		this.jButtonVerFormToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoSolicitudNomi"));
		
		this.jMenuItemGuardarCambiosEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoSolicitudNomi"));
			
		this.jMenuItemCopiarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoSolicitudNomi"));		
		
		this.jMenuItemVerFormEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoSolicitudNomi"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoSolicitudNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoSolicitudNomi"));
			
		this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoSolicitudNomi"));		
		
		
		
		this.jButtonRecargarInformacionEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoSolicitudNomi"));
					
		this.jButtonRecargarInformacionToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoSolicitudNomi"));
		
		this.jMenuItemRecargarInformacionEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoSolicitudNomi"));		
		
		
		
		this.jButtonAnterioresEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"AnterioresEstadoSolicitudNomi"));
		
		
		this.jButtonAnterioresToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoSolicitudNomi"));
		
		this.jMenuItemAnterioresEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoSolicitudNomi"));		
		
		
		this.jButtonSiguientesEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"SiguientesEstadoSolicitudNomi"));
		
		
		this.jButtonSiguientesToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoSolicitudNomi"));
			
		this.jMenuItemSiguientesEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoSolicitudNomi"));
			
		this.jMenuItemAbrirOrderByEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoSolicitudNomi"));
			
		this.jMenuItemMostrarOcultarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoSolicitudNomi"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoSolicitudNomi"));
			
		this.jMenuItemDetalleMostarOcultarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoSolicitudNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoSolicitudNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoSolicitudNomi"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoSolicitudNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoSolicitudNomi"));

		this.jCheckBoxSeleccionadosEstadoSolicitudNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoSolicitudNomi"));
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoSolicitudNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoSolicitudNomi"));
			
		this.jComboBoxTiposAccionesEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoSolicitudNomi"));
					
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoSolicitudNomi"));
			
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoSolicitudNomi"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonidEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoSolicitudNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtoncodigoEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoSolicitudNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonnombreEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoSolicitudNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoSolicitudNomi!=null) {
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoSolicitudNomi"));
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoSolicitudNomi"));
				this.jInternalFrameReporteDinamicoEstadoSolicitudNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoSolicitudNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoSolicitudNomi"));				
			//this.jButtonGenerarReporteDinamicoEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoSolicitudNomi"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoSolicitudNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoSolicitudNomi!=null) {
				this.jInternalFrameImportacionEstadoSolicitudNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoSolicitudNomi"));
				this.jInternalFrameImportacionEstadoSolicitudNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoSolicitudNomi"));
				this.jInternalFrameImportacionEstadoSolicitudNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoSolicitudNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoSolicitudNomi"));
			
			this.jButtonAbrirOrderByToolBarEstadoSolicitudNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoSolicitudNomi"));			
			
			if(this.jInternalFrameOrderByEstadoSolicitudNomi!=null) {
				this.jInternalFrameOrderByEstadoSolicitudNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoSolicitudNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTabbedPaneRelacionesEstadoSolicitudNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoSolicitudNomi"));
		
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
            		closingInternalFrameEstadoSolicitudNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoSolicitudNomi = (JInternalFrameBase)event.getSource();
	            	
	            EstadoSolicitudNomiBeanSwingJInternalFrame jInternalFrameParent=(EstadoSolicitudNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoSolicitudNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoSolicitudNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoSolicitudNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoSolicitudNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoSolicitudNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoSolicitudNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoSolicitudNomi";
		inputMap = this.jButtonNuevoEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoSolicitudNomi";
		inputMap = this.jButtonNuevoRelacionesEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoSolicitudNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoSolicitudNomi";
		inputMap = this.jButtonModificarEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoSolicitudNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoSolicitudNomi";
		inputMap = this.jButtonActualizarEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoSolicitudNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoSolicitudNomi";
		inputMap = this.jButtonEliminarEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoSolicitudNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoSolicitudNomi";
		inputMap = this.jButtonCancelarEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoSolicitudNomi";
		inputMap = this.jButtonCerrarEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoSolicitudNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoSolicitudNomi";
		inputMap = this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonGuardarCambiosEstadoSolicitudNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoSolicitudNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoSolicitudNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoSolicitudNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoSolicitudNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoSolicitudNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoSolicitudNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoSolicitudNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonidEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoSolicitudNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtoncodigoEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoSolicitudNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jButtonnombreEstadoSolicitudNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoSolicitudNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoSolicitudNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoSolicitudNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoSolicitudNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoSolicitudNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoSolicitudNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
					estadosolicitudnomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomis) {
					estadosolicitudnomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoSolicitudNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoSolicitudNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
						estadosolicitudnomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomis) {
						estadosolicitudnomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoSolicitudNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoSolicitudNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoSolicitudNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoSolicitudNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoSolicitudNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoSolicitudNomi.getSelectedRows();
			
			EstadoSolicitudNomi estadosolicitudnomiLocal=new EstadoSolicitudNomi();
			
			//this.seleccionarTodosEstadoSolicitudNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadosolicitudnomiLocal =(EstadoSolicitudNomi) this.estadosolicitudnomiLogic.getEstadoSolicitudNomis().toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadosolicitudnomiLocal =(EstadoSolicitudNomi) this.estadosolicitudnomis.toArray()[this.jTableDatosEstadoSolicitudNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadosolicitudnomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
						estadosolicitudnomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomis) {
						estadosolicitudnomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoSolicitudNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoSolicitudNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoSolicitudNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoSolicitudNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoSolicitudNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoSolicitudNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoSolicitudNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoSolicitudNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
				
						if(sTipoSeleccionar.equals(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadosolicitudnomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadosolicitudnomiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomis) {
					
						if(sTipoSeleccionar.equals(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadosolicitudnomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadosolicitudnomiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoSolicitudNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoSolicitudNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoSolicitudNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoSolicitudNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoSolicitudNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoSolicitudNomi(conSplash);
				
					this.generarReporteEstadoSolicitudNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoSolicitudNomisSeleccionados();
				//this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoSolicitudNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoSolicitudNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoSolicitudNomi();
				
				this.exportarEstadoSolicitudNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoSolicitudNomis();
				//this.importarEstadoSolicitudNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoSolicitudNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoSolicitudNomisSeleccionados();
				//this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Solicitud", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoSolicitudNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoSolicitudNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoSolicitudNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoSolicitudNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoSolicitudNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoSolicitudNomi(conSplash);
					
						//this.actualizarParametrosGeneralEstadoSolicitudNomi();
						
						this.generarReporteProcesoAccionEstadoSolicitudNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado SolicitudS SELECCIONADOS?", "MANTENIMIENTO DE Estado Solicitud", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoSolicitudNomi();
				
						this.actualizarParametrosGeneralEstadoSolicitudNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadosolicitudnomiReturnGeneral=estadosolicitudnomiLogic.procesarAccionEstadoSolicitudNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadosolicitudnomiLogic.getEstadoSolicitudNomis(),this.estadosolicitudnomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoSolicitudNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoSolicitudNomi();
					
					EstadoSolicitudNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoSolicitudNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoSolicitudNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoSolicitudNomi.jComboBoxTiposAccionesFormularioEstadoSolicitudNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoSolicitudNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoSolicitudNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoSolicitudNomi();
			
			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
			EstadoSolicitudNomi estadosolicitudnomi=new EstadoSolicitudNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoSolicitudNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoSolicitudNomi.getSelectedItem();
			
			
			
			
			estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadosolicitudnomisSeleccionados.size()==1) {
				for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisSeleccionados) {
					estadosolicitudnomi=estadosolicitudnomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Solicitud Reemplazo")) {
					jButtonSolicitudReemplazoActionPerformed(null,rowIndex,true,false,estadosolicitudnomi);
				}
				else if(this.sTipoRelacion.equals("Solicitud Hora Extra")) {
					jButtonSolicitudHoraExtraActionPerformed(null,rowIndex,true,false,estadosolicitudnomi);
				}
				else if(this.sTipoRelacion.equals("Solicitud Vacacion")) {
					jButtonSolicitudVacacionActionPerformed(null,rowIndex,true,false,estadosolicitudnomi);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoSolicitudNomi();
			
      		//this.finishProcessEstadoSolicitudNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoSolicitudNomiReturnGeneral() throws Exception {
		if(this.estadosolicitudnomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadosolicitudnomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadosolicitudnomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadosolicitudnomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadosolicitudnomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadosolicitudnomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoSolicitudNomi(false);
		}
		
		if(this.estadosolicitudnomiReturnGeneral.getConRetornoLista() || this.estadosolicitudnomiReturnGeneral.getConRetornoObjeto()) {
			if(this.estadosolicitudnomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadosolicitudnomiLogic.setEstadoSolicitudNomis(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadosolicitudnomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadosolicitudnomiLogic.setEstadoSolicitudNomi(this.estadosolicitudnomiReturnGeneral.getEstadoSolicitudNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoSolicitudNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoSolicitudNomi() throws Exception {
		
		
	}
	
	public ArrayList<EstadoSolicitudNomi> getEstadoSolicitudNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoSolicitudNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomiLogic.getEstadoSolicitudNomis()) {
					if(estadosolicitudnomiAux.getIsSelected()) {
						estadosolicitudnomisSeleccionados.add(estadosolicitudnomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoSolicitudNomi estadosolicitudnomiAux:this.estadosolicitudnomis) {
					if(estadosolicitudnomiAux.getIsSelected()) {
						estadosolicitudnomisSeleccionados.add(estadosolicitudnomiAux);				
					}
				}
			}
			
			if(estadosolicitudnomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadosolicitudnomisSeleccionados.addAll(this.estadosolicitudnomiLogic.getEstadoSolicitudNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadosolicitudnomisSeleccionados.addAll(this.estadosolicitudnomis);				
					}
				}
			}
		} else {
			estadosolicitudnomisSeleccionados.add(this.estadosolicitudnomi);
		}
		
		return estadosolicitudnomisSeleccionados;
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
	
	public void generarReporteEstadoSolicitudNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoSolicitudNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoSolicitudNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoSolicitudNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoSolicitudNomisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoSolicitudNomisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Solicitud",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoSolicitudNomisSeleccionados() throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomisSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoSolicitudNomisSeleccionados() throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoSolicitudNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoSolicitudNomisSeleccionados() throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoSolicitudNomi();
		
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoSolicitudNomi();
		
		
		//this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomisSeleccionados ,estadosolicitudnomiImplementable,estadosolicitudnomiImplementableHome);
	}
	
	public void mostrarImportacionEstadoSolicitudNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoSolicitudNomi();
		
		this.abrirFrameImportacionEstadoSolicitudNomi();		
		
			
		//this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomisSeleccionados ,estadosolicitudnomiImplementable,estadosolicitudnomiImplementableHome);
	}
	
	public void importarEstadoSolicitudNomis() throws Exception {		
	
	}
	
	public void exportarEstadoSolicitudNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoSolicitudNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoSolicitudNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoSolicitudNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Solicitud",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoSolicitudNomisSeleccionados() throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosolicitudnomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoSolicitudNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoSolicitudNomi(estadosolicitudnomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadosolicitudnomiAux.setsDetalleGeneralEntityReporte(estadosolicitudnomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoSolicitudNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoSolicitudNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoSolicitudNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadosolicitudnomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosolicitudnomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosolicitudnomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadosolicitudnomi.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoSolicitudNomisSeleccionados() throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosolicitudnomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoSolicitudNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoSolicitudNomi(row);				
				iRow++;
			}				
			
			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoSolicitudNomi(estadosolicitudnomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoSolicitudNomisSeleccionados() throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();		
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadosolicitudnomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadosolicitudnomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadosolicitudnomi");
			//elementRoot.appendChild(element);
		
			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisSeleccionados) {
				element = document.createElement("estadosolicitudnomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoSolicitudNomi(estadosolicitudnomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Solicitud",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoSolicitudNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadosolicitudnomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosolicitudnomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadosolicitudnomi.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoSolicitudNomi(EstadoSolicitudNomi estadosolicitudnomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoSolicitudNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadosolicitudnomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoSolicitudNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadosolicitudnomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoSolicitudNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadosolicitudnomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoSolicitudNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadosolicitudnomi.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoSolicitudNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados=new ArrayList<EstadoSolicitudNomi>();
		
		estadosolicitudnomisSeleccionados=this.getEstadoSolicitudNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoSolicitudNomi(estadosolicitudnomisSeleccionados);
		
		this.generarReporteEstadoSolicitudNomis("Todos",estadosolicitudnomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoSolicitudNomi(ArrayList<EstadoSolicitudNomi> estadosolicitudnomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoSolicitudNomi estadosolicitudnomiAux:estadosolicitudnomisSeleccionados) {
				estadosolicitudnomiAux.setsDetalleGeneralEntityReporte(estadosolicitudnomiAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoSolicitudNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadosolicitudnomiAux.setsDescripcionGeneralEntityReporte1(estadosolicitudnomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoSolicitudNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadosolicitudnomiAux.setsDescripcionGeneralEntityReporte1(estadosolicitudnomiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoSolicitudNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoSolicitudNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaModificarEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaCancelarEstadoSolicitudNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoSolicitudNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoSolicitudNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=true;
		} else {
			this.actualizarEstadoPanelsEstadoSolicitudNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoSolicitudNomi=false;
			//this.isVisibilidadCeldaVerFormEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaDuplicarEstadoSolicitudNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
			if(!estadosolicitudnomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;												
			}
			
			this.jButtonCerrarEstadoSolicitudNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoSolicitudNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.estadosolicitudnomi)) {
			this.isVisibilidadCeldaActualizarEstadoSolicitudNomi=false;
			this.isVisibilidadCeldaEliminarEstadoSolicitudNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoSolicitudNomi() {
		this.isVisibilidadCeldaNuevoEstadoSolicitudNomi=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoSolicitudNomi=false;
	}
	
	public void actualizarEstadoPanelsEstadoSolicitudNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoSolicitudNomi!=null) {
				this.jPanelPaginacionEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoSolicitudNomi!=null) {
				this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEstadoSolicitudNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoSolicitudNomi!=null) {
				this.jPanelPaginacionEstadoSolicitudNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoSolicitudNomi!=null) {
				this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEstadoSolicitudNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoSolicitudNomi!=null) {
				this.jPanelPaginacionEstadoSolicitudNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoSolicitudNomi!=null) {
				this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEstadoSolicitudNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoSolicitudNomi!=null) {
				this.jPanelPaginacionEstadoSolicitudNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoSolicitudNomi!=null) {
				this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoSolicitudNomi!=null) {
				this.jPanelPaginacionEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoSolicitudNomi!=null) {
				this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoSolicitudNomi!=null) {
				this.jPanelPaginacionEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoSolicitudNomi!=null) {
				this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEdicionEstadoSolicitudNomi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoSolicitudNomi!=null) {
				this.jScrollPanelDatosEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoSolicitudNomi!=null) {
				this.jPanelPaginacionEstadoSolicitudNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoSolicitudNomi!=null) {
				this.jPanelParametrosReportesEstadoSolicitudNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadosolicitudnomiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoSolicitudNomiParaSolicitudReemplazos() throws Exception {
		Boolean isPaginaPopupSolicitudReemplazo=false;

		try {

			if(this.estadosolicitudnomiSessionBean==null) {
				this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean.setsPathNavegacionActual(estadosolicitudnomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SolicitudReemplazoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSolicitudReemplazo=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSolicitudReemplazo(true);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSolicitudReemplazo(EstadoSolicitudNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi(true);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudreemplazoSessionBean.setlidEstadoSolicitudNomiActual(this.idEstadoSolicitudNomiActual);

			estadosolicitudnomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoSolicitudNomi(true);
			estadosolicitudnomiSessionBean.setlIdEstadoSolicitudNomiActualForeignKey(this.idEstadoSolicitudNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoSolicitudNomiParaSolicitudHoraExtras() throws Exception {
		Boolean isPaginaPopupSolicitudHoraExtra=false;

		try {

			if(this.estadosolicitudnomiSessionBean==null) {
				this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean.setsPathNavegacionActual(estadosolicitudnomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SolicitudHoraExtraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSolicitudHoraExtra=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSolicitudHoraExtra(true);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSolicitudHoraExtra(EstadoSolicitudNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi(true);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudhoraextraSessionBean.setlidEstadoSolicitudNomiActual(this.idEstadoSolicitudNomiActual);

			estadosolicitudnomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoSolicitudNomi(true);
			estadosolicitudnomiSessionBean.setlIdEstadoSolicitudNomiActualForeignKey(this.idEstadoSolicitudNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoSolicitudNomiParaSolicitudVacaciones() throws Exception {
		Boolean isPaginaPopupSolicitudVacacion=false;

		try {

			if(this.estadosolicitudnomiSessionBean==null) {
				this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean.setsPathNavegacionActual(estadosolicitudnomiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SolicitudVacacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSolicitudVacacion=this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSolicitudVacacion(true);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSolicitudVacacion(EstadoSolicitudNomiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoSolicitudNomi(true);
			this.jInternalFrameDetalleFormEstadoSolicitudNomi.solicitudvacacionSessionBean.setlidEstadoSolicitudNomiActual(this.idEstadoSolicitudNomiActual);

			estadosolicitudnomiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoSolicitudNomi(true);
			estadosolicitudnomiSessionBean.setlIdEstadoSolicitudNomiActualForeignKey(this.idEstadoSolicitudNomiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
		
		if(this.estadosolicitudnomiSessionBean==null) {
			this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
		}
		
		this.estadosolicitudnomiSessionBean.setsUltimaBusquedaEstadoSolicitudNomi(this.getsAccionBusqueda());
		this.estadosolicitudnomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadosolicitudnomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoSolicitudNomiSessionBean estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
		
		if(this.estadosolicitudnomiSessionBean==null) {
			this.estadosolicitudnomiSessionBean=new EstadoSolicitudNomiSessionBean();
		}
		
		if(this.estadosolicitudnomiSessionBean.getsUltimaBusquedaEstadoSolicitudNomi()!=null&&!this.estadosolicitudnomiSessionBean.getsUltimaBusquedaEstadoSolicitudNomi().equals("")) {
			this.setsAccionBusqueda(estadosolicitudnomiSessionBean.getsUltimaBusquedaEstadoSolicitudNomi());
			this.setiNumeroPaginacion(estadosolicitudnomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadosolicitudnomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadosolicitudnomiSessionBean.setsUltimaBusquedaEstadoSolicitudNomi("");
		this.estadosolicitudnomiSessionBean.setiNumeroPaginacion(EstadoSolicitudNomiConstantesFunciones.INUMEROPAGINACION);
		this.estadosolicitudnomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoSolicitudNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoSolicitudNomi() {
		this.updateBorderResaltarBusquedasFormularioEstadoSolicitudNomi();
		this.updateVisibilidadBusquedasFormularioEstadoSolicitudNomi();
		this.updateHabilitarBusquedasFormularioEstadoSolicitudNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoSolicitudNomi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoSolicitudNomi() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoSolicitudNomi() {
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
	
	public void updateControlesFormularioEstadoSolicitudNomi() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoSolicitudNomi();
		this.updateVisibilidadResaltarControlesFormularioEstadoSolicitudNomi();
		this.updateHabilitarResaltarControlesFormularioEstadoSolicitudNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoSolicitudNomi() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadosolicitudnomiConstantesFunciones.resaltaridEstadoSolicitudNomi!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.setBorder(this.estadosolicitudnomiConstantesFunciones.resaltaridEstadoSolicitudNomi);}
		if(this.estadosolicitudnomiConstantesFunciones.resaltarcodigoEstadoSolicitudNomi!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.setBorder(this.estadosolicitudnomiConstantesFunciones.resaltarcodigoEstadoSolicitudNomi);}
		if(this.estadosolicitudnomiConstantesFunciones.resaltarnombreEstadoSolicitudNomi!=null && this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.setBorder(this.estadosolicitudnomiConstantesFunciones.resaltarnombreEstadoSolicitudNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoSolicitudNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
	
		//this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.setVisible(this.estadosolicitudnomiConstantesFunciones.mostraridEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jPanelidEstadoSolicitudNomi.setVisible(this.estadosolicitudnomiConstantesFunciones.mostraridEstadoSolicitudNomi);
		//this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.setVisible(this.estadosolicitudnomiConstantesFunciones.mostrarcodigoEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jPanelcodigoEstadoSolicitudNomi.setVisible(this.estadosolicitudnomiConstantesFunciones.mostrarcodigoEstadoSolicitudNomi);
		//this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.setVisible(this.estadosolicitudnomiConstantesFunciones.mostrarnombreEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jPanelnombreEstadoSolicitudNomi.setVisible(this.estadosolicitudnomiConstantesFunciones.mostrarnombreEstadoSolicitudNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoSolicitudNomi() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoSolicitudNomi!=null) {
	
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldidEstadoSolicitudNomi.setEnabled(this.estadosolicitudnomiConstantesFunciones.activaridEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextFieldcodigoEstadoSolicitudNomi.setEnabled(this.estadosolicitudnomiConstantesFunciones.activarcodigoEstadoSolicitudNomi);
		this.jInternalFrameDetalleFormEstadoSolicitudNomi.jTextAreanombreEstadoSolicitudNomi.setEnabled(this.estadosolicitudnomiConstantesFunciones.activarnombreEstadoSolicitudNomi);
		}
	}
	
		
}