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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.EstadoDepreActiConstantesFunciones;
import com.bydan.erp.activosfijos.util.EstadoDepreActiParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.EstadoDepreActiParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.EstadoDepreActiBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class EstadoDepreActiBeanSwingJInternalFrame extends EstadoDepreActiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDepreActiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDepreActi> estadodepreactiValidator = new ClassValidator<EstadoDepreActi>(EstadoDepreActi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDepreActi estadodepreacti;	
	public EstadoDepreActi estadodepreactiAux;
	public EstadoDepreActi estadodepreactiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDepreActi estadodepreactiTotales;
	public Long idEstadoDepreActiActual;
	public Long iIdNuevoEstadoDepreActi=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDepreciacionActivoFijo=false;

	public Boolean getIsTienePermisosDepreciacionActivoFijo() {
		return isTienePermisosDepreciacionActivoFijo;
	}

	public void setIsTienePermisosDepreciacionActivoFijo(Boolean isTienePermisosDepreciacionActivoFijo) {
		this.isTienePermisosDepreciacionActivoFijo= isTienePermisosDepreciacionActivoFijo;
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
	
	public Boolean isPermisoTodoEstadoDepreActi;
	public Boolean isPermisoNuevoEstadoDepreActi;
	public Boolean isPermisoActualizarEstadoDepreActi;
	public Boolean isPermisoActualizarOriginalEstadoDepreActi;
	public Boolean isPermisoEliminarEstadoDepreActi;
	public Boolean isPermisoGuardarCambiosEstadoDepreActi;
	public Boolean isPermisoConsultaEstadoDepreActi;
	public Boolean isPermisoBusquedaEstadoDepreActi;
	public Boolean isPermisoReporteEstadoDepreActi;
	public Boolean isPermisoPaginacionMedioEstadoDepreActi;
	public Boolean isPermisoPaginacionAltoEstadoDepreActi;
	public Boolean isPermisoPaginacionTodoEstadoDepreActi;
	public Boolean isPermisoCopiarEstadoDepreActi;
	public Boolean isPermisoVerFormEstadoDepreActi;
	public Boolean isPermisoDuplicarEstadoDepreActi;
	public Boolean isPermisoOrdenEstadoDepreActi;
	
	
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
	
	public EstadoDepreActiParameterReturnGeneral estadodepreactiReturnGeneral;
	public EstadoDepreActiParameterReturnGeneral estadodepreactiParameterGeneral;
	
	

	public DepreciacionActivoFijoLogic depreciacionactivofijoLogic=null;

	public DepreciacionActivoFijoLogic getDepreciacionActivoFijoLogic() {
		return depreciacionactivofijoLogic;
	}

	public void setDepreciacionActivoFijoLogic(DepreciacionActivoFijoLogic depreciacionactivofijoLogic) {
		this.depreciacionactivofijoLogic = depreciacionactivofijoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDepreActi=false;
	public Boolean esParaAccionDesdeFormularioEstadoDepreActi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoDepreActiSessionBeanAdditional estadodepreactiSessionBeanAdditional=null;
	
	public EstadoDepreActiSessionBeanAdditional getEstadoDepreActiSessionBeanAdditional() {
		return this.estadodepreactiSessionBeanAdditional;
	}
	
	public void setEstadoDepreActiSessionBeanAdditional(EstadoDepreActiSessionBeanAdditional estadodepreactiSessionBeanAdditional) {
		try {
			this.estadodepreactiSessionBeanAdditional=estadodepreactiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoDepreActiBeanSwingJInternalFrameAdditional estadodepreactiBeanSwingJInternalFrameAdditional=null;
	//public class EstadoDepreActiBeanSwingJInternalFrame
	
	public EstadoDepreActiBeanSwingJInternalFrameAdditional getEstadoDepreActiBeanSwingJInternalFrameAdditional() {
		return this.estadodepreactiBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoDepreActiBeanSwingJInternalFrameAdditional(EstadoDepreActiBeanSwingJInternalFrameAdditional estadodepreactiBeanSwingJInternalFrameAdditional) {
		try {
			this.estadodepreactiBeanSwingJInternalFrameAdditional=estadodepreactiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDepreActiLogic estadodepreactiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDepreActi estadodepreactiBean;
	public EstadoDepreActiConstantesFunciones estadodepreactiConstantesFunciones;
	//public EstadoDepreActiParameterReturnGeneral estadodepreactiReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDepreActi> estadodepreactis;	
	//public List<EstadoDepreActi> estadodepreactisEliminados;
	//public List<EstadoDepreActi> estadodepreactisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDepreActi=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDepreActi=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDepreActi=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDepreActi=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDepreActi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
	public Boolean isVisibilidadCeldaModificarEstadoDepreActi=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDepreActi=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDepreActi=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDepreActi=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDepreActi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;	
	
	
	
	public Long getiIdNuevoEstadoDepreActi() {
		return this.iIdNuevoEstadoDepreActi;
	}

	public void setiIdNuevoEstadoDepreActi(Long iIdNuevoEstadoDepreActi) {
		this.iIdNuevoEstadoDepreActi = iIdNuevoEstadoDepreActi;
	}
	
	public Long getidEstadoDepreActiActual() {
		return this.idEstadoDepreActiActual;
	}

	public void setidEstadoDepreActiActual(Long idEstadoDepreActiActual) {
		this.idEstadoDepreActiActual = idEstadoDepreActiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDepreActi getestadodepreacti() {
		return this.estadodepreacti;
	}

	public void setestadodepreacti(EstadoDepreActi estadodepreacti) {
		this.estadodepreacti = estadodepreacti;
	}
	
	public EstadoDepreActi getestadodepreactiAux() {
		return this.estadodepreactiAux;
	}

	public void setestadodepreactiAux(EstadoDepreActi estadodepreactiAux) {
		this.estadodepreactiAux = estadodepreactiAux;
	}				
	
	public EstadoDepreActi getestadodepreactiAnterior() {
		return this.estadodepreactiAnterior;
	}

	public void setestadodepreactiAnterior(EstadoDepreActi estadodepreactiAnterior) {
		this.estadodepreactiAnterior = estadodepreactiAnterior;
	}	
	
	public EstadoDepreActi getestadodepreactiTotales() {
		return this.estadodepreactiTotales;
	}

	public void setestadodepreactiTotales(EstadoDepreActi estadodepreactiTotales) {
		this.estadodepreactiTotales = estadodepreactiTotales;
	}	
	
	public EstadoDepreActi getestadodepreactiBean() {
		return this.estadodepreactiBean;
	}

	public void setestadodepreactiBean(EstadoDepreActi estadodepreactiBean) {
		this.estadodepreactiBean = estadodepreactiBean;
	}	
	
	public EstadoDepreActiParameterReturnGeneral getestadodepreactiReturnGeneral() {
		return this.estadodepreactiReturnGeneral;
	}

	public void setestadodepreactiReturnGeneral(EstadoDepreActiParameterReturnGeneral estadodepreactiReturnGeneral) {
		this.estadodepreactiReturnGeneral = estadodepreactiReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDepreActiLogic getEstadoDepreActiLogic()	{		
		return estadodepreactiLogic;
	}

	public void setEstadoDepreActiLogic(EstadoDepreActiLogic estadodepreactiLogic) {
		this.estadodepreactiLogic = estadodepreactiLogic;
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
	
	public Boolean getIsEsNuevoEstadoDepreActi() {
		return isEsNuevoEstadoDepreActi;
	}

	public void setIsEsNuevoEstadoDepreActi(Boolean isEsNuevoEstadoDepreActi) {
		this.isEsNuevoEstadoDepreActi = isEsNuevoEstadoDepreActi;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDepreActi() {
		return esParaAccionDesdeFormularioEstadoDepreActi;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDepreActi(Boolean esParaAccionDesdeFormularioEstadoDepreActi) {
		this.esParaAccionDesdeFormularioEstadoDepreActi = esParaAccionDesdeFormularioEstadoDepreActi;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDepreActi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDepreActiConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDepreActi(this.estadodepreactiLogic.getEstadoDepreActis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDepreActiConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDepreActi(this.estadodepreactis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodepreactiLogic.setEstadoDepreActis(this.estadodepreactis);
			estadodepreactiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDepreActiParameterReturnGeneral getEstadoDepreActiParameterGeneral() {
		return this.estadodepreactiParameterGeneral;
	}
	
	public void setEstadoDepreActiParameterGeneral(EstadoDepreActiParameterReturnGeneral estadodepreactiParameterGeneral) {
		this.estadodepreactiParameterGeneral = estadodepreactiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDepreActi() {
		return isPermisoTodoEstadoDepreActi;
	}

	public void setIsPermisoTodoEstadoDepreActi(Boolean isPermisoTodoEstadoDepreActi) {
		this.isPermisoTodoEstadoDepreActi = isPermisoTodoEstadoDepreActi;
	}

	public Boolean getIsPermisoNuevoEstadoDepreActi() {
		return isPermisoNuevoEstadoDepreActi;
	}

	public void setIsPermisoNuevoEstadoDepreActi(Boolean isPermisoNuevoEstadoDepreActi) {
		this.isPermisoNuevoEstadoDepreActi = isPermisoNuevoEstadoDepreActi;
	}

	public Boolean getIsPermisoActualizarEstadoDepreActi() {
		return isPermisoActualizarEstadoDepreActi;
	}

	public void setIsPermisoActualizarEstadoDepreActi(Boolean isPermisoActualizarEstadoDepreActi) {
		this.isPermisoActualizarEstadoDepreActi = isPermisoActualizarEstadoDepreActi;
	}

	public Boolean getIsPermisoEliminarEstadoDepreActi() {
		return isPermisoEliminarEstadoDepreActi;
	}

	public void setIsPermisoEliminarEstadoDepreActi(Boolean isPermisoEliminarEstadoDepreActi) {
		this.isPermisoEliminarEstadoDepreActi = isPermisoEliminarEstadoDepreActi;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDepreActi() {
		return isPermisoGuardarCambiosEstadoDepreActi;
	}

	public void setIsPermisoGuardarCambiosEstadoDepreActi(Boolean isPermisoGuardarCambiosEstadoDepreActi) {
		this.isPermisoGuardarCambiosEstadoDepreActi = isPermisoGuardarCambiosEstadoDepreActi;
	}
	
	public Boolean getIsPermisoConsultaEstadoDepreActi() {
		return isPermisoConsultaEstadoDepreActi;
	}

	public void setIsPermisoConsultaEstadoDepreActi(Boolean isPermisoConsultaEstadoDepreActi) {
		this.isPermisoConsultaEstadoDepreActi = isPermisoConsultaEstadoDepreActi;
	}

	public Boolean getIsPermisoBusquedaEstadoDepreActi() {
		return isPermisoBusquedaEstadoDepreActi;
	}

	public void setIsPermisoBusquedaEstadoDepreActi(Boolean isPermisoBusquedaEstadoDepreActi) {
		this.isPermisoBusquedaEstadoDepreActi = isPermisoBusquedaEstadoDepreActi;
	}

	public Boolean getIsPermisoReporteEstadoDepreActi() {
		return isPermisoReporteEstadoDepreActi;
	}

	public void setIsPermisoReporteEstadoDepreActi(Boolean isPermisoReporteEstadoDepreActi) {
		this.isPermisoReporteEstadoDepreActi = isPermisoReporteEstadoDepreActi;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDepreActi() {
		return isPermisoPaginacionMedioEstadoDepreActi;
	}

	public void setIsPermisoPaginacionMedioEstadoDepreActi(Boolean isPermisoPaginacionMedioEstadoDepreActi) {
		this.isPermisoPaginacionMedioEstadoDepreActi = isPermisoPaginacionMedioEstadoDepreActi;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDepreActi() {
		return isPermisoPaginacionTodoEstadoDepreActi;
	}

	public void setIsPermisoPaginacionTodoEstadoDepreActi(Boolean isPermisoPaginacionTodoEstadoDepreActi) {
		this.isPermisoPaginacionTodoEstadoDepreActi = isPermisoPaginacionTodoEstadoDepreActi;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDepreActi() {
		return isPermisoPaginacionAltoEstadoDepreActi;
	}

	public void setIsPermisoPaginacionAltoEstadoDepreActi(Boolean isPermisoPaginacionAltoEstadoDepreActi) {
		this.isPermisoPaginacionAltoEstadoDepreActi = isPermisoPaginacionAltoEstadoDepreActi;
	}
	
	public Boolean getIsPermisoCopiarEstadoDepreActi() {
		return isPermisoCopiarEstadoDepreActi;
	}

	public void setIsPermisoCopiarEstadoDepreActi(Boolean isPermisoCopiarEstadoDepreActi) {
		this.isPermisoCopiarEstadoDepreActi = isPermisoCopiarEstadoDepreActi;
	}
	
	public Boolean getIsPermisoVerFormEstadoDepreActi() {
		return isPermisoVerFormEstadoDepreActi;
	}

	public void setIsPermisoVerFormEstadoDepreActi(Boolean isPermisoVerFormEstadoDepreActi) {
		this.isPermisoVerFormEstadoDepreActi = isPermisoVerFormEstadoDepreActi;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDepreActi() {
		return isPermisoDuplicarEstadoDepreActi;
	}

	public void setIsPermisoDuplicarEstadoDepreActi(Boolean isPermisoDuplicarEstadoDepreActi) {
		this.isPermisoDuplicarEstadoDepreActi = isPermisoDuplicarEstadoDepreActi;
	}
	
	public Boolean getIsPermisoOrdenEstadoDepreActi() {
		return isPermisoOrdenEstadoDepreActi;
	}

	public void setIsPermisoOrdenEstadoDepreActi(Boolean isPermisoOrdenEstadoDepreActi) {
		this.isPermisoOrdenEstadoDepreActi = isPermisoOrdenEstadoDepreActi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDepreActi() {
		return isVisibilidadCeldaNuevoEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDepreActi(Boolean isVisibilidadCeldaNuevoEstadoDepreActi) {
		this.isVisibilidadCeldaNuevoEstadoDepreActi = isVisibilidadCeldaNuevoEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDepreActi() {
		return isVisibilidadCeldaDuplicarEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDepreActi(Boolean isVisibilidadCeldaDuplicarEstadoDepreActi) {
		this.isVisibilidadCeldaDuplicarEstadoDepreActi = isVisibilidadCeldaDuplicarEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDepreActi() {
		return isVisibilidadCeldaCopiarEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDepreActi(Boolean isVisibilidadCeldaCopiarEstadoDepreActi) {
		this.isVisibilidadCeldaCopiarEstadoDepreActi = isVisibilidadCeldaCopiarEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDepreActi() {
		return isVisibilidadCeldaVerFormEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDepreActi(Boolean isVisibilidadCeldaVerFormEstadoDepreActi) {
		this.isVisibilidadCeldaVerFormEstadoDepreActi = isVisibilidadCeldaVerFormEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDepreActi() {
		return isVisibilidadCeldaOrdenEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDepreActi(Boolean isVisibilidadCeldaOrdenEstadoDepreActi) {
		this.isVisibilidadCeldaOrdenEstadoDepreActi = isVisibilidadCeldaOrdenEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDepreActi() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDepreActi(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDepreActi) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi = isVisibilidadCeldaNuevoRelacionesEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDepreActi() {
		return isVisibilidadCeldaModificarEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaModificarEstadoDepreActi(Boolean isVisibilidadCeldaModificarEstadoDepreActi) {
		this.isVisibilidadCeldaModificarEstadoDepreActi = isVisibilidadCeldaModificarEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDepreActi() {
		return isVisibilidadCeldaActualizarEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDepreActi(Boolean isVisibilidadCeldaActualizarEstadoDepreActi) {
		this.isVisibilidadCeldaActualizarEstadoDepreActi = isVisibilidadCeldaActualizarEstadoDepreActi;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDepreActi() {
		return isVisibilidadCeldaEliminarEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDepreActi(Boolean isVisibilidadCeldaEliminarEstadoDepreActi) {
		this.isVisibilidadCeldaEliminarEstadoDepreActi = isVisibilidadCeldaEliminarEstadoDepreActi;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDepreActi() {
		return isVisibilidadCeldaCancelarEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDepreActi(Boolean isVisibilidadCeldaCancelarEstadoDepreActi) {
		this.isVisibilidadCeldaCancelarEstadoDepreActi = isVisibilidadCeldaCancelarEstadoDepreActi;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDepreActi() {
		return isVisibilidadCeldaGuardarEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDepreActi(Boolean isVisibilidadCeldaGuardarEstadoDepreActi) {
		this.isVisibilidadCeldaGuardarEstadoDepreActi = isVisibilidadCeldaGuardarEstadoDepreActi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDepreActi() {
		return isVisibilidadCeldaGuardarCambiosEstadoDepreActi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDepreActi(Boolean isVisibilidadCeldaGuardarCambiosEstadoDepreActi) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi = isVisibilidadCeldaGuardarCambiosEstadoDepreActi;
	}
		
	public EstadoDepreActiSessionBean getestadodepreactiSessionBean() {
		return this.estadodepreactiSessionBean;
	}
	
	public void setestadodepreactiSessionBean(EstadoDepreActiSessionBean estadodepreactiSessionBean) {
		this.estadodepreactiSessionBean=estadodepreactiSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(EstadoDepreActi estadodepreacti)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDepreActi estadodepreacti,EstadoDepreActi estadodepreactiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDepreActi(estadodepreacti);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodepreactiAux.setId(estadodepreacti.getId());
		estadodepreactiAux.setVersionRow(estadodepreacti.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDepreActi();
		
			int intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodepreactiValidator.getInvalidValues(this.estadodepreacti);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodepreactiLogic.setDatosCliente(datosCliente);
			estadodepreactiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodepreactiAux=new  EstadoDepreActi();
				
				estadodepreactiAux.setIsNew(true);
				estadodepreactiAux.setIsChanged(true);
				
				estadodepreactiAux.setEstadoDepreActiOriginal(this.estadodepreacti);
				
				estadodepreactiAux.setId(this.estadodepreacti.getId());	
				estadodepreactiAux.setVersionRow(this.estadodepreacti.getVersionRow());	
				estadodepreactiAux.setcodigo(this.estadodepreacti.getcodigo());	
				estadodepreactiAux.setnombre(this.estadodepreacti.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodepreactiAux,estadodepreactiLogic.getEstadoDepreActis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodepreactiAux,estadodepreactis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodepreactiLogic.saveEstadoDepreActis();//WithConnection
						//estadodepreactiLogic.getSetVersionRowEstadoDepreActis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodepreacti,estadodepreactiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos.addAll(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodepreactiLogic.saveEstadoDepreActiRelaciones(estadodepreactiAux,this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());//WithConnection
								//estadodepreactiLogic.getSetVersionRowEstadoDepreActis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodepreacti,estadodepreactiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos= new ArrayList<DepreciacionActivoFijo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodepreactiAux.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodepreactiAux,estadodepreactiLogic.getEstadoDepreActis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodepreactiAux,estadodepreactis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodepreacti,estadodepreactiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodepreactiAux=new  EstadoDepreActi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodepreactiSessionBean.getEsGuardarRelacionado() && this.estadodepreacti.getId()>=0)) {
						
					estadodepreactiAux.setIsNew(false);
				}
				
				estadodepreactiAux.setIsDeleted(false);
			
				estadodepreactiAux.setId(this.estadodepreacti.getId());	
				estadodepreactiAux.setVersionRow(this.estadodepreacti.getVersionRow());	
				estadodepreactiAux.setcodigo(this.estadodepreacti.getcodigo());	
				estadodepreactiAux.setnombre(this.estadodepreacti.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodepreactiAux,estadodepreactiLogic.getEstadoDepreActis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodepreactiAux,estadodepreactis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodepreactiLogic.saveEstadoDepreActis();//WithConnection
						//estadodepreactiLogic.getSetVersionRowEstadoDepreActis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodepreacti,estadodepreactiAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos.addAll(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodepreactiLogic.saveEstadoDepreActiRelaciones(estadodepreactiAux,this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());//WithConnection
								//estadodepreactiLogic.getSetVersionRowEstadoDepreActis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadodepreacti,estadodepreactiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos= new ArrayList<DepreciacionActivoFijo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodepreactiAux.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadodepreactiAux,estadodepreactiLogic.getEstadoDepreActis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadodepreactiAux,estadodepreactis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadodepreacti,estadodepreactiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodepreactiAux=new  EstadoDepreActi();
				
				estadodepreactiAux.setIsNew(false);
				estadodepreactiAux.setIsChanged(false);
				
				estadodepreactiAux.setIsDeleted(true);
				
				estadodepreactiAux.setId(this.estadodepreacti.getId());	
				estadodepreactiAux.setVersionRow(this.estadodepreacti.getVersionRow());	
				estadodepreactiAux.setcodigo(this.estadodepreacti.getcodigo());	
				estadodepreactiAux.setnombre(this.estadodepreacti.getnombre());	
				
				if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodepreactiAux.getId()>=0) {	
						this.estadodepreactisEliminados.add(estadodepreactiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodepreactiAux,estadodepreactiLogic.getEstadoDepreActis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodepreactiAux,estadodepreactis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodepreactiLogic.saveEstadoDepreActis();//WithConnection
						//estadodepreactiLogic.getSetVersionRowEstadoDepreActis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos().addAll(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos.addAll(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadodepreactiLogic.saveEstadoDepreActiRelaciones(estadodepreactiAux,this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());//WithConnection
								//estadodepreactiLogic.getSetVersionRowEstadoDepreActis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.setDepreciacionActivoFijos(new ArrayList<DepreciacionActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos= new ArrayList<DepreciacionActivoFijo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadodepreactiAux.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodepreactiAux,estadodepreactiLogic.getEstadoDepreActis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodepreactiAux,estadodepreactis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.getEstadoDepreActis().addAll(this.estadodepreactisEliminados);
					
					estadodepreactiLogic.saveEstadoDepreActis();//WithConnection
					//estadodepreactiLogic.getSetVersionRowEstadoDepreActis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodepreactisEliminados= new ArrayList<EstadoDepreActi>();		
			}
			
			if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Depre Acti GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodepreacti=estadodepreactiAux;
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
      		//this.finishProcessEstadoDepreActi();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDepreActi estadodepreactiLocal) throws Exception {
		
		if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadodepreactiLocal.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
			
			} else {
			
				estadodepreactiLocal.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDepreActi estadodepreactiLocal) throws Exception {	
		if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDepreActiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodepreactiValidator.getInvalidValues(this.estadodepreacti);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDepreActi estadodepreacti,List<EstadoDepreActi> estadodepreactis) throws Exception {
		try	{		
			EstadoDepreActiConstantesFunciones.actualizarLista(estadodepreacti,estadodepreactis,this.estadodepreactiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDepreActi estadodepreacti,List<EstadoDepreActi> estadodepreactis) throws Exception {
		try	{			
			EstadoDepreActiConstantesFunciones.actualizarSelectedLista(estadodepreacti,estadodepreactis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDepreActi> estadodepreactisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodepreactisLocal=this.estadodepreactiLogic.getEstadoDepreActis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodepreactisLocal=this.estadodepreactis;
			}
			//ARCHITECTURE
		
			for(EstadoDepreActi estadodepreactiLocal:estadodepreactisLocal) {
				if(this.permiteMantenimiento(estadodepreactiLocal) && estadodepreactiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDepreActiConstantesFunciones.getEstadoDepreActiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDepreActiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDepreActi.jLabelcodigoEstadoDepreActi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDepreActiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDepreActi.jLabelnombreEstadoDepreActi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDepreActi.jLabelcodigoEstadoDepreActi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDepreActi.jLabelnombreEstadoDepreActi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DepreciacionActivoFijo")) {
			if(this.estadodepreacti==null) {
				this.estadodepreacti= new EstadoDepreActi();
			}

			if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoDepreActi
				this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);

				this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.getdepreciacionactivofijo().setEstadoDepreActi(this.estadodepreacti);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoDepreActi--;	
		
		
		this.estadodepreactiAux=new EstadoDepreActi();
		
		this.estadodepreactiAux.setId(this.iIdNuevoEstadoDepreActi);
		this.estadodepreactiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodepreactiLogic.getEstadoDepreActis().add(this.estadodepreactiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodepreactis.add(this.estadodepreactiAux);
		}
		//ARCHITECTURE
		
		this.estadodepreacti=this.estadodepreactiAux;
		
		if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDepreActi(this.estadodepreacti);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDepreActi(this.estadodepreacti);
		}
				
		//this.setDefaultControlesEstadoDepreActi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDepreActi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDepreActi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDepreActi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDepreActi(this.estadodepreactiBean,this.estadodepreacti,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDepreActiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDepreActiConstantesFunciones.getClassesRelationshipsOfEstadoDepreActi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodepreactiReturnGeneral=estadodepreactiLogic.procesarEventosEstadoDepreActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodepreactiLogic.getEstadoDepreActis(),this.estadodepreacti,this.estadodepreactiParameterGeneral,this.isEsNuevoEstadoDepreActi,classes);//this.estadodepreactiLogic.getEstadoDepreActi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDepreActi(this.estadodepreactiReturnGeneral,this.estadodepreactiBean,false);
		
		if(this.estadodepreactiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDepreActi(this.estadodepreactiReturnGeneral.getEstadoDepreActi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDepreActi(this.estadodepreactiReturnGeneral.getEstadoDepreActi());
		}
		
		if(this.estadodepreactiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDepreActi(this.estadodepreactiReturnGeneral.getEstadoDepreActi(),classes);//this.estadodepreactiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDepreActi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDepreActi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.RecargarFormEstadoDepreActi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDepreActi(false);
						
			if(estadodepreactiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() && DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDepreciacionActivoFijoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDepreActi();
			}
			
			this.actualizarVisualTableDatosEstadoDepreActi();
			
			this.jTableDatosEstadoDepreActi.setRowSelectionInterval(this.getIndiceNuevoEstadoDepreActi(), this.getIndiceNuevoEstadoDepreActi());
			
			this.seleccionarFilaTablaEstadoDepreActiActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDepreActi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDepreActi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.setEnabled(isHabilitar && this.estadodepreactiConstantesFunciones.activarcodigoEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.setEnabled(isHabilitar && this.estadodepreactiConstantesFunciones.activarnombreEstadoDepreActi);	
		
	};
	
	public void setDefaultControlesEstadoDepreActi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDepreActi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodepreactiSessionBean.setConGuardarRelaciones(true);			
			this.estadodepreactiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadodepreactiSessionBean.setConGuardarRelaciones(false);			
			this.estadodepreactiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoDepreActi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
				if(estadodepreactiAux.getId().equals(this.iIdNuevoEstadoDepreActi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDepreActi estadodepreactiAux:this.estadodepreactis) {
				if(estadodepreactiAux.getId().equals(this.iIdNuevoEstadoDepreActi)) {
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
	
	public int getIndiceActualEstadoDepreActi(EstadoDepreActi estadodepreacti,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
				if(estadodepreactiAux.getId().equals(estadodepreacti.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDepreActi estadodepreactiAux:this.estadodepreactis) {
				if(estadodepreactiAux.getId().equals(estadodepreacti.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDepreActi(EstadoDepreActi estadodepreactiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
				if(estadodepreactiAux.getEstadoDepreActiOriginal().getId().equals(estadodepreactiOriginal.getId())) {
					existe=true;
					estadodepreactiOriginal.setId(estadodepreactiAux.getId());
					estadodepreactiOriginal.setVersionRow(estadodepreactiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDepreActi estadodepreactiAux:this.estadodepreactis) {
				if(estadodepreactiAux.getEstadoDepreActiOriginal().getId().equals(estadodepreactiOriginal.getId())) {
					existe=true;
					estadodepreactiOriginal.setId(estadodepreactiAux.getId());
					estadodepreactiOriginal.setVersionRow(estadodepreactiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDepreActi(Boolean esParaCancelar) throws Exception {
		estadodepreactisAux=new ArrayList<EstadoDepreActi>();
		estadodepreactiAux=new EstadoDepreActi();
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
					if(estadodepreactiAux.getId()<0) {
						estadodepreactisAux.add(estadodepreactiAux);
					}		
				}
				this.iIdNuevoEstadoDepreActi=0L;
				this.estadodepreactiLogic.getEstadoDepreActis().removeAll(estadodepreactisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDepreActi estadodepreactiAux:this.estadodepreactis) {
					if(estadodepreactiAux.getId()<0) {
						estadodepreactisAux.add(estadodepreactiAux);
					}		
				}
				this.iIdNuevoEstadoDepreActi=0L;
				this.estadodepreactis.removeAll(estadodepreactisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDepreActi 
					&& this.estadodepreactiLogic.getEstadoDepreActis().size()>0
					) {
					estadodepreactiAux=this.estadodepreactiLogic.getEstadoDepreActis().get(this.estadodepreactiLogic.getEstadoDepreActis().size() - 1);
				
					if(estadodepreactiAux.getId()<0) {
						this.estadodepreactiLogic.getEstadoDepreActis().remove(estadodepreactiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDepreActi && this.estadodepreactis.size()>0) {
					estadodepreactiAux=this.estadodepreactis.get(this.estadodepreactis.size() - 1);
				
					if(estadodepreactiAux.getId()<0) {
						this.estadodepreactis.remove(estadodepreactiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDepreActi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodepreacti.getId()<0) {
				this.estadodepreactiLogic.getEstadoDepreActis().remove(this.estadodepreacti);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodepreacti.getId()<0) {
				this.estadodepreactis.remove(this.estadodepreacti);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDepreActi(List<EstadoDepreActi> estadodepreactisAux) throws Exception {
		EstadoDepreActiConstantesFunciones.setEstadosInicialesEstadoDepreActi(estadodepreactisAux);
	}
	
	public void setEstadosInicialesEstadoDepreActi(EstadoDepreActi estadodepreactiAux) throws Exception {
		EstadoDepreActiConstantesFunciones.setEstadosInicialesEstadoDepreActi(estadodepreactiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDepreActiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDepreActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDepreActiActual()) {
				if(!this.isEsNuevoEstadoDepreActi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDepreActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDepreActi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDepreActiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Depre Acti ?", "MANTENIMIENTO DE Estado Depre Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDepreActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDepreActi estadodepreacti) throws Exception {
		EstadoDepreActiConstantesFunciones.seleccionarAsignar(this.estadodepreacti,estadodepreacti);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDepreActi=this.isPermisoActualizarOriginalEstadoDepreActi;
			
			
			this.seleccionarAsignar(estadodepreacti);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDepreActiConstantesFunciones.quitarEspaciosEstadoDepreActi(this.estadodepreacti,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDepreActi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodepreactiSessionBean.setsFuncionBusquedaRapida(this.estadodepreactiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDepreActi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDepreActi(esParaCancelar);				
				this.cancelarNuevoEstadoDepreActi(esParaCancelar);								
			}
			
			this.estadodepreacti=new EstadoDepreActi();
			
			this.inicializarEstadoDepreActi();
			
			this.actualizarEstadoCeldasBotonesEstadoDepreActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDepreActi() throws Exception {
		try {
			EstadoDepreActiConstantesFunciones.inicializarEstadoDepreActi(this.estadodepreacti);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodepreactiLogic.getEstadoDepreActis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDepreActis(String sAccionBusqueda,List<EstadoDepreActi> estadodepreactisParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDepreActi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDepreActiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDepreActiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDepreActi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Depre Actis");		
		parameters.put("busquedapor", EstadoDepreActiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DepreciacionActivoFijo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoDepreActiLogic estadodepreactiLogicAuxiliar=new EstadoDepreActiLogic();
					estadodepreactiLogicAuxiliar.setDatosCliente(estadodepreactiLogic.getDatosCliente());				
					estadodepreactiLogicAuxiliar.setEstadoDepreActis(estadodepreactisParaReportes);
					
					estadodepreactiLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoDepreActiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadodepreactisParaReportes=estadodepreactiLogicAuxiliar.getEstadoDepreActis();
					
					//estadodepreactiLogic.getNewConnexionToDeep();
					
					//for (EstadoDepreActi estadodepreacti:estadodepreactisParaReportes) {
					//	estadodepreactiLogic.deepLoad(estadodepreacti, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadodepreactiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadodepreactiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDepreciacionActivoFijo = AuxiliarReportes.class.getResourceAsStream("DepreciacionActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_depreciacionactivofijo", reportFileDepreciacionActivoFijo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDepreActi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDepreActiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDepreActiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDepreActi=new JRBeanArrayDataSource(EstadoDepreActiJInternalFrame.TraerEstadoDepreActiBeans(estadodepreactisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDepreActi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDepreActiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDepreActiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDepreActiBean.TraerEstadoDepreActiBeans(estadodepreactisParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDepreActis(sAccionBusqueda,sTipoArchivoReporte,estadodepreactisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDepreActis(sAccionBusqueda,sTipoArchivoReporte,estadodepreactisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDepreActiActionPerformed(null);
					//this.generarExcelReporteEstadoDepreActis(sAccionBusqueda,sTipoArchivoReporte,estadodepreactisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDepreActis(sAccionBusqueda,sTipoArchivoReporte,estadodepreactisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDepreActis(sAccionBusqueda,sTipoArchivoReporte,estadodepreactisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDepreActis(sAccionBusqueda,sTipoArchivoReporte,estadodepreactisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDepreActis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDepreActi> estadodepreactisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodepreacti";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDepreActis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDepreActi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDepreActi estadodepreacti : estadodepreactisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDepreActiConstantesFunciones.generarExcelReporteDataEstadoDepreActi("NORMAL",row,workbook,estadodepreacti,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDepreActi(String sTipo,Row row,Workbook workbook) {
		
		EstadoDepreActiConstantesFunciones.generarExcelReporteHeaderEstadoDepreActi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDepreActis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDepreActi> estadodepreactisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodepreacti_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDepreActis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDepreActi estadodepreacti : estadodepreactisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDepreActiConstantesFunciones.getEstadoDepreActiDescripcion(estadodepreacti));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDepreActiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodepreacti.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodepreacti.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDepreActis(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDepreActi> estadodepreactisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDepreActi> estadodepreactisRespaldo=null;
		
		classes=EstadoDepreActiConstantesFunciones.getClassesRelationshipsOfEstadoDepreActi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodepreactiLogic.setDatosCliente(this.datosCliente);
		this.estadodepreactiLogic.setDatosDeep(this.datosDeep);
		this.estadodepreactiLogic.setIsConDeep(true);
		
		estadodepreactisRespaldo=this.estadodepreactiLogic.getEstadoDepreActis();
		
		this.estadodepreactiLogic.setEstadoDepreActis(estadodepreactisParaReportes);	
		this.estadodepreactiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodepreactisParaReportes=this.estadodepreactiLogic.getEstadoDepreActis();
		this.estadodepreactiLogic.setEstadoDepreActis(estadodepreactisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodepreacti_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDepreActis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDepreActi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDepreActi estadodepreacti : estadodepreactisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDepreActi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDepreActiConstantesFunciones.generarExcelReporteDataEstadoDepreActi("NORMAL",row,workbook,estadodepreacti,cellStyleDataAux);
		
			
			


				//DepreciacionActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadodepreacti.getDepreciacionActivoFijos()!=null && estadodepreacti.getDepreciacionActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DepreciacionActivoFijoConstantesFunciones.generarExcelReporteHeaderDepreciacionActivoFijo("RELACIONADO",row,workbook);
				}

				if(estadodepreacti.getDepreciacionActivoFijos()!=null) {
					i2=0;
					for(DepreciacionActivoFijo depreciacionactivofijo : estadodepreacti.getDepreciacionActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DepreciacionActivoFijoConstantesFunciones.generarExcelReporteDataDepreciacionActivoFijo("RELACIONADO",row,workbook,depreciacionactivofijo,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoDepreActiConstantesFunciones.getEstadoDepreActiDescripcion(estadodepreacti));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDepreActi() throws Exception {		
		this.startProcessEstadoDepreActi(true);
	}
	
	public void startProcessEstadoDepreActi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDepreActi, this.jScrollPanelDatosEstadoDepreActi,this.jPanelPaginacionEstadoDepreActi, this.jScrollPanelDatosEdicionEstadoDepreActi, this.jPanelAccionesEstadoDepreActi,this.jPanelAccionesFormularioEstadoDepreActi,this.jmenuBarEstadoDepreActi,this.jmenuBarDetalleEstadoDepreActi,this.jTtoolBarEstadoDepreActi,this.jTtoolBarDetalleEstadoDepreActi);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDepreActi=null; 
		
		final JPanel jPanelParametrosReportesEstadoDepreActi=this.jPanelParametrosReportesEstadoDepreActi;
		//final JScrollPane jScrollPanelDatosEstadoDepreActi=this.jScrollPanelDatosEstadoDepreActi;
		final JTable jTableDatosEstadoDepreActi=this.jTableDatosEstadoDepreActi;		
		final JPanel jPanelPaginacionEstadoDepreActi=this.jPanelPaginacionEstadoDepreActi;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDepreActi=this.jScrollPanelDatosEdicionEstadoDepreActi;
		final JPanel jPanelAccionesEstadoDepreActi=this.jPanelAccionesEstadoDepreActi;
		
		JPanel jPanelCamposAuxiliarEstadoDepreActi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDepreActi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			jPanelCamposAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jPanelCamposEstadoDepreActi;
			jPanelAccionesFormularioAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jPanelAccionesFormularioEstadoDepreActi;
		}
		
		final JPanel jPanelCamposEstadoDepreActi=jPanelCamposAuxiliarEstadoDepreActi;
		final JPanel jPanelAccionesFormularioEstadoDepreActi=jPanelAccionesFormularioAuxiliarEstadoDepreActi;
		
		
		final JMenuBar jmenuBarEstadoDepreActi=this.jmenuBarEstadoDepreActi;
		final JToolBar jTtoolBarEstadoDepreActi=this.jTtoolBarEstadoDepreActi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDepreActi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDepreActi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			jmenuBarDetalleAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jmenuBarDetalleEstadoDepreActi;
			jTtoolBarDetalleAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jTtoolBarDetalleEstadoDepreActi;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDepreActi=jmenuBarDetalleAuxiliarEstadoDepreActi;
		final JToolBar jTtoolBarDetalleEstadoDepreActi=jTtoolBarDetalleAuxiliarEstadoDepreActi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDepreActi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDepreActi;
			processRunnable.jTableDatos=jTableDatosEstadoDepreActi;
			processRunnable.jPanelCampos=jPanelCamposEstadoDepreActi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDepreActi;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDepreActi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDepreActi;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDepreActi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDepreActi;
			processRunnable.jTtoolBar=jTtoolBarEstadoDepreActi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDepreActi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDepreActi ,jPanelParametrosReportesEstadoDepreActi,jTableDatosEstadoDepreActi, /*jScrollPanelDatosEstadoDepreActi,*/jPanelCamposEstadoDepreActi,jPanelPaginacionEstadoDepreActi, /*jScrollPanelDatosEdicionEstadoDepreActi,*/ jPanelAccionesEstadoDepreActi,jPanelAccionesFormularioEstadoDepreActi,jmenuBarEstadoDepreActi,jmenuBarDetalleEstadoDepreActi,jTtoolBarEstadoDepreActi,jTtoolBarDetalleEstadoDepreActi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDepreActi, jScrollPanelDatosEstadoDepreActi,jPanelPaginacionEstadoDepreActi, jScrollPanelDatosEdicionEstadoDepreActi, jPanelAccionesEstadoDepreActi,jPanelAccionesFormularioEstadoDepreActi,jmenuBarEstadoDepreActi,jmenuBarDetalleEstadoDepreActi,jTtoolBarEstadoDepreActi,jTtoolBarDetalleEstadoDepreActi);
						
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
	
	public void finishProcessEstadoDepreActi() {// throws Exception 
		this.finishProcessEstadoDepreActi(true);
	}
	
	public void finishProcessEstadoDepreActi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDepreActi, this.jScrollPanelDatosEstadoDepreActi,this.jPanelPaginacionEstadoDepreActi, this.jScrollPanelDatosEdicionEstadoDepreActi, this.jPanelAccionesEstadoDepreActi,this.jPanelAccionesFormularioEstadoDepreActi,this.jmenuBarEstadoDepreActi,this.jmenuBarDetalleEstadoDepreActi,this.jTtoolBarEstadoDepreActi,this.jTtoolBarDetalleEstadoDepreActi);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDepreActi=null; 
		
		final JPanel jPanelParametrosReportesEstadoDepreActi=this.jPanelParametrosReportesEstadoDepreActi;
		//final JScrollPane jScrollPanelDatosEstadoDepreActi=this.jScrollPanelDatosEstadoDepreActi;
		final JTable jTableDatosEstadoDepreActi=this.jTableDatosEstadoDepreActi;		
		final JPanel jPanelPaginacionEstadoDepreActi=this.jPanelPaginacionEstadoDepreActi;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDepreActi=this.jScrollPanelDatosEdicionEstadoDepreActi;
		final JPanel jPanelAccionesEstadoDepreActi=this.jPanelAccionesEstadoDepreActi;
		
		JPanel jPanelCamposAuxiliarEstadoDepreActi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDepreActi=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			jPanelCamposAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jPanelCamposEstadoDepreActi;
			jPanelAccionesFormularioAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jPanelAccionesFormularioEstadoDepreActi;
		}
		
		final JPanel jPanelCamposEstadoDepreActi=jPanelCamposAuxiliarEstadoDepreActi;
		final JPanel jPanelAccionesFormularioEstadoDepreActi=jPanelAccionesFormularioAuxiliarEstadoDepreActi;
		
		
		final JMenuBar jmenuBarEstadoDepreActi=this.jmenuBarEstadoDepreActi;		
		final JToolBar jTtoolBarEstadoDepreActi=this.jTtoolBarEstadoDepreActi;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDepreActi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDepreActi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			jmenuBarDetalleAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jmenuBarDetalleEstadoDepreActi;
			jTtoolBarDetalleAuxiliarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jTtoolBarDetalleEstadoDepreActi;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDepreActi=jmenuBarDetalleAuxiliarEstadoDepreActi;
		final JToolBar jTtoolBarDetalleEstadoDepreActi=jTtoolBarDetalleAuxiliarEstadoDepreActi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDepreActi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDepreActi;
			processRunnable.jTableDatos=jTableDatosEstadoDepreActi;
			processRunnable.jPanelCampos=jPanelCamposEstadoDepreActi;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDepreActi;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDepreActi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDepreActi;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDepreActi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDepreActi;
			processRunnable.jTtoolBar=jTtoolBarEstadoDepreActi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDepreActi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDepreActi ,jPanelParametrosReportesEstadoDepreActi, jTableDatosEstadoDepreActi,/*jScrollPanelDatosEstadoDepreActi,*/jPanelCamposEstadoDepreActi,jPanelPaginacionEstadoDepreActi, /*jScrollPanelDatosEdicionEstadoDepreActi,*/ jPanelAccionesEstadoDepreActi,jPanelAccionesFormularioEstadoDepreActi,jmenuBarEstadoDepreActi,jmenuBarDetalleEstadoDepreActi,jTtoolBarEstadoDepreActi,jTtoolBarDetalleEstadoDepreActi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDepreActi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDepreActi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDepreActi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDepreActi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDepreActi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDepreActi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDepreActi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDepreActi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDepreActi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodepreactiConstantesFunciones.getsFinalQueryEstadoDepreActi();
		String  finalQueryPaginacionTodos=this.estadodepreactiConstantesFunciones.getsFinalQueryEstadoDepreActi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDepreActiConstantesFunciones.getArrayColumnasGlobalesNoEstadoDepreActi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDepreActiConstantesFunciones.getArrayColumnasGlobalesEstadoDepreActi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDepreActiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodepreactisEliminados= new ArrayList<EstadoDepreActi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDepreActi();
		
				///*EstadoDepreActiSessionBean*/this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
			
			if(this.estadodepreactiSessionBean==null) {
				this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
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
					this.iNumeroPaginacion=EstadoDepreActiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDepreActiConstantesFunciones.getClassesForeignKeysOfEstadoDepreActi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodepreacti."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodepreactisAux= new ArrayList<EstadoDepreActi>();
			
				
			estadodepreactiLogic.setDatosCliente(this.datosCliente);
			estadodepreactiLogic.setDatosDeep(this.datosDeep);
			estadodepreactiLogic.setIsConDeep(true);
			
			
			estadodepreactiLogic.getEstadoDepreActiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodepreactiLogic.getTodosEstadoDepreActis(finalQueryGlobal,pagination);
					
					//estadodepreactiLogic.getTodosEstadoDepreActisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodepreactiLogic.getEstadoDepreActis()==null|| estadodepreactiLogic.getEstadoDepreActis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodepreactisAux= new ArrayList<EstadoDepreActi>();
							estadodepreactisAux.addAll(estadodepreactiLogic.getEstadoDepreActis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodepreactisAux= new ArrayList<EstadoDepreActi>();
							estadodepreactisAux.addAll(estadodepreactis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodepreactiLogic.getTodosEstadoDepreActis(finalQueryGlobal+"",this.pagination);												
							
							//estadodepreactiLogic.getTodosEstadoDepreActisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDepreActis("Todos",estadodepreactiLogic.getEstadoDepreActis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodepreactiLogic.setEstadoDepreActis(new ArrayList<EstadoDepreActi>());					
							estadodepreactiLogic.getEstadoDepreActis().addAll(estadodepreactisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodepreactis=new ArrayList<EstadoDepreActi>();
							estadodepreactis.addAll(estadodepreactisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDepreActi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDepreActi=this.idActual;
				
				} else if(this.idEstadoDepreActiActual!=null && this.idEstadoDepreActiActual!=0L) {
					idEstadoDepreActi=idEstadoDepreActiActual;
				}
				
					
				this.sDetalleReporte=EstadoDepreActiConstantesFunciones.getDetalleIndicePorId(idEstadoDepreActi);
				
				this.estadodepreactis=new ArrayList<EstadoDepreActi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodepreactiLogic.getEntity(idEstadoDepreActi);
					
					//estadodepreactiLogic.getEntityWithConnection(idEstadoDepreActi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodepreactiLogic.setEstadoDepreActis(new ArrayList<EstadoDepreActi>());
					estadodepreactiLogic.getEstadoDepreActis().add(estadodepreactiLogic.getEstadoDepreActi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodepreactis=new ArrayList<EstadoDepreActi>();
					this.estadodepreactis.add(estadodepreacti);
				}
				
				if(estadodepreactiLogic.getEstadoDepreActi()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDepreActi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDepreActi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodepreactiLogic.getEstadoDepreActis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodepreactis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodepreactiLogic.getEstadoDepreActis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodepreactis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDepreActi estadodepreacti) {
		Boolean permite=true;
		
		if(this.estadodepreacti.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDepreActiConstantesFunciones.getOrderByListaEstadoDepreActi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDepreActiConstantesFunciones.getOrderByListaEstadoDepreActi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDepreActi estadodepreacti:estadodepreactiLogic.getEstadoDepreActis()) {
				if(estadodepreacti.getsType().equals(Constantes2.S_TOTALES)) {
					estadodepreactiTotales=estadodepreacti;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDepreActi estadodepreacti:this.estadodepreactis) {
				if(estadodepreacti.getsType().equals(Constantes2.S_TOTALES)) {
					estadodepreactiTotales=estadodepreacti;
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
			this.estadodepreactiAux=new EstadoDepreActi();
			this.estadodepreactiAux.setsType(Constantes2.S_TOTALES);
			this.estadodepreactiAux.setIsNew(false);
			this.estadodepreactiAux.setIsChanged(false);
			this.estadodepreactiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDepreActiConstantesFunciones.TotalizarValoresFilaEstadoDepreActi(this.estadodepreactiLogic.getEstadoDepreActis(),this.estadodepreactiAux);
				
				this.estadodepreactiLogic.getEstadoDepreActis().add(this.estadodepreactiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDepreActiConstantesFunciones.TotalizarValoresFilaEstadoDepreActi(this.estadodepreactis,this.estadodepreactiAux);
				
				this.estadodepreactis.add(this.estadodepreactiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodepreactiTotales=new EstadoDepreActi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodepreactiLogic.getEstadoDepreActis().remove(estadodepreactiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodepreactis.remove(estadodepreactiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodepreactiTotales=new EstadoDepreActi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDepreActi estadodepreacti:estadodepreactiLogic.getEstadoDepreActis()) {
				if(estadodepreacti.getsType().equals(Constantes2.S_TOTALES)) {
					estadodepreactiTotales=estadodepreacti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDepreActiConstantesFunciones.TotalizarValoresFilaEstadoDepreActi(this.estadodepreactiLogic.getEstadoDepreActis(),estadodepreactiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDepreActi estadodepreacti:this.estadodepreactis) {
				if(estadodepreacti.getsType().equals(Constantes2.S_TOTALES)) {
					estadodepreactiTotales=estadodepreacti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDepreActiConstantesFunciones.TotalizarValoresFilaEstadoDepreActi(this.estadodepreactis,estadodepreactiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoDepreActiPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoDepreActiPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodepreactiLogic.getEstadoDepreActiPorCodigo(codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
	
	public void inicializarPermisosEstadoDepreActi() {
		this.isPermisoTodoEstadoDepreActi=false;
		this.isPermisoNuevoEstadoDepreActi=false;
		this.isPermisoActualizarEstadoDepreActi=false;
		this.isPermisoActualizarOriginalEstadoDepreActi=false;
		this.isPermisoEliminarEstadoDepreActi=false;
		this.isPermisoGuardarCambiosEstadoDepreActi=false;
		this.isPermisoConsultaEstadoDepreActi=false;
		this.isPermisoBusquedaEstadoDepreActi=false;
		this.isPermisoReporteEstadoDepreActi=false;		
		this.isPermisoOrdenEstadoDepreActi=false;		
		this.isPermisoPaginacionMedioEstadoDepreActi=false;		
		this.isPermisoPaginacionAltoEstadoDepreActi=false;
		this.isPermisoPaginacionTodoEstadoDepreActi=false;
		this.isPermisoCopiarEstadoDepreActi=false;		
		this.isPermisoVerFormEstadoDepreActi=false;		
		this.isPermisoDuplicarEstadoDepreActi=false;		
		this.isPermisoOrdenEstadoDepreActi=false;		
	}
	
	public void setPermisosUsuarioEstadoDepreActi(Boolean isPermiso) {
		this.isPermisoTodoEstadoDepreActi=isPermiso;
		this.isPermisoNuevoEstadoDepreActi=isPermiso;
		this.isPermisoActualizarEstadoDepreActi=isPermiso;
		this.isPermisoActualizarOriginalEstadoDepreActi=isPermiso;
		this.isPermisoEliminarEstadoDepreActi=isPermiso;
		this.isPermisoGuardarCambiosEstadoDepreActi=isPermiso;
		this.isPermisoConsultaEstadoDepreActi=isPermiso;
		this.isPermisoBusquedaEstadoDepreActi=isPermiso;
		this.isPermisoReporteEstadoDepreActi=isPermiso;
		this.isPermisoOrdenEstadoDepreActi=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDepreActi=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDepreActi=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDepreActi=isPermiso;		
		this.isPermisoCopiarEstadoDepreActi=isPermiso;		
		this.isPermisoVerFormEstadoDepreActi=isPermiso;		
		this.isPermisoDuplicarEstadoDepreActi=isPermiso;
		this.isPermisoOrdenEstadoDepreActi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDepreActi(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDepreActi=isPermiso;
		this.isPermisoNuevoEstadoDepreActi=isPermiso;
		this.isPermisoActualizarEstadoDepreActi=isPermiso;
		this.isPermisoActualizarOriginalEstadoDepreActi=isPermiso;
		this.isPermisoEliminarEstadoDepreActi=isPermiso;
		this.isPermisoGuardarCambiosEstadoDepreActi=isPermiso;
		//this.isPermisoConsultaEstadoDepreActi=isPermiso;
		//this.isPermisoBusquedaEstadoDepreActi=isPermiso;
		//this.isPermisoReporteEstadoDepreActi=isPermiso;
		//this.isPermisoOrdenEstadoDepreActi=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDepreActi=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDepreActi=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDepreActi=isPermiso;		
		//this.isPermisoCopiarEstadoDepreActi=isPermiso;		
		//this.isPermisoDuplicarEstadoDepreActi=isPermiso;
		//this.isPermisoOrdenEstadoDepreActi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDepreActiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoDepreActiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDepreciacionActivoFijo=false;
		this.isTienePermisosDepreciacionActivoFijo=this.verificarGetPermisosUsuarioOpcionEstadoDepreActiClaseRelacionada(this.opcionsRelacionadas,DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDepreActi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDepreActiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDepreciacionActivoFijo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDepreActiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDepreActiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDepreActiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDepreciacionActivoFijo && this.jInternalFrameDetalleFormEstadoDepreActi!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.remove(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoDepreActi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDepreActiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDepreActiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDepreActi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDepreActi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDepreActi=this.isPermisoActualizarEstadoDepreActi;
			this.isPermisoEliminarEstadoDepreActi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDepreActi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDepreActi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDepreActi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDepreActi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDepreActi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDepreActi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDepreActi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDepreActi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDepreActi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDepreActi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDepreActi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDepreActi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDepreActi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDepreActi.setToolTipText(this.jTableDatosEstadoDepreActi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDepreActi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDepreActi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDepreActiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDepreActiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDepreActi() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDepreciacionActivoFijo && this.estadodepreactiConstantesFunciones.mostrarDepreciacionActivoFijoEstadoDepreActi && !EstadoDepreActiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Depreciacion Activo Fijo");
			reporte.setsDescripcion("Depreciacion Activo Fijo");
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
	
		
	public void inicializarCombosForeignKeyEstadoDepreActiListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDepreActiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDepreActiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDepreActiListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDepreActiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDepreActi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDepreActi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDepreActi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDepreActi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDepreActi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDepreActi(EstadoDepreActi estadodepreacti)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDepreActi(EstadoDepreActi estadodepreacti,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDepreActi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDepreActi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDepreActi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDepreActi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDepreActi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDepreActi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDepreActi(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDepreActi()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDepreActiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDepreActiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDepreActiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean(); 
		this.estadodepreactiConstantesFunciones=new EstadoDepreActiConstantesFunciones(); 
		this.estadodepreactiBean=new EstadoDepreActi();//(this.estadodepreactiConstantesFunciones); 		
		this.estadodepreactiReturnGeneral=new EstadoDepreActiParameterReturnGeneral(); 
		
		this.estadodepreactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodepreactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDepreActiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDepreActiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDepreActiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDepreActi(true);
			
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
			
			this.estadodepreactiConstantesFunciones=new EstadoDepreActiConstantesFunciones(); 
			this.estadodepreactiBean=new EstadoDepreActi();//this.estadodepreactiConstantesFunciones); 			
			this.estadodepreactiReturnGeneral=new EstadoDepreActiParameterReturnGeneral(); 
		
			EstadoDepreActiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Depre Acti Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodepreacti=new EstadoDepreActi();
			this.estadodepreactis = new ArrayList<EstadoDepreActi>();
			this.estadodepreactisAux = new ArrayList<EstadoDepreActi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic=new EstadoDepreActiLogic();
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodepreactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodepreactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDepreActi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDepreActi);	
					}
					
					if(this.jInternalFrameImportacionEstadoDepreActi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDepreActi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDepreActi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDepreActi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDepreActi);
				this.jInternalFrameDetalleFormEstadoDepreActi.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDepreActi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDepreActi);
					this.jInternalFrameReporteDinamicoEstadoDepreActi.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDepreActi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDepreActi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDepreActi);
					this.jInternalFrameImportacionEstadoDepreActi.setVisible(false);
					this.jInternalFrameImportacionEstadoDepreActi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDepreActi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDepreActi);
					this.jInternalFrameOrderByEstadoDepreActi.setVisible(false);
					this.jInternalFrameOrderByEstadoDepreActi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDepreActiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDepreActiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodepreactiReturnGeneral=new EstadoDepreActiParameterReturnGeneral();
			
			this.estadodepreactiParameterGeneral=new EstadoDepreActiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodepreactiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDepreActiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDepreActiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodepreactiSessionBean.getEsGuardarRelacionado(),this.estadodepreactiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDepreActiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodepreactiSessionBean.getEsGuardarRelacionado(),this.estadodepreactiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
			this.isVisibilidadCeldaDuplicarEstadoDepreActi=true;
			this.isVisibilidadCeldaCopiarEstadoDepreActi=true;
			this.isVisibilidadCeldaVerFormEstadoDepreActi=true;
			this.isVisibilidadCeldaOrdenEstadoDepreActi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
			this.isVisibilidadCeldaModificarEstadoDepreActi=false;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=false;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDepreActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDepreActi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDepreActi(false);
			
			this.setPermisosUsuarioEstadoDepreActi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodepreactiSessionBean.getEsGuardarRelacionado() && this.estadodepreactiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDepreActiClasesRelacionadas();
			}
			
			if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDepreActiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDepreActi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDepreActi();
			}
			
			if(!this.isPermisoBusquedaEstadoDepreActi) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDepreActi,this.isPermisoPaginacionMedioEstadoDepreActi,this.isPermisoPaginacionTodoEstadoDepreActi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDepreActiConstantesFunciones.getTiposSeleccionarEstadoDepreActi());
				
				this.tiposColumnasSelect=EstadoDepreActiConstantesFunciones.getTiposSeleccionarEstadoDepreActi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoDepreActi();				
				//this.tiposRelacionesSelect=EstadoDepreActiConstantesFunciones.getTiposRelacionesEstadoDepreActi(true);
				
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
			//if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDepreActi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDepreActi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDepreActi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDepreActi() ;
			
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
			
			
			this.depreciacionactivofijoLogic=new DepreciacionActivoFijoLogic(); 
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
				estadodepreactiImplementable= (EstadoDepreActiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDepreActiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodepreactiImplementableHome= (EstadoDepreActiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDepreActiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodepreactis= new ArrayList<EstadoDepreActi>();
			this.estadodepreactisEliminados= new ArrayList<EstadoDepreActi>();
						
			this.isEsNuevoEstadoDepreActi=false;
			this.esParaAccionDesdeFormularioEstadoDepreActi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDepreActi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDepreActi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoDepreActiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDepreActiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDepreActi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDepreActi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDepreActi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDepreActi();
			}
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDepreActi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDepreActi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDepreActi() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoDepreActi")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();	
				
				

				if(sTitle.equals("Depreciacion Activo Fijos")) {
					if(!DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoDepreActi();

						this.cargarParteTabPanelRelacionadaDepreciacionActivoFijo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoDepreActi();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDepreciacionActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoDepreActi.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(false,true,iIndex);
		this.jButtonDepreciacionActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDepreciacionActivoFijo();

		//this.jTabbedPaneRelacionesEstadoDepreActi.updateUI();
		//this.jTabbedPaneRelacionesEstadoDepreActi.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoDepreActi.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DepreciacionActivoFijo")) {
				int row=this.jTableDatosEstadoDepreActi.getSelectedRow();
				jButtonDepreciacionActivoFijoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Depreciacion Activo Fijo")) {

					if(this.isTienePermisosDepreciacionActivoFijo && this.estadodepreactiConstantesFunciones.mostrarDepreciacionActivoFijoEstadoDepreActi && !EstadoDepreActiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Depreciacion Activo Fijos"+"("+DepreciacionActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Depreciacion Activo Fijos");

						if(estadodepreactiConstantesFunciones.resaltarDepreciacionActivoFijoEstadoDepreActi!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadodepreactiConstantesFunciones.resaltarDepreciacionActivoFijoEstadoDepreActi);
						}

						jmenuItem.setEnabled(this.estadodepreactiConstantesFunciones.activarDepreciacionActivoFijoEstadoDepreActi);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DepreciacionActivoFijo"));

						

						this.jInternalFrameDetalleFormEstadoDepreActi.jmenuDetalleEstadoDepreActi.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoDepreActi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDepreActi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDepreActi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDepreActiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDepreActi();
		
		this.cargarCombosFrameForeignKeyEstadoDepreActi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDepreActi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDepreActi();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDepreActiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
			
			if(jTableDatosEstadoDepreActi.getRowCount()>=1) {
				jTableDatosEstadoDepreActi.removeRowSelectionInterval(0, jTableDatosEstadoDepreActi.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDepreActi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDepreActi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDepreActi(true);			
			//this.estadodepreacti=new EstadoDepreActi();
			//this.estadodepreacti.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDepreActi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDepreActi() ;
			
			if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDepreActi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodepreacti);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);				
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
			if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDepreActi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDepreActiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDepreActi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDepreActi.getSelectedRows().length;			
			}
			
			estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDepreActi--;			
				//EstadoDepreActi estadodepreactiAux= new EstadoDepreActi();			
				//estadodepreactiAux.setId(this.iIdNuevoEstadoDepreActi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDepreActi estadodepreactiOrigen=new EstadoDepreActi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDepreActi estadodepreactiOrigen : estadodepreactisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodepreactiOrigen =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodepreactiOrigen =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDepreActi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodepreacti.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDepreActi(estadodepreactiOrigen,this.estadodepreacti,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodepreactiLogic.getEstadoDepreActis().add(this.estadodepreactiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodepreactis.add(this.estadodepreactiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDepreActi(false);
				
				this.jTableDatosEstadoDepreActi.setRowSelectionInterval(this.getIndiceNuevoEstadoDepreActi(), this.getIndiceNuevoEstadoDepreActi());
				
				int iLastRow =  this.jTableDatosEstadoDepreActi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDepreActi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDepreActi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDepreActi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();									
		
			EstadoDepreActi estadodepreactiOrigen=new EstadoDepreActi();
			EstadoDepreActi estadodepreactiDestino=new EstadoDepreActi();
				
			estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDepreActi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodepreactisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDepreActi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodepreactiOrigen =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodepreactiOrigen =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodepreactiDestino =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodepreactiDestino =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodepreactiOrigen =estadodepreactisSeleccionados.get(0);
				estadodepreactiDestino =estadodepreactisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDepreActi(estadodepreactiOrigen,estadodepreactiDestino,true,false);
				
				estadodepreactiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodepreactiDestino,estadodepreactiLogic.getEstadoDepreActis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodepreactiDestino,estadodepreactis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDepreActi(false);
				
				//this.jTableDatosEstadoDepreActi.setRowSelectionInterval(this.getIndiceNuevoEstadoDepreActi(), this.getIndiceNuevoEstadoDepreActi());
				
				int iLastRow =  this.jTableDatosEstadoDepreActi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDepreActi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDepreActi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDepreActi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDepreActi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDepreActi.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDepreActi.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDepreActi.setVisible(!isVisible);
			this.jPanelAccionesEstadoDepreActi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDepreActi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDepreActi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDepreActi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDepreActi();
			
			this.abrirFrameOrderByEstadoDepreActi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDepreActi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDepreActi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDepreActi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDepreActi.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDepreActi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDepreActi.setSize(this.jInternalFrameDetalleFormEstadoDepreActi.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDepreActi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDepreActi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDepreActi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDepreActi.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDepreActi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDepreActi.jContentPaneDetalleEstadoDepreActi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDepreActi.jContentPaneDetalleEstadoDepreActi.getWidth(),EstadoDepreActiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDepreActi.jContentPaneDetalleEstadoDepreActi.getWidth(),EstadoDepreActiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDepreActi.jContentPaneDetalleEstadoDepreActi.getWidth(),EstadoDepreActiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDepreciacionActivoFijo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDepreActi.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDepreActi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDepreActi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDepreActi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDepreActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDepreActi,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDepreActi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDepreActi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDepreActi);
				this.jInternalFrameOrderByEstadoDepreActi.setVisible(false);
				this.jInternalFrameOrderByEstadoDepreActi.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDepreActi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDepreActi"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDepreActi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDepreActi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDepreActi==null) {
				
				this.jInternalFrameImportacionEstadoDepreActi=new ImportacionJInternalFrame(EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDepreActi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDepreActi);
				this.jInternalFrameImportacionEstadoDepreActi.setVisible(false);
				this.jInternalFrameImportacionEstadoDepreActi.setSelected(false);


				this.jInternalFrameImportacionEstadoDepreActi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDepreActi"));
				this.jInternalFrameImportacionEstadoDepreActi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDepreActi"));
				this.jInternalFrameImportacionEstadoDepreActi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDepreActi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDepreActi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDepreActi==null) {
				this.jInternalFrameReporteDinamicoEstadoDepreActi=new ReporteDinamicoJInternalFrame(EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDepreActi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDepreActi);
				this.jInternalFrameReporteDinamicoEstadoDepreActi.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDepreActi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDepreActi"));
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDepreActi"));
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDepreActi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDepreActi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDepreciacionActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoDepreActi.jContentPaneDetalleEstadoDepreActi.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoDepreActi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDepreActi);
			
	       	this.jInternalFrameDetalleFormEstadoDepreActi.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDepreActi.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDepreActi.dispose();
			//this.jInternalFrameDetalleFormEstadoDepreActi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDepreActi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDepreActi.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDepreActi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDepreActi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDepreActi.setVisible(true);
	        this.jInternalFrameImportacionEstadoDepreActi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDepreActi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDepreActi.setVisible(true);
	        this.jInternalFrameOrderByEstadoDepreActi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDepreActi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDepreActi.setVisible(false);
	        this.jInternalFrameOrderByEstadoDepreActi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDepreActi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDepreActi.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDepreActi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDepreActi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDepreActi.setVisible(false);
	        this.jInternalFrameImportacionEstadoDepreActi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDepreActi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDepreActi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDepreActi(true);
			//this.isEsNuevoEstadoDepreActi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDepreActi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDepreActi(false) ;
			
			if(estadodepreactiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() && DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDepreciacionActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDepreActi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDepreActi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDepreActiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDepreActi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDepreActi(true);
			//this.isEsNuevoEstadoDepreActi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodepreacti.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDepreActi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDepreActi(false) ;
			
			if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDepreActi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDepreActi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDepreActi(false);
			
			//if(!this.isEsNuevoEstadoDepreActi) {								
				int intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
				
			}
			
			if(this.permiteMantenimiento(this.estadodepreacti)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDepreActi=true;
					this.inicializarActualizarBindingTablaEstadoDepreActi(false);
					this.isEsNuevoEstadoDepreActi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDepreActi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDepreActi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDepreActi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDepreActi(false);
				
				this.habilitarDeshabilitarControlesEstadoDepreActi(false);
			
												
				
				if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDepreActi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDepreActiActionPerformed(evt,estadodepreactiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDepreActi(this.estadodepreacti,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDepreActi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodepreactiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodepreacti.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				this.estadodepreacti.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				this.estadodepreacti.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodepreacti)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDepreActiModel) this.jTableDatosEstadoDepreActi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDepreActi=true;
				this.inicializarActualizarBindingTablaEstadoDepreActi(false);
				this.isEsNuevoEstadoDepreActi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDepreActi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDepreActi(false);
				
				this.habilitarDeshabilitarControlesEstadoDepreActi(false);
				
				
				
				if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDepreActi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDepreActi.getRowCount()>=1) {
				jTableDatosEstadoDepreActi.removeRowSelectionInterval(0, jTableDatosEstadoDepreActi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDepreActi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDepreActi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDepreActi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDepreActi(false) ;
			
			this.isEsNuevoEstadoDepreActi=false;
			
			if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDepreActi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDepreActi(false);
				
				//SI ES MANUAL
				if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDepreActi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDepreActi--;			
			//EstadoDepreActi estadodepreactiAux= new EstadoDepreActi();			
			//estadodepreactiAux.setId(this.iIdNuevoEstadoDepreActi);
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDepreActi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
			
			this.estadodepreacti.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodepreactiLogic.getEstadoDepreActis().add(this.estadodepreactiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodepreactis.add(this.estadodepreactiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDepreActi(false);
			
			this.jTableDatosEstadoDepreActi.setRowSelectionInterval(this.getIndiceNuevoEstadoDepreActi(), this.getIndiceNuevoEstadoDepreActi());
			
			int iLastRow =  this.jTableDatosEstadoDepreActi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDepreActi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDepreActi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDepreActi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDepreActi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDepreActi(false);
			
			//SI ES MANUAL
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDepreActi();
			}
			
			//this.abrirFrameTreeEstadoDepreActi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Depre ActiS ?", "MANTENIMIENTO DE Estado Depre Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDepreActi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDepreActi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodepreactiReturnGeneral=estadodepreactiLogic.procesarImportacionEstadoDepreActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodepreactiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDepreActiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDepreActi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDepreActi.setFileImportacion(this.jInternalFrameImportacionEstadoDepreActi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDepreActi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDepreActi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDepreActi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDepreActi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		

		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDepreActiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDepreActiBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDepreActis("Todos",estadodepreactisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDepreActiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDepreActiConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDepreActi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDepreActiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDepreActiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDepreActiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDepreActiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDepreActiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDepreActiConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodepreacti";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDepreActis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDepreActiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDepreActi estadodepreacti:estadodepreactisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodepreacti.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDepreActiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDepreActi estadodepreacti:estadodepreactisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodepreacti.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDepreActi(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDepreActi estadodepreactiAux:estadodepreactisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDepreActi(estadodepreactiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDepreActi(false);
			
			//SI ES MANUAL
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDepreActi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDepreActi(false);
			
			//SI ES MANUAL
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDepreActi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDepreActiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDepreActi(false);
			
			//SI ES MANUAL
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDepreActi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodepreactiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDepreActi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDepreActi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDepreActi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDepreActi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDepreActi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDepreActi.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDepreActi.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDepreActi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDepreActi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDepreActi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDepreActi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDepreActi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDepreActi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDepreActi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDepreActi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDepreActi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDepreActi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDepreActi();
		
		this.inicializarActualizarBindingBotonesManualEstadoDepreActi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDepreActi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDepreActi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDepreActi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDepreActi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDepreActi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDepreActi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDepreActi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDepreActi.jCheckBoxPostAccionNuevoEstadoDepreActi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDepreActi.jCheckBoxPostAccionSinCerrarEstadoDepreActi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDepreActi.jCheckBoxPostAccionSinMensajeEstadoDepreActi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDepreActi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDepreActi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDepreActi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
				this.jInternalFrameDetalleFormEstadoDepreActi.jCheckBoxPostAccionNuevoEstadoDepreActi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDepreActi.jCheckBoxPostAccionSinCerrarEstadoDepreActi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDepreActi.jCheckBoxPostAccionSinMensajeEstadoDepreActi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDepreActi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDepreActi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDepreActi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDepreActi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDepreActi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDepreActi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDepreActi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDepreActi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDepreActi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDepreActi(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDepreActi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDepreActi() throws Exception {
		try	{
			if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDepreActi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDepreActi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDepreActi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDepreActi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDepreActi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDepreActi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDepreActi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDepreActi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDepreActi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDepreActi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDepreActi.addItem(reporte);
			}
			
			
			if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDepreActi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDepreActi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDepreActi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDepreActi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDepreActi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDepreActi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDepreActi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDepreActi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDepreActi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDepreActi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDepreActi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDepreActi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDepreActi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDepreActi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDepreActi(Boolean esInicializar) throws Exception {				
		if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDepreActi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDepreActi() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDepreActi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDepreActi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDepreActiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDepreActiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDepreActiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDepreActiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDepreActiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDepreActiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDepreActi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodepreactiLogic.getEstadoDepreActis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodepreactis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDepreActi.setModel(new EstadoDepreActiModel(this.estadodepreactiLogic.getEstadoDepreActis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDepreActi.setModel(new EstadoDepreActiModel(this.estadodepreactis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDepreActi!=null && this.jInternalFrameOrderByEstadoDepreActi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDepreActi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDepreActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDepreActi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDepreActiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO,estadodepreactiConstantesFunciones.resaltarSeleccionarEstadoDepreActi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDepreActiConstantesFunciones.SCLASSWEBTITULO,estadodepreactiConstantesFunciones.resaltarSeleccionarEstadoDepreActi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDepreActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDepreActi,EstadoDepreActiConstantesFunciones.LABEL_ID));

		if(this.estadodepreactiConstantesFunciones.mostraridEstadoDepreActi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDepreActiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodepreactiConstantesFunciones.resaltaridEstadoDepreActi,this.estadodepreactiConstantesFunciones.activaridEstadoDepreActi,this,true,"idEstadoDepreActi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodepreactiConstantesFunciones.resaltaridEstadoDepreActi,this.estadodepreactiConstantesFunciones.activaridEstadoDepreActi,this,true,"idEstadoDepreActi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDepreActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDepreActi,EstadoDepreActiConstantesFunciones.LABEL_CODIGO));

		if(this.estadodepreactiConstantesFunciones.mostrarcodigoEstadoDepreActi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDepreActiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodepreactiConstantesFunciones.resaltarcodigoEstadoDepreActi,this.estadodepreactiConstantesFunciones.activarcodigoEstadoDepreActi,this,true,"codigoEstadoDepreActi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodepreactiConstantesFunciones.resaltarcodigoEstadoDepreActi,this.estadodepreactiConstantesFunciones.activarcodigoEstadoDepreActi,this,true,"codigoEstadoDepreActi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDepreActiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDepreActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDepreActi,EstadoDepreActiConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodepreactiConstantesFunciones.mostrarnombreEstadoDepreActi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDepreActiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodepreactiConstantesFunciones.resaltarnombreEstadoDepreActi,this.estadodepreactiConstantesFunciones.activarnombreEstadoDepreActi,this,true,"nombreEstadoDepreActi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodepreactiConstantesFunciones.resaltarnombreEstadoDepreActi,this.estadodepreactiConstantesFunciones.activarnombreEstadoDepreActi,this,true,"nombreEstadoDepreActi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDepreActiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDepreciacionActivoFijo && this.estadodepreactiConstantesFunciones.mostrarDepreciacionActivoFijoEstadoDepreActi && !EstadoDepreActiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Depreciacion Activo Fijos");
				tableColumn.setHeaderValue("Depreciacion Activo Fijos");
				tableColumn.setCellRenderer(new DepreciacionActivoFijoTableCell(estadodepreactiConstantesFunciones.resaltarDepreciacionActivoFijoEstadoDepreActi,this,this.estadodepreactiConstantesFunciones.activarDepreciacionActivoFijoEstadoDepreActi));
				tableColumn.setCellEditor(new DepreciacionActivoFijoTableCell(estadodepreactiConstantesFunciones.resaltarDepreciacionActivoFijoEstadoDepreActi,this,this.estadodepreactiConstantesFunciones.activarDepreciacionActivoFijoEstadoDepreActi));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoDepreActi.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodepreactiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodepreactiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDepreActi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodepreactiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodepreactiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDepreActi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodepreactiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodepreactiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDepreActi.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoDepreActi.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDepreActi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodepreactiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDepreActi.moveColumn(this.jTableDatosEstadoDepreActi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDepreActi.moveColumn(this.jTableDatosEstadoDepreActi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadodepreactiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoDepreActi.moveColumn(this.jTableDatosEstadoDepreActi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDepreActi.moveColumn(this.jTableDatosEstadoDepreActi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDepreActi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDepreActi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDepreActi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDepreActi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDepreActi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDepreActi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDepreActi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDepreActi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodepreactiLogic.getEstadoDepreActis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodepreactis.size()-1;
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
		//this.jTableDatosEstadoDepreActi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDepreActi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDepreActi();
			
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
				
				//this.isEsNuevoEstadoDepreActi=false;
					
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
				if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDepreActi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDepreActi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDepreActi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodepreacti.getsType().equals("DUPLICADO")
				   || this.estadodepreacti.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDepreActi=true;
				
				} else {
					this.isEsNuevoEstadoDepreActi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodepreacti.getId()>=0 && !this.estadodepreacti.getIsNew()) {						
						this.isEsNuevoEstadoDepreActi=false;
						
					} else {
						this.isEsNuevoEstadoDepreActi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDepreActi(esRelaciones);						
				
				this.seleccionarEstadoDepreActi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodepreacti.getId()<0) {
					this.isEsNuevoEstadoDepreActi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDepreActi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDepreActi(evt,rowIndex);
				}	
				
				if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDepreActi: " + this.dDif); 
					}
				}								
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDepreActi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodepreacti)) {
					if(this.estadodepreacti.getId()>0) {
						this.estadodepreacti.setIsDeleted(true);
						
						this.estadodepreactisEliminados.add(this.estadodepreacti);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodepreactiLogic.getEstadoDepreActis().remove(this.estadodepreacti);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodepreactis.remove(this.estadodepreacti);				
					}
					
					
					((EstadoDepreActiModel) this.jTableDatosEstadoDepreActi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDepreActi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDepreActi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDepreActi) {
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDepreActi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDepreActi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDepreActi(this.estadodepreacti);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDepreActi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDepreActi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDepreActi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDepreActi(EstadoDepreActi estadodepreacti) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDepreActi(estadodepreacti,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDepreActi(EstadoDepreActi estadodepreacti,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDepreActi(estadodepreacti);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDepreActi(estadodepreacti,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDepreActi(estadodepreacti);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDepreActi(EstadoDepreActi estadodepreacti) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.setText(estadodepreacti.getId().toString());
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.setText(estadodepreacti.getcodigo());
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.setText(estadodepreacti.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDepreActi estadodepreactiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodepreactiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDepreActi estadodepreactiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodepreactiLocal=this.estadodepreacti;
			} else {
				estadodepreactiLocal=this.estadodepreactiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodepreactiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDepreActi(estadodepreactiLocal,true);
					
					if(estadodepreactiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodepreactiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodepreactiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDepreActi(EstadoDepreActi estadodepreacti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDepreActi(estadodepreacti,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(estadodepreacti);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDepreActi(EstadoDepreActi estadodepreacti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDepreActi(estadodepreacti,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDepreActi(EstadoDepreActi estadodepreacti,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.getText()==null || this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.getText()=="" || this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.setText("0");
			}

			if(conColumnasBase) {estadodepreacti.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDepreActiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDepreActi.jLabelIdEstadoDepreActi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodepreacti.setcodigo(this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDepreActiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDepreActi.jLabelcodigoEstadoDepreActi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodepreacti.setnombre(this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDepreActiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDepreActi.jLabelnombreEstadoDepreActi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDepreActi(EstadoDepreActi estadodepreactiBean,EstadoDepreActi estadodepreacti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDepreActi(EstadoDepreActi estadodepreactiOrigen,EstadoDepreActi estadodepreacti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodepreactiOrigen.getId()!=null && !estadodepreactiOrigen.getId().equals(0L))) {estadodepreacti.setId(estadodepreactiOrigen.getId());}}
			if(conDefault || (!conDefault && estadodepreactiOrigen.getcodigo()!=null && !estadodepreactiOrigen.getcodigo().equals(""))) {estadodepreacti.setcodigo(estadodepreactiOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodepreactiOrigen.getnombre()!=null && !estadodepreactiOrigen.getnombre().equals(""))) {estadodepreacti.setnombre(estadodepreactiOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDepreActi(EstadoDepreActi estadodepreacti) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.setText(estadodepreacti.getId().toString());
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.setText(estadodepreacti.getcodigo());
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.setText(estadodepreacti.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDepreActi(EstadoDepreActiBean estadodepreactiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.setText(estadodepreactiBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.setText(estadodepreactiBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.setText(estadodepreactiBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDepreActi(EstadoDepreActiParameterReturnGeneral estadodepreactiReturnGeneral,EstadoDepreActiBean estadodepreactiBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDepreActi estadodepreactiLocal=new EstadoDepreActi();
			
			estadodepreactiLocal=estadodepreactiReturnGeneral.getEstadoDepreActi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodepreactiLocal.getId()!=null && !estadodepreactiLocal.getId().equals(0L))) {estadodepreactiBean.setId(estadodepreactiLocal.getId());}}
			if(conDefault || (!conDefault && estadodepreactiLocal.getcodigo()!=null && !estadodepreactiLocal.getcodigo().equals(""))) {estadodepreactiBean.setcodigo(estadodepreactiLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodepreactiLocal.getnombre()!=null && !estadodepreactiLocal.getnombre().equals(""))) {estadodepreactiBean.setnombre(estadodepreactiLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDepreActiGenerico(Long idEstadoDepreActiSeleccionado,JComboBox jComboBoxEstadoDepreActi,List<EstadoDepreActi> estadodepreactisLocal)throws Exception {
		try {
			EstadoDepreActi  estadodepreactiTemp=null;

			for(EstadoDepreActi estadodepreactiAux:estadodepreactisLocal) {
				if(estadodepreactiAux.getId()!=null && estadodepreactiAux.getId().equals(idEstadoDepreActiSeleccionado)) {
					estadodepreactiTemp=estadodepreactiAux;
					break;
				}
			}

			jComboBoxEstadoDepreActi.setSelectedItem(estadodepreactiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDepreActiGenerico(JComboBox jComboBoxEstadoDepreActi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDepreActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDepreActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDepreActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDepreActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDepreActi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDepreActi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDepreActi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDepreActi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDepreActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDepreActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DepreciacionActivoFijo")) {
			jButtonDepreciacionActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodepreacti=(EstadoDepreActi) estadodepreactiLogic.getEstadoDepreActis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodepreacti =(EstadoDepreActi) estadodepreactis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDepreActi estadodepreactiRow=new EstadoDepreActi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodepreactiRow=(EstadoDepreActi) estadodepreactiLogic.getEstadoDepreActis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodepreactiRow=(EstadoDepreActi) estadodepreactis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDepreciacionActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoDepreActi estadodepreacti) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoDepreActi==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodepreacti = (EstadoDepreActi)this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadodepreacti = (EstadoDepreActi)this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadodepreacti!=null) {
						this.estadodepreacti = estadodepreacti;
					} else {
						this.estadodepreacti = new EstadoDepreActi();
					}
				}

				if(this.isTienePermisosDepreciacionActivoFijo && this.permiteMantenimiento(this.estadodepreacti)) {
					DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFramePopup=new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						depreciacionactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFramePopup;
					} else {
						depreciacionactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame;
					}

					List<EstadoDepreActi> estadodepreactis=new ArrayList<EstadoDepreActi>();
					estadodepreactis.add(this.estadodepreacti);
					if(!esRelacionado) {
						//depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setConGuardarRelaciones(false);
						//depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					depreciacionactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoDepreActi.cargarDepreciacionActivoFijoBeanSwingJInternalFrame(estadodepreactis,this.estadodepreacti,depreciacionactivofijoBeanSwingJInternalFrame,/*conInicializar,*/depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getConGuardarRelaciones(),depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
					depreciacionactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("no_relacionado");

						depreciacionactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DepreciacionActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DepreciacionActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						depreciacionactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoDepreActi=(TitledBorder)this.jScrollPanelDatosEstadoDepreActi.getBorder();
						TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.getBorder();

						titledBorderDepreciacionActivoFijo.setTitle(titledBorderEstadoDepreActi.getTitle() + " -> Depreciacion Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,depreciacionactivofijoBeanSwingJInternalFrame);
						}

						depreciacionactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(depreciacionactivofijoBeanSwingJInternalFrame);

						depreciacionactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Depreciacion Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDepreActi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi));			
			this.jButtonDuplicarEstadoDepreActi.setVisible((this.isVisibilidadCeldaDuplicarEstadoDepreActi && this.isPermisoDuplicarEstadoDepreActi));			
			this.jButtonCopiarEstadoDepreActi.setVisible((this.isVisibilidadCeldaCopiarEstadoDepreActi && this.isPermisoCopiarEstadoDepreActi));
			this.jButtonVerFormEstadoDepreActi.setVisible((this.isVisibilidadCeldaVerFormEstadoDepreActi && this.isPermisoVerFormEstadoDepreActi));
			
			this.jButtonAbrirOrderByEstadoDepreActi.setVisible((this.isVisibilidadCeldaOrdenEstadoDepreActi && this.isPermisoOrdenEstadoDepreActi));			
			
			this.jButtonNuevoRelacionesEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi));			
			this.jButtonNuevoGuardarCambiosEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarEstadoDepreActi.setVisible((this.isVisibilidadCeldaModificarEstadoDepreActi && this.isPermisoActualizarEstadoDepreActi));	
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarEstadoDepreActi.setVisible((this.isVisibilidadCeldaActualizarEstadoDepreActi && this.isPermisoActualizarEstadoDepreActi));	
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarEstadoDepreActi.setVisible((this.isVisibilidadCeldaEliminarEstadoDepreActi && this.isPermisoEliminarEstadoDepreActi));
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarEstadoDepreActi.setVisible(this.isVisibilidadCeldaCancelarEstadoDepreActi);							
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.setVisible((this.isVisibilidadCeldaGuardarEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDepreActi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi));						
			this.jButtonDuplicarToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaDuplicarEstadoDepreActi && this.isPermisoDuplicarEstadoDepreActi));						
			this.jButtonCopiarToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaCopiarEstadoDepreActi && this.isPermisoCopiarEstadoDepreActi));			
			this.jButtonVerFormToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaVerFormEstadoDepreActi && this.isPermisoVerFormEstadoDepreActi));			
			this.jButtonAbrirOrderByToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaOrdenEstadoDepreActi && this.isPermisoOrdenEstadoDepreActi));
			this.jButtonNuevoRelacionesToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));			
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaModificarEstadoDepreActi && this.isPermisoActualizarEstadoDepreActi));	
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaActualizarEstadoDepreActi  && this.isPermisoActualizarEstadoDepreActi));	
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaEliminarEstadoDepreActi && this.isPermisoEliminarEstadoDepreActi));
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarToolBarEstadoDepreActi.setVisible(this.isVisibilidadCeldaCancelarEstadoDepreActi);				
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaGuardarEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDepreActi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi));			
			this.jMenuItemDuplicarEstadoDepreActi.setVisible((this.isVisibilidadCeldaDuplicarEstadoDepreActi && this.isPermisoDuplicarEstadoDepreActi));			
			this.jMenuItemCopiarEstadoDepreActi.setVisible((this.isVisibilidadCeldaCopiarEstadoDepreActi && this.isPermisoCopiarEstadoDepreActi));			
			this.jMenuItemVerFormEstadoDepreActi.setVisible((this.isVisibilidadCeldaVerFormEstadoDepreActi && this.isPermisoVerFormEstadoDepreActi));			
			this.jMenuItemAbrirOrderByEstadoDepreActi.setVisible((this.isVisibilidadCeldaOrdenEstadoDepreActi && this.isPermisoOrdenEstadoDepreActi));			
			//this.jMenuItemMostrarOcultarEstadoDepreActi.setVisible((this.isVisibilidadCeldaOrdenEstadoDepreActi && this.isPermisoOrdenEstadoDepreActi));
			this.jMenuItemDetalleAbrirOrderByEstadoDepreActi.setVisible((this.isVisibilidadCeldaOrdenEstadoDepreActi && this.isPermisoOrdenEstadoDepreActi));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDepreActi.setVisible((this.isVisibilidadCeldaOrdenEstadoDepreActi && this.isPermisoOrdenEstadoDepreActi));			
			this.jMenuItemNuevoRelacionesEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi));			
			this.jMenuItemNuevoGuardarCambiosEstadoDepreActi.setVisible((this.isVisibilidadCeldaNuevoEstadoDepreActi && this.isPermisoNuevoEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));									
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemModificarEstadoDepreActi.setVisible((this.isVisibilidadCeldaModificarEstadoDepreActi && this.isPermisoActualizarEstadoDepreActi));	
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemActualizarEstadoDepreActi.setVisible((this.isVisibilidadCeldaActualizarEstadoDepreActi && this.isPermisoActualizarEstadoDepreActi));	
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemEliminarEstadoDepreActi.setVisible((this.isVisibilidadCeldaEliminarEstadoDepreActi && this.isPermisoEliminarEstadoDepreActi));
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemCancelarEstadoDepreActi.setVisible(this.isVisibilidadCeldaCancelarEstadoDepreActi);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDepreActi.setVisible((this.isVisibilidadCeldaGuardarEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));						
			this.jMenuItemGuardarCambiosTablaEstadoDepreActi.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=this.jButtonNuevoEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDepreActi=this.jButtonDuplicarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDepreActi=this.jButtonCopiarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDepreActi=this.jButtonVerFormEstadoDepreActi.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDepreActi=this.jButtonAbrirOrderByEstadoDepreActi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=this.jButtonNuevoRelacionesEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaModificarEstadoDepreActi=this.jButtonModificarEstadoDepreActi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.isVisibilidadCeldaActualizarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=this.jButtonGuardarCambiosTablaEstadoDepreActi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDepreActi=this.jButtonNuevoToolBarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=this.jButtonNuevoRelacionesToolBarEstadoDepreActi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.isVisibilidadCeldaModificarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarToolBarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarToolBarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarToolBarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarToolBarEstadoDepreActi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDepreActi=this.jButtonGuardarCambiosToolBarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=this.jButtonGuardarCambiosTablaToolBarEstadoDepreActi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDepreActi=this.jMenuItemNuevoEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=this.jMenuItemNuevoRelacionesEstadoDepreActi.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.isVisibilidadCeldaModificarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemModificarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemActualizarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemEliminarEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDepreActi=this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemCancelarEstadoDepreActi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDepreActi=this.jMenuItemGuardarCambiosEstadoDepreActi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=this.jMenuItemGuardarCambiosTablaEstadoDepreActi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDepreActi(Boolean esInicializar) {
		if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDepreActi();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDepreActi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDepreActi() {
		this.jButtonNuevoEstadoDepreActi.setVisible(this.isPermisoNuevoEstadoDepreActi);			
		this.jButtonDuplicarEstadoDepreActi.setVisible(this.isPermisoDuplicarEstadoDepreActi);			
		this.jButtonCopiarEstadoDepreActi.setVisible(this.isPermisoCopiarEstadoDepreActi);			
		this.jButtonVerFormEstadoDepreActi.setVisible(this.isPermisoVerFormEstadoDepreActi);			
		
		this.jButtonAbrirOrderByEstadoDepreActi.setVisible(this.isPermisoOrdenEstadoDepreActi);					
		
		this.jButtonNuevoRelacionesEstadoDepreActi.setVisible(this.isPermisoNuevoEstadoDepreActi);			
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarEstadoDepreActi.setVisible(this.isPermisoActualizarEstadoDepreActi);	
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarEstadoDepreActi.setVisible(this.isPermisoActualizarEstadoDepreActi);	
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarEstadoDepreActi.setVisible(this.isPermisoEliminarEstadoDepreActi);
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarEstadoDepreActi.setVisible(this.isVisibilidadCeldaCancelarEstadoDepreActi);						
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.setVisible(this.isPermisoGuardarCambiosEstadoDepreActi);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi.setVisible(this.isPermisoActualizarEstadoDepreActi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDepreActi() {
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarEstadoDepreActi.setVisible(this.isPermisoActualizarEstadoDepreActi);	
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarEstadoDepreActi.setVisible(this.isPermisoActualizarEstadoDepreActi);	
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarEstadoDepreActi.setVisible(this.isPermisoEliminarEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarEstadoDepreActi.setVisible(this.isVisibilidadCeldaCancelarEstadoDepreActi);							
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.setVisible((this.isVisibilidadCeldaGuardarEstadoDepreActi && this.isPermisoGuardarCambiosEstadoDepreActi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDepreActi() {
		if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDepreActi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDepreActi() {
	}
	
	public void jTableDatosEstadoDepreActiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDepreActi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDepreActiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.getestadodepreacti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodepreacti==null) {
						this.estadodepreacti = new EstadoDepreActi();
					}

					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
				}

				if(this.estadodepreacti.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodepreacti.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDepreActi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDepreActiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.getestadodepreacti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodepreacti==null) {
						this.estadodepreacti = new EstadoDepreActi();
					}

					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
				}

				if(this.estadodepreacti.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodepreacti.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDepreActi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDepreActiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.getestadodepreacti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodepreacti==null) {
						this.estadodepreacti = new EstadoDepreActi();
					}

					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);
				}

				if(this.estadodepreacti.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodepreacti.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDepreActi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDepreActi() {
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
			this.jInternalFrameDetalleFormEstadoDepreActi.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDepreActi.dispose();
			this.jInternalFrameDetalleFormEstadoDepreActi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
			this.jInternalFrameReporteDinamicoEstadoDepreActi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDepreActi.dispose();
			this.jInternalFrameReporteDinamicoEstadoDepreActi=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDepreActi!=null) {
			this.jInternalFrameImportacionEstadoDepreActi.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDepreActi.dispose();
			this.jInternalFrameImportacionEstadoDepreActi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDepreActi();
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDepreActi")) {
				jButtonDuplicarEstadoDepreActiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDepreActi")) {
				jButtonCopiarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDepreActi")) {
				jButtonVerFormEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDepreActi")) {
				jButtonDuplicarEstadoDepreActiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDepreActi")) {
				jButtonDuplicarEstadoDepreActiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDepreActi")) {
				jButtonModificarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDepreActi")) {
				jButtonModificarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDepreActi")) {
				jButtonModificarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDepreActi")) {
				jButtonActualizarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDepreActi")) {
				jButtonActualizarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDepreActi")) {
				jButtonActualizarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDepreActi")) {
				jButtonEliminarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDepreActi")) {
				jButtonEliminarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDepreActi")) {
				jButtonEliminarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDepreActi")) {
				jButtonCancelarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDepreActi")) {
				jButtonCancelarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDepreActi")) {
				jButtonCancelarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDepreActi")) {
				jButtonCerrarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDepreActi")) {
				jButtonCerrarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDepreActi")) {
				jButtonCerrarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDepreActi")) {
				jButtonMostrarOcultarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDepreActi")) {
				jButtonCancelarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDepreActi")) {
				jButtonCopiarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDepreActi")) {
				jButtonVerFormEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDepreActi")) {
				jButtonCopiarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDepreActi")) {
				jButtonVerFormEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDepreActi")) {
				jButtonRecargarInformacionEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDepreActi")) {
				jButtonRecargarInformacionEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDepreActi")) {
				jButtonRecargarInformacionEstadoDepreActiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDepreActi")) {
				jButtonAnterioresEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDepreActi")) {
				jButtonAnterioresEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDepreActi")) {
				jButtonAnterioresEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDepreActi")) {
				jButtonSiguientesEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDepreActi")) {
				jButtonSiguientesEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDepreActi")) {
				jButtonSiguientesEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDepreActi") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDepreActi")) {
				jButtonAbrirOrderByEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDepreActi") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDepreActi")) {
				jButtonMostrarOcultarEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDepreActi")) {
				jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDepreActi")) {
				jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDepreActi")) {
				jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDepreActi")) {
				jButtonCerrarReporteDinamicoEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDepreActi")) {
				jButtonGenerarReporteDinamicoEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDepreActi")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDepreActi")) {
				jButtonCerrarImportacionEstadoDepreActiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDepreActi")) {
				
				jButtonGenerarImportacionEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDepreActi")) {
				
				jButtonAbrirImportacionEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDepreActi")) {
				jComboBoxTiposAccionesEstadoDepreActiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDepreActi")) {
				jComboBoxTiposRelacionesEstadoDepreActiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDepreActi")) {
				jComboBoxTiposAccionesEstadoDepreActiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDepreActi")) {
				
				jComboBoxTiposSeleccionarEstadoDepreActiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDepreActi")) {
				jTextFieldValorCampoGeneralEstadoDepreActiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDepreActi")) {
				jButtonAbrirOrderByEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDepreActi")) {
				jButtonAbrirOrderByEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDepreActi")) {
				jButtonCerrarOrderByEstadoDepreActiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDepreActiBusqueda")) {
				this.jButtonidEstadoDepreActiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDepreActiBusqueda")) {
				this.jButtoncodigoEstadoDepreActiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDepreActiBusqueda")) {
				this.jButtonnombreEstadoDepreActiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDepreActi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDepreActiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDepreActi estadodepreactiLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodepreactiLocal=this.estadodepreacti;
			} else {
				estadodepreactiLocal=this.estadodepreactiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
							
				
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
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
			
			


			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDepreActiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
								
						
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
								
				
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
							
				
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDepreActiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
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
			
			


			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
								
				
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDepreActiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDepreActi")) {
					jCheckBoxSeleccionarTodosEstadoDepreActiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDepreActi")) {
					jCheckBoxSeleccionadosEstadoDepreActiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDepreActi")) {
					
				}
				
				


				
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
												
				
				


				
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDepreActiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDepreActiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
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
			
			


			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDepreActiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodepreacti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodepreacti);
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
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
				
				


				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDepreActi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDepreActi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDepreActiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodepreactiAnterior =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDepreActi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDepreActiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDepreActi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodepreacti =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodepreacti =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodepreacti);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDepreActi")) {
				
				}
				
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDepreActi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDepreActi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDepreActi")) {
			
			}
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDepreActi();
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDepreActi")) {
				jButtonDuplicarEstadoDepreActiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDepreActi")) {
				jButtonCopiarEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDepreActi")) {
				jButtonVerFormEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDepreActi")) {
				jButtonNuevoEstadoDepreActiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDepreActi")) {
				jButtonModificarEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDepreActi")) {
				jButtonActualizarEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDepreActi")) {
				jButtonEliminarEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDepreActi")) {
				jButtonCancelarEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDepreActi")) {
				jButtonCerrarEstadoDepreActiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDepreActi")) {
				jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDepreActi")) {
				jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDepreActi")) {
				jButtonAbrirOrderByEstadoDepreActiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDepreActi")) {
				jButtonRecargarInformacionEstadoDepreActiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDepreActi")) {
				jButtonAnterioresEstadoDepreActiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDepreActi")) {
				jButtonSiguientesEstadoDepreActiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDepreActiBusqueda")) {
				this.jButtonidEstadoDepreActiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDepreActiBusqueda")) {
				this.jButtoncodigoEstadoDepreActiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDepreActiBusqueda")) {
				this.jButtonnombreEstadoDepreActiBusquedaActionPerformed(evt);
			}
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDepreActi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDepreActi")) {
				closingInternalFrameEstadoDepreActi();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDepreActi")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDepreActi = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDepreActiBeanSwingJInternalFrame jInternalFrameParent=(EstadoDepreActiBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDepreActi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDepreActiActionPerformed(null);
			}
			
			EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodepreacti,new Object(),this.estadodepreactiParameterGeneral,this.estadodepreactiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDepreActi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDepreActi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDepreActi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodepreacti)) {
			if(!esControlTabla) {
				if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);			
				}
				
				if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDepreActi(this.estadodepreacti,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodepreactiReturnGeneral=estadodepreactiLogic.procesarEventosEstadoDepreActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodepreactiLogic.getEstadoDepreActis(),this.estadodepreacti,this.estadodepreactiParameterGeneral,this.isEsNuevoEstadoDepreActi,classes);//this.estadodepreactiLogic.getEstadoDepreActi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDepreActi(this.estadodepreactiReturnGeneral,this.estadodepreactiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDepreActi(classes,this.estadodepreactiReturnGeneral,this.estadodepreactiBean,false);
					}
						
					if(this.estadodepreactiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDepreActi(this.estadodepreactiReturnGeneral.getEstadoDepreActi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDepreActi(this.estadodepreactiReturnGeneral.getEstadoDepreActi());	
					}
						
					if(this.estadodepreactiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDepreActi(this.estadodepreactiReturnGeneral.getEstadoDepreActi(),classes);//this.estadodepreactiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDepreActi(this.estadodepreacti,classes);//this.estadodepreactiBean);									
				}
			
				if(EstadoDepreActiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDepreActi(this.estadodepreacti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDepreActi(this.estadodepreacti);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodepreactiAnterior!=null) {
						this.estadodepreacti=this.estadodepreactiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodepreactiReturnGeneral=estadodepreactiLogic.procesarEventosEstadoDepreActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodepreactiLogic.getEstadoDepreActis(),this.estadodepreacti,this.estadodepreactiParameterGeneral,this.isEsNuevoEstadoDepreActi,classes);//this.estadodepreactiLogic.getEstadoDepreActi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodepreactiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodepreactiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodepreactiReturnGeneral.getEstadoDepreActi(),estadodepreactiLogic.getEstadoDepreActis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodepreactiReturnGeneral.getEstadoDepreActi(),this.estadodepreactis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDepreActi.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDepreActi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDepreActi();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDepreActi() throws Exception {
		
		EstadoDepreActiModel estadodepreactiModel=(EstadoDepreActiModel)this.jTableDatosEstadoDepreActi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodepreactiModel.estadodepreactis=this.estadodepreactiLogic.getEstadoDepreActis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodepreactiModel.estadodepreactis=this.estadodepreactis;
		}
		
		
		((EstadoDepreActiModel) this.jTableDatosEstadoDepreActi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDepreActi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodepreactiAnterior(),this.estadodepreactiLogic.getEstadoDepreActis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodepreactiAnterior(),this.estadodepreactis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDepreActi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDepreActi(EstadoDepreActi estadodepreacti,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DepreciacionActivoFijo.class)) {
					this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.setDepreciacionActivoFijos(estadodepreacti.getDepreciacionActivoFijos());
					this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
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
										
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodepreacti,new Object(),generalEntityParameterGeneral,this.estadodepreactiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodepreactiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDepreActiConstantesFunciones.getClassesRelationshipsOfEstadoDepreActi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDepreActiConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDepreActi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDepreActi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDepreActiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodepreacti,new Object(),generalEntityParameterGeneral,this.estadodepreactiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDepreActi(EstadoDepreActiBean estadodepreactiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DepreciacionActivoFijo.class)) {
					this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.setDepreciacionActivoFijos(estadodepreacti.getDepreciacionActivoFijos());
					this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDepreActi(ArrayList<Classe> classes,EstadoDepreActiReturnGeneral estadodepreactiReturnGeneral,EstadoDepreActiBean estadodepreactiBean,Boolean conDefault) throws Exception {
		
			this.estadodepreactiBean.setDepreciacionActivoFijos(estadodepreactiReturnGeneral.getEstadoDepreActi().getDepreciacionActivoFijos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDepreActi(EstadoDepreActi estadodepreacti,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DepreciacionActivoFijo.class)) {
					estadodepreacti.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadodepreacti)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDepreActi = new EstadoDepreActiDetalleFormJInternalFrame(jDesktopPane,this.estadodepreactiSessionBean.getConGuardarRelaciones(),this.estadodepreactiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDepreActi.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDepreActi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDepreActi.estadodepreactiLogic=this.estadodepreactiLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDepreActi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDepreActi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDepreActi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDepreActi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDepreActi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDepreActi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDepreActi"));
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"ModificarEstadoDepreActi"));

		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarToolBarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDepreActi"));
					
		this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemModificarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDepreActi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDepreActi"));
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarToolBarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDepreActi"));
						
		this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemActualizarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDepreActi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"EliminarEstadoDepreActi"));
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDepreActi"));
								
		this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemEliminarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDepreActi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CancelarEstadoDepreActi"));
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDepreActi"));
					
		this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemCancelarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDepreActi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemDetalleCerrarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDepreActi"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDepreActi"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDepreActi"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDepreActi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonidEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDepreActiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtoncodigoEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDepreActiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonnombreEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDepreActiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDepreActi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDepreActi"));
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDepreActi"));
		}
		
		this.jTableDatosEstadoDepreActi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDepreActi"));
		
		this.jTableDatosEstadoDepreActi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDepreActi"));
		
		this.jButtonNuevoEstadoDepreActi.addActionListener(new ButtonActionListener(this,"NuevoEstadoDepreActi"));
		
		this.jButtonDuplicarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDepreActi"));
		
		this.jButtonCopiarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"CopiarEstadoDepreActi"));
		
		this.jButtonVerFormEstadoDepreActi.addActionListener(new ButtonActionListener(this,"VerFormEstadoDepreActi"));
		
		
		this.jButtonNuevoToolBarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDepreActi"));
			
		this.jButtonDuplicarToolBarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDepreActi"));
			
		this.jMenuItemNuevoEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDepreActi"));
			
		this.jMenuItemDuplicarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDepreActi"));		
		
		
		this.jButtonNuevoRelacionesEstadoDepreActi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDepreActi"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDepreActi"));
			
		this.jMenuItemNuevoRelacionesEstadoDepreActi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDepreActi"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"ModificarEstadoDepreActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonModificarToolBarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDepreActi"));
			
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemModificarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDepreActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDepreActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonActualizarToolBarEstadoDepreActi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDepreActi"));
				
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemActualizarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDepreActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"EliminarEstadoDepreActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonEliminarToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDepreActi"));
						
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemEliminarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDepreActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CancelarEstadoDepreActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonCancelarToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDepreActi"));
			
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemCancelarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDepreActi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDepreActi"));		
		
		
		this.jButtonCerrarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CerrarEstadoDepreActi"));
		
		
		this.jButtonCerrarToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDepreActi"));
			
		this.jMenuItemCerrarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDepreActi"));
			
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jMenuItemDetalleCerrarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDepreActi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDepreActi"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDepreActi"));
		}
		
		this.jButtonCopiarToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDepreActi"));
			
		this.jButtonVerFormToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDepreActi"));
		
		this.jMenuItemGuardarCambiosEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDepreActi"));
			
		this.jMenuItemCopiarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDepreActi"));		
		
		this.jMenuItemVerFormEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDepreActi"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDepreActi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDepreActi"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDepreActi"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDepreActi.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDepreActi"));
					
		this.jButtonRecargarInformacionToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDepreActi"));
		
		this.jMenuItemRecargarInformacionEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDepreActi"));		
		
		
		
		this.jButtonAnterioresEstadoDepreActi.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDepreActi"));
		
		
		this.jButtonAnterioresToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDepreActi"));
		
		this.jMenuItemAnterioresEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDepreActi"));		
		
		
		this.jButtonSiguientesEstadoDepreActi.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDepreActi"));
		
		
		this.jButtonSiguientesToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDepreActi"));
			
		this.jMenuItemSiguientesEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDepreActi"));
			
		this.jMenuItemAbrirOrderByEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDepreActi"));
			
		this.jMenuItemMostrarOcultarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDepreActi"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDepreActi"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDepreActi"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDepreActi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDepreActi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDepreActi"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDepreActi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDepreActi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDepreActi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDepreActi"));

		this.jCheckBoxSeleccionadosEstadoDepreActi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDepreActi"));
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDepreActi"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDepreActi.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDepreActi"));
			
		this.jComboBoxTiposAccionesEstadoDepreActi.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDepreActi"));
					
		this.jComboBoxTiposSeleccionarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDepreActi"));
			
		this.jTextFieldValorCampoGeneralEstadoDepreActi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDepreActi"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonidEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDepreActiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtoncodigoEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDepreActiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonnombreEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDepreActiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDepreActi!=null) {
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDepreActi"));
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDepreActi"));
				this.jInternalFrameReporteDinamicoEstadoDepreActi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDepreActi"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDepreActi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDepreActi"));				
			//this.jButtonGenerarReporteDinamicoEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDepreActi"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDepreActi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDepreActi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDepreActi!=null) {
				this.jInternalFrameImportacionEstadoDepreActi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDepreActi"));
				this.jInternalFrameImportacionEstadoDepreActi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDepreActi"));
				this.jInternalFrameImportacionEstadoDepreActi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDepreActi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDepreActi.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDepreActi"));
			
			this.jButtonAbrirOrderByToolBarEstadoDepreActi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDepreActi"));			
			
			if(this.jInternalFrameOrderByEstadoDepreActi!=null) {
				this.jInternalFrameOrderByEstadoDepreActi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDepreActi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDepreActi.jTabbedPaneRelacionesEstadoDepreActi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDepreActi"));
		
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
            		closingInternalFrameEstadoDepreActi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDepreActi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDepreActi = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDepreActiBeanSwingJInternalFrame jInternalFrameParent=(EstadoDepreActiBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDepreActi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDepreActiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDepreActi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDepreActiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDepreActi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDepreActi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDepreActiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDepreActiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDepreActiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDepreActi";
		inputMap = this.jButtonNuevoEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDepreActiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDepreActiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDepreActiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDepreActiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDepreActi";
		inputMap = this.jButtonNuevoRelacionesEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDepreActiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDepreActi";
		inputMap = this.jButtonModificarEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDepreActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDepreActi";
		inputMap = this.jButtonActualizarEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDepreActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDepreActi";
		inputMap = this.jButtonEliminarEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDepreActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDepreActi";
		inputMap = this.jButtonCancelarEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDepreActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDepreActi";
		inputMap = this.jButtonCerrarEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDepreActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDepreActi";
		inputMap = this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonGuardarCambiosEstadoDepreActi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDepreActiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDepreActi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDepreActiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDepreActi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDepreActiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDepreActi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDepreActiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDepreActi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDepreActiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonidEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDepreActiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtoncodigoEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDepreActiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDepreActi.jButtonnombreEstadoDepreActiBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDepreActiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDepreActi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDepreActiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDepreActiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDepreActi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDepreActi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
					estadodepreactiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDepreActi estadodepreactiAux:estadodepreactis) {
					estadodepreactiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDepreActiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDepreActi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
						estadodepreactiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDepreActi estadodepreactiAux:estadodepreactis) {
						estadodepreactiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDepreActi estadodepreactiAux:estadodepreactis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDepreActi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDepreActi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDepreActi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDepreActi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDepreActiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDepreActi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDepreActi.getSelectedRows();
			
			EstadoDepreActi estadodepreactiLocal=new EstadoDepreActi();
			
			//this.seleccionarTodosEstadoDepreActi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodepreactiLocal =(EstadoDepreActi) this.estadodepreactiLogic.getEstadoDepreActis().toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodepreactiLocal =(EstadoDepreActi) this.estadodepreactis.toArray()[this.jTableDatosEstadoDepreActi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodepreactiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
						estadodepreactiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDepreActi estadodepreactiAux:estadodepreactis) {
						estadodepreactiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDepreActi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDepreActi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDepreActi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDepreActi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDepreActiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDepreActiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDepreActiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDepreActi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDepreActi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDepreActi estadodepreactiAux:this.estadodepreactiLogic.getEstadoDepreActis()) {
				
						if(sTipoSeleccionar.equals(EstadoDepreActiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodepreactiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodepreactiAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDepreActi estadodepreactiAux:estadodepreactis) {
					
						if(sTipoSeleccionar.equals(EstadoDepreActiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodepreactiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodepreactiAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDepreActi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDepreActiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDepreActi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDepreActi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDepreActi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDepreActi) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDepreActi(conSplash);
				
					this.generarReporteEstadoDepreActisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDepreActisSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDepreActisSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDepreActisSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDepreActi();
				
				this.exportarEstadoDepreActisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDepreActis();
				//this.importarEstadoDepreActis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDepreActi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDepreActisSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Depre Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDepreActi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDepreActi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDepreActi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoDepreActiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoDepreActi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoDepreActi(conSplash);
					
						//this.actualizarParametrosGeneralEstadoDepreActi();
						
						this.generarReporteProcesoAccionEstadoDepreActisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoDepreActiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Depre ActiS SELECCIONADOS?", "MANTENIMIENTO DE Estado Depre Acti", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoDepreActi();
				
						this.actualizarParametrosGeneralEstadoDepreActi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadodepreactiReturnGeneral=estadodepreactiLogic.procesarAccionEstadoDepreActisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadodepreactiLogic.getEstadoDepreActis(),this.estadodepreactiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoDepreActiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDepreActi();
					
					EstadoDepreActiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoDepreActiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoDepreActi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoDepreActi.jComboBoxTiposAccionesFormularioEstadoDepreActi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDepreActi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDepreActiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDepreActi();
			
			if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
			EstadoDepreActi estadodepreacti=new EstadoDepreActi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDepreActi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDepreActi.getSelectedItem();
			
			
			
			
			estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodepreactisSeleccionados.size()==1) {
				for(EstadoDepreActi estadodepreactiAux:estadodepreactisSeleccionados) {
					estadodepreacti=estadodepreactiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Depreciacion Activo Fijo")) {
					jButtonDepreciacionActivoFijoActionPerformed(null,rowIndex,true,false,estadodepreacti);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDepreActi();
			
      		//this.finishProcessEstadoDepreActi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDepreActiReturnGeneral() throws Exception {
		if(this.estadodepreactiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodepreactiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodepreactiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodepreactiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodepreactiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodepreactiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDepreActi(false);
		}
		
		if(this.estadodepreactiReturnGeneral.getConRetornoLista() || this.estadodepreactiReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodepreactiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodepreactiLogic.setEstadoDepreActis(this.estadodepreactiReturnGeneral.getEstadoDepreActis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodepreactiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodepreactiLogic.setEstadoDepreActi(this.estadodepreactiReturnGeneral.getEstadoDepreActi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDepreActi(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDepreActi() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDepreActi> getEstadoDepreActisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDepreActi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDepreActi estadodepreactiAux:estadodepreactiLogic.getEstadoDepreActis()) {
					if(estadodepreactiAux.getIsSelected()) {
						estadodepreactisSeleccionados.add(estadodepreactiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDepreActi estadodepreactiAux:this.estadodepreactis) {
					if(estadodepreactiAux.getIsSelected()) {
						estadodepreactisSeleccionados.add(estadodepreactiAux);				
					}
				}
			}
			
			if(estadodepreactisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodepreactisSeleccionados.addAll(this.estadodepreactiLogic.getEstadoDepreActis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodepreactisSeleccionados.addAll(this.estadodepreactis);				
					}
				}
			}
		} else {
			estadodepreactisSeleccionados.add(this.estadodepreacti);
		}
		
		return estadodepreactisSeleccionados;
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
	
	public void generarReporteEstadoDepreActisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDepreActisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDepreActisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDepreActisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDepreActisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoDepreActisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Depre Acti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDepreActisSeleccionados() throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDepreActis("Todos",estadodepreactisSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDepreActisSeleccionados() throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDepreActis("Todos",estadodepreactisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDepreActisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDepreActis("Todos",estadodepreactisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDepreActisSeleccionados() throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDepreActi();
		
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDepreActi();
		
		
		//this.generarReporteEstadoDepreActis("Todos",estadodepreactisSeleccionados ,estadodepreactiImplementable,estadodepreactiImplementableHome);
	}
	
	public void mostrarImportacionEstadoDepreActis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDepreActi();
		
		this.abrirFrameImportacionEstadoDepreActi();		
		
			
		//this.generarReporteEstadoDepreActis("Todos",estadodepreactisSeleccionados ,estadodepreactiImplementable,estadodepreactiImplementableHome);
	}
	
	public void importarEstadoDepreActis() throws Exception {		
	
	}
	
	public void exportarEstadoDepreActisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDepreActisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDepreActisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDepreActisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Depre Acti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDepreActisSeleccionados() throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodepreacti."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDepreActi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDepreActi estadodepreactiAux:estadodepreactisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDepreActi(estadodepreactiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodepreactiAux.setsDetalleGeneralEntityReporte(estadodepreactiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDepreActi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDepreActiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDepreActiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDepreActiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDepreActiConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDepreActi(EstadoDepreActi estadodepreacti,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodepreacti.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodepreacti.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodepreacti.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodepreacti.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDepreActisSeleccionados() throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodepreacti.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDepreActis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDepreActi(row);				
				iRow++;
			}				
			
			for(EstadoDepreActi estadodepreactiAux:estadodepreactisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDepreActi(estadodepreactiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDepreActisSeleccionados() throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();		
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodepreacti.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodepreactis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodepreacti");
			//elementRoot.appendChild(element);
		
			for(EstadoDepreActi estadodepreactiAux:estadodepreactisSeleccionados) {
				element = document.createElement("estadodepreacti");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDepreActi(estadodepreactiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Depre Acti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDepreActi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDepreActi(EstadoDepreActi estadodepreacti,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodepreacti.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodepreacti.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodepreacti.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDepreActi(EstadoDepreActi estadodepreacti,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDepreActiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodepreacti.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDepreActiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodepreacti.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDepreActiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodepreacti.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDepreActiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodepreacti.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDepreActisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDepreActi> estadodepreactisSeleccionados=new ArrayList<EstadoDepreActi>();
		
		estadodepreactisSeleccionados=this.getEstadoDepreActisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDepreActi(estadodepreactisSeleccionados);
		
		this.generarReporteEstadoDepreActis("Todos",estadodepreactisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDepreActi(ArrayList<EstadoDepreActi> estadodepreactisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDepreActi estadodepreactiAux:estadodepreactisSeleccionados) {
				estadodepreactiAux.setsDetalleGeneralEntityReporte(estadodepreactiAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDepreActiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodepreactiAux.setsDescripcionGeneralEntityReporte1(estadodepreactiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDepreActiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodepreactiAux.setsDescripcionGeneralEntityReporte1(estadodepreactiAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDepreActiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDepreActi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDepreActi=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDepreActi=false;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=false;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
			this.isVisibilidadCeldaModificarEstadoDepreActi=false;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=true;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
			this.isVisibilidadCeldaModificarEstadoDepreActi=false;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=true;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=true;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
			this.isVisibilidadCeldaModificarEstadoDepreActi=false;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=true;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=true;
			this.isVisibilidadCeldaModificarEstadoDepreActi=false;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=false;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=false;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
			this.isVisibilidadCeldaModificarEstadoDepreActi=true;
			this.isVisibilidadCeldaActualizarEstadoDepreActi=false;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
			this.isVisibilidadCeldaCancelarEstadoDepreActi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDepreActi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDepreActiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDepreActi=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=true;
		} else {
			this.actualizarEstadoPanelsEstadoDepreActi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDepreActi=false;
			//this.isVisibilidadCeldaVerFormEstadoDepreActi=false;
			this.isVisibilidadCeldaDuplicarEstadoDepreActi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodepreactiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodepreactiSessionBean.getEsGuardarRelacionado()) {
			if(!estadodepreactiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;												
			}
			
			this.jButtonCerrarEstadoDepreActi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDepreActi=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodepreacti)) {
			this.isVisibilidadCeldaActualizarEstadoDepreActi=false;
			this.isVisibilidadCeldaEliminarEstadoDepreActi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDepreActi() {
		this.isVisibilidadCeldaNuevoEstadoDepreActi=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoDepreActi=false;
	}
	
	public void actualizarEstadoPanelsEstadoDepreActi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDepreActi!=null) {
				this.jScrollPanelDatosEdicionEstadoDepreActi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDepreActi!=null) {
				this.jScrollPanelDatosEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDepreActi!=null) {
				this.jPanelPaginacionEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDepreActi!=null) {
				this.jPanelParametrosReportesEstadoDepreActi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDepreActi!=null) {
				this.jScrollPanelDatosEdicionEstadoDepreActi.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDepreActi!=null) {
				this.jScrollPanelDatosEstadoDepreActi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDepreActi!=null) {
				this.jPanelPaginacionEstadoDepreActi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDepreActi!=null) {
				this.jPanelParametrosReportesEstadoDepreActi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDepreActi!=null) {
				this.jScrollPanelDatosEdicionEstadoDepreActi.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDepreActi!=null) {
				this.jScrollPanelDatosEstadoDepreActi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDepreActi!=null) {
				this.jPanelPaginacionEstadoDepreActi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDepreActi!=null) {
				this.jPanelParametrosReportesEstadoDepreActi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDepreActi!=null) {
				this.jScrollPanelDatosEdicionEstadoDepreActi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDepreActi!=null) {
				this.jScrollPanelDatosEstadoDepreActi.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDepreActi!=null) {
				this.jPanelPaginacionEstadoDepreActi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDepreActi!=null) {
				this.jPanelParametrosReportesEstadoDepreActi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDepreActi!=null) {
				this.jScrollPanelDatosEdicionEstadoDepreActi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDepreActi!=null) {
				this.jScrollPanelDatosEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDepreActi!=null) {
				this.jPanelPaginacionEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDepreActi!=null) {
				this.jPanelParametrosReportesEstadoDepreActi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDepreActi!=null) {
				this.jScrollPanelDatosEdicionEstadoDepreActi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDepreActi!=null) {
				this.jScrollPanelDatosEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDepreActi!=null) {
				this.jPanelPaginacionEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDepreActi!=null) {
				this.jPanelParametrosReportesEstadoDepreActi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDepreActi!=null) {
				this.jScrollPanelDatosEdicionEstadoDepreActi.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDepreActi!=null) {
				this.jScrollPanelDatosEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDepreActi!=null) {
				this.jPanelPaginacionEstadoDepreActi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDepreActi!=null) {
				this.jPanelParametrosReportesEstadoDepreActi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodepreactiSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoDepreActiParaDepreciacionActivoFijos() throws Exception {
		Boolean isPaginaPopupDepreciacionActivoFijo=false;

		try {

			if(this.estadodepreactiSessionBean==null) {
				this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean.setsPathNavegacionActual(estadodepreactiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDepreciacionActivoFijo=this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo(true);
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo(EstadoDepreActiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoDepreActi(true);
			this.jInternalFrameDetalleFormEstadoDepreActi.depreciacionactivofijoSessionBean.setlidEstadoDepreActiActual(this.idEstadoDepreActiActual);

			estadodepreactiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoDepreActi(true);
			estadodepreactiSessionBean.setlIdEstadoDepreActiActualForeignKey(this.idEstadoDepreActiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDepreActiSessionBean estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
		
		if(this.estadodepreactiSessionBean==null) {
			this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
		}
		
		this.estadodepreactiSessionBean.setsUltimaBusquedaEstadoDepreActi(this.getsAccionBusqueda());
		this.estadodepreactiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodepreactiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDepreActiSessionBean estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
		
		if(this.estadodepreactiSessionBean==null) {
			this.estadodepreactiSessionBean=new EstadoDepreActiSessionBean();
		}
		
		if(this.estadodepreactiSessionBean.getsUltimaBusquedaEstadoDepreActi()!=null&&!this.estadodepreactiSessionBean.getsUltimaBusquedaEstadoDepreActi().equals("")) {
			this.setsAccionBusqueda(estadodepreactiSessionBean.getsUltimaBusquedaEstadoDepreActi());
			this.setiNumeroPaginacion(estadodepreactiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodepreactiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodepreactiSessionBean.setsUltimaBusquedaEstadoDepreActi("");
		this.estadodepreactiSessionBean.setiNumeroPaginacion(EstadoDepreActiConstantesFunciones.INUMEROPAGINACION);
		this.estadodepreactiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDepreActi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDepreActi() {
		this.updateBorderResaltarBusquedasFormularioEstadoDepreActi();
		this.updateVisibilidadBusquedasFormularioEstadoDepreActi();
		this.updateHabilitarBusquedasFormularioEstadoDepreActi();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDepreActi() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDepreActi() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDepreActi() {
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
	
	public void updateControlesFormularioEstadoDepreActi() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDepreActi();
		this.updateVisibilidadResaltarControlesFormularioEstadoDepreActi();
		this.updateHabilitarResaltarControlesFormularioEstadoDepreActi();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDepreActi() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodepreactiConstantesFunciones.resaltaridEstadoDepreActi!=null && this.jInternalFrameDetalleFormEstadoDepreActi!=null) {this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.setBorder(this.estadodepreactiConstantesFunciones.resaltaridEstadoDepreActi);}
		if(this.estadodepreactiConstantesFunciones.resaltarcodigoEstadoDepreActi!=null && this.jInternalFrameDetalleFormEstadoDepreActi!=null) {this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.setBorder(this.estadodepreactiConstantesFunciones.resaltarcodigoEstadoDepreActi);}
		if(this.estadodepreactiConstantesFunciones.resaltarnombreEstadoDepreActi!=null && this.jInternalFrameDetalleFormEstadoDepreActi!=null) {this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.setBorder(this.estadodepreactiConstantesFunciones.resaltarnombreEstadoDepreActi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDepreActi() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.setVisible(this.estadodepreactiConstantesFunciones.mostraridEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.jPanelidEstadoDepreActi.setVisible(this.estadodepreactiConstantesFunciones.mostraridEstadoDepreActi);
		//this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.setVisible(this.estadodepreactiConstantesFunciones.mostrarcodigoEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.jPanelcodigoEstadoDepreActi.setVisible(this.estadodepreactiConstantesFunciones.mostrarcodigoEstadoDepreActi);
		//this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.setVisible(this.estadodepreactiConstantesFunciones.mostrarnombreEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.jPanelnombreEstadoDepreActi.setVisible(this.estadodepreactiConstantesFunciones.mostrarnombreEstadoDepreActi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDepreActi() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDepreActi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDepreActi!=null) {
	
		this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldidEstadoDepreActi.setEnabled(this.estadodepreactiConstantesFunciones.activaridEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.jTextFieldcodigoEstadoDepreActi.setEnabled(this.estadodepreactiConstantesFunciones.activarcodigoEstadoDepreActi);
		this.jInternalFrameDetalleFormEstadoDepreActi.jTextAreanombreEstadoDepreActi.setEnabled(this.estadodepreactiConstantesFunciones.activarnombreEstadoDepreActi);
		}
	}
	
		
}