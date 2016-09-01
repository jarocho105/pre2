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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.EstadoPoliticasClienteConstantesFunciones;
import com.bydan.erp.cartera.util.EstadoPoliticasClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.EstadoPoliticasClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.EstadoPoliticasClienteBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class EstadoPoliticasClienteBeanSwingJInternalFrame extends EstadoPoliticasClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoPoliticasClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoPoliticasCliente> estadopoliticasclienteValidator = new ClassValidator<EstadoPoliticasCliente>(EstadoPoliticasCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoPoliticasCliente estadopoliticascliente;	
	public EstadoPoliticasCliente estadopoliticasclienteAux;
	public EstadoPoliticasCliente estadopoliticasclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoPoliticasCliente estadopoliticasclienteTotales;
	public Long idEstadoPoliticasClienteActual;
	public Long iIdNuevoEstadoPoliticasCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosPoliticasCliente=false;

	public Boolean getIsTienePermisosPoliticasCliente() {
		return isTienePermisosPoliticasCliente;
	}

	public void setIsTienePermisosPoliticasCliente(Boolean isTienePermisosPoliticasCliente) {
		this.isTienePermisosPoliticasCliente= isTienePermisosPoliticasCliente;
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
	
	public Boolean isPermisoTodoEstadoPoliticasCliente;
	public Boolean isPermisoNuevoEstadoPoliticasCliente;
	public Boolean isPermisoActualizarEstadoPoliticasCliente;
	public Boolean isPermisoActualizarOriginalEstadoPoliticasCliente;
	public Boolean isPermisoEliminarEstadoPoliticasCliente;
	public Boolean isPermisoGuardarCambiosEstadoPoliticasCliente;
	public Boolean isPermisoConsultaEstadoPoliticasCliente;
	public Boolean isPermisoBusquedaEstadoPoliticasCliente;
	public Boolean isPermisoReporteEstadoPoliticasCliente;
	public Boolean isPermisoPaginacionMedioEstadoPoliticasCliente;
	public Boolean isPermisoPaginacionAltoEstadoPoliticasCliente;
	public Boolean isPermisoPaginacionTodoEstadoPoliticasCliente;
	public Boolean isPermisoCopiarEstadoPoliticasCliente;
	public Boolean isPermisoVerFormEstadoPoliticasCliente;
	public Boolean isPermisoDuplicarEstadoPoliticasCliente;
	public Boolean isPermisoOrdenEstadoPoliticasCliente;
	
	
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
	
	public EstadoPoliticasClienteParameterReturnGeneral estadopoliticasclienteReturnGeneral;
	public EstadoPoliticasClienteParameterReturnGeneral estadopoliticasclienteParameterGeneral;
	
	

	public PoliticasClienteLogic politicasclienteLogic=null;

	public PoliticasClienteLogic getPoliticasClienteLogic() {
		return politicasclienteLogic;
	}

	public void setPoliticasClienteLogic(PoliticasClienteLogic politicasclienteLogic) {
		this.politicasclienteLogic = politicasclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoPoliticasCliente=false;
	public Boolean esParaAccionDesdeFormularioEstadoPoliticasCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoPoliticasClienteSessionBeanAdditional estadopoliticasclienteSessionBeanAdditional=null;
	
	public EstadoPoliticasClienteSessionBeanAdditional getEstadoPoliticasClienteSessionBeanAdditional() {
		return this.estadopoliticasclienteSessionBeanAdditional;
	}
	
	public void setEstadoPoliticasClienteSessionBeanAdditional(EstadoPoliticasClienteSessionBeanAdditional estadopoliticasclienteSessionBeanAdditional) {
		try {
			this.estadopoliticasclienteSessionBeanAdditional=estadopoliticasclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoPoliticasClienteBeanSwingJInternalFrameAdditional estadopoliticasclienteBeanSwingJInternalFrameAdditional=null;
	//public class EstadoPoliticasClienteBeanSwingJInternalFrame
	
	public EstadoPoliticasClienteBeanSwingJInternalFrameAdditional getEstadoPoliticasClienteBeanSwingJInternalFrameAdditional() {
		return this.estadopoliticasclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoPoliticasClienteBeanSwingJInternalFrameAdditional(EstadoPoliticasClienteBeanSwingJInternalFrameAdditional estadopoliticasclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.estadopoliticasclienteBeanSwingJInternalFrameAdditional=estadopoliticasclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoPoliticasClienteLogic estadopoliticasclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoPoliticasCliente estadopoliticasclienteBean;
	public EstadoPoliticasClienteConstantesFunciones estadopoliticasclienteConstantesFunciones;
	//public EstadoPoliticasClienteParameterReturnGeneral estadopoliticasclienteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoPoliticasCliente> estadopoliticasclientes;	
	//public List<EstadoPoliticasCliente> estadopoliticasclientesEliminados;
	//public List<EstadoPoliticasCliente> estadopoliticasclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoPoliticasCliente=true;
	public Boolean isVisibilidadCeldaCopiarEstadoPoliticasCliente=true;
	public Boolean isVisibilidadCeldaVerFormEstadoPoliticasCliente=true;
	public Boolean isVisibilidadCeldaOrdenEstadoPoliticasCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
	public Boolean isVisibilidadCeldaModificarEstadoPoliticasCliente=false;
	public Boolean isVisibilidadCeldaActualizarEstadoPoliticasCliente=false;
	public Boolean isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
	public Boolean isVisibilidadCeldaCancelarEstadoPoliticasCliente=false;
	public Boolean isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;	
	
	
	
	public Long getiIdNuevoEstadoPoliticasCliente() {
		return this.iIdNuevoEstadoPoliticasCliente;
	}

	public void setiIdNuevoEstadoPoliticasCliente(Long iIdNuevoEstadoPoliticasCliente) {
		this.iIdNuevoEstadoPoliticasCliente = iIdNuevoEstadoPoliticasCliente;
	}
	
	public Long getidEstadoPoliticasClienteActual() {
		return this.idEstadoPoliticasClienteActual;
	}

	public void setidEstadoPoliticasClienteActual(Long idEstadoPoliticasClienteActual) {
		this.idEstadoPoliticasClienteActual = idEstadoPoliticasClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoPoliticasCliente getestadopoliticascliente() {
		return this.estadopoliticascliente;
	}

	public void setestadopoliticascliente(EstadoPoliticasCliente estadopoliticascliente) {
		this.estadopoliticascliente = estadopoliticascliente;
	}
	
	public EstadoPoliticasCliente getestadopoliticasclienteAux() {
		return this.estadopoliticasclienteAux;
	}

	public void setestadopoliticasclienteAux(EstadoPoliticasCliente estadopoliticasclienteAux) {
		this.estadopoliticasclienteAux = estadopoliticasclienteAux;
	}				
	
	public EstadoPoliticasCliente getestadopoliticasclienteAnterior() {
		return this.estadopoliticasclienteAnterior;
	}

	public void setestadopoliticasclienteAnterior(EstadoPoliticasCliente estadopoliticasclienteAnterior) {
		this.estadopoliticasclienteAnterior = estadopoliticasclienteAnterior;
	}	
	
	public EstadoPoliticasCliente getestadopoliticasclienteTotales() {
		return this.estadopoliticasclienteTotales;
	}

	public void setestadopoliticasclienteTotales(EstadoPoliticasCliente estadopoliticasclienteTotales) {
		this.estadopoliticasclienteTotales = estadopoliticasclienteTotales;
	}	
	
	public EstadoPoliticasCliente getestadopoliticasclienteBean() {
		return this.estadopoliticasclienteBean;
	}

	public void setestadopoliticasclienteBean(EstadoPoliticasCliente estadopoliticasclienteBean) {
		this.estadopoliticasclienteBean = estadopoliticasclienteBean;
	}	
	
	public EstadoPoliticasClienteParameterReturnGeneral getestadopoliticasclienteReturnGeneral() {
		return this.estadopoliticasclienteReturnGeneral;
	}

	public void setestadopoliticasclienteReturnGeneral(EstadoPoliticasClienteParameterReturnGeneral estadopoliticasclienteReturnGeneral) {
		this.estadopoliticasclienteReturnGeneral = estadopoliticasclienteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoPoliticasClienteLogic getEstadoPoliticasClienteLogic()	{		
		return estadopoliticasclienteLogic;
	}

	public void setEstadoPoliticasClienteLogic(EstadoPoliticasClienteLogic estadopoliticasclienteLogic) {
		this.estadopoliticasclienteLogic = estadopoliticasclienteLogic;
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
	
	public Boolean getIsEsNuevoEstadoPoliticasCliente() {
		return isEsNuevoEstadoPoliticasCliente;
	}

	public void setIsEsNuevoEstadoPoliticasCliente(Boolean isEsNuevoEstadoPoliticasCliente) {
		this.isEsNuevoEstadoPoliticasCliente = isEsNuevoEstadoPoliticasCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoPoliticasCliente() {
		return esParaAccionDesdeFormularioEstadoPoliticasCliente;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoPoliticasCliente(Boolean esParaAccionDesdeFormularioEstadoPoliticasCliente) {
		this.esParaAccionDesdeFormularioEstadoPoliticasCliente = esParaAccionDesdeFormularioEstadoPoliticasCliente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoPoliticasCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoPoliticasClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPoliticasCliente(this.estadopoliticasclienteLogic.getEstadoPoliticasClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoPoliticasClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPoliticasCliente(this.estadopoliticasclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadopoliticasclienteLogic.setEstadoPoliticasClientes(this.estadopoliticasclientes);
			estadopoliticasclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoPoliticasClienteParameterReturnGeneral getEstadoPoliticasClienteParameterGeneral() {
		return this.estadopoliticasclienteParameterGeneral;
	}
	
	public void setEstadoPoliticasClienteParameterGeneral(EstadoPoliticasClienteParameterReturnGeneral estadopoliticasclienteParameterGeneral) {
		this.estadopoliticasclienteParameterGeneral = estadopoliticasclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoPoliticasCliente() {
		return isPermisoTodoEstadoPoliticasCliente;
	}

	public void setIsPermisoTodoEstadoPoliticasCliente(Boolean isPermisoTodoEstadoPoliticasCliente) {
		this.isPermisoTodoEstadoPoliticasCliente = isPermisoTodoEstadoPoliticasCliente;
	}

	public Boolean getIsPermisoNuevoEstadoPoliticasCliente() {
		return isPermisoNuevoEstadoPoliticasCliente;
	}

	public void setIsPermisoNuevoEstadoPoliticasCliente(Boolean isPermisoNuevoEstadoPoliticasCliente) {
		this.isPermisoNuevoEstadoPoliticasCliente = isPermisoNuevoEstadoPoliticasCliente;
	}

	public Boolean getIsPermisoActualizarEstadoPoliticasCliente() {
		return isPermisoActualizarEstadoPoliticasCliente;
	}

	public void setIsPermisoActualizarEstadoPoliticasCliente(Boolean isPermisoActualizarEstadoPoliticasCliente) {
		this.isPermisoActualizarEstadoPoliticasCliente = isPermisoActualizarEstadoPoliticasCliente;
	}

	public Boolean getIsPermisoEliminarEstadoPoliticasCliente() {
		return isPermisoEliminarEstadoPoliticasCliente;
	}

	public void setIsPermisoEliminarEstadoPoliticasCliente(Boolean isPermisoEliminarEstadoPoliticasCliente) {
		this.isPermisoEliminarEstadoPoliticasCliente = isPermisoEliminarEstadoPoliticasCliente;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoPoliticasCliente() {
		return isPermisoGuardarCambiosEstadoPoliticasCliente;
	}

	public void setIsPermisoGuardarCambiosEstadoPoliticasCliente(Boolean isPermisoGuardarCambiosEstadoPoliticasCliente) {
		this.isPermisoGuardarCambiosEstadoPoliticasCliente = isPermisoGuardarCambiosEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoConsultaEstadoPoliticasCliente() {
		return isPermisoConsultaEstadoPoliticasCliente;
	}

	public void setIsPermisoConsultaEstadoPoliticasCliente(Boolean isPermisoConsultaEstadoPoliticasCliente) {
		this.isPermisoConsultaEstadoPoliticasCliente = isPermisoConsultaEstadoPoliticasCliente;
	}

	public Boolean getIsPermisoBusquedaEstadoPoliticasCliente() {
		return isPermisoBusquedaEstadoPoliticasCliente;
	}

	public void setIsPermisoBusquedaEstadoPoliticasCliente(Boolean isPermisoBusquedaEstadoPoliticasCliente) {
		this.isPermisoBusquedaEstadoPoliticasCliente = isPermisoBusquedaEstadoPoliticasCliente;
	}

	public Boolean getIsPermisoReporteEstadoPoliticasCliente() {
		return isPermisoReporteEstadoPoliticasCliente;
	}

	public void setIsPermisoReporteEstadoPoliticasCliente(Boolean isPermisoReporteEstadoPoliticasCliente) {
		this.isPermisoReporteEstadoPoliticasCliente = isPermisoReporteEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoPoliticasCliente() {
		return isPermisoPaginacionMedioEstadoPoliticasCliente;
	}

	public void setIsPermisoPaginacionMedioEstadoPoliticasCliente(Boolean isPermisoPaginacionMedioEstadoPoliticasCliente) {
		this.isPermisoPaginacionMedioEstadoPoliticasCliente = isPermisoPaginacionMedioEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoPoliticasCliente() {
		return isPermisoPaginacionTodoEstadoPoliticasCliente;
	}

	public void setIsPermisoPaginacionTodoEstadoPoliticasCliente(Boolean isPermisoPaginacionTodoEstadoPoliticasCliente) {
		this.isPermisoPaginacionTodoEstadoPoliticasCliente = isPermisoPaginacionTodoEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoPoliticasCliente() {
		return isPermisoPaginacionAltoEstadoPoliticasCliente;
	}

	public void setIsPermisoPaginacionAltoEstadoPoliticasCliente(Boolean isPermisoPaginacionAltoEstadoPoliticasCliente) {
		this.isPermisoPaginacionAltoEstadoPoliticasCliente = isPermisoPaginacionAltoEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoCopiarEstadoPoliticasCliente() {
		return isPermisoCopiarEstadoPoliticasCliente;
	}

	public void setIsPermisoCopiarEstadoPoliticasCliente(Boolean isPermisoCopiarEstadoPoliticasCliente) {
		this.isPermisoCopiarEstadoPoliticasCliente = isPermisoCopiarEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoVerFormEstadoPoliticasCliente() {
		return isPermisoVerFormEstadoPoliticasCliente;
	}

	public void setIsPermisoVerFormEstadoPoliticasCliente(Boolean isPermisoVerFormEstadoPoliticasCliente) {
		this.isPermisoVerFormEstadoPoliticasCliente = isPermisoVerFormEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoDuplicarEstadoPoliticasCliente() {
		return isPermisoDuplicarEstadoPoliticasCliente;
	}

	public void setIsPermisoDuplicarEstadoPoliticasCliente(Boolean isPermisoDuplicarEstadoPoliticasCliente) {
		this.isPermisoDuplicarEstadoPoliticasCliente = isPermisoDuplicarEstadoPoliticasCliente;
	}
	
	public Boolean getIsPermisoOrdenEstadoPoliticasCliente() {
		return isPermisoOrdenEstadoPoliticasCliente;
	}

	public void setIsPermisoOrdenEstadoPoliticasCliente(Boolean isPermisoOrdenEstadoPoliticasCliente) {
		this.isPermisoOrdenEstadoPoliticasCliente = isPermisoOrdenEstadoPoliticasCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoPoliticasCliente() {
		return isVisibilidadCeldaNuevoEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaNuevoEstadoPoliticasCliente(Boolean isVisibilidadCeldaNuevoEstadoPoliticasCliente) {
		this.isVisibilidadCeldaNuevoEstadoPoliticasCliente = isVisibilidadCeldaNuevoEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoPoliticasCliente() {
		return isVisibilidadCeldaDuplicarEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoPoliticasCliente(Boolean isVisibilidadCeldaDuplicarEstadoPoliticasCliente) {
		this.isVisibilidadCeldaDuplicarEstadoPoliticasCliente = isVisibilidadCeldaDuplicarEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoPoliticasCliente() {
		return isVisibilidadCeldaCopiarEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaCopiarEstadoPoliticasCliente(Boolean isVisibilidadCeldaCopiarEstadoPoliticasCliente) {
		this.isVisibilidadCeldaCopiarEstadoPoliticasCliente = isVisibilidadCeldaCopiarEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoPoliticasCliente() {
		return isVisibilidadCeldaVerFormEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaVerFormEstadoPoliticasCliente(Boolean isVisibilidadCeldaVerFormEstadoPoliticasCliente) {
		this.isVisibilidadCeldaVerFormEstadoPoliticasCliente = isVisibilidadCeldaVerFormEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoPoliticasCliente() {
		return isVisibilidadCeldaOrdenEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaOrdenEstadoPoliticasCliente(Boolean isVisibilidadCeldaOrdenEstadoPoliticasCliente) {
		this.isVisibilidadCeldaOrdenEstadoPoliticasCliente = isVisibilidadCeldaOrdenEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente() {
		return isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente(Boolean isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente = isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoPoliticasCliente() {
		return isVisibilidadCeldaModificarEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaModificarEstadoPoliticasCliente(Boolean isVisibilidadCeldaModificarEstadoPoliticasCliente) {
		this.isVisibilidadCeldaModificarEstadoPoliticasCliente = isVisibilidadCeldaModificarEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoPoliticasCliente() {
		return isVisibilidadCeldaActualizarEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaActualizarEstadoPoliticasCliente(Boolean isVisibilidadCeldaActualizarEstadoPoliticasCliente) {
		this.isVisibilidadCeldaActualizarEstadoPoliticasCliente = isVisibilidadCeldaActualizarEstadoPoliticasCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoPoliticasCliente() {
		return isVisibilidadCeldaEliminarEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaEliminarEstadoPoliticasCliente(Boolean isVisibilidadCeldaEliminarEstadoPoliticasCliente) {
		this.isVisibilidadCeldaEliminarEstadoPoliticasCliente = isVisibilidadCeldaEliminarEstadoPoliticasCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoPoliticasCliente() {
		return isVisibilidadCeldaCancelarEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaCancelarEstadoPoliticasCliente(Boolean isVisibilidadCeldaCancelarEstadoPoliticasCliente) {
		this.isVisibilidadCeldaCancelarEstadoPoliticasCliente = isVisibilidadCeldaCancelarEstadoPoliticasCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoPoliticasCliente() {
		return isVisibilidadCeldaGuardarEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaGuardarEstadoPoliticasCliente(Boolean isVisibilidadCeldaGuardarEstadoPoliticasCliente) {
		this.isVisibilidadCeldaGuardarEstadoPoliticasCliente = isVisibilidadCeldaGuardarEstadoPoliticasCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente() {
		return isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente(Boolean isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente) {
		this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente = isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente;
	}
		
	public EstadoPoliticasClienteSessionBean getestadopoliticasclienteSessionBean() {
		return this.estadopoliticasclienteSessionBean;
	}
	
	public void setestadopoliticasclienteSessionBean(EstadoPoliticasClienteSessionBean estadopoliticasclienteSessionBean) {
		this.estadopoliticasclienteSessionBean=estadopoliticasclienteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoPoliticasCliente estadopoliticascliente,EstadoPoliticasCliente estadopoliticasclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoPoliticasCliente(estadopoliticascliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadopoliticasclienteAux.setId(estadopoliticascliente.getId());
		estadopoliticasclienteAux.setVersionRow(estadopoliticascliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoPoliticasCliente();
		
			int intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadopoliticasclienteValidator.getInvalidValues(this.estadopoliticascliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadopoliticasclienteLogic.setDatosCliente(datosCliente);
			estadopoliticasclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadopoliticasclienteAux=new  EstadoPoliticasCliente();
				
				estadopoliticasclienteAux.setIsNew(true);
				estadopoliticasclienteAux.setIsChanged(true);
				
				estadopoliticasclienteAux.setEstadoPoliticasClienteOriginal(this.estadopoliticascliente);
				
				estadopoliticasclienteAux.setId(this.estadopoliticascliente.getId());	
				estadopoliticasclienteAux.setVersionRow(this.estadopoliticascliente.getVersionRow());	
				estadopoliticasclienteAux.setcodigo(this.estadopoliticascliente.getcodigo());	
				estadopoliticasclienteAux.setnombre(this.estadopoliticascliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadopoliticasclienteAux,estadopoliticasclienteLogic.getEstadoPoliticasClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopoliticasclienteAux,estadopoliticasclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopoliticasclienteLogic.saveEstadoPoliticasClientes();//WithConnection
						//estadopoliticasclienteLogic.getSetVersionRowEstadoPoliticasClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopoliticascliente,estadopoliticasclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes().addAll(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientes.addAll(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadopoliticasclienteLogic.saveEstadoPoliticasClienteRelaciones(estadopoliticasclienteAux,this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());//WithConnection
								//estadopoliticasclienteLogic.getSetVersionRowEstadoPoliticasClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadopoliticascliente,estadopoliticasclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(new ArrayList<PoliticasCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientes= new ArrayList<PoliticasCliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadopoliticasclienteAux.setPoliticasClientes(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadopoliticasclienteAux,estadopoliticasclienteLogic.getEstadoPoliticasClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadopoliticasclienteAux,estadopoliticasclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadopoliticascliente,estadopoliticasclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadopoliticasclienteAux=new  EstadoPoliticasCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado() && this.estadopoliticascliente.getId()>=0)) {
						
					estadopoliticasclienteAux.setIsNew(false);
				}
				
				estadopoliticasclienteAux.setIsDeleted(false);
			
				estadopoliticasclienteAux.setId(this.estadopoliticascliente.getId());	
				estadopoliticasclienteAux.setVersionRow(this.estadopoliticascliente.getVersionRow());	
				estadopoliticasclienteAux.setcodigo(this.estadopoliticascliente.getcodigo());	
				estadopoliticasclienteAux.setnombre(this.estadopoliticascliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopoliticasclienteAux,estadopoliticasclienteLogic.getEstadoPoliticasClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopoliticasclienteAux,estadopoliticasclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopoliticasclienteLogic.saveEstadoPoliticasClientes();//WithConnection
						//estadopoliticasclienteLogic.getSetVersionRowEstadoPoliticasClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopoliticascliente,estadopoliticasclienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes().addAll(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientes.addAll(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadopoliticasclienteLogic.saveEstadoPoliticasClienteRelaciones(estadopoliticasclienteAux,this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());//WithConnection
								//estadopoliticasclienteLogic.getSetVersionRowEstadoPoliticasClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadopoliticascliente,estadopoliticasclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(new ArrayList<PoliticasCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientes= new ArrayList<PoliticasCliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadopoliticasclienteAux.setPoliticasClientes(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadopoliticasclienteAux,estadopoliticasclienteLogic.getEstadoPoliticasClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadopoliticasclienteAux,estadopoliticasclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadopoliticascliente,estadopoliticasclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadopoliticasclienteAux=new  EstadoPoliticasCliente();
				
				estadopoliticasclienteAux.setIsNew(false);
				estadopoliticasclienteAux.setIsChanged(false);
				
				estadopoliticasclienteAux.setIsDeleted(true);
				
				estadopoliticasclienteAux.setId(this.estadopoliticascliente.getId());	
				estadopoliticasclienteAux.setVersionRow(this.estadopoliticascliente.getVersionRow());	
				estadopoliticasclienteAux.setcodigo(this.estadopoliticascliente.getcodigo());	
				estadopoliticasclienteAux.setnombre(this.estadopoliticascliente.getnombre());	
				
				if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadopoliticasclienteAux.getId()>=0) {	
						this.estadopoliticasclientesEliminados.add(estadopoliticasclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadopoliticasclienteAux,estadopoliticasclienteLogic.getEstadoPoliticasClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopoliticasclienteAux,estadopoliticasclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopoliticasclienteLogic.saveEstadoPoliticasClientes();//WithConnection
						//estadopoliticasclienteLogic.getSetVersionRowEstadoPoliticasClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes().addAll(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientes.addAll(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadopoliticasclienteLogic.saveEstadoPoliticasClienteRelaciones(estadopoliticasclienteAux,this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());//WithConnection
								//estadopoliticasclienteLogic.getSetVersionRowEstadoPoliticasClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(new ArrayList<PoliticasCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientes= new ArrayList<PoliticasCliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadopoliticasclienteAux.setPoliticasClientes(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadopoliticasclienteAux,estadopoliticasclienteLogic.getEstadoPoliticasClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadopoliticasclienteAux,estadopoliticasclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().addAll(this.estadopoliticasclientesEliminados);
					
					estadopoliticasclienteLogic.saveEstadoPoliticasClientes();//WithConnection
					//estadopoliticasclienteLogic.getSetVersionRowEstadoPoliticasClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadopoliticasclientesEliminados= new ArrayList<EstadoPoliticasCliente>();		
			}
			
			if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Politicas Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadopoliticascliente=estadopoliticasclienteAux;
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
      		//this.finishProcessEstadoPoliticasCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoPoliticasCliente estadopoliticasclienteLocal) throws Exception {
		
		if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadopoliticasclienteLocal.setPoliticasClientes(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
			
			} else {
			
				estadopoliticasclienteLocal.setPoliticasClientes(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoPoliticasCliente estadopoliticasclienteLocal) throws Exception {	
		if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoPoliticasClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadopoliticasclienteValidator.getInvalidValues(this.estadopoliticascliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoPoliticasCliente estadopoliticascliente,List<EstadoPoliticasCliente> estadopoliticasclientes) throws Exception {
		try	{		
			EstadoPoliticasClienteConstantesFunciones.actualizarLista(estadopoliticascliente,estadopoliticasclientes,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoPoliticasCliente estadopoliticascliente,List<EstadoPoliticasCliente> estadopoliticasclientes) throws Exception {
		try	{			
			EstadoPoliticasClienteConstantesFunciones.actualizarSelectedLista(estadopoliticascliente,estadopoliticasclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoPoliticasCliente> estadopoliticasclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadopoliticasclientesLocal=this.estadopoliticasclienteLogic.getEstadoPoliticasClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadopoliticasclientesLocal=this.estadopoliticasclientes;
			}
			//ARCHITECTURE
		
			for(EstadoPoliticasCliente estadopoliticasclienteLocal:estadopoliticasclientesLocal) {
				if(this.permiteMantenimiento(estadopoliticasclienteLocal) && estadopoliticasclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoPoliticasClienteConstantesFunciones.getEstadoPoliticasClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoPoliticasClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPoliticasCliente.jLabelcodigoEstadoPoliticasCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoPoliticasClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPoliticasCliente.jLabelnombreEstadoPoliticasCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPoliticasCliente.jLabelcodigoEstadoPoliticasCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPoliticasCliente.jLabelnombreEstadoPoliticasCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PoliticasCliente")) {
			if(this.estadopoliticascliente==null) {
				this.estadopoliticascliente= new EstadoPoliticasCliente();
			}

			if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoPoliticasCliente
				this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);

				this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.getpoliticascliente().setEstadoPoliticasCliente(this.estadopoliticascliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoPoliticasCliente--;	
		
		
		this.estadopoliticasclienteAux=new EstadoPoliticasCliente();
		
		this.estadopoliticasclienteAux.setId(this.iIdNuevoEstadoPoliticasCliente);
		this.estadopoliticasclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().add(this.estadopoliticasclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadopoliticasclientes.add(this.estadopoliticasclienteAux);
		}
		//ARCHITECTURE
		
		this.estadopoliticascliente=this.estadopoliticasclienteAux;
		
		if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoPoliticasCliente(this.estadopoliticascliente);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPoliticasCliente(this.estadopoliticascliente);
		}
				
		//this.setDefaultControlesEstadoPoliticasCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoPoliticasCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoPoliticasCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPoliticasCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPoliticasCliente(this.estadopoliticasclienteBean,this.estadopoliticascliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
			classes=EstadoPoliticasClienteConstantesFunciones.getClassesRelationshipsOfEstadoPoliticasCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadopoliticasclienteReturnGeneral=estadopoliticasclienteLogic.procesarEventosEstadoPoliticasClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopoliticasclienteLogic.getEstadoPoliticasClientes(),this.estadopoliticascliente,this.estadopoliticasclienteParameterGeneral,this.isEsNuevoEstadoPoliticasCliente,classes);//this.estadopoliticasclienteLogic.getEstadoPoliticasCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral,this.estadopoliticasclienteBean,false);
		
		if(this.estadopoliticasclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente());
		}
		
		if(this.estadopoliticasclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente(),classes);//this.estadopoliticasclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoPoliticasCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoPoliticasCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.RecargarFormEstadoPoliticasCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoPoliticasCliente(false);
						
			if(estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPoliticasCliente();
			}
			
			this.actualizarVisualTableDatosEstadoPoliticasCliente();
			
			this.jTableDatosEstadoPoliticasCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoPoliticasCliente(), this.getIndiceNuevoEstadoPoliticasCliente());
			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
						
			this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoPoliticasCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.setEnabled(isHabilitar && this.estadopoliticasclienteConstantesFunciones.activarcodigoEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.setEnabled(isHabilitar && this.estadopoliticasclienteConstantesFunciones.activarnombreEstadoPoliticasCliente);	
		
	};
	
	public void setDefaultControlesEstadoPoliticasCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoPoliticasCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadopoliticasclienteSessionBean.setConGuardarRelaciones(true);			
			this.estadopoliticasclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadopoliticasclienteSessionBean.setConGuardarRelaciones(false);			
			this.estadopoliticasclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoPoliticasCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
				if(estadopoliticasclienteAux.getId().equals(this.iIdNuevoEstadoPoliticasCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclientes) {
				if(estadopoliticasclienteAux.getId().equals(this.iIdNuevoEstadoPoliticasCliente)) {
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
	
	public int getIndiceActualEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
				if(estadopoliticasclienteAux.getId().equals(estadopoliticascliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclientes) {
				if(estadopoliticasclienteAux.getId().equals(estadopoliticascliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticasclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
				if(estadopoliticasclienteAux.getEstadoPoliticasClienteOriginal().getId().equals(estadopoliticasclienteOriginal.getId())) {
					existe=true;
					estadopoliticasclienteOriginal.setId(estadopoliticasclienteAux.getId());
					estadopoliticasclienteOriginal.setVersionRow(estadopoliticasclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclientes) {
				if(estadopoliticasclienteAux.getEstadoPoliticasClienteOriginal().getId().equals(estadopoliticasclienteOriginal.getId())) {
					existe=true;
					estadopoliticasclienteOriginal.setId(estadopoliticasclienteAux.getId());
					estadopoliticasclienteOriginal.setVersionRow(estadopoliticasclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoPoliticasCliente(Boolean esParaCancelar) throws Exception {
		estadopoliticasclientesAux=new ArrayList<EstadoPoliticasCliente>();
		estadopoliticasclienteAux=new EstadoPoliticasCliente();
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
					if(estadopoliticasclienteAux.getId()<0) {
						estadopoliticasclientesAux.add(estadopoliticasclienteAux);
					}		
				}
				this.iIdNuevoEstadoPoliticasCliente=0L;
				this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().removeAll(estadopoliticasclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclientes) {
					if(estadopoliticasclienteAux.getId()<0) {
						estadopoliticasclientesAux.add(estadopoliticasclienteAux);
					}		
				}
				this.iIdNuevoEstadoPoliticasCliente=0L;
				this.estadopoliticasclientes.removeAll(estadopoliticasclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoPoliticasCliente 
					&& this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().size()>0
					) {
					estadopoliticasclienteAux=this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().get(this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().size() - 1);
				
					if(estadopoliticasclienteAux.getId()<0) {
						this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().remove(estadopoliticasclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoPoliticasCliente && this.estadopoliticasclientes.size()>0) {
					estadopoliticasclienteAux=this.estadopoliticasclientes.get(this.estadopoliticasclientes.size() - 1);
				
					if(estadopoliticasclienteAux.getId()<0) {
						this.estadopoliticasclientes.remove(estadopoliticasclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoPoliticasCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadopoliticascliente.getId()<0) {
				this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().remove(this.estadopoliticascliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadopoliticascliente.getId()<0) {
				this.estadopoliticasclientes.remove(this.estadopoliticascliente);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoPoliticasCliente(List<EstadoPoliticasCliente> estadopoliticasclientesAux) throws Exception {
		EstadoPoliticasClienteConstantesFunciones.setEstadosInicialesEstadoPoliticasCliente(estadopoliticasclientesAux);
	}
	
	public void setEstadosInicialesEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticasclienteAux) throws Exception {
		EstadoPoliticasClienteConstantesFunciones.setEstadosInicialesEstadoPoliticasCliente(estadopoliticasclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoPoliticasClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoPoliticasClienteActual()) {
				if(!this.isEsNuevoEstadoPoliticasCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoPoliticasCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoPoliticasClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Politicas Cliente ?", "MANTENIMIENTO DE Estado Politicas Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoPoliticasCliente estadopoliticascliente) throws Exception {
		EstadoPoliticasClienteConstantesFunciones.seleccionarAsignar(this.estadopoliticascliente,estadopoliticascliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoPoliticasCliente=this.isPermisoActualizarOriginalEstadoPoliticasCliente;
			
			
			this.seleccionarAsignar(estadopoliticascliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPoliticasClienteConstantesFunciones.quitarEspaciosEstadoPoliticasCliente(this.estadopoliticascliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadopoliticasclienteSessionBean.setsFuncionBusquedaRapida(this.estadopoliticasclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoPoliticasCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoPoliticasCliente(esParaCancelar);				
				this.cancelarNuevoEstadoPoliticasCliente(esParaCancelar);								
			}
			
			this.estadopoliticascliente=new EstadoPoliticasCliente();
			
			this.inicializarEstadoPoliticasCliente();
			
			this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoPoliticasCliente() throws Exception {
		try {
			EstadoPoliticasClienteConstantesFunciones.inicializarEstadoPoliticasCliente(this.estadopoliticascliente);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoPoliticasClientes(String sAccionBusqueda,List<EstadoPoliticasCliente> estadopoliticasclientesParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoPoliticasCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoPoliticasClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoPoliticasClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoPoliticasCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Politicas Clientes");		
		parameters.put("busquedapor", EstadoPoliticasClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PoliticasCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoPoliticasClienteLogic estadopoliticasclienteLogicAuxiliar=new EstadoPoliticasClienteLogic();
					estadopoliticasclienteLogicAuxiliar.setDatosCliente(estadopoliticasclienteLogic.getDatosCliente());				
					estadopoliticasclienteLogicAuxiliar.setEstadoPoliticasClientes(estadopoliticasclientesParaReportes);
					
					estadopoliticasclienteLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoPoliticasClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadopoliticasclientesParaReportes=estadopoliticasclienteLogicAuxiliar.getEstadoPoliticasClientes();
					
					//estadopoliticasclienteLogic.getNewConnexionToDeep();
					
					//for (EstadoPoliticasCliente estadopoliticascliente:estadopoliticasclientesParaReportes) {
					//	estadopoliticasclienteLogic.deepLoad(estadopoliticascliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadopoliticasclienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadopoliticasclienteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePoliticasCliente = AuxiliarReportes.class.getResourceAsStream("PoliticasClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_politicascliente", reportFilePoliticasCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoPoliticasCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoPoliticasClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoPoliticasClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoPoliticasCliente=new JRBeanArrayDataSource(EstadoPoliticasClienteJInternalFrame.TraerEstadoPoliticasClienteBeans(estadopoliticasclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoPoliticasCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoPoliticasClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoPoliticasClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoPoliticasClienteBean.TraerEstadoPoliticasClienteBeans(estadopoliticasclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoPoliticasClientes(sAccionBusqueda,sTipoArchivoReporte,estadopoliticasclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoPoliticasClientes(sAccionBusqueda,sTipoArchivoReporte,estadopoliticasclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasClienteActionPerformed(null);
					//this.generarExcelReporteEstadoPoliticasClientes(sAccionBusqueda,sTipoArchivoReporte,estadopoliticasclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoPoliticasClientes(sAccionBusqueda,sTipoArchivoReporte,estadopoliticasclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoPoliticasClientes(sAccionBusqueda,sTipoArchivoReporte,estadopoliticasclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoPoliticasClientes(sAccionBusqueda,sTipoArchivoReporte,estadopoliticasclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoPoliticasClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPoliticasCliente> estadopoliticasclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopoliticascliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPoliticasClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPoliticasCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoPoliticasCliente estadopoliticascliente : estadopoliticasclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoPoliticasClienteConstantesFunciones.generarExcelReporteDataEstadoPoliticasCliente("NORMAL",row,workbook,estadopoliticascliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoPoliticasCliente(String sTipo,Row row,Workbook workbook) {
		
		EstadoPoliticasClienteConstantesFunciones.generarExcelReporteHeaderEstadoPoliticasCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoPoliticasClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPoliticasCliente> estadopoliticasclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopoliticascliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPoliticasClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoPoliticasCliente estadopoliticascliente : estadopoliticasclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.getEstadoPoliticasClienteDescripcion(estadopoliticascliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopoliticascliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopoliticascliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoPoliticasClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPoliticasCliente> estadopoliticasclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoPoliticasCliente> estadopoliticasclientesRespaldo=null;
		
		classes=EstadoPoliticasClienteConstantesFunciones.getClassesRelationshipsOfEstadoPoliticasCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadopoliticasclienteLogic.setDatosCliente(this.datosCliente);
		this.estadopoliticasclienteLogic.setDatosDeep(this.datosDeep);
		this.estadopoliticasclienteLogic.setIsConDeep(true);
		
		estadopoliticasclientesRespaldo=this.estadopoliticasclienteLogic.getEstadoPoliticasClientes();
		
		this.estadopoliticasclienteLogic.setEstadoPoliticasClientes(estadopoliticasclientesParaReportes);	
		this.estadopoliticasclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadopoliticasclientesParaReportes=this.estadopoliticasclienteLogic.getEstadoPoliticasClientes();
		this.estadopoliticasclienteLogic.setEstadoPoliticasClientes(estadopoliticasclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopoliticascliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPoliticasClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPoliticasCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoPoliticasCliente estadopoliticascliente : estadopoliticasclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoPoliticasCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoPoliticasClienteConstantesFunciones.generarExcelReporteDataEstadoPoliticasCliente("NORMAL",row,workbook,estadopoliticascliente,cellStyleDataAux);
		
			
			


				//PoliticasCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadopoliticascliente.getPoliticasClientes()!=null && estadopoliticascliente.getPoliticasClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PoliticasClienteConstantesFunciones.generarExcelReporteHeaderPoliticasCliente("RELACIONADO",row,workbook);
				}

				if(estadopoliticascliente.getPoliticasClientes()!=null) {
					i2=0;
					for(PoliticasCliente politicascliente : estadopoliticascliente.getPoliticasClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PoliticasClienteConstantesFunciones.generarExcelReporteDataPoliticasCliente("RELACIONADO",row,workbook,politicascliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.getEstadoPoliticasClienteDescripcion(estadopoliticascliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoPoliticasCliente() throws Exception {		
		this.startProcessEstadoPoliticasCliente(true);
	}
	
	public void startProcessEstadoPoliticasCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoPoliticasCliente, this.jScrollPanelDatosEstadoPoliticasCliente,this.jPanelPaginacionEstadoPoliticasCliente, this.jScrollPanelDatosEdicionEstadoPoliticasCliente, this.jPanelAccionesEstadoPoliticasCliente,this.jPanelAccionesFormularioEstadoPoliticasCliente,this.jmenuBarEstadoPoliticasCliente,this.jmenuBarDetalleEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,this.jTtoolBarDetalleEstadoPoliticasCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPoliticasCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoPoliticasCliente=this.jPanelParametrosReportesEstadoPoliticasCliente;
		//final JScrollPane jScrollPanelDatosEstadoPoliticasCliente=this.jScrollPanelDatosEstadoPoliticasCliente;
		final JTable jTableDatosEstadoPoliticasCliente=this.jTableDatosEstadoPoliticasCliente;		
		final JPanel jPanelPaginacionEstadoPoliticasCliente=this.jPanelPaginacionEstadoPoliticasCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPoliticasCliente=this.jScrollPanelDatosEdicionEstadoPoliticasCliente;
		final JPanel jPanelAccionesEstadoPoliticasCliente=this.jPanelAccionesEstadoPoliticasCliente;
		
		JPanel jPanelCamposAuxiliarEstadoPoliticasCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPoliticasCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			jPanelCamposAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jPanelCamposEstadoPoliticasCliente;
			jPanelAccionesFormularioAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jPanelAccionesFormularioEstadoPoliticasCliente;
		}
		
		final JPanel jPanelCamposEstadoPoliticasCliente=jPanelCamposAuxiliarEstadoPoliticasCliente;
		final JPanel jPanelAccionesFormularioEstadoPoliticasCliente=jPanelAccionesFormularioAuxiliarEstadoPoliticasCliente;
		
		
		final JMenuBar jmenuBarEstadoPoliticasCliente=this.jmenuBarEstadoPoliticasCliente;
		final JToolBar jTtoolBarEstadoPoliticasCliente=this.jTtoolBarEstadoPoliticasCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoPoliticasCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPoliticasCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jmenuBarDetalleEstadoPoliticasCliente;
			jTtoolBarDetalleAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTtoolBarDetalleEstadoPoliticasCliente;
		}
		
		final JMenuBar jmenuBarDetalleEstadoPoliticasCliente=jmenuBarDetalleAuxiliarEstadoPoliticasCliente;
		final JToolBar jTtoolBarDetalleEstadoPoliticasCliente=jTtoolBarDetalleAuxiliarEstadoPoliticasCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPoliticasCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPoliticasCliente;
			processRunnable.jTableDatos=jTableDatosEstadoPoliticasCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoPoliticasCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPoliticasCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPoliticasCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPoliticasCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPoliticasCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPoliticasCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoPoliticasCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPoliticasCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoPoliticasCliente ,jPanelParametrosReportesEstadoPoliticasCliente,jTableDatosEstadoPoliticasCliente, /*jScrollPanelDatosEstadoPoliticasCliente,*/jPanelCamposEstadoPoliticasCliente,jPanelPaginacionEstadoPoliticasCliente, /*jScrollPanelDatosEdicionEstadoPoliticasCliente,*/ jPanelAccionesEstadoPoliticasCliente,jPanelAccionesFormularioEstadoPoliticasCliente,jmenuBarEstadoPoliticasCliente,jmenuBarDetalleEstadoPoliticasCliente,jTtoolBarEstadoPoliticasCliente,jTtoolBarDetalleEstadoPoliticasCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoPoliticasCliente, jScrollPanelDatosEstadoPoliticasCliente,jPanelPaginacionEstadoPoliticasCliente, jScrollPanelDatosEdicionEstadoPoliticasCliente, jPanelAccionesEstadoPoliticasCliente,jPanelAccionesFormularioEstadoPoliticasCliente,jmenuBarEstadoPoliticasCliente,jmenuBarDetalleEstadoPoliticasCliente,jTtoolBarEstadoPoliticasCliente,jTtoolBarDetalleEstadoPoliticasCliente);
						
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
	
	public void finishProcessEstadoPoliticasCliente() {// throws Exception 
		this.finishProcessEstadoPoliticasCliente(true);
	}
	
	public void finishProcessEstadoPoliticasCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoPoliticasCliente, this.jScrollPanelDatosEstadoPoliticasCliente,this.jPanelPaginacionEstadoPoliticasCliente, this.jScrollPanelDatosEdicionEstadoPoliticasCliente, this.jPanelAccionesEstadoPoliticasCliente,this.jPanelAccionesFormularioEstadoPoliticasCliente,this.jmenuBarEstadoPoliticasCliente,this.jmenuBarDetalleEstadoPoliticasCliente,this.jTtoolBarEstadoPoliticasCliente,this.jTtoolBarDetalleEstadoPoliticasCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPoliticasCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoPoliticasCliente=this.jPanelParametrosReportesEstadoPoliticasCliente;
		//final JScrollPane jScrollPanelDatosEstadoPoliticasCliente=this.jScrollPanelDatosEstadoPoliticasCliente;
		final JTable jTableDatosEstadoPoliticasCliente=this.jTableDatosEstadoPoliticasCliente;		
		final JPanel jPanelPaginacionEstadoPoliticasCliente=this.jPanelPaginacionEstadoPoliticasCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPoliticasCliente=this.jScrollPanelDatosEdicionEstadoPoliticasCliente;
		final JPanel jPanelAccionesEstadoPoliticasCliente=this.jPanelAccionesEstadoPoliticasCliente;
		
		JPanel jPanelCamposAuxiliarEstadoPoliticasCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPoliticasCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			jPanelCamposAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jPanelCamposEstadoPoliticasCliente;
			jPanelAccionesFormularioAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jPanelAccionesFormularioEstadoPoliticasCliente;
		}
		
		final JPanel jPanelCamposEstadoPoliticasCliente=jPanelCamposAuxiliarEstadoPoliticasCliente;
		final JPanel jPanelAccionesFormularioEstadoPoliticasCliente=jPanelAccionesFormularioAuxiliarEstadoPoliticasCliente;
		
		
		final JMenuBar jmenuBarEstadoPoliticasCliente=this.jmenuBarEstadoPoliticasCliente;		
		final JToolBar jTtoolBarEstadoPoliticasCliente=this.jTtoolBarEstadoPoliticasCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoPoliticasCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPoliticasCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jmenuBarDetalleEstadoPoliticasCliente;
			jTtoolBarDetalleAuxiliarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTtoolBarDetalleEstadoPoliticasCliente;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoPoliticasCliente=jmenuBarDetalleAuxiliarEstadoPoliticasCliente;
		final JToolBar jTtoolBarDetalleEstadoPoliticasCliente=jTtoolBarDetalleAuxiliarEstadoPoliticasCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPoliticasCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPoliticasCliente;
			processRunnable.jTableDatos=jTableDatosEstadoPoliticasCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoPoliticasCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPoliticasCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPoliticasCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPoliticasCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPoliticasCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPoliticasCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoPoliticasCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPoliticasCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoPoliticasCliente ,jPanelParametrosReportesEstadoPoliticasCliente, jTableDatosEstadoPoliticasCliente,/*jScrollPanelDatosEstadoPoliticasCliente,*/jPanelCamposEstadoPoliticasCliente,jPanelPaginacionEstadoPoliticasCliente, /*jScrollPanelDatosEdicionEstadoPoliticasCliente,*/ jPanelAccionesEstadoPoliticasCliente,jPanelAccionesFormularioEstadoPoliticasCliente,jmenuBarEstadoPoliticasCliente,jmenuBarDetalleEstadoPoliticasCliente,jTtoolBarEstadoPoliticasCliente,jTtoolBarDetalleEstadoPoliticasCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoPoliticasCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoPoliticasCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoPoliticasCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoPoliticasCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoPoliticasCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoPoliticasCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoPoliticasCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoPoliticasCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoPoliticasCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadopoliticasclienteConstantesFunciones.getsFinalQueryEstadoPoliticasCliente();
		String  finalQueryPaginacionTodos=this.estadopoliticasclienteConstantesFunciones.getsFinalQueryEstadoPoliticasCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoPoliticasClienteConstantesFunciones.getArrayColumnasGlobalesNoEstadoPoliticasCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoPoliticasClienteConstantesFunciones.getArrayColumnasGlobalesEstadoPoliticasCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoPoliticasClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadopoliticasclientesEliminados= new ArrayList<EstadoPoliticasCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoPoliticasCliente();
		
				///*EstadoPoliticasClienteSessionBean*/this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
			
			if(this.estadopoliticasclienteSessionBean==null) {
				this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
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
					this.iNumeroPaginacion=EstadoPoliticasClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoPoliticasClienteConstantesFunciones.getClassesForeignKeysOfEstadoPoliticasCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadopoliticascliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadopoliticasclientesAux= new ArrayList<EstadoPoliticasCliente>();
			
				
			estadopoliticasclienteLogic.setDatosCliente(this.datosCliente);
			estadopoliticasclienteLogic.setDatosDeep(this.datosDeep);
			estadopoliticasclienteLogic.setIsConDeep(true);
			
			
			estadopoliticasclienteLogic.getEstadoPoliticasClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadopoliticasclienteLogic.getTodosEstadoPoliticasClientes(finalQueryGlobal,pagination);
					
					//estadopoliticasclienteLogic.getTodosEstadoPoliticasClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadopoliticasclienteLogic.getEstadoPoliticasClientes()==null|| estadopoliticasclienteLogic.getEstadoPoliticasClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopoliticasclientesAux= new ArrayList<EstadoPoliticasCliente>();
							estadopoliticasclientesAux.addAll(estadopoliticasclienteLogic.getEstadoPoliticasClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopoliticasclientesAux= new ArrayList<EstadoPoliticasCliente>();
							estadopoliticasclientesAux.addAll(estadopoliticasclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopoliticasclienteLogic.getTodosEstadoPoliticasClientes(finalQueryGlobal+"",this.pagination);												
							
							//estadopoliticasclienteLogic.getTodosEstadoPoliticasClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclienteLogic.getEstadoPoliticasClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopoliticasclienteLogic.setEstadoPoliticasClientes(new ArrayList<EstadoPoliticasCliente>());					
							estadopoliticasclienteLogic.getEstadoPoliticasClientes().addAll(estadopoliticasclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopoliticasclientes=new ArrayList<EstadoPoliticasCliente>();
							estadopoliticasclientes.addAll(estadopoliticasclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoPoliticasCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoPoliticasCliente=this.idActual;
				
				} else if(this.idEstadoPoliticasClienteActual!=null && this.idEstadoPoliticasClienteActual!=0L) {
					idEstadoPoliticasCliente=idEstadoPoliticasClienteActual;
				}
				
					
				this.sDetalleReporte=EstadoPoliticasClienteConstantesFunciones.getDetalleIndicePorId(idEstadoPoliticasCliente);
				
				this.estadopoliticasclientes=new ArrayList<EstadoPoliticasCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadopoliticasclienteLogic.getEntity(idEstadoPoliticasCliente);
					
					//estadopoliticasclienteLogic.getEntityWithConnection(idEstadoPoliticasCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopoliticasclienteLogic.setEstadoPoliticasClientes(new ArrayList<EstadoPoliticasCliente>());
					estadopoliticasclienteLogic.getEstadoPoliticasClientes().add(estadopoliticasclienteLogic.getEstadoPoliticasCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopoliticasclientes=new ArrayList<EstadoPoliticasCliente>();
					this.estadopoliticasclientes.add(estadopoliticascliente);
				}
				
				if(estadopoliticasclienteLogic.getEstadoPoliticasCliente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoPoliticasCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoPoliticasCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopoliticasclienteLogic.getEstadoPoliticasClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopoliticasclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopoliticasclienteLogic.getEstadoPoliticasClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopoliticasclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoPoliticasCliente estadopoliticascliente) {
		Boolean permite=true;
		
		if(this.estadopoliticascliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoPoliticasClienteConstantesFunciones.getOrderByListaEstadoPoliticasCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoPoliticasClienteConstantesFunciones.getOrderByListaEstadoPoliticasCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPoliticasCliente estadopoliticascliente:estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
				if(estadopoliticascliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadopoliticasclienteTotales=estadopoliticascliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPoliticasCliente estadopoliticascliente:this.estadopoliticasclientes) {
				if(estadopoliticascliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadopoliticasclienteTotales=estadopoliticascliente;
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
			this.estadopoliticasclienteAux=new EstadoPoliticasCliente();
			this.estadopoliticasclienteAux.setsType(Constantes2.S_TOTALES);
			this.estadopoliticasclienteAux.setIsNew(false);
			this.estadopoliticasclienteAux.setIsChanged(false);
			this.estadopoliticasclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoPoliticasClienteConstantesFunciones.TotalizarValoresFilaEstadoPoliticasCliente(this.estadopoliticasclienteLogic.getEstadoPoliticasClientes(),this.estadopoliticasclienteAux);
				
				this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().add(this.estadopoliticasclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoPoliticasClienteConstantesFunciones.TotalizarValoresFilaEstadoPoliticasCliente(this.estadopoliticasclientes,this.estadopoliticasclienteAux);
				
				this.estadopoliticasclientes.add(this.estadopoliticasclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadopoliticasclienteTotales=new EstadoPoliticasCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().remove(estadopoliticasclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopoliticasclientes.remove(estadopoliticasclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadopoliticasclienteTotales=new EstadoPoliticasCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPoliticasCliente estadopoliticascliente:estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
				if(estadopoliticascliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadopoliticasclienteTotales=estadopoliticascliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPoliticasClienteConstantesFunciones.TotalizarValoresFilaEstadoPoliticasCliente(this.estadopoliticasclienteLogic.getEstadoPoliticasClientes(),estadopoliticasclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPoliticasCliente estadopoliticascliente:this.estadopoliticasclientes) {
				if(estadopoliticascliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadopoliticasclienteTotales=estadopoliticascliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPoliticasClienteConstantesFunciones.TotalizarValoresFilaEstadoPoliticasCliente(this.estadopoliticasclientes,estadopoliticasclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoPoliticasCliente() {
		this.isPermisoTodoEstadoPoliticasCliente=false;
		this.isPermisoNuevoEstadoPoliticasCliente=false;
		this.isPermisoActualizarEstadoPoliticasCliente=false;
		this.isPermisoActualizarOriginalEstadoPoliticasCliente=false;
		this.isPermisoEliminarEstadoPoliticasCliente=false;
		this.isPermisoGuardarCambiosEstadoPoliticasCliente=false;
		this.isPermisoConsultaEstadoPoliticasCliente=false;
		this.isPermisoBusquedaEstadoPoliticasCliente=false;
		this.isPermisoReporteEstadoPoliticasCliente=false;		
		this.isPermisoOrdenEstadoPoliticasCliente=false;		
		this.isPermisoPaginacionMedioEstadoPoliticasCliente=false;		
		this.isPermisoPaginacionAltoEstadoPoliticasCliente=false;
		this.isPermisoPaginacionTodoEstadoPoliticasCliente=false;
		this.isPermisoCopiarEstadoPoliticasCliente=false;		
		this.isPermisoVerFormEstadoPoliticasCliente=false;		
		this.isPermisoDuplicarEstadoPoliticasCliente=false;		
		this.isPermisoOrdenEstadoPoliticasCliente=false;		
	}
	
	public void setPermisosUsuarioEstadoPoliticasCliente(Boolean isPermiso) {
		this.isPermisoTodoEstadoPoliticasCliente=isPermiso;
		this.isPermisoNuevoEstadoPoliticasCliente=isPermiso;
		this.isPermisoActualizarEstadoPoliticasCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoPoliticasCliente=isPermiso;
		this.isPermisoEliminarEstadoPoliticasCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoPoliticasCliente=isPermiso;
		this.isPermisoConsultaEstadoPoliticasCliente=isPermiso;
		this.isPermisoBusquedaEstadoPoliticasCliente=isPermiso;
		this.isPermisoReporteEstadoPoliticasCliente=isPermiso;
		this.isPermisoOrdenEstadoPoliticasCliente=isPermiso;		
		this.isPermisoPaginacionMedioEstadoPoliticasCliente=isPermiso;		
		this.isPermisoPaginacionAltoEstadoPoliticasCliente=isPermiso;		
		this.isPermisoPaginacionTodoEstadoPoliticasCliente=isPermiso;		
		this.isPermisoCopiarEstadoPoliticasCliente=isPermiso;		
		this.isPermisoVerFormEstadoPoliticasCliente=isPermiso;		
		this.isPermisoDuplicarEstadoPoliticasCliente=isPermiso;
		this.isPermisoOrdenEstadoPoliticasCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoPoliticasCliente(Boolean isPermiso) {
		//this.isPermisoTodoEstadoPoliticasCliente=isPermiso;
		this.isPermisoNuevoEstadoPoliticasCliente=isPermiso;
		this.isPermisoActualizarEstadoPoliticasCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoPoliticasCliente=isPermiso;
		this.isPermisoEliminarEstadoPoliticasCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoPoliticasCliente=isPermiso;
		//this.isPermisoConsultaEstadoPoliticasCliente=isPermiso;
		//this.isPermisoBusquedaEstadoPoliticasCliente=isPermiso;
		//this.isPermisoReporteEstadoPoliticasCliente=isPermiso;
		//this.isPermisoOrdenEstadoPoliticasCliente=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoPoliticasCliente=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoPoliticasCliente=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoPoliticasCliente=isPermiso;		
		//this.isPermisoCopiarEstadoPoliticasCliente=isPermiso;		
		//this.isPermisoDuplicarEstadoPoliticasCliente=isPermiso;
		//this.isPermisoOrdenEstadoPoliticasCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPoliticasClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoPoliticasClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPoliticasCliente=false;
		this.isTienePermisosPoliticasCliente=this.verificarGetPermisosUsuarioOpcionEstadoPoliticasClienteClaseRelacionada(this.opcionsRelacionadas,PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoPoliticasCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPoliticasClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPoliticasCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoPoliticasClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoPoliticasClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoPoliticasClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPoliticasCliente && this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.remove(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoPoliticasCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoPoliticasClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoPoliticasClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoPoliticasCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoPoliticasCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoPoliticasCliente=this.isPermisoActualizarEstadoPoliticasCliente;
			this.isPermisoEliminarEstadoPoliticasCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoPoliticasCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoPoliticasCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoPoliticasCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoPoliticasCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoPoliticasCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPoliticasCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoPoliticasCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoPoliticasCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoPoliticasCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoPoliticasCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoPoliticasCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoPoliticasCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPoliticasCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoPoliticasCliente.setToolTipText(this.jTableDatosEstadoPoliticasCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoPoliticasCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoPoliticasCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoPoliticasClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoPoliticasClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoPoliticasCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPoliticasCliente && this.estadopoliticasclienteConstantesFunciones.mostrarPoliticasClienteEstadoPoliticasCliente && !EstadoPoliticasClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Politicas Cliente");
			reporte.setsDescripcion("Politicas Cliente");
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
	
		
	public void inicializarCombosForeignKeyEstadoPoliticasClienteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoPoliticasClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoPoliticasClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoPoliticasClienteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoPoliticasClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoPoliticasCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoPoliticasCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoPoliticasCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoPoliticasCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPoliticasCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoPoliticasCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPoliticasCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoPoliticasCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoPoliticasCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoPoliticasCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoPoliticasCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoPoliticasCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoPoliticasCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoPoliticasClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoPoliticasClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoPoliticasClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean(); 
		this.estadopoliticasclienteConstantesFunciones=new EstadoPoliticasClienteConstantesFunciones(); 
		this.estadopoliticasclienteBean=new EstadoPoliticasCliente();//(this.estadopoliticasclienteConstantesFunciones); 		
		this.estadopoliticasclienteReturnGeneral=new EstadoPoliticasClienteParameterReturnGeneral(); 
		
		this.estadopoliticasclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopoliticasclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoPoliticasClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoPoliticasClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoPoliticasClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoPoliticasCliente(true);
			
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
			
			this.estadopoliticasclienteConstantesFunciones=new EstadoPoliticasClienteConstantesFunciones(); 
			this.estadopoliticasclienteBean=new EstadoPoliticasCliente();//this.estadopoliticasclienteConstantesFunciones); 			
			this.estadopoliticasclienteReturnGeneral=new EstadoPoliticasClienteParameterReturnGeneral(); 
		
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Politicas Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadopoliticascliente=new EstadoPoliticasCliente();
			this.estadopoliticasclientes = new ArrayList<EstadoPoliticasCliente>();
			this.estadopoliticasclientesAux = new ArrayList<EstadoPoliticasCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic=new EstadoPoliticasClienteLogic();
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estadopoliticasclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadopoliticasclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoPoliticasCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPoliticasCliente);	
					}
					
					if(this.jInternalFrameImportacionEstadoPoliticasCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPoliticasCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoPoliticasCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoPoliticasCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPoliticasCliente);
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.setVisible(false);
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente);
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoPoliticasCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPoliticasCliente);
					this.jInternalFrameImportacionEstadoPoliticasCliente.setVisible(false);
					this.jInternalFrameImportacionEstadoPoliticasCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoPoliticasCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPoliticasCliente);
					this.jInternalFrameOrderByEstadoPoliticasCliente.setVisible(false);
					this.jInternalFrameOrderByEstadoPoliticasCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoPoliticasClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoPoliticasClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadopoliticasclienteReturnGeneral=new EstadoPoliticasClienteParameterReturnGeneral();
			
			this.estadopoliticasclienteParameterGeneral=new EstadoPoliticasClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadopoliticasclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoPoliticasClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPoliticasClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado(),this.estadopoliticasclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPoliticasClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado(),this.estadopoliticasclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaCopiarEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaVerFormEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaOrdenEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoPoliticasCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoPoliticasCliente(false);
			
			this.setPermisosUsuarioEstadoPoliticasCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado() && this.estadopoliticasclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoPoliticasClienteClasesRelacionadas();
			}
			
			if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoPoliticasClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoPoliticasCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoPoliticasCliente();
			}
			
			if(!this.isPermisoBusquedaEstadoPoliticasCliente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoPoliticasCliente,this.isPermisoPaginacionMedioEstadoPoliticasCliente,this.isPermisoPaginacionTodoEstadoPoliticasCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoPoliticasClienteConstantesFunciones.getTiposSeleccionarEstadoPoliticasCliente());
				
				this.tiposColumnasSelect=EstadoPoliticasClienteConstantesFunciones.getTiposSeleccionarEstadoPoliticasCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoPoliticasCliente();				
				//this.tiposRelacionesSelect=EstadoPoliticasClienteConstantesFunciones.getTiposRelacionesEstadoPoliticasCliente(true);
				
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
			//if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoPoliticasCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoPoliticasCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoPoliticasCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPoliticasCliente() ;
			
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
			
			
			this.politicasclienteLogic=new PoliticasClienteLogic(); 
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
				estadopoliticasclienteImplementable= (EstadoPoliticasClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPoliticasClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadopoliticasclienteImplementableHome= (EstadoPoliticasClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPoliticasClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadopoliticasclientes= new ArrayList<EstadoPoliticasCliente>();
			this.estadopoliticasclientesEliminados= new ArrayList<EstadoPoliticasCliente>();
						
			this.isEsNuevoEstadoPoliticasCliente=false;
			this.esParaAccionDesdeFormularioEstadoPoliticasCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoPoliticasCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoPoliticasCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoPoliticasClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoPoliticasCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoPoliticasCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoPoliticasCliente();
			}
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoPoliticasCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoPoliticasCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoPoliticasCliente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoPoliticasCliente")) {
				iIndex=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Politicas Clientes")) {
					if(!PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoPoliticasCliente();

						this.cargarParteTabPanelRelacionadaPoliticasCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoPoliticasCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPoliticasCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.cargarSessionConBeanSwingJInternalFramePoliticasCliente(false,true,iIndex);
		this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPoliticasCliente();

		//this.jTabbedPaneRelacionesEstadoPoliticasCliente.updateUI();
		//this.jTabbedPaneRelacionesEstadoPoliticasCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoPoliticasCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PoliticasCliente")) {
				int row=this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
				jButtonPoliticasClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Politicas Cliente")) {

					if(this.isTienePermisosPoliticasCliente && this.estadopoliticasclienteConstantesFunciones.mostrarPoliticasClienteEstadoPoliticasCliente && !EstadoPoliticasClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Politicas Clientes"+"("+PoliticasClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Politicas Clientes");

						if(estadopoliticasclienteConstantesFunciones.resaltarPoliticasClienteEstadoPoliticasCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadopoliticasclienteConstantesFunciones.resaltarPoliticasClienteEstadoPoliticasCliente);
						}

						jmenuItem.setEnabled(this.estadopoliticasclienteConstantesFunciones.activarPoliticasClienteEstadoPoliticasCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PoliticasCliente"));

						

						this.jInternalFrameDetalleFormEstadoPoliticasCliente.jmenuDetalleEstadoPoliticasCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoPoliticasCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoPoliticasCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoPoliticasCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoPoliticasClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoPoliticasCliente();
		
		this.cargarCombosFrameForeignKeyEstadoPoliticasCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoPoliticasCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoPoliticasCliente();
		}
	}
	
	
	
	public void jButtonNuevoEstadoPoliticasClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
			
			if(jTableDatosEstadoPoliticasCliente.getRowCount()>=1) {
				jTableDatosEstadoPoliticasCliente.removeRowSelectionInterval(0, jTableDatosEstadoPoliticasCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoPoliticasCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoPoliticasCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoPoliticasCliente(true);			
			//this.estadopoliticascliente=new EstadoPoliticasCliente();
			//this.estadopoliticascliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente() ;
			
			if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPoliticasCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadopoliticascliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);				
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
			if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoPoliticasCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoPoliticasClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoPoliticasCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoPoliticasCliente.getSelectedRows().length;			
			}
			
			estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoPoliticasCliente--;			
				//EstadoPoliticasCliente estadopoliticasclienteAux= new EstadoPoliticasCliente();			
				//estadopoliticasclienteAux.setId(this.iIdNuevoEstadoPoliticasCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoPoliticasCliente estadopoliticasclienteOrigen=new EstadoPoliticasCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoPoliticasCliente estadopoliticasclienteOrigen : estadopoliticasclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadopoliticasclienteOrigen =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopoliticasclienteOrigen =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoPoliticasCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadopoliticascliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoPoliticasCliente(estadopoliticasclienteOrigen,this.estadopoliticascliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().add(this.estadopoliticasclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopoliticasclientes.add(this.estadopoliticasclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
				
				this.jTableDatosEstadoPoliticasCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoPoliticasCliente(), this.getIndiceNuevoEstadoPoliticasCliente());
				
				int iLastRow =  this.jTableDatosEstadoPoliticasCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPoliticasCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPoliticasCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();									
		
			EstadoPoliticasCliente estadopoliticasclienteOrigen=new EstadoPoliticasCliente();
			EstadoPoliticasCliente estadopoliticasclienteDestino=new EstadoPoliticasCliente();
				
			estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoPoliticasCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadopoliticasclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoPoliticasCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopoliticasclienteOrigen =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopoliticasclienteOrigen =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopoliticasclienteDestino =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopoliticasclienteDestino =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadopoliticasclienteOrigen =estadopoliticasclientesSeleccionados.get(0);
				estadopoliticasclienteDestino =estadopoliticasclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoPoliticasCliente(estadopoliticasclienteOrigen,estadopoliticasclienteDestino,true,false);
				
				estadopoliticasclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopoliticasclienteDestino,estadopoliticasclienteLogic.getEstadoPoliticasClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopoliticasclienteDestino,estadopoliticasclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
				
				//this.jTableDatosEstadoPoliticasCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoPoliticasCliente(), this.getIndiceNuevoEstadoPoliticasCliente());
				
				int iLastRow =  this.jTableDatosEstadoPoliticasCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPoliticasCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPoliticasCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoPoliticasCliente.isVisible();
			
			
			this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(!isVisible);
			this.jPanelPaginacionEstadoPoliticasCliente.setVisible(!isVisible);
			this.jPanelAccionesEstadoPoliticasCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoPoliticasCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoPoliticasCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoPoliticasCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoPoliticasCliente();
			
			this.abrirFrameOrderByEstadoPoliticasCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoPoliticasCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoPoliticasCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPoliticasCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoPoliticasCliente.setSize(this.jInternalFrameDetalleFormEstadoPoliticasCliente.iWidthFormulario,this.jInternalFrameDetalleFormEstadoPoliticasCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoPoliticasCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoPoliticasCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoPoliticasCliente.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoPoliticasCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jContentPaneDetalleEstadoPoliticasCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jContentPaneDetalleEstadoPoliticasCliente.getWidth(),EstadoPoliticasClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jContentPaneDetalleEstadoPoliticasCliente.getWidth(),EstadoPoliticasClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jContentPaneDetalleEstadoPoliticasCliente.getWidth(),EstadoPoliticasClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPoliticasCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoPoliticasCliente.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoPoliticasCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoPoliticasCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoPoliticasCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoPoliticasCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPoliticasCliente,false,this);
				} else {
					this.jInternalFrameOrderByEstadoPoliticasCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPoliticasCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPoliticasCliente);
				this.jInternalFrameOrderByEstadoPoliticasCliente.setVisible(false);
				this.jInternalFrameOrderByEstadoPoliticasCliente.setSelected(false);
				
				this.jInternalFrameOrderByEstadoPoliticasCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPoliticasCliente"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoPoliticasCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoPoliticasCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoPoliticasCliente==null) {
				
				this.jInternalFrameImportacionEstadoPoliticasCliente=new ImportacionJInternalFrame(EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPoliticasCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPoliticasCliente);
				this.jInternalFrameImportacionEstadoPoliticasCliente.setVisible(false);
				this.jInternalFrameImportacionEstadoPoliticasCliente.setSelected(false);


				this.jInternalFrameImportacionEstadoPoliticasCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPoliticasCliente"));
				this.jInternalFrameImportacionEstadoPoliticasCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPoliticasCliente"));
				this.jInternalFrameImportacionEstadoPoliticasCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPoliticasCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoPoliticasCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente==null) {
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente=new ReporteDinamicoJInternalFrame(EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPoliticasCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente);
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPoliticasCliente"));
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPoliticasCliente"));
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPoliticasCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPoliticasCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPoliticasCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jContentPaneDetalleEstadoPoliticasCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoPoliticasCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPoliticasCliente);
			
	       	this.jInternalFrameDetalleFormEstadoPoliticasCliente.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoPoliticasCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoPoliticasCliente.dispose();
			//this.jInternalFrameDetalleFormEstadoPoliticasCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoPoliticasCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoPoliticasCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoPoliticasCliente.setVisible(true);
	        this.jInternalFrameImportacionEstadoPoliticasCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoPoliticasCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoPoliticasCliente.setVisible(true);
	        this.jInternalFrameOrderByEstadoPoliticasCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoPoliticasCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoPoliticasCliente.setVisible(false);
	        this.jInternalFrameOrderByEstadoPoliticasCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoPoliticasCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoPoliticasCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoPoliticasCliente.setVisible(false);
	        this.jInternalFrameImportacionEstadoPoliticasCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoPoliticasCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoPoliticasCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoPoliticasCliente(true);
			//this.isEsNuevoEstadoPoliticasCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(false) ;
			
			if(estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPoliticasCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoPoliticasClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoPoliticasCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoPoliticasCliente(true);
			//this.isEsNuevoEstadoPoliticasCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadopoliticascliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(false) ;
			
			if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPoliticasCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoPoliticasCliente(false);
			
			//if(!this.isEsNuevoEstadoPoliticasCliente) {								
				int intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
				
			}
			
			if(this.permiteMantenimiento(this.estadopoliticascliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoPoliticasCliente=true;
					this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
					this.isEsNuevoEstadoPoliticasCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoPoliticasCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoPoliticasCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoPoliticasCliente(false);
			
												
				
				if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoPoliticasCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,estadopoliticasclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoPoliticasCliente(this.estadopoliticascliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoPoliticasCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadopoliticasclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadopoliticascliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadopoliticascliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadopoliticascliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadopoliticascliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoPoliticasClienteModel) this.jTableDatosEstadoPoliticasCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoPoliticasCliente=true;
				this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
				this.isEsNuevoEstadoPoliticasCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoPoliticasCliente(false);
				
				
				
				if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoPoliticasCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoPoliticasCliente.getRowCount()>=1) {
				jTableDatosEstadoPoliticasCliente.removeRowSelectionInterval(0, jTableDatosEstadoPoliticasCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoPoliticasCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(false) ;
			
			this.isEsNuevoEstadoPoliticasCliente=false;
			
			if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoPoliticasCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoPoliticasCliente(false);
				
				//SI ES MANUAL
				if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoPoliticasCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoPoliticasCliente--;			
			//EstadoPoliticasCliente estadopoliticasclienteAux= new EstadoPoliticasCliente();			
			//estadopoliticasclienteAux.setId(this.iIdNuevoEstadoPoliticasCliente);
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoPoliticasCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
			
			this.estadopoliticascliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().add(this.estadopoliticasclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadopoliticasclientes.add(this.estadopoliticasclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
			
			this.jTableDatosEstadoPoliticasCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoPoliticasCliente(), this.getIndiceNuevoEstadoPoliticasCliente());
			
			int iLastRow =  this.jTableDatosEstadoPoliticasCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoPoliticasCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoPoliticasCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoPoliticasCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPoliticasCliente(false);
			
			//SI ES MANUAL
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPoliticasCliente();
			}
			
			//this.abrirFrameTreeEstadoPoliticasCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Politicas ClienteS ?", "MANTENIMIENTO DE Estado Politicas Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoPoliticasCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoPoliticasCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadopoliticasclienteReturnGeneral=estadopoliticasclienteLogic.procesarImportacionEstadoPoliticasClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadopoliticasclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoPoliticasClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoPoliticasCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoPoliticasCliente.setFileImportacion(this.jInternalFrameImportacionEstadoPoliticasCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoPoliticasCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoPoliticasCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoPoliticasCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoPoliticasCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		

		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoPoliticasClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoPoliticasClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopoliticascliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoPoliticasClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoPoliticasCliente estadopoliticascliente:estadopoliticasclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopoliticascliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoPoliticasCliente estadopoliticascliente:estadopoliticasclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopoliticascliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoPoliticasCliente(row);				
			//	iRow++;
			//}				
			
			//for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoPoliticasCliente(estadopoliticasclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPoliticasCliente(false);
			
			//SI ES MANUAL
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPoliticasCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPoliticasCliente(false);
			
			//SI ES MANUAL
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPoliticasCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoPoliticasClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPoliticasCliente(false);
			
			//SI ES MANUAL
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPoliticasCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoPoliticasCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoPoliticasCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoPoliticasCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoPoliticasCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoPoliticasCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoPoliticasCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoPoliticasCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoPoliticasCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoPoliticasCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoPoliticasCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoPoliticasCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoPoliticasCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoPoliticasCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPoliticasCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoPoliticasCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoPoliticasCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoPoliticasCliente();
		
		this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPoliticasCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPoliticasCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPoliticasCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPoliticasCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoPoliticasCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoPoliticasCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jCheckBoxPostAccionNuevoEstadoPoliticasCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoPoliticasCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoPoliticasCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.jCheckBoxPostAccionNuevoEstadoPoliticasCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.jCheckBoxPostAccionSinCerrarEstadoPoliticasCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.jCheckBoxPostAccionSinMensajeEstadoPoliticasCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoPoliticasCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoPoliticasCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoPoliticasCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoPoliticasCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoPoliticasCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoPoliticasCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoPoliticasCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPoliticasCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPoliticasCliente() throws Exception {
		try	{
			if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPoliticasCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPoliticasCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPoliticasCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoPoliticasCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoPoliticasCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoPoliticasCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoPoliticasCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoPoliticasCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoPoliticasCliente.addItem(reporte);
			}
			
			
			if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoPoliticasCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoPoliticasCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoPoliticasCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoPoliticasCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoPoliticasCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoPoliticasCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPoliticasCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPoliticasCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoPoliticasCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoPoliticasCliente(Boolean esInicializar) throws Exception {				
		if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPoliticasCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoPoliticasCliente() throws Exception {
		this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoPoliticasCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoPoliticasClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoPoliticasClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoPoliticasClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPoliticasClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoPoliticasClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoPoliticasClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoPoliticasCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadopoliticasclienteLogic.getEstadoPoliticasClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadopoliticasclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoPoliticasCliente.setModel(new EstadoPoliticasClienteModel(this.estadopoliticasclienteLogic.getEstadoPoliticasClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoPoliticasCliente.setModel(new EstadoPoliticasClienteModel(this.estadopoliticasclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoPoliticasCliente!=null && this.jInternalFrameOrderByEstadoPoliticasCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoPoliticasCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPoliticasCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoPoliticasClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO,estadopoliticasclienteConstantesFunciones.resaltarSeleccionarEstadoPoliticasCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoPoliticasClienteConstantesFunciones.SCLASSWEBTITULO,estadopoliticasclienteConstantesFunciones.resaltarSeleccionarEstadoPoliticasCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPoliticasCliente,EstadoPoliticasClienteConstantesFunciones.LABEL_ID));

		if(this.estadopoliticasclienteConstantesFunciones.mostraridEstadoPoliticasCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPoliticasClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadopoliticasclienteConstantesFunciones.resaltaridEstadoPoliticasCliente,this.estadopoliticasclienteConstantesFunciones.activaridEstadoPoliticasCliente,this,true,"idEstadoPoliticasCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopoliticasclienteConstantesFunciones.resaltaridEstadoPoliticasCliente,this.estadopoliticasclienteConstantesFunciones.activaridEstadoPoliticasCliente,this,true,"idEstadoPoliticasCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPoliticasCliente,EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO));

		if(this.estadopoliticasclienteConstantesFunciones.mostrarcodigoEstadoPoliticasCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadopoliticasclienteConstantesFunciones.resaltarcodigoEstadoPoliticasCliente,this.estadopoliticasclienteConstantesFunciones.activarcodigoEstadoPoliticasCliente,this,true,"codigoEstadoPoliticasCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopoliticasclienteConstantesFunciones.resaltarcodigoEstadoPoliticasCliente,this.estadopoliticasclienteConstantesFunciones.activarcodigoEstadoPoliticasCliente,this,true,"codigoEstadoPoliticasCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPoliticasClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPoliticasCliente,EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.estadopoliticasclienteConstantesFunciones.mostrarnombreEstadoPoliticasCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadopoliticasclienteConstantesFunciones.resaltarnombreEstadoPoliticasCliente,this.estadopoliticasclienteConstantesFunciones.activarnombreEstadoPoliticasCliente,this,true,"nombreEstadoPoliticasCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopoliticasclienteConstantesFunciones.resaltarnombreEstadoPoliticasCliente,this.estadopoliticasclienteConstantesFunciones.activarnombreEstadoPoliticasCliente,this,true,"nombreEstadoPoliticasCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPoliticasClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPoliticasCliente && this.estadopoliticasclienteConstantesFunciones.mostrarPoliticasClienteEstadoPoliticasCliente && !EstadoPoliticasClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Politicas Clientes");
				tableColumn.setHeaderValue("Politicas Clientes");
				tableColumn.setCellRenderer(new PoliticasClienteTableCell(estadopoliticasclienteConstantesFunciones.resaltarPoliticasClienteEstadoPoliticasCliente,this,this.estadopoliticasclienteConstantesFunciones.activarPoliticasClienteEstadoPoliticasCliente));
				tableColumn.setCellEditor(new PoliticasClienteTableCell(estadopoliticasclienteConstantesFunciones.resaltarPoliticasClienteEstadoPoliticasCliente,this,this.estadopoliticasclienteConstantesFunciones.activarPoliticasClienteEstadoPoliticasCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoPoliticasCliente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPoliticasCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPoliticasCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoPoliticasCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoPoliticasCliente.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoPoliticasCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoPoliticasCliente.moveColumn(this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoPoliticasCliente.moveColumn(this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoPoliticasCliente.moveColumn(this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoPoliticasCliente.moveColumn(this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoPoliticasCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoPoliticasCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoPoliticasCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoPoliticasCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoPoliticasCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoPoliticasCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadopoliticasclienteLogic.getEstadoPoliticasClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadopoliticasclientes.size()-1;
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
		//this.jTableDatosEstadoPoliticasCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoPoliticasCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoPoliticasCliente();
			
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
				
				//this.isEsNuevoEstadoPoliticasCliente=false;
					
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
				if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPoliticasCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPoliticasCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadopoliticascliente.getsType().equals("DUPLICADO")
				   || this.estadopoliticascliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoPoliticasCliente=true;
				
				} else {
					this.isEsNuevoEstadoPoliticasCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.estadopoliticascliente.getId()>=0 && !this.estadopoliticascliente.getIsNew()) {						
						this.isEsNuevoEstadoPoliticasCliente=false;
						
					} else {
						this.isEsNuevoEstadoPoliticasCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoPoliticasCliente(esRelaciones);						
				
				this.seleccionarEstadoPoliticasCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadopoliticascliente.getId()<0) {
					this.isEsNuevoEstadoPoliticasCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoPoliticasCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoPoliticasCliente(evt,rowIndex);
				}	
				
				if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoPoliticasCliente: " + this.dDif); 
					}
				}								
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoPoliticasCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadopoliticascliente)) {
					if(this.estadopoliticascliente.getId()>0) {
						this.estadopoliticascliente.setIsDeleted(true);
						
						this.estadopoliticasclientesEliminados.add(this.estadopoliticascliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().remove(this.estadopoliticascliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopoliticasclientes.remove(this.estadopoliticascliente);				
					}
					
					
					((EstadoPoliticasClienteModel) this.jTableDatosEstadoPoliticasCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoPoliticasCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoPoliticasCliente) {
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPoliticasCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPoliticasCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoPoliticasCliente(this.estadopoliticascliente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoPoliticasCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoPoliticasCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoPoliticasCliente(estadopoliticascliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoPoliticasCliente(estadopoliticascliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoPoliticasCliente(estadopoliticascliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoPoliticasCliente(estadopoliticascliente);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.setText(estadopoliticascliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.setText(estadopoliticascliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.setText(estadopoliticascliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoPoliticasCliente estadopoliticasclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadopoliticasclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoPoliticasCliente estadopoliticasclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadopoliticasclienteLocal=this.estadopoliticascliente;
			} else {
				estadopoliticasclienteLocal=this.estadopoliticasclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadopoliticasclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoPoliticasCliente(estadopoliticasclienteLocal,true);
					
					if(estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadopoliticasclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadopoliticasclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(estadopoliticascliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(estadopoliticascliente);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(estadopoliticascliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.getText()==null || this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.getText()=="" || this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.setText("0");
			}

			if(conColumnasBase) {estadopoliticascliente.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPoliticasClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPoliticasCliente.jLabelIdEstadoPoliticasCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadopoliticascliente.setcodigo(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPoliticasCliente.jLabelcodigoEstadoPoliticasCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadopoliticascliente.setnombre(this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPoliticasCliente.jLabelnombreEstadoPoliticasCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticasclienteBean,EstadoPoliticasCliente estadopoliticascliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticasclienteOrigen,EstadoPoliticasCliente estadopoliticascliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopoliticasclienteOrigen.getId()!=null && !estadopoliticasclienteOrigen.getId().equals(0L))) {estadopoliticascliente.setId(estadopoliticasclienteOrigen.getId());}}
			if(conDefault || (!conDefault && estadopoliticasclienteOrigen.getcodigo()!=null && !estadopoliticasclienteOrigen.getcodigo().equals(""))) {estadopoliticascliente.setcodigo(estadopoliticasclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadopoliticasclienteOrigen.getnombre()!=null && !estadopoliticasclienteOrigen.getnombre().equals(""))) {estadopoliticascliente.setnombre(estadopoliticasclienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.setText(estadopoliticascliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.setText(estadopoliticascliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.setText(estadopoliticascliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPoliticasCliente(EstadoPoliticasClienteBean estadopoliticasclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.setText(estadopoliticasclienteBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.setText(estadopoliticasclienteBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.setText(estadopoliticasclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoPoliticasCliente(EstadoPoliticasClienteParameterReturnGeneral estadopoliticasclienteReturnGeneral,EstadoPoliticasClienteBean estadopoliticasclienteBean,Boolean conDefault) throws Exception { 
		try {
			EstadoPoliticasCliente estadopoliticasclienteLocal=new EstadoPoliticasCliente();
			
			estadopoliticasclienteLocal=estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopoliticasclienteLocal.getId()!=null && !estadopoliticasclienteLocal.getId().equals(0L))) {estadopoliticasclienteBean.setId(estadopoliticasclienteLocal.getId());}}
			if(conDefault || (!conDefault && estadopoliticasclienteLocal.getcodigo()!=null && !estadopoliticasclienteLocal.getcodigo().equals(""))) {estadopoliticasclienteBean.setcodigo(estadopoliticasclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && estadopoliticasclienteLocal.getnombre()!=null && !estadopoliticasclienteLocal.getnombre().equals(""))) {estadopoliticasclienteBean.setnombre(estadopoliticasclienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoPoliticasClienteGenerico(Long idEstadoPoliticasClienteSeleccionado,JComboBox jComboBoxEstadoPoliticasCliente,List<EstadoPoliticasCliente> estadopoliticasclientesLocal)throws Exception {
		try {
			EstadoPoliticasCliente  estadopoliticasclienteTemp=null;

			for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientesLocal) {
				if(estadopoliticasclienteAux.getId()!=null && estadopoliticasclienteAux.getId().equals(idEstadoPoliticasClienteSeleccionado)) {
					estadopoliticasclienteTemp=estadopoliticasclienteAux;
					break;
				}
			}

			jComboBoxEstadoPoliticasCliente.setSelectedItem(estadopoliticasclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoPoliticasClienteGenerico(JComboBox jComboBoxEstadoPoliticasCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPoliticasCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoPoliticasCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPoliticasCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoPoliticasCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoPoliticasCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoPoliticasCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PoliticasCliente")) {
			jButtonPoliticasClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopoliticascliente=(EstadoPoliticasCliente) estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopoliticascliente =(EstadoPoliticasCliente) estadopoliticasclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoPoliticasCliente estadopoliticasclienteRow=new EstadoPoliticasCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopoliticasclienteRow=(EstadoPoliticasCliente) estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopoliticasclienteRow=(EstadoPoliticasCliente) estadopoliticasclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPoliticasClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoPoliticasCliente estadopoliticascliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopoliticascliente = (EstadoPoliticasCliente)this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadopoliticascliente = (EstadoPoliticasCliente)this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadopoliticascliente!=null) {
						this.estadopoliticascliente = estadopoliticascliente;
					} else {
						this.estadopoliticascliente = new EstadoPoliticasCliente();
					}
				}

				if(this.isTienePermisosPoliticasCliente && this.permiteMantenimiento(this.estadopoliticascliente)) {
					PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFramePopup;
					} else {
						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame;
					}

					List<EstadoPoliticasCliente> estadopoliticasclientes=new ArrayList<EstadoPoliticasCliente>();
					estadopoliticasclientes.add(this.estadopoliticascliente);
					if(!esRelacionado) {
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setConGuardarRelaciones(false);
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.cargarPoliticasClienteBeanSwingJInternalFrame(estadopoliticasclientes,this.estadopoliticascliente,politicasclienteBeanSwingJInternalFrame,/*conInicializar,*/politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getConGuardarRelaciones(),politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado());
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");

						politicasclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA + (PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						politicasclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoPoliticasCliente=(TitledBorder)this.jScrollPanelDatosEstadoPoliticasCliente.getBorder();
						TitledBorder titledBorderPoliticasCliente=(TitledBorder)politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getBorder();

						titledBorderPoliticasCliente.setTitle(titledBorderEstadoPoliticasCliente.getTitle() + " -> Politicas Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,politicasclienteBeanSwingJInternalFrame);
						}

						politicasclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(politicasclienteBeanSwingJInternalFrame);

						politicasclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Politicas Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente));			
			this.jButtonDuplicarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoPoliticasCliente && this.isPermisoDuplicarEstadoPoliticasCliente));			
			this.jButtonCopiarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoPoliticasCliente && this.isPermisoCopiarEstadoPoliticasCliente));
			this.jButtonVerFormEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoPoliticasCliente && this.isPermisoVerFormEstadoPoliticasCliente));
			
			this.jButtonAbrirOrderByEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoPoliticasCliente && this.isPermisoOrdenEstadoPoliticasCliente));			
			
			this.jButtonNuevoRelacionesEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente));			
			this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaModificarEstadoPoliticasCliente && this.isPermisoActualizarEstadoPoliticasCliente));	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoPoliticasCliente && this.isPermisoActualizarEstadoPoliticasCliente));	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoPoliticasCliente && this.isPermisoEliminarEstadoPoliticasCliente));
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarEstadoPoliticasCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoPoliticasCliente);							
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente));						
			this.jButtonDuplicarToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoPoliticasCliente && this.isPermisoDuplicarEstadoPoliticasCliente));						
			this.jButtonCopiarToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoPoliticasCliente && this.isPermisoCopiarEstadoPoliticasCliente));			
			this.jButtonVerFormToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoPoliticasCliente && this.isPermisoVerFormEstadoPoliticasCliente));			
			this.jButtonAbrirOrderByToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoPoliticasCliente && this.isPermisoOrdenEstadoPoliticasCliente));
			this.jButtonNuevoRelacionesToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));			
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaModificarEstadoPoliticasCliente && this.isPermisoActualizarEstadoPoliticasCliente));	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoPoliticasCliente  && this.isPermisoActualizarEstadoPoliticasCliente));	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoPoliticasCliente && this.isPermisoEliminarEstadoPoliticasCliente));
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarToolBarEstadoPoliticasCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoPoliticasCliente);				
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente));			
			this.jMenuItemDuplicarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoPoliticasCliente && this.isPermisoDuplicarEstadoPoliticasCliente));			
			this.jMenuItemCopiarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoPoliticasCliente && this.isPermisoCopiarEstadoPoliticasCliente));			
			this.jMenuItemVerFormEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoPoliticasCliente && this.isPermisoVerFormEstadoPoliticasCliente));			
			this.jMenuItemAbrirOrderByEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoPoliticasCliente && this.isPermisoOrdenEstadoPoliticasCliente));			
			//this.jMenuItemMostrarOcultarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoPoliticasCliente && this.isPermisoOrdenEstadoPoliticasCliente));
			this.jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoPoliticasCliente && this.isPermisoOrdenEstadoPoliticasCliente));			
			//this.jMenuItemDetalleMostrarOcultarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoPoliticasCliente && this.isPermisoOrdenEstadoPoliticasCliente));			
			this.jMenuItemNuevoRelacionesEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente));			
			this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoPoliticasCliente && this.isPermisoNuevoEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));									
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemModificarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaModificarEstadoPoliticasCliente && this.isPermisoActualizarEstadoPoliticasCliente));	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemActualizarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoPoliticasCliente && this.isPermisoActualizarEstadoPoliticasCliente));	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemEliminarEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoPoliticasCliente && this.isPermisoEliminarEstadoPoliticasCliente));
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemCancelarEstadoPoliticasCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoPoliticasCliente);				
			}
			
			this.jMenuItemGuardarCambiosEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));						
			this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=this.jButtonNuevoEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoPoliticasCliente=this.jButtonDuplicarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaCopiarEstadoPoliticasCliente=this.jButtonCopiarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaVerFormEstadoPoliticasCliente=this.jButtonVerFormEstadoPoliticasCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoPoliticasCliente=this.jButtonAbrirOrderByEstadoPoliticasCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=this.jButtonNuevoRelacionesEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=this.jButtonModificarEstadoPoliticasCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=this.jButtonNuevoToolBarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=this.jButtonNuevoRelacionesToolBarEstadoPoliticasCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarToolBarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarToolBarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarToolBarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarToolBarEstadoPoliticasCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=this.jButtonGuardarCambiosToolBarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=this.jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=this.jMenuItemNuevoEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=this.jMenuItemNuevoRelacionesEstadoPoliticasCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemModificarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemActualizarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemEliminarEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemCancelarEstadoPoliticasCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=this.jMenuItemGuardarCambiosEstadoPoliticasCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoPoliticasCliente(Boolean esInicializar) {
		if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPoliticasCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoPoliticasCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoPoliticasCliente() {
		this.jButtonNuevoEstadoPoliticasCliente.setVisible(this.isPermisoNuevoEstadoPoliticasCliente);			
		this.jButtonDuplicarEstadoPoliticasCliente.setVisible(this.isPermisoDuplicarEstadoPoliticasCliente);			
		this.jButtonCopiarEstadoPoliticasCliente.setVisible(this.isPermisoCopiarEstadoPoliticasCliente);			
		this.jButtonVerFormEstadoPoliticasCliente.setVisible(this.isPermisoVerFormEstadoPoliticasCliente);			
		
		this.jButtonAbrirOrderByEstadoPoliticasCliente.setVisible(this.isPermisoOrdenEstadoPoliticasCliente);					
		
		this.jButtonNuevoRelacionesEstadoPoliticasCliente.setVisible(this.isPermisoNuevoEstadoPoliticasCliente);			
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarEstadoPoliticasCliente.setVisible(this.isPermisoActualizarEstadoPoliticasCliente);	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarEstadoPoliticasCliente.setVisible(this.isPermisoActualizarEstadoPoliticasCliente);	
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarEstadoPoliticasCliente.setVisible(this.isPermisoEliminarEstadoPoliticasCliente);
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarEstadoPoliticasCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoPoliticasCliente);						
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.setVisible(this.isPermisoGuardarCambiosEstadoPoliticasCliente);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.setVisible(this.isPermisoActualizarEstadoPoliticasCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPoliticasCliente() {
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarEstadoPoliticasCliente.setVisible(this.isPermisoActualizarEstadoPoliticasCliente);	
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarEstadoPoliticasCliente.setVisible(this.isPermisoActualizarEstadoPoliticasCliente);	
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarEstadoPoliticasCliente.setVisible(this.isPermisoEliminarEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarEstadoPoliticasCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoPoliticasCliente);							
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoPoliticasCliente && this.isPermisoGuardarCambiosEstadoPoliticasCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoPoliticasCliente() {
		if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoPoliticasCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoPoliticasCliente() {
	}
	
	public void jTableDatosEstadoPoliticasClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoPoliticasCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoPoliticasClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.getestadopoliticascliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopoliticascliente==null) {
						this.estadopoliticascliente = new EstadoPoliticasCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
				}

				if(this.estadopoliticascliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadopoliticascliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPoliticasCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoPoliticasClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.getestadopoliticascliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopoliticascliente==null) {
						this.estadopoliticascliente = new EstadoPoliticasCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
				}

				if(this.estadopoliticascliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadopoliticascliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPoliticasCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoPoliticasClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.getestadopoliticascliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopoliticascliente==null) {
						this.estadopoliticascliente = new EstadoPoliticasCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);
				}

				if(this.estadopoliticascliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadopoliticascliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPoliticasCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoPoliticasCliente() {
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.dispose();
			this.jInternalFrameDetalleFormEstadoPoliticasCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
			this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.dispose();
			this.jInternalFrameReporteDinamicoEstadoPoliticasCliente=null;
		}
		
		if(this.jInternalFrameImportacionEstadoPoliticasCliente!=null) {
			this.jInternalFrameImportacionEstadoPoliticasCliente.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoPoliticasCliente.dispose();
			this.jInternalFrameImportacionEstadoPoliticasCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoPoliticasCliente();
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoPoliticasCliente")) {
				jButtonDuplicarEstadoPoliticasClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoPoliticasCliente")) {
				jButtonCopiarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoPoliticasCliente")) {
				jButtonVerFormEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoPoliticasCliente")) {
				jButtonDuplicarEstadoPoliticasClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoPoliticasCliente")) {
				jButtonDuplicarEstadoPoliticasClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoPoliticasCliente")) {
				jButtonModificarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoPoliticasCliente")) {
				jButtonModificarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoPoliticasCliente")) {
				jButtonModificarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoPoliticasCliente")) {
				jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoPoliticasCliente")) {
				jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoPoliticasCliente")) {
				jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoPoliticasCliente")) {
				jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoPoliticasCliente")) {
				jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoPoliticasCliente")) {
				jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoPoliticasCliente")) {
				jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoPoliticasCliente")) {
				jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoPoliticasCliente")) {
				jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoPoliticasCliente")) {
				jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoPoliticasCliente")) {
				jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoPoliticasCliente")) {
				jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoPoliticasCliente")) {
				jButtonMostrarOcultarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoPoliticasCliente")) {
				jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoPoliticasCliente")) {
				jButtonCopiarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoPoliticasCliente")) {
				jButtonVerFormEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoPoliticasCliente")) {
				jButtonCopiarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoPoliticasCliente")) {
				jButtonVerFormEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoPoliticasCliente")) {
				jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoPoliticasCliente")) {
				jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoPoliticasCliente")) {
				jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoPoliticasCliente")) {
				jButtonAnterioresEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoPoliticasCliente")) {
				jButtonAnterioresEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoPoliticasCliente")) {
				jButtonAnterioresEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoPoliticasCliente")) {
				jButtonSiguientesEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoPoliticasCliente")) {
				jButtonSiguientesEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoPoliticasCliente")) {
				jButtonSiguientesEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoPoliticasCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoPoliticasCliente")) {
				jButtonAbrirOrderByEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoPoliticasCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoPoliticasCliente")) {
				jButtonMostrarOcultarEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPoliticasCliente")) {
				jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoPoliticasCliente")) {
				jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoPoliticasCliente")) {
				jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoPoliticasCliente")) {
				jButtonCerrarReporteDinamicoEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoPoliticasCliente")) {
				jButtonGenerarReporteDinamicoEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoPoliticasCliente")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoPoliticasCliente")) {
				jButtonCerrarImportacionEstadoPoliticasClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoPoliticasCliente")) {
				
				jButtonGenerarImportacionEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoPoliticasCliente")) {
				
				jButtonAbrirImportacionEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoPoliticasCliente")) {
				jComboBoxTiposAccionesEstadoPoliticasClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoPoliticasCliente")) {
				jComboBoxTiposRelacionesEstadoPoliticasClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoPoliticasCliente")) {
				jComboBoxTiposAccionesEstadoPoliticasClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoPoliticasCliente")) {
				
				jComboBoxTiposSeleccionarEstadoPoliticasClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoPoliticasCliente")) {
				jTextFieldValorCampoGeneralEstadoPoliticasClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoPoliticasCliente")) {
				jButtonAbrirOrderByEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoPoliticasCliente")) {
				jButtonAbrirOrderByEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoPoliticasCliente")) {
				jButtonCerrarOrderByEstadoPoliticasClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPoliticasClienteBusqueda")) {
				this.jButtonidEstadoPoliticasClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPoliticasClienteBusqueda")) {
				this.jButtoncodigoEstadoPoliticasClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPoliticasClienteBusqueda")) {
				this.jButtonnombreEstadoPoliticasClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoPoliticasCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoPoliticasCliente estadopoliticasclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadopoliticasclienteLocal=this.estadopoliticascliente;
			} else {
				estadopoliticasclienteLocal=this.estadopoliticasclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
							
				
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
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
			
			


			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPoliticasClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
								
						
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
								
				
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
							
				
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
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
			
			


			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
								
				
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPoliticasClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoPoliticasCliente")) {
					jCheckBoxSeleccionarTodosEstadoPoliticasClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoPoliticasCliente")) {
					jCheckBoxSeleccionadosEstadoPoliticasClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoPoliticasCliente")) {
					
				}
				
				


				
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
												
				
				


				
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPoliticasClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
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
			
			


			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopoliticascliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopoliticascliente);
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
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
				
				


				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPoliticasCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPoliticasCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPoliticasClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopoliticasclienteAnterior =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoPoliticasCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoPoliticasClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoPoliticasCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadopoliticascliente =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadopoliticascliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoPoliticasCliente")) {
				
				}
				
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoPoliticasCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoPoliticasCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoPoliticasCliente")) {
			
			}
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoPoliticasCliente();
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoPoliticasCliente")) {
				jButtonDuplicarEstadoPoliticasClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoPoliticasCliente")) {
				jButtonCopiarEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoPoliticasCliente")) {
				jButtonVerFormEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoPoliticasCliente")) {
				jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoPoliticasCliente")) {
				jButtonModificarEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoPoliticasCliente")) {
				jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoPoliticasCliente")) {
				jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoPoliticasCliente")) {
				jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoPoliticasCliente")) {
				jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoPoliticasCliente")) {
				jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPoliticasCliente")) {
				jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoPoliticasCliente")) {
				jButtonAbrirOrderByEstadoPoliticasClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoPoliticasCliente")) {
				jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoPoliticasCliente")) {
				jButtonAnterioresEstadoPoliticasClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoPoliticasCliente")) {
				jButtonSiguientesEstadoPoliticasClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPoliticasClienteBusqueda")) {
				this.jButtonidEstadoPoliticasClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoPoliticasClienteBusqueda")) {
				this.jButtoncodigoEstadoPoliticasClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPoliticasClienteBusqueda")) {
				this.jButtonnombreEstadoPoliticasClienteBusquedaActionPerformed(evt);
			}
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoPoliticasCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoPoliticasCliente")) {
				closingInternalFrameEstadoPoliticasCliente();
				
			} else if(sTipo.equals("jButtonCancelarEstadoPoliticasCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoPoliticasCliente = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoPoliticasClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoPoliticasClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPoliticasCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoPoliticasClienteActionPerformed(null);
			}
			
			EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopoliticascliente,new Object(),this.estadopoliticasclienteParameterGeneral,this.estadopoliticasclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoPoliticasCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoPoliticasCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoPoliticasCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadopoliticascliente)) {
			if(!esControlTabla) {
				if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);			
				}
				
				if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopoliticasclienteReturnGeneral=estadopoliticasclienteLogic.procesarEventosEstadoPoliticasClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopoliticasclienteLogic.getEstadoPoliticasClientes(),this.estadopoliticascliente,this.estadopoliticasclienteParameterGeneral,this.isEsNuevoEstadoPoliticasCliente,classes);//this.estadopoliticasclienteLogic.getEstadoPoliticasCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral,this.estadopoliticasclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPoliticasCliente(classes,this.estadopoliticasclienteReturnGeneral,this.estadopoliticasclienteBean,false);
					}
						
					if(this.estadopoliticasclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente());	
					}
						
					if(this.estadopoliticasclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente(),classes);//this.estadopoliticasclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoPoliticasCliente(this.estadopoliticascliente,classes);//this.estadopoliticasclienteBean);									
				}
			
				if(EstadoPoliticasClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoPoliticasCliente(this.estadopoliticascliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPoliticasCliente(this.estadopoliticascliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadopoliticasclienteAnterior!=null) {
						this.estadopoliticascliente=this.estadopoliticasclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopoliticasclienteReturnGeneral=estadopoliticasclienteLogic.procesarEventosEstadoPoliticasClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopoliticasclienteLogic.getEstadoPoliticasClientes(),this.estadopoliticascliente,this.estadopoliticasclienteParameterGeneral,this.isEsNuevoEstadoPoliticasCliente,classes);//this.estadopoliticasclienteLogic.getEstadoPoliticasCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopoliticasclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente(),estadopoliticasclienteLogic.getEstadoPoliticasClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente(),this.estadopoliticasclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoPoliticasCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoPoliticasCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoPoliticasCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoPoliticasCliente() throws Exception {
		
		EstadoPoliticasClienteModel estadopoliticasclienteModel=(EstadoPoliticasClienteModel)this.jTableDatosEstadoPoliticasCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopoliticasclienteModel.estadopoliticasclientes=this.estadopoliticasclienteLogic.getEstadoPoliticasClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadopoliticasclienteModel.estadopoliticasclientes=this.estadopoliticasclientes;
		}
		
		
		((EstadoPoliticasClienteModel) this.jTableDatosEstadoPoliticasCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoPoliticasCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadopoliticasclienteAnterior(),this.estadopoliticasclienteLogic.getEstadoPoliticasClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadopoliticasclienteAnterior(),this.estadopoliticasclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoPoliticasCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(estadopoliticascliente.getPoliticasClientes());
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
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
										
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopoliticascliente,new Object(),generalEntityParameterGeneral,this.estadopoliticasclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoPoliticasClienteConstantesFunciones.getClassesRelationshipsOfEstadoPoliticasCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoPoliticasClienteConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoPoliticasCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoPoliticasCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopoliticascliente,new Object(),generalEntityParameterGeneral,this.estadopoliticasclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoPoliticasCliente(EstadoPoliticasClienteBean estadopoliticasclienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(estadopoliticascliente.getPoliticasClientes());
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPoliticasCliente(ArrayList<Classe> classes,EstadoPoliticasClienteReturnGeneral estadopoliticasclienteReturnGeneral,EstadoPoliticasClienteBean estadopoliticasclienteBean,Boolean conDefault) throws Exception {
		
			this.estadopoliticasclienteBean.setPoliticasClientes(estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente().getPoliticasClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					estadopoliticascliente.setPoliticasClientes(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadopoliticascliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente = new EstadoPoliticasClienteDetalleFormJInternalFrame(jDesktopPane,this.estadopoliticasclienteSessionBean.getConGuardarRelaciones(),this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.setVisible(false);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.estadopoliticasclienteLogic=this.estadopoliticasclienteLogic;
		
		this.cargarCombosFrameForeignKeyEstadoPoliticasCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPoliticasCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPoliticasCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoPoliticasCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoPoliticasCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPoliticasCliente"));
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoPoliticasCliente"));

		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarToolBarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPoliticasCliente"));
					
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemModificarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPoliticasCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPoliticasCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarToolBarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPoliticasCliente"));
						
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemActualizarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPoliticasCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoPoliticasCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPoliticasCliente"));
								
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemEliminarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPoliticasCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoPoliticasCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPoliticasCliente"));
					
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemCancelarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPoliticasCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemDetalleCerrarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPoliticasCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPoliticasCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPoliticasCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPoliticasCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonidEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPoliticasClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtoncodigoEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPoliticasClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonnombreEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPoliticasClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPoliticasCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoPoliticasCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPoliticasCliente"));
		}
		
		this.jTableDatosEstadoPoliticasCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoPoliticasCliente"));
		
		this.jTableDatosEstadoPoliticasCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoPoliticasCliente"));
		
		this.jButtonNuevoEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"NuevoEstadoPoliticasCliente"));
		
		this.jButtonDuplicarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"DuplicarEstadoPoliticasCliente"));
		
		this.jButtonCopiarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"CopiarEstadoPoliticasCliente"));
		
		this.jButtonVerFormEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"VerFormEstadoPoliticasCliente"));
		
		
		this.jButtonNuevoToolBarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoPoliticasCliente"));
			
		this.jButtonDuplicarToolBarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoPoliticasCliente"));
			
		this.jMenuItemNuevoEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoPoliticasCliente"));
			
		this.jMenuItemDuplicarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoPoliticasCliente"));		
		
		
		this.jButtonNuevoRelacionesEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoPoliticasCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoPoliticasCliente"));
			
		this.jMenuItemNuevoRelacionesEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoPoliticasCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoPoliticasCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonModificarToolBarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPoliticasCliente"));
			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemModificarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPoliticasCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPoliticasCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonActualizarToolBarEstadoPoliticasCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPoliticasCliente"));
				
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemActualizarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPoliticasCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoPoliticasCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonEliminarToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPoliticasCliente"));
						
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemEliminarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPoliticasCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoPoliticasCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonCancelarToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPoliticasCliente"));
			
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemCancelarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPoliticasCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoPoliticasCliente"));		
		
		
		this.jButtonCerrarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CerrarEstadoPoliticasCliente"));
		
		
		this.jButtonCerrarToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoPoliticasCliente"));
			
		this.jMenuItemCerrarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoPoliticasCliente"));
			
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jMenuItemDetalleCerrarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPoliticasCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoPoliticasCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPoliticasCliente"));
		}
		
		this.jButtonCopiarToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoPoliticasCliente"));
			
		this.jButtonVerFormToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoPoliticasCliente"));
		
		this.jMenuItemGuardarCambiosEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoPoliticasCliente"));
			
		this.jMenuItemCopiarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoPoliticasCliente"));		
		
		this.jMenuItemVerFormEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoPoliticasCliente"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPoliticasCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoPoliticasCliente"));
			
		this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPoliticasCliente"));		
		
		
		
		this.jButtonRecargarInformacionEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoPoliticasCliente"));
					
		this.jButtonRecargarInformacionToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoPoliticasCliente"));
		
		this.jMenuItemRecargarInformacionEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoPoliticasCliente"));		
		
		
		
		this.jButtonAnterioresEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"AnterioresEstadoPoliticasCliente"));
		
		
		this.jButtonAnterioresToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoPoliticasCliente"));
		
		this.jMenuItemAnterioresEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoPoliticasCliente"));		
		
		
		this.jButtonSiguientesEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"SiguientesEstadoPoliticasCliente"));
		
		
		this.jButtonSiguientesToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoPoliticasCliente"));
			
		this.jMenuItemSiguientesEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoPoliticasCliente"));
			
		this.jMenuItemAbrirOrderByEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoPoliticasCliente"));
			
		this.jMenuItemMostrarOcultarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoPoliticasCliente"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoPoliticasCliente"));
			
		this.jMenuItemDetalleMostarOcultarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoPoliticasCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoPoliticasCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoPoliticasCliente"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoPoliticasCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoPoliticasCliente"));

		this.jCheckBoxSeleccionadosEstadoPoliticasCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoPoliticasCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPoliticasCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoPoliticasCliente"));
			
		this.jComboBoxTiposAccionesEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoPoliticasCliente"));
					
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoPoliticasCliente"));
			
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoPoliticasCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonidEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPoliticasClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtoncodigoEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPoliticasClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonnombreEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPoliticasClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoPoliticasCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPoliticasCliente"));
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPoliticasCliente"));
				this.jInternalFrameReporteDinamicoEstadoPoliticasCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPoliticasCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPoliticasCliente"));				
			//this.jButtonGenerarReporteDinamicoEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPoliticasCliente"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPoliticasCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoPoliticasCliente!=null) {
				this.jInternalFrameImportacionEstadoPoliticasCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPoliticasCliente"));
				this.jInternalFrameImportacionEstadoPoliticasCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPoliticasCliente"));
				this.jInternalFrameImportacionEstadoPoliticasCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPoliticasCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoPoliticasCliente"));
			
			this.jButtonAbrirOrderByToolBarEstadoPoliticasCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoPoliticasCliente"));			
			
			if(this.jInternalFrameOrderByEstadoPoliticasCliente!=null) {
				this.jInternalFrameOrderByEstadoPoliticasCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPoliticasCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTabbedPaneRelacionesEstadoPoliticasCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPoliticasCliente"));
		
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
            		closingInternalFrameEstadoPoliticasCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoPoliticasCliente = (JInternalFrameBase)event.getSource();
	            	
	            EstadoPoliticasClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoPoliticasClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPoliticasCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoPoliticasClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoPoliticasCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoPoliticasClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoPoliticasCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoPoliticasCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoPoliticasCliente";
		inputMap = this.jButtonNuevoEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoPoliticasCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPoliticasClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoPoliticasCliente";
		inputMap = this.jButtonModificarEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoPoliticasClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoPoliticasCliente";
		inputMap = this.jButtonActualizarEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoPoliticasClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoPoliticasCliente";
		inputMap = this.jButtonEliminarEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoPoliticasClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoPoliticasCliente";
		inputMap = this.jButtonCancelarEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoPoliticasCliente";
		inputMap = this.jButtonCerrarEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoPoliticasClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoPoliticasCliente";
		inputMap = this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonGuardarCambiosEstadoPoliticasCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoPoliticasCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoPoliticasClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoPoliticasCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoPoliticasClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoPoliticasClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoPoliticasCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoPoliticasClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonidEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPoliticasClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtoncodigoEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoPoliticasClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jButtonnombreEstadoPoliticasClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPoliticasClienteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoPoliticasCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoPoliticasClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoPoliticasClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoPoliticasCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoPoliticasCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
					estadopoliticasclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientes) {
					estadopoliticasclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoPoliticasClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPoliticasCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
						estadopoliticasclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientes) {
						estadopoliticasclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPoliticasCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPoliticasCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPoliticasCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoPoliticasClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPoliticasCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoPoliticasCliente.getSelectedRows();
			
			EstadoPoliticasCliente estadopoliticasclienteLocal=new EstadoPoliticasCliente();
			
			//this.seleccionarTodosEstadoPoliticasCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopoliticasclienteLocal =(EstadoPoliticasCliente) this.estadopoliticasclienteLogic.getEstadoPoliticasClientes().toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadopoliticasclienteLocal =(EstadoPoliticasCliente) this.estadopoliticasclientes.toArray()[this.jTableDatosEstadoPoliticasCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadopoliticasclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
						estadopoliticasclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientes) {
						estadopoliticasclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPoliticasCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPoliticasCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPoliticasCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoPoliticasClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoPoliticasClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoPoliticasClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoPoliticasCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoPoliticasCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
				
						if(sTipoSeleccionar.equals(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadopoliticasclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopoliticasclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientes) {
					
						if(sTipoSeleccionar.equals(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadopoliticasclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopoliticasclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoPoliticasClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoPoliticasCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoPoliticasCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoPoliticasCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoPoliticasCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoPoliticasCliente(conSplash);
				
					this.generarReporteEstadoPoliticasClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoPoliticasClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPoliticasClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPoliticasClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPoliticasCliente();
				
				this.exportarEstadoPoliticasClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoPoliticasClientes();
				//this.importarEstadoPoliticasClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPoliticasCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoPoliticasClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Politicas Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoPoliticasCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoPoliticasCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoPoliticasCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoPoliticasClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoPoliticasCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoPoliticasCliente(conSplash);
					
						//this.actualizarParametrosGeneralEstadoPoliticasCliente();
						
						this.generarReporteProcesoAccionEstadoPoliticasClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Politicas ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Estado Politicas Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoPoliticasCliente();
				
						this.actualizarParametrosGeneralEstadoPoliticasCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadopoliticasclienteReturnGeneral=estadopoliticasclienteLogic.procesarAccionEstadoPoliticasClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadopoliticasclienteLogic.getEstadoPoliticasClientes(),this.estadopoliticasclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoPoliticasClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoPoliticasCliente();
					
					EstadoPoliticasClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoPoliticasClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoPoliticasCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoPoliticasCliente.jComboBoxTiposAccionesFormularioEstadoPoliticasCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoPoliticasCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoPoliticasClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoPoliticasCliente();
			
			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
			EstadoPoliticasCliente estadopoliticascliente=new EstadoPoliticasCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoPoliticasCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoPoliticasCliente.getSelectedItem();
			
			
			
			
			estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadopoliticasclientesSeleccionados.size()==1) {
				for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientesSeleccionados) {
					estadopoliticascliente=estadopoliticasclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Politicas Cliente")) {
					jButtonPoliticasClienteActionPerformed(null,rowIndex,true,false,estadopoliticascliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoPoliticasCliente();
			
      		//this.finishProcessEstadoPoliticasCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoPoliticasClienteReturnGeneral() throws Exception {
		if(this.estadopoliticasclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadopoliticasclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadopoliticasclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadopoliticasclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadopoliticasclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadopoliticasclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoPoliticasCliente(false);
		}
		
		if(this.estadopoliticasclienteReturnGeneral.getConRetornoLista() || this.estadopoliticasclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.estadopoliticasclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopoliticasclienteLogic.setEstadoPoliticasClientes(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadopoliticasclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopoliticasclienteLogic.setEstadoPoliticasCliente(this.estadopoliticasclienteReturnGeneral.getEstadoPoliticasCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoPoliticasCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoPoliticasCliente() throws Exception {
		
		
	}
	
	public ArrayList<EstadoPoliticasCliente> getEstadoPoliticasClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoPoliticasCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclienteLogic.getEstadoPoliticasClientes()) {
					if(estadopoliticasclienteAux.getIsSelected()) {
						estadopoliticasclientesSeleccionados.add(estadopoliticasclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPoliticasCliente estadopoliticasclienteAux:this.estadopoliticasclientes) {
					if(estadopoliticasclienteAux.getIsSelected()) {
						estadopoliticasclientesSeleccionados.add(estadopoliticasclienteAux);				
					}
				}
			}
			
			if(estadopoliticasclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadopoliticasclientesSeleccionados.addAll(this.estadopoliticasclienteLogic.getEstadoPoliticasClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadopoliticasclientesSeleccionados.addAll(this.estadopoliticasclientes);				
					}
				}
			}
		} else {
			estadopoliticasclientesSeleccionados.add(this.estadopoliticascliente);
		}
		
		return estadopoliticasclientesSeleccionados;
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
	
	public void generarReporteEstadoPoliticasClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoPoliticasClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoPoliticasClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPoliticasClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPoliticasClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoPoliticasClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Politicas Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoPoliticasClientesSeleccionados() throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoPoliticasClientesSeleccionados() throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoPoliticasClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoPoliticasClientesSeleccionados() throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoPoliticasCliente();
		
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoPoliticasCliente();
		
		
		//this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclientesSeleccionados ,estadopoliticasclienteImplementable,estadopoliticasclienteImplementableHome);
	}
	
	public void mostrarImportacionEstadoPoliticasClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoPoliticasCliente();
		
		this.abrirFrameImportacionEstadoPoliticasCliente();		
		
			
		//this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclientesSeleccionados ,estadopoliticasclienteImplementable,estadopoliticasclienteImplementableHome);
	}
	
	public void importarEstadoPoliticasClientes() throws Exception {		
	
	}
	
	public void exportarEstadoPoliticasClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoPoliticasClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoPoliticasClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoPoliticasClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Politicas Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoPoliticasClientesSeleccionados() throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopoliticascliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoPoliticasCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoPoliticasCliente(estadopoliticasclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadopoliticasclienteAux.setsDetalleGeneralEntityReporte(estadopoliticasclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoPoliticasCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoPoliticasClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPoliticasClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadopoliticascliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopoliticascliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopoliticascliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopoliticascliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoPoliticasClientesSeleccionados() throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopoliticascliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoPoliticasClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoPoliticasCliente(row);				
				iRow++;
			}				
			
			for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoPoliticasCliente(estadopoliticasclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoPoliticasClientesSeleccionados() throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();		
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopoliticascliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadopoliticasclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadopoliticascliente");
			//elementRoot.appendChild(element);
		
			for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientesSeleccionados) {
				element = document.createElement("estadopoliticascliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoPoliticasCliente(estadopoliticasclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Politicas Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoPoliticasCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadopoliticascliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopoliticascliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopoliticascliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoPoliticasCliente(EstadoPoliticasCliente estadopoliticascliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoPoliticasClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadopoliticascliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoPoliticasClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadopoliticascliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoPoliticasClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadopoliticascliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoPoliticasClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadopoliticascliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoPoliticasClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados=new ArrayList<EstadoPoliticasCliente>();
		
		estadopoliticasclientesSeleccionados=this.getEstadoPoliticasClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoPoliticasCliente(estadopoliticasclientesSeleccionados);
		
		this.generarReporteEstadoPoliticasClientes("Todos",estadopoliticasclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoPoliticasCliente(ArrayList<EstadoPoliticasCliente> estadopoliticasclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoPoliticasCliente estadopoliticasclienteAux:estadopoliticasclientesSeleccionados) {
				estadopoliticasclienteAux.setsDetalleGeneralEntityReporte(estadopoliticasclienteAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoPoliticasClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadopoliticasclienteAux.setsDescripcionGeneralEntityReporte1(estadopoliticasclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoPoliticasClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadopoliticasclienteAux.setsDescripcionGeneralEntityReporte1(estadopoliticasclienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPoliticasClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoPoliticasCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaModificarEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaCancelarEstadoPoliticasCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPoliticasCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoPoliticasClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=true;
		} else {
			this.actualizarEstadoPanelsEstadoPoliticasCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoPoliticasCliente=false;
			//this.isVisibilidadCeldaVerFormEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoPoliticasCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
			if(!estadopoliticasclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;												
			}
			
			this.jButtonCerrarEstadoPoliticasCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPoliticasCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.estadopoliticascliente)) {
			this.isVisibilidadCeldaActualizarEstadoPoliticasCliente=false;
			this.isVisibilidadCeldaEliminarEstadoPoliticasCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPoliticasCliente() {
		this.isVisibilidadCeldaNuevoEstadoPoliticasCliente=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoPoliticasCliente=false;
	}
	
	public void actualizarEstadoPanelsEstadoPoliticasCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPoliticasCliente!=null) {
				this.jPanelPaginacionEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPoliticasCliente!=null) {
				this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEstadoPoliticasCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPoliticasCliente!=null) {
				this.jPanelPaginacionEstadoPoliticasCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPoliticasCliente!=null) {
				this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEstadoPoliticasCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPoliticasCliente!=null) {
				this.jPanelPaginacionEstadoPoliticasCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPoliticasCliente!=null) {
				this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEstadoPoliticasCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPoliticasCliente!=null) {
				this.jPanelPaginacionEstadoPoliticasCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPoliticasCliente!=null) {
				this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPoliticasCliente!=null) {
				this.jPanelPaginacionEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPoliticasCliente!=null) {
				this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPoliticasCliente!=null) {
				this.jPanelPaginacionEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPoliticasCliente!=null) {
				this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoPoliticasCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPoliticasCliente!=null) {
				this.jScrollPanelDatosEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPoliticasCliente!=null) {
				this.jPanelPaginacionEstadoPoliticasCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPoliticasCliente!=null) {
				this.jPanelParametrosReportesEstadoPoliticasCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadopoliticasclienteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoPoliticasClienteParaPoliticasClientes() throws Exception {
		Boolean isPaginaPopupPoliticasCliente=false;

		try {

			if(this.estadopoliticasclienteSessionBean==null) {
				this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean=new PoliticasClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean.setsPathNavegacionActual(estadopoliticasclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPoliticasCliente=this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente(true);
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente(EstadoPoliticasClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPoliticasCliente(true);
			this.jInternalFrameDetalleFormEstadoPoliticasCliente.politicasclienteSessionBean.setlidEstadoPoliticasClienteActual(this.idEstadoPoliticasClienteActual);

			estadopoliticasclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoPoliticasCliente(true);
			estadopoliticasclienteSessionBean.setlIdEstadoPoliticasClienteActualForeignKey(this.idEstadoPoliticasClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoPoliticasClienteSessionBean estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
		
		if(this.estadopoliticasclienteSessionBean==null) {
			this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
		}
		
		this.estadopoliticasclienteSessionBean.setsUltimaBusquedaEstadoPoliticasCliente(this.getsAccionBusqueda());
		this.estadopoliticasclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadopoliticasclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoPoliticasClienteSessionBean estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
		
		if(this.estadopoliticasclienteSessionBean==null) {
			this.estadopoliticasclienteSessionBean=new EstadoPoliticasClienteSessionBean();
		}
		
		if(this.estadopoliticasclienteSessionBean.getsUltimaBusquedaEstadoPoliticasCliente()!=null&&!this.estadopoliticasclienteSessionBean.getsUltimaBusquedaEstadoPoliticasCliente().equals("")) {
			this.setsAccionBusqueda(estadopoliticasclienteSessionBean.getsUltimaBusquedaEstadoPoliticasCliente());
			this.setiNumeroPaginacion(estadopoliticasclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadopoliticasclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadopoliticasclienteSessionBean.setsUltimaBusquedaEstadoPoliticasCliente("");
		this.estadopoliticasclienteSessionBean.setiNumeroPaginacion(EstadoPoliticasClienteConstantesFunciones.INUMEROPAGINACION);
		this.estadopoliticasclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoPoliticasCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoPoliticasCliente() {
		this.updateBorderResaltarBusquedasFormularioEstadoPoliticasCliente();
		this.updateVisibilidadBusquedasFormularioEstadoPoliticasCliente();
		this.updateHabilitarBusquedasFormularioEstadoPoliticasCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoPoliticasCliente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoPoliticasCliente() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoPoliticasCliente() {
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
	
	public void updateControlesFormularioEstadoPoliticasCliente() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoPoliticasCliente();
		this.updateVisibilidadResaltarControlesFormularioEstadoPoliticasCliente();
		this.updateHabilitarResaltarControlesFormularioEstadoPoliticasCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoPoliticasCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadopoliticasclienteConstantesFunciones.resaltaridEstadoPoliticasCliente!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.setBorder(this.estadopoliticasclienteConstantesFunciones.resaltaridEstadoPoliticasCliente);}
		if(this.estadopoliticasclienteConstantesFunciones.resaltarcodigoEstadoPoliticasCliente!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.setBorder(this.estadopoliticasclienteConstantesFunciones.resaltarcodigoEstadoPoliticasCliente);}
		if(this.estadopoliticasclienteConstantesFunciones.resaltarnombreEstadoPoliticasCliente!=null && this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.setBorder(this.estadopoliticasclienteConstantesFunciones.resaltarnombreEstadoPoliticasCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoPoliticasCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
	
		//this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.setVisible(this.estadopoliticasclienteConstantesFunciones.mostraridEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jPanelidEstadoPoliticasCliente.setVisible(this.estadopoliticasclienteConstantesFunciones.mostraridEstadoPoliticasCliente);
		//this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.setVisible(this.estadopoliticasclienteConstantesFunciones.mostrarcodigoEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jPanelcodigoEstadoPoliticasCliente.setVisible(this.estadopoliticasclienteConstantesFunciones.mostrarcodigoEstadoPoliticasCliente);
		//this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.setVisible(this.estadopoliticasclienteConstantesFunciones.mostrarnombreEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jPanelnombreEstadoPoliticasCliente.setVisible(this.estadopoliticasclienteConstantesFunciones.mostrarnombreEstadoPoliticasCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoPoliticasCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPoliticasCliente!=null) {
	
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldidEstadoPoliticasCliente.setEnabled(this.estadopoliticasclienteConstantesFunciones.activaridEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextFieldcodigoEstadoPoliticasCliente.setEnabled(this.estadopoliticasclienteConstantesFunciones.activarcodigoEstadoPoliticasCliente);
		this.jInternalFrameDetalleFormEstadoPoliticasCliente.jTextAreanombreEstadoPoliticasCliente.setEnabled(this.estadopoliticasclienteConstantesFunciones.activarnombreEstadoPoliticasCliente);
		}
	}
	
		
}